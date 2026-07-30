package immomo.com.mklibrary.core;

import p149l.rdc0;
import p149l.shw;

/* JADX INFO: loaded from: classes2.dex */
public class NDKWrapper {
    private static String mkpkk;
    private static String mkpkkRSA;
    private static String mkstk;

    static {
        rdc0.m178959a(shw.m184283c(), "mkjni");
    }

    /* JADX INFO: renamed from: a */
    public static String m86990a() {
        try {
            if (m86992c(mkpkk)) {
                try {
                    mkpkk = mkpkk();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return mkpkk;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m86991b() {
        try {
            if (m86992c(mkpkkRSA)) {
                try {
                    mkpkkRSA = mkpkkRSA();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return mkpkkRSA;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m86992c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static native String mkpkk();

    private static native String mkpkkRSA();

    private static native String mkstk();
}
