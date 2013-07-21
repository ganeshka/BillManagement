package com.lf.bill.management.view.backing.biller;


import com.lf.bill.management.service.biller.BillerRepository;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;

import oracle.jbo.Row;


public class Biller {

    private String billerId;
    private String billerName;
    private String billerDesc;
    private String billerAdd;

    private RichPanelGroupLayout pgl1;
    private RichPanelBox pb1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;

    public Biller() {
        DCIteratorBinding iter = getBillerVO();
        if (iter != null) {
            Row row = iter.getCurrentRow();
            if (row == null) {
                row = iter.getViewObject().createRow();
                row.setAttribute("billerId", null);
                row.setAttribute("billerName", null);
                row.setAttribute("billerDesc", null);
                row.setAttribute("billerAdd", null);
                row.setAttribute("isBillerIdReadonly", false);
                row.setAttribute("isBillerNameReadonly", false);
                row.setAttribute("isBillerDescReadonly", false);
                row.setAttribute("isBillerAddReadonly", false);
                iter.getViewObject().insertRow(row);
            }
        }
    }

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
     * @param pfl1
     */
    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    /**
     * @return
     */
    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    /**
     * @param it1
     */
    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    /**
     * @return
     */
    public RichInputText getIt1() {
        return it1;
    }

    /**
     * @param it2
     */
    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    /**
     * @return
     */
    public RichInputText getIt2() {
        return it2;
    }

    /**
     * @param it3
     */
    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    /**
     * @return
     */
    public RichInputText getIt3() {
        return it3;
    }

    /**
     * @param it4
     */
    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    /**
     * @return
     */
    public RichInputText getIt4() {
        return it4;
    }

    /**
     * @param billerId
     */
    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    /**
     * @return
     */
    public String getBillerId() {
        return billerId;
    }

    /**
     * @param billerName
     */
    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    /**
     * @return
     */
    public String getBillerName() {
        return billerName;
    }

    /**
     * @param billerDesc
     */
    public void setBillerDesc(String billerDesc) {
        this.billerDesc = billerDesc;
    }

    /**
     * @return
     */
    public String getBillerDesc() {
        return billerDesc;
    }

    /**
     * @param billerAdd
     */
    public void setBillerAdd(String billerAdd) {
        this.billerAdd = billerAdd;
    }

    /**
     * @return
     */
    public String getBillerAdd() {
        return billerAdd;
    }

    /**
     * @return
     */
    public DCIteratorBinding getBillerVO() {
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iter = bindings.findIteratorBinding("BillerVO1Iterator");
        return iter;
    }

    /**
     * @param valueChangeEvent
     */
    public void fetchBillerOnValueChange(ValueChangeEvent valueChangeEvent) {
        String billerId = (String)valueChangeEvent.getNewValue();
        BillerRepository rep = new BillerRepository();
        com.lf.bill.management.entity.biller.Biller biller = rep.fetchBiller(billerId);
        DCIteratorBinding iter = getBillerVO();
        if (iter != null) {
            Row row = iter.getCurrentRow();
            if (row != null) { 
                row.setAttribute("billerId", billerId);
                row.setAttribute("billerName", biller.getName());
                row.setAttribute("billerDesc", biller.getDesc());
                row.setAttribute("billerAdd", biller.getAdd());
            } else {
                row = iter.getViewObject().createRow();
                row.setAttribute("billerId", billerId);
                row.setAttribute("billerName", biller.getName());
                row.setAttribute("billerDesc", biller.getDesc());
                row.setAttribute("billerAdd", biller.getAdd());
                iter.getViewObject().insertRow(row);
            }
        }
    }
}
