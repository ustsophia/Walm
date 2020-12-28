package com.project.tracking.modal;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "customer")
public class Customer {

	@Id
	@NotNull
	private String customerid;
    private String customername;
    private String mobilenumber;
    private String email;
    private String city;
    private String pincode;
    
    @PartitionKey
    private String customeraddress;

    public Customer(String customerid, String customername, String mobilenumber, String email, String city,String pincode, String address) {
    	this.customerid= customerid;
        this.customername = customername;
        this.mobilenumber = mobilenumber;
        this.email = email;
        this.city = city;
        this.pincode = pincode;
        this.customeraddress = address;
    }
    

	public Customer() {
    	super();
    }

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
    
    public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
        return customeraddress;
    }

    public void setAddress(String address) {
        this.customeraddress = address;
    }
}