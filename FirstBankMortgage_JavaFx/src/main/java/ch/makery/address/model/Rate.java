package ch.makery.address.model;

import org.apache.poi.ss.formula.functions.FinanceLib;

import base.RateDAL;
import domain.RateDomainModel;

public class Rate extends RateDomainModel {

	public void getPayment(double MonthlyIncome, double MonthlyExpenses, double HouseCost, int MortgageTerm) {

		double InterestRate = RateDAL.getRate(getMinCreditScore());
		int Terms = MortgageTerm * 12;
		double MothlyPay1 = MonthlyIncome * 0.36;
		double MothlyPay2 = (MonthlyIncome + MonthlyExpenses) *0.28;
		double PMT = FinanceLib.pmt(InterestRate, Terms, HouseCost, 0, false);
		if (PMT <= MothlyPay1 && PMT <= MothlyPay2) {
			System.out.println("The cost of the house too high.");
		} else {
			System.out.printf("The Mortgage Payment of the house: #.00",PMT);;
		}

	}
}
