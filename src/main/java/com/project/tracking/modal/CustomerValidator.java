package com.project.tracking.modal;

import org.springframework.stereotype.Service;

import com.project.tracking.exception.CustomException;


@Service
public class CustomerValidator{
   
	   public boolean isequalcustname(String str) throws CustomException 
	    {
	      if(str.matches("[A-Za-z]{5,}")) {
	    	  return true;
	      }
	      else {
	          throw new CustomException("Invalid input: Enter a valid customername");
	      } 
	    }
	   
	public boolean isValidMobilenumber(String mobilenumber) throws CustomException 
	  {
		if(mobilenumber!= null && mobilenumber.matches("\\d{10}")){
			return true;
		}
		else {
	    	throw new CustomException("Invalid input: Enter a valid mobilenumber.");
		}
    }
    
    public boolean isValidEmail(String email)  throws CustomException 
    {
       if(email.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                 "[a-zA-Z0-9_+&*-]+)*@" + 
                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                 "A-Z]{2,7}$")) {
	         return true;
          }
             else {
                 throw new CustomException("Invalid input: Enter a valid Email");
    } 
}
    
    public boolean isValidPincode(String pincode) throws CustomException 
    {
		if (pincode!= null && pincode.matches("\\d{6}")) {
			return true;
		    }
		    else {
		    	throw new CustomException("Invalid input: Enter a valid pincode.");
		    }
		  }
}
    
