package com.lf.bill.management.entity.bill;

import java.math.BigDecimal;


public class Bill {
    private String transactionId;
    private String billerId;
    private String customerRefNo;
    private BigDecimal amount;
    private String modeOfPayment;
    private String dateOfPayment;
    
    public Bill() {
        super();
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setCustomerRefNo(String customerRefNo) {
        this.customerRefNo = customerRefNo;
    }

    public String getCustomerRefNo() {
        return customerRefNo;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setDateOfPayment(String dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public String getDateOfPayment() {
        return dateOfPayment;
    }
}
