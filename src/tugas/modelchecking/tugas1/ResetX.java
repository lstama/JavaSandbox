package tugas.modelchecking.tugas1;

public class ResetX extends ChangeX implements Runnable {
    @Override
    public void run() {
        try{
            while (true){
                if (getX() == 200)
                    setX(0);
            }
        } catch (Exception e) {

        }
    }
}
