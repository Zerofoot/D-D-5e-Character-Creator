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
class Race {
    
    String race;
    String subRace;
    String raceName;
    int weight, height;
    String printHeight;
    ArrayList<String> special = new ArrayList<String>();
    
    public Race(DNDCharacter player){
        chooseRace();
        increases(player);
    }
    
    private void chooseRace(){
        ArrayList<String> races = getRaces();
        int raceChoice = randomNumber(races.size());
        String chosenRace = races.get(raceChoice);
        
        ArrayList<String> subRaces = getSubRaces(chosenRace);
        if (subRaces.size() > 0){
            int subRaceChoice = randomNumber(subRaces.size());
            String chosenSubRace = subRaces.get(subRaceChoice);
            subRace = chosenSubRace;
            raceName = chosenSubRace + " " + chosenRace;
        }
        else {
            raceName = chosenRace;
        }
         race = chosenRace;
    }
    
    private ArrayList getRaces() {
        ArrayList<String> races = new ArrayList<String>();
        
        races.add("Dwarf");
        races.add("Elf");
        races.add("Halfling");
        races.add("Human");
        races.add("Dragonborn");
        races.add("Gnome");
        races.add("Half-Elf");
        races.add("Half-Orc");
        races.add("Tiefling");
        
        return races;
    }
    
        private ArrayList<String> getSubRaces(String chosenRace) {
        ArrayList<String> subRaces = new ArrayList<String>();
        if (chosenRace.equals("Dwarf")){
            subRaces.add("Hill");
            subRaces.add("Mountain");
        }
        else if (chosenRace.equals("Elf")){
            subRaces.add("High");
            subRaces.add("Wood");
            subRaces.add("Dark");
        }
        else if (chosenRace.equals("Halfling")){
            subRaces.add("Lightfoot");
            subRaces.add("Stout");
        }
        else if (chosenRace.equals("Human")){
            subRaces.add("Calishite");
            subRaces.add("Chondathan");
            subRaces.add("Damaran");
            subRaces.add("Illuskan");
            subRaces.add("Mulan");
            subRaces.add("Rashemi");
            subRaces.add("Shou");
            subRaces.add("Tethyrian");
            subRaces.add("Turami");
        }
        else if (chosenRace.equals("Dragonborn")){
            subRaces.add("Black");
            subRaces.add("Blue");
            subRaces.add("Brass");
            subRaces.add("Bronze");
            subRaces.add("Copper");
            subRaces.add("Gold");
            subRaces.add("Green");
            subRaces.add("Red");
            subRaces.add("Silver");
            subRaces.add("White");
        }
        else if (chosenRace.equals("Gnome")){
            subRaces.add("Forest");
            subRaces.add("Rock");
        }
        return subRaces;
    }
        
