package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes10.dex */
public class m6p0<D extends oo2> extends atm0<k6p0<D>, D> {
    public m6p0(dum<D> dumVar, VText vText) {
        super(dumVar);
        mo52715C(new k6p0(vText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m157257n4(User user) {
        if (this.viewModel != 0) {
            User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(m100218g4().userId());
            m100216e4().mo100221i4();
            m100212a4(userM144722i);
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        m214779N3(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).subscribe(dhw.m115825d(new y20() { // from class: l.l6p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130277a.m157257n4((User) obj);
            }
        }));
        ((k6p0) this.viewModel).m148537c();
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: X3 */
    public void mo100209X3(User user, int i) {
        ((k6p0) this.viewModel).m148538e(user, i);
    }

    /* JADX INFO: renamed from: o4 */
    public void m157258o4() {
        User user = mo100219h4() == null ? null : mo100219h4().f183108c.f143542a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str = m100220i0(user.f56859id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (m100218g4().getFrom() == 600) {
            str = "liveProfilecard_pkanchor";
        }
        String str2 = str;
        mo138837m4(user, true, m100220i0(user.f56859id), str2, m100216e4().mo100214c4());
        w7p0.m205353a(mo78457R2(), str2, m213810E2(), user.f56859id);
    }

    /* JADX INFO: renamed from: p4 */
    public void m157259p4() {
        User user = mo100219h4() == null ? null : mo100219h4().f183108c.f143542a;
        if (user == null || TextUtils.isEmpty(user.f56859id)) {
            return;
        }
        act().startActivity(zrv.f205799a.m207707z0(act(), user.f56859id, false, false));
        m100213b4();
        w7p0.m205354b(mo78457R2(), m213810E2().m202191k(), user.f56859id);
    }

    /* JADX INFO: renamed from: m4 */
    public void mo138837m4(User user, boolean z, boolean z2, String str, String str2) {
    }
}
