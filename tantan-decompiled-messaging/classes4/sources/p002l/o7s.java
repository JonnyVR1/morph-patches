package p002l;

import l.d30;
import l.e30;
import l.ffw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o7s {

    /* JADX INFO: renamed from: a */
    public final rh2 f16420a;

    /* JADX INFO: renamed from: b */
    public final hs4 f16421b;

    /* JADX INFO: renamed from: c */
    public boolean f16422c = true;

    public o7s(rh2 rh2Var, hs4 hs4Var) {
        this.f16420a = rh2Var;
        this.f16421b = hs4Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: b */
    public void m19272b(final d30 d30Var) {
        rh2 rh2Var = this.f16420a;
        rh2Var.duringCreated(zfv.m27271h1(false, rh2Var.m25547E2().m14576j0())).subscribe(ffw.h(new e30() { // from class: l.n7s
            public final void call(Object obj) {
                this.f15857a.m19275e(d30Var, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public void m19273c(String str) {
        this.f16420a.m21985r4(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m19274d() {
        return this.f16422c;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m19275e(d30 d30Var, Object obj) {
        this.f16422c = false;
        d30Var.call();
        this.f16421b.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: f */
    public void m19276f(boolean z) {
        if (this.f16422c != z) {
            this.f16422c = z;
            this.f16421b.notifyDataSetChanged();
        }
    }
}
