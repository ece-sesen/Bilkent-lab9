import java.util.ArrayList;

public class Team 
{
    private int ID;
    private String name;
    private int averageAge;
    private int marketValue;
    private ArrayList<Player> squad;
    private int point;

    public Team (int ID, String name)
    {
        this.ID = ID;
        this.name = name;
        this.averageAge = 0;
        this.marketValue = 0;
        this.squad = new ArrayList<Player>();
        point = 0;
    }

    /**
     * Determine whether that player in the team or not
     * @param player needs checking
     * @return true if a player with a specific jerry number exist in the team.
     */
    public boolean playerExist(Player player)
    {
        boolean exist = false;
        for(int i = 0; i < squad.size(); i++)
        {
            if(player.getJerreyNumber() == squad.get(i).getJerreyNumber())
            {
                exist = true;
            }
        }
        return exist;
    }
    public Player findPlayer(int jerseyNum)
    {
        int index = -1;
        for(int i = 0; i < squad.size(); i++)
        {
            if(squad.get(i).getJerreyNumber() == jerseyNum)
            {
                index = i;
                break;
            }
            
        }
        if(index == -1)
        {
            return null;
        }
        else
        {
            return squad.get(index);
        }

    }

    public boolean uniqueJerry(int num)
    {
        boolean unique = true;
        for(int i = 0; i < squad.size(); i++)
        {
            if(squad.get(i).getJerreyNumber()==num)
            {
                unique = false;
                break;
            }
        }
        return unique;
    }

    /**
     * If player does not in the team and the player is a citizen of that country, add that player to the team
     * @param player will be added to team
     */
    public void addPlayer(Player player)
    {
        if(!playerExist(player) && player.getNationality().equals(name))
        {
            squad.add(player);
        }
    }

    /**
     * Remove the player from the team with the specific jerry nmber
     * @param player need to be removed
     */
    public void removePlayer(Player player)
    {
        int index = 0;
        for(int i = 0; i < squad.size(); i++)
        {
            if(player.getJerreyNumber() == squad.get(i).getJerreyNumber())
            {
                index = i;
                break;
            }
        }
        squad.remove(index);
    }

    public String toString()
    {
        String result = "==================================================================================================\n" +
                        "=                                              Team Details                                      =\n" +
                        "==================================================================================================\n" +
                        "ID: " + ID + "\nTeam: " + name + "\nAverage Age: " + calculateAverageAge() + "\nMarket Value: " + calculateMarketValue() +
                        "\nSquad is composed of following players: \n" +
                        "--------------------------------------------------------------------------------------------------" ;
        result += String.format("%n%15s%15s%17s%11s%20s%20s", "Name","Age", "Nationality", "Number", "Position", "Market Number") +
                    "\n--------------------------------------------------------------------------------------------------\n";
                        for(int i = 0; i < squad.size(); i++)
                        {
                            result += squad.get(i).toString();
                        }
                        result += "\n==================================================================================================";
        return result;
    }
    public int calculateAverageAge()
    {
        int sum = 0;
        for(int i = 0; i < squad.size(); i++)
        {
            sum += squad.get(i).getAge();
        }
        return sum / squad.size();
    }
    public int calculateMarketValue()
    {
        int sum = 0;
        for(int i = 0; i < squad.size(); i++)
        {
            sum += squad.get(i).getPlayerMarketValue();
        }
        return sum;
    }
    public void setPoint(int n)
    {
        point += n;
    }

    //Getter methods
    public int getID()
    {
        return ID;
    }
    public String getTeamName()
    {
        return name;
    }
    public int getAveargeAge()
    {
        return averageAge;
    }
    public int getTeamMarketValue()
    {
        return marketValue;
    }
    public int getPoint()
    {
        return point;
    }
}
