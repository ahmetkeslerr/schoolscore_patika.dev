import java.util.Scanner;

public class school_score {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();

        double ort = (mat+fizik+kimya+turkce+muzik) / 5;

        if(ort <=55){
            System.out.println("Sınıfta kaldınız, lütfen tekrar deneyiniz:)");
            System.out.println("Ortalamanız: "+ort);
        }else{
            System.out.println("Tebrikler sınıfı geçtiniz...");
            System.out.println("Ortalamanız: "+ort);
        }


        
    }
    
}
