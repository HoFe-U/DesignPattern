package Pattern.CreationalPatterns.abstractFactoryPattern.console;

import Pattern.CreationalPatterns.abstractFactoryPattern.item.Item;
import Pattern.CreationalPatterns.abstractFactoryPattern.Rpg;

public class ConsoleRpg implements Rpg {

    @Override
    public Item creationItem() {
        return new ConsoleWepon();
    }
}
