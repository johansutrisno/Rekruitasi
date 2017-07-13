package rekruitasi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max;
        do {
            System.out.print("Masukan jumlah angka (Max 10) : ");
            max = in.nextInt();
            if (max>10){
                System.out.println("Ulangi");
            }
        }while (max>10);

        int[] array = new int[10];
        int[] Hasil = new int[10];
        int count = 0;

        for (int i = 0; i < max; i++) {
            System.out.print("Angka - "+(i+1)+" : ");
            array[i] = in.nextInt();
        }

        for (int i = 0; i < max; i++) {
            if (i==max-1){
                Hasil[count]=array[i];
                count++;
                break;
            }

            for(int j=(i+1); j<max; j++){
                if (array[i]==array[j] && i!=max-1){
                    break;
                }else if (j == max-1){
                    Hasil[count] = array[i];
                    count++;
                }
            }
        }

        System.out.println();
        System.out.print("Keluaran  = { ");

        for (int i=0; i<count; i++){
            System.out.print(Hasil[i]+"  ");
        }

        System.out.println("}");

    }
}