    private void increases(DNDCharacter player) {
        if (race.equals("Dwarf")){
            player.constitution.increase("race", 2);
            player.walkSpeed = 25;
            player.flySpeed = 0;
            player.swimSpeed = 0;
            player.vision = "Darkvision";
            
            player.savingThrows.addException("Constitution", "Dwarven Resilience",
                    "Poison", "Advantage on");
            player.savingThrows.addException("Strength", "Dwarven Resilience",
                    "Poison", "Advantage on");
            player.savingThrows.addException("Intelligence", "Dwarven Resilience",
                    "Poison", "Advantage on");
            player.savingThrows.addException("Wisdom", "Dwarven Resilience",
                    "Poison", "Advantage on");
            player.savingThrows.addException("Charisma", "Dwarven Resilience",
                    "Poison", "Advantage on");
            player.savingThrows.addException("Dexterity", "Dwarven Resilience",
                    "Poison", "Advantage on");
            
            player.damageChanger.changeType("Poison", "resistent");
            
            player.proficiencies.weapons.add("Battleaxe");
            player.proficiencies.weapons.add("Handaxe");
            player.proficiencies.weapons.add("Throwing hammer");
            player.proficiencies.weapons.add("Warhammer");
            
            int random = (int) (Math.random()*3);
            switch (random){
                case 0:
                    player.proficiencies.tools.add("Smith's tools");
                    break;
                case 1:
                    player.proficiencies.tools.add("Brewer's supplies");
                    break;
                case 2:
                    player.proficiencies.tools.add("Mason's tools");
                    break;
            }
            
            player.skills.addSpecial("Stonecunning", "History", 
                    "Add double proficiency for checks related to the origin of stonework.");
            
                player.addLanguage("Common");
                player.addLanguage("Dwarvish");
            
            if (subRace.equals("Hill")){
                setWeightAndHeight(44,2,4,115,2,6);
                player.wisdom.increase("race", 1);
                player.hp++;
            }
            else if(subRace.equals("Mountain")){
                setWeightAndHeight(48,2,4,130,2,6);
                player.strength.increase("race", 2);
                player.proficiencies.addArmor("Light");
                player.proficiencies.addArmor("Medium");
            }
        }
        else if (race.equals("Elf")){
            player.walkSpeed = 30;
            player.flySpeed = 0;
            player.swimSpeed = 0;
            player.dexterity.increase("race", 2);
            player.vision = "Darkvision";
            
            player.savingThrows.addException("Constitution", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Strength", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Intelligence", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Wisdom", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Charisma", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Dexterity", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Constitution", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Strength", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Intelligence", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Wisdom", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Charisma", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Dexterity", "Fey Ancestry",
                    "Sleep", "Immunity on");
            
            special.add("Trance: Elves don’t need to sleep. Instead, they "
                    + "meditate deeply, remaining semiconscious, for 4 hours a "
                    + "day. (The Common word for such meditation is “trance.”) "
                    + "While meditating, you can dream after a fashion; "
                    + "such dreams are actually mental exercises that have "
                    + "become reflexive through years of practice. After "
                    + "Resting in this way, you gain the same benefit that a "
                    + "human does from 8 hours of sleep.");
            
            player.addLanguage("Common");
            player.addLanguage("Elvish");
            
            player.skills.addProf("Perception");
            
            if (subRace.equals("High")){
                setWeightAndHeight(54,2,10,90,1,4);
                player.intelligence.increase("race", 1);
                
                player.proficiencies.weapons.add("Longsword");
                player.proficiencies.weapons.add("Shortsword");
                player.proficiencies.weapons.add("Shortbow");
                player.proficiencies.weapons.add("Longbow");
                
                player.spellbook.addRaceSpell(raceName);
                player.languagesChoices++;
                
            }
            else if (subRace.equals("Wood")){
                setWeightAndHeight(54,2,10,90,1,4);
                player.wisdom.increase("race", 1);
                player.walkSpeed = 35;
                
                player.proficiencies.weapons.add("Longsword");
                player.proficiencies.weapons.add("Shortsword");
                player.proficiencies.weapons.add("Shortbow");
                player.proficiencies.weapons.add("Longbow");
                
                special.add("Mask of the Wild:  You can attempt to hide even "
                        + "when you are only lightly obscured by foliage, "
                        + "heavy rain, falling snow, mist, and other natural "
                        + "phenomena.");
            }
            else if (subRace.equals("Dark")){
                setWeightAndHeight(53,2,6,75,1,6);
                player.charisma.increase("race", 1);
                player.vision = "Superior Darkvision";
                
                player.proficiencies.weapons.add("Rapiers");
                player.proficiencies.weapons.add("Shortsword");
                player.proficiencies.weapons.add("Hand Crossbow");
                
                special.add("Sunlight Sensitivity: While in sunlight, the "
                        + "drow has disadvantage on Attack rolls, as well "
                        + "as on Wisdom (Perception) checks that rely on "
                        + "sight.");
                
                player.spellbook.addRaceSpell(raceName);
            }
        }
        else if (race.equals("Halfling")){
            setWeightAndHeight(27,2,4,35,1,1);
            player.dexterity.increase("race", 2);
            player.walkSpeed = 25;
            player.flySpeed = 0;
            player.swimSpeed = 0;
            player.vision = "Normal Vision";
            
            player.savingThrows.addException("Constitution", "Brave",
                    "Frightened", "Advantage on");
            player.savingThrows.addException("Strength", "Brave",
                    "Frightened", "Advantage on");
            player.savingThrows.addException("Intelligence", "Brave",
                    "Frightened", "Advantage on");
            player.savingThrows.addException("Wisdom", "Brave",
                    "Frightened", "Advantage on");
            player.savingThrows.addException("Charisma", "Brave",
                    "Frightened", "Advantage on");
            player.savingThrows.addException("Dexterity", "Brave",
                    "Frightened", "Advantage on");
            
            special.add("Lucky: When you roll a 1 on the d20 for an attack "
                    + "roll, ability check, or saving throw, you can reroll "
                    + "the die and must use the new roll.");
            special.add("Halfling Nimbleness: You can move through the "
                    + "space of any creature that is of a size larger "
                    + "than yours.");
            
            player.addLanguage("Common");
            player.addLanguage("Halfling");
            
            if (subRace.equals("Lightfoot")){
                player.charisma.increase("race", 1);
                special.add("Naturally Stealthy: You can attempt to hide "
                        + "even when you are obscured only by a creature "
                        + "that is at least one size larger than you.");
            }
            else if (subRace.equals("Stout")){
                player.constitution.increase("race", 1);
                player.savingThrows.addException("Constitution", "Stout Resilience",
                        "Poison", "Advantage on");
                player.savingThrows.addException("Strength", "Stout Resilience",
                        "Poison", "Advantage on");
                player.savingThrows.addException("Intelligence", "Stout Resilience",
                        "Poison", "Advantage on");
                player.savingThrows.addException("Wisdom", "Stout Resilience",
                        "Poison", "Advantage on");
                player.savingThrows.addException("Charisma", "Stout Resilience",
                        "Poison", "Advantage on");
                player.savingThrows.addException("Dexterity", "Stout Resilience",
                        "Poison", "Advantage on");
                
                player.damageChanger.changeType("Poison", "resistent");
            }
        }
        else if (race.equals("Human")){
            setWeightAndHeight(56,2,10,110,2,4);
            
            player.dexterity.increase("race", 1);
            player.strength.increase("race", 1);
            player.intelligence.increase("race", 1);
            player.charisma.increase("race", 1);
            player.constitution.increase("race", 1);
            player.wisdom.increase("race", 1);
            
            player.walkSpeed = 30;
            player.flySpeed = 0;
            player.swimSpeed = 0;
            
            player.addLanguage("Common");
            player.languagesChoices++;
        }
        else if (race.equals("Dragonborn")){
            setWeightAndHeight(66,2,8,175,2,6);
            
            player.strength.increase("race", 2);
            player.charisma.increase("race", 1);
            
            player.walkSpeed = 30;
            player.flySpeed = 0;
            player.swimSpeed = 0;
            
            player.addLanguage("Common");
            player.addLanguage("Draconic");
            
            String damageType = "";
            String breathType = "";
            String savingThrow = "";
            if (subRace.equals("Black")){
                damageType = "Acid";
                breathType = "5 X 30 ft line";
                savingThrow = "Dexterity";
            }
            else if (subRace.equals("Blue")){
                damageType = "Lightning";
                breathType = "5 X 30 ft line";
                savingThrow = "Dexterity";
            }
            else if (subRace.equals("Brass")){
                damageType = "Fire";
                breathType = "5 X 30 ft line";
                savingThrow = "Dexterity";
            }
            else if (subRace.equals("Bronze")){
                damageType = "Lightning";
                breathType = "5 X 30 ft line";
                savingThrow = "Dexterity";
            }
            else if (subRace.equals("Copper")){
                damageType = "Acid";
                breathType = "5 X 30 ft line";
                savingThrow = "Dexterity";
            }
            else if (subRace.equals("Gold")){
                damageType = "Fire";
                breathType = "15 ft cone";
                savingThrow = "Dexterity";
            }
            else if (subRace.equals("Green")){
                damageType = "Poison";
                breathType = "15 ft cone";
                savingThrow = "Constitution";
            }
            else if (subRace.equals("Red")){
                damageType = "Fire";
                breathType = "15 ft cone";
                savingThrow = "Dexterity";
            }
            else if (subRace.equals("Silver")){
                damageType = "Cold";
                breathType = "15 ft cone";
                savingThrow = "Constitution";
            }
            else if (subRace.equals("White")){
                damageType = "Cold";
                breathType = "15 ft cone";
                savingThrow = "Constitution";
            }
            
            String breath = "You can use your action to exhale destructive "
                    + "energy. The breath is a " + breathType + " and does " + 
                    damageType + " damage.  When you "
                    + "use your breath weapon, each creature in the area of "
                    + "the exhalation must make a " + savingThrow + " saving "
                    + "throw, the type of "
                    + "which is determined by your draconic ancestry. The DC "
                    + "for this saving throw equals 8 + your Constitution "
                    + "modifier + your proficiency bonus. A creature takes "
                    + "2d6 damage on a failed save, and half as much damage "
                    + "on a successful one. The damage increases to 3d6 at "
                    + "6th level, 4d6 at 11th level, and 5d6 at 16th level.  "
                    + "After you use your breath weapon, you can’t use it "
                    + "again until you complete a short or Long Rest.";
            
            special.add(breath);
            player.damageChanger.changeType(damageType, "resistent");
        }
        else if (race.equals("Gnome")){
            setWeightAndHeight(35,2,4,35,1,1);
            
            player.intelligence.increase("race", 2);
            player.walkSpeed = 25;
            player.swimSpeed = 0;
            player.flySpeed = 0;
            
            player.vision = "Darkvision";
            
            player.savingThrows.addException("Wisdom", "Gnome Cunning",
                        "Magic", "Advantage on");
            player.savingThrows.addException("Charisma", "Gnome Cunning",
                        "Magic", "Advantage on");
            player.savingThrows.addException("Intelligence", "Gnome Cunning",
                        "Magic", "Advantage on");
            
            player.addLanguage("Common");
            player.addLanguage("Gnomish");
            
            if (subRace.equals("Forest")){
                player.dexterity.increase("race", 1);
                player.spellbook.addRaceSpell(this.raceName);
                special.add("Speak with Small Beasts: Through sound and "
                        + "gestures, you may communicate simple ideas with "
                        + "small or smaller beasts.");
            }
            else if (subRace.equals("Rock")){
                player.constitution.increase("race", 1);
                player.skills.addSpecial("Artificer's Lore", "History", 
                    "Add double proficiency for checks related magic items,"
                        + "alchemical objects or technological devices.");
                special.add("Tinker: You have proficiency with artisan tools "
                        + "(tinker's tools). Using those tools, you can spend "
                        + "1 hour and 10 gp worth of materials to construct a "
                        + "Tiny clockwork device (AC 5, 1 hp). The device "
                        + "ceases to function after 24 hours (unless you "
                        + "spend 1 hour repairing it to keep the device "
                        + "functioning), or when you use your action to "
                        + "dismantle it; at that time, you can reclaim the "
                        + "materials used to create it. You can have up to "
                        + "three such devices active at a time. When you "
                        + "create a device, choose one of the following "
                        + "options: \n\nClockwork Toy: This toy is a "
                        + "c1ockwork animal, monster, or person, such as "
                        + "a frog, mouse, bird, dragon, or soldier. When "
                        + "placed on the ground, the toy moves 5 feet "
                        + "across the ground on each of your turns in a "
                        + "random direction. It makes noises as appropriate "
                        + "to the creature it represents.  \nFire Starter: "
                        + "The device produces a miniature flame, which you "
                        + "can use to light a candle, torch, or campfire. "
                        + "Using the device requires your action.  \nMusic Box: "
                        + "When opened, this music box plays a single song at "
                        + "a moderate volume. The box stops playing when it "
                        + "reaches the song's end or when it is closed.  \n\n"
                        + "At your DM's discretion, you may make other "
                        + "objects with effects similar in power to these. "
                        + "The prestidigitation cantrip is a good baseline "
                        + "for such effects.");
            }
        }
        else if (race.equals("Half-Elf")){
            setWeightAndHeight(57,2,8,110,2,4);
            
            player.charisma.increase("race", 2);
            
            String choice1 = "";
            String choice2 = "";
            int choicesLeft = 2;
            while (choicesLeft>0){
                int choice = randomNumber(5);
                switch(choice){
                    case(0):
                        if (choice1.equals("")){
                            choice1 = "Strength";
                            choicesLeft--;
                        }
                        else if (!choice1.equals("Strength")){
                            choice2 = "Strength";
                            choicesLeft--;
                        }
                    break;
                    case(1):
                        if (choice1.equals("")){
                            choice1 = "Intelligence";
                            choicesLeft--;
                        }
                        else if (!choice1.equals("Intelligence")){
                            choice2 = "Intelligence";
                            choicesLeft--;
                        }
                    break;
                    case(2):
                        if (choice1.equals("")){
                            choice1 = "Wisdom";
                            choicesLeft--;
                        }
                        else if (!choice1.equals("Wisdom")){
                            choice2 = "Wisdom";
                            choicesLeft--;
                        }
                    break;
                    case(3):
                        if (choice1.equals("")){
                            choice1 = "Constitution";
                            choicesLeft--;
                        }
                        else if (!choice1.equals("Constitution")){
                            choice2 = "Constitution";
                            choicesLeft--;
                        }
                    break;
                    case(4):
                        if (choice1.equals("")){
                            choice1 = "Dexterity";
                            choicesLeft--;
                        }
                        else if (!choice1.equals("Dexterity")){
                            choice2 = "Dexterity";
                            choicesLeft--;
                        }
                    break;
                }
            }
            if(choice1.equals("Strength") || choice2.equals("Strength")){
                player.strength.increase("race", 1);
            }
            if(choice1.equals("Intelligence") || choice2.equals("Intelligence")){
                player.intelligence.increase("race", 1);
            }
            if(choice1.equals("Constitution") || choice2.equals("Constitution")){
                player.constitution.increase("race", 1);
            }
            if(choice1.equals("Wisdom") || choice2.equals("Wisdom")){
                player.wisdom.increase("race", 1);
            }
            if(choice1.equals("Dexterity") || choice2.equals("Dexterity")){
                player.dexterity.increase("race", 1);
            }
            
            player.walkSpeed = 30;
            player.swimSpeed = 0;
            player.flySpeed = 0;
            
            player.vision = "Darkvision";
            
            player.savingThrows.addException("Constitution", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Strength", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Intelligence", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Wisdom", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Charisma", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Dexterity", "Fey Ancestry",
                    "Charm", "Advantage on");
            player.savingThrows.addException("Constitution", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Strength", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Intelligence", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Wisdom", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Charisma", "Fey Ancestry",
                    "Sleep", "Immunity on");
            player.savingThrows.addException("Dexterity", "Fey Ancestry",
                    "Sleep", "Immunity on");
            
            player.skillChoiceCount += 2;
            
            player.languages.add("Common");
            player.languages.add("Elvish");
            player.languagesChoices++;
        }
        else if (race.equals("Half-Orc")){
            setWeightAndHeight(58,2,10,140,2,6);
            player.strength.increase("race", 2);
            player.constitution.increase("race", 1);
            
            player.walkSpeed = 30;
            player.swimSpeed = 0;
            player.flySpeed = 0;
            
            player.vision = "Darkvision";
            player.skills.addProf("Intimidation");
            
            special.add("Relentless Endurance: When you are reduced to 0 "
                    + "hit points but not killed outright, you can drop "
                    + "to 1 hit point instead. You can’t use this feature "
                    + "again until you finish a long rest.");
            special.add("Savage Attacks: When you score a critical hit with "
                    + "a melee weapon attack, you can roll one of the "
                    + "weapon’s damage dice one additional time and add "
                    + "it to the extra damage of the critical hit.");
            
            player.languages.add("Common");
            player.languages.add("Orcish");
        }
        else if (race.equals("Tiefling")){
            setWeightAndHeight(57,2,8,110,2,4);
            
            player.intelligence.increase("race", 1);
            player.charisma.increase("race",2);
            
            player.walkSpeed = 30;
            player.swimSpeed = 0;
            player.flySpeed = 0;
            
            player.vision = "Darkvision";
            
            player.damageChanger.changeType("Fire", "resistent");
            
            player.spellbook.addRaceSpell(raceName);
            
            player.languages.add("Common");
            player.languages.add("Infernal");
        }
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

    String chooseName(String gender) {
        ArrayList<String> firstNameList = getFirstNameList(gender);
        int randomFN = randomNumber(firstNameList.size());
        
        ArrayList<String> otherNameList = getOtherNameList();
        int randomON = randomNumber(otherNameList.size());
        
        ArrayList<String> lastNameList = getLastNameList();
        int randomLN = randomNumber(lastNameList.size());
        
        String name = "";
        if (this.race.equals("Dragonborn")){
            name = lastNameList.get(randomLN) + " \"" + otherNameList.get(randomON) +
                    "\" "+ firstNameList.get(randomFN);
        }
        else if (race.equals("Tiefling")){
            name = firstNameList.get(randomFN) + " \"" + otherNameList.get(randomON) +
                    "\" ";
        }
        else if (otherNameList.size()>0){
            name = firstNameList.get(randomFN) + " \"" + otherNameList.get(randomON) +
                    "\" "+ lastNameList.get(randomLN);
        }
        else if (this.race.equals("Human")){
            if (this.subRace.equals("Shou")){
                name = lastNameList.get(randomLN) + " " + firstNameList.get(randomFN);
            }
        }
        else if (this.race.equals("Half-Orc")){
            name = firstNameList.get(randomFN);
        }
        else{
            name = firstNameList.get(randomFN) + " " + lastNameList.get(randomLN);
        }
        return name;
        
    }

    private ArrayList<String> getFirstNameList(String gender) {
        ArrayList<String> names = new ArrayList<String>();
        if (race.equals("Dwarf")){
            if (gender.equals("Male")){
                names.add("Adrik");
                names.add("Alberich");
                names.add("Baern");
                names.add("Barendd");
                names.add("Brottor");
                names.add("Bruenor");
                names.add("Oain");
                names.add("Oarrak");
                names.add("Oelg");
                names.add("Eberk");
                names.add("Einkil");
                names.add("Fargrim");
                names.add("Flint");
                names.add("Gardain");
                names.add("Harbek");
                names.add("Kildrak");
                names.add("Morgran");
                names.add("Orsik");
                names.add("Oskar");
                names.add("Rangrim");
                names.add("Rurik");
                names.add("Taklinn");
                names.add("Thoradin");
                names.add("Thorin");
                names.add("Tordek");
                names.add("Traubon");
                names.add("Travok");
                names.add("Ulfgar");
                names.add("Veit");
                names.add("Vondal");
            }
            else{
                names.add("Amber");
                names.add("Artin");
                names.add("Audhild");
                names.add("Bardryn");
                names.add("Oagnal");
                names.add("Oiesa");
                names.add("Eldeth");
                names.add("Falkrunn");
                names.add("Finellen");
                names.add("Gunnloda");
                names.add("Gurdis");
                names.add("Helja");
                names.add("Hlin");
                names.add("Kathra");
                names.add("Kristryd");
                names.add("lide");
                names.add("Liftrasa");
                names.add("Mardred");
                names.add("Riswynn");
                names.add("Sannl");
                names.add("Torbera");
                names.add("Torgga");
                names.add("Vistra");
            }
        }
        else if (race.equals("Elf")){
            if (gender.equals("Male")){
                names.add("Aramil");
                names.add("Aust");
                names.add("Enialis");
                names.add("Heian");
                names.add("Himo");
                names.add("Ivellios");
                names.add("Laucian");
                names.add("Quarion");
                names.add("Soveliss");
                names.add("Thamior");
                names.add("Tharivol");
            }
            else {
                names.add("Anastrianna");
                names.add("Antinua");
                names.add("Drusilia");
                names.add("Felosial");
                names.add("Ielenia");
                names.add("Lia");
                names.add("Mialee");
                names.add("Qillathe");
                names.add("Silaqui");
                names.add("Vadania");
                names.add("Valanthe");
                names.add("Xanaphia");
            }
        }
        else if (race.contains("Halfling")){
            if (gender.equals("Male")){
                names.add("Alton");
                names.add("Beau");
                names.add("Cade");
                names.add("Eldon");
                names.add("Garret");
                names.add("Lyle");
                names.add("Milo");
                names.add("Osborn");
                names.add("Roscoe");
                names.add("Wellby");
            }
            else {
                names.add("Amaryllis");
                names.add("Charmaine");
                names.add("Cora");
                names.add("Euphemia");
                names.add("Jillian");
                names.add("Lavinia");
                names.add("Lidda");
                names.add("Merla");
                names.add("Portia");
                names.add("Seraphina");
                names.add("Verna");
            }
        }
        else if (race.equals("Human")){
            if (this.subRace.equals("Calishite")){
                if (gender.equals("Male")){
                    names.add("Aseir");
                    names.add("Bardeid");
                    names.add("Haseid");
                    names.add("Khemed");
                    names.add("Mehmen");
                    names.add("Sudeiman");
                    names.add("Zasheir");
                }
                else {
                    names.add("Atala");
                    names.add("Ceidil");
                    names.add("Hama");
                    names.add("Jasmal");
                    names.add("Meilil");
                    names.add("Seipora");
                    names.add("Yasheira");
                    names.add("Zasheida");
                }
            }
            else if (this.subRace.equals("Chondathan")){
                if (gender.equals("Male")){
                    names.add("Darvin");
                    names.add("Dorn");
                    names.add("Evendur");
                    names.add("Gorstag");
                    names.add("Grim");
                    names.add("Helm");
                    names.add("Malark");
                    names.add("Morn");
                    names.add("Randal");
                    names.add("Stedd");
                }
                else {
                    names.add("Arveene");
                    names.add("Esvele");
                    names.add("Jhessail");
                    names.add("Kerri");
                    names.add("Lureene");
                    names.add("Miri");
                    names.add("Rowan");
                    names.add("Shandri");
                    names.add("Tessele");
                }
            }
            else if (this.subRace.equals("Damaran")){
                if (gender.equals("Male")){
                    names.add("Bor");
                    names.add("Fodel");
                    names.add("Glar");
                    names.add("Grigor");
                    names.add("Igan");
                    names.add("Ivor");
                    names.add("Kosef");
                    names.add("Mival");
                    names.add("Orel");
                    names.add("Pavel");
                    names.add("Sergor");
                }
                else {
                    names.add("Alethra");
                    names.add("Kara");
                    names.add("Katernin");
                    names.add("Mara");
                    names.add("Natali");
                    names.add("Olma");
                    names.add("Tana");
                    names.add("Zora");
                }
            }
            else if (this.subRace.equals("Illuskan")){
                if (gender.equals("Male")){
                    names.add("Ander");
                    names.add("Blath");
                    names.add("Bran");
                    names.add("Frath");
                    names.add("Geth");
                    names.add("Lander");
                    names.add("Luth");
                    names.add("Malcer");
                    names.add("Stor");
                    names.add("Taman");
                    names.add("Urth");
                }
                else {
                    names.add("Amafrey");
                    names.add("Betha");
                    names.add("Cefrey");
                    names.add("Kethra");
                    names.add("Mara");
                    names.add("Olga");
                    names.add("Silifrey");
                    names.add("Westra");
                }
            }
            else if (this.subRace.equals("Mulan")){
                if (gender.equals("Male")){
                    names.add("Aoth");
                    names.add("Bareris");
                    names.add("Ehput-Ki");
                    names.add("Kethoth");
                    names.add("Mumed");
                    names.add("Ramas");
                    names.add("So-Kehur");
                    names.add("Thazar-De");
                    names.add("Urhur");
                }
                else {
                    names.add("Arizima");
                    names.add("Chathi");
                    names.add("Nephis");
                    names.add("Nulara");
                    names.add("Murithi");
                    names.add("Sefris");
                    names.add("Thola");
                    names.add("Umara");
                    names.add("Zolis");
                }
            }
            else if (this.subRace.equals("Rashemi")){
                if (gender.equals("Male")){
                    names.add("Borivik");
                    names.add("Faurgar");
                    names.add("Jandar");
                    names.add("Kanithar");
                    names.add("Madislak");
                    names.add("Ralmevik");
                    names.add("Shaumar");
                    names.add("Vladislak");
                }
                else {
                    names.add("Fyevarra");
                    names.add("Hulmarra");
                    names.add("Immith");
                    names.add("Imzel");
                    names.add("Navarra");
                    names.add("Shevarra");
                    names.add("Tammith");
                    names.add("Yuldra");
                }
            }
            else if (this.subRace.equals("Shou")){
                if (gender.equals("Male")){
                    names.add("An");
                    names.add("Chen");
                    names.add("Chi");
                    names.add("Fai");
                    names.add("Jiang");
                    names.add("Jun");
                    names.add("Lian");
                    names.add("Long");
                    names.add("Meng");
                    names.add("On");
                    names.add("Shan");
                    names.add("Shui");
                    names.add("Wen");
                }
                else {
                    names.add("Bai");
                    names.add("Chao");
                    names.add("Jia");
                    names.add("Lei");
                    names.add("Mei");
                    names.add("Qiao");
                    names.add("Shui");
                    names.add("Tai");
                }
            }
            else if (this.subRace.equals("Tethyrian")){
                if (gender.equals("Male")){
                    names.add("Darvin");
                    names.add("Dorn");
                    names.add("Evendur");
                    names.add("Gorstag");
                    names.add("Grim");
                    names.add("Helm");
                    names.add("Malark");
                    names.add("Morn");
                    names.add("Randal");
                    names.add("Stedd");
                }
                else {
                    names.add("Arveene");
                    names.add("Esvele");
                    names.add("Jhessail");
                    names.add("Kerri");
                    names.add("Lureene");
                    names.add("Miri");
                    names.add("Rowan");
                    names.add("Shandri");
                    names.add("Tessele");
                }
            }
            else if (this.subRace.equals("Turami")){
                if (gender.equals("Male")){
                    names.add("Anton");
                    names.add("Diero");
                    names.add("Marcon");
                    names.add("Pieron");
                    names.add("Rimardo");
                    names.add("Romero");
                    names.add("Salazar");
                    names.add("Umbero");
                }
                else {
                    names.add("Balama");
                    names.add("Dona");
                    names.add("Faila");
                    names.add("Jalana");
                    names.add("Luisa");
                    names.add("Marta");
                    names.add("Quara");
                    names.add("Selise");
                    names.add("Vonda");
                }
            }
        }
        else if (race.equals("Dragonborn")){
            if (gender.equals("Male")){
                names.add("Arjhan");
                names.add("Balasar");
                names.add("Bharash");
                names.add("Donaar");
                names.add("Ghesh");
                names.add("Heskan");
                names.add("Kriv");
                names.add("Medrash");
                names.add("Mehen");
                names.add("Nadarr");
                names.add("Pandjed");
                names.add("Patrin");
                names.add("Rhogar");
                names.add("Shamash");
                names.add("Shedinn");
                names.add("Tarhun");
                names.add("Torinn");
            }
            else {
                names.add("Akra");
                names.add("Biri");
                names.add("Daar");
                names.add("Farideh");
                names.add("Harann");
                names.add("Havilar");
                names.add("Jheri");
                names.add("Kava");
                names.add("Korinn");
                names.add("Mishann");
                names.add("Nala");
                names.add("Perra");
                names.add("Raiann");
                names.add("Sora");
                names.add("Surina");
                names.add("Thava");
                names.add("Uadjit");
            }
        }
        else if (race.equals("Gnome")){
            if (gender.equals("Male")){
                names.add("Alston");
                names.add("Alvyn");
                names.add("Boddynock");
                names.add("Brocc");
                names.add("Burgell");
                names.add("Dimble");
                names.add("Eldon");
                names.add("Erky");
                names.add("Fonkin");
                names.add("Frug");
                names.add("Gerbo");
                names.add("Gimble");
                names.add("Glim");
                names.add("Jebeddo");
                names.add("Kellen");
                names.add("Namfoodle");
                names.add("Orryn");
                names.add("Roondar");
                names.add("Seebo");
                names.add("Sindri");
                names.add("Warryn");
                names.add("Wrenn");
                names.add("Zook");
            }
            else {
                names.add("Bimpnottin");
                names.add("Breena");
                names.add("Caramip");
                names.add("Carlin");
                names.add("Donella");
                names.add("Duvamil");
                names.add("Ella");
                names.add("Ellyjobell");
                names.add("Ellywick");
                names.add("Lilli");
                names.add("Loopmottin");
                names.add("Lorilla");
                names.add("Mardnab");
                names.add("Nissa");
                names.add("Nyx");
                names.add("Oda");
                names.add("Orla");
                names.add("Roywyn");
                names.add("Shamil");
                names.add("Tana");
                names.add("Waywocket");
                names.add("Zanna");
            }
        }
        else if (race.equals("Half-Elf")){
            if (gender.equals("Male")){
                names.add("Aramil");
                names.add("Aust");
                names.add("Enialis");
                names.add("Heian");
                names.add("Himo");
                names.add("Ivellios");
                names.add("Laucian");
                names.add("Quarion");
                names.add("Soveliss");
                names.add("Thamior");
                names.add("Tharivol");
                
                names.add("Aseir");
                names.add("Bardeid");
                names.add("Haseid");
                names.add("Khemed");
                names.add("Mehmen");
                names.add("Sudeiman");
                names.add("Zasheir");
                
                names.add("Darvin");
                names.add("Dorn");
                names.add("Evendur");
                names.add("Gorstag");
                names.add("Grim");
                names.add("Helm");
                names.add("Malark");
                names.add("Morn");
                names.add("Randal");
                names.add("Stedd");
                
                names.add("Bor");
                names.add("Fodel");
                names.add("Glar");
                names.add("Grigor");
                names.add("Igan");
                names.add("Ivor");
                names.add("Kosef");
                names.add("Mival");
                names.add("Orel");
                names.add("Pavel");
                names.add("Sergor");

                names.add("Ander");
                names.add("Blath");
                names.add("Bran");
                names.add("Frath");
                names.add("Geth");
                names.add("Lander");
                names.add("Luth");
                names.add("Malcer");
                names.add("Stor");
                names.add("Taman");
                names.add("Urth");

                names.add("Aoth");
                names.add("Bareris");
                names.add("Ehput-Ki");
                names.add("Kethoth");
                names.add("Mumed");
                names.add("Ramas");
                names.add("So-Kehur");
                names.add("Thazar-De");
                names.add("Urhur");

                names.add("Borivik");
                names.add("Faurgar");
                names.add("Jandar");
                names.add("Kanithar");
                names.add("Madislak");
                names.add("Ralmevik");
                names.add("Shaumar");
                names.add("Vladislak");

                names.add("An");
                names.add("Chen");
                names.add("Chi");
                names.add("Fai");
                names.add("Jiang");
                names.add("Jun");
                names.add("Lian");
                names.add("Long");
                names.add("Meng");
                names.add("On");
                names.add("Shan");
                names.add("Shui");
                names.add("Wen");

                names.add("Anton");
                names.add("Diero");
                names.add("Marcon");
                names.add("Pieron");
                names.add("Rimardo");
                names.add("Romero");
                names.add("Salazar");
                names.add("Umbero");
            }
            else {
                names.add("Anastrianna");
                names.add("Antinua");
                names.add("Drusilia");
                names.add("Felosial");
                names.add("Ielenia");
                names.add("Lia");
                names.add("Mialee");
                names.add("Qillathe");
                names.add("Silaqui");
                names.add("Vadania");
                names.add("Valanthe");
                names.add("Xanaphia");
                
                names.add("Atala");
                names.add("Ceidil");
                names.add("Hama");
                names.add("Jasmal");
                names.add("Meilil");
                names.add("Seipora");
                names.add("Yasheira");
                names.add("Zasheida");

                names.add("Arveene");
                names.add("Esvele");
                names.add("Jhessail");
                names.add("Kerri");
                names.add("Lureene");
                names.add("Miri");
                names.add("Rowan");
                names.add("Shandri");
                names.add("Tessele");

                names.add("Alethra");
                names.add("Kara");
                names.add("Katernin");
                names.add("Mara");
                names.add("Natali");
                names.add("Olma");
                names.add("Tana");
                names.add("Zora");

                names.add("Amafrey");
                names.add("Betha");
                names.add("Cefrey");
                names.add("Kethra");
                names.add("Mara");
                names.add("Olga");
                names.add("Silifrey");
                names.add("Westra");

                names.add("Arizima");
                names.add("Chathi");
                names.add("Nephis");
                names.add("Nulara");
                names.add("Murithi");
                names.add("Sefris");
                names.add("Thola");
                names.add("Umara");
                names.add("Zolis");

                names.add("Fyevarra");
                names.add("Hulmarra");
                names.add("Immith");
                names.add("Imzel");
                names.add("Navarra");
                names.add("Shevarra");
                names.add("Tammith");
                names.add("Yuldra");

                names.add("Bai");
                names.add("Chao");
                names.add("Jia");
                names.add("Lei");
                names.add("Mei");
                names.add("Qiao");
                names.add("Shui");
                names.add("Tai");

                names.add("Balama");
                names.add("Dona");
                names.add("Faila");
                names.add("Jalana");
                names.add("Luisa");
                names.add("Marta");
                names.add("Quara");
                names.add("Selise");
                names.add("Vonda");
            }
        }
        
        else if (race.contains("Half-Orc")){
            if (gender.equals("Male")){
                names.add("Dench");
                names.add("Feng");
                names.add("Gell");
                names.add("Henk");
                names.add("Holg");
                names.add("Imsh");
                names.add("Keth");
                names.add("Krusk");
                names.add("Mhurren");
                names.add("Ront");
                names.add("Shump");
                names.add("Thokk");
            }
            else {
                names.add("Baggi");
                names.add("Emen");
                names.add("Engong");
                names.add("Kansif");
                names.add("Myev");
                names.add("Neega");
                names.add("Ovak");
                names.add("Ownka");
                names.add("Shautha");
                names.add("Sutha");
                names.add("Vola");
                names.add("Volen");
                names.add("Yevelda");
            }
        }
        else if (race.contains("Tiefling")){
            if (gender.equals("Male")){
                names.add("Akmenos");
                names.add("Amnon");
                names.add("Barakas");
                names.add("Damakos");
                names.add("Ekemon");
                names.add("Iados");
                names.add("Kairon");
                names.add("Leucis");
                names.add("Melech");
                names.add("Mordai");
                names.add("Morthos");
                names.add("Pelaios");
                names.add("Skamos");
                names.add("Therai");
            }
            else {
                names.add("Akta");
                names.add("Anakis");
                names.add("Bryseis");
                names.add("Criella");
                names.add("Damaia");
                names.add("Ea");
                names.add("Kallista");
                names.add("Lerissa");
                names.add("Makaria");
                names.add("Nemeia");
                names.add("Orianna");
                names.add("Phelaia");
                names.add("Rieta");
            }
        }
        return names;
    }

    private ArrayList<String> getLastNameList() {
        ArrayList<String> names = new ArrayList<String>();
        if (race.equals("Dwarf")){
            names.add("Balderk");
            names.add("Battlehammer");
            names.add("Brawnanvil");
            names.add("Oankil");
            names.add("Fireforge");
            names.add("Frostbeard");
            names.add("Gorunn");
            names.add("Holderhek");
            names.add("Ironfist");
            names.add("Loderr");
            names.add("Lutgehr");
            names.add("Rumnaheim");
            names.add("Strakeln");
            names.add("Torunn");
            names.add("Ungart");
        }
        else if (race.equals("Elf")){
            names.add("Amastacia (Starflower)");
            names.add("Amakiir (Gemflower)");
            names.add("Galanodel (Moonwhisper)");
            names.add("Holimion (Diamonddew)");
            names.add("Liadon (Silverfrond)");
            names.add("Meliamne (Oakenheel)");
            names.add("Nailo (Nightbreeze)");
            names.add("Siannodel (Moonbrook)");
            names.add("Ilphukiir (Gemblossom)");
            names.add("Xiloscient (Goldpetal)");
        }
        else if (race.equals("Halfling")){
            names.add("Brushgather");
            names.add("Goodbarrel");
            names.add("Greenbottle");
            names.add("Highhill");
            names.add("Hilltopple");
            names.add("Leagallow");
            names.add("Tealeaf");
            names.add("Thorngage");
            names.add("Tosscobble");
            names.add("Underbough");

        }
        else if (race.equals("Human")){
            if (this.subRace.equals("Calishite")){
                names.add("Basha");
                names.add("Dumein");
                names.add("Jassan");
                names.add("Khalid");
                names.add("Mostana");
                names.add("Pashar");
                names.add("Rein");

            }
            else if (this.subRace.equals("Chondathan")){
                names.add("Amblecrown");
                names.add("Buckman");
                names.add("Dundragon");
                names.add("Evenwood");
                names.add("Greycastle");
                names.add("Tallstag");
            }
            else if (this.subRace.equals("Damaran")){
                names.add("Bersk");
                names.add("Chernin");
                names.add("Dotsk");
                names.add("Kulenov");
                names.add("Marsk");
                names.add("Nemetsk");
                names.add("Shemov");
                names.add("Starag");
            }
            else if (this.subRace.equals("Illuskan")){
                names.add("Brightwood");
                names.add("Helder");
                names.add("Hornraven");
                names.add("Lackman");
                names.add("Stormwind");
                names.add("Windrivver");
            }
            else if (this.subRace.equals("Mulan")){
                names.add("Ankhalab");
                names.add("Anskuld");
                names.add("Fezim");
                names.add("Hahpet");
                names.add("Nathandem");
                names.add("Sepret");
                names.add("Uuthrakt");
            }
            else if (this.subRace.equals("Rashemi")){
                names.add("Chergoba");
                names.add("Dyernina");
                names.add("Iltazyara");
                names.add("Murnyethara");
                names.add("Stayanoga");
                names.add("Ulmokina");
            }
            else if (this.subRace.equals("Shou")){
                names.add("Chien");
                names.add("Huang");
                names.add("Kao");
                names.add("Kung");
                names.add("Lao");
                names.add("Ling");
                names.add("Mei");
                names.add("Pin");
                names.add("Shin");
                names.add("Sum");
                names.add("Tan");
                names.add("Wan");
            }
            else if (this.subRace.equals("Tethyrian")){
                names.add("Amblecrown");
                names.add("Buckman");
                names.add("Dundragon");
                names.add("Evenwood");
                names.add("Greycastle");
                names.add("Tallstag");
            }
            else if (this.subRace.equals("Turami")){
                names.add("Agosto");
                names.add("Astorio");
                names.add("Calabra");
                names.add("Domine");
                names.add("Falone");
                names.add("Marivaldi");
                names.add("Pisacar");
                names.add("Ramondo");
            }
        }
        else if (race.contains("Dragonborn")){
            names.add("Clethtinthiallor");
            names.add("Daardendrian");
            names.add("Delmirev");
            names.add("Drachedandion");
            names.add("Fenkenkabradon");
            names.add("Kepeshkmolik");
            names.add("Kerrhylon");
            names.add("Kimbatuul");
            names.add("Linxakasendalor");
            names.add("Myastan");
            names.add("Nemmonis");
            names.add("Norixius");
            names.add("Ophinshtalajiir");
            names.add("Prexijandilin");
            names.add("Shestendeliath");
            names.add("Turnuroth");
            names.add("Verthisathurgiesh");
            names.add("Yarjerit");
        }
        else if (race.equals("Gnome")){
            names.add("Beren");
            names.add("Daergel");
            names.add("Folkor");
            names.add("Garrick");
            names.add("Nackle");
            names.add("Murnig");
            names.add("Ningel");
            names.add("Raulnor");
            names.add("Scheppen");
            names.add("Timbers");
            names.add("Turen");
        }
        else if (race.equals("Half-Elf")){
            names.add("Amastacia (Starflower)");
            names.add("Amakiir (Gemflower)");
            names.add("Galanodel (Moonwhisper)");
            names.add("Holimion (Diamonddew)");
            names.add("Liadon (Silverfrond)");
            names.add("Meliamne (Oakenheel)");
            names.add("Nailo (Nightbreeze)");
            names.add("Siannodel (Moonbrook)");
            names.add("Ilphukiir (Gemblossom)");
            names.add("Xiloscient (Goldpetal)");
            
            names.add("Basha");
            names.add("Dumein");
            names.add("Jassan");
            names.add("Khalid");
            names.add("Mostana");
            names.add("Pashar");
            names.add("Rein");

            names.add("Amblecrown");
            names.add("Buckman");
            names.add("Dundragon");
            names.add("Evenwood");
            names.add("Greycastle");
            names.add("Tallstag");

            names.add("Bersk");
            names.add("Chernin");
            names.add("Dotsk");
            names.add("Kulenov");
            names.add("Marsk");
            names.add("Nemetsk");
            names.add("Shemov");
            names.add("Starag");

            names.add("Brightwood");
            names.add("Helder");
            names.add("Hornraven");
            names.add("Lackman");
            names.add("Stormwind");
            names.add("Windrivver");

            names.add("Ankhalab");
            names.add("Anskuld");
            names.add("Fezim");
            names.add("Hahpet");
            names.add("Nathandem");
            names.add("Sepret");
            names.add("Uuthrakt");

            names.add("Chergoba");
            names.add("Dyernina");
            names.add("Iltazyara");
            names.add("Murnyethara");
            names.add("Stayanoga");
            names.add("Ulmokina");

            names.add("Chien");
            names.add("Huang");
            names.add("Kao");
            names.add("Kung");
            names.add("Lao");
            names.add("Ling");
            names.add("Mei");
            names.add("Pin");
            names.add("Shin");
            names.add("Sum");
            names.add("Tan");
            names.add("Wan");

            names.add("Amblecrown");
            names.add("Buckman");
            names.add("Dundragon");
            names.add("Evenwood");
            names.add("Greycastle");
            names.add("Tallstag");

            names.add("Agosto");
            names.add("Astorio");
            names.add("Calabra");
            names.add("Domine");
            names.add("Falone");
            names.add("Marivaldi");
            names.add("Pisacar");
            names.add("Ramondo");
        }
        return names;
    }

    private void setWeightAndHeight(int hBase, int hDieCount, int hDie, int wBase, 
            int wDieCount, int wDie) {
        height = hBase;
        int hDieRoll = 0;
        for (int i = 0; i < hDieCount; i++){
            hDieRoll += randomNumber(hDie)+1;
            height+=hDieRoll;
        }
        weight = wBase;
        int wDieRoll = 0;
        for (int i = 0; i < wDieCount; i++){
            wDieRoll+=randomNumber(wDie)+1;
        }
        weight += wDieRoll*hDieRoll;
        int hFeet = height /12;
        int hInch = height % 12;
        printHeight = hFeet + "\'" + hInch + "\"";
    }

    private ArrayList<String> getOtherNameList() {
        ArrayList<String> names = new ArrayList<String>();
        if (race.equals("Elf")){
            names.add("Arya");
            names.add("Bryn");
            names.add("Del");
            names.add("Eryn");
            names.add("Faen");
            names.add("Innil");
            names.add("Mella");
            names.add("Naill");
            names.add("Naeris");
            names.add("Phann");
            names.add("Rael");
            names.add("Rinn");
            names.add("Sai");
            names.add("Syllin");
            names.add("Thia");
            names.add("Vall");
        }
        else if (race.equals("Dragonborn")){
            names.add("Climber");
            names.add("Earbender");
            names.add("Leaper");
            names.add("Pious");
            names.add("Shieldbiter");
            names.add("Zealous");
        }
        else if (race.equals("Gnome")){
            names.add("Aleslosh");
            names.add("Ashhearth");
            names.add("Badger");
            names.add("Cloak");
            names.add("Doublelock");
            names.add("Filchbatter");
            names.add("Fnipper");
            names.add("Ku");
            names.add("Nim");
            names.add("Oneshoe");
            names.add("Pock");
            names.add("Sparklegem");
            names.add("Stumbleduck");
        }
        else if (race.equals("Half-Elf")){
            names.add("Arya");
            names.add("Bryn");
            names.add("Del");
            names.add("Eryn");
            names.add("Faen");
            names.add("Innil");
            names.add("Mella");
            names.add("Naill");
            names.add("Naeris");
            names.add("Phann");
            names.add("Rael");
            names.add("Rinn");
            names.add("Sai");
            names.add("Syllin");
            names.add("Thia");
            names.add("Vall");
        }
        else if (race.equals("Tiefling")){
            names.add("Art");
            names.add("Carrion");
            names.add("Chant");
            names.add("Creed");
            names.add("Despair");
            names.add("Excellence");
            names.add("Fear");
            names.add("Glory");
            names.add("Hope");
            names.add("Ideal");
            names.add("Music");
            names.add("Nowhere");
            names.add("Open");
            names.add("Poetry");
            names.add("Quest");
            names.add("Random");
            names.add("Reverence");
            names.add("Sorrow");
            names.add("Temerity");
            names.add("Torment");
            names.add("Weary");
        }
        return names;
    }

    void printUniqueBonuses() {
        for (int i = 0; i < this.special.size(); i++){
            System.out.println(special.get(i));
        }
    }

    void printRace() {
        System.out.println("Race: " + this.raceName);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.printHeight);
        if (!this.special.isEmpty()){
            System.out.println("Special Abilities (Race):");
            for (int i = 0; i < this.special.size(); i++){
                int stringSize = this.special.get(i).length();
                int startIndex = 0;
                int endIndex = 60;
                System.out.print("- ");
                do{
                    endIndex = Math.max(this.special.get(i).indexOf(" ", endIndex),endIndex);
                    System.out.println(this.special.get(i).substring(startIndex, endIndex));
                    System.out.print(" ");
                    startIndex = endIndex;
                    endIndex += 60;
                }
                while (endIndex < stringSize);
                System.out.println(this.special.get(i).substring(endIndex-60));
            }
        }
    }
}
