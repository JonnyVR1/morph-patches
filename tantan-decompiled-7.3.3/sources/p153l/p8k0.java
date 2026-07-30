package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class p8k0<D extends oo2> extends ms2<m8k0<D>, D> {
    public p8k0(dum<D> dumVar, VText vText) {
        super(dumVar);
        mo52715C(new m8k0(vText));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        m214779N3(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).subscribe(dhw.m115825d(new y20() { // from class: l.n8k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140694a.m171253n4((User) obj);
            }
        }));
        ((m8k0) this.viewModel).m157496c();
    }

    @Override // p153l.ms2
    /* JADX INFO: renamed from: W3 */
    public void mo159723W3(User user, int i) {
        ((m8k0) this.viewModel).m157497f(user, i);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m171252m4(User user, boolean z, String str, View view) {
        mo171251l4(user, false, z, str, "liveRoom");
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m171253n4(User user) {
        if (this.viewModel != 0) {
            User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(m159732f4().userId());
            m159730d4().mo159734h4();
            m159726Z3(userM144722i);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m171254o4() {
        String str;
        final User user = mo159733g4() == null ? null : mo159733g4().f183108c.f143542a;
        if (user == null) {
            return;
        }
        final boolean zM159735i0 = m159735i0(user.f56859id);
        if (m159732f4().getFrom() == 600) {
            str = "liveProfilecard_pkanchor";
        } else {
            str = zM159735i0 ? "liveProfilecard" : "live_watcher_profilecard";
        }
        final String str2 = str;
        if (!user.matchedOrFollowed()) {
            mo171251l4(user, true, zM159735i0, str2, "liveRoom");
            xak0.m209856e(mo78457R2(), str2, m213810E2(), user.f56859id);
        } else if (wft.m206159b(2)) {
            new th0.C20312a(this.f196919f).m191151j("确定要取消关注吗？").m191158q(R$string.f48271o2).m191157p(n9c0.f140818d).m191156o(new View.OnClickListener() { // from class: l.o8k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145420a.m171252m4(user, zM159735i0, str2, view);
                }
            }).m191146e(R$string.f47690N1).m191148g(true).m191149h(true).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public void m171255p4() {
        User user = mo159733g4() == null ? null : mo159733g4().f183108c.f143542a;
        if (user == null || TextUtils.isEmpty(user.f56859id)) {
            return;
        }
        act().startActivity(zrv.f205799a.m207707z0(act(), user.f56859id, false, false));
        m159727a4();
        xak0.m209858g(mo78457R2(), m213810E2().m202191k(), user.f56859id);
    }

    /* JADX INFO: renamed from: l4 */
    public void mo171251l4(User user, boolean z, boolean z2, String str, String str2) {
    }
}
