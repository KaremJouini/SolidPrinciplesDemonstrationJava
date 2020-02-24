import java.util.ArrayList;
import java.util.List;

public class Pool
{
    public void run()
    {
        IDuck donaldDuck = new Duck();
        IDuck electricDuck = new ElectronicDuck();
        List<IDuck> ducks = new ArrayList<IDuck>();
        ducks.add(donaldDuck);
        ducks.add(electricDuck);
        quack1(ducks);
        swim1(ducks);
    }

    private void quack1(List<IDuck> ducks) {
        for (IDuck duck : ducks) {
            duck.quack();
        }
    }
    private void swim1(List<IDuck> ducks){
        for (IDuck duck : ducks) {
            duck.swim();
        }
    }



    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
