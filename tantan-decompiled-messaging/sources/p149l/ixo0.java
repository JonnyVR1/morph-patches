package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes11.dex */
public class ixo0<D extends ho2> extends wjm0<gxo0<D>, D> {
    public ixo0(bsm<D> bsmVar, VText vText) {
        super(bsmVar);
        mo51532C(new gxo0(vText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m138879n4(User user) {
        if (this.viewModel != 0) {
            User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(m203476g4().userId());
            m203474e4().mo181708i4();
            m203471a4(userM135637i);
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        m207199N3(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).subscribe(ffw.m121193d(new e30() { // from class: l.hxo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109898a.m138879n4((User) obj);
            }
        }));
        ((gxo0) this.viewModel).m128636c();
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: X3 */
    public void mo138880X3(User user, int i) {
        ((gxo0) this.viewModel).m128637e(user, i);
    }

    /* JADX INFO: renamed from: o4 */
    public void m138881o4() {
        User user = mo181707h4() == null ? null : mo181707h4().f146688c.f135304a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str = m203477i0(user.f56011id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (m203476g4().getFrom() == 600) {
            str = "liveProfilecard_pkanchor";
        }
        String str2 = str;
        mo118690m4(user, true, m203477i0(user.f56011id), str2, m203474e4().mo181706c4());
        syo0.m186710a(mo77274R2(), str2, m206027E2(), user.f56011id);
    }

    /* JADX INFO: renamed from: p4 */
    public void m138882p4() {
        User user = mo181707h4() == null ? null : mo181707h4().f146688c.f135304a;
        if (user == null || TextUtils.isEmpty(user.f56011id)) {
            return;
        }
        act().startActivity(ypv.f199493a.m199385z0(act(), user.f56011id, false, false));
        m203472b4();
        syo0.m186711b(mo77274R2(), m206027E2().m149814k(), user.f56011id);
    }

    /* JADX INFO: renamed from: m4 */
    public void mo118690m4(User user, boolean z, boolean z2, String str, String str2) {
    }
}
