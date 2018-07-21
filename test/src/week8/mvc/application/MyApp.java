package week8.mvc.application;

import java.awt.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import week8.mvc.controller.ButtonCtrl;
import week8.mvc.model.DataModel;
import week8.mvc.view.ItemDisplay;


public class MyApp extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/week8/mvc/view/itemDisplay.fxml"));
    primaryStage.initStyle(StageStyle.UNDECORATED);

    //DataModel dm = new DataModel();

    //BorderPane root = new BorderPane();
    //FXMLLoader itemDisplayLoader = new FXMLLoader(getClass().getResource("/week8/mvc/view/itemDisplay.fxml"));
    //root.setBottom(itemDisplayLoader.load());
    //ItemDisplay itemDisplay = itemDisplayLoader.getController();

    //FXMLLoader buttonCtrlLoader = new FXMLLoader(getClass().getResource("/week8/mvc/view/ItemDisplay.fxml"));
   // root.setTop(buttonCtrlLoader.load());
    //ButtonCtrl buttonCtrl = buttonCtrlLoader.getController();

    //buttonCtrl.setDataModel(dm);
    //dm.addObserver(itemDisplay);


    Scene scene = new Scene(root);

    primaryStage.setScene(scene);

    primaryStage.show();

  }

  public static void main(String[] args) {
    Application.launch();
  }
}
