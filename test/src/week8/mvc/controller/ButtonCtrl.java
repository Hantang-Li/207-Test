package week8.mvc.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import week8.mvc.model.DataModel;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by garyk on 2018-07-14.
 */
public class ButtonCtrl implements Initializable{
  @FXML
  private AnchorPane rootPane;
  @FXML
  private AnchorPane pane1;

  private DataModel dm;


  public void setDataModel(DataModel dm){
    this.dm = dm;

  }

  @FXML
  public void btnOnClick(MouseEvent mouseEvent) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("/week8/mvc/view/welcome.fxml"));
    Scene scene = new Scene(parent);
    Stage s = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
    s.hide();
    s.setScene(scene);
    s.show();

  }

  public void hahahaClick(MouseEvent mouseEvent) throws IOException {
    BorderPane root = new BorderPane();
    FXMLLoader itemDisplayLoader = new FXMLLoader(getClass().getResource("/week8/mvc/view/itemDisplay.fxml"));
    root.setCenter(itemDisplayLoader.load());

    Scene scene = new Scene(root, 800, 600);
    Stage stage = new Stage();
  }
  @FXML
  public void btnClick(MouseEvent event) throws IOException {
    AnchorPane pane = FXMLLoader.load(getClass().getResource("/week8/mvc/view/itemDisplay.fxml"));
    rootPane.getChildren().setAll(pane);
  }
  @FXML
  public void buttonClick2(MouseEvent event) throws IOException {
    AnchorPane pane2 = FXMLLoader.load(getClass().getResource("/week8/mvc/view/welcome.fxml"));
    pane1.getChildren().setAll(pane2);
  }



  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
}
