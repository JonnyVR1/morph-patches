package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class p9s {

    /* JADX INFO: renamed from: a */
    public final yh2 f151179a;

    /* JADX INFO: renamed from: b */
    public final gt4 f151180b;

    /* JADX INFO: renamed from: c */
    public boolean f151181c = true;

    public p9s(yh2 yh2Var, gt4 gt4Var) {
        this.f151179a = yh2Var;
        this.f151180b = gt4Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: b */
    public void m171372b(final x20 x20Var) {
        yh2 yh2Var = this.f151179a;
        yh2Var.duringCreated(aiv.m98102h1(false, yh2Var.m213810E2().m168526j0())).subscribe(dhw.m115829h(new y20() { // from class: l.o9s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145627a.m171375e(x20Var, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public void m171373c(String str) {
        this.f151179a.m215929r4(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m171374d() {
        return this.f151181c;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m171375e(x20 x20Var, Object obj) {
        this.f151181c = false;
        x20Var.call();
        this.f151180b.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: f */
    public void m171376f(boolean z) {
        if (this.f151181c != z) {
            this.f151181c = z;
            this.f151180b.notifyDataSetChanged();
        }
    }
}
