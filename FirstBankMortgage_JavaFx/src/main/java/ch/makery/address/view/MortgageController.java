package ch.makery.address.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.text.Text;

import java.util.UUID;

import base.RateDAL;
import ch.makery.address.MainApp;
import ch.makery.address.model.Rate;


public class MortgageController {
	

	ObservableList<String> ComboTermList = (ObservableList<String>) FXCollections.observableArrayList("15", "30");       
	
	@FXML 
	public TextField txtMonthlyIncome;
	
	@FXML 
	public TextField txtMonthlyExpenses;
	
	@FXML 
	public TextField txtCreditScore;
	
	@FXML 
	public TextField txtHouseCost;
	
	@FXML
	public ComboBox ComboTerm;
	
	@FXML
	public Button lblCalculateMortgage;
	
	@FXML
	public Label  MonthlyIncome;
	
	@FXML
	public Label MonthlyExpenses;
	
	@FXML
	public Label CreditScore;
	
	@FXML
	public Label HouseCost;
	
	@FXML
	public Label MortgageTerm;
	

    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MortgageController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	
    }
    
    public void SetComboBox() {
    	ObservableList<String> terms = FXCollections.observableArrayList(
        "15","30"
    	); 
    	ComboTerm.setItems(terms);
    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
    @FXML
    private void Mortgagecalculation() {
    	MonthlyIncome.setText(txtMonthlyIncome.getText());
    	MonthlyIncome.setVisible(true);
    	txtMonthlyIncome.setVisible(false);
    }
	
}
    
    
    
    
    
    
    
    
    
    
    
