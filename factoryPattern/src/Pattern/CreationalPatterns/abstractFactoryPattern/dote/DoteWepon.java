package Pattern.CreationalPatterns.abstractFactoryPattern.dote;

import Pattern.CreationalPatterns.abstractFactoryPattern.item.Item;

public class DoteWepon implements Item {
    @Override
    public void attack() {
        System.out.println("도트무기로 공격");
    }
}
