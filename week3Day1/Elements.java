package week3Day1;

public class Elements extends Button {

	    public static void main(String[] args) {
	      
	        WebElement webElement = new WebElement();
	        webElement.click();
	        webElement.setText("Balachandar");
	        System.out.println();
	       
	        Button button = new Button();
	        button.click();
	        button.setText("Balli");
	        button.submit();
	        System.out.println();
	       
	        TextField textField = new TextField();
	        textField.click();
	        textField.setText("Gully");
	        textField.getText();
	        System.out.println();
	       
	        CheckButton checkBoxButton = new CheckButton();
	        checkBoxButton.clickCheckButton();
	        checkBoxButton.submit();
	        System.out.println();
	        
	        RadioButton radioButton = new RadioButton();
	        radioButton.selectRadioButton();
	        radioButton.submit();
	        System.out.println();
	        
	    }
	}
		
		
		// TODO Auto-generated method stub



