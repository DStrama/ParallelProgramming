public class Watek extends Thread {

    private Obraz obrazWatek;
    private int znak = 0;


    public Watek( int znak,Obraz obrazWatek) {
        this.obrazWatek = obrazWatek;
        this.znak = znak;
    }

    @Override
    public void run(){
        obrazWatek.calculate_histogram(znak);
        obrazWatek.print_histogram(znak);

    }
}
