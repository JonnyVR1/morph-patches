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
    private int f61038a = 0;

    /* JADX INFO: renamed from: b */
    private String f61039b = "";

    /* JADX INFO: renamed from: a */
    public String m85422a(int i) {
        return "Api call failed.";
    }

    public int getCode() {
        return this.f61038a;
    }

    public String getErrorMsg() {
        return this.f61039b;
    }

    public boolean isSuccess() {
        return this.f61038a == 0;
    }

    public void setCode(int i) {
        String strM85422a;
        this.f61038a = i;
        if (i == -2001) {
            strM85422a = "Not login.";
        } else if (i == -2000) {
            strM85422a = "The given params check failed.";
        } else if (i != 0) {
            switch (i) {
                case -1002:
                    strM85422a = "The QQ branch (e.g. TIM) is not supported";
                    break;
                case -1001:
                    strM85422a = "QQ version is too low.";
                    break;
                case -1000:
                    strM85422a = "QQ is not installed.";
                    break;
                default:
                    strM85422a = m85422a(i);
                    break;
            }
        } else {
            strM85422a = "";
        }
        setErrorMsg(strM85422a);
    }

    public void setErrorMsg(String str) {
        this.f61039b = str;
    }

    public String toString() {
        return "BaseResp{mCode=" + this.f61038a + ", mErrorMsg='" + this.f61039b + "'}";
    }
}
