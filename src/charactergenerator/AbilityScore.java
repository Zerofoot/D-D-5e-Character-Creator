/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.util.*;

/**
 *
 * @author Grant
 */
class AbilityScore {
    
    private String statName;
    private int baseScore;
    private ArrayList<AbilityModifier> modifiers = new ArrayList<AbilityModifier>();
    private int effectiveScore;
    private int scoreModifier;

    AbilityScore(String stat) {
        this.statName = stat;
        this.baseScore = createBaseScore();
        this.effectiveScore = baseScore;
        scoreModifier = (effectiveScore - 10)/2;
    }

    private int createBaseScore() {
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for(int i = 0; i<4;i++){
            rolls.add((int) (Math.random()*6)+1);
        }
        int sum = 0;
        int min = 6;
        for(int j = 0; j<4;j++){
            if (rolls.get(j) < min){
                min = rolls.get(j);
            }
            sum += rolls.get(j);
        }
        return sum - min;
    }

    void print() {
        System.out.println(statName + ": " + effectiveScore);
    }

    void increase(String source, int i) {
        AbilityModifier am = new AbilityModifier(source, i);
        modifiers.add(am);
        effectiveScore += i;
        scoreModifier = (effectiveScore - 10)/2;
        
    }
    
    public int getEffectiveScore(){
        return effectiveScore;
    }
    
    public int getModifier(){
        return scoreModifier;
    }
}
