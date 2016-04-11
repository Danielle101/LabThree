package javaInteger;
import java.util.Scanner;

public class javaInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learn your squares and cubes!");
			String choice = "y";
			Scanner input = new Scanner (System.in);
			while (choice.equalsIgnoreCase("y"))
			{
	System.out.println("Enter an integer:");
	//
	int useIn = Integer.parseInt(input.nextLine());
	System.out.println("Number  Squared Cubed");
	System.out.println("======" + "\t" + "======="  + "\t"  + "======");
//i need to initialize variables for the square and cubed outputs
	int squaredInt;
	int cubedInt;
//Int 1 equals 1 and when i is less than or equal to the user inputed number(useIn) then the program will
//increment by 1 and stop at useIn
//int i equals 1 so essential useIn just tells the loop when to stop
	for (int i = 1; i <= useIn; i++){
	squaredInt = (i * i);
	cubedInt = (i* i * i);
//print all the outputs on one line
		System.out.println(i + "\t"+squaredInt + "\t" +cubedInt);
	}
//ask the user if they want to continue or not	
	System.out.println("Continue? (y/n):");
	choice = input.nextLine();
	System.out.println();
	
}
input.close();
System.out.println("Bye!");
}
}

	
