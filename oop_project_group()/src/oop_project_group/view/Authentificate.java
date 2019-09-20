
package oop_project_group.view;

/*
        Group members
        =============
        
        Name                                 Registration Number
        ====                                 ===================
        CHANCE LUWONG                        18/847/BIT-S
        DUKU MOSES                           18/927/BSSE-S
        RICHARD KAMULAK JUSTIN LOKOSANG      18/1176/BIT-S
        PHILIP JUNGO                         18/1068/BIT-S

        */

public class Authentificate {
    
    public static  boolean Validate(String userName, String password) {
        if (userName.equals("south") && password.equals("Snow")){
            return true;
        }
        return false;
    }
    
 
}

        