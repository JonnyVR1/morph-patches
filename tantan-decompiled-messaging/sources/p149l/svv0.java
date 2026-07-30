package p149l;

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
public final class svv0 {

    /* JADX INFO: renamed from: a */
    public static final Object f166597a = new Object();

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static final juv0 f166598b = juv0.f119818a;

    @Pure
    /* JADX INFO: renamed from: a */
    public static String m186106a(String str, @Nullable Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f166597a) {
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
    public static void m186107b(@Size(max = 23) String str, String str2) {
        synchronized (f166597a) {
            m186106a(str2, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static void m186108c(@Size(max = 23) String str, String str2) {
        synchronized (f166597a) {
            Log.e(str, m186106a(str2, null));
        }
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m186109d(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (f166597a) {
            Log.e(str, m186106a(str2, th));
        }
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static void m186110e(@Size(max = 23) String str, String str2) {
        synchronized (f166597a) {
            m186106a(str2, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: f */
    public static void m186111f(@Size(max = 23) String str, String str2) {
        synchronized (f166597a) {
            m186106a(str2, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: g */
    public static void m186112g(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (f166597a) {
            m186106a(str2, th);
        }
    }
}
