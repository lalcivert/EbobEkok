package day01;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Birinci sayıyı giriniz: ");
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz :");
        n2 = input.nextInt();

        int ebob = 1;
        int i=1;
        while(i<n1){
            if(n1 % i == 0 && n2 % i == 0){
               ebob=i;
            }
            i++;
        }
        System.out.println("iki sayının ebobu: "+ebob);

        int ekok=1;
        while(i<=(n1*n2)){
            if(i % n1 == 0 && i % n2 == 0){
                ekok=i;
                break;
            }
            i++;
        }
        System.out.println("iki sayının ekoku: "+ekok);
    }
}
