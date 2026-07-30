package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes3.dex */
public class AlertLevel {
    public static final short fatal = 2;
    public static final short warning = 1;

    public static String getName(short s) {
        if (s != 1) {
            return s != 2 ? "UNKNOWN" : "fatal";
        }
        return "warning";
    }

    public static String getText(short s) {
        return getName(s) + "(" + ((int) s) + ")";
    }
}
