import java.util.Scanner;

public class S01_SayısalİfadeleriTopla {


        public static void main(String[] args) {
            //kullanıcı tarafından girilen String ifadenin içindeki
            // sayısal degerleri toplayan methodu yazınız.
            Scanner scan=new Scanner(System.in);
            System.out.println("cumle giriniz");
            String cumle= scan.nextLine();

            System.out.println(sayısalİfadeleriTopla(cumle));
        }
        public static int sayısalİfadeleriTopla (String cumle){
            int toplam=0;
            String cumleArr[]=cumle.split("");

            for (int i = 0; i < cumle.length(); i++) {

                if (Character.isDigit(cumleArr[i].charAt(0))){
                    toplam+=Integer.valueOf(cumleArr[i]);
                }


            }
            return toplam;

        }
    }


