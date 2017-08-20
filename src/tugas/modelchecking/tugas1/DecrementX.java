package tugas.modelchecking.tugas1;

public class DecrementX implements Runnable{
    @Override
    public void run() {
        try{
            while (true){
                if (ChangeX.getX() > 0)
                    ChangeX.setX(ChangeX.getX() - 1);
            }
        } catch (Exception e) {

        }
    }
}
