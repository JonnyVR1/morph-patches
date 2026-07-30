package com.momosec.mmuid.network.exception;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class HttpBaseException extends Exception {
    public int errorCode;
    public String httpResultString;

    public HttpBaseException(String str, int i, String str2) {
        super(str);
        this.errorCode = i;
        this.httpResultString = str2;
    }

    public HttpBaseException(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public HttpBaseException(String str) {
        super(str);
        this.errorCode = -1;
    }

    public HttpBaseException(String str, Throwable th) {
        super(str, th);
        this.errorCode = -1;
    }
}
