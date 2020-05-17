import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/main")

public class MainServlet extends HttpServlet {

    private OperationCalc operationCalc = new OperationCalc();

     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));

        String operation = req.getParameter("operation");
        switch (operation){
            case ("plus"):
                double plus = operationCalc.plus(num1, num2);
                resp.getWriter().println(plus);
            case ("minus"):
                double minus = operationCalc.minus(num1, num2);
                resp.getWriter().println(minus);
            case ("div"):
                double div = operationCalc.div(num1, num2);
                resp.getWriter().println(div);
            case ("times"):
                double times = operationCalc.times(num1, num2);
                resp.getWriter().println(times);
        }
    }
}
