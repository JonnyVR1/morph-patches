package p153l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class e2u0 implements hdu0, k8u0 {

    /* JADX INFO: renamed from: a */
    public final Clock f91855a;

    /* JADX INFO: renamed from: b */
    public final g2u0 f91856b;

    /* JADX INFO: renamed from: c */
    public final o7w0 f91857c;

    /* JADX INFO: renamed from: d */
    public final String f91858d;

    public e2u0(Clock clock, g2u0 g2u0Var, o7w0 o7w0Var, String str) {
        this.f91855a = clock;
        this.f91856b = g2u0Var;
        this.f91857c = o7w0Var;
        this.f91858d = str;
    }

    @Override // p153l.hdu0
    public final void zza() {
        this.f91856b.m128665e(this.f91858d, this.f91855a.elapsedRealtime());
    }

    @Override // p153l.k8u0
    public final void zzr() {
        o7w0 o7w0Var = this.f91857c;
        this.f91856b.m128664d(o7w0Var.f145320f, this.f91858d, this.f91855a.elapsedRealtime());
    }
}
