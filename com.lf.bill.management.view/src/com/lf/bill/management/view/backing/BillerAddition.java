package com.lf.bill.management.view.backing;


import com.lf.bill.management.entity.biller.Biller;
import com.lf.bill.management.service.biller.BillerRepository;

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


public class BillerAddition {
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
    public RichCommandButton getCb1() {
        return cb1;
    }

    /**
     * @param actionEvent
     */
    public void createBiller(ActionEvent actionEvent) {
        BillerRepository billerRepo = new BillerRepository();
        Biller biller = new Biller();

        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iter = bindings.findIteratorBinding("BillerVO1Iterator");
        if (iter != null) {
            Row row = iter.getCurrentRow();
            biller.setId((String)row.getAttribute("billerId"));
            biller.setName((String)row.getAttribute("billerName"));
            biller.setDesc((String)row.getAttribute("billerDesc"));
            biller.setAdd((String)row.getAttribute("billerAdd"));
            billerRepo.addBiller(biller);
            row.setAttribute("isBillerIdReadonly", true);
            row.setAttribute("isBillerNameReadonly", true);
            row.setAttribute("isBillerDescReadonly", true);
            row.setAttribute("isBillerAddReadonly", true);
            String messageText = "Biller has been added to the system successfully";
            FacesMessage fm = new FacesMessage(messageText);
            fm.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, fm);
        }
    }
}
