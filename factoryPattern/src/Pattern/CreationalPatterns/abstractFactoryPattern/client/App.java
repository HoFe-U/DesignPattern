package Pattern.CreationalPatterns.abstractFactoryPattern.client;

import Pattern.CreationalPatterns.abstractFactoryPattern.Rpg;
import Pattern.CreationalPatterns.abstractFactoryPattern.item.Item;

public class App {
    private Item item;

    public App(Rpg rpg) {
        item = rpg.creationItem();
    }

    public void attack(){
        item.attack();
    }
}
