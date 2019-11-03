package com.tgs.tgh.dao;

import java.text.ParseException;

import org.bson.BsonDocument;
import org.bson.BsonString;

import com.mongodb.ConnectionString;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.tgs.tgh.model.Cita;
import com.tgs.tgh.model.Gestor;
import com.tgs.tgh.model.Medico;
import com.tgs.tgh.model.Paciente;
import com.tgs.tgh.model.Usuario;

public class DBBroker<T> {

	private MongoClient client;
	private MongoDatabase db;

	private DBBroker() {
		this.client = MongoClients.create(new ConnectionString(
				"mongodb+srv://JaviPuerto10:ingenieriainformatica@thegoodhealth-yruyo.mongodb.net/test?retryWrites=true&w=majority"));
		this.db = client.getDatabase("TheGoodHealth");
	}

	public static class SingletonHolder {
		static DBBroker singleton = new DBBroker();
	}

	public static DBBroker get() {
		return SingletonHolder.singleton;
	}

	public boolean comprobarDNIEnBD(String dni) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(dni));
		MongoCollection<BsonDocument> collection = this.db.getCollection("Usuarios", BsonDocument.class);
		FindIterable<BsonDocument> iterator = collection.find(criterion);
		BsonDocument bso = iterator.first();
		if (bso == null)
			return false;

		return true;
	}

	public Usuario loginUser(String dni, String pwd) throws ParseException {
		MongoCollection<BsonDocument> collection = this.db.getCollection("Usuarios", BsonDocument.class);
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(dni));
		criterion.append("Password", new BsonString(pwd));
		FindIterable<BsonDocument> iterator = collection.find(criterion);
		if (iterator == null)
			return null;

		BsonDocument bso = iterator.first();
		if (bso != null) {
			Usuario user = new Usuario(bso.get("DNI").asString().getValue(), bso.get("Password").asString().getValue(),
					bso.get("Nombre").asString().getValue(), bso.get("Apellidos").asString().getValue(),
					bso.get("FNac").asString().getValue(), bso.get("Domicilio").asString().getValue(),
					bso.get("Poblacion").asString().getValue(), bso.get("CP").asString().getValue(),
					bso.get("Telefono").asString().getValue(), bso.get("Email").asString().getValue());
			return user;
		}
		return null;
	}

	public Medico comprobarSiEsMedico(Usuario usuario) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(usuario.getDNI()));
		MongoCollection<BsonDocument> collection = this.db.getCollection("Medicos", BsonDocument.class);
		FindIterable<BsonDocument> iterator = collection.find(criterion);
		BsonDocument bso = iterator.first();
		if (bso == null)
			return null;

		Medico medico = new Medico(usuario.getDNI(), usuario.getPassword(), usuario.getNombre(), usuario.getApellidos(),
				usuario.getFechaNac(), usuario.getDomicilio(), usuario.getPoblacion(), usuario.getCodigoPostal(),
				usuario.getTelefono(), usuario.getEmail(), bso.get("Especialidad").asString().getValue(),
				bso.get("CentroMedico").asString().getValue());

		return medico;
	}

	public Paciente comprobarSiEsPaciente(Usuario usuario) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(usuario.getDNI()));
		MongoCollection<BsonDocument> collection = this.db.getCollection("Pacientes", BsonDocument.class);
		FindIterable<BsonDocument> iterator = collection.find(criterion);
		BsonDocument bso = iterator.first();
		if (bso == null)
			return null;

		Paciente paciente = new Paciente(usuario.getDNI(), usuario.getPassword(), usuario.getNombre(),
				usuario.getApellidos(), usuario.getFechaNac(), usuario.getDomicilio(), usuario.getPoblacion(),
				usuario.getCodigoPostal(), usuario.getTelefono(), usuario.getEmail(),
				bso.get("CentroMedico").asString().getValue());
		return paciente;
	}

	public Gestor comprobarSiEsGestor(Usuario usuario) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(usuario.getDNI()));
		MongoCollection<BsonDocument> collection = this.db.getCollection("Gestores", BsonDocument.class);
		FindIterable<BsonDocument> iterator = collection.find(criterion);
		BsonDocument bso = iterator.first();
		if (bso == null)
			return null;

		Gestor gestor = new Gestor(usuario.getDNI(), usuario.getPassword(), usuario.getNombre(), usuario.getApellidos(),
				usuario.getFechaNac(), usuario.getDomicilio(), usuario.getPoblacion(), usuario.getCodigoPostal(),
				usuario.getTelefono(), usuario.getEmail(), bso.get("CentroMedico").asString().getValue());
		return gestor;
	}

	public void regitrarUser(Usuario usuario) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(usuario.getDNI()));
		criterion.append("Password", new BsonString(usuario.getPassword()));
		criterion.append("Nombre", new BsonString(usuario.getNombre()));
		criterion.append("Apellidos", new BsonString(usuario.getApellidos()));
		criterion.append("FNac", new BsonString(usuario.getFechaNac()));
		criterion.append("Domicilio", new BsonString(usuario.getDomicilio()));
		criterion.append("Poblacion", new BsonString(usuario.getPoblacion()));
		criterion.append("CP", new BsonString(usuario.getCodigoPostal()));
		criterion.append("Telefono", new BsonString(usuario.getTelefono()));
		criterion.append("Email", new BsonString(usuario.getEmail()));

		MongoCollection<BsonDocument> collection = this.db.getCollection("Usuarios", BsonDocument.class);
		collection.insertOne(criterion);
	}

	public void registrarPaciente(String dni, String centroMedico) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(dni));
		criterion.append("CentroMedico", new BsonString(centroMedico));
		MongoCollection<BsonDocument> collection = this.db.getCollection("Pacientes", BsonDocument.class);
		collection.insertOne(criterion);
	}

	public void registrarMedico(String dni, String especialidad, String centroMedico) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(dni));
		criterion.append("Especialidad", new BsonString(especialidad));
		criterion.append("CentroMedico", new BsonString(centroMedico));
		MongoCollection<BsonDocument> collection = this.db.getCollection("Medicos", BsonDocument.class);
		collection.insertOne(criterion);
	}

	public boolean eliminar(String nombre, String dni) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(dni));
		MongoCollection<BsonDocument> collection = this.db.getCollection(nombre, BsonDocument.class);
		try {
			collection.deleteOne(criterion);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void introducirCitaBD(Cita cita) {
		BsonDocument criterion = new BsonDocument();
		criterion.append("DNI", new BsonString(cita.getDniPaciente()));
		criterion.append("especialidad", new BsonString(cita.getEspecialidad()));
		criterion.append("dia", new BsonString(cita.getDia()));
		criterion.append("hora", new BsonString(cita.getHora()));
		
		MongoCollection<BsonDocument> collection = this.db.getCollection("Citas", BsonDocument.class);
		collection.insertOne(criterion);
	}

}
