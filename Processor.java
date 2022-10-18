import java.util.Scanner;
public class Processor extends Dekorator{
    PC pc;
    public Processor(PC pc) {
        this.pc = pc;
    }
    public String about() {
        String zrobiony = new String();
        String wybor = new String();
        Scanner wyborS = new Scanner(System.in);
        System.out.println("Wybierz procesor: \n 1 - intel i3 \n 2 - intel i5 \n 3 - intel i7 \n 4 - intel i9 \n 5 - intel pentium \n");
            wybor = wyborS.nextLine();
            switch (wybor) {
                case "1":
                    zrobiony = "-procesor intel i3";
                    break;
                case "2":
                    zrobiony = "-procesor intel i5";
                    break;
                case "3":
                    zrobiony = "-procesor intel i7";
                    break;
                case "4":
                    zrobiony = "-procesor intel i9";
                    break;
                case "5":
                    zrobiony = "-procesor intel pentium";
                    break;
                default:
                    zrobiony = "-procesor intel i3";
                    break;
            }
            return pc.about() + zrobiony + "\n";
        }

    }



