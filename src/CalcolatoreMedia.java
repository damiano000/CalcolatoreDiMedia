import java.util.Scanner;

public class CalcolatoreMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calcolo della media");
        System.out.print("Quanti numeri vuoi inserire? ");
        int numeroElementi = scanner.nextInt();
        
        int[] numeri = new int[numeroElementi];
        for (int i = 0; i < numeroElementi; i++) {
            System.out.print("Inserisci il numero " + (i+1) + ": ");
            numeri[i] = scanner.nextInt();
        }
        
        double media = calcolaMedia(numeri);
        System.out.println("La media dei numeri inseriti è: " + media);
        
        scanner.close();
    }
    
    public static double calcolaMedia(int[] numeri) {
        int somma = 0;
        for (int numero : numeri) {
            somma += numero;
        }
        return (double) somma / numeri.length;
    }
}
