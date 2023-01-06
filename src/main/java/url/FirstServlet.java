package url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    public void init() throws ServletException
    {
        System.out.println("-----------------------------------------");
        System.out.println(" Init method is called in "
                + this.getClass().getName());
        System.out.println("--------------------------------------");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");
        out.print(" <h1>Welcome " + userName+ "</h1>");
        out.print("<br>");
        // appending the username in the query string
        out.print("<a href='servlet4?uname=" + userName +"'> :<b>Click Here</b></a>");

        out.close();
    }

    public void destroy()
    {
        System.out.println("-----------------------------------------");
        System.out.println(" destroy method is called in "
                + this.getClass().getName());
        System.out.println("-----------------------------------------");
    }

}