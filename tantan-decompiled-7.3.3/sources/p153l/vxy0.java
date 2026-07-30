package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class vxy0 implements f2z0 {

    /* JADX INFO: renamed from: a */
    public final f2z0 f186311a;

    /* JADX INFO: renamed from: b */
    public boolean f186312b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wxy0 f186313c;

    public vxy0(wxy0 wxy0Var, f2z0 f2z0Var) {
        this.f186313c = wxy0Var;
        this.f186311a = f2z0Var;
    }

    @Override // p153l.f2z0
    /* JADX INFO: renamed from: a */
    public final int mo123687a(long j) {
        if (this.f186313c.m208463i()) {
            return -3;
        }
        return this.f186311a.mo123687a(j);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    @Override // p153l.f2z0
    /* JADX INFO: renamed from: b */
    public final int mo123688b(l9y0 l9y0Var, evx0 evx0Var, int i) {
        wxy0 wxy0Var = this.f186313c;
        if (wxy0Var.m208463i()) {
            return -3;
        }
        if (this.f186312b) {
            evx0Var.m127551c(4);
            return -4;
        }
        long jZzb = wxy0Var.zzb();
        int iMo123688b = this.f186311a.mo123688b(l9y0Var, evx0Var, i);
        if (iMo123688b != -5) {
            long j = this.f186313c.f191549e;
            if (j == Long.MIN_VALUE || ((iMo123688b != -4 || evx0Var.f96059f < j) && !(iMo123688b == -3 && jZzb == Long.MIN_VALUE && !evx0Var.f96058e))) {
                return iMo123688b;
            }
            evx0Var.mo122858b();
            evx0Var.m127551c(4);
            this.f186312b = true;
            return -4;
        }
        sqr0 sqr0Var = l9y0Var.f130645a;
        sqr0Var.getClass();
        int i2 = sqr0Var.f170234B;
        if (i2 != 0) {
            int i3 = this.f186313c.f191549e == Long.MIN_VALUE ? sqr0Var.f170235C : 0;
            znr0 znr0VarM187559b = sqr0Var.m187559b();
            znr0VarM187559b.m220651f(i2);
            znr0VarM187559b.m220652g(i3);
            l9y0Var.f130645a = znr0VarM187559b.m220645D();
        } else if (sqr0Var.f170235C != 0) {
            i2 = 0;
            if (this.f186313c.f191549e == Long.MIN_VALUE) {
            }
            znr0 znr0VarM187559b2 = sqr0Var.m187559b();
            znr0VarM187559b2.m220651f(i2);
            znr0VarM187559b2.m220652g(i3);
            l9y0Var.f130645a = znr0VarM187559b2.m220645D();
        }
        return -5;
    }

    /* JADX INFO: renamed from: c */
    public final void m203892c() {
        this.f186312b = false;
    }

    @Override // p153l.f2z0
    public final void zzd() throws IOException {
        this.f186311a.zzd();
    }

    @Override // p153l.f2z0
    public final boolean zze() {
        return !this.f186313c.m208463i() && this.f186311a.zze();
    }
}
