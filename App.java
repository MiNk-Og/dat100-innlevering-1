import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Eg skal sette opp 3 tall som du numerer i stigende rekkefølge");
            
            System.out.println("Kva er det første tallet?: ");
            int tall1 = scanner.nextInt();
            
            System.out.println("Tall nummer 2: ");
            int tall2 = scanner.nextInt();
            
            System.out.println("Tall nummer 3");
            int tall3 = scanner.nextInt();

            if (tall1 <= tall2 && tall1 <= tall3 && tall2 <= tall3){
                System.out.println(tall1 +","+ tall2 +","+ tall3);

            } else if (tall2 <= tall1 && tall3<= tall2 && tall3 <=tall1 ){
                System.out.println(tall3 + "," + tall2 + ","+ tall1);

            } else if (tall2 <= tall1 && tall2<= tall3 && tall3 <=tall1 ){
                System.out.println(tall2 + "," + tall3 + ","+ tall1);
                
            } else if (tall2 <= tall1 && tall2 <= tall3 && tall1 <= tall3){
                System.out.println(tall2 + ","+ tall1 +"," + tall3);

            } else if (tall1 <= tall2 && tall1 <= tall3 && tall3<= tall2){
                System.out.println(tall1 + ","+ tall3 +"," + tall2);

            }
            
                else{
                System.out.println(tall3 + ","+ tall1 +"," + tall2);
            
            }
            scanner.close();
    }
}
