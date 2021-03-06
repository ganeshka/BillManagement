package com.lf.bill.management.model.bill.vo;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;

import oracle.sql.REF;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jul 07 11:35:11 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BillVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        transactionId {
            public Object get(BillVORowImpl obj) {
                return obj.gettransactionId();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.settransactionId((String)value);
            }
        }
        ,
        billerId {
            public Object get(BillVORowImpl obj) {
                return obj.getbillerId();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setbillerId((String)value);
            }
        }
        ,
        custRefNo {
            public Object get(BillVORowImpl obj) {
                return obj.getcustRefNo();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setcustRefNo((String)value);
            }
        }
        ,
        amount {
            public Object get(BillVORowImpl obj) {
                return obj.getamount();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setamount((BigDecimal)value);
            }
        }
        ,
        modeOfPayment {
            public Object get(BillVORowImpl obj) {
                return obj.getmodeOfPayment();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setmodeOfPayment((String)value);
            }
        }
        ,
        isTransactionIdRendered {
            public Object get(BillVORowImpl obj) {
                return obj.getisTransactionIdRendered();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setisTransactionIdRendered((Boolean)value);
            }
        }
        ,
        isTransactionIdReadonly {
            public Object get(BillVORowImpl obj) {
                return obj.getisTransactionIdReadonly();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setisTransactionIdReadonly((Boolean)value);
            }
        }
        ,
        isBillerIdReadonly {
            public Object get(BillVORowImpl obj) {
                return obj.getisBillerIdReadonly();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setisBillerIdReadonly((Boolean)value);
            }
        }
        ,
        isCustRefNoReadonly {
            public Object get(BillVORowImpl obj) {
                return obj.getisCustRefNoReadonly();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setisCustRefNoReadonly((Boolean)value);
            }
        }
        ,
        isAmountReadonly {
            public Object get(BillVORowImpl obj) {
                return obj.getisAmountReadonly();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setisAmountReadonly((Boolean)value);
            }
        }
        ,
        isModeOfPaymentReadonly {
            public Object get(BillVORowImpl obj) {
                return obj.getisModeOfPaymentReadonly();
            }

            public void put(BillVORowImpl obj, Object value) {
                obj.setisModeOfPaymentReadonly((Boolean)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(BillVORowImpl object);

        public abstract void put(BillVORowImpl object, Object value);

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


    public static final int TRANSACTIONID = AttributesEnum.transactionId.index();
    public static final int BILLERID = AttributesEnum.billerId.index();
    public static final int CUSTREFNO = AttributesEnum.custRefNo.index();
    public static final int AMOUNT = AttributesEnum.amount.index();
    public static final int MODEOFPAYMENT = AttributesEnum.modeOfPayment.index();
    public static final int ISTRANSACTIONIDRENDERED = AttributesEnum.isTransactionIdRendered.index();
    public static final int ISTRANSACTIONIDREADONLY = AttributesEnum.isTransactionIdReadonly.index();
    public static final int ISBILLERIDREADONLY = AttributesEnum.isBillerIdReadonly.index();
    public static final int ISCUSTREFNOREADONLY = AttributesEnum.isCustRefNoReadonly.index();
    public static final int ISAMOUNTREADONLY = AttributesEnum.isAmountReadonly.index();
    public static final int ISMODEOFPAYMENTREADONLY = AttributesEnum.isModeOfPaymentReadonly.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BillVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute transactionId.
     * @return the transactionId
     */
    public String gettransactionId() {
        return (String) getAttributeInternal(TRANSACTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute transactionId.
     * @param value value to set the  transactionId
     */
    public void settransactionId(String value) {
        setAttributeInternal(TRANSACTIONID, value);
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
     * Gets the attribute value for the calculated attribute custRefNo.
     * @return the custRefNo
     */
    public String getcustRefNo() {
        return (String) getAttributeInternal(CUSTREFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute custRefNo.
     * @param value value to set the  custRefNo
     */
    public void setcustRefNo(String value) {
        setAttributeInternal(CUSTREFNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute amount.
     * @return the amount
     */
    public BigDecimal getamount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute amount.
     * @param value value to set the  amount
     */
    public void setamount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute modeOfPayment.
     * @return the modeOfPayment
     */
    public String getmodeOfPayment() {
        return (String) getAttributeInternal(MODEOFPAYMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute modeOfPayment.
     * @param value value to set the  modeOfPayment
     */
    public void setmodeOfPayment(String value) {
        setAttributeInternal(MODEOFPAYMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute isTransactionIdRendered.
     * @return the isTransactionIdRendered
     */
    public Boolean getisTransactionIdRendered() {
        return (Boolean) getAttributeInternal(ISTRANSACTIONIDRENDERED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isTransactionIdRendered.
     * @param value value to set the  isTransactionIdRendered
     */
    public void setisTransactionIdRendered(Boolean value) {
        setAttributeInternal(ISTRANSACTIONIDRENDERED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute isTransactionIdReadonly.
     * @return the isTransactionIdReadonly
     */
    public Boolean getisTransactionIdReadonly() {
        return (Boolean) getAttributeInternal(ISTRANSACTIONIDREADONLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isTransactionIdReadonly.
     * @param value value to set the  isTransactionIdReadonly
     */
    public void setisTransactionIdReadonly(Boolean value) {
        setAttributeInternal(ISTRANSACTIONIDREADONLY, value);
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
     * Gets the attribute value for the calculated attribute isCustRefNoReadonly.
     * @return the isCustRefNoReadonly
     */
    public Boolean getisCustRefNoReadonly() {
        return (Boolean) getAttributeInternal(ISCUSTREFNOREADONLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isCustRefNoReadonly.
     * @param value value to set the  isCustRefNoReadonly
     */
    public void setisCustRefNoReadonly(Boolean value) {
        setAttributeInternal(ISCUSTREFNOREADONLY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute isAmountReadonly.
     * @return the isAmountReadonly
     */
    public Boolean getisAmountReadonly() {
        return (Boolean) getAttributeInternal(ISAMOUNTREADONLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isAmountReadonly.
     * @param value value to set the  isAmountReadonly
     */
    public void setisAmountReadonly(Boolean value) {
        setAttributeInternal(ISAMOUNTREADONLY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute isModeOfPaymentReadonly.
     * @return the isModeOfPaymentReadonly
     */
    public Boolean getisModeOfPaymentReadonly() {
        return (Boolean) getAttributeInternal(ISMODEOFPAYMENTREADONLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute isModeOfPaymentReadonly.
     * @param value value to set the  isModeOfPaymentReadonly
     */
    public void setisModeOfPaymentReadonly(Boolean value) {
        setAttributeInternal(ISMODEOFPAYMENTREADONLY, value);
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
