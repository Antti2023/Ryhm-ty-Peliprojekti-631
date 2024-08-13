import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class nopat {
  public static void main(String[] args) {

    Scanner lukija = new Scanner(System.in);
    int min = 1;
    int maksimi = 6;
    ArrayList<Integer> nopat = new ArrayList<>();
    int maara = 0;

    System.out.println("Käynnistä peli");
    String komento1 = lukija.nextLine();
    if (komento1.equals("kyllä")) {

    }
    while (true) {

      System.out.println("Heitetään noppia");
      String komento2 = lukija.nextLine();
      if (komento2.equals("heitä")) {

      }
      for (int i = 0; i < 5; i++) {
        int satunnainen = (int) (Math.random() * (maksimi - min + 1) + min);
        System.out.print(satunnainen + ", ");
      }
      int vuorot = 3;
      while (true) {

        System.out.print("\n");
        System.out.println("Vuoroja: " + vuorot);
        System.out.println("Kuinka monta noppaa heitetään?");

        int komento = Integer.valueOf(lukija.nextLine());
        System.out.println("Heitetään");
        for (int i = 0; i < komento; i++) {
          int satunnainen2 = (int) (Math.random() * (maksimi - min + 1) + min);
          System.out.print(satunnainen2 + ", ");

        }

        if (komento > 5) {
          System.out.println("Et voi heittää yli viittä noppaa.");
          break;
        }

        vuorot--;

        if (vuorot == 0) {
          System.out.println("Ei enää vuoroja");
          break;

        }
      }
    }

  }
}