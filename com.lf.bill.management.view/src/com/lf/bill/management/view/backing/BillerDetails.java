package com.lf.bill.management.view.backing;

import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;

public class BillerDetails {
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
}
