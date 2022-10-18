import java.util.Scanner;

public class Obudowa extends Dekorator{
    PC pc;
    public Obudowa(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = new String();
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz obudowe: \n 1 - KRUX Astral \n 2 - Signum 300 Solid \n 3 - Krux Orio \n 4 - Signum 300 Air \n 5 - Signum SG1X TG RGB \n");
        wybor = wyborS.nextLine();
        switch (wybor){
            case "1":
                zrobiony = "-obudowa KRUX Astral";
                break;
            case "2":
                zrobiony = "-obudowa Signum 300 Solid";
                break;
            case "3":
                zrobiony = "-obudowa Krux Orio";
                break;
            case "4":
                zrobiony = "-obudowa Signum 300 Air";
                break;
            case "5":
                zrobiony = "-obudowa Signum SG1X TG RGB";
                break;
            default:
                zrobiony = "-obudowa KRUX Astral";
                break;
        }
        return pc.about() + zrobiony + "\n";
    }
}
