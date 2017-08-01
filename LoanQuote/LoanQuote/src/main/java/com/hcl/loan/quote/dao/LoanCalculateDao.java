/**
 * 
 */
package com.hcl.loan.quote.dao;

import com.hcl.loan.quote.entity.CustomerProfile;
import com.hcl.swagger.smart.bank.customer.model.LoanQuoteResponse;

/**
 * @author Samraj Timmapuram
 *
 */
public interface LoanCalculateDao {
	public LoanQuoteResponse calculateLoanEligibility(CustomerProfile pCustomerProfile);
}
