package intro.duck;

import intro.fly.FlyNoWay;
import intro.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am model duck");
    }
}
