import java.util.Scanner;

public class RAM extends Dekorator{
    PC pc;
    public RAM(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = "1";
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz pamiec RAM: \n 1 - 8GB \n 2 - 16GB \n 3 - 32GB \n 4 - 64GB \n 5 - 64GB RGB \n");
        wybor = wyborS.nextLine();
        switch (wybor) {
            case "1":
                zrobiony = "-pamiec RAM 8GB";
                break;
            case "2":
                zrobiony = "-pamiec RAM 16GB";
                break;
            case "3":
                zrobiony = "-pamiec RAM 32GB";
                break;
            case "4":
                zrobiony = "-pamiec RAM 64GB";
                break;
            case "5":
                zrobiony = "-pamiec RAM 64 GB RGB";
                break;
            default:
                zrobiony = "-pamiec RAM 8GB";
                break;
        }
        return pc.about() + zrobiony + "\n";
    }
}
