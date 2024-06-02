import java.util.ArrayList;

public class Game 
{
    private Team[] teams;
    private int[] goals;

    public Game(Team team1, Team team2, int team1Goals, int team2Goals)
    {
        teams = new Team[2];
        goals = new int[2];
        teams[0] = team1;
        teams[1] = team2;
        goals[0] = team1Goals;
        goals[1] = team2Goals;
        calculateResult();
    }

    public void calculateResult()
    {
        if(goals[0] < goals[1])
        {
            teams[1].setPoint(3);
        }
        else if(goals[0] == goals[1])
        {
            teams[0].setPoint(1);
            teams[1].setPoint(1);
        }
        else
        {
            teams[0].setPoint(3);
        }
    }
    public int getTeamPoints(Team team)
    {
        int index = 0;
        for(int i = 0; i < teams.length; i++)
        {
            if(team.getID() == teams[i].getID())
            {
                index = i;
                break;
            }
        }
        return goals[index];

    }

    public String toString()
    {
        String result = teams[0] + " vs. " + teams[1] + ": " + goals[0] + "-" + goals[1];
        return result;
    }

    public Team[] getTeams()
    {
        return teams;
    }
}
