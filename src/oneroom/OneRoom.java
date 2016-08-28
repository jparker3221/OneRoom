package oneroom;

import java.util.Scanner;

public class OneRoom {
    
static boolean isPlaying = true;
//The user input
static Scanner input = new Scanner(System.in); 
static String inputAnswer;

    public static void main(String[] args) {
    intro();
    choice();
    while(isPlaying){
        nextchoice();
        choice();
    }
    }
    
    //The introduction to the room
    public static void intro(){
       System.out.println("You wake up from heat exhaustion from a long day of band camp." +
               "\nYou see a puddle, some clothes, and cabinet.");
       nextchoice();
    }
    public static void nextchoice(){
        System.out.println("\n\n\nYou have to guess which section's sectional room you are in" +
               "\nWhat do you want to do?" +
               "\n[1] Inspect puddle" +
               "\n[2] Inspect clothes" +
               "\n[3] Inspect cabinet" +
               "\n[4] Guess what room you are in");
    }
    
    //The code deciding the crossroads of the choices
    public static void choice() {
        inputAnswer = input.nextLine(); //convert's the scanner's info into a interactive datatype
        if(inputAnswer.contains("1")){
            choice1();
        }
        else if(inputAnswer.contains("2")){
            choice2();
        }
        else if(inputAnswer.contains("3")){
            choice3();
        }
        else if(inputAnswer.contains("4")){
            choice4();
        }
    }
    //The results of each inspection
    public static void choice1() {
        System.out.println("\n\nUpon further inspection there are multiple small puddles in front of each chair"
                + "\nThese puddles look suspiciously like saliva...");
    }
    public static void choice2() {
        System.out.println("\n\nYou find a dirty pair of Captain America underwear"
                + "\nThey are wet from sweat and have brown marks on the bottom of them");
    }
    public static void choice3() {
        System.out.println("\n\nYou open the cabinet and find a tube called 'slide grease' and a metal mouthpeice"
                + "\nOn the mouthpeice there are small engraving reading 'Tr---one,' The rest is illegible");
    }
    public static void choice4(){
        System.out.println("\n\nWell, Who's Sectional room is it?");
        inputAnswer = input.nextLine();
        inputAnswer = inputAnswer.toLowerCase();
        if(inputAnswer.contains("trombone")){
            System.out.println("\n\nTo your dismay, you've guessed correctly, good job!");
                isPlaying = false;
        } else if(inputAnswer.contains("trumpet")||inputAnswer.contains("horn")
                ||inputAnswer.contains("baritone")||inputAnswer.contains("tuba")){
            System.out.print("\n\nalmost as disgusting, but not quite this bad, try another brass insturment\n");
            inputAnswer = input.nextLine();
            inputAnswer = inputAnswer.toLowerCase();
            if(inputAnswer.contains("trombone")){
                System.out.println("\n\nTo your dismay, you've guessed correctly, good job!");
                isPlaying = false;
            } else {
            System.out.println("\n\nSorry, thats not it, Try again!");
            choice4();
            }  
        } else {
            System.out.println("\n\nNot even close, Try again?"
                    + "\n[1] Let me guess again"
                    + "\n[2] Let me go back to inspecting"
                    + "\n[3] Give up and quit");
            inputAnswer = input.nextLine();
            inputAnswer = inputAnswer.toLowerCase();
            if(inputAnswer.contains("1")){
                choice4();
            }
            if(inputAnswer.contains("2")){
                nextchoice();
            }
            if(inputAnswer.contains("3")){
                System.out.println("\n\nNobody likes a quitter");
                isPlaying = false;
            }
        }
    }
}
