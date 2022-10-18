import java.util.Scanner;

public class Zasilacz extends Dekorator{
    PC pc;
    public Zasilacz(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = new String();
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz zasilacz: \n 1 - 450W 80 Plus \n 2 - 500W 80 Plus Bronze \n 3 - 600W 80 Plus Bronze \n 4 - 750W 80 Plus Gold \n 5 - 1000W 80 Plus Gold \n");
        wybor = wyborS.nextLine();
        switch (wybor){
            case "1":
                zrobiony = "-zasilacz 450W 80 Plus";
                break;
            case "2":
                zrobiony = "-zasilacz 500W 80 Plus Bronze";
                break;
            case "3":
                zrobiony = "-600W 80 Plus Bronze";
                break;
            case "4":
                zrobiony = "-750W 80 Plus Gold";
                break;
            case "5":
                zrobiony = "-zasilacz 1000W 80 Plus Gold";
                break;
            default:
                zrobiony = "-zasilacz 450W 80 Plus";
                break;
        }
        return pc.about() + zrobiony + "\n";
    }
}
