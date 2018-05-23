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
class Skills {
    ArrayList<Skill> skills = new ArrayList<Skill>();
    
    ArrayList<String> skillExceptionName = new ArrayList<String>();
    ArrayList<String> skillExceptions = new ArrayList<String>();
    ArrayList<String> skillExceptionEffect = new ArrayList<String>();

    Skills(DNDCharacter player) {
        int str = (player.strength.getEffectiveScore()-10)/2;
        Skill athletics = new Skill("Athletics", str);
        skills.add(athletics);
        
        int dex = (player.dexterity.getEffectiveScore()-10)/2;
        Skill acrobatics = new Skill("Acrobatics", dex);
        skills.add(acrobatics);
        Skill sleightOfHand = new Skill("Sleight of hand", dex);
        skills.add(sleightOfHand);
        Skill stealth = new Skill("Stealth", dex);
        skills.add(stealth);
        
        int intel = (player.intelligence.getEffectiveScore()-10)/2;
        Skill arcana = new Skill("Arcana", intel);
        skills.add(arcana);
        Skill history = new Skill("History", intel);
        skills.add(history);
        Skill investigation = new Skill("Investigation", intel);
        skills.add(investigation);
        Skill nature = new Skill("Nature", intel);
        skills.add(nature);
        Skill religion = new Skill("Religion", intel);
        skills.add(religion);
        
        int wis = (player.wisdom.getEffectiveScore()-10)/2;
        Skill animalHandling = new Skill("Animal Handling", wis);
        skills.add(animalHandling);
        Skill insight = new Skill("Insight", wis);
        skills.add(insight);
        Skill medicine = new Skill("Medicine", wis);
        skills.add(medicine);
        Skill perception = new Skill("Perception", wis);
        skills.add(perception);
        Skill survival = new Skill("Survival", wis);
        skills.add(survival);
        
        int chr = (player.charisma.getEffectiveScore()-10)/2;
        Skill deception = new Skill("Deception", chr);
        skills.add(deception);
        Skill intimidation = new Skill("Intimidation", chr);
        skills.add(intimidation);
        Skill performance = new Skill("Performance", chr);
        skills.add(performance);
        Skill persuasion = new Skill("Persuasion", chr);
        skills.add(persuasion);
    }
    
    public void addSpecial(String name, String skill, String effect){
        skillExceptionName.add(name);
        skillExceptions.add(skill);
        skillExceptionEffect.add(effect);
    }

    void printSkills() {
        for (int i = 0; i< skills.size(); i++){
            skills.get(i).printSkill();
            for (int j = 0; j < skillExceptions.size(); j++){
                if (skillExceptions.get(j).equals(skills.get(i).name)) {
                    System.out.println(skillExceptionName.get(j) + ": " +
                            skillExceptions.get(j) + " " + skillExceptionEffect.get(j));
                }
            }
        }
    }

    void addProf(String skill) {
        for (int i = 0; i <skills.size(); i++){
                if (skills.get(i).name.equals(skill)){
                    skills.get(i).prof = true;
                }
            }
    }
    
    void addSkillChoices(int count){
        while(count>0){
            int choice = randomNumber(skills.size());
            if(skills.get(choice).prof == false){
                skills.get(choice).prof = true;
                count--;
            }
        }
    }
    
    private int randomNumber(int max){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(max);
    }
}
