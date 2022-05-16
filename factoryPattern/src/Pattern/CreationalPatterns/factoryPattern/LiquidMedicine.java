package Pattern.CreationalPatterns.factoryPattern;

public class LiquidMedicine implements Item{
    private String name;
    private String type;

    public LiquidMedicine(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("장비종류:"+type
                + "장비이름 :"+name);
    }
}
