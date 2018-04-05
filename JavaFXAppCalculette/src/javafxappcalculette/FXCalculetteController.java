/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxappcalculette;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrateur
 */
public class FXCalculetteController extends Controller {

    @FXML private Button plus;
    @FXML private Button egal;
    @FXML private TextField affichage;
    @FXML private Label ereur;
    private int operande;
    private String operateur;
    
    public void onClick(ActionEvent event){
       //récuperation de la donnée click
      Button boutonClic = (Button) event.getSource();
      //Texte du bouton cliqué enregistre dans une String (ButtonText & affichageExistant)
       String buttonText = boutonClic.getText();
       String affichageExistant = affichage.getText();
       //mise a jour de l'affichage
       affichage.setText((affichageExistant + buttonText));
      
    }
    public void onClicOperateur(ActionEvent event){
        // mémorisation de l'opérande
        operande = Integer.valueOf(affichage.getText());
        // mémorisé l'opérateur
                 Button boutonClic = (Button) event.getSource();
                 String TexteBouton = boutonClic.getText();
                 operateur = TexteBouton;
                 affichage.setText("");
    }
    public void onCalcul(ActionEvent event){
        if(operateur.equals("+")){
            int resultat = operande + Integer.valueOf(affichage.getText());
            operateur = null;
            operande = 0 ;
            affichage.setText(String.valueOf(resultat));
    }else if(operateur.equals("-")){
            int resultat = operande - Integer.valueOf(affichage.getText());
            operateur = null;
            operande = 0 ;
            affichage.setText(String.valueOf(resultat));
    }else if (operateur.equals("*")){
            int resultat = operande * Integer.valueOf(affichage.getText());
            operateur = null;
            operande = 0 ;
            affichage.setText(String.valueOf(resultat));
            }else if(operateur.equals("/")){
            int resultat = operande / Integer.valueOf(affichage.getText());
            operateur = null;
            operande = 0 ;
            affichage.setText(String.valueOf(resultat));
           
            }
    
    }
    }
