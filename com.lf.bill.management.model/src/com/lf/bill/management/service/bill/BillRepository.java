package com.lf.bill.management.service.bill;


import com.lf.bill.management.entity.bill.Bill;
import com.lf.bill.management.model.db.utils.DatabaseUtils;

import java.math.BigDecimal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Calendar;


public class BillRepository {
    public BillRepository() {
        super();
    }

    public void addBill(Bill bill) {
        DatabaseUtils utils = new DatabaseUtils();
        String transactionId = bill.getTransactionId();
        String billerId = bill.getBillerId();
        String custRefNo = bill.getCustomerRefNo();
        BigDecimal amount = bill.getAmount();
        String modeOfPayment = bill.getModeOfPayment();
        String dateOfPayment = "07-Jul-2013";
        String query =
            "insert into BILL values ('" + transactionId + "','" + billerId + "', '" + custRefNo + "', " + amount +
            ", '" + modeOfPayment + "', '" + dateOfPayment + "')";
        utils.executeUpdate(query);
    }

    public void updateBill(Bill bill) {
        DatabaseUtils utils = new DatabaseUtils();
        String transactionId = bill.getTransactionId();
        String billerId = bill.getBillerId();
        String custRefNo = bill.getCustomerRefNo();
        BigDecimal amount = bill.getAmount();
        String modeOfPayment = bill.getModeOfPayment();
        String dateOfPayment = bill.getDateOfPayment();
        String query =
            "update bill set billerid = '" + billerId + "', custrefno = '" + custRefNo + "', amount = " + amount +
            ", modeofpayment = '" + modeOfPayment + "', dateofpayment = '" + dateOfPayment +
            "' where transactionid = '" + transactionId + "'";
        utils.executeUpdate(query);
    }

    public Bill fetchBill(String transactionId) {
        DatabaseUtils utils = new DatabaseUtils();
        Connection connection = null;
        Bill bill = new Bill();
        try {
            connection = utils.createConnection();
            String query =
                "select transactionid, billerid, custrefno, amount, modeofpayment, dateofpayment from bill where transactionid = '" +
                transactionId + "'";
            ResultSet resultSet = utils.executeQuery(connection, query);
            if (resultSet != null) {
                try {
                    while (resultSet.next()) {
                        transactionId = resultSet.getString("transactionid");
                        String billerId = resultSet.getString("billerid");
                        String custRefNo = resultSet.getString("custrefno");
                        BigDecimal amount = resultSet.getBigDecimal("amount");
                        String modeOfPayment = resultSet.getString("modeofpayment");
                        String dateOfPayment = resultSet.getString("dateofpayment");

                        bill.setTransactionId(transactionId);
                        bill.setBillerId(billerId);
                        bill.setCustomerRefNo(custRefNo);
                        bill.setAmount(amount);
                        bill.setModeOfPayment(modeOfPayment);
                        bill.setDateOfPayment(dateOfPayment);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            utils.closeConnection(connection);
        }
        return bill;
    }

    public void deleteBill(String transactionId) {
        DatabaseUtils utils = new DatabaseUtils();
        String query = "delete from bill where transactionid = '" + transactionId + "'";
        utils.executeUpdate(query);
    }

    public static void main(String[] args) {
        BillRepository rep = new BillRepository();
        Bill bill = new Bill();
        
        String transactionId = Long.toString(System.currentTimeMillis());
        bill.setTransactionId(transactionId);
        bill.setAmount(new BigDecimal(100));
        bill.setBillerId("Biller01");
        bill.setCustomerRefNo("2342");
        String date = "07-Jul-2013";
        bill.setDateOfPayment(date);
        bill.setModeOfPayment("CASH");
        rep.addBill(bill);

        bill.setModeOfPayment("CHEQUE");
        rep.updateBill(bill);

        Bill newBill = rep.fetchBill(transactionId);

        System.out.println(newBill.getBillerId());

        rep.deleteBill(transactionId);

    }
}
