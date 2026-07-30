package p153l;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class thr0<T> implements hgr0<T> {

    /* JADX INFO: renamed from: a */
    public final Object f174404a = new Object();

    /* JADX INFO: renamed from: b */
    public final int f174405b;

    /* JADX INFO: renamed from: c */
    public final m1z0 f174406c;

    /* JADX INFO: renamed from: d */
    public int f174407d;

    /* JADX INFO: renamed from: e */
    public int f174408e;

    /* JADX INFO: renamed from: f */
    public int f174409f;

    /* JADX INFO: renamed from: g */
    public Exception f174410g;

    /* JADX INFO: renamed from: h */
    public boolean f174411h;

    public thr0(int i, m1z0 m1z0Var) {
        this.f174405b = i;
        this.f174406c = m1z0Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m191299a() {
        int i = this.f174407d;
        int i2 = this.f174408e;
        int i3 = i + i2 + this.f174409f;
        int i4 = this.f174405b;
        if (i3 == i4) {
            if (this.f174410g == null) {
                boolean z = this.f174411h;
                m1z0 m1z0Var = this.f174406c;
                if (z) {
                    m1z0Var.m156731u();
                    return;
                } else {
                    m1z0Var.m156730t(null);
                    return;
                }
            }
            this.f174406c.m156729s(new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.f174410g));
        }
    }

    @Override // p153l.ol50
    public final void onCanceled() {
        synchronized (this.f174404a) {
            this.f174409f++;
            this.f174411h = true;
            m191299a();
        }
    }

    @Override // p153l.fm50
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f174404a) {
            this.f174408e++;
            this.f174410g = exc;
            m191299a();
        }
    }

    @Override // p153l.to50
    public final void onSuccess(T t) {
        synchronized (this.f174404a) {
            this.f174407d++;
            m191299a();
        }
    }
}
