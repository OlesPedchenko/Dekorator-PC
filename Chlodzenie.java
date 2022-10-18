import java.util.Scanner;

public class Chlodzenie extends Dekorator{
    PC pc;
    public Chlodzenie(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = new String();
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz chodzenie: \n 1 - Spartan 5 120mm \n 2 - Fera 5 120mm \n 3 - Navis F240 \n 4 - MasterLiquid ML240L RGB \n 5 - Pure Loop 240mm \n");
        wybor = wyborS.nextLine();
        switch (wybor){
            case "1":
                zrobiony = "-chodzenie Spartan 5 120mm";
                break;
            case "2":
                zrobiony = "-chodzenie Fera 5 120mm";
                break;
            case "3":
                zrobiony = "-chodzenie Navis F240";
                break;
            case "4":
                zrobiony = "-chodzenie MasterLiquid ML240L RGB";
                break;
            case "5":
                zrobiony = "-chodzenie Pure Loop 240mm";
                break;
            default:
                zrobiony = "-chodzenie Spartan 5 120mm";
                break;
        }
        return pc.about() + zrobiony + "\n";
    }
}
