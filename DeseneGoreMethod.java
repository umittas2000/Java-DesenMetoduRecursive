import java.util.Scanner;

public class DeseneGoreMethod {
    // Step 1 : 15 , sifirdan buyukse 5 azalt
    // Step 2: 10 ,  sifirdan buyukse 5 azalt
    //Step 3: 5 , sifirdan buyukse 5 azalt
    // Step 4: 0 // sifiraa yada eksi ise burda islemi tersine cevirmek icin bir anahtar gerekir
    // Step5: 5 , ana sayiya esit degilse 5 artir.
    //Step 6:10 , ana sayiya esit degilse 5 artir.
    //Step 7: 15 , ana sayiya esit degilse 5 artir.
    // Gerekenler , ana sayi, gecici ana sayi, anahtar

    static int desen(int x,int temp, int anahtar){

        System.out.print(temp + " "); // bunu ilk halini yakalamak icin basa koymak lazim.

        if(temp>0 && anahtar==0){
           temp-=5;
       }else if(temp<=0){
           anahtar=1;
           temp+=5;
       }else if(temp!=x && anahtar==1)
       {
           temp+=5;
       }else if(temp==x){
           return 1;
       }

        return desen(x,temp,anahtar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayi girin: ");
        sayi = input.nextInt();
        int anahtar = 0;
        desen(sayi,sayi,anahtar);
    }
}
