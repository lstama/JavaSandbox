package tugas.modelchecking.tugas1;

public class ChangeX {
    private static int x;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        ChangeX.x = x;
        printX();
    }

    private static void printX(){
        System.out.println(ChangeX.x);
    }
}
