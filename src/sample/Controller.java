package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    Float data=0f;
    int operation=-1;
    @FXML
    private ResourceBundle resources;

    @FXML
    private TextField display;

    @FXML
    private URL location;

    @FXML
    private Button ce;

    @FXML
    private Button divide;

    @FXML
    private Button eight;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;


    @FXML
    public void actionhalndler(ActionEvent actionEvent) {
        if(actionEvent.getSource()==one)
        {
            display.setText(display.getText()+"1");
        }
        else if(actionEvent.getSource()==two)
        {
            display.setText(display.getText()+"2");
        }else if(actionEvent.getSource()==three)
        {
            display.setText(display.getText()+"3");
        } else if(actionEvent.getSource()==four)
        {
            display.setText(display.getText()+"4");
        }else if(actionEvent.getSource()==five)
        {
            display.setText(display.getText()+"5");
        }else if(actionEvent.getSource()==six)
        {
            display.setText(display.getText()+"6");
        }else if(actionEvent.getSource()==seven)
        {
            display.setText(display.getText()+"7");
        }else if(actionEvent.getSource()==eight)
        {
            display.setText(display.getText()+"8");
        }else if(actionEvent.getSource()==nine)
        {
            display.setText(display.getText()+"9");
        }else if(actionEvent.getSource()==zero)
        {
            display.setText(display.getText()+"0");
        }else if(actionEvent.getSource()==ce)
        {
            display.setText("");
        }else if(actionEvent.getSource()==plus){
            data=Float.parseFloat(display.getText());
        operation=1;
        display.setText("");
        }else if(actionEvent.getSource()==minus){
            data=Float.parseFloat(display.getText());
            operation=2;
            display.setText("");
        }else if(actionEvent.getSource()==multiply){
            data=Float.parseFloat(display.getText());
            operation=3;
            display.setText("");
        }else if(actionEvent.getSource()==divide){
            data=Float.parseFloat(display.getText());
            operation=4;
            display.setText("");
        }else if(actionEvent.getSource()==equal){
            Float second=Float.parseFloat(display.getText());
            switch (operation){
                case 1:
                    Float ans=data+second;
                    display.setText(String.valueOf(ans));
                    break;
                case 2:
                     ans=data-second;
                    display.setText(String.valueOf(ans));
                    break;
                case 3:
                     ans=data*second;
                    display.setText(String.valueOf(ans));
                    break;
                case 4:
                    if(second==0) {
                        display.setText("ERROR");
                    display.setText("0");
                    }
                    else
                    {ans=data/second;
                    display.setText(String.valueOf(ans));}
            }
        }
    }
}
