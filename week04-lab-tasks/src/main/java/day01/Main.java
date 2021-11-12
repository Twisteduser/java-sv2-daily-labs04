package day01;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("The movie without title", 1995);
        movie.addActor(new Actor("Béla", 1970));
        movie.addActor(new Actor("Steve Madden", 1975));
        movie.addActor(new Actor("Random Actor", 1979));
        movie.addActor(new Actor("Borat", 1982));

        System.out.println(movie.actorsInTheirTwenties());
    }
}
