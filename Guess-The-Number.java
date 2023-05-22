/**
 * A Simple Number Guessing Game
 *
 * @author (Divyanshu Dhruv)
 * @version (0.1)
 * @license (MIT)
 */

import java.util.*;

public class Guess_The_Number{

    int z; // Add The First Number Of Each Method
    int i; // Makes Program Run: (Infinite Times)
    int a; // Accepting The 1st Input
    int b; // Accepting The 2nd Input
    int c; // Accepting The 3rd Input
    int d; // Accepting The 4th Input
    int e; // Accepting The 5th Input
    int f; // Accepting The 6th Input
    int g; // Accepting The 7th Input

    public Guess_The_Number(){
        z = 0;
        i = 0;

    }

    public void br(){
        System.out.println();
    }

    public void menu(){
        System.out.println("--------------------");
        System.out.println("1) Play Game");
        System.out.println("2) Instructions");
        System.out.println("3) Exit");
        System.out.println("--------------------");
    }

    public void start() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        i = in.nextInt();

        switch(i){

            case 1: play(); 
                i+=1;;
                break;
            case 2: instruction();
                i+=2;
                break;
            case 3: exit();
                i+=3;
                break;
        }

        if(i==1 || i==2|| i==3){

        }
    }

    public void play() throws InterruptedException {
        _1();
        _2();
        _3();
        _4();
        _5();
        _6();
        _7();
        calc();
    }

    public void msg(){
        System.out.println("Choose A Number Between 1 And 99 And Keep It In Your Mind.");
    }

    public void _1(){  
        System.out.println("----------------------------------------------");
        msg();
        br();
        System.out.println("Is Your Number Here?");
        br();
        System.out.println("01,  03,  05,  07,  09,");
        System.out.println("11,  13,  15,  17,  19,");
        System.out.println("21,  23,  25,  27,  29,");
        System.out.println("31,  33,  35,  37,  39,");
        System.out.println("41,  43,  45,  47,  49,");
        System.out.println("51,  53,  55,  57,  59,");
        System.out.println("61,  63,  65,  67,  69,");
        System.out.println("71,  73,  75,  77,  79,");
        System.out.println("81,  83,  85,  87,  89,");
        System.out.println("91,  93,  95,  97,  99,");
        br();
        System.out.print("Type Your Answer:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("----------------------------------------------");
        br();
        br();
        switch(a){
            case 1: z+=1;break;
        }
    }

    public void _2(){    
        System.out.println("----------------------------------------------");
        System.out.println("Is Your Number Here?");
        br();
        System.out.println("02,  03,  06,  07,  10,");
        System.out.println("11,  14,  15,  18,  19,");
        System.out.println("22,  23,  26,  27,  30,");
        System.out.println("31,  34,  35,  38,  39,");
        System.out.println("42,  43,  46,  47,  50,");
        System.out.println("51,  54,  55,  58,  59,");
        System.out.println("62,  63,  66,  67,  70,");
        System.out.println("71,  74,  75,  78,  79,");
        System.out.println("82,  83,  86,  87,  90,");
        System.out.println("91,  94,  95,  98,  99,");
        br();
        System.out.print("Type Your Answer:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("----------------------------------------------");
        br();
        br();
        switch(a){
            case 1: z+=2;break;
        }

    }

    public void _3(){
        System.out.println("----------------------------------------------");
        System.out.println("Is Your Number Here?");
        br();
        System.out.println("04,  05,  06,  07,  12,  13,  14,");
        System.out.println("15,  20,  21,  22,  23,  28,  29,");
        System.out.println("30,  31,  36,  37,  38,  39,  44,");
        System.out.println("45,  46,  47,  52,  53,  54,  55,");
        System.out.println("60,  61,  62,  63,  68,  69,  70,");
        System.out.println("71,  76,  77,  78,  79,  84,  85,");
        System.out.println("86,  87,  92,  93,  94,  95,");
        br();
        System.out.print("Type Your Answer:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("----------------------------------------------");
        br();
        br();
        switch(a){
            case 1: z+=4;break;
        }

    }

    public void _4(){
        System.out.println("----------------------------------------------");
        System.out.println("Is Your Number Here?");
        br();
        System.out.println("08,  09,  10,  11,");
        System.out.println("12,  13,  14,  15,");
        System.out.println("24,  25,  26,  27,");
        System.out.println("28,  29,  30,  31,");
        System.out.println("40,  41,  42,  43,");
        System.out.println("44,  45,  46,  47,");
        System.out.println("56,  57,  58,  59,");
        System.out.println("60,  61,  62,  63,");
        System.out.println("72,  73,  74,  75,");
        System.out.println("76,  77,  78,  79,");
        System.out.println("88,  89,  90,  91,");
        System.out.println("92,  93,  94,  95,");
        br();
        System.out.print("Type Your Answer:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("----------------------------------------------");
        br();
        br();
        switch(a){
            case 1: z+=8;break;
        }

    }

    public void _5(){
        System.out.println("----------------------------------------------");
        System.out.println("Is Your Number Here?");
        br();
        System.out.println("16,  17,  18,  19,");
        System.out.println("20,  21,  22,  23,");
        System.out.println("24,  25,  26,  27,");
        System.out.println("28,  29,  30,  31,");
        System.out.println("48,  49,  50,  51,");
        System.out.println("52,  53,  54,  55,");
        System.out.println("56,  57,  58,  59,");
        System.out.println("60,  61,  62,  63,");
        System.out.println("80,  81,  82,  83,");
        System.out.println("84,  85,  86,  87,");
        System.out.println("88,  89,  90,  91,");
        System.out.println("92,  93,  94,  95,");
        br();
        System.out.print("Type Your Answer:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("----------------------------------------------");
        br();
        br();
        switch(a){
            case 1: z+=16;break;
        }

    }

    public void _6(){
        System.out.println("----------------------------------------------");
        System.out.println("Is Your Number Here?");
        br();
        System.out.println("32,  33,  34,  35,  36,  37,");
        System.out.println("38,  39,  40,  41,  42,  43,");
        System.out.println("44,  45,  46,  47,  48,  49,");
        System.out.println("50,  51,  52,  53,  54,  55,");
        System.out.println("56,  57,  58,  59,  60,  61,");
        System.out.println("62,  63,  96,  97,  98,  99,");
        br();
        System.out.print("Type Your Answer:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("----------------------------------------------");
        br();
        br();
        switch(a){
            case 1: z+=32;break;
        }

    }

    public void _7(){
        System.out.println("----------------------------------------------");
        System.out.println("Is Your Number Here?");
        br();
        System.out.println("64,  65,  66,  67,  68,  69,");
        System.out.println("70,  71,  72,  73,  74,  75,");
        System.out.println("76,  77,  78,  79,  80,  81,");
        System.out.println("82,  83,  84,  85,  86,  87,");
        System.out.println("88,  89,  90,  91,  92,  93,");
        System.out.println("94,  95,  96,  97,  98,  99,");
        br();
        System.out.print("Type Your Answer:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("----------------------------------------------");
        br();
        br();
        switch(a){
            case 1: z+=64;break;
        }

    }

    public void calc() throws InterruptedException {
        try {
            System.out.println("--------------------");
            System.out.print("Ok");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(400);
            System.out.println(".");
            Thread.sleep(400);
            System.out.print("Calculating");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(400);
            System.out.println(".");
            Thread.sleep(400);
            System.out.print("Done");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(400);
            System.out.println(".");
            Thread.sleep(400);
            System.out.println("Your number is "+z);
            System.out.println("--------------------");
        }catch(InputMismatchException e){
            System.out.println("Error!");
        }
    }

    public void instruction() throws InterruptedException {
        System.out.println("----------------------------------------------");
        System.out.println("1) You Will Be Asked 7 'Yes-No' Questions");
        System.out.println("2) If Your Answer Is Yes, Type 1");
        System.out.println("3) If Your Answer Is No, Type 0");
        System.out.println("4) Avoid Entering Any Other Input");
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.println("INFO !) Automatically Redirecting In 8 Seconds");

        try {
            Thread.sleep(8000);
            System.out.println("\f");
            menu();
            start();
        }catch(InputMismatchException e){

        }
    }

    public void exit(){
        System.out.println("--------------------");
        System.out.println("Thnx");
        System.out.println("--------------------");
        System.exit(0);
    }

    public void error(){
        //System.out.println("--------------------");
        //System.out.println("Error!  Wrong Input!");
        //System.out.println("--------------------");
    }

    public static void main(String args[]){
        /* 

        @ menu() : Show The Menu For The Game
        @ start() : Get User Input And Do The Next Function
        @ play() : Start The Game

        @ msg() : Display The Message
        @ br() : To Leave A Line (break)

        @ _1() : Get User Input For The 1st List
        @ _2() : Get User Input For The 2nd List
        @ _3() : Get User Input For The 3rd List
        @ _4() : Get User Input For The 4th List
        @ _5() : Get User Input For The 5th List
        @ _6() : Get User Input For The 6th List
        @ _7() : Get User Input For The 7th List

        @ calc() : To Calculate And Disply The Number
        @ instruction() : Display Instruction Of The Game
        @ exit() : Exit The Game
        @ error() : Show Error Message

        @ main() : Compile And Run The Program

         */
        try
        {
            new Guess_The_Number().menu();
            new Guess_The_Number().start();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

    }
}
