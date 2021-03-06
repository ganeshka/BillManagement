package com.lf.bill.management.model.biller.vo;

import oracle.jbo.domain.BFileDomain;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jul 06 22:50:48 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BillerVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        billerId {
            public Object get(BillerVORowImpl obj) {
                return obj.getbillerId();
            }

            public void put(BillerVORowImpl obj, Object value) {
                obj.setbillerId((String)value);
            }
        }
        ,
        billerName {
            public Object get(BillerVORowImpl obj) {
                return obj.getbillerName();
            }

            public void put(BillerVORowImpl obj, Object value) {
                obj.setbillerName((String)value);
            }
        }
        ,
        billerDesc {
            public Object get(BillerVORowImpl obj) {
                return obj.getbillerDesc();
            }

            public void put(BillerVORowImpl obj, Object value) {
                obj.setbillerDesc((String)value);
            }
        }
        ,
        billerAdd {
            public Object get(BillerVORowImpl obj) {
                return obj.getbillerAdd();
            }

            public void put(BillerVORowImpl obj, Object value) {
                obj.setbillerAdd((String)value);
            }
        }
        ,
        isBillerIdReadonly {
            public Object get(BillerVORowImpl obj) {
                return obj.getisBillerIdReadonly();
            }

            public void put(BillerVORowImpl obj, Object value) {
                obj.setisBillerIdReadonly((Boolean)value);
            }
        }
        ,
        isBillerNameReadonly {
            public Object get(BillerVORowImpl obj) {
                return obj.getisBillerNameReadonly();
            }

            public void put(BillerVORowImpl obj, Object value) {
                obj.setisBillerNameReadonly((Boolean)value);
            }
        }
        ,
        isBillerDescReadonly {
            public Object get(BillerVORowImpl obj) {
                return obj.getisBillerDescReadonly();
            }

            public void put(BillerVORowImpl obj, Object value) {
                obj.setisBillerDescReadonly((Boolean)value);
            }
        }
        ,
        isBillerAddReadonly {
            public Object get(BillerVORowImpl obj) {
                return obj.getisBillerAddReadonly();
            }

            public void put(BillerVORowImpl obj, Object value) {
                obj.setisBillerAddReadonly((Boolean)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(BillerVORowImpl object);

        public abstract void put(BillerVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int BILLERID = AttributesEnum.billerId.index();
    public static final int BILLERNAME = AttributesEnum.billerName.index();
    public static final int BILLERDESC = AttributesEnum.billerDesc.index();
    public static final int BILLERADD = AttributesEnum.billerAdd.index();
    public static final int ISBILLERIDREADONLY = AttributesEnum.isBillerIdReadonly.index();
    public static final int ISBILLERNAMEREADONLY = AttributesEnum.isBillerNameReadonly.index();
    public static final int ISBILLERDESCREADONLY = AttributesEnum.isBillerDescReadonly.index();
    public static final int ISBILLERADDREADONLY = AttributesEnum.isBillerAddReadonly.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BillerVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute billerId.
     * @return the billerId
     */
    public String getbillerId() {
        return (String) getAttributeInternal(BILLERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute billerId.
     * @param value value to set the  billerId
     */
    public void setbillerId(String value) {
        setAttributeInternal(BILLERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute billerName.
     * @return the billerName
     */
    public String getbillerName() {
        return (String) getAttributeInternal(BILLERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute billerName.
     * @param value value to set the  billerName
     */
    public void setbillerName(String value) {
        setAttributeInternal(BILLERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute billerDesc.
     * @return the billerDesc
     */
    public String getbillerDesc() {
        return (String) getAttributeInternal(BILLERDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute billerDesc.
     * @param value value to set the  billerDesc
     */
    public void setbillerDesc(String value) {
        setAttributeInternal(BILLERDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute billerAdd.
     * @return the billerAdd
     */
    public String getbillerAdd() {
        return (String) getAttributeInternal(BILLERADD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute billerAdd.
     * @param value value to set the  billerAdd
     */
    public void setbillerAdd(String value) {
        setAttributeInternal(BILLERADD, value);
    }


    /**
     * Gets the attribute value for the calculated attribute isBillerIdReadonly.
     * @return the isBillerIdReadonly
     */
    public Boolean getisBillerIdReadonly() {
        return (Boolean) getAttributeInternal(ISBILLERIDREADONLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isBillerIdReadonly.
     * @param value value to set the  isBillerIdReadonly
     */
    public void setisBillerIdReadonly(Boolean value) {
        setAttributeInternal(ISBILLERIDREADONLY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute isBillerNameReadonly.
     * @return the isBillerNameReadonly
     */
    public Boolean getisBillerNameReadonly() {
        return (Boolean) getAttributeInternal(ISBILLERNAMEREADONLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isBillerNameReadonly.
     * @param value value to set the  isBillerNameReadonly
     */
    public void setisBillerNameReadonly(Boolean value) {
        setAttributeInternal(ISBILLERNAMEREADONLY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute isBillerDescReadonly.
     * @return the isBillerDescReadonly
     */
    public Boolean getisBillerDescReadonly() {
        return (Boolean) getAttributeInternal(ISBILLERDESCREADONLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isBillerDescReadonly.
     * @param value value to set the  isBillerDescReadonly
     */
    public void setisBillerDescReadonly(Boolean value) {
        setAttributeInternal(ISBILLERDESCREADONLY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute isBillerAddReadonly.
     * @return the isBillerAddReadonly
     */
    public Boolean getisBillerAddReadonly() {
        return (Boolean) getAttributeInternal(ISBILLERADDREADONLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isBillerAddReadonly.
     * @param value value to set the  isBillerAddReadonly
     */
    public void setisBillerAddReadonly(Boolean value) {
        setAttributeInternal(ISBILLERADDREADONLY, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
