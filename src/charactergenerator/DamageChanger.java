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
public class DamageChanger {
    ArrayList<String> types = new ArrayList<String>();
    ArrayList<String> changers = new ArrayList<String>();
    
    DamageChanger(){
        types.add("Acid");
        types.add("Bludgeoning (non-magical)");
        types.add("Bludgeoning (magical)");
        types.add("Cold");
        types.add("Fire");
        types.add("Force");
        types.add("Lightning");
        types.add("Necrotic");
        types.add("Piercing (non-magical)");
        types.add("Piercing (magical)");
        types.add("Poison");
        types.add("Psychic");
        types.add("Radiant");
        types.add("Slashing (non-magical)");
        types.add("Slashing (magical)");
        types.add("Thunder");
        
        for (int i = 0; i < types.size(); i++){
            changers.add("normal");
        }
    }
    
    public void changeType(String type, String value){
        int index = types.indexOf(type);
        if (index < types.size()){
            changers.set(index, value);
        }
    }

    void printChanges() {
        for (int i = 0; i < types.size(); i++){
            if (!changers.get(i).equals("normal")){
                System.out.println(types.get(i) + ": " + changers.get(i));
            }
        }
    }
}