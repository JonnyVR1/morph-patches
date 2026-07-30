package p149l;

import android.webkit.ConsoleMessage;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o9t0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f142744a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f142744a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f142744a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f142744a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f142744a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f142744a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
