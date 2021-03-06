<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <link rel="canonical" href="https://getbootstrap.com/docs/3.4/examples/signin/">

    <title>Registro</title>

    <!-- Bootstrap core CSS -->
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  	 
  	 <link rel="stylesheet" href="datePicker/css/bootstrap-datepicker.css">
    <script src="datePicker/js/bootstrap-datepicker.min.js"></script>
    <!--Esta fue la linea que agregu� --->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.js"></script>
    
    <script src="datePicker/locales/bootstrap-datepicker.es.min.js"></script>
    <!--Y esta otra tambi�n--->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.min.css">
  	 
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <script>
        $( document ).ready(function() {
            $('#fecha').datepicker();
        });
    </script>
  </head>

  <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">
  </head>
  <body>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
  <a class="navbar-brand" href="/">Registro</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
</nav>

<main role="main" class="container">
	<div class="span">
	<div></div>
          <div class="hero-unit">
    		<br></br></br></br>
    	<div class="row">
  			<div class="col-md-8">
  			
				<div class="card">
  				<div class="card-body">
            		<h4>Registro</h4>
            		<p>Bienvenido/a a la p�gina de registro. Por favor rellene todos los campos que encontrar� a continuaci�n, despu�s pulse en el bot�n de Enviar.</p>
         		</div>
				</div>
				
			</div>
			<div class="col-md-1"></div>
          </div>
     <br></br>
  </div>
	 
	  <div class="col-md-8 order-md-1">
      <form class="needs-validation" novalidate>
        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="nombre">Nombre</label>
            <input type="text" class="form-control" id="nombre" placeholder="" value="" required>
          </div>
          <div class="col-md-6 mb-3">
            <label for="apellidos">Apellidos</label>
            <input type="text" class="form-control" id="apellidos" placeholder="" value="" required>
          </div>
        </div>
        
        <div class="mb-3">
          <label for="dni">DNI</label>
          <input type="text" class="form-control" id="dni" placeholder="00000000X" required>
        </div>
        
        <div class="mb-3">
          <label for="fecha_ini">Fecha de nacimiento</label>
          <input type="text" id="fecha_ini" class="form-control">
        </div>
        
        <div class="mb-3">
          <label for="domicilio">Domicilio</label>
          <input type="text" class="form-control" id="domicilio" placeholder="Calle de residencia N0 0X" required>
        </div>
        
        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="poblacion">Poblaci�n</label>
            <select class="custom-select d-block w-100" id="poblacion" required>
              <option value="">Elige...</option>
              <option>�lava</option>
              <option>Albacete</option>
              <option>Alicante</option>
              <option>Almer�a</option>
              <option>Asturias</option>
              <option>�vila</option>
              <option>Badajoz</option>
              <option>Barcelona</option>
              <option>Burgos</option>
              <option>C�ceres</option>
              <option>C�diz</option>
              <option>Cantabria</option>
              <option>Castell�n</option>
              <option>Ceuta</option>
              <option>Ciudad Real</option>
              <option>C�rdoba</option>
              <option>Cuenca</option>
              <option>Gerona</option>
              <option>Granada</option>
              <option>Guadalajara</option>
              <option>Guip�zcoa</option>
              <option>Huelva</option>
              <option>Huesca</option>
              <option>Islas Baleares</option>
              <option>Ja�n</option>
              <option>La Coru�a</option>
              <option>La Rioja</option>
              <option>Las Palmas</option>
              <option>Le�n</option>
              <option>L�rida</option>
              <option>Lugo</option>
              <option>Madrid</option>
              <option>M�laga</option>
              <option>Melilla</option>
              <option>Murcia</option>
              <option>Navarra</option>
              <option>Orense</option>
              <option>Palencia</option>
              <option>Pontevedra</option>
              <option>Salamanca</option>
              <option>Segovia</option>
              <option>Sevilla</option>
              <option>Soria</option>
              <option>Tarragona</option>
              <option>Tenerife</option>
              <option>Teruel</option>
              <option>Toledo</option>
              <option>Valencia</option>
              <option>Valladolid</option>
              <option>Vizcaya</option>
              <option>Zamora</option>
              <option>Zaragoza</option>
            </select>
          </div>
          <div class="col-md-6 mb-3">
            <label for="cp">C�digo postal</label>
            <input type="text" class="form-control" id="cp" placeholder="" value="" required>
          </div>
        </div>
        
        <div class="mb-3">
          <label for="telefono">Tel�fono<span class="text-muted"></span></label>
          <input type="telefono" class="form-control" id="telefono" placeholder="">
        </div>
        
        <div class="mb-3">
          <label for="email">Correo electr�nico<span class="text-muted">(Optional)</span></label>
          <input type="email" class="form-control" id="email" placeholder="tu@ejemplo.com">
        </div>
        
        <div class="mb-3">
          <label for="password1">Contrase�a<span class="text-muted"></span></label>
          <input type="password" class="form-control" id="password1" placeholder="">
        </div>
        
        <div class="mb-3">
          <label for="password2">Repita la contrase�a<span class="text-muted"></span></label>
          <input type="password" class="form-control" id="password2" placeholder="">
        </div>

        <hr class="mb-4">
        <a id = "registrarUsuario" class="btn btn-primary btn-lg btn-block" type="submit">Enviar</a>
      </form>
    </div>
  </div>
	 
  <br>
  </div>
  </br>

