
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        String nimi;
        int pituus;
        TelevisioOhjelma ohjelma;
        while (true) {
            System.out.print("Nimi: ");
            nimi = lukija.nextLine();
            if(nimi.equals("")){
                break;
            }
            pituus = Integer.valueOf(lukija.nextLine());
            ohjelma = new TelevisioOhjelma(nimi, pituus);
            ohjelmat.add(ohjelma);
        }
        
        System.out.println("");
        System.out.print("Ohjelman maksimipituus? ");
        pituus = Integer.valueOf(lukija.nextLine());
        for(TelevisioOhjelma tvOhjelma : ohjelmat){
            if(tvOhjelma.getPituus()==pituus){
                System.out.println(tvOhjelma);
            }
        }
    }
}
