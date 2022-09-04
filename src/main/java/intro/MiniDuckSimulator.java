package intro;

import intro.duck.Duck;
import intro.duck.MallardDuck;
import intro.duck.ModelDuck;
import intro.fly.FlyRockerPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRockerPowered());
        model.performFly();
    }
}
