package com.lf.bill.management.view.backing;


import com.lf.bill.management.service.bill.BillRepository;

import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;

import oracle.jbo.Row;


public class BillPay {
    private RichPanelGroupLayout pgl1;
    private RichPanelBox pb1;
    private RichRegion r1;
    private RichCommandButton cb1;

    /**
     * @param pgl1
     */
    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    /**
     * @return
     */
    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    /**
     * @param pb1
     */
    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    /**
     * @return
     */
    public RichPanelBox getPb1() {
        return pb1;
    }


    /**
     * @param r1
     */
    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    /**
     * @return
     */
    public RichRegion getR1() {
        return r1;
    }

    /**
     * @param cb1
     */
    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    /**
     * @return
     */
    @SuppressWarnings("deprecation")
    public RichCommandButton getCb1() {
        return cb1;
    }

    /**
     * @param actionEvent
     */
    public void payBill(ActionEvent actionEvent) {
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iter = bindings.findIteratorBinding("BillVO1Iterator");
        com.lf.bill.management.entity.bill.Bill bill = new com.lf.bill.management.entity.bill.Bill();
        if (iter != null) {
            Row row = iter.getViewObject().getCurrentRow();
            String billerId = (String)row.getAttribute("billerId");
            String custRefNo = (String)row.getAttribute("custRefNo");
            BigDecimal amount = (BigDecimal)row.getAttribute("amount");
            String modeOfPayment = (String)row.getAttribute("modeOfPayment");
            String transactionId = Long.toString(System.currentTimeMillis());
            bill.setTransactionId(transactionId);
            bill.setBillerId(billerId);
            bill.setCustomerRefNo(custRefNo);
            bill.setModeOfPayment(modeOfPayment);
            bill.setAmount(amount);
            bill.setDateOfPayment("07-Jul-2013");
            BillRepository rep = new BillRepository();
            rep.addBill(bill);
            row.setAttribute("transactionId", transactionId);
            row.setAttribute("isTransactionIdRendered", true);
            row.setAttribute("isTransactionIdReadonly", true);
            row.setAttribute("isBillerIdReadonly", true);
            row.setAttribute("isCustRefNoReadonly", true);
            row.setAttribute("isAmountReadonly", true);
            row.setAttribute("isModeOfPaymentReadonly", true);
            iter.getViewObject().insertRow(row);
            String messageText = "Your bill has been paid to the specified biller.";
            FacesMessage fm = new FacesMessage(messageText);
            fm.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, fm);
        }
    }
}
