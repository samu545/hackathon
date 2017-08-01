package com.hcl.loan.quote.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.loan.quote.dao.LoanCalculateDao;
import com.hcl.loan.quote.entity.CustomerProfile;
import com.hcl.loan.quote.exception.LoanQuoteException;
import com.hcl.loan.quote.exception.MessageCodeEnum;
import com.hcl.loan.quote.service.LoanCalculateService;
import com.hcl.swagger.smart.bank.customer.model.LoanQuoteRequest;
import com.hcl.swagger.smart.bank.customer.model.LoanQuoteResponse;

@Service
public class LoanCalculateServiceImpl implements LoanCalculateService{
	@Autowired 
	LoanCalculateDao loanCalculateDao;
	
	@Override
	public LoanQuoteResponse calculateLoanEligibility(LoanQuoteRequest pLoanQuoteRequest) throws LoanQuoteException {
		
		if(null != pLoanQuoteRequest) {
			return loanCalculateDao.calculateLoanEligibility(mapLoanQuoteRequestToEntity(pLoanQuoteRequest));
		} else {
			throw new LoanQuoteException(MessageCodeEnum.INVALID_REQUEST, "Invalid request provided");
		}
	}

	private CustomerProfile mapLoanQuoteRequestToEntity(LoanQuoteRequest pLoanQuoteRequest) {
		CustomerProfile profile = new CustomerProfile();
		if(pLoanQuoteRequest.getCustomerType() != null) {
			profile.setCustomerType(pLoanQuoteRequest.getCustomerType());
			profile.setCreatedBy("ING");
			profile.setCreatedTime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			profile.setCustomerType(pLoanQuoteRequest.getCustomerType());
			if(pLoanQuoteRequest.getPersonalInfo() != null) {
				profile.setDateOfBirth(pLoanQuoteRequest.getPersonalInfo().get(0).getDateOfBirth());
			}
			/*profile.setDurationInMonth();
			profile.setEarningPerMonth();
			profile.setEmailId();
			profile.setExistingEmiPerMonth();
			profile.setExistingEmiPerMonth();
			profile.setExistingOtherExpenses();
			profile.setExistingRent();
			profile.setFirstName();
			profile.setLastName();
			profile.setLoanAmount();
			profile.setLoanType();
			profile.setMobile();
			profile.setPostCode();
			profile.setTitle();*/
			
			
			
		}
		return profile;
	}
}
