/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2019-10-15 08:26:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/3.4/examples/signin/\">\r\n");
      out.write("\r\n");
      out.write("    <title>The Good Health</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("  \t \r\n");
      out.write("  \t <link rel=\"stylesheet\" href=\"datePicker/css/bootstrap-datepicker.css\">\r\n");
      out.write("    <script src=\"datePicker/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("    <!--Esta fue la linea que agregué --->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"datePicker/locales/bootstrap-datepicker.es.min.js\"></script>\r\n");
      out.write("    <!--Y esta otra también--->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.min.css\">\r\n");
      out.write("  \t \r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <link href=\"../../assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"signin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        $( document ).ready(function() {\r\n");
      out.write("            $('#fecha').datepicker();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <style>\r\n");
      out.write("      .bd-placeholder-img {\r\n");
      out.write("        font-size: 1.125rem;\r\n");
      out.write("        text-anchor: middle;\r\n");
      out.write("        -webkit-user-select: none;\r\n");
      out.write("        -moz-user-select: none;\r\n");
      out.write("        -ms-user-select: none;\r\n");
      out.write("        user-select: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media (min-width: 768px) {\r\n");
      out.write("        .bd-placeholder-img-lg {\r\n");
      out.write("          font-size: 3.5rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"starter-template.css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark bg-dark fixed-top\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"/tgh\">Registro</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<main role=\"main\" class=\"container\">\r\n");
      out.write("\t<div class=\"span\">\r\n");
      out.write("\t<div></div>\r\n");
      out.write("          <div class=\"hero-unit\">\r\n");
      out.write("    \t\t<br></br></br></br>\r\n");
      out.write("    \t<div class=\"row\">\r\n");
      out.write("  \t\t\t<div class=\"col-md-8\">\r\n");
      out.write("  \t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"card\">\r\n");
      out.write("  \t\t\t\t<div class=\"card-body\">\r\n");
      out.write("            \t\t<h4>Registro</h4>\r\n");
      out.write("            \t\t<p>Bienvenido/a a la página de registro. Por favor rellene todos los campos que encontrará a continuación, después pulse en el botón de Enviar.</p>\r\n");
      out.write("         \t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-1\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("     <br></br>\r\n");
      out.write("  </div>\r\n");
      out.write("\t \r\n");
      out.write("\t  <div class=\"col-md-8 order-md-1\">\r\n");
      out.write("      <form class=\"needs-validation\" novalidate>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("            <label for=\"nombre\">Nombre</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"nombre\" placeholder=\"\" value=\"\" required>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              Información necesaria.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("            <label for=\"apellidos\">Apellidos</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"apellidos\" placeholder=\"\" value=\"\" required>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              Información necesaria.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"dni\">DNI</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"dni\" placeholder=\"00000000X\" required>\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"nacimiento\">Fecha de nacimiento</label>\r\n");
      out.write("          <input type=\"text\" id=\"fecha_ini\" class=\"form-control\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"domicilio\">Domicilio</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"domicilio\" placeholder=\"Calle de residencia N0 0X\" required>\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("            <label for=\"poblacion\">Población</label>\r\n");
      out.write("            <select class=\"custom-select d-block w-100\" id=\"poblacion\" required>\r\n");
      out.write("              <option value=\"\">Elige...</option>\r\n");
      out.write("              <option>Álava</option>\r\n");
      out.write("              <option>Albacete</option>\r\n");
      out.write("              <option>Alicante</option>\r\n");
      out.write("              <option>Almería</option>\r\n");
      out.write("              <option>Asturias</option>\r\n");
      out.write("              <option>Ávila</option>\r\n");
      out.write("              <option>Badajoz</option>\r\n");
      out.write("              <option>Barcelona</option>\r\n");
      out.write("              <option>Burgos</option>\r\n");
      out.write("              <option>Cáceres</option>\r\n");
      out.write("              <option>Cádiz</option>\r\n");
      out.write("              <option>Cantabria</option>\r\n");
      out.write("              <option>Castellón</option>\r\n");
      out.write("              <option>Ceuta</option>\r\n");
      out.write("              <option>Ciudad Real</option>\r\n");
      out.write("              <option>Córdoba</option>\r\n");
      out.write("              <option>Cuenca</option>\r\n");
      out.write("              <option>Gerona</option>\r\n");
      out.write("              <option>Granada</option>\r\n");
      out.write("              <option>Guadalajara</option>\r\n");
      out.write("              <option>Guipúzcoa</option>\r\n");
      out.write("              <option>Huelva</option>\r\n");
      out.write("              <option>Huesca</option>\r\n");
      out.write("              <option>Islas Baleares</option>\r\n");
      out.write("              <option>Jaén</option>\r\n");
      out.write("              <option>La Coruña</option>\r\n");
      out.write("              <option>La Rioja</option>\r\n");
      out.write("              <option>Las Palmas</option>\r\n");
      out.write("              <option>León</option>\r\n");
      out.write("              <option>Lérida</option>\r\n");
      out.write("              <option>Lugo</option>\r\n");
      out.write("              <option>Madrid</option>\r\n");
      out.write("              <option>Málaga</option>\r\n");
      out.write("              <option>Melilla</option>\r\n");
      out.write("              <option>Murcia</option>\r\n");
      out.write("              <option>Navarra</option>\r\n");
      out.write("              <option>Orense</option>\r\n");
      out.write("              <option>Palencia</option>\r\n");
      out.write("              <option>Pontevedra</option>\r\n");
      out.write("              <option>Salamanca</option>\r\n");
      out.write("              <option>Segovia</option>\r\n");
      out.write("              <option>Sevilla</option>\r\n");
      out.write("              <option>Soria</option>\r\n");
      out.write("              <option>Tarragona</option>\r\n");
      out.write("              <option>Tenerife</option>\r\n");
      out.write("              <option>Teruel</option>\r\n");
      out.write("              <option>Toledo</option>\r\n");
      out.write("              <option>Valencia</option>\r\n");
      out.write("              <option>Valladolid</option>\r\n");
      out.write("              <option>Vizcaya</option>\r\n");
      out.write("              <option>Zamora</option>\r\n");
      out.write("              <option>Zaragoza</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              Información necesaria.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("            <label for=\"cp\">Código postal</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"cp\" placeholder=\"\" value=\"\" required>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              Información necesaria.\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"telefono\">Teléfono<span class=\"text-muted\"></span></label>\r\n");
      out.write("          <input type=\"telefono\" class=\"form-control\" id=\"email\" placeholder=\"\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"email\">Correo electrónico<span class=\"text-muted\">(Optional)</span></label>\r\n");
      out.write("          <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"tu@ejemplo.com\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"contraseña1\">Contraseña<span class=\"text-muted\"></span></label>\r\n");
      out.write("          <input type=\"contraseña1\" class=\"form-control\" id=\"email\" placeholder=\"\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"contraseña2\">Repita la contraseña<span class=\"text-muted\"></span></label>\r\n");
      out.write("          <input type=\"contraseña2\" class=\"form-control\" id=\"email\" placeholder=\"\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <hr class=\"mb-4\">\r\n");
      out.write("        <a href = \"/tgh/citas\" class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Enviar</a>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\t \r\n");
      out.write("  <br>\r\n");
      out.write("  </div>\r\n");
      out.write("  </br>\r\n");
      out.write("\r\n");
      out.write("</main><!-- /.container -->\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("  \t \r\n");
      out.write("  \t  <script>\r\n");
      out.write("\r\n");
      out.write("  \t$('#fecha_ini').datepicker({\r\n");
      out.write("        format: \"dd/mm/yyyy\",\r\n");
      out.write("        startDate: \"1/1/1900\",\r\n");
      out.write("        endDate: \"13/10/2019\",\r\n");
      out.write("        todayBtn: \"linked\",\r\n");
      out.write("        language: \"es\",\r\n");
      out.write("        todayHighlight: true\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
