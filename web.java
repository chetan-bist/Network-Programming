protected void doGet(HttpServletRequest req,HttpServletReponse resp) throws IOException,ServletException{

	resp.setContentType("text/html");
	PrinWriter pw=resp.getWriter();
	pw.println("<html>");
	pw.println("<head>");
	pw.println("<title>Date and Time Servlet</title>");
	pw.println("<style>");
	pw.println("h3{color:red};");
	pw.println("</style>");
	pw.println("</head>");
	pw.println("<body>");
	Date d = new Date();
	String d = new d.toString();
	pw.println("<h3>"+d+"</h3>");
	pw.println("</body>");
	pw.println("</html>");
}