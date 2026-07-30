package p149l;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class fcw0 extends bcw0 {

    /* JADX INFO: renamed from: h */
    public static fcw0 f96870h;

    public fcw0(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    /* JADX INFO: renamed from: j */
    public static final fcw0 m120480j(Context context) {
        fcw0 fcw0Var;
        synchronized (fcw0.class) {
            try {
                if (f96870h == null) {
                    f96870h = new fcw0(context);
                }
                fcw0Var = f96870h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fcw0Var;
    }

    /* JADX INFO: renamed from: i */
    public final acw0 m120481i(long j, boolean z) throws IOException {
        synchronized (fcw0.class) {
            try {
                if (m120487p()) {
                    return m101132b(null, null, j, z);
                }
                return new acw0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m120482k() throws IOException {
        synchronized (fcw0.class) {
            try {
                if (m101137g(false)) {
                    m101136f(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m120483l() throws IOException {
        this.f74976f.m110883e("paidv2_publisher_option");
    }

    /* JADX INFO: renamed from: m */
    public final void m120484m() throws IOException {
        this.f74976f.m110883e("paidv2_user_option");
    }

    /* JADX INFO: renamed from: n */
    public final void m120485n(boolean z) throws IOException {
        this.f74976f.m110882d("paidv2_user_option", Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o */
    public final void m120486o(boolean z) throws IOException {
        this.f74976f.m110882d("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        m120482k();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m120487p() {
        return this.f74976f.m110884f("paidv2_publisher_option", true);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m120488q() {
        return this.f74976f.m110884f("paidv2_user_option", true);
    }
}
