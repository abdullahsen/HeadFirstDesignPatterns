package strategy.duck;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
