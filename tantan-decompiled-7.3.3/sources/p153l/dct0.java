package p153l;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public class dct0 {

    /* JADX INFO: renamed from: a */
    public static final dpw0 f87826a = dpw0.m117426b(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static String m115292a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    /* JADX INFO: renamed from: b */
    public static void m115293b(String str) {
        if (!m115301j(3) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : f87826a.m117429d(str)) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m115294c(String str, Throwable th) {
        m115301j(3);
    }

    /* JADX INFO: renamed from: d */
    public static void m115295d(String str) {
        if (m115301j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : f87826a.m117429d(str)) {
                if (z) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m115296e(String str, Throwable th) {
        if (m115301j(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m115297f(String str) {
        if (!m115301j(4) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : f87826a.m117429d(str)) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m115298g(String str) {
        if (!m115301j(5) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : f87826a.m117429d(str)) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m115299h(String str, Throwable th) {
        m115301j(5);
    }

    /* JADX INFO: renamed from: i */
    public static void m115300i(String str, @Nullable Throwable th) {
        if (m115301j(5)) {
            if (th != null) {
                m115299h(m115292a(str), th);
            } else {
                m115298g(m115292a(str));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m115301j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
