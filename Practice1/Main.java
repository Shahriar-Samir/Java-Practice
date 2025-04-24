package practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter you name: ");
        String name =  scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.print("What is your age :");
        int age = scanner.nextInt();
        System.out.println("Your age is "+age);
        System.out.print("Are you a student ? :");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent){
            System.out.print("So you are "+name+". Your age is "+age+" And you are a student too.");
        }
        else{
            if(isStudent){
                System.out.print("So you are "+name+". Your age is "+age+" And you are not a student.");
            }
        }
        scanner.close();
    }
}
