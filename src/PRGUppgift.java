/**
 * Created by olal15 on 2016-11-28.
 */
public class PRGUppgift {



    public static void del1() {
        // lösning till del 1
        // sammansatta tilldelningar
        // loopa igenom 1 till 9
        for (int i = 1; i <= 9; i++) {
            // Skriv ut "i * j" i gånger
            for (int j = 1; j <= i; j++) {
            //
                System.out.print(j * i + " ");
            }
            // Gör ny rad för nästa talserie
            System.out.print("\n");
        }
    }

    public static void del2() {
      double div;
      for (double i = 1; i < 10; i++) {
            div = 1 / i;
            System.out.println(div);


       }

    }

    public static void main (String[]args) {
        del1();
        del2();
    }
}
