package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.ho2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ixo0<D extends ho2> extends wjm0<gxo0<D>, D> {
    public ixo0(bsm<D> bsmVar, VText vText) {
        super(bsmVar);
        C(new gxo0(vText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m16784n4(User user) {
        if (((bwr) this).viewModel != null) {
            User userM16499i = ((idv) ypv.m25491l(fld0.f13076b)).m16499i(m24303g4().userId());
            m24301e4().mo21934i4();
            m24298a4(userM16499i);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m16785P3() {
        super.P3();
        N3(((idv) ypv.m25491l(fld0.f13076b)).m16497g()).subscribe(ffw.d(new e30() { // from class: l.hxo0
            public final void call(Object obj) {
                this.f14284a.m16784n4((User) obj);
            }
        }));
        ((gxo0) ((bwr) this).viewModel).m15363c();
    }

    @Override // p009l.wjm0
    /* JADX INFO: renamed from: X3 */
    public void mo16786X3(User user, int i) {
        ((gxo0) ((bwr) this).viewModel).m15364e(user, i);
    }

    /* JADX INFO: renamed from: o4 */
    public void m16787o4() {
        User user = mo21933h4() == null ? null : (User) mo21933h4().c.a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str = m24304i0(((DbObject) user).id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (m24303g4().getFrom() == 600) {
            str = "liveProfilecard_pkanchor";
        }
        String str2 = str;
        mo14117m4(user, true, m24304i0(((DbObject) user).id), str2, m24301e4().mo21932c4());
        syo0.m22416a(R2(), str2, E2(), ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: p4 */
    public void m16788p4() {
        DbObject dbObject = mo21933h4() == null ? null : (User) mo21933h4().c.a;
        if (dbObject == null || TextUtils.isEmpty(dbObject.id)) {
            return;
        }
        act().startActivity(ypv.f23196a.m23695z0(act(), dbObject.id, false, false));
        m24299b4();
        syo0.m22417b(R2(), E2().k(), dbObject.id);
    }

    /* JADX INFO: renamed from: m4 */
    public void mo14117m4(User user, boolean z, boolean z2, String str, String str2) {
    }
}
