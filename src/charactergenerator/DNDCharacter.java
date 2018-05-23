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
class DNDCharacter {
    
    public String characterName;
    public DNDClass dndclass;
    public Race race;
    public String gender;
    public Background background;
    public AbilityScore strength, dexterity, constitution, wisdom, intelligence, charisma;
    public SavingThrows savingThrows;
    public DamageChanger damageChanger;
    public int walkSpeed, flySpeed, swimSpeed;
    public String vision;
    public Proficiencies proficiencies = new Proficiencies();
    public Skills skills;
    public int skillChoiceCount = 0;
    public ArrayList<String> languages = new ArrayList<String>();
    public int languagesChoices = 0;
    public int hp;
    int profBonus;
    public Equipment equipment = new Equipment();
    public Spellbook spellbook = new Spellbook();
    
    //private Skill persuasion;
    
    public DNDCharacter(){
        this.strength = new AbilityScore("Strength");
        this.dexterity = new AbilityScore("Dexterity");
        this.constitution = new AbilityScore("Constitution");
        this.wisdom = new AbilityScore("Wisdom");
        this.intelligence = new AbilityScore("Intelligence");
        this.charisma = new AbilityScore("Charisma");
        this.hp = 0;
        this.profBonus = 2;
        
        
        savingThrows = new SavingThrows(strength.getEffectiveScore(),dexterity.getEffectiveScore(),
                constitution.getEffectiveScore(), wisdom.getEffectiveScore(),
                intelligence.getEffectiveScore(), charisma.getEffectiveScore());
        
        damageChanger = new DamageChanger();
        chooseGender();
        skills = new Skills(this);
        race = new Race(this);

        characterName = race.chooseName(gender);
        this.dndclass = new DNDClass(this);
        background = new Background(this);
        addLanguages();
        skills.addSkillChoices(skillChoiceCount);
        dndclass.rogueSpecial(this);
        
        
         
        
        
        
        printCharacter();
    }
    
    public void printStats(){
        strength.print();
        dexterity.print();
        constitution.print();
        wisdom.print();
        intelligence.print();
        charisma.print();
    }
    
    private int randomNumber(int max){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(max);
    }

    public void printCharacter() {
        System.out.println("Name: " + this.characterName);
        race.printRace();
        dndclass.printClass();
        System.out.println("Hit Points: " + this.hp);
        System.out.println(vision);
        savingThrows.printSavingThrows();
        damageChanger.printChanges();
        proficiencies.printProf();
        skills.printSkills();
        printLanguages();
        printStats();
        equipment.printEquipment();
        background.printBackground();
    }

    private void chooseGender() {
        int random = randomNumber(1);
        if (random == 0){
            this.gender = "Male";
        }
        else{
            this.gender = "Female";
        }
    }

    private void printLanguages() {
        System.out.println("Languages: " + languages);
    }

    private void addLanguages() {
        ArrayList<String> languageChoices = new ArrayList<String>();
        languageChoices.add("Common");
        languageChoices.add("Dwarvish");
        languageChoices.add("Elvish");
        languageChoices.add("Giant");
        languageChoices.add("Gnomish");
        languageChoices.add("Goblin");
        languageChoices.add("Halfling");
        languageChoices.add("Orc");
        languageChoices.add("Abyssal");
        languageChoices.add("Celestial");
        languageChoices.add("Dragonic");
        languageChoices.add("Deep Speech");
        languageChoices.add("Infernal");
        languageChoices.add("Primordial");
        languageChoices.add("Sylvan");
        languageChoices.add("Undercommon");
        while (this.languagesChoices>0){
            int choice = (int) (Math.random()*languageChoices.size());
            if (!languages.contains(languageChoices.get(choice))){
                languages.add(languageChoices.get(choice));
                languagesChoices--;
            }
        }
    }

    void addLanguage(String language) {
        if (!languages.contains(language)){
            languages.add(language);
        }
    }
}
