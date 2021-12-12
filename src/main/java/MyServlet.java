import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet
        extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/json; charset=utf-8");

        String first = request.getParameter("first");
        String second = request.getParameter("second");

        out.println("OK!");
        out.println("First: " + first);
        out.println("Second: " + second);
    }
}
