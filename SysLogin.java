/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syslogin;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import syslogin.login.login;

/**
 *
 * @author HP
 */
public class SysLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FlatMaterialLighterIJTheme.setup();
        
        login principal = new login();
        principal.setVisible(true);
    }
    
}
