package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String movieTitle;
    private int releaseYear;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String movieTitle, int releaseYear) {
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }
    public int actorsInTheirTwenties(){
        int sum =0;
        for (Actor actor: actors){
            if (releaseYear-actor.getActorYearOfBirth()>=20 && releaseYear-actor.getActorYearOfBirth()<30){
                sum= sum+1;
            }
        }
        return sum;
    }
}
