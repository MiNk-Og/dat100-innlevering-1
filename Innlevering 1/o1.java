import java.util.Scanner;

public class o1 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

            
        System.out.println("Skriv inn inntekt: ");

    //Skattefot omgjort til prosent for å gjere koden enklere
    //Place holder navn for verdiene er t
    //Bruker final for at talla ikkje skal forrandre seg i koden videre nedover

        final double t1 = 0.017;
        final double t2 = 0.04;
        final double t3 = 0.137;
        final double t4 = 0.167;
        final double t5 = 0.177;
        
    //Place holder navn for inntekt verdier er i
    //Inntekts verdier forkortet for å skrive koden enklere

        final double g1 = 217400;
        final double g2 = 306050;
        final double g3 = 697150;
        final double g4 = 942400;
        final double g5 = 1410750;



        double inn = scanner.nextDouble();
        if (inn <= 0){
            System.out.println("Ugyldig verdi");
            scanner.close();
            return;
        }
        
        double skatt = 0.0;

        if(inn> g1){
            skatt += (Math.min(inn, g2) - g1)* t1;
        }
        if(inn>g2){
            skatt += (Math.min(inn, g3) - g2)* t2;
        }
        if(inn>g3){
            skatt += (Math.min(inn, g4) - g3)* t3;
        }
        if(inn>g4){
            skatt += (Math.min(inn, g5) - g4)* t4;
        }
        if(inn>g5){
            skatt += (inn - g5)* t5;
        }         
        System.out.printf("Du skatter %.2f,- kr%n",skatt);

     scanner.close();
    }
}
