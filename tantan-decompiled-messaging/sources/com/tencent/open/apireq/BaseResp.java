package com.tencent.open.apireq;

/* JADX INFO: loaded from: classes2.dex */
public class BaseResp {
    public static final int CODE_ERROR_PARAMS = -2000;
    public static final int CODE_NOT_LOGIN = -2001;
    public static final int CODE_PERMISSION_NOT_GRANTED = -1003;
    public static final int CODE_QQ_LOW_VERSION = -1001;
    public static final int CODE_QQ_NOT_INSTALLED = -1000;
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_UNSUPPORTED_BRANCH = -1002;

    /* JADX INFO: renamed from: a */
    private int f60190a = 0;

    /* JADX INFO: renamed from: b */
    private String f60191b = "";

    /* JADX INFO: renamed from: a */
    public String m84239a(int i) {
        return "Api call failed.";
    }

    public int getCode() {
        return this.f60190a;
    }

    public String getErrorMsg() {
        return this.f60191b;
    }

    public boolean isSuccess() {
        return this.f60190a == 0;
    }

    public void setCode(int i) {
        String strM84239a;
        this.f60190a = i;
        if (i == -2001) {
            strM84239a = "Not login.";
        } else if (i == -2000) {
            strM84239a = "The given params check failed.";
        } else if (i != 0) {
            switch (i) {
                case -1002:
                    strM84239a = "The QQ branch (e.g. TIM) is not supported";
                    break;
                case -1001:
                    strM84239a = "QQ version is too low.";
                    break;
                case -1000:
                    strM84239a = "QQ is not installed.";
                    break;
                default:
                    strM84239a = m84239a(i);
                    break;
            }
        } else {
            strM84239a = "";
        }
        setErrorMsg(strM84239a);
    }

    public void setErrorMsg(String str) {
        this.f60191b = str;
    }

    public String toString() {
        return "BaseResp{mCode=" + this.f60190a + ", mErrorMsg='" + this.f60191b + "'}";
    }
}
