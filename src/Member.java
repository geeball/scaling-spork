/**
 * Created by U1759657 on 19/02/2018.
 */
public class Member {
    // these are the declarations of the common variables that are shared between all the member classes
    private String memberName;
    private int memberContribution;

    public Member(String memberName, int memberContribution) {
        // this is me making sure the afore declared variables can be accessed by other classes
        this.memberName = memberName;
        this.memberContribution = memberContribution;
    }

    // the getters and setters
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberContribution() {
        return memberContribution;
    }

    // this setter is the one referenced in the "ChristmasClub" class that allows me to add up the monetary values of the member objects
    public void setMemberContribution(int memberContribution) {
        this.memberContribution += memberContribution;
    }

    // this toString method allows me to assign names over the top of the memory addresses of the member names
    @Override
    public String toString() {
        return "ClubMember{" +
                "memberName='" + memberName + '\'' +
                ", memberContribution=" + memberContribution +
                '}';
    }
}
