package views;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Menu;
import models.Transport;
import models.utlisateur;
/**
 *
 * @author jaret_000
 */
public class SceneChanger {
    
    private static utlisateur loggedInUser;

    
    
    /**
     * This method will accept the title of the new scene, the .fxml file name for
     * the view and the ActionEvent that triggered the change
     */
    public void changeScenes(ActionEvent event, String viewName, String title) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewName));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        //get the stage from the event that was passed in
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
    
  //_____________________sceneChanger qui dépond du controlleur_______________________
        /**
     * This method will change scenes and preload the next scene with a Menu object
     */
    public void changeScenes(ActionEvent event, String viewName, 
            String title, Menu volunteer, ControllerClass controllerClass) throws IOException  
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewName));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        //access the controller class and preload (twarini kifech ken) the volunteer data 
        controllerClass = loader.getController();
        controllerClass.preloadData(volunteer);
        
        //get the stage from the event that was passed in
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
    
//----------------------------------------------------------------------------------
            /**
     * This method will change scenes and preload the next scene with a Menu object
     */
    public void changeScenes(ActionEvent event, String viewName, 
            String title, Transport volunteer, ControllerClass controllerClass) throws IOException  
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewName));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        //access the controller class and preload (twarini kifech ken) the volunteer data 
        controllerClass = loader.getController();
        controllerClass.preloadData(volunteer);
        
        //get the stage from the event that was passed in
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
        
    /**
     * This method will change scenes and preload the next scene with a Volunteer object
     */
    public void changeScenes(ActionEvent event, String viewName, String title, utlisateur volunteer, ControllerClass controllerClass) throws IOException  
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewName));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        //access the controller class and preloaded the volunteer data
        controllerClass = loader.getController();
      //  controllerClass.preloadData(volunteer);
        
        //get the stage from the event that was passed in
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
    
    public static utlisateur getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(utlisateur loggedInUser) {
        SceneChanger.loggedInUser = loggedInUser;
    }
    
 
}
