import java.util.Scanner;

public class Histogram_test {

    public static void main(String[] args) {

        Object object = new Object();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Set image size: n (#rows), m(#kolumns)");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Obraz obraz_1 = new Obraz(n, m);

        System.out.println("Set number of threads");
        int num_threads = scanner.nextInt();

        Watek[] NewThr = new Watek[num_threads];

        for (int i = 0; i < num_threads; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            (NewThr[i] = new Watek(i,obraz_1)).start();
        }

        for (int i = 0; i < num_threads; i++) {
            try {
                NewThr[i].join();
            } catch (InterruptedException e) {}
        }

    }
}
