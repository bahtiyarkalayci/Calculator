import java.util.Scanner;

public class Main {

    static int sum(int a,int b){
        int result;
        result=a+b;
        System.out.println("toplam="+result);
        return result;
    }
    static int minus(int a,int b){
        int result;
        result=a-b;
        System.out.println("çıkarma="+result);
        return result;
    }
    static int multiple(int a,int b){
        int result;
        result=a*b;
        System.out.println("çarpma="+result);
        return result;
    }
    static int divide(int a,int b){
        int result;
        result=a/b;
        System.out.println("bölme="+result);
        return result;
    }
    static int power(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;

        }
        System.out.println("bölme="+result);
        return result;
    }
    static  void factorial(){
        Scanner fac =new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int n=fac.nextInt();
        int result=1;
        for (int i=1;i<=n;i++){
            result*=i;
        }
        System.out.println("sonuc="+result);

    }
    static int mod(int a,int b){
        int result;
            result=a%b;
        System.out.println("mod="+result);
        return result;

        }
    static void rectangular(int a,int b){

        System.out.println("dikdörtgen çevre="+(2*(a+b)));
        System.out.println("dikdörtgen alan ="+(a*b));


    }







    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int select;
        String menü= "menü\n"+"1 toplama işlemi\n"+"2 çıkarma işlemi\n"+"3 çarpma işlemi\n"+"4 bölme işlemi\n"
                +"5 üslü sayı hesaplama\n"+"6 faktoriyel hesaplama\n"+"7 mod alma\n"
                +"8 dikdörtgen alan ve çevre hesabı\n"+"0 çıkış yap\n";
        while (true){
            System.out.println(menü);
            System.out.print("bir işlem seçiniz");
            select= scanner.nextInt();
            if (select==0){
                break;

            }

            System.out.print("birinci sayı:");
             int a= scanner.nextInt();
            System.out.print("ikinci sayı:");
            int b =scanner.nextInt();

           switch (select){
               case 1:
                   sum(a,b);
                   break;
               case 2:
                   minus(a,b);
                   break;
               case 3:
                   multiple(a,b);
                   break;
               case 4:
                   divide(a,b);
                   break;
               case 5:
                   power(a,b);
                   break;
               case 6:
                   factorial();
                   break;
               case 7:
                   mod(a,b);
                   break;
               case 8:
                   rectangular(a,b);
                   break;

           }

        }

    }
}