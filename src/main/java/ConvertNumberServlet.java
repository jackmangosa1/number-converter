import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ConvertNumberServlet")
public class ConvertNumberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberString = request.getParameter("number");
        int number = Integer.parseInt(numberString);
        
        if (request.getParameter("binary") != null) {
            String binary = Integer.toBinaryString(number);
            response.getWriter().println("Binary: " + binary);
        } else if (request.getParameter("hexadecimal") != null) {
            String hexadecimal = Integer.toHexString(number);
            response.getWriter().println("Hexadecimal: " + hexadecimal);
        } else if (request.getParameter("octal") != null) {
            String octal = Integer.toOctalString(number);
            response.getWriter().println("Octal: " + octal);
        }
    }
}
