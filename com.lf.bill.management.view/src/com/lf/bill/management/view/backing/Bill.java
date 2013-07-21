package com.lf.bill.management.view.backing;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;

import oracle.jbo.Row;


public class Bill {
    private RichPanelGroupLayout pgl1;
    private RichPanelBox pb1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;

    public Bill() {
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iter = bindings.findIteratorBinding("BillVO1Iterator");
        if (iter != null) {
            if (iter.getViewObject().getCurrentRow() == null) {
                Row row = iter.getViewObject().createRow();
                row.setAttribute("isTransactionIdRendered", false);
                row.setAttribute("isBillerIdReadonly", false);
                row.setAttribute("isCustRefNoReadonly", false);
                row.setAttribute("isAmountReadonly", false);
                row.setAttribute("isModeOfPaymentReadonly", false);
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
     * @param it5
     */
    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    /**
     * @return
     */
    public RichInputText getIt5() {
        return it5;
    }


}
