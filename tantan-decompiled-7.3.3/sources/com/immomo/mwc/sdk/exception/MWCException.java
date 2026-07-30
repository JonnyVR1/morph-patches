package com.immomo.mwc.sdk.exception;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class MWCException extends Exception {
    private int code;

    public MWCException() {
        this.code = 0;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "MWCException{code=" + this.code + ",message=\"" + getMessage() + "\"}";
    }

    public MWCException(int i) {
        this.code = i;
    }

    public MWCException(String str, Throwable th) {
        super(str, th);
        this.code = 0;
    }

    public MWCException(int i, String str, Throwable th) {
        super(str, th);
        this.code = i;
    }

    public MWCException(String str) {
        super(str);
        this.code = 0;
    }

    public MWCException(int i, String str) {
        super(str);
        this.code = i;
    }

    public MWCException(Throwable th) {
        super(th);
        this.code = 0;
    }

    public MWCException(int i, Throwable th) {
        super(th);
        this.code = i;
    }
}
