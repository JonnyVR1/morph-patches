package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class y0z0 implements f2z0 {

    /* JADX INFO: renamed from: a */
    public final int f197066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b1z0 f197067b;

    public y0z0(b1z0 b1z0Var, int i) {
        this.f197067b = b1z0Var;
        this.f197066a = i;
    }

    @Override // p153l.f2z0
    /* JADX INFO: renamed from: a */
    public final int mo123687a(long j) {
        return this.f197067b.m101540J(this.f197066a, j);
    }

    @Override // p153l.f2z0
    /* JADX INFO: renamed from: b */
    public final int mo123688b(l9y0 l9y0Var, evx0 evx0Var, int i) {
        return this.f197067b.m101539I(this.f197066a, l9y0Var, evx0Var, i);
    }

    @Override // p153l.f2z0
    public final void zzd() throws IOException {
        this.f197067b.m101560v(this.f197066a);
    }

    @Override // p153l.f2z0
    public final boolean zze() {
        return this.f197067b.m101562x(this.f197066a);
    }
}
