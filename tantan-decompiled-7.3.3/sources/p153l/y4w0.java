package p153l;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.net.UnknownHostException;
import org.aspectj.lang.JoinPoint;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class y4w0 {

    /* JADX INFO: renamed from: a */
    public static final Object f197519a = new Object();

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static final p3w0 f197520b = p3w0.f150473a;

    @Pure
    /* JADX INFO: renamed from: a */
    public static String m214273a(String str, @Nullable Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f197519a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace(SignParameters.NEW_LINE, "\n  ") + SignParameters.NEW_LINE;
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m214274b(@Size(max = 23) String str, String str2) {
        synchronized (f197519a) {
            m214273a(str2, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static void m214275c(@Size(max = 23) String str, String str2) {
        synchronized (f197519a) {
            Log.e(str, m214273a(str2, null));
        }
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m214276d(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (f197519a) {
            Log.e(str, m214273a(str2, th));
        }
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static void m214277e(@Size(max = 23) String str, String str2) {
        synchronized (f197519a) {
            m214273a(str2, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: f */
    public static void m214278f(@Size(max = 23) String str, String str2) {
        synchronized (f197519a) {
            m214273a(str2, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: g */
    public static void m214279g(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (f197519a) {
            m214273a(str2, th);
        }
    }
}
