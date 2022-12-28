public class Pratik {
    public static void main(String[] args) {

        String str = "ade1r4d3";

        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                toplam += Integer.valueOf(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(toplam);
    }
}