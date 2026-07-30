package p153l;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class klw0 extends hlw0 {

    /* JADX INFO: renamed from: h */
    public static klw0 f127414h;

    public klw0(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    /* JADX INFO: renamed from: k */
    public static final klw0 m150399k(Context context) {
        klw0 klw0Var;
        synchronized (klw0.class) {
            try {
                if (f127414h == null) {
                    f127414h = new klw0(context);
                }
                klw0Var = f127414h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return klw0Var;
    }

    /* JADX INFO: renamed from: i */
    public final glw0 m150400i(long j, boolean z) throws IOException {
        glw0 glw0VarM135792b;
        synchronized (klw0.class) {
            glw0VarM135792b = m135792b(null, null, j, z);
        }
        return glw0VarM135792b;
    }

    /* JADX INFO: renamed from: j */
    public final glw0 m150401j(String str, String str2, long j, boolean z) throws IOException {
        glw0 glw0VarM135792b;
        synchronized (klw0.class) {
            glw0VarM135792b = m135792b(str, str2, j, z);
        }
        return glw0VarM135792b;
    }

    /* JADX INFO: renamed from: l */
    public final void m150402l() throws IOException {
        synchronized (klw0.class) {
            m135796f(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m150403m() throws IOException {
        synchronized (klw0.class) {
            m135796f(true);
        }
    }
}
