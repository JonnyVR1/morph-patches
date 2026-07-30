package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import junit.framework.AssertionFailedError;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class t11 {
    /* JADX INFO: renamed from: c */
    public static void m188829c(String str, Object obj) {
        m188830d(str, obj != null);
    }

    /* JADX INFO: renamed from: d */
    public static void m188830d(String str, boolean z) {
        if (z) {
            return;
        }
        m188831e(str);
    }

    /* JADX INFO: renamed from: e */
    public static void m188831e(String str) {
        if (str != null) {
            throw new AssertionFailedError(str);
        }
        throw new AssertionFailedError();
    }

    /* JADX INFO: renamed from: f */
    public static String m188832f(String str, Object obj, Object obj2) {
        return ((str == null || str.length() <= 0) ? "" : str.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }
}
