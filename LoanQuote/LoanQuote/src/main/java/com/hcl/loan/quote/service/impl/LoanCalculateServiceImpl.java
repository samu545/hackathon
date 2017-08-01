package com.hcl.loan.quote.service.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;

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
			loanCalculateDao.calculateLoanEligibility(mapLoanQuoteRequestToEntity(pLoanQuoteRequest));
			LoanQuoteResponse response = new LoanQuoteResponse();
			response.setStatus("Success");
			return response;
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
			profile.setLoanType(pLoanQuoteRequest.getLoanType());
			if(null!= pLoanQuoteRequest.getPersonalInfo()) {
				profile.setDateOfBirth(pLoanQuoteRequest.getPersonalInfo().get(0).getDateOfBirth());
				profile.setEmailId(pLoanQuoteRequest.getPersonalInfo().get(0).getEmailId());
				profile.setFirstName(pLoanQuoteRequest.getPersonalInfo().get(0).getFirstName());
				profile.setLastName(pLoanQuoteRequest.getPersonalInfo().get(0).getLastName());
				profile.setMobile(Long.valueOf(pLoanQuoteRequest.getPersonalInfo().get(0).getMobileNumber()));
				profile.setPostCode(pLoanQuoteRequest.getPersonalInfo().get(0).getPostCode());
				profile.setTitle(pLoanQuoteRequest.getPersonalInfo().get(0).getTitle());
			}
			if(null!= pLoanQuoteRequest.getLoanInfo()) {
				profile.setDurationInMonth(pLoanQuoteRequest.getLoanInfo().get(0).getDurationInMonth());
				profile.setEarningPerMonth(BigDecimal.valueOf(pLoanQuoteRequest.getLoanInfo().get(0).getEarningPerMonth()));
				profile.setExistingEmiPerMonth(BigDecimal.valueOf(pLoanQuoteRequest.getLoanInfo().get(0).getExistingEMIPerMonth()));
				profile.setExistingEmiPerMonth(BigDecimal.valueOf(pLoanQuoteRequest.getLoanInfo().get(0).getExistingEMIPerMonth()));
				profile.setExistingOtherExpenses(BigDecimal.valueOf(pLoanQuoteRequest.getLoanInfo().get(0).getExistingOtherExpenses()));
				profile.setExistingRent(BigDecimal.valueOf(pLoanQuoteRequest.getLoanInfo().get(0).getExistingRent()));
				profile.setLoanAmount(Long.valueOf(pLoanQuoteRequest.getLoanInfo().get(0).getAmount().toString()));
			}

		}
		return profile;
	}
}
