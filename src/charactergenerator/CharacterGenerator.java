/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.sql.SQLException;

/**
 *
 * @author Grant
 */
public class CharacterGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        DNDCharacter character = new DNDCharacter();
        character.printCharacter();
    }
}
