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
class Spellbook {
    /*ArrayList<Spell> lvl0spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl1spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl2spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl3spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl4spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl5spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl6spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl7spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl8spells = new ArrayList<Spell>();
    ArrayList<Spell> lvl9spells = new ArrayList<Spell>();
    ArrayList<Spell> allSpells = new ArrayList<Spell>();*/
    
    ArrayList<String> lvl0spells = new ArrayList<String>();
    ArrayList<String> lvl1spells = new ArrayList<String>();
    ArrayList<String> lvl2spells = new ArrayList<String>();
    ArrayList<String> lvl3spells = new ArrayList<String>();
    ArrayList<String> lvl4spells = new ArrayList<String>();
    ArrayList<String> lvl5spells = new ArrayList<String>();
    ArrayList<String> lvl6spells = new ArrayList<String>();
    ArrayList<String> lvl7spells = new ArrayList<String>();
    ArrayList<String> lvl8spells = new ArrayList<String>();
    ArrayList<String> lvl9spells = new ArrayList<String>();
    ArrayList<String> allSpells = new ArrayList<String>();
    
    String spellCastingAbility;
    ArrayList<String> spellCastingExceptionSpells = new ArrayList<String>();
    ArrayList<String> spellCastingExceptionAbilities = new ArrayList<String>();
    int lvl0SpellCount = 0;
    int lvl1SpellCount = 0;
    
