package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class m2z0 implements f2z0 {

    /* JADX INFO: renamed from: a */
    public final f2z0 f134635a;

    /* JADX INFO: renamed from: b */
    public final long f134636b;

    public m2z0(f2z0 f2z0Var, long j) {
        this.f134635a = f2z0Var;
        this.f134636b = j;
    }

    @Override // p153l.f2z0
    /* JADX INFO: renamed from: a */
    public final int mo123687a(long j) {
        return this.f134635a.mo123687a(j - this.f134636b);
    }

    @Override // p153l.f2z0
    /* JADX INFO: renamed from: b */
    public final int mo123688b(l9y0 l9y0Var, evx0 evx0Var, int i) {
        int iMo123688b = this.f134635a.mo123688b(l9y0Var, evx0Var, i);
        if (iMo123688b != -4) {
            return iMo123688b;
        }
        evx0Var.f96059f += this.f134636b;
        return -4;
    }

    /* JADX INFO: renamed from: c */
    public final f2z0 m156915c() {
        return this.f134635a;
    }

    @Override // p153l.f2z0
    public final void zzd() throws IOException {
        this.f134635a.zzd();
    }

    @Override // p153l.f2z0
    public final boolean zze() {
        return this.f134635a.zze();
    }
}
