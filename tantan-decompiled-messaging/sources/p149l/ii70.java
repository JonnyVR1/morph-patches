package p149l;

import android.annotation.TargetApi;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(16)
public class ii70 {

    /* JADX INFO: renamed from: a */
    public static final boolean f113371a = ot0.m165919a().m165922d();

    /* JADX INFO: renamed from: l.ii70$b */
    public static class C17557b {
        private static ii70 INSTANCE = new ii70();
    }

    /* JADX INFO: renamed from: d */
    public static ii70 m136344d() {
        return C17557b.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    private static String m136345e(String str) {
        return str.lastIndexOf(".") > 0 ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    /* JADX INFO: renamed from: a */
    public void m136346a(String str, String str2) {
        if (f113371a) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                hjx.m131418a(str, m136345e(stackTrace[1].getClassName()) + "->" + stackTrace[1].getMethodName() + "->" + stackTrace[1].getLineNumber() + "->" + str2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m136347b(String str, String str2) {
        if (f113371a) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 2) {
                hjx.m131418a(str, m136345e(stackTrace[2].getClassName()) + "->" + stackTrace[2].getMethodName() + "->" + stackTrace[2].getLineNumber() + "->" + str2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m136348c(String str, String str2) {
        if (f113371a) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                hjx.m131419b(str, m136345e(stackTrace[1].getClassName()) + "->" + stackTrace[1].getMethodName() + "->" + str2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m136349f(String str, String str2) {
        if (f113371a) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                hjx.m131422e(str, m136345e(stackTrace[1].getClassName()) + "->" + stackTrace[1].getMethodName() + "->" + str2);
            }
        }
    }

    private ii70() {
    }
}
