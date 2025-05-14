import java.util.*;
public class number
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int chances=8;
	int finals=0;
	boolean playAgain=true;
	System.out.println("Welcome!");
	System.out.println("you have about "+chances+" to win the game");
	while(playAgain){
	    int rand=getrandN(1,100);
	    boolean guess=false;
	    for(int i=0;i<chances;i++){
	        System.out.println("chances "+(i+1)+" enter your guess:");
	        int user=sc.nextInt();
	        if(user==rand){
	            guess=true;
	            finals+=1;
	            System.out.println("You won it!");
	            break;
	        }
	        else if(user>rand){
	            System.out.println("Too High!");
	        }
	        else {
	            System.out.println("Too Low!");
	        }
	        
	    }
	    if(guess==false){
	        System.out.println("Sorry you lost your chances. the number is " +rand);
	    }
	    System.out.println("Do you want to continue(y/n)");
	    String pA=sc.next();
	    playAgain=pA.equalsIgnoreCase("y");
	    }
	    System.out.println("This is your score "+finals);
	}
	    public static int getrandN(int min,int max){
	        return (int)(Math.random()*(max-min+1)+min);
	    }
	
}
