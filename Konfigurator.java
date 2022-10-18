public class Konfigurator {
    public static void main(String[]args){
        PC komp = new PC();
        komp = new Processor(komp);
        komp = new Obudowa(komp);
        komp = new KartaGraficzna(komp);
        komp = new Zasilacz(komp);
        komp = new DrugiDysk(komp);
        komp = new Dysk(komp);
        komp = new RAM(komp);
        komp = new Chlodzenie(komp);
        komp = new PlytaGlowna(komp);
        System.out.println(komp.about());
    }
}
