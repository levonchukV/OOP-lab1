public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("Christopher", "Nolan", new Date (30,7, 1970));
        Screening screening1 = new Screening("firstScreening", 10000, new Date (15, 1, 2023));
        Screening screening2 = new Screening("secondScreening", 9000, new Date (20, 1, 2023));
        Movie movie = new Movie("Oppenheimer", MovieGenre.ACTION, director1);
        movie.addScreening(screening1);
        movie.addScreening(screening2);

        System.out.println("Movie full info: ");
        movie.printInfo();
        System.out.println();
        System.out.println("__________________");

        System.out.println("Movie short info: ");
        movie.printShortInfo();
        System.out.println();
        System.out.println("__________________");
        
        


        Director director2 = new Director("Christopher", "Nolan", new Date (30,7, 1970));
        Screening screening3 = new Screening("firstScreening", 11000, new Date(6, 11, 2014));
        Screening screening4 = new Screening("secondScreening", 15000, new Date(10, 11, 2014));
        Movie movie2 = new Movie("Interstellar", MovieGenre.DRAMA, director1);
        movie2.addScreening(screening3);
        movie2.addScreening(screening4);

        System.out.println("Second Movie");
        System.out.println("Movie full info: ");
        movie2.printInfo();
        System.out.println();
        System.out.println("__________________");

        System.out.println("Movie short info: ");
        movie2.printShortInfo();
        System.out.println();
        System.out.println("__________________");
    }
}
