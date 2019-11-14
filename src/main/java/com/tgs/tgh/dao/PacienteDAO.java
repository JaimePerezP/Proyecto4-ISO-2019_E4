package com.tgs.tgh.dao;

import com.tgs.tgh.model.Paciente;
import com.tgs.tgh.model.Usuario;

public class PacienteDAO {

	public static Paciente esPaciente(Usuario usuario) {
		return DBBroker.get().comprobarSiEsPaciente(usuario);
	}

	public static void registro(String dni, String centroMedico) {
		DBBroker.get().registrarPaciente(dni, centroMedico);
	}

	public static void eliminar(Paciente paciente) throws Exception {
		boolean comprobar = DBBroker.get().eliminar("Pacientes", paciente.getDNI());
		if (!comprobar) {
			throw new Exception("Error al eliminar el paciente");
		}
	}

}
