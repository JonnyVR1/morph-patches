package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class q3l0 {

    /* JADX INFO: renamed from: a */
    public final Object f152482a = new Object();

    /* JADX INFO: renamed from: b */
    @Nullable
    public fgu0 f152483b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AbstractC19424a f152484c;

    /* JADX INFO: renamed from: a */
    public void m172882a(@Nullable AbstractC19424a abstractC19424a) {
        k0w0 k0w0Var;
        synchronized (this.f152482a) {
            this.f152484c = abstractC19424a;
            fgu0 fgu0Var = this.f152483b;
            if (fgu0Var == null) {
                return;
            }
            if (abstractC19424a == null) {
                k0w0Var = null;
            } else {
                try {
                    k0w0Var = new k0w0(abstractC19424a);
                } catch (RemoteException e) {
                    x2t0.m206867e("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            fgu0Var.mo121269s1(k0w0Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final fgu0 m172883b() {
        fgu0 fgu0Var;
        synchronized (this.f152482a) {
            fgu0Var = this.f152483b;
        }
        return fgu0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m172884c(@Nullable fgu0 fgu0Var) {
        synchronized (this.f152482a) {
            try {
                this.f152483b = fgu0Var;
                AbstractC19424a abstractC19424a = this.f152484c;
                if (abstractC19424a != null) {
                    m172882a(abstractC19424a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.q3l0$a */
    public static abstract class AbstractC19424a {
        /* JADX INFO: renamed from: a */
        public void mo172885a() {
        }

        /* JADX INFO: renamed from: c */
        public void mo172887c() {
        }

        /* JADX INFO: renamed from: d */
        public void m172888d() {
        }

        /* JADX INFO: renamed from: e */
        public void mo172889e() {
        }

        /* JADX INFO: renamed from: b */
        public void m172886b(boolean z) {
        }
    }
}
