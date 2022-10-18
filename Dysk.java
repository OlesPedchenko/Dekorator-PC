import java.util.Scanner;

public class Dysk extends Dekorator{
    PC pc;
    public Dysk(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = new String();
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz dysk: \n 1 - SSD 250GB \n 2 - SSD 500GB \n 3 - SSD 1TB \n 4 - SSD 2TB \n");
        wybor = wyborS.nextLine();
        switch (wybor){
            case "1":
                zrobiony = "-dysk SSD 250GB";
                break;
            case "2":
                zrobiony = "-dysk SSD 500GB";
                break;
            case "3":
                zrobiony = "-dysk SSD 1TB";
                break;
            case "4":
                zrobiony = "-dysk SSD 2TB";
                break;
            default:
                zrobiony = "-dysk SSD 250GB";
                break;
        }
        return pc.about() + zrobiony + "\n";
    }
}
