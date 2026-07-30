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
@Deprecated
public final class jwv {

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static int f120141b = 0;

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static boolean f120142c = true;

    /* JADX INFO: renamed from: a */
    public static final Object f120140a = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static InterfaceC17883a f120143d = InterfaceC17883a.f120144a;

    @Pure
    /* JADX INFO: renamed from: a */
    public static String m143681a(String str, @Nullable Throwable th) {
        String strM143685e = m143685e(th);
        if (TextUtils.isEmpty(strM143685e)) {
            return str;
        }
        return str + "\n  " + strM143685e.replace(SignParameters.NEW_LINE, "\n  ") + '\n';
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m143682b(@Size(max = 23) String str, String str2) {
        synchronized (f120140a) {
            try {
                if (f120141b == 0) {
                    f120143d.mo143691d(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static void m143683c(@Size(max = 23) String str, String str2) {
        synchronized (f120140a) {
            try {
                if (f120141b <= 3) {
                    f120143d.mo143692e(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m143684d(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m143683c(str, m143681a(str2, th));
    }

    @Nullable
    @Pure
    /* JADX INFO: renamed from: e */
    public static String m143685e(@Nullable Throwable th) {
        synchronized (f120140a) {
            try {
                if (th == null) {
                    return null;
                }
                if (m143688h(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f120142c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: f */
    public static void m143686f(@Size(max = 23) String str, String str2) {
        synchronized (f120140a) {
            try {
                if (f120141b <= 1) {
                    f120143d.mo143693i(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: g */
    public static void m143687g(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m143686f(str, m143681a(str2, th));
    }

    @Pure
    /* JADX INFO: renamed from: h */
    public static boolean m143688h(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    /* JADX INFO: renamed from: i */
    public static void m143689i(@Size(max = 23) String str, String str2) {
        synchronized (f120140a) {
            try {
                if (f120141b <= 2) {
                    f120143d.mo143694w(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: j */
    public static void m143690j(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m143689i(str, m143681a(str2, th));
    }

    /* JADX INFO: renamed from: l.jwv$a */
    public interface InterfaceC17883a {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC17883a f120144a = new a();

        /* JADX INFO: renamed from: d */
        void mo143691d(String str, String str2);

        /* JADX INFO: renamed from: e */
        void mo143692e(String str, String str2);

        /* JADX INFO: renamed from: i */
        void mo143693i(String str, String str2);

        /* JADX INFO: renamed from: w */
        void mo143694w(String str, String str2);

        /* JADX INFO: renamed from: l.jwv$a$a */
        public class a implements InterfaceC17883a {
            @Override // p149l.jwv.InterfaceC17883a
            /* JADX INFO: renamed from: e */
            public void mo143692e(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // p149l.jwv.InterfaceC17883a
            /* JADX INFO: renamed from: d */
            public void mo143691d(String str, String str2) {
            }

            @Override // p149l.jwv.InterfaceC17883a
            /* JADX INFO: renamed from: i */
            public void mo143693i(String str, String str2) {
            }

            @Override // p149l.jwv.InterfaceC17883a
            /* JADX INFO: renamed from: w */
            public void mo143694w(String str, String str2) {
            }
        }
    }
}
