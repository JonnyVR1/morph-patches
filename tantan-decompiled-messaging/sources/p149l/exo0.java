package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes11.dex */
public class exo0<D extends ho2> extends ixo0<D> {
    public exo0(bsm<D> bsmVar, VText vText) {
        super(bsmVar, vText);
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m118688q4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f46600C);
        }
    }

    @Override // p149l.ixo0
    /* JADX INFO: renamed from: m4 */
    public void mo118690m4(final User user, boolean z, boolean z2, String str, String str2) {
        vpv vpvVar = ypv.f199493a;
        duringCreated(vpvVar.m199340d(vpvVar.m199309D0(), user, z, str2, m206027E2().m149814k(), m206027E2().m149818o(), mo77274R2(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.cxo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82882a.m118691s4(user, (Followship) obj);
            }
        }, new e30() { // from class: l.dxo0
            @Override // p149l.e30
            public final void call(Object obj) {
                exo0.m118688q4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m118691s4(User user, Followship followship) {
        user.localFollowship = followship;
        m203474e4().mo99577Y3(user);
        if (user.matchedOrFollowed()) {
            lsi0.m151593w(R$string.f46803L4);
        }
    }
}
