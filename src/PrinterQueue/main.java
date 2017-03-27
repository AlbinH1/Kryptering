package PrinterQueue;


import java.util.Scanner;

/**
 * Created by olal15 on 2017-03-20.
 */
public class main {

    public static PrinterQueue printer = new PrinterQueue();

    public static void main (String[] args) { //låt användaren ge input (ord)
        String input = "";
        Scanner sc = new Scanner(System.in);

        while(true) {
            if(input.equals("exit")) { //"printa" genom att skriva exit
                break;
            } else { //inputen hamnar i kön
                printer.enqueue(input);
                input = sc.nextLine();

            }
        }
        System.out.println(printer.dequeue()); //när det har printats lämnar det kön

    }


}
