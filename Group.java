/**
 * Teams randomly placed groups
 */
public class Group 
{
    private String name;
    private int groupSize;
    private int numberOfTeams;
    private Team[] teams;
    private Team[][] games; //indicating the games played between teams in the group
    private int[] points;
    private int currentTeam;
    private int currentGame;

    public Group(String name, int num)
    {
        this.name = name;

        if(num > 0) {groupSize = num;}
        else{System.out.println("Illegal Input! Group size must be positive.");}

        numberOfTeams = groupSize;
        teams = new Team[groupSize];
        games = new Team[groupSize][2];
        points = new int[groupSize];
        currentTeam = 0;
        currentGame = 0;
    }

    public boolean teamExist(Team team)
    {
        boolean exist = false;
        for(int i = 0; i < teams.length; i++)
        {
            if(teams[i] != null && team.getID() == teams[i].getID() )
            {
                exist = true;
                break;
            }
        }
        return exist;
    }
    public boolean numberExist(int num)
    {
        boolean exist = false;
        for(int i = 0; i < teams.length; i++)
        {
            if(teams[i] != null &&  teams[i].getID() == num)
            {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public void addTeam(Team team)
    {
        if(!teamExist(team) && isEmpty())
        {
            teams[currentTeam] = team;
            currentTeam++;
        }
    }

    public boolean isEmpty()
    {
        return currentTeam < groupSize;
    }

    public void addGame(Game game)
    {
        games[currentGame][0] = game.getTeams()[0];
        games[currentGame][1] = game.getTeams()[1];
        currentGame++;
        
    }
    public boolean gameExist(Team t1, Team t2)
    {
        boolean exist = false;
        if(games != null)
        {
            for(int i = 0; i < games.length; i++)
            {
                if((games[i][0] == t1 && games[i][1] == t2) || (games[i][0] == t2 || games[i][1] == t1))
                {
                    exist = true;
                    break;
                }
            }
        }
        return exist; 
    }

    public Team findTeam(int num)
    {
        int index = -1;
        for(int i = 0; i < teams.length; i++)
        {
            if(teams[i].getID() == num)
            {
               index = i;
               break;
            }   
        }
        if(index == -1){System.out.println("Team does not exist!");}
        return teams[index];
    }

    public String toString()
    {
        String result = "=============================================\n" +
                        "=           Group " + name + " standings               =\n" +
                        "=============================================\n" ;
        
        for(int i = 0; i < teams.length; i++)
        {
            if(teams[i] != null)
            {
                result += String.format("%3s%1s%10s%5s%1s%5s%n", i + 1 , "." , teams[i].getTeamName() , "(" + teams[i].getID() , ")" ,  teams[i].getPoint());
            }
        }
        result += "=============================================";
        return result;
    }

    //Getter methods
    public String getGroupName()
    {
        return name;
    }
    public int getGroupSize()
    {
        return groupSize;
    }
    public int getNumberOfTeams()
    {
        return numberOfTeams;
    }
    public int getCurrentTeam()
    {
        return currentTeam;
    }
    


}
