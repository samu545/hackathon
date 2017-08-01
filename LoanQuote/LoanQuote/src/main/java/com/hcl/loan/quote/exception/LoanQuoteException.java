/**
 * 
 */
package com.hcl.loan.quote.exception;

import org.springframework.http.HttpStatus;

import com.hcl.swagger.smart.bank.customer.model.Errors;

/**
 * @author pushpeswar.r
 *
 */
public class LoanQuoteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3506825307069351984L;
	private MessageCodeEnum messageCode;
	private Errors errorList = null;
	private HttpStatus httpStatus;
	
	public LoanQuoteException(String pExceptionName) {
		super(pExceptionName);
	}
	
	public LoanQuoteException(MessageCodeEnum messageCode, String message) {
		super(message);
		this.messageCode = messageCode;
	}

	public LoanQuoteException(Errors errorList, HttpStatus httpStatus) {
		super();
		this.errorList = errorList;
		this.httpStatus = httpStatus;
	}
	
	/**
	 * @return the messageCode
	 */
	public MessageCodeEnum getMessageCode() {
		return messageCode;
	}

	/**
	 * @param pMessageCode the messageCode to set
	 */
	public void setMessageCode(MessageCodeEnum pMessageCode) {
		messageCode = pMessageCode;
	}

	/**
	 * @return the errorList
	 */
	public Errors getErrorList() {
		return errorList;
	}

	/**
	 * @param pErrorList the errorList to set
	 */
	public void setErrorList(Errors pErrorList) {
		errorList = pErrorList;
	}

	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param pHttpStatus the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus pHttpStatus) {
		httpStatus = pHttpStatus;
	}	
}