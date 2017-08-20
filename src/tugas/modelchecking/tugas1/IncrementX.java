package tugas.modelchecking.tugas1;

public class IncrementX implements Runnable {
    @Override
    public void run() {
        try{
            while (true){
                if (ChangeX.getX() < 200)
                    ChangeX.setX(ChangeX.getX() + 1);
            }
        } catch (Exception e) {

        }
    }
}
