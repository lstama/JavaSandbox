package tugas.modelchecking.tugas1;

public class IncrementX extends ChangeX implements Runnable {
    @Override
    public void run() {
        try{
            while (true){
                if (getX() < 200)
                setX(getX() + 1);
            }
        } catch (Exception e) {

        }
    }
}
