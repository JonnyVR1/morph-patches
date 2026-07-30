package p149l;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.C2112c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes6.dex */
public final class ktr0 {

    /* JADX INFO: renamed from: c */
    public static final ConditionVariable f124611c = new ConditionVariable();

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public static volatile raw0 f124612d = null;

    /* JADX INFO: renamed from: e */
    public static volatile Random f124613e = null;

    /* JADX INFO: renamed from: a */
    public final vur0 f124614a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public volatile Boolean f124615b;

    public ktr0(vur0 vur0Var) {
        this.f124614a = vur0Var;
        vur0Var.m200109k().execute(new jtr0(this));
    }

    /* JADX INFO: renamed from: d */
    public static final int m147218d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (f124613e == null) {
                synchronized (ktr0.class) {
                    try {
                        if (f124613e == null) {
                            f124613e = new Random();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f124613e.nextInt();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m147219c(int i, int i2, long j, String str, Exception exc) {
        try {
            f124611c.block();
            if (!this.f124615b.booleanValue() || f124612d == null) {
                return;
            }
            fpr0 fpr0VarM12610L = C2112c.m12610L();
            fpr0VarM12610L.m122639q(this.f124614a.f183102a.getPackageName());
            fpr0VarM12610L.m122643u(j);
            if (str != null) {
                fpr0VarM12610L.m122640r(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                fpr0VarM12610L.m122644v(stringWriter.toString());
                fpr0VarM12610L.m122642t(exc.getClass().getName());
            }
            qaw0 qaw0VarM178540a = f124612d.m178540a(((C2112c) fpr0VarM12610L.m153521m()).m12744h());
            qaw0VarM178540a.m173782a(i);
            if (i2 != -1) {
                qaw0VarM178540a.m173783b(i2);
            }
            qaw0VarM178540a.m173784c();
        } catch (Exception unused) {
        }
    }
}
