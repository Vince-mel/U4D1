import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Inserisci 3 stringhe consecutive premendo invio");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        System.out.println("Le stringhe in ordine di inserimento sono: " + str1 + " " + str2 + " " + str3);
        System.out.println("Le stringhe in ordine inverso: " + str3 + " " + str2 + " " + str1);
    }


}

