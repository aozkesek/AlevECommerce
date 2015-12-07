package com.merge.alev.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.merge.base.dao.model.AbstractModel;

@Entity
@Table(name="ORDERS", schema="ALEVECOM")
public class Order extends AbstractModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	@Column(name="ORDERNO")
	private String orderNo;
	@Column(name="CUSTOMERNAME")
	private String customerName;
	@Column(name="CUSTOMERMIDDLE")
	private String customerMiddle;
	@Column(name="CUSTOMERLASTNAME")
	private String customerLastname;
	@Column(name="CUSTOMERTELNO")
	private String customerTelNo;
	@Column(name="CUSTOMEREMAIL")
	private String customerEmail;
	@Column(name="POSTCODE")
	private String postCode;
	@Column(name="DELIVERTO")
	private String deliverTo;
	@Column(name="DELIVERYADDRESS")
	private String deliveryAddress;
	@Column(name="TOTALAMOUNT")
	private Double totalAmount;
	@Column(name="TOTALFEES")
	private Double totalFees;
	@Column(name="ORDERSTATUS")
	private String orderStatus;
	@Column(name="PAYMENTSTATUS")
	private String paymentStatus;
	@Column(name="TRACKNUMBER")
	private String trackNumber;
	@Column(name="ORDERDATE")
	private Date createDate;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerMiddle() {
		return customerMiddle;
	}


	public void setCustomerMiddle(String customerMiddle) {
		this.customerMiddle = customerMiddle;
	}


	public String getCustomerLastname() {
		return customerLastname;
	}


	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}


	public String getCustomerTelNo() {
		return customerTelNo;
	}


	public void setCustomerTelNo(String customerTelNo) {
		this.customerTelNo = customerTelNo;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public String getPostCode() {
		return postCode;
	}


	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public String getDeliverTo() {
		return deliverTo;
	}


	public void setDeliverTo(String deliverTo) {
		this.deliverTo = deliverTo;
	}


	public String getDeliveryAddress() {
		return deliveryAddress;
	}


	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}


	public Double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public Double getTotalFees() {
		return totalFees;
	}


	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public String getTrackNumber() {
		return trackNumber;
	}


	public void setTrackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Override
	public String toString() {
		return String.format("{id=%d, orderNo=%s, customerName=%s, customerMiddle=%s, customerLastname=%s, customerTelNo=%s, customerEmail=%s, deliverTo=%s, deliveryAddress=%s, postCode=%s, totalAmount=%f, totalFees=%f, orderStatus=%s, paymentStatus=%s, trackNumber=%s, createDate=%t}"
				, getId(), getOrderNo(), getCustomerName(), getCustomerMiddle(), getCustomerLastname(), getCustomerTelNo(), getCustomerEmail(), getDeliverTo(), getDeliveryAddress(), getPostCode(), getTotalAmount(), getTotalFees(), getOrderStatus(), getPaymentStatus(), getTrackNumber(), getCreateDate());
	}


}