import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuOptie {


    public void Werknemerinklokken() {
        // Werknemer object = new Werknemer("Josef",108,8888);
        //object.werknemertesttoevoegen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer je naam in");
        String naam = scanner.nextLine();
        System.out.println("Voer je de eerste vier cijfers van je geboortedatum in");
        int antwoord = scanner.nextInt();
        System.out.println("Voer je viercijferige code in");
        int geboorte = scanner.nextInt();
        boolean check = false;
        for (Werknemer i : Werknemer.werknemers) {
            if (i.getNaam().equals(naam) && i.getGeboortedatumcode() == geboorte && i.getCode() == antwoord) {
                check = true;
                System.out.println("Welkom je bent succesvol ingeklokt. Werkze!");
            }
        else{
            System.out.println("Sorry");
        }
    }

}



    public void werknemerToevoegen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer naam in");
        String naam = scanner.nextLine();
        System.out.println("Voer eerste 4 cijfers van geboortedatum");
        int geboorte = scanner.nextInt();
        Werknemer nieuweWerknemer = new Werknemer(naam,geboorte,Werknemer.getCode());
        Werknemer.werknemers.add(nieuweWerknemer);
        System.out.println(Werknemer.werknemers);
        Menu();
    }
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer 1 in voor werknemertoevoegen");
        int antwoord = scanner.nextInt();
        if(antwoord == 1){
            Werknemerinklokken();
        }
        if(antwoord == 2 ){
            werknemerToevoegen();
        }

    }

}


