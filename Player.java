/**
 * Defines the details of a football player in the application
 */

public class Player 
{
    private String name;
    private int age;
    private String nationality;
    private int jerryNumber;
    private String position;
    private int marketValue;

    //Creates player to be used
    public Player(String name, int age, String nationality, int jerryNumber, String position, int marketValue) 
    {
        this.name = name;

        if(age > 0){ this.age = age;}
        else{System.out.println("Illegal Input! Age must be positive.");}
       
        this.nationality = nationality;

        if(1 <= jerryNumber && jerryNumber <= 99){this.jerryNumber = jerryNumber;}
        else{System.out.println("Illegal Input! Jerry number must be between 1 and 99.");}

        this.position = position;

        this.marketValue = marketValue;
    }

    public String toString()
    {
        String result = String.format("%20s%10d%15s%10d%25s%15d%n",name, age, nationality, jerryNumber, position, marketValue );
        return result;
    }


    //Setter methods
    public void setAge(int newAge)
    {
        age = newAge;
    }
    public void setjerryNumber(int newNumber)
    {
        if(1 <= newNumber && newNumber <= 99){jerryNumber = newNumber;}
        else{System.out.println("Illegal Input! Jerry number must be between 1 and 99.");}
    }
    public void setPosition(String pos)
    {
        position = pos;
    }
    public void setMarketValue(int num)
    {
        if(num > 0){marketValue = num;}
        else{System.out.println("Illegal Input! Market value must be positive.");}
    }

    //Getter methods
    public String gePlayerName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getNationality()
    {
        return nationality;
    }
    public int getJerreyNumber()
    {
        return jerryNumber;
    }
    public String getPosition()
    {
        return position;
    }
    public int getPlayerMarketValue()
    {
        return marketValue;
    }
}