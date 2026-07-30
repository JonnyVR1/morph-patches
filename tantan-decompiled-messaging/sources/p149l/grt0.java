package p149l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class grt0 implements dfy0 {

    /* JADX INFO: renamed from: a */
    public final xyt0 f104107a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f104108b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f104109c = new AtomicBoolean(false);

    public grt0(xyt0 xyt0Var) {
        this.f104107a = xyt0Var;
    }

    /* JADX INFO: renamed from: b */
    private final void m127773b() {
        if (this.f104109c.get()) {
            return;
        }
        this.f104109c.set(true);
        this.f104107a.zza();
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: O */
    public final void mo102679O() {
        m127773b();
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: P2 */
    public final void mo102681P2() {
        this.f104107a.zzc();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m127774a() {
        return this.f104108b.get();
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m5 */
    public final void mo102687m5(int i) {
        this.f104108b.set(true);
        m127773b();
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: M6 */
    public final void mo102678M6() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: g7 */
    public final void mo102683g7() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m4 */
    public final void mo102686m4() {
    }
}
