package p153l;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class llw0 extends hlw0 {

    /* JADX INFO: renamed from: h */
    public static llw0 f132609h;

    public llw0(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    /* JADX INFO: renamed from: j */
    public static final llw0 m154791j(Context context) {
        llw0 llw0Var;
        synchronized (llw0.class) {
            try {
                if (f132609h == null) {
                    f132609h = new llw0(context);
                }
                llw0Var = f132609h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return llw0Var;
    }

    /* JADX INFO: renamed from: i */
    public final glw0 m154792i(long j, boolean z) throws IOException {
        synchronized (llw0.class) {
            try {
                if (m154798p()) {
                    return m135792b(null, null, j, z);
                }
                return new glw0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m154793k() throws IOException {
        synchronized (llw0.class) {
            try {
                if (m135797g(false)) {
                    m135796f(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m154794l() throws IOException {
        this.f110552f.m146128e("paidv2_publisher_option");
    }

    /* JADX INFO: renamed from: m */
    public final void m154795m() throws IOException {
        this.f110552f.m146128e("paidv2_user_option");
    }

    /* JADX INFO: renamed from: n */
    public final void m154796n(boolean z) throws IOException {
        this.f110552f.m146127d("paidv2_user_option", Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o */
    public final void m154797o(boolean z) throws IOException {
        this.f110552f.m146127d("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        m154793k();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m154798p() {
        return this.f110552f.m146129f("paidv2_publisher_option", true);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m154799q() {
        return this.f110552f.m146129f("paidv2_user_option", true);
    }
}
