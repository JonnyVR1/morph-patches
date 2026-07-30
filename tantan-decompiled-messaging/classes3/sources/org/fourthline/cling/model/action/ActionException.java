package org.fourthline.cling.model.action;

import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ActionException extends Exception {
    private int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionException(ErrorCode errorCode, String str, boolean z) {
        int code = errorCode.getCode();
        if (z) {
            str = errorCode.getDescription() + ". " + str + ".";
        }
        this(code, str);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public ActionException(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }

    public ActionException(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getDescription());
    }

    public ActionException(ErrorCode errorCode, String str) {
        this(errorCode, str, true);
    }

    public ActionException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public ActionException(ErrorCode errorCode, String str, Throwable th) {
        this(errorCode.getCode(), errorCode.getDescription() + ". " + str + ".", th);
    }
}
