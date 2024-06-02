/**
 * Implement an application that handles the group stage players, teams, games, groups
 * 
 */
import java.util.Scanner;
public class Qatar22 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        boolean exit = false;
        Group A = new Group("A", 4);
        Team germany = new Team(6, "Germany");
        Player g1 = new Player("Andre Ter Stegen", 30, "Germany", 22, "GoalKeeper", 30000000);
        Player g2 = new Player("Manuel Neuer", 36, "Germany", 1, "GoalKeeper", 12000000);
        Player g3 = new Player("Antonio Rüdiger", 29, "Germany", 2, "Centre Back", 40000000);
        Player g4 = new Player("Niklas Süle", 27, "Germany", 15, "Centre Back", 35000000);
        Player g5 = new Player("Thilo Kehrer", 26, "Germany", 5, "Centre Back", 22000000);
        Player g6 = new Player("David Raum", 24, "Germany", 3, "Left Back", 26000000);
        Player g7 = new Player("Lukas Klostermann", 26, "Germany", 16, "Right Back", 14000000);
        Player g8 = new Player("Joshua Kimmich", 27, "Germany", 6, "Defensive Midfield", 80000000);
        Player g9 = new Player("Leon Goretzka", 27, "Germany", 8, "Central Midfield", 65000000);
        Player g10 = new Player("Ilkay Gündogan", 32, "Germany", 21, "Attacking Midfield", 25000000);
        Player g11 = new Player("Jamal Musiala", 19, "Germany", 14, "Left Wing", 100000000);
        Player g12 = new Player("Leroy Sane", 26, "Germany", 19, "Right Wing", 70000000);
        Player g13 = new Player("Serge Gnabry", 27, "Germany", 10, "Centre Forward", 65000000);
        Player g14 = new Player("Karim Adeyemi", 20, "Germany", 24, "Centre Forward", 35000000);
        Player g15 = new Player("Youssoufa Moukoko", 18, "Germany", 26, "Centre Forward", 30000000);
        Player g16 = new Player("Niclas Füllkrug", 29, "Germany", 9, "Centre Forward", 5000000);
        germany.addPlayer(g1);
        germany.addPlayer(g2);
        germany.addPlayer(g3);
        germany.addPlayer(g4);
        germany.addPlayer(g5);
        germany.addPlayer(g6);
        germany.addPlayer(g7);
        germany.addPlayer(g8);
        germany.addPlayer(g9);
        germany.addPlayer(g10);
        germany.addPlayer(g11);
        germany.addPlayer(g12);
        germany.addPlayer(g13);
        germany.addPlayer(g14);
        germany.addPlayer(g15);
        germany.addPlayer(g16);

        Team turkiye = new Team(38, "Türkiye");
        Player t1 = new Player("Ugurcan Çakir", 26, "Türkiye", 23, "GoalKeeper", 14000000);
        Player t2 = new Player("Altay Bayindir", 24, "Türkiye", 1, "GoalKeeper", 13000000);
        Player t3 = new Player("Çaglar Söyüncü", 26, "Türkiye", 4, "Centre Back", 22000000);
        Player t4 = new Player("Ozan Kabak", 22, "Türkiye", 15, "Centre Back", 10000000);
        Player t5 = new Player("Tayyip Sanuç", 22, "Türkiye", 6, "Centre Back", 3800000);
        Player t6 = new Player("Eren Elmali", 22, "Türkiye", 13, "Left Back", 4200000);
        Player t7 = new Player("Zeki Çelik", 25, "Türkiye", 2, "Right Back", 15000000);
        Player t8 = new Player("Salih Özcan", 24, "Türkiye", 5, "Defensive Midfield", 17000000);
        Player t9 = new Player("Hakan Çalhanoğlu", 28, "Türkiye", 10, "Central Midfield", 35000000);
        Player t10 = new Player("Arda Güler", 17, "Türkiye", 25, "Attacking Midfield", 10000000);
        Player t11 = new Player("Kerem Aktürkoglu", 24, "Türkiye", 7, "Left Wing", 13000000);
        Player t12 = new Player("Cengiz Ünder", 25, "Türkiye", 17, "Right Wing", 17000000);
        Player t13 = new Player("Enes Ünal", 25, "Türkiye", 16, "Centre Forward", 25000000);
        Player t14 = new Player("Umut Bozok", 26, "Türkiye", 19, "Centre Forward", 5500000);
        Player t15 = new Player("Cenk Tosun", 31, "Türkiye", 9, "Centre Forward", 2000000);
        turkiye.addPlayer(t1);
        turkiye.addPlayer(t2);
        turkiye.addPlayer(t3);
        turkiye.addPlayer(t4);
        turkiye.addPlayer(t5);
        turkiye.addPlayer(t6);
        turkiye.addPlayer(t7);
        turkiye.addPlayer(t8);
        turkiye.addPlayer(t9);
        turkiye.addPlayer(t10);
        turkiye.addPlayer(t11);
        turkiye.addPlayer(t12);
        turkiye.addPlayer(t13);
        turkiye.addPlayer(t14);
        turkiye.addPlayer(t15);

        Team england = new Team(34, "England");
        A.addTeam(germany);
        A.addTeam(england);
        A.addTeam(turkiye);

        System.out.print("--------------------------------------------------------------------------------------------------\n" +
                         "Welcome to Qatar 2022! Get Ready for the World Cup!\n" +
                         "--------------------------------------------------------------------------------------------------\n");

        while(!exit)
        {
            System.out.print("\n-------------------------------------------- Group: " + A.getGroupName() + " --------------------------------------------\n" +
                         "1- Create a new Team \n" +
                         "2- Display a Team \n" +
                         "3- Add a Player to a Team \n" +
                         "4- Remove a Player with ID from a Team \n" +
                         "5- Add a Game to a Group \n" +
                         "6- Display Standings \n" + 
                         "7- Exit \n" + 
                         "--------------------------------------------------------------------------------------------------\n" +
                         "Your Choice: " );

            int choice = in.nextInt();
            if(choice == 1)
            {
                if(A.isEmpty())
                {
                    System.out.print("What is the unique ID of the Team?: ");
                    int ID = in.nextInt();
                    if(ID < 0){System.out.println("Group ID cannot be negative! ");}
                    else
                    {
                        System.out.print("What is the name of the Team?: ");
                        String name = in.next();
                        A.addTeam(new Team(ID, name));
                    }
                }
                else
                {
                    System.out.println("Group already has " + A.getCurrentTeam() + "/" + A.getGroupSize() + " teams.");
                }   
            }

            else if(choice == 2)
            {
                System.out.print("What is the unique ID of the Team?:");
                int ID = in.nextInt();
                if(ID < 0 ) {System.out.println("Team ID cannot be negative!");}
                else if(!A.numberExist(ID)){System.out.println("Team does not exist!");}
                else
                {
                    Team desired = A.findTeam(ID);
                    System.out.println(desired);
                }

            }

            else if(choice == 3)
            {
                System.out.print("What is the unique ID of the Team to add the Player?:");
                int ID = in.nextInt();
                Team here = A.findTeam(ID);
                System.out.print("Enter the name of the player:");
                String name = in.nextLine();
                name = in.nextLine();

                System.out.print("Enter the age of the player: ");
                int age = in.nextInt();
                System.out.print("Enter the nationality of the player: ");
                String nationality = in.next();
                if(!nationality.equals(here.getTeamName())) {System.out.println("Player must be a citizen of the country!");}
                else
                {
                    System.out.print("Enter the jerry number of the player: ");
                    int jerryNumber = in.nextInt();
                    if(!here.uniqueJerry(jerryNumber)){System.out.println("Player with the jerry number already exist!");}
                    else
                    {
                        System.out.print("Enter the position of the player: ");
                        String position = in.nextLine();
                        position = in.nextLine();
                        System.out.print("Enter the market value of the player: ");
                        int marketValue = in.nextInt();
                        if(marketValue < 0) {System.out.println("Market value cannot be negative!");}
                        else
                        {
                            Player newPlayer = new Player(name, age, nationality, jerryNumber, position, marketValue);
                            here.addPlayer(newPlayer); 
                        }
                            
                    }
                }
            }

            else if(choice == 4)
            {
                System.out.print("What is the unique ID of the Team to remove the Player?:");
                int ID = in.nextInt();
                if(!A.numberExist(ID)){System.out.println("Team does not exist!");}
                else
                {
                    Team here = A.findTeam(ID);
                    System.out.print("Enter the jersey number of the Player:");
                    int jerseyNumber = in.nextInt();
                    if(here.findPlayer(jerseyNumber) == null) {System.out.println("Player does not exist!");}
                    else
                    {
                        here.removePlayer(here.findPlayer(jerseyNumber));
                    }
                }  
            }

            else if(choice == 5)
            {
                System.out.print("What is the unique ID of the First Team?:");
                int ID1 = in.nextInt();
                if(!A.numberExist(ID1)){System.out.println("First Team does not exist!");}
                else
                {
                    System.out.print("What is the unique ID of the Second Team?:");
                    int ID2 = in.nextInt();
                    if(!A.numberExist(ID2)){System.out.println("Second Team does not exist!");}
                    else
                    {
                        System.out.print("Enter the score (such as 2 1):");
                        int score1 = in.nextInt();
                        int score2 = in.nextInt();
                        if(score1 < 0 || score2 < 0) {System.out.println("Scores cannot be negative!");}
                        else
                        {
                            if(A.gameExist(A.findTeam(ID1), A.findTeam(ID2)))
                            {
                                System.out.println("Already a game between the teams exists!");
                            }
                            else
                            {
                                Game g = new Game(A.findTeam(ID1), A.findTeam(ID2), score1, score2);
                                A.addGame(g);
                            }
                            
                        }
                        
                    }
                }
            }

            else if(choice == 6)
            {
                System.out.println(A.toString());
            }

            else if(choice == 7)
            {
                exit = true;
            }

        }




        /*Group B = new Group("B", 3);
        Team germany = new Team(6, "Germany");
        Team turkiye = new Team(38, "Türkiye");
        Team england = new Team(34, "England");
        B.addTeam(england);
        B.addTeam(germany);
        B.addTeam(turkiye);
        Game g1 = new Game(turkiye, germany, 3, 3);
        Game g2 = new Game(turkiye, england, 2, 0);
        B.addGame(g2);
        B.addGame(g1);
        System.out.println(B);*/
    }
}
