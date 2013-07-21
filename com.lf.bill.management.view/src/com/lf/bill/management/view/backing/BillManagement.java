package com.lf.bill.management.view.backing;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichSpacer;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;


public class BillManagement {
    private RichDecorativeBox db1;
    private RichPanelSplitter ps1;
    private RichPanelSplitter ps3;
    private RichDecorativeBox db3;
    private RichDecorativeBox db2;
    private RichPanelSplitter ps4;
    private RichPanelSplitter ps2;
    private RichForm f1;
    private RichDocument d1;
    private RichImage i1;
    private RichPanelGroupLayout pgl1;
    private RichCommandButton cb1;
    private RichCommandButton cb2;
    private RichCommandButton cb3;
    private RichCommandButton cb4;
    private RichRegion r1;
    private RichPanelGroupLayout pgl3;
    private RichRegion r2;
    private RichRegion r4;
    private RichRegion r5;
    private RichPanelFormLayout pfl1;
    private RichCommandButton cb5;
    private RichOutputText ot1;
    private RichOutputText ot2;
    private RichPanelBox pb1;
    private RichPanelGroupLayout pgl2;
    private RichOutputText ot3;
    private RichSpacer s1;
    private RichRegion r3;
    private RichCommandLink cl1;
    private RichCommandLink cl2;
    private RichCommandLink cl3;
    private RichCommandLink cl4;
    private RichCommandLink cl5;

    /**
     * @param db1
     */
    public void setDb1(RichDecorativeBox db1) {
        this.db1 = db1;
    }

    /**
     * @return
     */
    public RichDecorativeBox getDb1() {
        return db1;
    }

    /**
     * @param ps1
     */
    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    /**
     * @return
     */
    public RichPanelSplitter getPs1() {
        return ps1;
    }

    /**
     * @param ps3
     */
    public void setPs3(RichPanelSplitter ps3) {
        this.ps3 = ps3;
    }

    /**
     * @return
     */
    public RichPanelSplitter getPs3() {
        return ps3;
    }

    /**
     * @param db3
     */
    public void setDb3(RichDecorativeBox db3) {
        this.db3 = db3;
    }

    /**
     * @return
     */
    public RichDecorativeBox getDb3() {
        return db3;
    }

    /**
     * @param db2
     */
    public void setDb2(RichDecorativeBox db2) {
        this.db2 = db2;
    }

    /**
     * @return
     */
    public RichDecorativeBox getDb2() {
        return db2;
    }

    /**
     * @param ps4
     */
    public void setPs4(RichPanelSplitter ps4) {
        this.ps4 = ps4;
    }

    /**
     * @return
     */
    public RichPanelSplitter getPs4() {
        return ps4;
    }

    /**
     * @param ps2
     */
    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    /**
     * @return
     */
    public RichPanelSplitter getPs2() {
        return ps2;
    }

    /**
     * @param f1
     */
    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    /**
     * @return
     */
    public RichForm getF1() {
        return f1;
    }

    /**
     * @param d1
     */
    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    /**
     * @return
     */
    public RichDocument getD1() {
        return d1;
    }

