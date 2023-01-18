import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Raffle {
    public static void main(String[] args) {
        List<Contestant> contestants = new ArrayList<>();

        // Adding contestants to the list
        contestants.add(new Contestant("John", "Doe"));
        contestants.add(new Contestant("Jane", "Smith"));
        contestants.add(new Contestant("Bob", "Johnson"));
        contestants.add(new Contestant("Emily", "Williams"));
        contestants.add(new Contestant("Michael", "Jones"));

        // Selecting a random winner
        Random rand = new Random();
        int winnerIndex = rand.nextInt(contestants.size());
        Contestant winner = contestants.get(winnerIndex);

        // Printing the winner
        System.out.println("The winner is: " + winner.getFirstName() + " " + winner.getLastName());
    }
}

class Contestant {
    private String firstName;
    private String lastName;

    public Contestant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}