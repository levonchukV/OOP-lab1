import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private MovieGenre genre;
    private Director director;
    private List<Screening> screenings;

    public Movie() {
        this.title = "Unknown";
        this.genre = MovieGenre.UNKNOWN;
        this.screenings = new ArrayList<>();
    }

    public Movie(String title, MovieGenre genre, Director director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.screenings = new ArrayList<>();
    }

    public void addScreening(Screening screening) {
        this.screenings.add(screening);
    }

    public void printInfo() {
        System.out.printf("Screening info: Title: %S genre - %s%n", title, genre);
        System.out.println("Director info: ");
        director.printInfo();
        System.out.println("Screening info: ");
        for (Screening screening : screenings) {
            screening.printInfo();
        }
    }

    public void printShortInfo(){
        System.out.printf("Short screening info: title - %s%n Director name - %s%n", title, director.getName());
        double sum = 0;
        for (Screening screening : screenings) {
            sum += screening.getProfit();
        }
        double averageProfit = sum / screenings.size();
        System.out.println("Average profit: " + averageProfit);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }
}

