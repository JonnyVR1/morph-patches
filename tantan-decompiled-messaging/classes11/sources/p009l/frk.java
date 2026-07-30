package p009l;

import l.d30;
import l.ogl0;
import l.qib0;
import l.upa;
import l.uq40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class frk extends y5l {
    public frk(String str, boolean z) {
        super(str, z);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m14563h(z5l.C1346a c1346a) {
        if (uq40.y(c1346a.f23488b.m19361T4(), true)) {
            return;
        }
        c1346a.f23488b.f17660G.onNext(Boolean.TRUE);
    }

    @Override // p009l.y5l
    /* JADX INFO: renamed from: d */
    public boolean mo14564d(final z5l.C1346a c1346a) {
        if (upa.D2()) {
            uq40.G(c1346a.m25611a(), true);
        } else {
            uq40.F(c1346a.m25611a(), new d30() { // from class: l.drk
                public final void call() {
                    c1346a.f23488b.m19386Y4();
                }
            }, new d30() { // from class: l.erk
                public final void call() {
                    frk.m14563h(c1346a);
                }
            });
        }
        return true;
    }

    @Override // p009l.y5l
    /* JADX INFO: renamed from: f */
    public boolean mo14565f(z5l.C1346a c1346a) {
        if (ogl0.w()) {
            return qib0.i0.a(ic50.m16316j().m16322f().m17404Y(this.f22902a, "e_page_switch", "p_suggest_users_home_view"));
        }
        return false;
    }
}
