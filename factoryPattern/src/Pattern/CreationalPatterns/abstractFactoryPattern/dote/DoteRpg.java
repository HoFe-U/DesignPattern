package Pattern.CreationalPatterns.abstractFactoryPattern.dote;

import Pattern.CreationalPatterns.abstractFactoryPattern.item.Item;
import Pattern.CreationalPatterns.abstractFactoryPattern.Rpg;

public class DoteRpg implements Rpg {
    @Override
    public Item creationItem() {
        return new DoteWepon();
    }
}
