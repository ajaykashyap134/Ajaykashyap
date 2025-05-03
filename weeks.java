package subjava;

import java.util.Scanner;

public class weeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weeks = sc.nextInt();
        switch(weeks){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default :
                System.out.println("your code is wrong");


        }
    }
}
