import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class S3_0_100ArasıRastGeleSayı {  public static void main(String[] args) {
          /*
    kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup
     kaçının ortalamanın altında,
    kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz
     */
    Scanner scan=new Scanner(System.in);
    System.out.println("Array uzunlugunu giriniz");
    int uzunluk= scan.nextInt();
    arrayOluştur(uzunluk);
}

    private static void arrayOluştur(int uzunluk) {
        int arr[]=new int[uzunluk];
        Random rnd=new Random();
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rnd.nextInt(100);
            toplam+=arr[i];
        }
        double ortalama=toplam/ arr.length;
        int alt=0,ust=0,eşit=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ortalama){
                alt++;
            } else if (arr[i]>ortalama) {
                ust++;
            }else {
                eşit++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("ortalama:"+ortalama+"\n"
                +alt+"adet sayı ortalamadan kücük\n"
                +ust+"adet sayı ortalamadan buyuk\n"
                +eşit+"adet sayı ortalamaya esıt");
    }

}


