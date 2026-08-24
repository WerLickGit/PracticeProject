public class Item {
    private ItemRare itemRare;
    private ItemType itemType;
    private String name;
    private int weight = 0;

    public Item(String name, int weight, ItemRare itemRare, ItemType itemType) {
        this.itemRare = itemRare;
        this.itemType = itemType;
        this.name = name;
        this.weight = weight;
    }

    public Item() {

    }

    public ItemRare getItemRare() {
        return itemRare;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Предмет " + getName() + ": редкость - " + getItemRare() + ", тип предмета - " + getItemType() + ".\n";
    }
}
