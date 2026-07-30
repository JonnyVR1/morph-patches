package com.quickjs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class QuickJSException extends RuntimeException {
    private String name;

    public QuickJSException(String str, String str2) {
        super(str + "\n" + str2);
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public QuickJSException(String str, Throwable th) {
        super(str, th);
    }

    public QuickJSException(Throwable th) {
        super(th);
    }
}
