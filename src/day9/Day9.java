package day9;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] arg ){
        //problem 1
        String s1 = "kutul";
        String s2 = " kutul";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //problem2
        String str1 = "pumplik";
        String str = new String("pumplik");
        System.out.println(str1==str);
        System.out.println(str.equals(str1));
        //problem3
        /*
        System.out.println("Input a:");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        String result = (a>0) ? "positive": "negative";
        System.out.println(result);
        System.out.println("Input b:");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        String result2 = (b!=0) ? ((b!=0)?"positive": "negative") : "0";
        System.out.println(result2);
        int answer = (a>b)? a: b;
        int abs = (a>0)? a: -a;
        System.out.println(answer);
        System.out.println(abs);
        String el = "";


         */
        //finding max number
        System.out.println("Input a:");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Input b:");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        System.out.println("Input c:");
        Scanner n3 = new Scanner(System.in);
        int c = n3.nextInt();
        int res = (a>b) ? ((a>c)? a: c) : ((b>c) ? b: c);
        System.out.println(res);

        //9.choose right answer// mandatory check for chaxo below
        System.out.println("What is capital of Armenia?");
        System.out.println("enter your choice");
        Scanner scan1 = new Scanner(System.in);
        String answer = scan1.next();
        switch(answer){
            case "a":
                System.out.println( "invalid choice");
                break;
            case "b":
                System.out.println();
                break;
            case "c":
                System.out.println("Congratulations");
        }

        //10.vowel or not
        /*
        boolean isvowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        switch(ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :isvowel = true;
        }
        if(isvowel==true){
            System.out.println(ch + "is vowel");
        }else{
            System.out.println("consonant");
        }

         */
        //11

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number: ");
        int num = scanner.nextInt();
        switch(num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("number is pressed");
            default:
                System.out.println("not allowed");
        }

        //12

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sr.nextInt();

        switch(number%2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
        }


    }
}
