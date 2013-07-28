package com.lf.bill.management.view.backing;

import com.lf.bill.management.entity.biller.Biller;
import com.lf.bill.management.service.bill.BillRepository;
import com.lf.bill.management.service.biller.BillerRepository;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "BillerManagementService")
public class BillerManagementService {
    public BillerManagementService() {
        super();
    }

    @WebMethod
    public Biller fetchBiller(@WebParam(name = "arg0") String billerId) {
        return BillerRepository.getInstance().fetchBiller(billerId);
    }

    @WebMethod
    @Oneway
    public void updateBiller(@WebParam(name = "arg0") Biller biller) {
        BillerRepository.getInstance().updateBiller(biller);
    }

    @WebMethod
    @Oneway
    public void createBiller(@WebParam(name = "arg0") Biller biller) {
        BillerRepository.getInstance().addBiller(biller);
    }

    @WebMethod
    @Oneway
    public void deleteBiller(@WebParam(name = "arg0") String billerId) {
        BillerRepository.getInstance().deleteBiller(billerId);
    }

    @WebMethod
    @Oneway
    public void payBill(@WebParam(name = "arg0") com.lf.bill.management.entity.bill.Bill bill) {
        BillRepository.getInstance().addBill(bill);
    }

    @WebMethod
    public com.lf.bill.management.entity.bill.Bill fetchBill(@WebParam(name = "arg0") String txnId) {
        return BillRepository.getInstance().fetchBill(txnId);
    }

    @WebMethod
    @Oneway
    public void deleteBill(@WebParam(name = "arg0") String txnId) {
        BillRepository.getInstance().deleteBill(txnId);
    }

    @WebMethod
    @Oneway
    public void updateBill(@WebParam(name = "arg0") com.lf.bill.management.entity.bill.Bill bill) {
        BillRepository.getInstance().updateBill(bill);
    }
}
