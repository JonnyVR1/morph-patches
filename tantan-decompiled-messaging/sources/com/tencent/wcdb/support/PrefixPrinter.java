package com.tencent.wcdb.support;

import android.util.Printer;

/* JADX INFO: loaded from: classes2.dex */
public class PrefixPrinter implements Printer {
    private final String mPrefix;
    private final Printer mPrinter;

    private PrefixPrinter(Printer printer, String str) {
        this.mPrinter = printer;
        this.mPrefix = str;
    }

    public static Printer create(Printer printer, String str) {
        return (str == null || str.equals("")) ? printer : new PrefixPrinter(printer, str);
    }

    @Override // android.util.Printer
    public void println(String str) {
        this.mPrinter.println(this.mPrefix + str);
    }
}
