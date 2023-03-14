import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class p1 extends HttpServlet {
    private string h1;
    public void init() throws ServerException{
        h1="kfjkgsjkgksg";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // create an array of objects to store different types of elements
        Object[] myArray = new Object[5];
        
        // store different types of elements in the array
        myArray[0] = "Hello";
        myArray[1] = 123;
        myArray[2] = true;
        myArray[3] = 3.14;
        myArray[4] = 'c';
        
        // output the array elements
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Array Example</title></head>");
        out.println("<body>");
        out.println("<h1>Array Example</h1>");
        out.println("<p>Array elements:</p>");
        out.println("<ul>");
        for (int i = 0; i < myArray.length; i++) {
            out.println("<li>" + myArray[i] + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }
}
