/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Grant
 */
public class Equipment {

    Map<Item,Integer> items=new HashMap<Item,Integer>();
    int gold = 0;
    
    public void addEquipment(Item item){
        if (items.containsKey(item)){
            int count = items.get(item);
            items.remove(item);
            items.put(item, count+1);
        }
        else {
            items.put(item, 1);
        }
    }

    void addEquipment(Item item, int i) {
        if (items.containsKey(item)){
            int count = items.get(item);
            items.remove(item);
            items.put(item, count+i);
        }
        else {
            items.put(item, i);
        }
    }
    
    void addEquipment(String item){
        
    }

    void addGold(int gp) {
        gold += gp;
    }
    
    void printEquipment() {
        Iterator it = items.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Item item = (Item) pair.getKey();
            System.out.println(pair.getValue() + " " + item.name);
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
