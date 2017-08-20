package tugas.modelchecking.tugas1;

public class Main {
    public static void main(String[] args) {
        ChangeX.setX(0);
        Thread inc = new Thread(new IncrementX());
        inc.start();
        Thread dec = new Thread(new DecrementX());
        dec.start();
        Thread reset = new Thread(new ResetX());
        reset.start();
    }
}
