package com.sina.weibo.sdk.auth;

import com.sina.weibo.sdk.utils.WbAuthConstants;

/* JADX INFO: loaded from: classes11.dex */
public class WbConnectErrorMessage {
    private String errorCode;
    private String errorMessage;

    public WbConnectErrorMessage() {
        this.errorMessage = WbAuthConstants.AUTH_FAILED_NOT_INSTALL_MSG;
        this.errorCode = WbAuthConstants.AUTH_FAILED_NOT_INSTALL_CODE;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public WbConnectErrorMessage(String str, String str2) {
        this.errorMessage = str;
        this.errorCode = str2;
    }
}
