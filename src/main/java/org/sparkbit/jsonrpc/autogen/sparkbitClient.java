package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Sat Jan 10 16:14:35 PST 2015
 */
public class sparkbitClient implements sparkbit {

    private com.bitmechanic.barrister.Transport _trans;

    public sparkbitClient(com.bitmechanic.barrister.Transport trans) {
        trans.getContract().setPackage("org.sparkbit.jsonrpc.autogen");
        trans.getContract().setNsPackage("org.sparkbit.jsonrpc.autogen");
        this._trans = trans;
    }

    public Boolean createwallet(String walletname) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.createwallet", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (Boolean)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public String sendasset(String walletname, String address, String assetref, Double quantity, Boolean senderpays) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, address, assetref, quantity, senderpays };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.sendasset", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (String)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public JSONRPCStatusResponse getstatus() throws com.bitmechanic.barrister.RpcException {
        Object _params = null;
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.getstatus", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (JSONRPCStatusResponse)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public String[] listwallets() throws com.bitmechanic.barrister.RpcException {
        Object _params = null;
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.listwallets", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (String[])_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public Boolean deleteasset(String walletname, String assetref) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, assetref };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.deleteasset", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (Boolean)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public Boolean deletewallet(String walletname) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.deletewallet", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (Boolean)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public Boolean setassetvisible(String walletname, String assetref, Boolean visibility) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, assetref, visibility };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.setassetvisible", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (Boolean)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public Boolean addasset(String walletname, String assetref) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, assetref };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.addasset", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (Boolean)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public Boolean refreshasset(String walletname, String assetref) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, assetref };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.refreshasset", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (Boolean)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public JSONRPCAddressBookEntry[] listaddresses(String walletname) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.listaddresses", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (JSONRPCAddressBookEntry[])_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public JSONRPCAddressBookEntry[] createaddresses(String walletname, Long quantity) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, quantity };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.createaddresses", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (JSONRPCAddressBookEntry[])_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public Boolean setaddresslabel(String walletname, String address, String label) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, address, label };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.setaddresslabel", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (Boolean)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public JSONRPCTransaction[] listtransactions(String walletname, Long limit) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, limit };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.listtransactions", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (JSONRPCTransaction[])_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public JSONRPCBalance[] listbalances(String walletname, Boolean onlyvisible) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, onlyvisible };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.listbalances", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (JSONRPCBalance[])_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public String sendbitcoin(String walletname, String address, Double amount) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, address, amount };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.sendbitcoin", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (String)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public Boolean stop() throws com.bitmechanic.barrister.RpcException {
        Object _params = null;
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.stop", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (Boolean)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public JSONRPCUnspentTransactionOutput[] listunspent(String walletname, Long minconf, Long maxconf, String[] addresses) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, minconf, maxconf, addresses };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.listunspent", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (JSONRPCUnspentTransactionOutput[])_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public String sendbitcoinwith(String walletname, String txid, Long vout, String address, Double amount) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, txid, vout, address, amount };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.sendbitcoinwith", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (String)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

    public String sendassetwith(String walletname, String txid, Long vout, String address, String assetref, Double quantity, Boolean senderpays) throws com.bitmechanic.barrister.RpcException {
        Object _params = new Object[] { walletname, txid, vout, address, assetref, quantity, senderpays };
        com.bitmechanic.barrister.RpcRequest _req = new com.bitmechanic.barrister.RpcRequest(java.util.UUID.randomUUID().toString(), "sparkbit.sendassetwith", _params);
        com.bitmechanic.barrister.RpcResponse _resp = this._trans.request(_req);
        if (_resp == null) {
            return null;
        }
        else if (_resp.getError() == null) {
            return (String)_resp.getResult();
        }
        else {
            throw _resp.getError();
        }
    }

}

