package com.idv.identity.platform.model;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityOcrVerifyContent {
    public String BizCode;
    public String BizMessage;
    public String extParams;
    public String hasNext;

    public String getBizCode() {
        return this.BizCode;
    }

    public String getBizMessage() {
        return this.BizMessage;
    }

    public boolean isOCRVerifySuccess() {
        if (isValid()) {
            return "CODE_VERIFY_SUCCESS".equalsIgnoreCase(this.BizCode);
        }
        return false;
    }

    public boolean isValid() {
        return true;
    }
}
