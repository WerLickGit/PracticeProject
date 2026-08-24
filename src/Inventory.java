import java.util.Arrays;
public class Inventory {
    private Item item;
    Item[] items = new Item[10];
    public void addInventoryItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }
    public void createItem(String name, int weight, ItemRare itemRare, ItemType itemType) {
        Item item1 = new Item(name, weight, itemRare, itemType);
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item1;
                System.out.println("Предмет создан!");
                break;
            }
        }
    }
    @Override
    public String toString() {
        return Arrays.toString(items);
    }
    public static class InventoryStats {
        public void getAllItems(Item[] items) {
            int itemsCount = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null) {
                    itemsCount++;
                }
            }
            System.out.println("Всего предметов в инвентаре: " + itemsCount);
        }
        public void getWeightAllItem(Item[] items) {
            int totalWeight = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null) {
                    totalWeight += items[i].getWeight();
                }
            }
            System.out.println("Общий вес всех предметов: " + totalWeight);
        }
    }
}