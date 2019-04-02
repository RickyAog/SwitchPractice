import java.util.Scanner;

public class SwitchPractice {
public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);

System.out.println("You have reached the end of the project");

boolean loop= true;
while (loop){
if (ageVerification(keyboard)){
    System.out.println("You have entered the restricted area");
    loop = !loop;
String choice = vote(keyboard);
System.out.println("You have picked "+ choice + " as your option");
}
}
}
public static String vote(Scanner typewriter){
    System.out.println("Which candidate do you want to vote for?\n");
    System.out.println("A for candidate 1");
    System.out.println("B for candidate 2");
    System.out.println("C for candidate 3");
    System.out.println("D for candidate 4");
    System.out.println("or enter the name of the candidate\n\n");
    typewriter.nextLine();
    String choice = typewriter.nextLine().toUpperCase();
    switch(choice){
        case "A":
            return "candidate 1";
        case "B":
            return "candidate 2";
        case "C":
            return "candidate 3";
        case "D":
            return "candidate 4";
    }
    return choice;
}
 public static boolean ageVerification(Scanner typeWriter){
    System.out.println("How old are you");
    int age = typeWriter.nextInt();
    if (age <0){
        System.out.println("You have to enter a valid age");
        return false;
    }
    switch(age){
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            System.out.println("You are way to young go find your parents");
            break;
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
            System.out.println("You are not old enough to vote");
            break;
        case 16:
            System.out.println("You have to wait two more years");
            break;
        case 17:
            System.out.println("You only have to wait one more year");
            break;
        case 18:
        default:
            return true;
    }
    return false;
 }
}
