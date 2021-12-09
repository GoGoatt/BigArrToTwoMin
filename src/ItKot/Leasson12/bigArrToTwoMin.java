package ItKot.Leasson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bigArrToTwoMin {
    public static void main(String[] args) throws IOException {
        String [] arrBig = new String[10];
        String [] arrMin1 = new String[5];
        String [] arrMin2 = new String[5];
        String a;
        String b;
        int c=0;
        int e = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrBig.length; i++) {
            System.out.print("Введите слово: ");
            a = reader.readLine();
            arrBig[i] = a;
        }

        while (c < arrMin1.length){
            arrMin1[c] = arrBig[c];
            c++;
        }

        while (e < arrMin2.length){
            arrMin2[e] = arrBig [c];
            c++;
            e++;
        }

        for (int j = 0; j < arrMin2.length; j++) {
            System.out.println(arrMin2 [j]);
        }


    }
}
