/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

/**
 *
 * @author Grant
 */
public class Wearable extends Item{
    String type = "";
    
    Wearable(String name, String description){
        super(name, description);
        if (description.contains("light")){
            type = "light";
        }
        else if (description.contains("medium")){
            type = "medium";
        }
        else if (description.contains("heavy")){
            type = "heavy";
        }
        else if (description.contains("shield")){
            type = "shield";
        }
    }
    
}
