package p149l;

import com.p046p1.mobile.putong.data.OMSEventId;

/* JADX INFO: loaded from: classes11.dex */
public class frk extends y5l {
    public frk(String str, boolean z) {
        super(str, z);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m122877h(z5l.C21640a c21640a) {
        if (uq40.m194983y(c21640a.f201828b.m161157T4(), true)) {
            return;
        }
        c21640a.f201828b.f140350G.m132487l(Boolean.TRUE);
    }

    @Override // p149l.y5l
    /* JADX INFO: renamed from: d */
    public boolean mo122878d(final z5l.C21640a c21640a) {
        if (upa.m194624D2()) {
            uq40.m194957G(c21640a.m217363a(), true);
        } else {
            uq40.m194956F(c21640a.m217363a(), new d30() { // from class: l.drk
                @Override // p149l.d30
                public final void call() {
                    c21640a.f201828b.m161182Y4();
                }
            }, new d30() { // from class: l.erk
                @Override // p149l.d30
                public final void call() {
                    frk.m122877h(c21640a);
                }
            });
        }
        return true;
    }

    @Override // p149l.y5l
    /* JADX INFO: renamed from: f */
    public boolean mo122879f(z5l.C21640a c21640a) {
        if (ogl0.m164270w()) {
            return qib0.f154720i0.m196493a(ic50.m135327j().m135333f().m145238Y(this.f196450a, OMSEventId.e_page_switch, "p_suggest_users_home_view"));
        }
        return false;
    }
}
