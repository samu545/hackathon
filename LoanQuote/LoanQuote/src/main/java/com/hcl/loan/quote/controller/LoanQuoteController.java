package com.hcl.loan.quote.controller;
/**
 * 
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.loan.quote.exception.LoanQuoteException;
import com.hcl.loan.quote.exception.MessageCodeEnum;
import com.hcl.loan.quote.service.LoanCalculateService;
import com.hcl.swagger.smart.bank.customer.model.LoanQuoteRequest;
import com.hcl.swagger.smart.bank.customer.model.LoanQuoteResponse;

/**
 * @author pushpeswar.r
 *
 */

@RestController
@RequestMapping(value = "${app.context.path}")
public class LoanQuoteController {
	Logger LOGGER = LoggerFactory.getLogger(LoanQuoteController.class);
	@Autowired
	LoanCalculateService loanCalculateService;
	
	@CrossOrigin
	@RequestMapping(value = "/quote", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public LoanQuoteResponse generateQuote(@RequestBody LoanQuoteRequest request)
			throws LoanQuoteException {
		LOGGER.info("In qyote method, to generate quote for customer");
		if(request !=  null) {
			LoanQuoteResponse response = new LoanQuoteResponse();
			response.setStatus("Success");
			return response;
		} else {
			throw new LoanQuoteException(MessageCodeEnum.INVALID_REQUEST, "Invalid request");
		}
	}
}