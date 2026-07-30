package p149l;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ecw0 extends bcw0 {

    /* JADX INFO: renamed from: h */
    public static ecw0 f90573h;

    public ecw0(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    /* JADX INFO: renamed from: k */
    public static final ecw0 m115755k(Context context) {
        ecw0 ecw0Var;
        synchronized (ecw0.class) {
            try {
                if (f90573h == null) {
                    f90573h = new ecw0(context);
                }
                ecw0Var = f90573h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ecw0Var;
    }

    /* JADX INFO: renamed from: i */
    public final acw0 m115756i(long j, boolean z) throws IOException {
        acw0 acw0VarM101132b;
        synchronized (ecw0.class) {
            acw0VarM101132b = m101132b(null, null, j, z);
        }
        return acw0VarM101132b;
    }

    /* JADX INFO: renamed from: j */
    public final acw0 m115757j(String str, String str2, long j, boolean z) throws IOException {
        acw0 acw0VarM101132b;
        synchronized (ecw0.class) {
            acw0VarM101132b = m101132b(str, str2, j, z);
        }
        return acw0VarM101132b;
    }

    /* JADX INFO: renamed from: l */
    public final void m115758l() throws IOException {
        synchronized (ecw0.class) {
            m101136f(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m115759m() throws IOException {
        synchronized (ecw0.class) {
            m101136f(true);
        }
    }
}
