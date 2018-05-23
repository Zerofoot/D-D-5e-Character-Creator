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
public class Spell {
    String name;
    int level;
    String description;
    String schoolOfMagic;
    int castTime;
    String castTimeUnit;
    int range;
    String rangeUnit;
    Boolean verbalComponent, somaticComponent, materialComponent;
    ArrayList<String> materialComponents = new ArrayList<String>();
    Boolean concentration, ritual;
    int duration;
    String durationUnit;
    
    public Spell(String name, int level, String description, String schoolOfMagic,
            int castTime, String castTimeUnit, int range, String rangeUnit,
            Boolean VC, Boolean SC, Boolean MC, ArrayList<String> MCs, Boolean conc, 
            Boolean ritual, int duration, String durationUnit){
        this.name = name;
        this.level = level;
        this.description = description;
        this.schoolOfMagic = schoolOfMagic;
        this.castTime = castTime;
        this.castTimeUnit = castTimeUnit;
        this.range = range;
        this.rangeUnit = rangeUnit;
        this.verbalComponent = VC;
        this.somaticComponent = SC;
        this.materialComponent = MC;
        this.materialComponents = MCs;
        this.concentration = conc;
        this.ritual = ritual;
        this.duration = duration;
        this.durationUnit = durationUnit;
    }
}
