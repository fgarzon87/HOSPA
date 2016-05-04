/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.jboss.weld.context.RequestContext;

/**
 *
 * @author ATENEA
 */
@Stateless
public class AutenticacionBean implements AutenticacionBeanLocal {

    @Override
    public boolean autenticar(String Usuario, String Contrasena) {
        
        if(Usuario != null && Usuario.equals("admin") && Contrasena != null && Contrasena.equals("admin"))
            return true;
        else
            return false;
    }
     
    
}