package p149l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class mpt0 implements ezt0, sxr0 {

    /* JADX INFO: renamed from: a */
    public final kxv0 f135082a;

    /* JADX INFO: renamed from: b */
    public final byt0 f135083b;

    /* JADX INFO: renamed from: c */
    public final nzt0 f135084c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f135085d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f135086e = new AtomicBoolean();

    public mpt0(kxv0 kxv0Var, byt0 byt0Var, nzt0 nzt0Var) {
        this.f135082a = kxv0Var;
        this.f135083b = byt0Var;
        this.f135084c = nzt0Var;
    }

    /* JADX INFO: renamed from: b */
    private final void m155836b() {
        if (this.f135085d.compareAndSet(false, true)) {
            this.f135083b.zza();
        }
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final void mo13669U(rxr0 rxr0Var) {
        if (this.f135082a.f125193f == 1 && rxr0Var.f161504j) {
            m155836b();
        }
        if (rxr0Var.f161504j && this.f135086e.compareAndSet(false, true)) {
            this.f135084c.zza();
        }
    }

    @Override // p149l.ezt0
    public final synchronized void zzr() {
        if (this.f135082a.f125193f != 1) {
            m155836b();
        }
    }
}