    /*
    public Spellbook(){
        addAllSpells();
    }
    /*
    public Boolean addSpell(String name){
       // Spell spell = lookUpSpell(name);
        if (spell.name.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    * 
    private Spell lookUpSpell(String name) {
        for (int i= 0; i< allSpells.size(); i++){
            if(allSpells.get(i).name.equals(name)){
                return allSpells.get(i);
            }
        };
        return null;
    }
    
    */
    public void addSpells(String className, String subClass) {
        ArrayList<String> lvl0SpellChoices = new ArrayList<String>();
        ArrayList<String> lvl1SpellChoices = new ArrayList<String>();
        ArrayList<String> lvl2SpellChoices = new ArrayList<String>();
        ArrayList<String> lvl3SpellChoices = new ArrayList<String>();
        ArrayList<String> lvl4SpellChoices = new ArrayList<String>();

        if (className.equals("Bard")){
            lvl0SpellCount = 2;
            lvl1SpellCount = 4;
            
            lvl0SpellChoices.add("Blade Ward");
            lvl0SpellChoices.add("Dancing Lights");
            lvl0SpellChoices.add("Friends");
            lvl0SpellChoices.add("Light");
            lvl0SpellChoices.add("Mage Hand");
            lvl0SpellChoices.add("Mending");
            lvl0SpellChoices.add("Message");
            lvl0SpellChoices.add("Minor Illusion");
            lvl0SpellChoices.add("Prestidigitation");
            lvl0SpellChoices.add("True Strike");
            lvl0SpellChoices.add("Vicious Mockery");
            
            lvl1SpellChoices.add("Animal Friendship");
            lvl1SpellChoices.add("Bane");
            lvl1SpellChoices.add("Charm Person");
            lvl1SpellChoices.add("Comprehend Languages");
            lvl1SpellChoices.add("Cure Wounds");
            lvl1SpellChoices.add("Detect Magic");
            lvl1SpellChoices.add("Disguise Self");
            lvl1SpellChoices.add("Dissonant Whispers");
            lvl1SpellChoices.add("Faerie Fire");
            lvl1SpellChoices.add("Feather Fall");
            lvl1SpellChoices.add("Healing Word");
            lvl1SpellChoices.add("Heroism");
            lvl1SpellChoices.add("Identify");
            lvl1SpellChoices.add("Illusory Script");
            lvl1SpellChoices.add("Longstrider");
            lvl1SpellChoices.add("Silent Image");
            lvl1SpellChoices.add("Sleep");
            lvl1SpellChoices.add("Speak with Animals");
            lvl1SpellChoices.add("Tasha's Hideous Laughter");
            lvl1SpellChoices.add("Thunderwave");
            lvl1SpellChoices.add("Unseen Servant");
            
            lvl2SpellChoices.add("Animal Messenger");
            lvl2SpellChoices.add("Blindness/Deafness");
            lvl2SpellChoices.add("Calm Emotions");
            lvl2SpellChoices.add("Cloud of Daggers");
            lvl2SpellChoices.add("Crown of Madness");
            lvl2SpellChoices.add("Detect Thoughts");
            lvl2SpellChoices.add("Enhance Ability");
            lvl2SpellChoices.add("Enthrall");
            lvl2SpellChoices.add("Heat Metal");
            lvl2SpellChoices.add("Hold Person");
            lvl2SpellChoices.add("Invisibility");
            lvl2SpellChoices.add("Knock");
            lvl2SpellChoices.add("Lesser Restoration");
            lvl2SpellChoices.add("Locate Animals or Plants");
            lvl2SpellChoices.add("Locate Object");
            lvl2SpellChoices.add("Magic Mouth");
            lvl2SpellChoices.add("Phantasmal Force");
            lvl2SpellChoices.add("See Invisibility");
            lvl2SpellChoices.add("Shatter");
            lvl2SpellChoices.add("Silence");
            lvl2SpellChoices.add("Suggestion");
            lvl2SpellChoices.add("Zone of Truth");
            
            lvl3SpellChoices.add("Bestow Curse");
            lvl3SpellChoices.add("Clairvoyance");
            lvl3SpellChoices.add("Dispel Magic");
            lvl3SpellChoices.add("Fear");
            lvl3SpellChoices.add("Feign Death");
            lvl3SpellChoices.add("Glyph of Warding");
            lvl3SpellChoices.add("Hypnotic Pattern");
            lvl3SpellChoices.add("Leomund's Tiny Hut");
            lvl3SpellChoices.add("Major Image");
            lvl3SpellChoices.add("Nondetection");
            lvl3SpellChoices.add("Plant Growth");
            lvl3SpellChoices.add("Sending");
            lvl3SpellChoices.add("Speak with Dead");
            lvl3SpellChoices.add("Speak with Plants");
            lvl3SpellChoices.add("Stinking Cloud");
            lvl3SpellChoices.add("Tongues");
            
            lvl4SpellChoices.add("Compulsion");
            lvl4SpellChoices.add("Confusion");
            lvl4SpellChoices.add("Dimension Door");
            lvl4SpellChoices.add("Freedom of Movement");
            lvl4SpellChoices.add("Greater Invisibility");
            lvl4SpellChoices.add("Hallucinatory Terrain");
            lvl4SpellChoices.add("Locate Creature");
            lvl4SpellChoices.add("Polymorph");
        }
        
        else if (className.equals("Cleric")){
            lvl0SpellCount = 3;
            lvl1SpellCount = 0;
            
            if (subClass.equals("Knowledge")){
                lvl1spells.add("Command");
                lvl1spells.add("Identify");
                /*
                lvl2spells.add("Augury");
                lvl2spells.add("Suggestion");
                
                lvl3spells.add("Nondetection");
                lvl3spells.add("Speak with Dead");
                
                lvl4spells.add("Arcane Eye");
                lvl4spells.add("Confusion");
                
                lvl5spells.add("Legend Lore");
                lvl5spells.add("Scrying");*/
            }
            else if (subClass.equals("Life")){
                lvl1spells.add("Bless");
                lvl1spells.add("Cure Wounds");
                /*
                lvl2spells.add("Lesser Restoration");
                lvl2spells.add("Spiritual Weapon");
                
                lvl3spells.add("Beacon of Hope");
                lvl3spells.add("Revivify");
                
                lvl4spells.add("Death Ward");
                lvl4spells.add("Guardian of Faith");
                
                lvl5spells.add("Mass Cure Wounds");
                lvl5spells.add("Raise Dead");*/
            }
            else if (subClass.equals("Light")){
                lvl0spells.add("Light");
                
                lvl1spells.add("Burning Hands");
                lvl1spells.add("Faerie Fire");
                /*
                lvl2spells.add("Flaming Sphere");
                lvl2spells.add("Scorching Ray");
                
                lvl3spells.add("Daylight");
                lvl3spells.add("Fireball");
                
                lvl4spells.add("Guardian of Faith");
                lvl4spells.add("Wall of Fire");
                
                lvl5spells.add("Flame Strike");
                lvl5spells.add("Scrying");*/
            }
            else if (subClass.equals("Nature")){
                ArrayList<String> natureSpells = new ArrayList<String>();
                natureSpells.add("Druidcraft");
                natureSpells.add("Guidance");
                natureSpells.add("Mending");
                natureSpells.add("Poison Spray");
                natureSpells.add("Produce Flame");
                natureSpells.add("Resistance");
                natureSpells.add("Shillelagh");
                natureSpells.add("Thorn Whip");
                
                int remaining = 1;
                while (remaining > 0){
                    int choice = randomNumber(lvl0SpellCount);
                    String spell = lvl0SpellChoices.get(choice);
                    if (!lvl0spells.contains(spell)){
                        lvl0spells.add(spell);
                        remaining--;
                    }
                }
                
                lvl1spells.add("Animal Friendship");
                lvl1spells.add("Speak with Animals");
                /*
                lvl2spells.add("Barkskin");
                lvl2spells.add("Spike Growth");
                
                lvl3spells.add("Plant Growth");
                lvl3spells.add("Windwall");
                
                lvl4spells.add("Dominate Beast");
                lvl4spells.add("Grasping Vine");
                
                lvl5spells.add("Insect Plague");
                lvl5spells.add("Tree Stride");*/
            }
            else if (subClass.equals("Tempest")){                
                lvl1spells.add("Fog Cloud");
                lvl1spells.add("Thunderwave");
                /*
                lvl2spells.add("Gust of Wind");
                lvl2spells.add("Shatter");
                
                lvl3spells.add("Call Lightning");
                lvl3spells.add("Sleet Storm");
                
                lvl4spells.add("Control Water");
                lvl4spells.add("Ice Storm");
                
                lvl5spells.add("Destructive Wave");
                lvl5spells.add("Insect Plague");*/
            }
            else if (subClass.equals("Trickery")){
                lvl1spells.add("Charm Person");
                lvl1spells.add("Disguise Self");
                /*
                lvl2spells.add("Mirror Image");
                lvl2spells.add("Pass without Trace");
                
                lvl3spells.add("Blink");
                lvl3spells.add("Dispel Magic");
                
                lvl4spells.add("Dimension Door");
                lvl4spells.add("Polymorph");
                
                lvl5spells.add("Dominate Person");
                lvl5spells.add("Modify Memory");*/
            }
            else if (subClass.equals("War")){
                lvl1spells.add("Divine Favor");
                lvl1spells.add("Shield of Faith");
                /*
                lvl2spells.add("Magic Weapon");
                lvl2spells.add("Spiritual Weapon");
                
                lvl3spells.add("Crusader's Mantle");
                lvl3spells.add("Spirit Guardians");
                
                lvl4spells.add("Freedom of Movement");
                lvl4spells.add("Stoneskin");
                
                lvl5spells.add("Flame Strike");
                lvl5spells.add("Hold Monster");*/
            }
        }
        else if (className.equals("Druid")){
            lvl0SpellCount = 2;
            lvl1SpellCount = 0;
            
            lvl0SpellChoices.add("Druidcraft");
            lvl0SpellChoices.add("Guidance");
            lvl0SpellChoices.add("Mending");
            lvl0SpellChoices.add("Poison Spray");
            lvl0SpellChoices.add("Produce Flame");
            lvl0SpellChoices.add("Resistance");
            lvl0SpellChoices.add("Shillelagh");
            lvl0SpellChoices.add("Thorn Whip");
        }
        else if (className.equals("Sorcerer")){
            lvl0SpellCount = 2;
            lvl1SpellCount = 4;
            
            lvl0SpellChoices.add("Acid Splash");
            lvl0SpellChoices.add("Blade Ward");
            lvl0SpellChoices.add("Chill Touch");
            lvl0SpellChoices.add("Dancing Lights");
            lvl0SpellChoices.add("Fire Bolt");
            lvl0SpellChoices.add("Friends");
            lvl0SpellChoices.add("Light");
            lvl0SpellChoices.add("Mage Hand");
            lvl0SpellChoices.add("Mending");
            lvl0SpellChoices.add("Message");
            lvl0SpellChoices.add("Minor Illusion");
            lvl0SpellChoices.add("Poison Spray");
            lvl0SpellChoices.add("Prestidigitation");
            lvl0SpellChoices.add("Ray of Frost");
            lvl0SpellChoices.add("Shocking Grasp");
            lvl0SpellChoices.add("True Strike");
            
            lvl1SpellChoices.add("Burning Hands");
            lvl1SpellChoices.add("Charm Person");
            lvl1SpellChoices.add("Chromatic Orb");
            lvl1SpellChoices.add("Color Spray");
            lvl1SpellChoices.add("Comprehend Languages");
            lvl1SpellChoices.add("Detect Magic");
            lvl1SpellChoices.add("Disguise Self");
            lvl1SpellChoices.add("Expeditious Retreat");
            lvl1SpellChoices.add("False Life");
            lvl1SpellChoices.add("Feather Fall");
            lvl1SpellChoices.add("Fog Cloud");
            lvl1SpellChoices.add("Jump");
            lvl1SpellChoices.add("Mage Armor");
            lvl1SpellChoices.add("Magic Missile");
            lvl1SpellChoices.add("Ray of Sickness");
            lvl1SpellChoices.add("Shield");
            lvl1SpellChoices.add("Silent Image");
            lvl1SpellChoices.add("Sleep");
            lvl1SpellChoices.add("Thunderwave");
            lvl1SpellChoices.add("Witch Bolt");
        }
        else if (className.equals("Warlock")){
            lvl0SpellCount = 2;
            lvl1SpellCount = 2;
            
            lvl0SpellChoices.add("Blade Ward");
            lvl0SpellChoices.add("Chill Touch");
            lvl0SpellChoices.add("Eldritch Blast");
            lvl0SpellChoices.add("Friends");
            lvl0SpellChoices.add("Mage Hand");
            lvl0SpellChoices.add("Minor Illusion");
            lvl0SpellChoices.add("Poison Spray");
            lvl0SpellChoices.add("Prestidigitation");
            lvl0SpellChoices.add("True Strike");
            
            lvl1SpellChoices.add("Armor of Agathys");
            lvl1SpellChoices.add("Arms of Hadar");
            lvl1SpellChoices.add("Charm Person");
            lvl1SpellChoices.add("Comprehend Languages");
            lvl1SpellChoices.add("Expeditious Retreat");
            lvl1SpellChoices.add("Hellish Rebuke");
            lvl1SpellChoices.add("Hex");
            lvl1SpellChoices.add("Illusory Script");
            lvl1SpellChoices.add("Protection from Evil and Good");
            lvl1SpellChoices.add("Unseen Servant");
            lvl1SpellChoices.add("Witch Bolt");
            
            if (subClass.equals("The Archfey")){
                lvl1SpellChoices.add("Faerie Fire");
                lvl1SpellChoices.add("Sleep");
            }
            if (subClass.equals("The Fiend")){
                lvl1SpellChoices.add("Burning Hands");
                lvl1SpellChoices.add("Command");
            }
            if (subClass.equals("The Great Old One")){
                lvl1SpellChoices.add("Dissonant Whispers");
                lvl1SpellChoices.add("Tasha's Hideous Laughter");
            }
        }
        else if (className.equals("Wizard")){
            lvl0SpellCount = 3;
            lvl1SpellCount = 6;
            
            lvl0SpellChoices.add("Acid Splash");
            lvl0SpellChoices.add("Blade Ward");
            lvl0SpellChoices.add("Chill Touch");
            lvl0SpellChoices.add("Dancing Lights");
            lvl0SpellChoices.add("Fire Bolt");
            lvl0SpellChoices.add("Friends");
            lvl0SpellChoices.add("Light");
            lvl0SpellChoices.add("Mage Hand");
            lvl0SpellChoices.add("Mending");
            lvl0SpellChoices.add("Message");
            lvl0SpellChoices.add("Minor Illusion");
            lvl0SpellChoices.add("Poison Spray");
            lvl0SpellChoices.add("Prestidigitation");
            lvl0SpellChoices.add("Ray of Frost");
            lvl0SpellChoices.add("Shocking Grasp");
            lvl0SpellChoices.add("True Strike");
            
            lvl1SpellChoices.add("Alarm");
            lvl1SpellChoices.add("Burning Hands");
            lvl1SpellChoices.add("Charm Person");
            lvl1SpellChoices.add("Chromatic Orb");
            lvl1SpellChoices.add("Color Spray");
            lvl1SpellChoices.add("Comprehend Languages");
            lvl1SpellChoices.add("Detect Magic");
            lvl1SpellChoices.add("Disguise Self");
            lvl1SpellChoices.add("Expeditious Retreat");
            lvl1SpellChoices.add("False Life");
            lvl1SpellChoices.add("Feather Fall");
            lvl1SpellChoices.add("Find Familiar");
            lvl1SpellChoices.add("Fog Cloud");
            lvl1SpellChoices.add("Grease");
            lvl1SpellChoices.add("Identify");
            lvl1SpellChoices.add("Illusory Script");
            lvl1SpellChoices.add("Jump");
            lvl1SpellChoices.add("Longstrider");
            lvl1SpellChoices.add("Mage Armor");
            lvl1SpellChoices.add("Magic Missile");
            lvl1SpellChoices.add("Protection from Evil and Good");
            lvl1SpellChoices.add("Ray of Sickness");
            lvl1SpellChoices.add("Shield");
            lvl1SpellChoices.add("Silent Image");
            lvl1SpellChoices.add("Sleep");
            lvl1SpellChoices.add("Tasha's Hideous Laughter");
            lvl1SpellChoices.add("Tenser's Floating Disk");
            lvl1SpellChoices.add("Thunderwave");
            lvl1SpellChoices.add("Unseen Servant");
            lvl1SpellChoices.add("Witch Bolt");
        }
        
        
        
        
        int remaining = lvl0SpellCount;
        while (remaining > 0 && lvl0SpellChoices.size()>0){
            int choice = randomNumber(lvl0SpellCount);
            String spell = lvl0SpellChoices.get(choice);
            if (!lvl0spells.contains(spell)){
                lvl0spells.add(spell);
                remaining--;
            }
        }
        
        remaining = lvl1SpellCount;
        while (remaining > 0 && lvl1SpellChoices.size()>0){
            int choice = randomNumber(lvl1SpellCount);
            String spell = lvl1SpellChoices.get(choice);
            if (!lvl1spells.contains(spell)){
                lvl1spells.add(spell);
                remaining--;
            }
        }
        
    }
    
