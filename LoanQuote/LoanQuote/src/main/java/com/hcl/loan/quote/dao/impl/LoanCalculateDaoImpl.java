package com.hcl.loan.quote.dao.impl;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hcl.loan.quote.dao.LoanCalculateDao;
import com.hcl.loan.quote.entity.CustomerProfile;
import com.hcl.loan.quote.exception.LoanQuoteException;
import com.hcl.loan.quote.exception.MessageCodeEnum;

@Service
public class LoanCalculateDaoImpl implements LoanCalculateDao{
	private static final Logger LOGGER = LoggerFactory.getLogger(LoanCalculateDao.class);
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void calculateLoanEligibility(CustomerProfile pCustomerProfile) throws LoanQuoteException {
		LOGGER.info("In addCustomer method, adding the new customer");
		if (null!=pCustomerProfile) {
			entityManager.persist(pCustomerProfile);
			LOGGER.info("In addCustomer method, successfully added new customer");
		} else {
			throw new LoanQuoteException(MessageCodeEnum.INVALID_REQUEST, "Invalid request provided");
		}
	}


}
