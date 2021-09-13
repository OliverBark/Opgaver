package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number = 0;
        Random rand = new Random();
        int numberofTries = 0;

        while (number != 7) {
            System.out.println(number);
            number = rand.nextInt(10);
            numberofTries++;
        }
        if (number == 7) {
            System.out.print(number);
        }
        System.out.println("\nDet tog " + numberofTries + " forsøg");


// OPGAVE 2
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Tast 0 for at afslutte køb");
        int varePris;
        int vareAntal;
        int sum = 0;
        boolean goOn = true;
        while (goOn) {
            System.out.print("Indtast pris for varen: ");
            varePris = sc.nextInt();
            if (varePris <= 0) {
                goOn = false;
            }
            System.out.print("Indtast antal af den ønskede vare: ");
            vareAntal = sc.nextInt();
            if (vareAntal <= 0) {
                goOn = false;
            }
            int sumPlus = vareAntal * varePris;
            sum = sum + sumPlus;
        }
        System.out.println("Samlet pris uden moms er: " + sum);
// OPGAVE 3
        System.out.println(" ");
        for (int tal = 10; tal > 0; tal--) {
            System.out.print(tal + " ");
        }
        // OPGAVE 4
        System.out.println(" ");
        System.out.print("Skriv 10 ord tak: ");
        int wordCounter = 0;
        int aCounter = 0;
        int ACounter = 0;
        int beggeACounters = 0;
        for (int forTimer = 11; forTimer > 0; forTimer--) {
            String ord = sc.nextLine();
            if (ord.length() >= 5) {
                wordCounter++;
            }
            if (ord.startsWith("a")) {
                aCounter++;
            }
            if (ord.startsWith("A")) {
                ACounter++;
            }
            beggeACounters = aCounter + ACounter;
        }
        System.out.println("der var " + wordCounter + " ord med en længde på 5 eller flere bogstaver.");
        System.out.println("der var " + beggeACounters + " ord der starter med A eller a.");
//OPGAVE 5
        System.out.println("\nVelkommen til terninge spillet!");
        int diceRoll;
        int sumOfDice = 0;
        double averageDiceRoll;
        for (int forTimer = 10; forTimer > 0; forTimer--) {
            diceRoll = rand.nextInt(6) + 1;
            System.out.print(diceRoll + " ");
            sumOfDice = sumOfDice + diceRoll;
        }
        double sumOfDice2 = sumOfDice;
        averageDiceRoll = sumOfDice2 / 10;
        System.out.println("Summen er " + sumOfDice + "\ngennemsnittet er " + averageDiceRoll);
    }
}







