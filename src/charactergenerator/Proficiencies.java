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
public class Proficiencies {
    ArrayList<String> weapons = new ArrayList<String>();
    ArrayList<String> armors = new ArrayList<String>();
    ArrayList<String> tools = new ArrayList<String>();
    
    
    public void addWeapon(String weapon){
        if (weapon.contains("Martial")){
            ArrayList<String> weaponList = new ArrayList<String>();
            if (weapon.contains("Melee")){
                weaponList.add("Battleaxe");
                weaponList.add("Flail");
                weaponList.add("Glaive");
                weaponList.add("Greataxe");
                weaponList.add("Greatsword");
                weaponList.add("Halberd");
                weaponList.add("Lance");
                weaponList.add("Longsword");
                weaponList.add("Maul");
                weaponList.add("Morningstar");
                weaponList.add("Pike");
                weaponList.add("Rapier");
                weaponList.add("Scimitar");
                weaponList.add("Shortsword");
                weaponList.add("Trident");
                weaponList.add("War Pick");
                weaponList.add("Warhammer");
                weaponList.add("Whip");
            }
            else if (weapon.contains("Range")){
                weaponList.add("Blowgun");
                weaponList.add("Hand Crossbow");
                weaponList.add("Heavy Crossbow");
                weaponList.add("Longbow");
                weaponList.add("Net");
            }
            else{
                weaponList.add("Battleaxe");
                weaponList.add("Flail");
                weaponList.add("Glaive");
                weaponList.add("Greataxe");
                weaponList.add("Greatsword");
                weaponList.add("Halberd");
                weaponList.add("Lance");
                weaponList.add("Longsword");
                weaponList.add("Maul");
                weaponList.add("Morningstar");
                weaponList.add("Pike");
                weaponList.add("Rapier");
                weaponList.add("Scimitar");
                weaponList.add("Shortsword");
                weaponList.add("Trident");
                weaponList.add("War Pick");
                weaponList.add("Warhammer");
                weaponList.add("Whip");
                weaponList.add("Blowgun");
                weaponList.add("Hand Crossbow");
                weaponList.add("Heavy Crossbow");
                weaponList.add("Longbow");
                weaponList.add("Net");
            }
            for (int i = 0; i < weaponList.size(); i++){
                if (!weapons.contains(weapon)){
                    weapons.add(weapon);
                }
            }
        }
        else if (weapon.contains("Simple")){
            ArrayList<String> weaponList = new ArrayList<String>();
            if (weapon.contains("Melee")){
                weaponList.add("Club");
                weaponList.add("Dagger");
                weaponList.add("Greatclub");
                weaponList.add("Handaxe");
                weaponList.add("Javelin");
                weaponList.add("Light Hammer");
                weaponList.add("Mace");
                weaponList.add("Quarterstaff");
                weaponList.add("Sickle");
                weaponList.add("Spear");
                weaponList.add("Unarmed Strike");
            }
            else if (weapon.contains("Range")){
                weaponList.add("Light Crossbow");
                weaponList.add("Dart");
                weaponList.add("Shortbow");
                weaponList.add("Sling");
            }
            else{
                weaponList.add("Club");
                weaponList.add("Dagger");
                weaponList.add("Greatclub");
                weaponList.add("Handaxe");
                weaponList.add("Javelin");
                weaponList.add("Light Hammer");
                weaponList.add("Mace");
                weaponList.add("Quarterstaff");
                weaponList.add("Sickle");
                weaponList.add("Spear");
                weaponList.add("Unarmed Strike");
                weaponList.add("Light Crossbow");
                weaponList.add("Dart");
                weaponList.add("Shortbow");
                weaponList.add("Sling");
            }
            for (int i = 0; i < weaponList.size(); i++){
                if (!weapons.contains(weapon)){
                    weapons.add(weapon);
                }
            }
        }
        else if (!weapons.contains(weapon)){
            weapons.add(weapon);
        }
    }
    
    public void addArmor(String armor){
        if (!armors.contains(armor)){
            armors.add(armor);
        }
    }
    
    public void addTool(String tool){
        if (!tools.contains(tool)){
            tools.add(tool);
        }
    }
    
    public void printProf(){
        System.out.println("Weapon Proficiencies: " + weapons);
        System.out.println("Armor Proficiencies: " + armors);
        System.out.println("Tool Proficiencies: " + tools);
    }
}
