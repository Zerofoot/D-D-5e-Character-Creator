/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.util.ArrayList;

/**
 *
 * @author Grant
 */
public class GearPack extends Item{
    
    ArrayList<Item> items = new ArrayList<Item>();
    ArrayList<String> itemCountUnit = new ArrayList<String>();
    ArrayList<Integer> itemCount = new ArrayList<Integer>();
    GearPack(String name, String description){
        super(name, description);
        addPackItems(name);
    }

    private void addPackItems(String name) {
        if (name.contains("Burglar")){
            Item item = new Item("Backpack", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Ball bearing", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1000);
            item = new Item("String", "other");
            items.add(item);
            itemCountUnit.add("feet");
            itemCount.add(10);
            item = new Item("Bell", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Candle", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(5);
            item = new Item("Crowbar", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Hammer", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Pitons", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(10);
            item = new Item("Hooded lantern", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Oil", "other");
            items.add(item);
            itemCountUnit.add("flasks");
            itemCount.add(1);
            item = new Item("Rations", "other");
            items.add(item);
            itemCountUnit.add("days");
            itemCount.add(5);
            item = new Item("Tinderbox", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Waterskin", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Hempen rope", "other");
            items.add(item);
            itemCountUnit.add("feet");
            itemCount.add(50);
        }
        else if (name.contains("Diplomat")){
            Item item = new Item("Chest", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Case", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(2);
            item = new Item("Fine clothes", "wearable");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Ink", "other");
            items.add(item);
            itemCountUnit.add("bottle");
            itemCount.add(1);
            item = new Item("Ink pen", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Lamp", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Oil", "other");
            items.add(item);
            itemCountUnit.add("flasks");
            itemCount.add(1);
            item = new Item("Paper", "other");
            items.add(item);
            itemCountUnit.add("sheets");
            itemCount.add(5);
            item = new Item("Perfume", "other");
            items.add(item);
            itemCountUnit.add("vial");
            itemCount.add(1);
            item = new Item("Sealing wax", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Soap", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
        }
        else if (name.contains("Dungeoneer")){
            Item item = new Item("Backpack", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Crowbar", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Hammer", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Pitons", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(10);
            item = new Item("Torch", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(10);
            item = new Item("Tinderbox", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Rations", "other");
            items.add(item);
            itemCountUnit.add("days");
            itemCount.add(10);
            item = new Item("Waterskin", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Hempen rope", "other");
            items.add(item);
            itemCountUnit.add("feet");
            itemCount.add(50);
        }
        else if (name.contains("Entertainer")){
            Item item = new Item("Backpack", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Bedroll", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Costume", "wearable");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(2);
            item = new Item("Candle", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(5);
            item = new Item("Rations", "other");
            items.add(item);
            itemCountUnit.add("days");
            itemCount.add(5);
            item = new Item("Waterskin", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Disguise kit", "tool");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
        }
        else if (name.contains("Explorer")){
            Item item = new Item("Backpack", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Bedroll", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Mess kit", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(2);
            item = new Item("Tinderbox", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Torch", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(10);
            item = new Item("Rations", "other");
            items.add(item);
            itemCountUnit.add("days");
            itemCount.add(10);
            item = new Item("Waterskin", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Hempen rope", "other");
            items.add(item);
            itemCountUnit.add("feet");
            itemCount.add(50);
        }
        else if (name.contains("Priest")){
            Item item = new Item("Backpack", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Blanket", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Candle", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(10);
            item = new Item("Tinderbox", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Alms box", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Incense", "other");
            items.add(item);
            itemCountUnit.add("blocks");
            itemCount.add(2);
            item = new Item("Censer", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Vestments", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Rations", "other");
            items.add(item);
            itemCountUnit.add("days");
            itemCount.add(2);
            item = new Item("Waterskin", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
        }
        else if (name.contains("Scholar")){
            Item item = new Item("Backpack", "container");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Book of lore", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Ink", "other");
            items.add(item);
            itemCountUnit.add("bottles");
            itemCount.add(1);
            item = new Item("Ink pen", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Parchment", "other");
            items.add(item);
            itemCountUnit.add("sheets");
            itemCount.add(10);
            item = new Item("Bag of sand", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
            item = new Item("Small knife", "other");
            items.add(item);
            itemCountUnit.add("");
            itemCount.add(1);
        }
    }
}
