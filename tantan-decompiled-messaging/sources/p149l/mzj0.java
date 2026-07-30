package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class mzj0<D extends ho2> extends jzj0<D> {
    public mzj0(bsm<D> bsmVar, VText vText) {
        super(bsmVar, vText);
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m157143r4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f46600C);
        }
    }

    @Override // p149l.jzj0
    /* JADX INFO: renamed from: l4 */
    public void mo143931l4(final User user, final boolean z, final boolean z2, String str, String str2) {
        vpv vpvVar = ypv.f199493a;
        duringCreated(vpvVar.m199340d(vpvVar.m199309D0(), user, z, str2, m206027E2().m149814k(), m206027E2().m149818o(), mo77274R2(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.kzj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125388a.m157144s4(user, z, z2, (Followship) obj);
            }
        }, new e30() { // from class: l.lzj0
            @Override // p149l.e30
            public final void call(Object obj) {
                mzj0.m157143r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m157144s4(User user, boolean z, boolean z2, Followship followship) {
        user.localFollowship = followship;
        m205084d4().mo162151X3(user);
        if (TextUtils.equals(user.f56011id, m206027E2().m132146l0().f56011id)) {
            m206027E2().m132096U(followship);
        }
        if (ypv.f199493a.m199315H()) {
            sgj.m184091d();
        }
        if (z) {
            m206028F2().OfficialShowEvent.followOfficialAnchor().mo172463j(user.f56011id);
        }
        if (user.matchedOrFollowed()) {
            if (vdt.m198092b(2) && z2) {
                lsi0.m151593w(R$string.f46824M4);
            } else {
                lsi0.m151593w(R$string.f46803L4);
            }
        }
    }
}
