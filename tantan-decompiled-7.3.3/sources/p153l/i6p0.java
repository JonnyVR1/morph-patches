package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes10.dex */
public class i6p0<D extends oo2> extends m6p0<D> {
    public i6p0(dum<D> dumVar, VText vText) {
        super(dumVar, vText);
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m138835q4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f47448C);
        }
    }

    @Override // p153l.m6p0
    /* JADX INFO: renamed from: m4 */
    public void mo138837m4(final User user, boolean z, boolean z2, String str, String str2) {
        wrv wrvVar = zrv.f205799a;
        duringCreated(wrvVar.m207662d(wrvVar.m207631D0(), user, z, str2, m213810E2().m202191k(), m213810E2().m202194o(), mo78457R2(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.g6p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102472a.m138838s4(user, (Followship) obj);
            }
        }, new y20() { // from class: l.h6p0
            @Override // p153l.y20
            public final void call(Object obj) {
                i6p0.m138835q4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m138838s4(User user, Followship followship) {
        user.localFollowship = followship;
        m100216e4().mo100210Y3(user);
        if (user.matchedOrFollowed()) {
            o1j0.m165649w(R$string.f47651L4);
        }
    }
}