    /**
     * @param i1
     */
    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    /**
     * @return
     */
    public RichImage getI1() {
        return i1;
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
     * @param cb1
     */
    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    /**
     * @return
     */
    public RichCommandButton getCb1() {
        return cb1;
    }

    /**
     * @param cb2
     */
    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    /**
     * @return
     */
    public RichCommandButton getCb2() {
        return cb2;
    }

    /**
     * @param cb3
     */
    public void setCb3(RichCommandButton cb3) {
        this.cb3 = cb3;
    }

    /**
     * @return
     */
    public RichCommandButton getCb3() {
        return cb3;
    }

    /**
     * @param cb4
     */
    public void setCb4(RichCommandButton cb4) {
        this.cb4 = cb4;
    }

    /**
     * @return
     */
    public RichCommandButton getCb4() {
        return cb4;
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
     * @param pgl3
     */
    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    /**
     * @return
     */
    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    /**
     * @param r2
     */
    public void setR2(RichRegion r2) {
        this.r2 = r2;
    }

    /**
     * @return
     */
    public RichRegion getR2() {
        return r2;
    }


    /**
     * @param r4
     */
    public void setR4(RichRegion r4) {
        this.r4 = r4;
    }

    /**
     * @return
     */
    public RichRegion getR4() {
        return r4;
    }

    /**
     * @param r5
     */
    public void setR5(RichRegion r5) {
        this.r5 = r5;
    }

    /**
     * @return
     */
    public RichRegion getR5() {
        return r5;
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
     * @param cb5
     */
    public void setCb5(RichCommandButton cb5) {
        this.cb5 = cb5;
    }

    /**
     * @return
     */
    public RichCommandButton getCb5() {
        return cb5;
    }

    /**
     * @param ot1
     */
    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    /**
     * @return
     */
    public RichOutputText getOt1() {
        return ot1;
    }

    /**
     * @param ot2
     */
    public void setOt2(RichOutputText ot2) {
        this.ot2 = ot2;
    }

    /**
     * @return
     */
    public RichOutputText getOt2() {
        return ot2;
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
     * @param pgl2
     */
    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    /**
     * @return
     */
    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    /**
     * @param ot3
     */
    public void setOt3(RichOutputText ot3) {
        this.ot3 = ot3;
    }

    /**
     * @return
     */
    public RichOutputText getOt3() {
        return ot3;
    }

    /**
     * @param s1
     */
    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    /**
     * @return
     */
    public RichSpacer getS1() {
        return s1;
    }

    /**
     * @param actionEvent
     */
    public void onBoardBiller(ActionEvent actionEvent) {
        resetBillerVO();
        this.getR1().setRendered(true);
        this.getR2().setRendered(false);
        this.getR3().setRendered(false);
        this.getR4().setRendered(false);
        this.getR5().setRendered(false);

        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iter = bindings.findIteratorBinding("BillerVO1Iterator");
        if (iter != null) {
            Row currRow = iter.getViewObject().getCurrentRow();
            currRow.setAttribute("isBillerIdReadonly", false);
            currRow.setAttribute("isBillerNameReadonly", false);
            currRow.setAttribute("isBillerDescReadonly", false);
            currRow.setAttribute("isBillerAddReadonly", false);
        }
    }

    /**
     * @param actionEvent
     */
    public void viewBillerDetails(ActionEvent actionEvent) {
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iter = bindings.findIteratorBinding("BillerVO1Iterator");
        if (iter != null) {
            Row currRow = iter.getViewObject().getCurrentRow();
            currRow.setAttribute("isBillerIdReadonly", false);
            currRow.setAttribute("isBillerNameReadonly", true);
            currRow.setAttribute("isBillerDescReadonly", true);
            currRow.setAttribute("isBillerAddReadonly", true);
        }
        //        resetBillerVO();
        this.getR3().setRendered(true);
        this.getR3().setImmediate(true);
        this.getR3().setVisible(true);
        this.getR1().setRendered(false);
        this.getR2().setRendered(false);
        this.getR4().setRendered(false);
        this.getR3().setRendered(false);
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getR3());
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPgl3());
    }

    /**
     * @param actionEvent
     */
    public void billPaymentClicked(ActionEvent actionEvent) {
        resetBillerVO();
        this.getR1().setRendered(false);
        this.getR2().setRendered(false);
        this.getR3().setRendered(false);
        this.getR4().setRendered(false);
        this.getR5().setRendered(true);

    }

    /**
     * @param actionEvent
     */
    public void reset(ActionEvent actionEvent) {
        this.getR1().setRendered(false);
        this.getR2().setRendered(false);
        this.getR3().setRendered(false);
        this.getR4().setRendered(false);
        this.getR5().setRendered(false);
        resetBillerVO();
    }


    /**
     * @param actionEvent
     */
    public void fetchHistPayments(ActionEvent actionEvent) {
        this.getR1().setRendered(false);
        this.getR2().setRendered(false);
        this.getR3().setRendered(false);
        this.getR4().setRendered(false);
        this.getR5().setRendered(false);
        String query = "select * from bill where dateofpayment >= '07-Jul-13' and dateofpayment < '08-jul-14'";
        
    }

    public void resetBillerVO() {
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iter = bindings.findIteratorBinding("BillerVO1Iterator");
        if (iter != null) {
            Row row = iter.getViewObject().getCurrentRow();
            row.setAttribute("billerId", null);
            row.setAttribute("billerName", null);
            row.setAttribute("billerDesc", null);
            row.setAttribute("billerAdd", null);
        }
        iter = bindings.findIteratorBinding("BillVO1Iterator");
        if (iter != null) {
            Row row = iter.getViewObject().getCurrentRow();
            row.setAttribute("transactionId", null);
            row.setAttribute("billerId", null);
            row.setAttribute("custRefNo", null);
            row.setAttribute("amount", null);
            row.setAttribute("modeOfPayment", null);
        }
    }

    /**
     * @param r3
     */
    public void setR3(RichRegion r3) {
        this.r3 = r3;
    }

    /**
     * @return
     */
    public RichRegion getR3() {
        return r3;
    }

    /**
     * @param cl1
     */
    public void setCl1(RichCommandLink cl1) {
        this.cl1 = cl1;
    }

    /**
     * @return
     */
    public RichCommandLink getCl1() {
        return cl1;
    }

    /**
     * @param cl2
     */
    public void setCl2(RichCommandLink cl2) {
        this.cl2 = cl2;
    }

    /**
     * @return
     */
    public RichCommandLink getCl2() {
        return cl2;
    }

    /**
     * @param cl3
     */
    public void setCl3(RichCommandLink cl3) {
        this.cl3 = cl3;
    }

    /**
     * @return
     */
    public RichCommandLink getCl3() {
        return cl3;
    }

    /**
     * @param cl4
     */
    public void setCl4(RichCommandLink cl4) {
        this.cl4 = cl4;
    }

    /**
     * @return
     */
    public RichCommandLink getCl4() {
        return cl4;
    }

    /**
     * @param cl5
     */
    public void setCl5(RichCommandLink cl5) {
        this.cl5 = cl5;
    }

    /**
     * @return
     */
    public RichCommandLink getCl5() {
        return cl5;
    }
}
