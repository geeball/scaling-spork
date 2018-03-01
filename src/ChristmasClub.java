import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by U1759657 on 07/12/2017.
 */
public class ChristmasClub {
    // declaring the arraylist
    private ArrayList<Member> christmasClubMembers = new ArrayList<Member>();

    // this is the class that declares most of the values i will be using
    public ChristmasClub() {
        // these are the member objects that get their attributes from the member class
        Member steve = new Member("Steve", 18);
        Member tony = new Member("Tony", 20);
        Member gary = new Member("Gary", 25);
        Member rubiya = new Member("Rubiya", 22);
        // this is me adding the members to the arraylist
        christmasClubMembers.add(steve);
        christmasClubMembers.add(tony);
        christmasClubMembers.add(gary);
        christmasClubMembers.add(rubiya);

        // 1st iteration of a method call for the relevant loop below, prints out the value to the screen
        printClubMembers();

        // this is me adding a numerical value to a member object,
        // however the values do not add themselves until i had to make an addition to
        // the "setMemberContribution" setter in the "Member" class
        System.out.println("adding £200");
        steve.setMemberContribution(200);
        // removing an arraylist object
        System.out.println("removing steve");
        christmasClubMembers.remove(steve);

        // 2nd iteration of a method call for the relevant loop below, prints out the value to the screen
        printClubMembers();

        // adding an arraylist object back in
        System.out.println("adding steve back");
        christmasClubMembers.add(steve);

        // 3rd iteration of a method call for the relevant loop below, prints out the value to the screen
        printClubMembers();

        // 1st iteration of a method call for the relevant loop below, prints out the value to the screen
        getTotalContributions();

        // printing out the total contributions
        System.out.println("Total Contributions made" + ":" + " " + "£" + getTotalContributions());

        // printing out the total amount of turkeys that are able to be bought
        System.out.println("How many turkeys i can buy" + ":" + " " + getTotalContributions() / 10);

        //printing out member contribution

    }

    public void searchClubMembers(){

    }

    public void printClubMembers(){
        // this loop loops through the array to get member objects,
        // it starts by getting the first member objects attributes, prints them to the screen, then repeats
        for (Member member : christmasClubMembers) {
            System.out.println(member);
        }
    }

    public int getTotalContributions(){
        // this loop loops through the array to add up all the amounts given by the various members
        // It operates in the same fashion as the above loop, meaning that it gets the values of the first member first
        // It then repeats
        int totalContribution = 0;
        for (Member member : christmasClubMembers) {
            totalContribution += member.getMemberContribution();
        }
        return totalContribution;
    }

    // this makes sure that the program runs
    public static void main(String[] args) {
        // this declares the arraylist
        new ChristmasClub();
    }
}
