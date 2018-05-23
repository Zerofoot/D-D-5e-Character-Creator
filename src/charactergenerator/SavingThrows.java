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
class SavingThrows {
    
    int strST, intST, chrST, conST, wisST, dexST;
    boolean strProf, intProf, chrProf, conProf, wisProf, dexProf;
    int strWProf,intWProf,chrWProf,conWProf,wisWProf,dexWProf;
    
    ArrayList<String> strExceptionSource = new ArrayList<String>();
    ArrayList<String> intExceptionSource = new ArrayList<String>();
    ArrayList<String> chrExceptionSource = new ArrayList<String>();
    ArrayList<String> conExceptionSource = new ArrayList<String>();
    ArrayList<String> wisExceptionSource = new ArrayList<String>();
    ArrayList<String> dexExceptionSource = new ArrayList<String>();
    
    ArrayList<String> strExceptionTrigger = new ArrayList<String>();
    ArrayList<String> intExceptionTrigger = new ArrayList<String>();
    ArrayList<String> chrExceptionTrigger = new ArrayList<String>();
    ArrayList<String> conExceptionTrigger = new ArrayList<String>();
    ArrayList<String> wisExceptionTrigger = new ArrayList<String>();
    ArrayList<String> dexExceptionTrigger = new ArrayList<String>();
    
    ArrayList<String> strExceptionAdvantage = new ArrayList<String>();
    ArrayList<String> intExceptionAdvantage = new ArrayList<String>();
    ArrayList<String> chrExceptionAdvantage = new ArrayList<String>();
    ArrayList<String> conExceptionAdvantage = new ArrayList<String>();
    ArrayList<String> wisExceptionAdvantage = new ArrayList<String>();
    ArrayList<String> dexExceptionAdvantage = new ArrayList<String>();
    
    
    public SavingThrows(int str, int intel, int chr, int con, int wis, int dex){
        this.strST = str;
        this.intST = intel;
        this.dexST = dex;
        this.chrST = chr;
        this.conST = con;
        this.wisST = wis;
        
        this.strProf = false;
        this.intProf = false;
        this.dexProf = false;
        this.chrProf = false;
        this.conProf = false;
        this.wisProf = false;
        
        this.strWProf = str;
        this.intWProf = intel;
        this.dexWProf = dex;
        this.chrWProf = chr;
        this.conWProf = con;
        this.wisWProf = wis;
    }
    
    public void makeProfiecient(String stat, int prof){
        if (stat.equals("Strength")){
            strWProf += prof;
            strProf = true;
        }
        else if(stat.equals("Dexterity")){
            dexWProf += prof;
            dexProf = true;
        }
        else if(stat.equals("Constitution")){
            conWProf += prof;
            conProf = true;
        }
        else if(stat.equals("Intelligence")){
            intWProf += prof;
            intProf = true;
        }
        else if(stat.equals("Wisdom")){
            wisWProf += prof;
            wisProf = true;
        }
        else if(stat.equals("Charisma")){
            chrWProf += prof;
            chrProf = true;
        }
    }
    
    public void addException(String stat, String source, String trigger, String advantage){
        if (stat.equals("Strength")){
            strExceptionSource.add(source);
            strExceptionTrigger.add(trigger);
            strExceptionAdvantage.add(advantage);
        }
        else if(stat.equals("Dexterity")){
            dexExceptionSource.add(source);
            dexExceptionTrigger.add(trigger);
            dexExceptionAdvantage.add(advantage);
        }
        else if(stat.equals("Constitution")){
            conExceptionSource.add(source);
            conExceptionTrigger.add(trigger);
            conExceptionAdvantage.add(advantage);
        }
        else if(stat.equals("Intelligence")){
            intExceptionSource.add(source);
            intExceptionTrigger.add(trigger);
            intExceptionAdvantage.add(advantage);
        }
        else if(stat.equals("Wisdom")){
            wisExceptionSource.add(source);
            wisExceptionTrigger.add(trigger);
            wisExceptionAdvantage.add(advantage);
        }
        else if(stat.equals("Charisma")){
            chrExceptionSource.add(source);
            chrExceptionTrigger.add(trigger);
            chrExceptionAdvantage.add(advantage);
        }
    }
    
    public void printSavingThrows(){
        System.out.println("Saving Throws:");
        System.out.println("Strength: " + strWProf);
        for (int i = 0; i < strExceptionTrigger.size(); i++){
            System.out.println(strExceptionAdvantage.get(i) + " " +
                strExceptionTrigger.get(i) + " saving throws.");
        }
        
        System.out.println("Dexterity: " + dexWProf);
        for (int i = 0; i < dexExceptionTrigger.size(); i++){
            System.out.println(dexExceptionAdvantage.get(i) + " " +
                dexExceptionTrigger.get(i) + " saving throws.");
        }
        
        System.out.println("Constitution: " + conWProf);
        for (int i = 0; i < conExceptionTrigger.size(); i++){
            System.out.println(conExceptionAdvantage.get(i) + " " +
                conExceptionTrigger.get(i) + " saving throws.");
        }
        
        System.out.println("Intelligence: " + intWProf);
        for (int i = 0; i < intExceptionTrigger.size(); i++){
            System.out.println(intExceptionAdvantage.get(i) + " " +
                intExceptionTrigger.get(i) + " saving throws.");
        }
        
        System.out.println("Wisdom: " + wisWProf);
        for (int i = 0; i < wisExceptionTrigger.size(); i++){
            String advantage = "Disadvantage";
            System.out.println(wisExceptionAdvantage.get(i) + " " +
                    wisExceptionTrigger.get(i) + " saving throws.");
        }
        
        System.out.println("Charisma: " + chrWProf);
        for (int i = 0; i < chrExceptionTrigger.size(); i++){
            System.out.println(chrExceptionAdvantage.get(i) + " " +
                    chrExceptionTrigger.get(i) + " saving throws.");
        }
    }
    
}
