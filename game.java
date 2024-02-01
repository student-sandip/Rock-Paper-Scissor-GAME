import java.util.*;
class rock {
    // private static int i;
    // private static double wins;
    // private static Scanner scan;
    // private static boolean exit;

    public static void main(String[] args) {
        System.out.println("Welcome to the Rock, Paper, Scissors game!");
    
        Scanner  sc = new Scanner(System.in);
        while (true) {
        Random rand = new Random();
        int comp_choice, user_choice;
       
        System.out.print("Enter the number of rounds you want to play:");
        int round=sc.nextInt();
        for (int i = 1; i <=round ; i++) {
            System.out.print("\n0 is Rock and 1 is Paper & 2 is for scissers: ");
            user_choice = sc.nextInt();
            if (user_choice < 0 || user_choice > 2) {
                System.out.println("Invalid Input! Please enter either 0 or 1 or 2 only.");
                continue;
                }
                else{
                    System.out.println("\nYour Choice is: " + (char)+user_choice);//((char)( + user_choice)));
                    }
                    comp_choice = rand.nextInt(3);
                    switch (comp_choice){
                        case 0:
                        System.out.println("\nComputer chose Rock!");
                        break;
                        case 1:
                        System.out.println("\nComputer chose Paper!");
                        break;
                        case 2:
                        System.out.println("\ncomputer chose Scissors!");
                        break;
                        default:
                        System.out.println("Error in Computer's choice!!");
                        }
                    
                       
                        if (user_choice == comp_choice) {
                            System.out.println("\nIt's a tie!\n");
                            }
                        else if (user_choice==1 && comp_choice==0 || comp_choice==2) {
                            System.out.println("\nCongratulations! You won this round.\n");
                            }
                        else if(comp_choice==1 || user_choice==0 && comp_choice==2){
                            System.out.println("\nSorry! Computer won this round.\n");
                            } 
                        else if(comp_choice==1 || comp_choice==0 && user_choice==2){
                            System.out.println("\nSorry! Computer won this round");
                            }       
                    } 
                    System.out.println("\nDo you want to play again? (y/n): ");
                        String playAgain = sc.next();
                        if(!playAgain.equals("y")) {
                            System.out.println("Thanks for playing!");
                            break;
                        }
                    }
                }
            }
