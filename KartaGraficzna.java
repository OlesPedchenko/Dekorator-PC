import java.util.Scanner;

public class KartaGraficzna extends Dekorator{
    PC pc;
    public KartaGraficzna(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = new String();
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz karte graficzna: \n 1 - GeForce GTX 1050Ti \n 2 - GeForce GTX 3060Ti \n 3 - GeForce GTX 3070Ti \n 4 - GeForce GTX 3080Ti \n 5 - GeForce GTX 3090Ti \n");
        wybor = wyborS.nextLine();
        switch (wybor){
            case "1":
                zrobiony = "-karta graficzna GeForce GTX 1050Ti";
                break;
            case "2":
                zrobiony = "-karta graficzna GeForce GTX 3060Ti";
                break;
            case "3":
                zrobiony = "-karta graficzna GeForce GTX 3070Ti";
                break;
            case "4":
                zrobiony = "-karta graficzna GeForce GTX 3080Ti";
                break;
            case "5":
                zrobiony = "-karta graficzna GeForce GTX 3090Ti";
                break;
            default:
                zrobiony = "-karta graficzna GeForce GTX 1050Ti";
                break;
        }
        return pc.about() + zrobiony + "\n";
    }
}
