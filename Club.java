import java.util.ArrayList;


/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    //q40
    private ArrayList<Membership> club;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        club = new ArrayList();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        //q42
        club.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        //q41
        return club.size();
    }
}
