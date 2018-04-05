
package javafxappcalculette;

import javafx.application.Application;

/**
 * abstract veu dir que la classe ne peut etre instancier
 * 
 * @author Administrateur
 */
public abstract class Controller {
    //enregistrement de l'aplication
    protected Application mainApplication;
    public void setApplication(Application app){
        this.mainApplication = app;
    }
}
