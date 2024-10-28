public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("Christopher", "Nolan", new Date (30,7, 1970));
        Screening screening1 = new Screening("firstScreening", 10000, new Date (15, 1, 2023));
        Screening screening2 = new Screening("secondScreening", 9000, new Date (20, 1, 2023));
        Movie movie1 = new Movie("Oppenheimer", MovieGenre.ACTION, director1);
        movie1.addScreening(screening1);
        movie1.addScreening(screening2);

        System.out.println("Movie full info: ");
        System.out.println(movie1.toString());
//        System.out.println();
        System.out.println("__________________");

        Director director2 = new FilmDirector("Christopher", "Nolan", new Date (30,7, 1970), 160, "The Dark Knight");
        Screening screening3 = new Screening("firstScreening", 10000, new Date (15, 1, 2023));
        Screening screening4 = new Screening("secondScreening", 9000, new Date (20, 1, 2023));
        Movie movie2 = new Movie("Oppenheimer", MovieGenre.ACTION, director2);
        movie2.addScreening(screening3);
        movie2.addScreening(screening4);

        System.out.println("Movie full info: ");
        System.out.println(movie2.toString());
//        System.out.println();
        System.out.println("__________________");

        Director director3 = new DocumentaryDirector("Christopher", "Nolan", new Date (30,7, 1970), 2, "feature movies");
        Screening screening5 = new Screening("firstScreening", 10000, new Date (15, 1, 2023));
        Screening screening6 = new Screening("secondScreening", 9000, new Date (20, 1, 2023));
        Movie movie3 = new Movie("Oppenheimer", MovieGenre.ACTION, director3);
        movie3.addScreening(screening5);
        movie3.addScreening(screening6);

        System.out.println("Movie full info: ");
        System.out.println(movie3.toString());
//        System.out.println();
        System.out.println("__________________");
    }
}
