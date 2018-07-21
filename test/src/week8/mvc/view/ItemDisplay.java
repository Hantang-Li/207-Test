package week8.mvc.view;


import java.util.Observable;
import java.util.Observer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import week8.mvc.model.DataModel;



public class ItemDisplay implements Observer{

  @FXML
  private Label numDisplay;


  @Override
  public void update(Observable o, Object arg) {
    numDisplay.setText("The current number is " + arg.toString());
  }

}
