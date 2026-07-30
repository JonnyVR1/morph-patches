package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class jzj0<D extends ho2> extends wr2<gzj0<D>, D> {
    public jzj0(bsm<D> bsmVar, VText vText) {
        super(bsmVar);
        mo51532C(new gzj0(vText));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        m207199N3(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).subscribe(ffw.m121193d(new e30() { // from class: l.hzj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110206a.m143933n4((User) obj);
            }
        }));
        ((gzj0) this.viewModel).m128872c();
    }

    @Override // p149l.wr2
    /* JADX INFO: renamed from: W3 */
    public void mo143930W3(User user, int i) {
        ((gzj0) this.viewModel).m128873f(user, i);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m143932m4(User user, boolean z, String str, View view) {
        mo143931l4(user, false, z, str, "liveRoom");
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m143933n4(User user) {
        if (this.viewModel != 0) {
            User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(m205086f4().userId());
            m205084d4().mo157428h4();
            m205080Z3(userM135637i);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m143934o4() {
        String str;
        final User user = mo157426g4() == null ? null : mo157426g4().f146688c.f135304a;
        if (user == null) {
            return;
        }
        final boolean zM205087i0 = m205087i0(user.f56011id);
        if (m205086f4().getFrom() == 600) {
            str = "liveProfilecard_pkanchor";
        } else {
            str = zM205087i0 ? "liveProfilecard" : "live_watcher_profilecard";
        }
        final String str2 = str;
        if (!user.matchedOrFollowed()) {
            mo143931l4(user, true, zM205087i0, str2, "liveRoom");
            r1k0.m177468e(mo77274R2(), str2, m206027E2(), user.f56011id);
        } else if (vdt.m198092b(2)) {
            new xh0.C21150a(this.f188513f).m208731j("确定要取消关注吗？").m208738q(R$string.f47423o2).m208737p(h1c0.f105357d).m208736o(new View.OnClickListener() { // from class: l.izj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115576a.m143932m4(user, zM205087i0, str2, view);
                }
            }).m208726e(R$string.f46842N1).m208728g(true).m208729h(true).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public void m143935p4() {
        User user = mo157426g4() == null ? null : mo157426g4().f146688c.f135304a;
        if (user == null || TextUtils.isEmpty(user.f56011id)) {
            return;
        }
        act().startActivity(ypv.f199493a.m199385z0(act(), user.f56011id, false, false));
        m205081a4();
        r1k0.m177470g(mo77274R2(), m206027E2().m149814k(), user.f56011id);
    }

    /* JADX INFO: renamed from: l4 */
    public void mo143931l4(User user, boolean z, boolean z2, String str, String str2) {
    }
}
