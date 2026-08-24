void main() {
    Inventory inventory = new Inventory();
    Inventory.InventoryStats inventoryStats = new Inventory.InventoryStats();
    Item item = new Item();

    inventory.createItem("Свиток", 1, ItemRare.LEGENDARY, ItemType.SCROLL);
    inventory.createItem("Меч", 15, ItemRare.RARE, ItemType.WEAPON);
    inventory.createItem("Броня", 30, ItemRare.RARE, ItemType.ARMOR);
    inventory.createItem("Зелье", 3, ItemRare.COMMON, ItemType.POTION);
    inventory.createItem("Неизвестное зелье", 5, ItemRare.LEGENDARY, ItemType.POTION);

    System.out.println(inventory.toString());
    inventoryStats.getAllItems(inventory.items);
    inventoryStats.getWeightAllItem(inventory.items);
}