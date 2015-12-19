package ch.makery.address.model;

import org.apache.poi.ss.formula.functions.FinanceLib;

import base.RateDAL;
import domain.RateDomainModel;

public class Rate extends RateDomainModel {
	
	public  double getPayment(double income, double expenses, double houseCost, int Term) {
	    	// Calculate interest rate from credit score and amount of payment terms
	    	double interestRate = RateDAL.getRate(getMinCreditScore());
	    	double amntTerms = Term * 12;
	    	
	    	// Calculate the PMT:
	    	double PMT = FinanceLib.pmt(interestRate, amntTerms, houseCost, 0, false);
	    	
	    	// Calculate the maximums for mortage payments
	    	double cap1 = income * .36;
	    	double cap2 = (income + expenses*12)*.28;
	    	
	    	if(PMT <= cap1 && PMT <= cap2) {
	    		return PMT;
	    	} else {
	    		return 0.0;
	    	}
	    	
		}
}
