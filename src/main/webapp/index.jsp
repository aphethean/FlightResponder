<%
String myService = request.getScheme() + "://" 
    + request.getServerName() + ":" + request.getServerPort() 
    + request.getContextPath() + "/FlightResponder.svc/"; 
response.sendRedirect("explorer.jsp?odata-svc=" + myService);
%>