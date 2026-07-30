package p153l;

import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzcfz;

/* JADX INFO: loaded from: classes6.dex */
public final class dft0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final zzcfz f88220a;

    /* JADX INFO: renamed from: b */
    public boolean f88221b = false;

    public dft0(zzcfz zzcfzVar) {
        this.f88220a = zzcfzVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m115541a() {
        this.f88221b = true;
        this.f88220a.m13671w();
    }

    /* JADX INFO: renamed from: b */
    public final void m115542b() {
        this.f88221b = false;
        m115543c();
    }

    /* JADX INFO: renamed from: c */
    public final void m115543c() {
        ukw0 ukw0Var = C2098b.f9751l;
        ukw0Var.removeCallbacks(this);
        ukw0Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f88221b) {
            return;
        }
        this.f88220a.m13671w();
        m115543c();
    }
}
