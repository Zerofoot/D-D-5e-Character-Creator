/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Grant
 */
class DNDClass {
    String name;
    String subClassName;
    String subClass;
    int hitDiceCount;
    int hitDice;
    ArrayList<String> classAbilities = new ArrayList<String>();
    ArrayList<String> classAbilitiesDescriptions = new ArrayList<String>();

    DNDClass(DNDCharacter player) {
        chooseClass();
        increases(player);
    }
    
    private void chooseClass() {
        ArrayList<String> classes = getClasses();
        int classChoice = randomNumber(classes.size());
        String chosenClass = classes.get(classChoice);
        this.name = chosenClass;
        
        ArrayList<String> subClasses = getSubClasses();
        int subClassChoice = randomNumber(subClasses.size());
        String chosenSubClass = subClasses.get(subClassChoice);
        this.subClass = chosenSubClass;
    }
    
    private ArrayList<String> getClasses() {
        ArrayList<String> classes = new ArrayList<String>();
        
        //add classes here
        /*classes.add("Barbarian");
        classes.add("Bard");
        classes.add("Cleric");
        classes.add("Druid");
        classes.add("Fighter");
        classes.add("Monk");
        classes.add("Paladin");
        classes.add("Ranger");
        classes.add("Rogue");
        classes.add("Sorcerer");
        classes.add("Warlock");*/
        classes.add("Wizard");
        
        //return
        return classes;
    }
    
    private ArrayList<String> getSubClasses(){
        ArrayList<String> subClasses = new ArrayList<String>();
        
        //add classes here
        if (name.equals("Barbarian")){
            subClasses.add("Path of the Beserker");
            subClasses.add("Path of the Totem Warrior");
        }
        else if (name.equals("Bard")){
            subClasses.add("College of Lore");
            subClasses.add("College of Valor");
        }
        else if (name.equals("Cleric")){
            subClasses.add("Knowledge Domain");
            subClasses.add("Life Domain");
            subClasses.add("Light Domain");
            subClasses.add("Nature Domain");
            subClasses.add("Tempest Domain");
            subClasses.add("Trickery Domain");
            subClasses.add("War Domain");
        }
        else if (name.equals("Druid")){
            subClasses.add("Circle of the Land");
            subClasses.add("Circle of the Moon");
        }
        else if (name.equals("Fighter")){
            subClasses.add("Champion");
            subClasses.add("Battle Master");
            subClasses.add("Eldritch Knight");
        }
        else if (name.equals("Monk")){
            subClasses.add("Way of the Open Hand");
            subClasses.add("Way of Shadow");
            subClasses.add("Way of the Four Elements");
        }
        else if (name.equals("Paladin")){
            subClasses.add("Oath of Devotion");
            subClasses.add("Oath of the Ancients");
            subClasses.add("Oath of Vengeance");
        }
        else if (name.equals("Ranger")){
            subClasses.add("Beast Conclave");
            subClasses.add("Hunter Conclave");
            subClasses.add("Deep Stalker Conclave");
        }
        else if (name.equals("Rogue")){
            subClasses.add("Thief");
            subClasses.add("Assassin");
            subClasses.add("Arcane Trickster");
        }
        else if (name.equals("Sorcerer")){
            subClasses.add("Draconic Bloodline");
            subClasses.add("Wild Magic");
        }
        else if (name.equals("Warlock")){
            subClasses.add("The Archfey");
            subClasses.add("The Fiend");
            subClasses.add("The Great Old One");
        }
        else if (name.equals("Wizard")){
            subClasses.add("School of Abjuration");
            subClasses.add("School of Conjuration");
            subClasses.add("School of Divination");
            subClasses.add("School of Enchantment");
            subClasses.add("School of Evocation");
            subClasses.add("School of Illusion");
            subClasses.add("School of Necromancy");
            subClasses.add("School of Transmutation");
        }
        
        //return
        return subClasses;
    }
    
    private int randomNumber(int max){
        if (max > 0){
            Random randomGenerator = new Random();
            return randomGenerator.nextInt(max);
        }
        else{
            return 0;
        }
    }

