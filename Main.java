import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Type 0 for rock,Type 1 for paper and Type 2 Scissors");
        System.out.println("Now your turn ");
        
        int user = sc.nextInt();
        
        int comp = rand.nextInt(3);
        
        System.out.printf("You chose %d\n", user);
        System.out.printf("Computer chose %d\n", comp);
        if(user==comp){
            System.out.println("Draw! match");
        }
        else if(comp==0){
            if(user==1){
                System.out.println("user won the match");
            }
            else if(user==2){
                System.out.println("Comp won the match");
            }
        }
         else if(comp==1){
            if(user==0){
                System.out.println("comp won the match");
            }
            else if(user==2){
                System.out.println("user won the match");
            }
        }
         else if(comp==2){
            if(user==0){
                System.out.println("user won the match");
            }
            else if(user==1){
                System.out.println("Comp won the match");
            }
        }
        
        
       
    }
}
