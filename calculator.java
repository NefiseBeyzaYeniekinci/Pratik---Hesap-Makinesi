import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner giris=new Scanner(System.in);

        System.out.print("İşlem yapmak istediğiniz ilk rakamı giriniz: ");
        int num1=giris.nextInt();
        System.out.print("İşlem yapmak istediğniz ikinci rakamı giriniz: ");
        int num2=giris.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.print("İşlem Seçiniz: ");
        int sec=giris.nextInt();


        switch(sec){
            case 1:
                System.out.println("Toplama Sonucunuz: "+(num1+num2));
                break;
            
            case 2:
                System.out.println("Çıkarma Sonucunuz: "+(num1-num2));
                break;

            case 3:
                System.out.println("Çarpma Sonucunuz: "+(num1*num2));
                break;

            case 4:
                double sonuc=(double) num1/num2;
                if(num2!=0){
                    System.out.println("Bölme Sonucunuz: "+sonuc);
                    
                }else{
                    System.out.println("Bir sayı 0\'a bölünemez!");
                }
                break;

            default:
                System.out.println("Geçersiz Bir İşlem Yaptınız!");

        }

    }

}