</main><!-- /.container -->
  

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.min.js"></script>
    
    <script type="text/javascript">
    jQuery(document).ready(function($) {
    	$('#registrarUsuario').click(function(event) {
    		if($('#nombre').val()=="" || $('#apellidos').val()=="" || $('#dni').val()=="" 
    				|| $('#apellidos').val()=="" || $('#fecha_ini').val()==""
    					|| $('#domicilio').val()=="" || $('#poblacion').val()==""
    						|| $('#cp').val()=="" || $('#telefono').val()==""
    							|| $('#email').val()=="" || $('#password').val()==""){
    			alert("Tiene que rellenar todos los campos.");
    		}
    		else {
    			event.preventDefault();
        		enviarDatos();
    		}
    	});
    });
    
	function enviarDatos(){
		var data = {
			nombre : $('#nombre').val(),
			apellidos : $('#apellidos').val(),
			DNI : $('#dni').val(),
			nacimiento : $('#fecha_ini').val(),
			domicilio : $('#domicilio').val(),
			poblacion : $('#poblacion').val(),
			cp : $('#cp').val(),
			telefono : $('#telefono').val(),
			email : $('#email').val(),
			password : $('#password1').val(),
			
		};
		var url = "/registro";
		var type = "POST";
		var success;
		var xhrFields;
		var headers = {
			'Content-Type' : 'application/json'
		};
		
		data = JSON.stringify(data);
		console.log(data);
		$.ajax({
			type: type,
			url: url,
			data: data,
	        headers : headers,
	        xhrFields: {
	            withCredentials: true
	        },
	        success : RegisterOK,
	        error : RegisterError
		});
	};
	
	function RegisterOK() {
        console.log("Registro completado");
        var forma = document.forms[0];
        forma.action="/citas";
        forma.submit(); 
    }
	
	function RegisterError() {
        console.log("Ya existe el dni");
        window.alert("El DNI que ha introducido ya est� en uso.");
        $('#nombre').val("");
        $('#apellidos').val("");
        $('#dni').val("");
        $('#fecha_ini').val("");
        $('#domicilio').val("");
        $('#poblacion').val("");
        $('#cp').val("");
        $('#telefono').val("");
        $('#email').val("");
        $('#password1').val("");
        $('#password2').val("");
    }
    </script>
  	<script>

  		$('#fecha_ini').datepicker({
        	format: "dd/mm/yyyy",
        	startDate: "1/1/1900",
        	endDate: "13/10/2019",
        	todayBtn: "linked",
        	language: "es",
        	todayHighlight: true
    	});

  	</script>
  </body>
</html>