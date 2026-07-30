package p153l;

import android.webkit.ConsoleMessage;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uit0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f179147a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f179147a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f179147a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f179147a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f179147a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f179147a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
