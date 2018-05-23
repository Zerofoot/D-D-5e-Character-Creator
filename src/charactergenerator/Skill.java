/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

/**
 *
 * @author Grant
 */
class Skill {
    String name;
    int score;
    boolean prof = false;
    
    Skill(String name, int score){
        this.name = name;
        this.score = score;
    }

    void printSkill() {
        System.out.println(name + ": " + score);
    }
    
}
