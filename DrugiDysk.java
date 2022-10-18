import java.util.Scanner;

public class DrugiDysk extends Dekorator{
    PC pc;
    public DrugiDysk(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = new String();
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz drugi dysk: \n 1 - SSD 1TB \n 2 - HDD 1TB \n 3 - HDD 2TB \n 4 - HDD 4TB \n");
        wybor = wyborS.nextLine();
        switch (wybor){
            case "1":
                zrobiony = "-drugi dysk SSD 1TB";
                break;
            case "2":
                zrobiony = "-drugi dysk HDD 1TB";
                break;
            case "3":
                zrobiony = "-drugi dysk HDD 2TB";
                break;
            case "4":
                zrobiony = "-drugi dysk HDD 4TB";
                break;
            default:
                zrobiony = "-drugi dysk SSD 1TB";
                break;
        }
        return pc.about() + zrobiony + "\n";
    }
}