    private void increases(DNDCharacter player) {
        int choiceCount = 0;
        ArrayList<String> skillChoice = new ArrayList<String>();
        int random;
        
        if (name.equals("Barbarian")){
            subClassName = "Primal Path";
            hitDiceCount = 1;
            hitDice = 12;
            player.hp += 12+player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            player.proficiencies.addArmor("Medium");
            player.proficiencies.addArmor("Shields");
            
            player.proficiencies.addWeapon("Simple Weapons");
            player.proficiencies.addWeapon("Martial Weapons");
            
            player.savingThrows.strProf = true;
            player.savingThrows.conProf = true;
            
            skillChoice.add("Animal Handling");
            skillChoice.add("Athletics");
            skillChoice.add("Intimidation");
            skillChoice.add("Nature");
            skillChoice.add("Perception");
            skillChoice.add("Survival");
            
            choiceCount = 2;
            
            classAbilities.add("Rage");
            classAbilitiesDescriptions.add("In battle, you fight with "
                    + "primal ferocity. On Your Turn, you can enter a rage as "
                    + "a Bonus Action.  "
                    + "While raging, you gain the following benefits if you "
                    + "aren't wearing heavy armor:"
                    + "You have advantage on Strength Checks and Strength "
                    + "saving throws."
                    + "When you make a melee weapon Attack using Strength, "
                    + "you gain a +2 bonus to the damage roll. This bonus "
                    + "increases as you level."
                    + "You have Resistance to bludgeoning, piercing, and "
                    + "slashing damage."
                    + "If you are able to cast Spells, you can't cast them "
                    + "or concentrate on them while raging."
                    + "Your rage lasts for 1 minute. It ends early if you "
                    + "are knocked Unconscious or if Your Turn ends and you "
                    + "haven't attacked a hostile creature since your last "
                    + "turn or taken damage since then. You can also end "
                    + "your rage on Your Turn as a Bonus Action."
                    + "Once you have raged the maximum number of times for "
                    + "your barbarian level, you must finish a Long Rest "
                    + "before you can rage again. You may rage 2 times at "
                    + "1st level, 3 at 3rd, 4 at 6th, 5 at 12th, and 6 at 17th.");
            
            classAbilities.add("Unarmored Defense");
            classAbilitiesDescriptions.add("While you are not wearing "
                    + "any armor, your Armor Class equals 10 + your Dexterity "
                    + "modifier + your Constitution modifier. You can use a "
                    + "Shield and still gain this benefit."
                    + "Once you have raged the maximum number of times for "
                    + "your barbarian level, you must finish a Long Rest "
                    + "before you can rage again. You may rage 2 times at "
                    + "1st level, 3 at 3rd, 4 at 6th, 5 at 12th, and 6 at 17th.");
            
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Greataxe", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            else {
                Weapon weapon = new Weapon("Any martial melee", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Handaxe", "simple melee");
                player.equipment.addEquipment(weapon);
            }
            else {
                Weapon weapon = new Weapon("Any simple melee", "simple melee");
                player.equipment.addEquipment(weapon);
            }
            Item item = new Item("Explorer's Pack", "pack");
            player.equipment.addEquipment(item);
            Weapon weapon = new Weapon("Javalin", "simple melee");
            player.equipment.addEquipment(weapon, 4);
        }
        else if (name.equals("Bard")){
            subClassName = "Bard College";
            hitDiceCount = 1;
            hitDice = 8;
            player.hp += 8 + player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            
            player.proficiencies.addWeapon("Simple Weapons");
            player.proficiencies.addWeapon("Hand Crossbows");
            player.proficiencies.addWeapon("Longswords");
            player.proficiencies.addWeapon("Rapiers");
            player.proficiencies.addWeapon("Shortswords");
            
            ArrayList<String> tools = new ArrayList<String>();
            tools.add("Bagpipes");
            tools.add("Drum");
            tools.add("Dulcimer");
            tools.add("Flute");
            tools.add("Lute");
            tools.add("Lyre");
            tools.add("Horn");
            tools.add("Pan Flute");
            tools.add("Shawm");
            tools.add("Viol");
            int toolChoices = 3;
            while (toolChoices>0){
                int randomNumber = randomNumber(tools.size());
                if (!player.proficiencies.tools.contains(tools.get(randomNumber))){
                    player.proficiencies.tools.add(tools.get(randomNumber));
                    toolChoices--;
                }
            }
            
            player.savingThrows.dexProf = true;
            player.savingThrows.chrProf = true;
            
            player.skillChoiceCount+=3;
            
            random = randomNumber(3);
            if (random == 0){
                Weapon weapon = new Weapon("Rapier", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            else if (random == 1){
                Weapon weapon = new Weapon("Longsword", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            else {
                Weapon weapon = new Weapon("Any simple melee", "simple melee");
                player.equipment.addEquipment(weapon);
            }
            
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Diplomat's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Entertainer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Lute", "musical instrument");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("any musical instrument", "musical instrument");
                player.equipment.addEquipment(item);
            }
            Wearable wearable = new Wearable("Leather Armor", "light armor");
            player.equipment.addEquipment(wearable);
            Weapon weapon = new Weapon("Dagger", "simple melee");
            player.equipment.addEquipment(weapon);
            
            player.spellbook.spellCastingAbility = "Charisma";
            player.spellbook.addSpells(this.name, this.subClass);
            
            classAbilities.add("Bardic Inspiration");
            classAbilitiesDescriptions.add("You can inspire others "
                    + "through stirring words or music. To do so, you use a "
                    + "bonus action on your turn to choose one creature other "
                    + "than yourself within 60 fee of you who can hear you. "
                    + "That creature gains one Bardic Inspiration die, a d6.  "
                    + "Once within the next 10 minutes, the creature can roll "
                    + "the die and add the number rolled to one ability "
                    + "check, attack roll, or saving throw it makes. The "
                    + "creature can wait until after it rolls the d20 before "
                    + "deciding to use the Bardic Inspiration die, but must "
                    + "decide before the GM says whether the roll succeeds "
                    + "or fails. Once the Bardic Inspiration die is rolled, "
                    + "it is lost. A creature can have only one Bardic "
                    + "Inspiration die at a time.  You can use this feature "
                    + "a number of times equal to your Charisma modifier "
                    + "(a minimum of once). You regain any expended uses "
                    + "when you finish a long rest.  Your Bardic Inspiration "
                    + "die changes when you reach certain levels in this "
                    + "class. The die becomes a d8 at 5th level, a d10 at "
                    + "10th level, and a d12 at 15th level.");
        }
        else if (name.equals("Cleric")){
            subClassName = "Divine Domain";
            hitDiceCount = 1;
            hitDice = 8;
            player.hp += 8 + player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            player.proficiencies.addArmor("Medium");
            player.proficiencies.addArmor("Shields");
            
            player.proficiencies.addWeapon("Simple Weapons");
            
            player.savingThrows.wisProf = true;
            player.savingThrows.chrProf = true;
            
            choiceCount = 2;
            
            skillChoice.add("History");
            skillChoice.add("Insight");
            skillChoice.add("Medicine");
            skillChoice.add("Persuasion");
            skillChoice.add("Religion");
            
            if (subClass.equals("Knowledge")){
                player.spellbook.addSpells(this.name, this.subClass);
                player.languagesChoices+=2;
                
                int specialSkillChoiceCount = 2;
                ArrayList<String> specialSkillChoice = new ArrayList<String>();
                specialSkillChoice.add("Arcana");
                specialSkillChoice.add("History");
                specialSkillChoice.add("Nature");
                specialSkillChoice.add("Religion");
                
                while (specialSkillChoiceCount > 0){
                    int choice = randomNumber(specialSkillChoice.size());
                    String skill = specialSkillChoice.get(choice);
                    for (int i = 0; i < player.skills.skills.size(); i++){
                        if (player.skills.skills.get(i).name.equals(skill)){
                            if (!player.skills.skills.get(i).prof){
                                player.skills.skills.get(i).prof = true;
                                player.skills.addSpecial("Blessings of Knowledge", skill, "Double proficiency bonus");
                                specialSkillChoiceCount--;
                            }
                        }
                    }
                }
            }
            else if (subClass.equals("Life")){
                player.spellbook.addSpells(this.name, this.subClass);
                player.proficiencies.addArmor("Heavy");
                
                classAbilities.add("Disciple of Life");
                classAbilitiesDescriptions.add("Also starting at 1st"
                        + " level, your healing spells are more effective. "
                        + "Whenever you use a spell of 1st level or higher "
                        + "to restore hit points to a creature, the creature "
                        + "regains additional hit points equal to 2 + the "
                        + "spell’s level.");
            }
            else if (subClass.equals("Light")){
                player.spellbook.addSpells(this.name, this.subClass);
                
                classAbilities.add("Warding Flare");
                classAbilitiesDescriptions.add("Also at 1st level, "
                        + "you can interpose divine light between yourself "
                        + "and an attacking enemy. When you are attacked by "
                        + "a creature within 30 feet of you that you can see, "
                        + "you can use your reaction to impose disadvantage "
                        + "on the attack roll, causing light to flare before "
                        + "the attacker before it hits or misses. An attacker "
                        + "that can’t be blinded is immune to this feature.  "
                        + "You can use this feature a number of times equal "
                        + "to your Wisdom modifier (a minimum of once). You "
                        + "regain all expended uses when you finish a long "
                        + "rest.");
            }
            else if (subClass.equals("Nature")){
                player.spellbook.addSpells(this.name, this.subClass);
                player.proficiencies.addArmor("Heavy");
            }
            else if (subClass.equals("Tempest")){
                player.spellbook.addSpells(this.name, this.subClass);
                player.proficiencies.addArmor("Heavy");
                player.proficiencies.addWeapon("Martial Weapons");
                
                classAbilities.add("Wrath of the Storm");
                classAbilitiesDescriptions.add("Also at 1st level, "
                        + "you can thunderously rebuke attackers. When a "
                        + "creature within 5 feet of you that you can see "
                        + "hits you with an attack, you can use your reaction"
                        + " to cause the creature to make a Dexterity saving "
                        + "throw. The creature takes 2d8 lightning or thunder "
                        + "damage (your choice) on a failed saving throw, "
                        + "and half as much damage on a successful one.  "
                        + "You can use this feature a number of times equal "
                        + "to your Wisdom modifier (a minimum of once). You "
                        + "regain all expended uses when you finish a long rest.");
            }
            else if (subClass.equals("Trickery")){
                player.spellbook.addSpells(this.name, this.subClass);
                
                classAbilities.add("Wrath of the Storm");
                classAbilitiesDescriptions.add("Starting when you "
                        + "choose this domain at 1st level, you can use "
                        + "your action to touch a willing creature other "
                        + "than yourself to give it advantage on Dexterity "
                        + "(Stealth) checks. This blessing lasts for 1 hour "
                        + "or until you use this feature again.");
            }
            else if (subClass.equals("War")){
                player.spellbook.addSpells(this.name, this.subClass);
                player.proficiencies.addArmor("Heavy");
                player.proficiencies.addWeapon("Martial Weapons");
                
                classAbilities.add("War Priest");
                classAbilitiesDescriptions.add("From 1st level, your "
                        + "god delivers bolts of inspiration to you while "
                        + "you are engaged in battle. When you use the Attack "
                        + "action, you can make one weapon attack as a bonus "
                        + "action.  You can use this feature a number of "
                        + "times equal to your Wisdom modifier (a minimum "
                        + "of once). You regain all expended uses when you "
                        + "finish a long rest.");
            }
            random = randomNumber(2);
            if (random == 0 && player.proficiencies.weapons.contains("Warhammer")){
                Weapon weapon = new Weapon("Warhammer", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            else{
                Weapon weapon = new Weapon("Mace", "simple melee");
                player.equipment.addEquipment(weapon);
            }
            if (player.proficiencies.armors.contains("Heavy")){
                random = randomNumber(3);
            }
            else{
                random = randomNumber(2);
            }
            if (random == 0){
                Wearable wearable = new Wearable("Scale Mail", "medium armor");
                player.equipment.addEquipment(wearable);
            }
            if (random == 1){
                Wearable wearable = new Wearable("Leather Armor", "light armor");
                player.equipment.addEquipment(wearable);
            }
            else{
                Wearable wearable = new Wearable("Chain Mail", "heavy armor");
                player.equipment.addEquipment(wearable);
            }
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Light Crossbow", "simple ranged");
                player.equipment.addEquipment(weapon);
                Item item = new Item("Bolts", "ammo");
                player.equipment.addEquipment(item, 20);
            }
            else {
                Weapon weapon = new Weapon("Any simple weapon", "simple weapon");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Priest's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Explorer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            Wearable wearable = new Wearable("Shield", "shield");
            player.equipment.addEquipment(wearable);
            Item item = new Item("Holy Symbol", "other");
            player.equipment.addEquipment(item);
        }
        else if (name.equals("Druid")){
            subClassName = "Druid Circle";
            hitDiceCount = 1;
            hitDice = 8;
            player.hp += 8+player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            player.proficiencies.addArmor("Medium");
            player.proficiencies.addArmor("Shields");
            
            player.proficiencies.addWeapon("Club");
            player.proficiencies.addWeapon("Dagger");
            player.proficiencies.addWeapon("Dart");
            player.proficiencies.addWeapon("Javelin");
            player.proficiencies.addWeapon("Mace");
            player.proficiencies.addWeapon("Quarterstaff");
            player.proficiencies.addWeapon("Scimitar");
            player.proficiencies.addWeapon("Sickle");
            player.proficiencies.addWeapon("Sling");
            player.proficiencies.addWeapon("Spear");
            
            player.savingThrows.intProf = true;
            player.savingThrows.wisProf = true;
            
            skillChoice.add("Arcana");
            skillChoice.add("Animal Handling");
            skillChoice.add("Insight");
            skillChoice.add("Medicine");
            skillChoice.add("Nature");
            skillChoice.add("Perception");
            skillChoice.add("Religion");
            skillChoice.add("Survival");
            
            choiceCount = 2;
            
            random = randomNumber(2);
            if (random == 0){
                Wearable wearable = new Wearable("Wooden Shield", "shield");
                player.equipment.addEquipment(wearable);
            }
            else {
                Weapon weapon = new Weapon("Any simple weapon", "simple weapon");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Scimitar", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            else {
                Weapon weapon = new Weapon("Any simple melee", "simple melee");
                player.equipment.addEquipment(weapon);
            }
            Wearable wearable = new Wearable("Leather Armor", "light armor");
            player.equipment.addEquipment(wearable);
            Item item = new Item("Explorer's Pack", "pack");
            player.equipment.addEquipment(item);
            item = new Item("Druidic Focus", "other");
            player.equipment.addEquipment(item);
            
            player.addLanguage("Druidic");
        }
        else if (name.equals("Fighter")){
            subClassName = "Martial Archetype";
            hitDiceCount = 1;
            hitDice = 10;
            player.hp += 10+player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            player.proficiencies.addArmor("Medium");
            player.proficiencies.addArmor("Heavy");
            player.proficiencies.addArmor("Shields");
            
            player.proficiencies.addWeapon("Simple Weapons");
            player.proficiencies.addWeapon("Martial Weapons");
            
            player.savingThrows.strProf = true;
            player.savingThrows.conProf = true;
            
            skillChoice.add("Acrobatics");
            skillChoice.add("Animal Handling");
            skillChoice.add("Athletics");
            skillChoice.add("History");
            skillChoice.add("Insight");
            skillChoice.add("Intimidation");
            skillChoice.add("Perception");
            skillChoice.add("Survival");
            
            choiceCount = 2;
            
            random = randomNumber(2);
            if (random == 0){
                Wearable wearable = new Wearable("Chain Mail", "heavy armor");
                player.equipment.addEquipment(wearable);
            }
            else {
                Wearable wearable = new Wearable("Leather", "light armor");
                player.equipment.addEquipment(wearable);
                Weapon weapon = new Weapon("Longbow", "martial weapon");
                player.equipment.addEquipment(weapon);
                Item item = new Item("Arrows", "ammo");
                player.equipment.addEquipment(item, 20);
            }
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Any martial weapon", "martial weapon");
                player.equipment.addEquipment(weapon);
                Wearable wearable = new Wearable("Shield", "shield");
                player.equipment.addEquipment(wearable);
            }
            else {
                Weapon weapon = new Weapon("Any martial weapon", "martial weapon");
                player.equipment.addEquipment(weapon);
                weapon = new Weapon("Any martial weapon", "martial weapon");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Light Crossbow", "simple ranged");
                player.equipment.addEquipment(weapon);
                Item item = new Item("Bolts", "ammo");
                player.equipment.addEquipment(item, 20);
            }
            else {
                Weapon weapon = new Weapon("Handaxe", "simple melee");
                player.equipment.addEquipment(weapon, 2);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Dungeoneer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Explorer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            random = randomNumber(6);
            if (random == 0){
                classAbilities.add("Fighting Style - Archery");
                classAbilitiesDescriptions.add("You gain a +2 bonus to "
                        + "attack rolls you make with ranged weapons");
            }
            else if (random == 1){
                classAbilities.add("Fighting Style - Defense");
                classAbilitiesDescriptions.add("While you are wearing armor, "
                        + "you gain a +1 bonus to AC");
            }
            else if (random == 2){
                classAbilities.add("Fighting Style - Dueling");
                classAbilitiesDescriptions.add("When you are wielding a "
                        + "melee weapon in one hand and no other weapons, "
                        + "you gain a +2 bonus to damage rolls with that "
                        + "weapon");
            }
            else if (random == 3){
                classAbilities.add("Fighting Style - Great Weapon Fighting");
                classAbilitiesDescriptions.add("When you roll a 1 or 2 on "
                        + "a damage die for an attack you make with a melee "
                        + "weapon that you are wielding with two hands, you "
                        + "can reroll the die and must use the new roll, even "
                        + "if the new roll is a 1 or a 2. The weapon must "
                        + "have the two-handed or versatile property for you "
                        + "to gain this benefit.");
            }
            else if (random == 4){
                classAbilities.add("Fighting Style - Protection");
                classAbilitiesDescriptions.add("When a creature you can see "
                        + "attacks a target other than you that is within 5 "
                        + "feet of you, you can use your reaction to impose "
                        + "disadvantage on the attack roll. You must be "
                        + "wielding a shield");
            }
            else if (random == 5){
                classAbilities.add("Fighting Style - Two-Weapon Fighting");
                classAbilitiesDescriptions.add("When you engage in two-weapon "
                        + "fighting, you can add your ability modifier to "
                        + "the damage of the second attack");
            }
            classAbilities.add("Second Wind");
            classAbilitiesDescriptions.add("You have a limited well of "
                    + "stamina that you can draw on to protect yourself "
                    + "from harm. On your turn, you can use a bonus action "
                    + "to regain hit points equal to 1d10 + your fighter "
                    + "level. Once you use this feature, you must finish a "
                    + "short or long rest before you can use it again");
        }
        else if (name.equals("Monk")){
            subClassName = "Monastic Tradition";
            hitDiceCount = 1;
            hitDice = 8;
            player.hp += 8+player.constitution.getModifier();
            
            player.proficiencies.addWeapon("Simple Weapons");
            player.proficiencies.addWeapon("Shortswords");
            
            player.savingThrows.strProf = true;
            player.savingThrows.dexProf = true;
            
            skillChoice.add("Acrobatics");
            skillChoice.add("Athletics");
            skillChoice.add("History");
            skillChoice.add("Insight");
            skillChoice.add("Religion");
            skillChoice.add("Stealth");
            
            choiceCount = 2;
            
            ArrayList<String> tools = new ArrayList<String>();
            tools.add("Bagpipes");
            tools.add("Drum");
            tools.add("Dulcimer");
            tools.add("Flute");
            tools.add("Lute");
            tools.add("Lyre");
            tools.add("Horn");
            tools.add("Pan Flute");
            tools.add("Shawm");
            tools.add("Viol");
            
            tools.add("Alchemist's Supplies");
            tools.add("Brewer's Supplies");
            tools.add("Calligrapher's Supplies");
            tools.add("Carpenter's Tools");
            tools.add("Cartographer's Tools");
            tools.add("Cobbler's Tools");
            tools.add("Cook's Utensils");
            tools.add("Glassblower's Tools");
            tools.add("Jeweler's Tools");
            tools.add("Leatherworker's Tools");
            tools.add("Mason's Tools");
            tools.add("Painter's Supplies");
            tools.add("Potter's Tools");
            tools.add("Smith's Tools");
            tools.add("Tinker's Tools");
            tools.add("Weaver's Tools");
            tools.add("Woodcarver's Tools");
            int toolChoices = 1;
            while (toolChoices>0){
                int randomNumber = randomNumber(tools.size());
                if (!player.proficiencies.tools.contains(tools.get(randomNumber))){
                    player.proficiencies.tools.add(tools.get(randomNumber));
                    toolChoices--;
                }
            }
            
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Shortsword", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            else {
                Weapon weapon = new Weapon("Any simple weapon", "simple weapon");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Dungeoneer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Explorer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            Weapon weapon = new Weapon("Darts", "simple ranged");
            player.equipment.addEquipment(weapon, 10);
            
            classAbilities.add("Unarmored Defense");
            classAbilitiesDescriptions.add("While you are wearing no armor "
                    + "and not wielding a shield, your AC equals 10 + your "
                    + "dexterity modifier + your wisdom modifier.");
            classAbilities.add("Martial Arts");
            classAbilitiesDescriptions.add("Your practice of martial arts "
                    + "gives you mastery of combat styles that use unarmed "
                    + "strikes and monk weapons, which are shortswords and "
                    + "any simple melee weapons that don't have the two-handed "
                    + "or heavy property.  You gain the following benefits "
                    + "while you are unarmed or wielding only monk weapons "
                    + "and you aren't wearing armor or wielding a shield. \n\n"
                    + "• You can use dexterity instead of strength for the "
                    + "attack and damage rolls of your unarmed strikes and "
                    + "monk weapons.\n  • You can roll a d4 in place of the "
                    + "normal damage of your unarmed strike or monk weapon.\n\n"
                    + "• When you use the attack action with an unarmed "
                    + "strike or a monk weapon on your turn, you can make one "
                    + "unarmed strike as a bonus action. For example, if you "
                    + "take the attack action and attack with a quarterstaff, "
                    + "you can also make an unarmed strike as a bonus action, "
                    + "assuming you haven't already taken a bonus action this turn."
                    + "\n\nCertain monasteries use specialized forms of the "
                    + "monk weapons. For example, you might use a club that "
                    + "is two lengths of wood connected by a short chain "
                    + "(called a nunchaku) or a sickle with a shorter, "
                    + "straighter blade (called a kama). Whatever name you use "
                    + "for a monk weapon, you can use the game statistics "
                    + "provided for the weapon.");
        }
        else if (name.equals("Paladin")){
            subClassName = "Sacred Oath";
            hitDiceCount = 1;
            hitDice = 10;
            player.hp += 10+player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            player.proficiencies.addArmor("Medium");
            player.proficiencies.addArmor("Heavy");
            player.proficiencies.addArmor("Shields");
            
            player.proficiencies.addWeapon("Simple Weapons");
            player.proficiencies.addWeapon("Martial Weapons");
            
            player.savingThrows.wisProf = true;
            player.savingThrows.chrProf = true;
            
            skillChoice.add("Athletics");
            skillChoice.add("Insight");
            skillChoice.add("Intimidation");
            skillChoice.add("Medicine");
            skillChoice.add("Persuasion");
            skillChoice.add("Religion");
            
            choiceCount = 2;
            
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Any martial weapon", "martial weapon");
                player.equipment.addEquipment(weapon);
                Wearable wearable = new Wearable("Shield", "shield");
                player.equipment.addEquipment(wearable);
            }
            else {
                Weapon weapon = new Weapon("Any martial weapon", "martial weapon");
                player.equipment.addEquipment(weapon);
                weapon = new Weapon("Any martial weapon", "martial weapon");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Javelin", "simple melee");
                player.equipment.addEquipment(weapon,5);
            }
            else {
                Weapon weapon = new Weapon("Any simple melee weapon", "simple melee");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Priest's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Explorer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            Wearable wearable = new Wearable("Chain Mail", "heavy armor");
            player.equipment.addEquipment(wearable);
            Item item = new Item("Holy Symbol", "other");
            player.equipment.addEquipment(item);
            
            classAbilities.add("Divine Sense");
            classAbilitiesDescriptions.add("The presence of strong evil "
                    + "registers on your senses like a noxious odor, and "
                    + "powerful good rings like heavenly music in your ears. "
                    + "As an action, you can open your awareness to detect "
                    + "such forces. Until the end of your next turn, you "
                    + "know the location of any celestial, fiend, or undead "
                    + "within 60 feet of you that is not behind total cover. "
                    + "You know the type (celestial, fiend, or undead) of any "
                    + "being whose presence you sense, but not its identity "
                    + "(the vampire Count Strahd von Zarovich, for instance)."
                    + " Within the same radius, you also detect the presence "
                    + "of any place or object that has been consecrated or "
                    + "desecrated, as with the hallow spell. You can use this "
                    + "feature a number of times equal to 1 + your charisma "
                    + "modifier. When you finish a long rest, you regain all "
                    + "expended uses.");
            classAbilities.add("Lay on Hands");
            classAbilitiesDescriptions.add("Your blessed touch can heal "
                    + "wounds. You have a pool of healing power that "
                    + "replenishes when you take a long rest. With that pool, "
                    + "you can restore a total number of hit points equal to "
                    + "your paladin level x 5. As an action, you can touch a "
                    + "creature and draw power from the pool to restore a "
                    + "number of hit points to that creature, up to the "
                    + "maximum amount remaining in your pool. Alternatively, "
                    + "you can expend 5 hit points from your pool of healing "
                    + "to cure the target of one disease or neutralize one "
                    + "poison affecting it. You can cure multiple diseases "
                    + "and neutralize multiple poisons with a single use of "
                    + "Lay on Hands, expending hit points separately for each "
                    + "one. This feature has no effect on undead and "
                    + "constructs.");
        }
        else if (name.equals("Ranger")){
            subClassName = "Ranger Conclave";
            hitDiceCount = 1;
            hitDice = 10;
            player.hp += 10+player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            player.proficiencies.addArmor("Medium");
            player.proficiencies.addArmor("Shields");
            
            player.proficiencies.addWeapon("Simple Weapons");
            player.proficiencies.addWeapon("Martial Weapons");
            
            player.savingThrows.strProf = true;
            player.savingThrows.dexProf = true;
            
            skillChoice.add("Animal Handling");
            skillChoice.add("Athletics");
            skillChoice.add("Insight");
            skillChoice.add("Investigation");
            skillChoice.add("Nature");
            skillChoice.add("Perception");
            skillChoice.add("Stealth");
            skillChoice.add("Survival");
            
            choiceCount = 3;
            
            random = randomNumber(2);
            if (random == 0){
                Wearable wearable = new Wearable("Scale Mail", "heavy armor");
                player.equipment.addEquipment(wearable);
            }
            else {
                Wearable wearable = new Wearable("Leather Armor", "light armor");
                player.equipment.addEquipment(wearable);
            }
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Shortsword", "martial melee");
                player.equipment.addEquipment(weapon,2);
            }
            else {
                Weapon weapon = new Weapon("Any simple melee weapon", "simple melee");
                player.equipment.addEquipment(weapon);
                weapon = new Weapon("Any simple melee weapon", "simple melee");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Dungeoneer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Explorer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            Weapon weapon = new Weapon("Longbow", "martial ranged");
            player.equipment.addEquipment(weapon);
            Item item = new Item("Quiver", "other");
            player.equipment.addEquipment(item);
            item = new Item("Arrow", "ammo");
            player.equipment.addEquipment(item, 20);
            
            ArrayList<String> favoredEnemy = new ArrayList<String>();
            favoredEnemy.add("Beasts");
            favoredEnemy.add("Fey");
            favoredEnemy.add("Humanoids");
            favoredEnemy.add("Monstrosities");
            favoredEnemy.add("Undead");
            
            String FEChoice = favoredEnemy.get(randomNumber(favoredEnemy.size()));
            
            classAbilities.add("Favored Enemy - " + FEChoice);
            classAbilitiesDescriptions.add("You gain a +2 bonus to damage "
                    + "rolls with weapon attacks against creatures of the "
                    + "chosen type. Additionally, you have advantage on Wisdom "
                    + "(Survival) checks to track " + FEChoice +", "
                    + "as well as on Intelligence checks to recall "
                    + "information about them.  When you gain this feature, "
                    + "you also learn one language of your choice that is "
                    + "spoken by your favored enemies, if they speak one at "
                    + "all.");
            player.languagesChoices++;
            
            classAbilities.add("Natural Explorer");
            classAbilitiesDescriptions.add("At 1st level, you are a master "
                    + "of navigating all of the natural world, and you react "
                    + "with swift and decisive action when attacked. This "
                    + "grants you the following benefits:\n\nYou ignore "
                    + "difficult terrain.\nYou have advantage on initiative "
                    + "rolls.\nOn your first turn during combat, you have "
                    + "advantage on attack rolls against creatures that have "
                    + "not yet acted.\n\nIn addition, you are skilled at "
                    + "navigating the wilderness. You gain the following "
                    + "benefits when traveling for an hour or more:\n\nDifficult "
                    + "terrain doesn’t slow your group’s travel.\nYour group "
                    + "can’t become lost except by magical means.\nEven when you "
                    + "are engaged in another activity while traveling (such "
                    + "as foraging, navigating, or tracking), you remain alert "
                    + "to danger.\nIf you are traveling alone, you can move "
                    + "stealthily at a normal pace.\nWhen you forage, you find "
                    + "twice as much food as you normally would.\nWhile "
                    + "tracking other creatures, you also learn their exact "
                    + "number, their sizes, and how long ago they passed "
                    + "through the area.");
        }
        else if (name.equals("Rogue")){
            subClassName = "Roguish Archetypes";
            hitDiceCount = 1;
            hitDice = 8;
            player.hp += 8+player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            
            player.proficiencies.addWeapon("Simple Weapons");
            player.proficiencies.addWeapon("Hand Crossbows");
            player.proficiencies.addWeapon("Longswords");
            player.proficiencies.addWeapon("Rapiers");
            player.proficiencies.addWeapon("Shortswords");
            
            player.savingThrows.dexProf = true;
            player.savingThrows.intProf = true;
            
            player.proficiencies.addTool("Thieves Tools");
            
            skillChoice.add("Acrobatics");
            skillChoice.add("Athletics");
            skillChoice.add("Deception");
            skillChoice.add("Insight");
            skillChoice.add("Intimidation");
            skillChoice.add("Investigation");
            skillChoice.add("Perception");
            skillChoice.add("Performance");
            skillChoice.add("Persuasion");
            skillChoice.add("Sleight of Hand");
            skillChoice.add("Stealth");
            
            choiceCount = 4;
            
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Rapier", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            else {
                Weapon weapon = new Weapon("Shortsword", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Shortbow", "simple ranged");
                player.equipment.addEquipment(weapon);
                Item item = new Item("Quiver", "other");
                player.equipment.addEquipment(item);
                item = new Item("Arrow", "ammo");
                player.equipment.addEquipment(item, 20);
            }
            else {
                Weapon weapon = new Weapon("Shortsword", "martial melee");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(3);
            if (random == 0){
                Item item = new Item("Burgler's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else if (random == 1){
                Item item = new Item("Dungeoneer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Explorer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            Wearable wearable = new Wearable("Leather Armor", "light armor");
            player.equipment.addEquipment(wearable);
            Weapon weapon = new Weapon("Dagger", "simple melee");
            player.equipment.addEquipment(weapon,2);
            Item item = new Item("Thieves' Tools", "pack");
            player.equipment.addEquipment(item);
            
            classAbilities.add("Sneak Attack");
            classAbilitiesDescriptions.add("You know how to strike subtly and "
                    + "exploit a foe’s distraction. Once per turn, you can "
                    + "deal extra 1d6 damage to one creature you hit with an "
                    + "attack if you have advantage on the attack roll. The "
                    + "attack must use a finesse or a ranged weapon. As you "
                    + "gain levels, the amount of damage increases, as shown "
                    + "on the level table.  You don't need advantage on the "
                    + "attack roll if another enemy of the target is within "
                    + "5 feet of it, that enemy isn't incapacitated, and you "
                    + "don't have disadvantage on the attack roll.");
            player.languages.add("Thieves' Cant");
        }
        else if (name.equals("Sorcerer")){
            subClassName = "Sorcerous Origin";
            hitDiceCount = 1;
            hitDice = 6;
            player.hp += 6+player.constitution.getModifier();
                        
            player.proficiencies.addWeapon("Daggers");
            player.proficiencies.addWeapon("Darts");
            player.proficiencies.addWeapon("Slings");
            player.proficiencies.addWeapon("Quarterstaffs");
            player.proficiencies.addWeapon("Light Crossbows");
            
            player.savingThrows.conProf = true;
            player.savingThrows.chrProf = true;
                        
            skillChoice.add("Arcana");
            skillChoice.add("Deception");
            skillChoice.add("Insight");
            skillChoice.add("Intimidation");
            skillChoice.add("Persuasion");
            skillChoice.add("Religion");
            
            choiceCount = 2;
            
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Light Crossbow", "simple ranged");
                player.equipment.addEquipment(weapon);
                Item item = new Item("Bolt", "ammo");
                player.equipment.addEquipment(item, 20);
            }
            else {
                Weapon weapon = new Weapon("any simple weapon", "simple weapon");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Component Pouch", "other");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Arcane Focus", "other");
                player.equipment.addEquipment(item);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Dungeoneer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Explorer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            Weapon weapon = new Weapon("Dagger", "simple melee");
            player.equipment.addEquipment(weapon,2);
            
            player.spellbook.addSpells(this.name, this.subClass);
            
            if (subClass.equals("Draconic Bloodline")){
                ArrayList<String> colors = new ArrayList<String>();
                colors.add("Black");
                colors.add("Blue");
                colors.add("Brass");
                colors.add("Bronze");
                colors.add("Copper");
                colors.add("Gold");
                colors.add("Green");
                colors.add("Red");
                colors.add("Silver");
                colors.add("White");
                int colorChoice = randomNumber(colors.size());
                
                String choice = colors.get(colorChoice);
                
                classAbilities.add("Dragon Ancestor");
                classAbilitiesDescriptions.add(choice);
                
                classAbilities.add("Dragon Ancestor");
                classAbilitiesDescriptions.add("Whenever you make a Charisma "
                        + "check when interacting with dragons, your "
                        + "proficiency bonus is doubled if it applies to "
                        + "the check.");
                
                player.hp++;
                
                classAbilities.add("Dragonic Resilience");
                classAbilitiesDescriptions.add("Parts of your skin are "
                        + "covered by a thin sheen of dragon-Iike scales. "
                        + "When you aren't wearing armor, your AC equals "
                        + "13 + your Dexterity modifier.");
                player.languages.add("Draconic");
            }
            else if (subClass.equals("Wild Magic")){
                classAbilities.add("Wild Magic Surge");
                classAbilitiesDescriptions.add("Starting when you choose "
                        + "this origin at 1st levei, your spellcasting can "
                        + "unleash surges of untamed magic. Immediately "
                        + "after you cast a sorcerer spell of 1st levei or "
                        + "higher, the DM can have you roll a d20. If you "
                        + "roll a 1, roll on the Wild Magic Surge table to "
                        + "create a random magical effect.");
                
                classAbilities.add("Tides of Chaos");
                classAbilitiesDescriptions.add("Starting at 1st level, you "
                        + "can manipulate the forces of chance and chaos to "
                        + "gain advantage on one attack roll, ability check, "
                        + "or saving throw. Once you do so.you must finish a "
                        + "long rest before you can use this feature again  "
                        + "Any time before you regain the use of this feature, "
                        + "the DM can have you roll on the Wild Magic Surge "
                        + "table immediately after you cast a sorcerer spell "
                        + "of 1st level or higher. You then regain the use "
                        + "of this feature.");
            }
        }
        else if (name.equals("Warlock")){
            subClassName = "Otherworldly Patron";
            hitDiceCount = 1;
            hitDice = 8;
            player.hp += 8+player.constitution.getModifier();
            
            player.proficiencies.addArmor("Light");
            
            player.proficiencies.addWeapon("Simple Weapons");
            
            player.savingThrows.wisProf = true;
            player.savingThrows.chrProf = true;
                        
            skillChoice.add("Arcana");
            skillChoice.add("Deception");
            skillChoice.add("History");
            skillChoice.add("Intimidation");
            skillChoice.add("Investigation");
            skillChoice.add("Nature");
            skillChoice.add("Religion");
            
            choiceCount = 2;
            
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Light Crossbow", "simple ranged");
                player.equipment.addEquipment(weapon);
                Item item = new Item("Bolt", "ammo");
                player.equipment.addEquipment(item, 20);
            }
            else {
                Weapon weapon = new Weapon("any simple weapon", "simple weapon");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Component Pouch", "other");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Arcane Focus", "other");
                player.equipment.addEquipment(item);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Scholar's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Dungeoneer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            Wearable wearable = new Wearable("Leather Armor", "light armor");
            player.equipment.addEquipment(wearable);
            Weapon weapon = new Weapon("any simple weapon", "simple weapon");
            player.equipment.addEquipment(weapon);
            weapon = new Weapon("Dagger", "simple melee");
            player.equipment.addEquipment(weapon,2);
            
            if (subClass.equals("The Archfey")){
                classAbilities.add("Fey Presence");
                classAbilitiesDescriptions.add("Your patron bestows upon you the "
                    + "ability to project the beguiling and fearsome presence "
                    + "of the fey. As an action, you can cause each creature "
                    + "in a 10-foot cube originating from you to make a Wisdom "
                    + "saving throw against your warlock spell save DC. "
                    + "The creatures that fail their saving throw are all "
                    + "charmed or frightened by you (your choice) until the "
                    + "end of your next turn.  Once you use this feature, "
                    + "you can't use it again until you finish a short or "
                    + "long rest.");   
            }
            else if (subClass.equals("The Fiend")){
                classAbilities.add("Dark One's Blessing");
                classAbilitiesDescriptions.add("When you reduce a hostile "
                        + "creature to 0 hit points, you gain temporary hit "
                        + "points equal to your Charisma modifier + your "
                        + "warlock level (minimum of 1).");
            }
            else if (subClass.equals("The Great Old One")){
                classAbilities.add("Awakened Mind");
                classAbilitiesDescriptions.add("Your alien knowledge gives "
                        + "you the ability to touch the minds of other "
                        + "creatures. You can communicate telepathically with "
                        + "any creature you can see within 30 feet of you. "
                        + "You don't need to share a language with the "
                        + "creature for it to understand your telepathic "
                        + "utterances, but the creature must be able to "
                        + "understand at least one language.");
            }
        }
        else if (name.equals("Wizard")){
            subClassName = "Arcane Tradition";
            hitDiceCount = 1;
            hitDice = 6;
            player.hp += 6+player.constitution.getModifier();
            
            player.proficiencies.addWeapon("Daggers");
            player.proficiencies.addWeapon("Darts");
            player.proficiencies.addWeapon("Slings");
            player.proficiencies.addWeapon("Quarterstaffs");
            player.proficiencies.addWeapon("Light Crossbows");
            
            player.savingThrows.intProf = true;
            player.savingThrows.wisProf = true;
            
            skillChoice.add("Arcana");
            skillChoice.add("History");
            skillChoice.add("Insight");
            skillChoice.add("Investigation");
            skillChoice.add("Medicine");
            skillChoice.add("Religion");
            
            choiceCount = 2;
            
            random = randomNumber(2);
            if (random == 0){
                Weapon weapon = new Weapon("Quarterstaff", "simple melee");
                player.equipment.addEquipment(weapon);
            }
            else {
                Weapon weapon = new Weapon("Dagger", "simple weapon");
                player.equipment.addEquipment(weapon);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Component Pouch", "other");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Arcane Focus", "other");
                player.equipment.addEquipment(item);
            }
            random = randomNumber(2);
            if (random == 0){
                Item item = new Item("Scholar's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            else {
                Item item = new Item("Explorer's Pack", "pack");
                player.equipment.addEquipment(item);
            }
            Item item = new Item("Spellbook", "other");
            player.equipment.addEquipment(item);
            
            classAbilities.add("Arcane Recovery");
            classAbilitiesDescriptions.add("You have learned to regain "
                    + "some of your magical energy by studying your "
                    + "spellbook. Once per day when you finish a short "
                    + "rest, you can choose expended spell slots to "
                    + "recover. The spell slots can have a combined level "
                    + "that is equal to or less than half your wizard level "
                    + "(rounded up), and none of the slots can be 6th level "
                    + "or higher.");
        }
        
        while (choiceCount > 0){
            int choice = randomNumber(skillChoice.size());
            String skill = skillChoice.get(choice);
            for (int i = 0; i < player.skills.skills.size(); i++){
                if (player.skills.skills.get(i).name.equals(skill)){
                    if (!player.skills.skills.get(i).prof){
                        player.skills.skills.get(i).prof = true;
                        choiceCount--;
                    }
                }
            }
        }
    }
    
    public void rogueSpecial(DNDCharacter player){
        ArrayList<String> skills = new ArrayList<String>();
        if (name.equals("Rogue")){
            skills.add("Thieves' Tools");
            for (int i = 0; i < player.skills.skills.size(); i++){
                if (player.skills.skills.get(i).prof){
                    skills.add(player.skills.skills.get(i).name);
                }
            }
            int choiceCount = 2;
            while (choiceCount > 0){
                int random = randomNumber(skills.size());
                if (skills.get(random).equals("Thieves' Tools") || !this.classAbilities.contains("Expertise")){
                    classAbilities.add("Expertise");
                    classAbilitiesDescriptions.add("Double proficiency when using Thieves' Tools");
                    choiceCount--;
                }
                else if (!player.skills.skillExceptions.contains(skills.get(random))){
                    player.skills.skillExceptions.add(skills.get(random));
                    player.skills.skillExceptionName.add("Expertise");
                    player.skills.skillExceptionEffect.add("Double proficiency bonus");
                    choiceCount--;
                }
                else if (!player.skills.skillExceptionName.get(random).equals("Expertise")){
                    player.skills.skillExceptions.add(skills.get(random));
                    player.skills.skillExceptionName.add("Expertise");
                    player.skills.skillExceptionEffect.add("Double proficiency bonus");
                    choiceCount--;
                }
            }
        }
    }
    
    public void printClass(){
        System.out.println("Class: " + name + ", " + subClass);
        if (!this.classAbilities.isEmpty()){
            System.out.println("Special Abilities (Class):");
            for (int i = 0; i < this.classAbilities.size(); i++){
                System.out.print("- ");
                System.out.print(this.classAbilities.get(i) + ": ");
                int stringSize = this.classAbilitiesDescriptions.get(i).length();
                int startIndex = 0;
                int endIndex = Math.min(60 - this.classAbilities.get(i).length() - 4, stringSize);
                do{
                    endIndex = Math.max(this.classAbilitiesDescriptions.get(i).indexOf(" ", endIndex),endIndex);
                    System.out.println(this.classAbilitiesDescriptions.get(i).substring(startIndex, endIndex));
                    System.out.print(" ");
                    startIndex = endIndex;
                    endIndex += 60;
                }
                while (endIndex < stringSize);
                System.out.println(this.classAbilitiesDescriptions.get(i).substring(endIndex-60));
            }
        }
    }
}
