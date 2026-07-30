package com.idv.identity.platform.model;

/* JADX INFO: loaded from: classes7.dex */
public class ZimResBase {
    public int Code;
    public String Message;
    public String RequestId;
    public String ResultObject;

    public boolean isSuccess() {
        return isValid();
    }

    public boolean isValid() {
        return this.ResultObject != null && this.Code == 200;
    }
}
