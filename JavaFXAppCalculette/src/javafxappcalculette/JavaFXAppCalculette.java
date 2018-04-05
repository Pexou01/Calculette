package javafxappcalculette;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrateur
 */
public class JavaFXAppCalculette extends Application {

    private Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws IOException {

        //save de l'instance Stage pour une reutilisation futur
        this.mainStage = primaryStage;
       ouvreFenetre("FXCalculette.fxml");
    }

    /**
     * Méthode qui permet d'ouvrir n'inporte quel fenétre
     *
     * @param fxml
     */
    public void ouvreFenetre(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        Parent root = loader.load();
        //récupération du controleur
        
        Controller ctrl =loader.getController();
        ctrl.setApplication(this);
        
        Scene scene = new Scene(root);
        this.mainStage.setScene(scene);
        this.mainStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
