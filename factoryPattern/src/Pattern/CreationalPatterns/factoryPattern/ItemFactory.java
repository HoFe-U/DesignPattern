package Pattern.CreationalPatterns.factoryPattern;

public class ItemFactory {
    public static ItemFactory itemFactory = new ItemFactory();

    private ItemFactory() {
    }

    public Item getItem(String itemType, String type, String name){
        if("Armor".equalsIgnoreCase(itemType)){
            return new Armor(name,type);
        }else if("Wepon".equalsIgnoreCase(itemType)){
            return new Wepon(name,type);
        } else if ("LiquidMedicine".equalsIgnoreCase(itemType)) {
            return new LiquidMedicine(name, type);
        }
        return null;
    }
}
