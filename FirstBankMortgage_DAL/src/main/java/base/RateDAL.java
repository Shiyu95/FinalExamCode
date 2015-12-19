package base;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import util.HibernateUtil;

public class RateDAL {
	
		public static double getRate(int GivenCreditScore) {
			
			double TBLRateGet1 = 0; 
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = null;
			RateDomainModel TBLRateGet = null;		
			
			try {
				tx = session.beginTransaction();	
										
				Query query = session.createQuery("from RateDomainModel  where GivenCreditScore = :minCreditScore ");
				query.setParameter("minCreditScore", GivenCreditScore);
				
				List<?> list = query.list();
				TBLRateGet = (RateDomainModel)list.get(0);
				
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return TBLRateGet1;
				
	}
	public static ArrayList<RateDomainModel> getRate() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		RateDomainModel RateGet = null;		
		ArrayList<RateDomainModel> Rates = new ArrayList<RateDomainModel>();
		
		try {
			tx = session.beginTransaction();	
			
			List rates = session.createQuery("FROM RateDomainModel").list();
			for (Iterator iterator = rates.iterator(); iterator.hasNext();) {
				RateDomainModel Rate = (RateDomainModel) iterator.next();
				 Rates.add(Rate);
			}
			
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Rates;
	}		
}