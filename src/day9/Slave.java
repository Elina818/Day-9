package day9;
import java.util.Scanner;
public class Slave {
    public static void main(String [] arg){
        /*
        double ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        Scanner scan = new Scanner(System.in);
        int number2 = scan.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operator: ");
        char ch = scanner.next().charAt(0);
        switch(ch){
            case '+': ans = number1 + number2;
            break;
            case '-': ans = number1-number2;
            break;
            case '*': ans = number1*number2;
            break;
            case '/': ans = number1/number2;
            break;
            default:
                System.out.println("error");
        }
        System.out.println(ans);

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiz score: ");
        int qScore = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Mid-term score: ");
        int mScore = scan.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Final score: ");
        int fScore = scanner.nextInt();
        int average = (qScore + mScore + fScore)/3;
        switch(average/10){
            case 10:
            case 9:
            case 8:
                System.out.println("A");
                break;
            case 7:
            case 6:
                System.out.println("B");
                break;
            case 5:
            case 4:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
        }

    }
}
