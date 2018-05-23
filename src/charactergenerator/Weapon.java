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
public class Weapon extends Item{
    
    Weapon(String name, String description){
        super(name, description);
        String newName;
        if (name.contains("Any")){
            if (description.equals("martial melee")){
                newName = chooseMartialMelee();
                this.name = newName;
            }
            else if (description.equals("simple melee")){
                newName = chooseSimpleMelee();
                this.name = newName;
            }   
        }
        
        
    }

    private String chooseMartialMelee() {
        ArrayList<String> martialMeleeWeapons = new ArrayList<String>();
        martialMeleeWeapons.add("Battleaxe");
        martialMeleeWeapons.add("Flail");
        martialMeleeWeapons.add("Glaive");
        martialMeleeWeapons.add("Greataxe");
        martialMeleeWeapons.add("Greatsword");
        martialMeleeWeapons.add("Halberd");
        martialMeleeWeapons.add("Lance");
        martialMeleeWeapons.add("Longsword");
        martialMeleeWeapons.add("Maul");
        martialMeleeWeapons.add("Morningstar");
        martialMeleeWeapons.add("Pike");
        martialMeleeWeapons.add("Rapier");
        martialMeleeWeapons.add("Scimitar");
        martialMeleeWeapons.add("Shortsword");
        martialMeleeWeapons.add("Trident");
        martialMeleeWeapons.add("War Pick");
        martialMeleeWeapons.add("Warhammer");
        martialMeleeWeapons.add("Whip");
        
        int choice = (int) (Math.random()*martialMeleeWeapons.size());
        
        return martialMeleeWeapons.get(choice);
    }

    private String chooseSimpleMelee() {
        ArrayList<String> simpleMeleeWeapons = new ArrayList<String>();
        simpleMeleeWeapons.add("Club");
        simpleMeleeWeapons.add("Dagger");
        simpleMeleeWeapons.add("Greatclub");
        simpleMeleeWeapons.add("Handaxe");
        simpleMeleeWeapons.add("Javelin");
        simpleMeleeWeapons.add("Light Hammer");
        simpleMeleeWeapons.add("Mace");
        simpleMeleeWeapons.add("Quarterstaff");
        simpleMeleeWeapons.add("Sickle");
        simpleMeleeWeapons.add("Spear");
        
        int choice = (int) (Math.random()*simpleMeleeWeapons.size());
        
        return simpleMeleeWeapons.get(choice);
    }
}
