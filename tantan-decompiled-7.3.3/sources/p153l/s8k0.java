package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class s8k0<D extends oo2> extends p8k0<D> {
    public s8k0(dum<D> dumVar, VText vText) {
        super(dumVar, vText);
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m185101r4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f47448C);
        }
    }

    @Override // p153l.p8k0
    /* JADX INFO: renamed from: l4 */
    public void mo171251l4(final User user, final boolean z, final boolean z2, String str, String str2) {
        wrv wrvVar = zrv.f205799a;
        duringCreated(wrvVar.m207662d(wrvVar.m207631D0(), user, z, str2, m213810E2().m202191k(), m213810E2().m202194o(), mo78457R2(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.q8k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156136a.m185102s4(user, z, z2, (Followship) obj);
            }
        }, new y20() { // from class: l.r8k0
            @Override // p153l.y20
            public final void call(Object obj) {
                s8k0.m185101r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m185102s4(User user, boolean z, boolean z2, Followship followship) {
        user.localFollowship = followship;
        m159730d4().mo159724X3(user);
        if (TextUtils.equals(user.f56859id, m213810E2().m168532l0().f56859id)) {
            m213810E2().m168482U(followship);
        }
        if (zrv.f205799a.m207637H()) {
            mjj.m158575d();
        }
        if (z) {
            m213811F2().OfficialShowEvent.followOfficialAnchor().mo199273j(user.f56859id);
        }
        if (user.matchedOrFollowed()) {
            if (wft.m206159b(2) && z2) {
                o1j0.m165649w(R$string.f47672M4);
            } else {
                o1j0.m165649w(R$string.f47651L4);
            }
        }
    }
}
