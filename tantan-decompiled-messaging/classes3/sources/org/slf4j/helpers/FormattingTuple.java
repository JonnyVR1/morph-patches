package org.slf4j.helpers;

import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FormattingTuple {
    public static FormattingTuple NULL = new FormattingTuple(null);
    private Object[] argArray;
    private String message;
    private Throwable throwable;

    public FormattingTuple(String str, Object[] objArr, Throwable th) {
        this.message = str;
        this.throwable = th;
        if (th == null) {
            this.argArray = objArr;
        } else {
            this.argArray = trimmedCopy(objArr);
        }
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            qkq0.a("non-sensical empty or null argument array");
            return null;
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    public Object[] getArgArray() {
        return this.argArray;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public FormattingTuple(String str) {
        this(str, null, null);
    }
}
