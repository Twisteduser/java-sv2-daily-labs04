package day01;

public class Actor {
    private String actorName;
    private int actorYearOfBirth;

    public Actor(String actorName, int actorYearOfBirth) {
        this.actorName = actorName;
        this.actorYearOfBirth = actorYearOfBirth;
    }

    public String getActorName() {
        return actorName;
    }

    public int getActorYearOfBirth() {
        return actorYearOfBirth;
    }
}
