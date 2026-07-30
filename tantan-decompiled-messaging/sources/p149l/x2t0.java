package p149l;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public class x2t0 {

    /* JADX INFO: renamed from: a */
    public static final xfw0 f190832a = xfw0.m208615b(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static String m206863a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    /* JADX INFO: renamed from: b */
    public static void m206864b(String str) {
        if (!m206872j(3) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : f190832a.m208618d(str)) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m206865c(String str, Throwable th) {
        m206872j(3);
    }

    /* JADX INFO: renamed from: d */
    public static void m206866d(String str) {
        if (m206872j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : f190832a.m208618d(str)) {
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
    public static void m206867e(String str, Throwable th) {
        if (m206872j(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m206868f(String str) {
        if (!m206872j(4) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : f190832a.m208618d(str)) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m206869g(String str) {
        if (!m206872j(5) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : f190832a.m208618d(str)) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m206870h(String str, Throwable th) {
        m206872j(5);
    }

    /* JADX INFO: renamed from: i */
    public static void m206871i(String str, @Nullable Throwable th) {
        if (m206872j(5)) {
            if (th != null) {
                m206870h(m206863a(str), th);
            } else {
                m206869g(m206863a(str));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m206872j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
