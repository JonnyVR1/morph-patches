package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.idv;
import l.vdt;
import l.xh0;
import l.ypv;
import p002l.ho2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jzj0<D extends ho2> extends wr2<gzj0<D>, D> {
    public jzj0(bsm<D> bsmVar, VText vText) {
        super(bsmVar);
        C(new gzj0(vText));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        m25707N3(((idv) ypv.l(fld0.b)).g()).subscribe(ffw.d(new e30() { // from class: l.hzj0
            public final void call(Object obj) {
                this.f12379a.m16458n4((User) obj);
            }
        }));
        ((gzj0) ((bwr) this).viewModel).m14119c();
    }

    @Override // p002l.wr2
    /* JADX INFO: renamed from: W3 */
    public void mo16455W3(User user, int i) {
        ((gzj0) ((bwr) this).viewModel).m14120f(user, i);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m16457m4(User user, boolean z, String str, View view) {
        mo16456l4(user, false, z, str, "liveRoom");
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m16458n4(User user) {
        if (((bwr) this).viewModel != null) {
            User userI = ((idv) ypv.l(fld0.b)).i(m25336f4().userId());
            m25334d4().mo18416h4();
            m25330Z3(userI);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m16459o4() {
        String str;
        final User user = mo18414g4() == null ? null : (User) mo18414g4().f16959c.a;
        if (user == null) {
            return;
        }
        final boolean zM25337i0 = m25337i0(((DbObject) user).id);
        if (m25336f4().getFrom() == 600) {
            str = "liveProfilecard_pkanchor";
        } else {
            str = zM25337i0 ? "liveProfilecard" : "live_watcher_profilecard";
        }
        final String str2 = str;
        if (!user.matchedOrFollowed()) {
            mo16456l4(user, true, zM25337i0, str2, "liveRoom");
            r1k0.m21723e(mo21430R2(), str2, m25547E2(), ((DbObject) user).id);
        } else if (vdt.b(2)) {
            new xh0.a(this.f22037f).j("确定要取消关注吗？").q(R$string.f3465o2).p(h1c0.f11777d).o(new View.OnClickListener() { // from class: l.izj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13508a.m16457m4(user, zM25337i0, str2, view);
                }
            }).e(R$string.f2884N1).g(true).h(true).a().g();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public void m16460p4() {
        DbObject dbObject = mo18414g4() == null ? null : (User) mo18414g4().f16959c.a;
        if (dbObject == null || TextUtils.isEmpty(dbObject.id)) {
            return;
        }
        act().startActivity(ypv.a.z0(act(), dbObject.id, false, false));
        m25331a4();
        r1k0.m21725g(mo21430R2(), m25547E2().m17235k(), dbObject.id);
    }

    /* JADX INFO: renamed from: l4 */
    public void mo16456l4(User user, boolean z, boolean z2, String str, String str2) {
    }
}
