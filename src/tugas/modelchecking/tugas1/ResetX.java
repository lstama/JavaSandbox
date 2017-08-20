package tugas.modelchecking.tugas1;

public class ResetX implements Runnable {
    @Override
    public void run() {
        try{
            while (true){
                if (ChangeX.getX() == 200)
                    ChangeX.setX(0);
            }
        } catch (Exception e) {

        }
    }
}
