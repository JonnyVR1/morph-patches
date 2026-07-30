package p149l;

import com.apm.lite.CrashType;

/* JADX INFO: loaded from: classes.dex */
public class wiq0 {

    /* JADX INFO: renamed from: a */
    private static volatile wiq0 f186562a;

    private wiq0() {
    }

    /* JADX INFO: renamed from: a */
    public static wiq0 m203345a() {
        if (f186562a == null) {
            synchronized (wiq0.class) {
                try {
                    if (f186562a == null) {
                        f186562a = new wiq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f186562a;
    }

    /* JADX INFO: renamed from: c */
    public void m203347c(String str) {
    }

    /* JADX INFO: renamed from: b */
    public void m203346b(CrashType crashType, long j, String str) {
    }
}
