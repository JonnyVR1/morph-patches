package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class mg3 {

    /* JADX INFO: renamed from: a */
    public int f133639a;

    /* JADX INFO: renamed from: h */
    public final void m154490h(int i) {
        this.f133639a = i | this.f133639a;
    }

    /* JADX INFO: renamed from: i */
    public void mo9803i() {
        this.f133639a = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m154491j(int i) {
        this.f133639a = (~i) & this.f133639a;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m154492m(int i) {
        return (this.f133639a & i) == i;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m154493n() {
        return m154492m(268435456);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m154494o() {
        return m154492m(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m154495p() {
        return m154492m(4);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m154496q() {
        return m154492m(134217728);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m154497r() {
        return m154492m(1);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m154498s() {
        return m154492m(536870912);
    }

    /* JADX INFO: renamed from: t */
    public final void m154499t(int i) {
        this.f133639a = i;
    }
}
