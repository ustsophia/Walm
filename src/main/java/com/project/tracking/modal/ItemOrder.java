package com.project.tracking.modal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "itemorder")
public class ItemOrder {

	@Id
	@NotNull
	private int order_number;
	@NotNull
	private String customerid;
	 String order_date;	
	 @NotNull
	private String  product_id;
	 @NotNull
	private String origin_id;
	 @NotNull
	private String destination_id;
	
	@PartitionKey
	private String status;
	
	public enum status{NEW,SHIPPED,DELIVERED,CANCELLED}
	public ItemOrder(int order_number,String customerid,String  product_id, String origin_id,String destination_id, String status) {
		this.order_number = order_number;
		this.customerid= customerid;
       //this.order_date = order_date;
        this.product_id = product_id;
        this.origin_id = origin_id;
        this.destination_id = destination_id;
        this.status =status;
    }
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ItemOrder() {
    	super();
    }
	public int getOrder_number() {
		return order_number;
	}

	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getOrder_date() {
		    Date order_date = new Date();
		    String strDateFormat = "yyyy-MM-dd 'at' HH:mm:ss z";
		    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		    String formattedDate= dateFormat.format(order_date);
		    return formattedDate;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getOrigin_id() {
		return origin_id;
	}

	public void setOrigin_id(String origin_id) {
		this.origin_id = origin_id;
	}

	public String getDestination_id() {
		return destination_id;
	}

	public void setDestination_id(String destination_id) {
		this.destination_id = destination_id;
	}
	

}

