package p153l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class m0u0 implements joy0 {

    /* JADX INFO: renamed from: a */
    public final d8u0 f134354a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f134355b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f134356c = new AtomicBoolean(false);

    public m0u0(d8u0 d8u0Var) {
        this.f134354a = d8u0Var;
    }

    /* JADX INFO: renamed from: b */
    private final void m156541b() {
        if (this.f134356c.get()) {
            return;
        }
        this.f134356c.set(true);
        this.f134354a.zza();
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: O */
    public final void mo113754O() {
        m156541b();
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: P2 */
    public final void mo113755P2() {
        this.f134354a.zzc();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m156542a() {
        return this.f134355b.get();
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m5 */
    public final void mo113769m5(int i) {
        this.f134355b.set(true);
        m156541b();
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: M6 */
    public final void mo113753M6() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: g7 */
    public final void mo113765g7() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m4 */
    public final void mo113768m4() {
    }
}
