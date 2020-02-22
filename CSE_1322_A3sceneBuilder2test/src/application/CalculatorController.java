package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.*;

public class CalculatorController implements Initializable {

	@FXML
	public Button one = new Button();
	public Button two = new Button();
	public Button three = new Button();
	public Button four = new Button();
	public Button five = new Button();
	public Button six = new Button();
	public Button seven = new Button();
	public Button eight = new Button();
	public Button nine = new Button();
	public Button zero = new Button();
	public Button add = new Button();
	public Button subtract = new Button();
	public Button multiply = new Button();
	public Button divide = new Button();
	public Button equal = new Button();
	public Button paranthesis = new Button();
	public Button clear = new Button();
	String operation = " - ";
	public Label l = new Label();
	double result;

	@FXML
	public void clickOne(ActionEvent event) {
		l.setText(l.getText() + "1");
	}

	@FXML
	public void clickTwo(ActionEvent event) {
		l.setText(l.getText() + "2");
	}

	@FXML
	public void clickThree(ActionEvent event) {
		l.setText(l.getText() + "3");
	}

	@FXML
	public void clickFour(ActionEvent event) {
		l.setText(l.getText() + "4");
	}

	@FXML
	public void clickFive(ActionEvent event) {
		l.setText(l.getText() + "5");
	}

	@FXML
	public void clickSix(ActionEvent event) {
		l.setText(l.getText() + "6");
	}

	@FXML
	public void clickSeven(ActionEvent event) {
		l.setText(l.getText() + "7");
	}

	@FXML
	public void clickEight(ActionEvent event) {
		l.setText(l.getText() + "8");
	}

	@FXML
	public void clickNine(ActionEvent event) {
		l.setText(l.getText() + "9");
	}

	@FXML
	public void Add(ActionEvent event) {
		l.setText(l.getText() + " + ");
		operation = " + ";
	}

	@FXML
	public void Minus(ActionEvent event) {
		l.setText(l.getText() + " - ");
		operation = " - ";
	}

	@FXML
	public void Multiply(ActionEvent event) {
		l.setText(l.getText() + " * ");
		operation = " * ";
	}

	@FXML
	public void Divide(ActionEvent event) {
		l.setText(l.getText() + " / ");
		operation = " / ";
	}

	@FXML
	public void Clear(ActionEvent event) {
		l.setText("");
	}

	@FXML
	public void Equal(ActionEvent event) {
		String input = l.getText();
		String [] num = input.split(Pattern.quote(operation));
		double first = Double.parseDouble(num[0]);
		double second = Double.parseDouble(num[1]);
		
		switch(operation) {
		case " + " : result = first+second;
		break;
		case " - " : result = first-second;
		break;
		case " * " : result = first*second;
		break;
		case " / " : result = first/second;
		break;
		}
		l.setText(Double.toString(result));
		
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub

	}
}
