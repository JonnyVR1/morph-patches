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
@Deprecated
public final class kyv {

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static int f129361b = 0;

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static boolean f129362c = true;

    /* JADX INFO: renamed from: a */
    public static final Object f129360a = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static InterfaceC18309a f129363d = InterfaceC18309a.f129364a;

    @Pure
    /* JADX INFO: renamed from: a */
    public static String m152143a(String str, @Nullable Throwable th) {
        String strM152147e = m152147e(th);
        if (TextUtils.isEmpty(strM152147e)) {
            return str;
        }
        return str + "\n  " + strM152147e.replace(SignParameters.NEW_LINE, "\n  ") + '\n';
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m152144b(@Size(max = 23) String str, String str2) {
        synchronized (f129360a) {
            try {
                if (f129361b == 0) {
                    f129363d.mo152153d(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static void m152145c(@Size(max = 23) String str, String str2) {
        synchronized (f129360a) {
            try {
                if (f129361b <= 3) {
                    f129363d.mo152154e(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m152146d(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m152145c(str, m152143a(str2, th));
    }

    @Nullable
    @Pure
    /* JADX INFO: renamed from: e */
    public static String m152147e(@Nullable Throwable th) {
        synchronized (f129360a) {
            try {
                if (th == null) {
                    return null;
                }
                if (m152150h(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f129362c) {
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
    public static void m152148f(@Size(max = 23) String str, String str2) {
        synchronized (f129360a) {
            try {
                if (f129361b <= 1) {
                    f129363d.mo152155i(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: g */
    public static void m152149g(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m152148f(str, m152143a(str2, th));
    }

    @Pure
    /* JADX INFO: renamed from: h */
    public static boolean m152150h(@Nullable Throwable th) {
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
    public static void m152151i(@Size(max = 23) String str, String str2) {
        synchronized (f129360a) {
            try {
                if (f129361b <= 2) {
                    f129363d.mo152156w(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: j */
    public static void m152152j(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m152151i(str, m152143a(str2, th));
    }

    /* JADX INFO: renamed from: l.kyv$a */
    public interface InterfaceC18309a {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC18309a f129364a = new a();

        /* JADX INFO: renamed from: d */
        void mo152153d(String str, String str2);

        /* JADX INFO: renamed from: e */
        void mo152154e(String str, String str2);

        /* JADX INFO: renamed from: i */
        void mo152155i(String str, String str2);

        /* JADX INFO: renamed from: w */
        void mo152156w(String str, String str2);

        /* JADX INFO: renamed from: l.kyv$a$a */
        public class a implements InterfaceC18309a {
            @Override // p153l.kyv.InterfaceC18309a
            /* JADX INFO: renamed from: e */
            public void mo152154e(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // p153l.kyv.InterfaceC18309a
            /* JADX INFO: renamed from: d */
            public void mo152153d(String str, String str2) {
            }

            @Override // p153l.kyv.InterfaceC18309a
            /* JADX INFO: renamed from: i */
            public void mo152155i(String str, String str2) {
            }

            @Override // p153l.kyv.InterfaceC18309a
            /* JADX INFO: renamed from: w */
            public void mo152156w(String str, String str2) {
            }
        }
    }
}
