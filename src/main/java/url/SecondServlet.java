package url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet
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

        // getting value from the query string
        String userName = request.getParameter("uname");
        out.print( "<h1> Hello "  + userName + "</h1>");
        out.print("<br>");
        out.print(" <br> <b> from Url Rewriting  </b>");

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