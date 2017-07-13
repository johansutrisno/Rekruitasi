package rekruitasi;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nomor[] = new int[9999];
        int nilai[] = new int[9999];
        String nama[] = new String[9999];
        int data = 0;
        boolean trigger = false;

        do {
            System.out.print("Masukan Nomor (9999 untuk berhenti) : ");
            nomor[data] = in.nextInt();
            if (nomor[data] == 9999){
                trigger = true;
                break;
            }
            System.out.print("Nama : ");
            nama[data] = in.next();
            System.out.print("Nilai : ");
            nilai[data] = in.nextInt();
            System.out.println();
            data++;

        } while (trigger==false);

        int juara1[] = new int[9999];
        int juara2[] = new int[9999];
        int juara3[] = new int[9999];
        int max=0;

        for (int i=0; i < data; i++){
            if (nilai[i] >= max){
                max = nilai[i];
            }
        }


        System.out.println("Juara 1");
        for (int i = 0; i < data; i++){
            if (nilai[i] == max){
                juara1[i] = nilai[i];
                nilai[i]=0;
                System.out.println("Nama : " + nama[i]);
            }
        }

        max = 0;

        System.out.println("Juara 2");
        for (int i=0; i<data; i++){
            if (nilai[i]>=max){
                max = nilai[i];
            }
        }

        for (int i=0; i < data; i++){
            if (nilai[i] == max){
                juara2[i] = nilai[i];
                nilai[i]=0;
                System.out.println("Nama : "+nama[i]);
            }
        }

        max = 0;
        System.out.println("Juara 3");
        for (int i = 0; i < data; i++){
            if (nilai[i] >= max){
                max = nilai[i];
            }
        }

        for (int i = 0; i < data; i++){
            if (nilai[i] == max){
                juara3[i] = nilai[i];
                nilai[i] = 0;
                System.out.println("Nama : "+nama[i]);
            }
        }
    }
}
