package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Sat Jan 10 16:14:35 PST 2015
 */
public class JSONRPCTransaction implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private Long _unixtime;
        public Builder unixtime(Long unixtime) { this._unixtime = unixtime; return this; }
        private Long _confirmations;
        public Builder confirmations(Long confirmations) { this._confirmations = confirmations; return this; }
        private String _category;
        public Builder category(String category) { this._category = category; return this; }
        private JSONRPCTransactionAmount[] _amounts;
        public Builder amounts(JSONRPCTransactionAmount[] amounts) { this._amounts = amounts; return this; }
        private Double _fee;
        public Builder fee(Double fee) { this._fee = fee; return this; }
        private String _txid;
        public Builder txid(String txid) { this._txid = txid; return this; }
        private String _address;
        public Builder address(String address) { this._address = address; return this; }
        private Long _payment_ref;
        public Builder payment_ref(Long payment_ref) { this._payment_ref = payment_ref; return this; }
        public JSONRPCTransaction build() {
            return new JSONRPCTransaction(this._unixtime, this._confirmations, this._category, this._amounts, this._fee, this._txid, this._address, this._payment_ref);
        }

        public Builder() { }
        public Builder(JSONRPCTransaction obj) {
            this._unixtime = obj.getUnixtime();
            this._confirmations = obj.getConfirmations();
            this._category = obj.getCategory();
            this._amounts = obj.getAmounts();
            this._fee = obj.getFee();
            this._txid = obj.getTxid();
            this._address = obj.getAddress();
            this._payment_ref = obj.getPayment_ref();
        }
    }

    private Double fee;
    private Long payment_ref;
    private String category;
    private JSONRPCTransactionAmount[] amounts;
    private Long unixtime;
    private Long confirmations;
    private String address;
    private String txid;

    public JSONRPCTransaction() {
        super();
    }

    public JSONRPCTransaction(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("unixtime"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("confirmations"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("category"), false),
            (JSONRPCTransactionAmount[])com.bitmechanic.barrister.ArrayTypeConverter.unmarshalList(JSONRPCTransactionAmount.class, _map.get("amounts"), false),
            (Double)com.bitmechanic.barrister.FloatTypeConverter.unmarshal(_map.get("fee"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("txid"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("address"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("payment_ref"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public JSONRPCTransaction(
            @org.codehaus.jackson.annotate.JsonProperty("unixtime") Long unixtime, 
            @org.codehaus.jackson.annotate.JsonProperty("confirmations") Long confirmations, 
            @org.codehaus.jackson.annotate.JsonProperty("category") String category, 
            @org.codehaus.jackson.annotate.JsonProperty("amounts") JSONRPCTransactionAmount[] amounts, 
            @org.codehaus.jackson.annotate.JsonProperty("fee") Double fee, 
            @org.codehaus.jackson.annotate.JsonProperty("txid") String txid, 
            @org.codehaus.jackson.annotate.JsonProperty("address") String address, 
            @org.codehaus.jackson.annotate.JsonProperty("payment_ref") Long payment_ref) {
        super();
        this.unixtime = unixtime;
        this.confirmations = confirmations;
        this.category = category;
        this.amounts = amounts;
        this.fee = fee;
        this.txid = txid;
        this.address = address;
        this.payment_ref = payment_ref;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getFee() {
        return this.fee;
    }

    public void setPayment_ref(Long payment_ref) {
        this.payment_ref = payment_ref;
    }

    public Long getPayment_ref() {
        return this.payment_ref;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setAmounts(JSONRPCTransactionAmount[] amounts) {
        this.amounts = amounts;
    }

    public JSONRPCTransactionAmount[] getAmounts() {
        return this.amounts;
    }

    public void setUnixtime(Long unixtime) {
        this.unixtime = unixtime;
    }

    public Long getUnixtime() {
        return this.unixtime;
    }

    public void setConfirmations(Long confirmations) {
        this.confirmations = confirmations;
    }

    public Long getConfirmations() {
        return this.confirmations;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getTxid() {
        return this.txid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCTransaction:");
        sb.append(" fee=").append(fee);
        sb.append(" payment_ref=").append(payment_ref);
        sb.append(" category=").append(category);
        sb.append(" amounts=").append(amounts);
        sb.append(" unixtime=").append(unixtime);
        sb.append(" confirmations=").append(confirmations);
        sb.append(" address=").append(address);
        sb.append(" txid=").append(txid);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof JSONRPCTransaction)) { return false; }
        JSONRPCTransaction _o = (JSONRPCTransaction)_other;
        if (fee == null && _o.fee != null) { return false; }
        else if (fee != null && !fee.equals(_o.fee)) { return false; }
        if (payment_ref == null && _o.payment_ref != null) { return false; }
        else if (payment_ref != null && !payment_ref.equals(_o.payment_ref)) { return false; }
        if (category == null && _o.category != null) { return false; }
        else if (category != null && !category.equals(_o.category)) { return false; }
        if (amounts == null && _o.amounts != null) { return false; }
        else if (amounts != null && !java.util.Arrays.equals(amounts, _o.amounts)) { return false; }
        if (unixtime == null && _o.unixtime != null) { return false; }
        else if (unixtime != null && !unixtime.equals(_o.unixtime)) { return false; }
        if (confirmations == null && _o.confirmations != null) { return false; }
        else if (confirmations != null && !confirmations.equals(_o.confirmations)) { return false; }
        if (address == null && _o.address != null) { return false; }
        else if (address != null && !address.equals(_o.address)) { return false; }
        if (txid == null && _o.txid != null) { return false; }
        else if (txid != null && !txid.equals(_o.txid)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (fee == null ? 0 : fee.hashCode());
        _hash = _hash * 31 + (payment_ref == null ? 0 : payment_ref.hashCode());
        _hash = _hash * 31 + (category == null ? 0 : category.hashCode());
        _hash = _hash * 31 + (amounts == null ? 0 : java.util.Arrays.hashCode(amounts));
        _hash = _hash * 31 + (unixtime == null ? 0 : unixtime.hashCode());
        _hash = _hash * 31 + (confirmations == null ? 0 : confirmations.hashCode());
        _hash = _hash * 31 + (address == null ? 0 : address.hashCode());
        _hash = _hash * 31 + (txid == null ? 0 : txid.hashCode());
        return _hash;
    }
}

