/**
 * 
 */
package com.hcl.loan.quote.dao;

import com.hcl.loan.quote.entity.CustomerProfile;
import com.hcl.loan.quote.exception.LoanQuoteException;

/**
 * @author Samraj Timmapuram
 *
 */
public interface LoanCalculateDao {
	public void calculateLoanEligibility(CustomerProfile pCustomerProfile) throws LoanQuoteException;
}