    private int randomNumber(int max){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(max);
    }
    
    public void addRaceSpell(String race){
        if (race.contains("Elf")){
            if (race.contains("High")){
                ArrayList<String> lvl0SpellChoices = new ArrayList<String>();
                
                lvl0SpellChoices.add("Acid Splash");
                lvl0SpellChoices.add("Blade Ward");
                lvl0SpellChoices.add("Chill Touch");
                lvl0SpellChoices.add("Dancing Lights");
                lvl0SpellChoices.add("Fire Bolt");
                lvl0SpellChoices.add("Friends");
                lvl0SpellChoices.add("Light");
                lvl0SpellChoices.add("Mage Hand");
                lvl0SpellChoices.add("Mending");
                lvl0SpellChoices.add("Message");
                lvl0SpellChoices.add("Minor Illusion");
                lvl0SpellChoices.add("Poison Spray");
                lvl0SpellChoices.add("Prestidigitation");
                lvl0SpellChoices.add("Ray of Frost");
                lvl0SpellChoices.add("Shocking Grasp");
                lvl0SpellChoices.add("True Strike");
                
                int choice = randomNumber(lvl0SpellChoices.size());
                lvl0spells.add(lvl0SpellChoices.get(choice));
                this.spellCastingExceptionSpells.add(lvl0SpellChoices.get(choice));
                this.spellCastingExceptionAbilities.add("Intelligence");
            }
            else if (race.contains("Dark")){
                lvl0spells.add("Dancing Lights");
                //lvl1spells.add("Faerie Fire");
                //lvl2spells.add("Darkness");
                
                this.spellCastingExceptionSpells.add("Dancing Lights");
                this.spellCastingExceptionAbilities.add("Charisma");
                
                //this.spellCastingExceptionSpells.add("Faerie Fire");
                //this.spellCastingExceptionAbilities.add("Charisma");
                
                //this.spellCastingExceptionSpells.add("Darkness");
                //this.spellCastingExceptionAbilities.add("Charisma");
            }
        }
        else if (race.contains("Gnome")){
            if (race.contains("Forest")){
                lvl0spells.add("Minor Illusion");
                
                this.spellCastingExceptionSpells.add("Minor Illusion");
                this.spellCastingExceptionAbilities.add("Intelligence");
            }
        }
        else if (race.contains("Tiefling")){
            lvl0spells.add("Thaumaturgy");
            
            //lvl1spells.add("Hellish Rebuke");
            //lvl2spells.add("Darkness");
            
            this.spellCastingExceptionSpells.add("Thaumaturgy");
            this.spellCastingExceptionAbilities.add("Charisma");
            
            //this.spellCastingExceptionSpells.add("Hellish Rebuke");
            //this.spellCastingExceptionAbilities.add("Charisma");

            //this.spellCastingExceptionSpells.add("Darkness");
            //this.spellCastingExceptionAbilities.add("Charisma");
        }
    }
}
/*
    private void addAllSpells() {
        String spellDesc = "You hurl a bubble of acid. "
                + "Choose one creature within range, or choose two creatures "
                + "within range that are within 5 feet of each other. A target "
                + "must succeed on a Dexterity saving throw or take 1d6 acid "
                + "damage.  This spell's damage increases by 1d6 when you "
                + "reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).";
        Spell spell = new Spell("Acid Splash", 0, spellDesc, "Conjuration", 1, 
            "Action", 60, "Feet", true, true, false, null, false, false, 
                0, "Instantaneous");
        allSpells.add(spell);
        
        ArrayList<String> MCs = new ArrayList<String>();
        MCs.add("a tiny strip of white cloth");
        spellDesc = "Your spell bolsters your allies with toughness and resolve."
                + " Choose up to three creatures within range. Each target’s hit"
                + " point maximum and current hit points increase by 5 for the "
                + "duration.\n\n  "
                + "At Higher Levels: When you cast this spell using "
                + "a spell slot of 3rd level or higher, a target’s hit points "
                + "increase by an additional 5 for each slot level above 2nd.";
        spell = new Spell("Aid", 2, spellDesc, "Abjuration", 1, 
            "Action", 30, "Feet", true, true, true, MCs, false, false, 
                8, "Hours");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a tiny bell");
        MCs.add("a piece of fine silver wire");
        spellDesc = "You set an alarm against unwanted intrusion. Choose a door,"
                + " a window, or an area within range that is no larger than a "
                + "20-foot cube. Until the spell ends, an alarm alerts you "
                + "whenever a Tiny or larger creature touches or enters the "
                + "warded area. When you cast the spell, you can designate "
                + "creatures that won’t set off the alarm. You also choose "
                + "whether the alarm is mental or audible. A mental alarm "
                + "alerts you with a ping in your mind if you are within 1 "
                + "mile of the warded area. This ping awakens you if you are "
                + "sleeping. An audible alarm produces the sound of a hand "
                + "bell for 10 seconds within 60 feet.";
        spell = new Spell("Alarm", 1, spellDesc, "Abjuration", 1, 
            "Minute", 30, "Feet", true, true, true, MCs, false, true, 
                8, "Hours");
        allSpells.add(spell);
        
        spellDesc = "You assume a different form. When you cast the spell, "
                + "choose one of the following options, the effects of which "
                + "last for the duration of the spell. While the spell lasts, "
                + "you can end one option as an action to gain the benefits of "
                + "a different one. \n\n "
                + "Aquatic Adaptation: You adapt your body to an aquatic "
                + "environment, sprouting gills and growing webbing between "
                + "your fingers. You can breathe underwater and gain a swimming "
                + "speed equal to your walking speed. \n\n  "
                + "Change Appearance: You transform your appearance. You "
                + "decide what you look like, including your height, weight, "
                + "facial features, sound of your voice, hair length, "
                + "coloration, and distinguishing characteristics, if any. "
                + "You can make yourself appear as a member of another race, "
                + "though none of your statistics change. You also can't "
                + "appear as a creature of a different size than you, and "
                + "your basic shape stays the same; if you're bipedal, you "
                + "can't use this spell to become quadrupedal, for instance. "
                + "At any time for the duration of the spell, you can use "
                + "your action to change your appearance in this way again. \n\n"
                + "Natural Weapons: You grow claws, fangs, spines, horns, "
                + "or a different natural weapon of your choice. Your "
                + "unarmed strikes deal 1d6 bludgeoning, piercing, or "
                + "slashing damage, as appropriate to the natural weapon "
                + "you chose, and you are proficient with your unarmed strikes. "
                + "Finally, the natural weapon is magic and you have a +1 "
                + "bonus to the attack and damage rolls you make using it.";
        spell = new Spell("Alter Self", 2, spellDesc, "Transmutation", 1, 
            "Action", 0, "Self", true, true, false, null, true, false, 
                1, "Hour");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a morsel of food");
        spellDesc = "This spell lets you convince a beast that you mean it no "
                + "harm. Choose a beast that you can see within range. "
                + "It must see and hear you. If the beast’s Intelligence "
                + "is 4 or higher, the spell fails. Otherwise, the beast "
                + "must succeed on a Wisdom saving throw or be charmed by "
                + "you for the spell’s duration. If you or one of your "
                + "companions harms the target, the spell ends. \n\n "
                + "At Higher Levels: When you cast this spell using a spell "
                + "slot of 2nd level or higher, you can affect one additional "
                + "beast for each slot level above 1st.";
        spell = new Spell("Animal Friendship", 1, spellDesc, "Enchantment", 1, 
            "Action", 30, "Feet", true, true, true, MCs, false, false, 
                24, "Hours");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a morsel of food");
        spellDesc = "By means of this spell, you use an animal to deliver a "
                + "message. Choose a Tiny beast you can see with in range, "
                + "such as a squirrel, a blue jay, or a bat. You specify a "
                + "location , which you must have visited, and a recipient "
                + "who matches a general description , such as “a man or "
                + "woman dressed in the uniform of the town guard” or “a "
                + "red-haired dwarf wearing a pointed hat.” You also speak "
                + "a message of up to twenty-five words. The target beast "
                + "travels for the duration of the spell toward the specified "
                + "location, covering about 50 miles per 24 hours for a "
                + "flying messenger, or 25 miles for other animals.  "
                + "When the messenger arrives, it delivers your message "
                + "to the creature that you described, replicating the "
                + "sound of your voice. The messenger speaks only to a "
                + "creature matching the description you gave. If the "
                + "messenger doesn’t reach its destination before the spell "
                + "ends, the message is lost, and the beast makes its way "
                + "back to where you cast this spell.\n\n"
                + "At Higher Levels: If you cast this spell using a spell "
                + "slot of 3rd level or higher, the duration of the spell "
                + "increases by 48 hours for each slot level above 2nd.";
        spell = new Spell("Animal Messenger", 2, spellDesc, "Enchantment", 1, 
            "Action", 30, "Feet", true, true, true, MCs, false, true, 
                24, "Hours");
        allSpells.add(spell);
        
        spellDesc = "Your magic turns others into beasts. Choose any number of "
                + "willing creatures that you can see within range. You "
                + "transform each target into the form of a Large or smaller "
                + "beast with a challenge rating of 4 or lower. On subsequent "
                + "turns, you can use your action to transform affected "
                + "creatures into new forms.  The transformation lasts for "
                + "the duration for each target, or until the target drops "
                + "to 0 hit points or dies. You can choose a different form "
                + "for each target. A target’s game statistics are replaced "
                + "by the statistics of the chosen beast, though the target "
                + "retains its alignment and Intelligence, Wisdom and Charisma "
                + "scores. The target assumes the hit points of its new form, "
                + "and when it reverts to its normal form, it returns to the "
                + "number of hit points it had before it transformed. If it "
                + "reverts as a result of dropping to 0 hit points, any "
                + "excess damage carries over to its normal form. As long as "
                + "the excess damage doesn't reduce the creature’s normal form "
                + "to 0 hit points, it isn't knocked unconscious. The creature "
                + "is limited in the actions it can perform by the nature of "
                + "its new form, and it can’t speak or cast spells.  "
                + "The target’s gear melds into the new form. The target can’t "
                + "activate, wield, or otherwise benefit from any of its "
                + "equipment.";
        spell = new Spell("Animal Shapes", 8, spellDesc, "Transmutation", 1, 
            "Action", 30, "Feet", true, true, false, null, true, false, 
                24, "Hours");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a drop of blood");
        MCs.add("a piece of flesh");
        MCs.add("a pinch of bone dust");
        spellDesc = "This spell creates an undead servant. Choose a pile of "
                + "bones or a corpse of a medium or small humanoid within "
                + "range. Your spell imbues the target with a foul mimicry "
                + "of life, raising it as an undead creature. The target "
                + "becomes a skeleton if you chose bones or a zombie if "
                + "you chose a corpse (the DM has the creature’s game "
                + "statistics).  On each of your turns, you can use a bonus "
                + "action to mentally command any creature you made with this "
                + "spell if the creature is within 60 feet of you (if you "
                + "control multiple creatures, you can command any or all "
                + "of them at the same time, issuing the same command to "
                + "each one). You decide what action the creature will take "
                + "and where it will move during its next turn, or you can "
                + "issue a general command, such as to guard a particular "
                + "chamber or corridor. If you issue no commands, the "
                + "creature only defends itself against hostile creatures. "
                + "Once given an order, the creature continues to follow it "
                + "until its task is complete.  The creature is under your "
                + "control for 24 hours, after which it stops obeying any "
                + "command you’ve given it. To maintain control of the "
                + "creature for another 24 hours, you must cast this "
                + "spell on the creature again before the current 24-hour "
                + "period ends. This use of the spell reasserts your control "
                + "over up to four creatures you have animated with this "
                + "spell, rather than animating a new one.\n\n "
                + "At Higher Levels. When you cast this spell using a "
                + "spell slot of 4th level or higher, you animate or "
                + "reassert control over two additional undead creatures "
                + "for each slot level above 3rd. Each of the creatures "
                + "must come from a different corpse or pile of bones.";
        spell = new Spell("Animate Dead", 3, spellDesc, "Necromancy", 1, 
            "Minute", 10, "Feet", true, true, true, MCs, false, false, 
                0, "Instantaneous");
        allSpells.add(spell);
        
        spellDesc = "Objects come to life at your command. Choose up to ten "
                + "nonmagical objects within range that are not being worn or "
                + "carried. Medium targets count as two objects, Large targets "
                + "count as four objects, Huge targets count as eight objects. "
                + "You can’t animate any object larger than Huge. Each target "
                + "animates and becomes a creature under your control until "
                + "the spell ends or until reduced to 0 hit points.  "
                + "As a bonus action, you can mentally command any creature "
                + "you made with this spell if the creature is within 500 "
                + "feet of you (if you control multiple creatures, you can "
                + "command any or all of them at the same time, issuing the "
                + "same command to each one). You decide what action the "
                + "creature will take and where it will move during its next "
                + "turn, or you can issue a general command, such as to guard "
                + "a particular chamber or corridor. If you issue no commands, "
                + "the creature only defends itself against hostile creatures. "
                + "Once given an order, the creature continues to follow it "
                + "until its task is complete.\n\n  Animated Object Statistics"
                + "\n\nSize	HP	AC	Attack	Str	Dex\n"
                + "Tiny	20	18	+8 to hit, 1D4+4 damage	4	18\n"
                + "Small	25	16	+6 to hit, 1D8+2 damage	6	14\n"
                + "Medium	40	13	+5 to hit, 2D6+1 damage	10	12\n"
                + "Large	50	10	+6 to hit, 2D10+2 damage	14	10\n"
                + "Huge	80	10	+8 to hit, 2D12+4 damage	18	6\n\n"
                + "An animated object is a construct with AC, hit points, "
                + "attacks, Strength, and Dexterity determined by its size. "
                + "Its Constitution is 10 and its Intelligence and Wisdom are "
                + "3, and its Charisma is 1. Its speed is 30 feet; if the "
                + "object lacks legs or other appendages it can use for "
                + "locomotion, it instead has a flying speed of 30 feet and "
                + "can hover. If the object is securely attached to a surface "
                + "or a larger object, such as a chain bolted to a wall, its "
                + "speed is 0. It has blindsight with a radius of 30 feet and "
                + "is blind beyond that distance. When the animated object "
                + "drops to 0 hit points, it reverts to its original object "
                + "form, and any remaining damage carries over to its "
                + "original object form.  If you command an object to "
                + "attack, it can make a single melee attack against a "
                + "creature within 5 feet of it. It makes a slam attack "
                + "with an attack bonus and bludgeoning damage determined "
                + "by its size. The DM might rule that a specific object "
                + "inflicts slashing or piercing damage based on its form.\n\n"
                + "At Higher Levels. If you cast this spell using a spell slot "
                + "of 6th level or higher, you can animate two additional "
                + "objects for each slot level above 5th.";
        spell = new Spell("Animate Objects", 5, spellDesc, "Transmutation", 1, 
            "Action", 120, "Feet", true, true, false, null, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        spellDesc = "A shimmering barrier extends out from you in a 10-foot "
                + "radius and moves with you, remaining centered on you and "
                + "hedging out creatures other than undead and constructs. "
                + "The barrier lasts for the duration. The barrier prevents "
                + "an affected creature from passing or reaching through. "
                + "An affected creature can cast spells or make attacks "
                + "with ranged or reach weapons through the barrier. If "
                + "you move so that an affected creature is forced to pass "
                + "through the barrier, the spell ends.";
        spell = new Spell("Antilife Shell", 5, spellDesc, "Abjuration", 1, 
            "Action", 0, "Self", true, true, false, null, true, false, 
                1, "Hour");
        allSpells.add(spell);
        
        
        MCs = new ArrayList<String>();
        MCs.add("a pinch of powdered iron or iron filings");
        spellDesc = "A 10-foot-radius invisible sphere of antimagic surrounds "
                + "you. This area is divorced from the magical energy that "
                + "suffuses the multiverse. Within the sphere, spells can’t "
                + "be cast, summoned creatures disappear, and even magic "
                + "items become mundane. Until the spell ends, the sphere "
                + "moves with you, centered on you.  Spells and other magical "
                + "effects, except those created by an artifact or a deity, "
                + "are suppressed in the sphere and can’t protrude into it. "
                + "A slot expended to cast a suppressed spell is consumed. "
                + "While an effect is suppressed, it doesn’t function, but "
                + "the time it spends suppressed counts against its duration.\n\n"
                + "Targeted Effects. Spells and other magical effects, such "
                + "as Magic Missile and Charm Person, that target a creature "
                + "or an object in the sphere have no effect on that target.\n\n"
                + "Areas of Magic. The area of another spell or magical effect, "
                + "such as Fireball, can’t extend into the sphere. If the "
                + "sphere overlaps an area of magic, the part of the area "
                + "that is covered by the sphere is suppressed. For example, "
                + "the flames created by a Wall of Fire are suppressed within "
                + "the sphere, creating a gap in the wall if the overlap is "
                + "large enough.\n\n  Spells. Any active spell or other "
                + "magical effect on a creature or an object in the sphere "
                + "is suppressed while the creature or object is in it.\n\n"
                + "Magic Items. The properties and powers of magic items are "
                + "suppressed in the sphere. For example, a + 1 longsword in "
                + "the sphere functions as a nonmagical longsword.\n\n"
                + "A magic weapon’s properties and powers are suppressed if "
                + "it is used against a target in the sphere or wielded by "
                + "an attacker in the sphere. If a magic weapon or a piece "
                + "of magic ammunition fully leaves the sphere (for example, "
                + "if you fire a magic arrow or throw a magic spear at a "
                + "target outside the sphere), the magic of the item ceases "
                + "to be suppressed as soon as it exits.\n\n"
                + "Magical Travel. Teleportation and planar travel fail to "
                + "work in the sphere, whether the sphere is the destination "
                + "or the departure point for such magical travel. A portal "
                + "to another location, world, or plane of existence, as well "
                + "as an opening to an extradimensional space such as that "
                + "created by the Rope Trick spell, temporarily closes while "
                + "in the sphere.\n\n"
                + "Creatures and Objects. A creature or object summoned or "
                + "created by magic temporarily winks out of existence in the "
                + "sphere. Such a creature instantly reappears once the "
                + "space the creature occupied is no longer within the sphere.\n\n"
                + "Dispel Magic. Spells and magical effects such as Dispel "
                + "Magic have no effect on the sphere. Likewise, the spheres "
                + "created by different antimagic field spells don’t nullify "
                + "each other.";
        spell = new Spell("Antimagic Field", 8, spellDesc, "Abjuration", 1, 
            "Action", 0, "Self", true, true, true, MCs, true, false, 
                1, "Hour");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("either a lump of alum soaked in vinegar for the antipathy "
                + "effect or a drop of honey for the sympathy effect)");
        spellDesc = "This spell attracts or repels creatures of your choice. "
                + "You target something within range, either a Huge or smaller "
                + "object or creature or an area that is no larger than a "
                + "200-foot cube. Then specify a kind of intelligent creature, "
                + "such as red dragons, goblins, or vampires. You invest the "
                + "target with an aura that either attracts or repels the "
                + "specified creatures for the duration. Choose antipathy "
                + "or sympathy as the aura’s effect.\n\n"
                + "Antipathy. The enchantment causes creatures of the kind "
                + "you designated to feel an intense urge to leave the area "
                + "and avoid the target. When such a creature can see the "
                + "target or comes within 60 feet of it, the creature must "
                + "succeed on a Wisdom saving throw or become frightened. "
                + "The creature remains frightened while it can see the "
                + "target or is within 60 feet of it. While frightened by "
                + "the target, the creature must use its movement to move "
                + "to the nearest safe spot from which it can’t see the "
                + "target. If the creature moves more than 60 feet from "
                + "the target and can’t see it, the creature is no longer "
                + "frightened, but the creature becomes frightened again "
                + "if it regains sight of the target or moves within 60 "
                + "feet of it.\n\n"
                + "Sympathy. The enchantment causes the specified creatures "
                + "to feel an intense urge to approach the target while "
                + "within 60 feet of it or able to see it. When such a "
                + "creature can see the target or comes within 60 feet of "
                + "it, the creature must succeed on a Wisdom saving throw "
                + "or use its movement on each of its turns to enter the "
                + "area or move within reach of the target. When the "
                + "creature has done so, it can’t willingly move away from "
                + "the target. If the target damages or otherwise harms an "
                + "affected creature, the affected creature can make a "
                + "Wisdom saving throw to end the effect, as described below.\n\n"
                + "Ending the Effect. If an affected creature ends its turn "
                + "while not within 60 feet of the target or able to see "
                + "it, the creature makes a Wisdom saving throw. On a "
                + "successful save, the creature is no longer affected by "
                + "the target and recognizes the feeling of repugnance or "
                + "attraction as magical. In addition, a creature affected "
                + "by the spell is allowed another Wisdom saving throw "
                + "every 24 hours while the spell persists. A creature that "
                + "successfully saves against this effect is immune to it "
                + "for 1 minute, after which time it can be affected again.";
        spell = new Spell("Antipathy/Sympathy", 8, spellDesc, "Enchantment", 1, 
            "Hour", 60, "Feet", true, true, true, MCs, false, false, 
                10, "Days");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a bit of bat fur");
        spellDesc = "You create an invisible, magical eye within range that "
                + "hovers in the air for the duration.  You mentally receive "
                + "visual information from the eye, which has normal vision "
                + "and darkvision out to 30 feet. The eye can look in every "
                + "direction.  As an action, you can move the eye up to 30 "
                + "feet in any direction. There is no limit to how far away "
                + "from you the eye can move, but it can’t enter another "
                + "plane of existence. A solid barrier blocks the eye’s "
                + "movement, but the eye can pass through an opening as small "
                + "as 1 inch in diameter.";
        spell = new Spell("Arcane Eye", 4, spellDesc, "Divination", 1, 
            "Action", 30, "Feet", true, true, true, MCs, true, false, 
                1, "Hour");
        allSpells.add(spell);
        
        spellDesc = "You create linked teleportation portals that remain open "
                + "for the duration. Choose two points on the ground that you "
                + "can see, one point within 10 feet of you and one point "
                + "within 500 feet of you. A circular portal, 10 feet in "
                + "diameter, opens over each point. If the portal would "
                + "open in the space occupied by a creature, the spell fails, "
                + "and the casting is lost.  The portals are two-dimensional "
                + "glowing rings filled with mist, hovering inches from the "
                + "ground and perpendicular to it at the points you choose. "
                + "A ring is visible only from one side (your choice), which "
                + "is the side that functions as a portal.  Any creature or "
                + "object entering the portal exits from the other portal "
                + "as if the two were adjacent to each other; passing "
                + "through a portal from the nonportal side has no effect. "
                + "The mist that fills each portal is opaque and blocks "
                + "vision through it. On your turn, you can rotate the rings "
                + "as a bonus action so that the active side faces in a "
                + "different direction.";
        spell = new Spell("Arcane Gate", 6, spellDesc, "Conjuration", 1, 
            "Action", 500, "Feet", true, true, false, null, true, false, 
                10, "Minutes");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("gold dust worth at least 25 gp, which the spell consumes");
        spellDesc = "You touch a closed door, window, gate, chest, or "
                + "other entryway, and it becomes locked for the duration. "
                + "You and the creatures you designate when you cast this "
                + "spell can open the object normally. You can also set a "
                + "password that, when spoken within 5 feet of the object, "
                + "suppresses this spell for 1 minute. Otherwise, it is "
                + "impassable until it is broken or the spell is dispelled "
                + "or suppressed. Casting knock on the object suppresses "
                + "arcane lock for 10 minutes.  While affected by this "
                + "spell, the object is more difficult to break or "
                + "force open; the DC to break it or pick any locks "
                + "on it increases by 10.";
        spell = new Spell("Arcane Lock", 2, spellDesc, "Abjuration", 1, 
            "Action", 0, "Touch", true, true, true, MCs, false, false, 
                0, "Until Dispelled");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a cup of water");
        spellDesc = "A protective magical force surrounds you, manifesting "
                + "as a spectral frost that covers you and your gear. You "
                + "gain 5 temporary hit points for the duration. If a "
                + "creature hits you with a melee attack while you have "
                + "these hit points, the creature takes 5 cold damage.\n\n"
                + "At Higher Levels: When you cast this spell using a "
                + "spell slot of 2nd level or higher, both the temporary "
                + "hit points and the cold damage increase by 5 for "
                + "each slot level above 1st.";
        spell = new Spell("Armor of Agathys", 1, spellDesc, "Abjuration", 1, 
            "Action", 0, "Self", true, true, true, MCs, false, false, 
                1, "Hour");
        allSpells.add(spell);
        
        spellDesc = "A protective magical force surrounds you, manifesting "
                + "as a spectral frost that covers you and your gear. You "
                + "gain 5 temporary hit points for the duration. If a "
                + "creature hits you with a melee attack while you have "
                + "these hit points, the creature takes 5 cold damage.\n\n"
                + "At Higher Levels: When you cast this spell using a "
                + "spell slot of 2nd level or higher, both the temporary "
                + "hit points and the cold damage increase by 5 for "
                + "each slot level above 1st.";
        spell = new Spell("Arms of Hadar", 1, spellDesc, "Conjuration", 1, 
            "Action", 0, "Self", true, true, false, null, false, false, 
                0, "Instantaneous");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("for each creature you affect with this spell, you must provide "
                + "one jacinth worth at least 1000 GP, which the spell consumes");
        MCs.add("for each creature you affect with this spell, you must "
                + "provide one ornately carved bar of silver worth at "
                + "least 100 GP, which the spell consumes");
        spellDesc = "You and up to eight willing creatures within range "
                + "project your astral bodies into the Astral Plane (the "
                + "spell fails and the casting is wasted if you are already "
                + "on that plane). The material body you leave behind is "
                + "unconscious and in a state of suspended animation; it "
                + "doesn’t need food or air and doesn’t age.  Your astral "
                + "body resembles your mortal form in almost every way, "
                + "replicating your game statistics and possessions. The "
                + "principal difference is the addition of a silvery cord "
                + "that extends from between your shoulder blades and trails "
                + "behind you, fading to invisibility after 1 foot. This "
                + "cord is your tether to your material body. As long as "
                + "the tether remains intact, you can find your way home. "
                + "If the cord is cut —something that can happen only when "
                + "an effect specifically states that it does— your soul "
                + "and body are separated, killing you instantly.  Your astral "
                + "form can freely travel through the Astral Plane and can "
                + "pass through portals there leading to any other plane. "
                + "If you enter a new plane or return to the plane you were "
                + "on when casting this spell, your body and possessions are "
                + "transported along the silver cord, allowing you to re-enter "
                + "your body as you enter the new plane. Your astral form is "
                + "a separate incarnation. Any damage or other effects that "
                + "apply to it have no effect on your physical body, nor do "
                + "they persist when you return to it.  The spell ends for "
                + "you and your companions when you use your action to dismiss "
                + "it. When the spell ends, the affected creature returns "
                + "to its physical body, and it awakens.  The spell might "
                + "also end early for you or one of your companions. A "
                + "successful dispel magic spell used against an astral or "
                + "physical body ends the spell for that creature. If a "
                + "creature’s original body or its astral form drops to 0 "
                + "hit points, the spell ends for that creature. If the "
                + "spell ends and the silver cord is intact, the cord pulls "
                + "the creature’s astral form back to its body, ending its "
                + "state of suspended animation.  If you are returned to "
                + "your body prematurely, your companions remain in their "
                + "astral forms and must find their own way back to their "
                + "bodies, usually by dropping to 0 hit points.";
        spell = new Spell("Astral Projection", 9, spellDesc, "Necromancy", 1, 
            "Hour", 10, "Feet", true, true, true, MCs, false, false, 
                0, "Special");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("specially marked sticks, bones, or similar tokens worth at "
                + "least 25 gp");
        spellDesc = "By casting gem-inlaid sticks, rolling dragon bones, "
                + "laying out ornate cards, or employing some other divining "
                + "tool, you receive an omen from an otherworldly entity "
                + "about the results of a specific course of action that "
                + "you plan to take within the next 30 minutes. The DM "
                + "chooses from the following possible omens:  \n\n"
                + "Weal, for good results\n"
                + "Woe, for bad results\n"
                + "Weal and woe, for both good and bad results\n"
                + "Nothing, for results that aren’t especially good or bad\n\n"
                + "The spell doesn’t take into account any possible "
                + "circumstances that might change the outcome, such as "
                + "the casting of additional spells or the loss or gain "
                + "of a companion. If you cast the spell two or more times "
                + "before completing your next long rest, there is a "
                + "cumulative 25 percent chance for each casting after "
                + "the first that you get a random reading. The DM makes "
                + "this roll in secret.";
        spell = new Spell("Augury", 2, spellDesc, "Divination", 1, 
            "Minute", 0, "Self", true, true, true, MCs, false, true, 
                0, "Instantaneous");
        allSpells.add(spell);
        
        spellDesc = "Life-preserving energy radiates from you in an "
                + "aura with a 30-foot radius. Until the spell ends, "
                + "the aura moves with you, centered on you. Each "
                + "nonhostile creature in the aura (including you) has "
                + "resistance to necrotic damage, and its hit point "
                + "maximum can’t be reduced. In addition, a nonhostile, "
                + "living creature regains 1 hit point when it starts "
                + "its turn in the aura with 0 hit points.";
        spell = new Spell("Aura of Life", 4, spellDesc, "Abjuration", 1, 
            "Action", 0, "Self", true, false, false, null, true, false, 
                10, "Minutes");
        allSpells.add(spell);
        
        
        spellDesc = "Purifying energy radiates from you in an aura with a "
                + "30-foot radius.  Until the spell ends, the aura moves "
                + "with you, centered on you. Each nonhostile creature "
                + "in the aura (including you) can’t become diseased, "
                + "has resistance to poison damage, and has advantage on "
                + "saving throws against effects that cause any of the "
                + "following conditions: blinded, charmed, deafened, "
                + "frightened, paralyzed, poisoned, and stunned.";
        spell = new Spell("Aura of Purity", 4, spellDesc, "Abjuration", 1, 
            "Action", 0, "Self", true, false, false, null, true, false, 
                10, "Minutes");
        allSpells.add(spell);
        
        spellDesc = "Healing energy radiates from you in an aura with a "
                + "30-foot radius. Until the spell ends, the aura moves "
                + "with you, centered on you. You can use a bonus action "
                + "to cause one creature in the aura (including you) to "
                + "regain 2d6 hit points.";
        spell = new Spell("Aura of Vitality", 3, spellDesc, "Evocation", 1, 
            "Action", 0, "Self", true, false, false, null, true, false, 
                10, "Minutes");
        allSpells.add(spell);
        
        
        MCs = new ArrayList<String>();
        MCs.add("an agate worth at least 1,000 gp, which the spell consumes");
        spellDesc = "After spending the casting time tracing magical "
                + "pathways within a precious gem stone, you touch a "
                + "Huge or smaller beast or plant. The target must have "
                + "either no Intelligence score or an Intelligence of 3 "
                + "or less. The target gains an Intelligence of 10. The "
                + "target also gains the ability to speak one language you "
                + "know. If the target is a plant, it gains the ability "
                + "to move its limbs, roots, vines, creepers, and so forth, "
                + "and it gains senses similar to a human’s. Your DM chooses "
                + "statistics appropriate for the awakened plant, such as "
                + "the statistics for the awakened shrub or the awakened tree.  "
                + "The awakened beast or plant is charmed by you for 30 days "
                + "or until you or your companions do anything harmful to it. "
                + "When the charmed condition ends, the awakened creature "
                + "chooses whether to remain friendly to you, based on how "
                + "you treated it while it was charmed.";
        spell = new Spell("Awaken", 5, spellDesc, "Transmutation", 8, 
            "Hours", 0, "Touch", true, true, true, MCs, false, false, 
                0, "Instantaneous");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a drop of blood");
        spellDesc = "Up to three creatures of your choice that you can see "
                + "within range must make Charisma saving throws. Whenever "
                + "a target that fails this saving throw makes an attack roll "
                + "or a saving throw before the spell ends, the target must "
                + "roll a d4 and subtract the number rolled from the attack "
                + "roll or saving throw.  \n\n"
                + "At Higher Levels. When you cast this spell using a "
                + "spell slot of 2nd level or higher, you can target one "
                + "additional creature for each slot level above 1st.";
        spell = new Spell("Bane", 1, spellDesc, "Enchantment", 1, 
            "Action", 30, "Feet", true, true, true, MCs, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        spellDesc = "The next time you hit a creature with a weapon attack "
                + "before this spell ends, your weapon crackles with force, "
                + "and the attack deals an extra 5d10 force damage to the "
                + "target. Additionally, if this attack reduces the target "
                + "to 50 hit points or fewer, you banish it. If the target "
                + "is native to a different plane of existence than the one "
                + "you’re on, the target disappears, returning to its home "
                + "plane. If the target is native to the plane you’re on, "
                + "the creature vanishes into a harmless demiplane. While "
                + "there, the target is incapacitated. It remains there "
                + "until the spell ends, at which point the target reappears "
                + "in the space it left or in the nearest unoccupied space "
                + "if that space is occupied.";
        spell = new Spell("Banishing Smite", 5, spellDesc, "Abjuration", 1, 
            "Bonus Action", 0, "Self", true, false, false, null, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("an item distasteful to the target");
        spellDesc = "You attempt to send one creature that you can see within "
                + "range to another plane of existence. The target must "
                + "succeed on a Charisma saving throw or be banished.  If the "
                + "target is native to the plane of existence you're on, you "
                + "banish the target to a harmless demiplane. While there, "
                + "the target is incapacitated. The target remains there "
                + "until the spell ends, at which point the target reappears "
                + "in the space it left or in the nearest unoccupied space "
                + "if that space is occupied.  If the target is native to a "
                + "different plane of existence than the one you're on, the "
                + "target is banished with a faint popping noise, returning "
                + "to its home plane. If the spell ends before 1 minute has "
                + "passed, the target reappears in the space it left or in "
                + "the nearest unoccupied space if that space is occupied. "
                + "Otherwise, the target doesn't return.\n\n"
                + "At Higher Levels. When you cast this spell using a spell "
                + "slot of 5th level or higher, you can target one additional "
                + "creature for each slot above 4th.";
        spell = new Spell("Banishment", 4, spellDesc, "Abjuration", 1, 
            "Action", 60, "Feet", true, true, true, MCs, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a handful of oak bark");
        spellDesc = "You touch a willing creature. Until the spell ends, "
                + "the target’s skin has a rough, bark-like appearance, "
                + "and the target’s AC can’t be less than 16, regardless "
                + "of what kind of armor it is wearing.";
        spell = new Spell("Barkshin", 2, spellDesc, "Transmutation", 1, 
            "Action", 0, "Touch", true, true, true, MCs, true, false, 
                1, "Hour");
        allSpells.add(spell);
        
        spellDesc = "This spell bestows hope and vitality. Choose any "
                + "number of creatures within range. For the duration, "
                + "each target has advantage on Wisdom saving throws and "
                + "death saving throws, and regains the maximum number of "
                + "hit points possible from any healing.";
        spell = new Spell("Beacon of Hope", 3, spellDesc, "Abjuration", 1, 
            "Action", 30, "Feet", true, true, false, null, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        spellDesc = "You touch a willing beast. For the duration of the spell"
                + ", you can use your action to see through the beast’s eyes "
                + "and hear what it hears, and continue to do so until you use "
                + "your action to return to your normal senses.  While "
                + "perceiving through the beast’s senses, you gain the "
                + "benefits of any special senses possessed by that creature, "
                + "though you are blinded and deafened to your own "
                + "surroundings.";
        spell = new Spell("Beast Sense", 2, spellDesc, "Divination", 1, 
            "Action", 0, "Touch", false, true, false, null, true, true, 
                1, "Hour");
        allSpells.add(spell);
        
        spellDesc = "You touch a creature, and that creature must succeed on a "
                + "Wisdom saving throw or become cursed for the duration of "
                + "the spell. When you cast this spell, choose the nature of "
                + "the curse from the following options: \n\n"
                + "Choose one ability score. While cursed, the target has "
                + "disadvantage on ability checks and saving throws made "
                + "with that ability score.  \nWhile cursed, the target "
                + "has disadvantage on attack rolls against you.  \n"
                + "While cursed, the target must make a Wisdom saving throw "
                + "at the start of each of its turns. If it fails, it wastes "
                + "its action that turn doing nothing.  \n"
                + "While the target is cursed, your attacks and spells "
                + "deal an extra 1d8 necrotic damage to the target. A remove "
                + "curse spell ends this effect.  \n\nAt the DM’s option, you "
                + "may choose an alternative curse effect, but it should be "
                + "no more powerful than those described above. The DM has "
                + "final say on such a curse’s effect.  \n\n"
                + "At Higher Levels. If you cast this spell using a spell "
                + "slot of 4th level or higher, the duration is concentration, "
                + "up to 10 minutes. If you use a spell slot of 5th level or "
                + "higher, the duration is 8 hours. If you use a spell slot"
                + " of 7th level or higher, the duration is 24 hours. If you "
                + "use a 9th level spell slot, the spell lasts until it is "
                + "dispelled. Using a spell slot of 5th level or higher grants "
                + "a duration that doesn’t require concentration.";
        spell = new Spell("Bestow Curse", 3, spellDesc, "Necromancy", 1, 
            "Action", 0, "Touch", true, true, false, null, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("an eggshell");
        MCs.add("a snakeskin glove");
        spellDesc = "You create a hand of shimmering, translucent force in an "
                + "unoccupied space that you can see within range. The hand "
                + "is considered Large. The hand lasts for the duration, and "
                + "it moves at your command, mimicking the movements of your "
                + "own hand.  The hand is an object that has AC 20 and hit "
                + "points equal to your hit point maximum. If it drops to 0 "
                + "hp, the spell ends. It has a Strength of 26 (+8) and a "
                + "Dexterity of 10 (+0). The hand doesn't fill its space.  "
                + "When you cast the spell and as a bonus action on your "
                + "subsequent turns, the hand can move up to 60 ft and then "
                + "cause one of the following effects with it: \n\nClenched "
                + "Fist. The hand strikes one creature or object within 5 ft. "
                + "Make a melee spell attack for the hand using your game "
                + "statistics. On a successful hit, the target takes 4D8 "
                + "force damage.  \nForceful Hand. The hand attempts to "
                + "push a creature within 5 feet of it in a direction you "
                + "choose. Make a check with the hand's Strength contested "
                + "by the Strength (Athletics) check of the target. If the "
                + "target is Medium or smaller, you have advantage on the "
                + "check. If you succeed, the hand pushes the target up to "
                + "5 feet plus a number of feet equal to five times your "
                + "spellcasting ability modifier. The hand moves with the "
                + "target to remain within 5 feet of it.  \nGrasping Hand. "
                + "The hand attempts to grapple a Huge or smaller creature "
                + "within 5 feet of it. You use the hand's Strength score "
                + "to resolve the grapple. If the target is Medium or smaller, "
                + "you have advantage on the check. While the hand is "
                + "grappling the target, you can use a bonus action to have "
                + "the hand crush it. When you do so, the target takes "
                + "bludgeoning damage equal to 2D6 + your spellcasting "
                + "ability modifier.  \nInterposing Hand. The hand interposes "
                + "itself between you and a creature of your choice until you "
                + "give the hand a different command. The hand moves to stay "
                + "between you and the target, providing you with half cover "
                + "against the target. The target can't move through the "
                + "hand's space if its Strength score is less than or equal "
                + "the hand's Strength score. If its Strength score is higher "
                + "than the hand's Strength score, the target can move toward "
                + "you through the hand's space, but that space is considered "
                + "difficult terrain for the target.  \n\nAt Higher Levels. "
                + "When you cast this spell using a spell slot of 6th level "
                + "or higher, for each slot level above 5th, damage from "
                + "Clenched Fist increases by 2D8 and damage from the Grasping "
                + "Hand increases by 2D6 for each slot level above 5th.";
        spell = new Spell("Bigby's Hand", 5, spellDesc, "Evocation", 1, 
            "Action", 120, "Feet", true, true, true, MCs, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        spellDesc = "You extend your hand and trace a sigil of warding in the "
                + "air. Until the end of your next turn, you have resistance "
                + "against bludgeoning, piercing, and slashing damage dealt "
                + "by weapon attacks.";
        spell = new Spell("Blade Ward", 0, spellDesc, "Abjuration", 1, 
            "Action", 0, "Self", true, true, false, null, false, false, 
                1, "Round");
        allSpells.add(spell);
        
        MCs = new ArrayList<String>();
        MCs.add("a sprinkling of holy water");
        spellDesc = "You bless up to three creatures of your choice within "
                + "range. Whenever a target makes an attack roll or a saving "
                + "throw before the spell ends, the target can roll a d4 and "
                + "add the number rolled to the attack roll or saving throw.  \n\n"
                + "At Higher Levels. When you cast this spell using a spell "
                + "slot of 2nd level or higher, you can target one additional "
                + "creature for each slot level above 1st.";
        spell = new Spell("Bless", 1, spellDesc, "Enchantment", 1, 
            "Action", 30, "Feet", true, true, true, MCs, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        spellDesc = "Necromantic energy washes over a creature of your choice "
                + "that you can see within range, draining moisture and "
                + "vitality from it. The target must make a Constitution "
                + "saving throw. The target takes 8d8 necrotic damage on a "
                + "failed save, or half as much damage on a successful one. "
                + "This spell has no effect on undead or constructs.  If you "
                + "target a plant creature or a magical plant, it makes the "
                + "saving throw with disadvantage, and the spell deals "
                + "maximum damage to it.  If you target a non-magical plant "
                + "that isn’t a creature, such as a tree or shrub, it doesn’t "
                + "make a saving throw; it simply withers and dies.  \n\nAt "
                + "Higher Levels. When you cast this spell using a spell slot "
                + "of 5th level or higher, the damage increases by 1d8 for "
                + "each slot level above 4th.";
        spell = new Spell("Blight", 4, spellDesc, "Necromancy", 1, 
            "Action", 30, "Feet", true, true, false, null, false, false, 
                0, "Instantaneous");
        allSpells.add(spell);
        
        spellDesc = "The next time you hit a creature with a melee weapon "
                + "attack during this spell’s duration, you weapon flares "
                + "with a bright light, and the attack deals an extra 3d8 "
                + "radiant damage to the target. Additionally, the target "
                + "must succeed on a Constitution saving throw or be blinded "
                + "until the spell ends.  A creature blinded by this spell "
                + "makes another Constitution saving throw at the end of "
                + "each of its turns. On a successful save, it is no longer "
                + "blinded.";
        spell = new Spell("Blinding Smite", 3, spellDesc, "Evocation", 1, 
            "Bonus Action", 0, "Self", true, false, false, null, true, false, 
                1, "Minute");
        allSpells.add(spell);
        
        
        spellDesc = "You can blind or deafen a foe. Choose one creature that "
                + "you can see within range to make a Constitution saving "
                + "throw. If it fails, the target is either blinded or "
                + "deafened (your choice) for the duration. At the end of "
                + "each of its turns, the target can make a Constitution "
                + "saving throw. On a success, the spell ends.\n\nAt Higher "
                + "Levels. When you cast this spell using a spell slot of "
                + "3rd level or higher, you can target one additional "
                + "creature for each slot level above 2nd.";
        spell = new Spell("Blindness/Deafness", 2, spellDesc, "Necromancy", 1, 
            "Action", 30, "Feet", true, false, false, null, false, false, 
                1, "Minute");
        allSpells.add(spell);
        
        
        spellDesc = "Roll a d20 at the end of each of your turns for the "
                + "duration of the spell. On a roll of 11 or higher, you "
                + "vanish from your current plane of existence and appear "
                + "in the Ethereal Plane (the spell fails and the casting "
                + "is wasted if you were already on that plane). At the "
                + "start of your next turn, and when the spell ends if you "
                + "are on the Ethereal Plane, you return to an unoccupied "
                + "space of your choice that you can see within 10 feet of "
                + "the space you vanished from. If no unoccupied space is "
                + "available within that range, you appear in the nearest "
                + "unoccupied space (chosen at random if more than one "
                + "space is equally near). You can dismiss this spell as "
                + "an action.  While on the Ethereal Plane, you can see "
                + "and hear the plane you originated from, which is cast "
                + "in shades of gray, and you can’t see anything there "
                + "more than 60 feet away. You can only affect and be "
                + "affected by other creatures on the Ethereal Plane. "
                + "Creatures that aren’t there can’t perceive you or interact "
                + "with you, unless they have the ability to do so.";
        spell = new Spell("Blink", 3, spellDesc, "Transmutation", 1, 
            "Action", 0, "Self", true, true, false, null, false, false, 
                1, "Minute");
        allSpells.add(spell);
        
        spellDesc = "Your body becomes blurred, shifting and wavering to all "
                + "who can see you. For the duration, any creature has "
                + "disadvantage on attack rolls against you. An attacker is "
                + "immune to this effect if it doesn’t rely on sight, as "
                + "with blindsight, or can see through illusions, as "
                + "with truesight.";
        spell = new Spell("Blur", 2, spellDesc, "Illusion", 1, 
            "Action", 0, "Self", true, false, false, null, true, false, 
                1, "Minute");
        allSpells.add(spell);
    }
    */
