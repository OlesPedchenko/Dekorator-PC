import java.util.Scanner;

public class PlytaGlowna extends Dekorator{
    PC pc;
    public PlytaGlowna(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = new String();
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz plyte glowna: \n 1 - MSI B550M PRO \n 2 - MSI B550M PRO Wi-Fi USB \n 3 - ASUS PRIME B550M-A WIFI II Wi-Fi + Bluetooth \n 4 - ASUS TUF GAMING X570-PLUS (Wi-Fi) \n");
        wybor = wyborS.nextLine();
        switch (wybor){
            case "1":
                zrobiony = "-plyta glowna MSI B550M PRO";
                break;
            case "2":
                zrobiony = "-plyta glowna MSI B550M PRO Wi-Fi USB";
                break;
            case "3":
                zrobiony = "-plyta glowna ASUS PRIME B550M-A WIFI II Wi-Fi + Bluetooth";
                break;
            case "4":
                zrobiony = "-plyta glowna ASUS TUF GAMING X570-PLUS (Wi-Fi)";
                break;
            default:
                zrobiony = "-plyta glowna MSI B550M PRO";
                break;
        }
        return pc.about() + zrobiony + "\n";
    }
}

