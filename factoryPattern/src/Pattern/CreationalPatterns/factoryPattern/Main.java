package Pattern.CreationalPatterns.factoryPattern;

public class Main {
    public static void main(String[] args) {
        ItemFactory.itemFactory.getItem("armor", "방패", "세완").use();
        ItemFactory.itemFactory.getItem("wepon","창","고양이").use();
        ItemFactory.itemFactory.getItem("LiquidMedicine","물약","회복물략").use();

    }
}
