import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/offersCompetitions")
public class OffersCompetitionsServlet extends HttpServlet {

    private List<Offer> offers;
    private List<Competition> competitions;

    @Override
    public void init() throws ServletException {
        super.init();

        // Initialize with some dummy data
        offers = new ArrayList<>();
        offers.add(new Offer("Summer Reading", "Get 50% off on all new books", "2024-07-01", "2024-08-31"));
        offers.add(new Offer("Winter Sale", "Buy 1 Get 1 Free", "2024-12-01", "2024-12-31"));

        competitions = new ArrayList<>();
        competitions.add(new Competition("Essay Writing", "Write an essay on your favorite book", "2024-08-01", "2024-08-15"));
        competitions.add(new Competition("Book Review", "Review a book and win a prize", "2024-09-01", "2024-09-15"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("offers", offers);
        req.setAttribute("competitions", competitions);
        req.getRequestDispatcher("offersCompetitions.jsp").forward(req, resp);
    }
}
