package immomo.com.mklibrary.core;

import android.content.Context;
import android.util.Log;
import p153l.lv0;
import p153l.ylc0;

/* JADX INFO: loaded from: classes2.dex */
public class NDKWrapper {
    private static volatile boolean libraryLoaded = false;
    private static final Object loadLock = new Object();
    private static String mkpkk;
    private static String mkpkkRSA;
    private static String mkstk;

    /* JADX INFO: renamed from: a */
    private static void m88093a() {
        if (libraryLoaded) {
            return;
        }
        synchronized (loadLock) {
            if (libraryLoaded) {
                return;
            }
            try {
                Context contextM155971a = lv0.m155971a();
                if (contextM155971a != null) {
                    ylc0.m216566a(contextM155971a, "mkjni");
                } else {
                    System.loadLibrary("mkjni");
                }
                libraryLoaded = true;
            } catch (Throwable th) {
                Log.e("NDKWrapper", "load mkjni failure", th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m88094b() {
        try {
            m88093a();
            if (m88096d(mkpkk)) {
                try {
                    mkpkk = mkpkk();
                } catch (Throwable th) {
                    Log.e("getmkpkk", "", th);
                }
            }
            return mkpkk;
        } catch (Throwable th2) {
            Log.e("getmkpkk", "", th2);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m88095c() {
        try {
            m88093a();
            if (m88096d(mkpkkRSA)) {
                try {
                    mkpkkRSA = mkpkkRSA();
                } catch (Throwable th) {
                    Log.e("getmkpkkRSA", "", th);
                }
            }
            return mkpkkRSA;
        } catch (Throwable th2) {
            Log.e("getmkpkkRSA", "", th2);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m88096d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static native String mkpkk();

    private static native String mkpkkRSA();

    private static native String mkstk();
}
