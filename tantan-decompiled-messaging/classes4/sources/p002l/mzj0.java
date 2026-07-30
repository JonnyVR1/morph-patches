package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.ffw;
import l.lsi0;
import l.sgj;
import l.vdt;
import l.vpv;
import l.ypv;
import p002l.ho2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mzj0<D extends ho2> extends jzj0<D> {
    public mzj0(bsm<D> bsmVar, VText vText) {
        super(bsmVar, vText);
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m18325r4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.w(R$string.f2642C);
        }
    }

    @Override // p002l.jzj0
    /* JADX INFO: renamed from: l4 */
    public void mo16456l4(final User user, final boolean z, final boolean z2, String str, String str2) {
        vpv vpvVar = ypv.a;
        duringCreated(vpvVar.d(vpvVar.D0(), user, z, str2, m25547E2().m17235k(), m25547E2().m17239o(), mo21430R2(), str)).subscribe(ffw.e(new e30() { // from class: l.kzj0
            public final void call(Object obj) {
                this.f14605a.m18326s4(user, z, z2, (Followship) obj);
            }
        }, new e30() { // from class: l.lzj0
            public final void call(Object obj) {
                mzj0.m18325r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m18326s4(User user, boolean z, boolean z2, Followship followship) {
        user.localFollowship = followship;
        m25334d4().mo19186X3(user);
        if (TextUtils.equals(((DbObject) user).id, ((DbObject) m25547E2().m14582l0()).id)) {
            m25547E2().m14532U(followship);
        }
        if (ypv.a.H()) {
            sgj.d();
        }
        if (z) {
            m25548F2().OfficialShowEvent.followOfficialAnchor().j(((DbObject) user).id);
        }
        if (user.matchedOrFollowed()) {
            if (vdt.b(2) && z2) {
                lsi0.w(R$string.f2866M4);
            } else {
                lsi0.w(R$string.f2845L4);
            }
        }
    }
}
