package p153l;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.C2135c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes6.dex */
public final class q2s0 {

    /* JADX INFO: renamed from: c */
    public static final ConditionVariable f155385c = new ConditionVariable();

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public static volatile xjw0 f155386d = null;

    /* JADX INFO: renamed from: e */
    public static volatile Random f155387e = null;

    /* JADX INFO: renamed from: a */
    public final b4s0 f155388a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public volatile Boolean f155389b;

    public q2s0(b4s0 b4s0Var) {
        this.f155388a = b4s0Var;
        b4s0Var.m102525k().execute(new p2s0(this));
    }

    /* JADX INFO: renamed from: d */
    public static final int m175095d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (f155387e == null) {
                synchronized (q2s0.class) {
                    try {
                        if (f155387e == null) {
                            f155387e = new Random();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f155387e.nextInt();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m175096c(int i, int i2, long j, String str, Exception exc) {
        try {
            f155385c.block();
            if (!this.f155389b.booleanValue() || f155386d == null) {
                return;
            }
            lyr0 lyr0VarM12664L = C2135c.m12664L();
            lyr0VarM12664L.m156379q(this.f155388a.f74969a.getPackageName());
            lyr0VarM12664L.m156383u(j);
            if (str != null) {
                lyr0VarM12664L.m156380r(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                lyr0VarM12664L.m156384v(stringWriter.toString());
                lyr0VarM12664L.m156382t(exc.getClass().getName());
            }
            wjw0 wjw0VarM211272a = f155386d.m211272a(((C2135c) lyr0VarM12664L.m185950m()).m12798h());
            wjw0VarM211272a.m206734a(i);
            if (i2 != -1) {
                wjw0VarM211272a.m206735b(i2);
            }
            wjw0VarM211272a.m206736c();
        } catch (Exception unused) {
        }
    }
}
