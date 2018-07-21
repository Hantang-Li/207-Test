package week8.mvc.model;


import java.util.ArrayList;
import java.util.Observable;

public class DataModel extends Observable{

  private int count;
  private String x;


  public void increaseCount(){
    count ++;
    setChanged();
    notifyObservers(count);
  }


}
