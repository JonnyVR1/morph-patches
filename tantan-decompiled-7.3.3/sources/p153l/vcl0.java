package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class vcl0 {

    /* JADX INFO: renamed from: a */
    public final Object f183471a = new Object();

    /* JADX INFO: renamed from: b */
    @Nullable
    public lpu0 f183472b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AbstractC20809a f183473c;

    /* JADX INFO: renamed from: a */
    public void m200827a(@Nullable AbstractC20809a abstractC20809a) {
        q9w0 q9w0Var;
        synchronized (this.f183471a) {
            this.f183473c = abstractC20809a;
            lpu0 lpu0Var = this.f183472b;
            if (lpu0Var == null) {
                return;
            }
            if (abstractC20809a == null) {
                q9w0Var = null;
            } else {
                try {
                    q9w0Var = new q9w0(abstractC20809a);
                } catch (RemoteException e) {
                    dct0.m115296e("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            lpu0Var.mo155297s1(q9w0Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final lpu0 m200828b() {
        lpu0 lpu0Var;
        synchronized (this.f183471a) {
            lpu0Var = this.f183472b;
        }
        return lpu0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m200829c(@Nullable lpu0 lpu0Var) {
        synchronized (this.f183471a) {
            try {
                this.f183472b = lpu0Var;
                AbstractC20809a abstractC20809a = this.f183473c;
                if (abstractC20809a != null) {
                    m200827a(abstractC20809a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.vcl0$a */
    public static abstract class AbstractC20809a {
        /* JADX INFO: renamed from: a */
        public void mo127260a() {
        }

        /* JADX INFO: renamed from: c */
        public void mo127261c() {
        }

        /* JADX INFO: renamed from: d */
        public void m200831d() {
        }

        /* JADX INFO: renamed from: e */
        public void mo127262e() {
        }

        /* JADX INFO: renamed from: b */
        public void m200830b(boolean z) {
        }
    }
}
