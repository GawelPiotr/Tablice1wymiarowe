import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class Main {
    static int [] tablica = new int [10];
    public static void main(String[] args) {
        Random r = new Random();
        for (int i=0; i<10; i++);{
            tablica[i]  = r.nextInt();
            System.out.println(tablica[i]);
        }

    }

}
