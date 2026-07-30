package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class e3s0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f89211a;

    /* JADX INFO: renamed from: b */
    public int f89212b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f3s0 f89213c;

    public /* synthetic */ e3s0(f3s0 f3s0Var, byte[] bArr, d3s0 d3s0Var) {
        this.f89213c = f3s0Var;
        this.f89211a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final e3s0 m114626a(int i) {
        this.f89212b = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m114627c() {
        this.f89213c.f94716c.execute(new Runnable() { // from class: l.c3s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79028a.m114628d();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m114628d() {
        try {
            f3s0 f3s0Var = this.f89213c;
            if (f3s0Var.f94715b) {
                f3s0Var.f94714a.mo156924r0(this.f89211a);
                this.f89213c.f94714a.mo156923n(0);
                this.f89213c.f94714a.zzg(this.f89212b);
                this.f89213c.f94714a.mo156922k0(null);
                this.f89213c.f94714a.zzf();
            }
        } catch (RemoteException e) {
            x2t0.m206865c("Clearcut log failed", e);
        }
    }
}
