package com.hcl.loan.quote.service;

import com.hcl.loan.quote.exception.LoanQuoteException;
import com.hcl.swagger.smart.bank.customer.model.LoanQuoteRequest;
import com.hcl.swagger.smart.bank.customer.model.LoanQuoteResponse;

public interface LoanCalculateService {
	public LoanQuoteResponse calculateLoanEligibility(LoanQuoteRequest loanquotereq) throws LoanQuoteException;
}
