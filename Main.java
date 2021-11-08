package com.byaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Participant participant = new Participant();
        Scanner keyboard = new Scanner(System.in);
        
        Participant[] participants = new Participant[100];    
        
    String goon = "";
    int i = 0;
    while (! goon.equals("no"))
        {
            System.out.print("Age ");
            participant.age = Integer.parseInt(keyboard.nextLine());

            System.out.print("Fee ");
            participant.fee = Double.parseDouble( keyboard.nextLine());

            System.out.print("Name ");
            participant.name = keyboard.nextLine();

            System.out.print("Student Id ");
            participant.studentid = keyboard.nextLine();

            participants[i] = participant;
            i++;

            System.out.println("Do you want to continue? ");
            goon = keyboard.nextLine();
        }

    
    
        System.out.println(participant.toString());
    }
}
