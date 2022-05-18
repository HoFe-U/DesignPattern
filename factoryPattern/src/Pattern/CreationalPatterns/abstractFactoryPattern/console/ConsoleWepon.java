package Pattern.CreationalPatterns.abstractFactoryPattern.console;

import Pattern.CreationalPatterns.abstractFactoryPattern.item.Item;

public class
ConsoleWepon implements Item {
    @Override
    public void attack() {
        System.out.println("무기로 공격");
    }
}
