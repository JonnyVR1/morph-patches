package p153l;

import android.annotation.TargetApi;

/* JADX INFO: loaded from: classes8.dex */
@TargetApi(16)
public class oq70 {

    /* JADX INFO: renamed from: a */
    public static final boolean f148555a = ut0.m197956a().m197959d();

    /* JADX INFO: renamed from: l.oq70$b */
    public static class C19195b {
        private static oq70 INSTANCE = new oq70();
    }

    /* JADX INFO: renamed from: d */
    public static oq70 m168791d() {
        return C19195b.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    private static String m168792e(String str) {
        return str.lastIndexOf(".") > 0 ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    /* JADX INFO: renamed from: a */
    public void m168793a(String str, String str2) {
        if (f148555a) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                esx.m122396a(str, m168792e(stackTrace[1].getClassName()) + "->" + stackTrace[1].getMethodName() + "->" + stackTrace[1].getLineNumber() + "->" + str2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m168794b(String str, String str2) {
        if (f148555a) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 2) {
                esx.m122396a(str, m168792e(stackTrace[2].getClassName()) + "->" + stackTrace[2].getMethodName() + "->" + stackTrace[2].getLineNumber() + "->" + str2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m168795c(String str, String str2) {
        if (f148555a) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                esx.m122397b(str, m168792e(stackTrace[1].getClassName()) + "->" + stackTrace[1].getMethodName() + "->" + str2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m168796f(String str, String str2) {
        if (f148555a) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                esx.m122400e(str, m168792e(stackTrace[1].getClassName()) + "->" + stackTrace[1].getMethodName() + "->" + str2);
            }
        }
    }

    private oq70() {
    }
}
