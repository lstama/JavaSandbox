package tugas.modelchecking.tugas1;

public class DecrementX extends ChangeX implements Runnable{
    @Override
    public void run() {
        try{
            while (true){
                if (getX() > 0)
                    setX(getX() - 1);
            }
        } catch (Exception e) {

        }
    }
}
