/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.io.ObjectStreamField;
import java.io.Serializable;

/**
 *
 * @author nofrisal.dwi
 */
public class List implements Serializable {

    List next;
    
    private static final ObjectStreamField[] serialPersistentFields
                 = {new ObjectStreamField("next", List.class)};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
