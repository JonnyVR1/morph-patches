package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;

/* JADX INFO: loaded from: classes5.dex */
public class o04 extends h84 {

    /* JADX INFO: renamed from: j */
    public final r2s f144495j;

    public o04(dum dumVar, CallWidgetView callWidgetView, r2s r2sVar) {
        super(dumVar, callWidgetView, r2sVar);
        this.f144495j = r2sVar;
    }

    @Override // p153l.h84
    /* JADX INFO: renamed from: N3 */
    public void mo133897N3() {
        super.mo133897N3();
        if (((Boolean) m138856F3(new b45(4400))).booleanValue()) {
            new th0.C20312a(act()).m191160s(this.f196919f.getString(R$string.f48074f2)).m191150i(R$string.f48096g2).m191157p(n9c0.f140855p0).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.l04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129516a.m165418j4(view);
                }
            }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191142a().m191141g();
        } else {
            m165421m4();
        }
    }

    @Override // p153l.h84
    /* JADX INFO: renamed from: P3 */
    public void mo113671P3(int i) {
        BLiveCall bLiveCallM178261d = this.f144495j.m161648Z3().m178261d(i);
        if (bLiveCallM178261d == null || u54.m194528h(bLiveCallM178261d)) {
            return;
        }
        m165417i4(bLiveCallM178261d);
    }

    @Override // p153l.h84
    /* JADX INFO: renamed from: Y3 */
    public void mo113674Y3(BLiveCall bLiveCall, h64 h64Var) {
        m213811F2().CallEvent.personalManager().mo199273j(new u24().m194244a(h64Var).m194245b(bLiveCall));
    }

    @Override // p153l.h84
    /* JADX INFO: renamed from: Z3 */
    public void mo113675Z3(Integer num) {
        m213811F2().CallEvent.anchorCallManageDialog().m199277p();
    }

    /* JADX INFO: renamed from: i4 */
    public void m165417i4(final BLiveCall bLiveCall) {
        new th0.C20312a(act()).m191151j(this.f196919f.getString(R$string.f48337r2, bLiveCall.userName)).m191157p(n9c0.f140855p0).m191158q(R$string.f48425v2).m191156o(new View.OnClickListener() { // from class: l.k04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123355a.m165419k4(bLiveCall, view);
            }
        }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m165418j4(View view) {
        m165421m4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m165419k4(BLiveCall bLiveCall, View view) {
        this.f144495j.m161645W3(bLiveCall);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m165420l4(BLiveAnchor bLiveAnchor) {
        m165422n4();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m165421m4() {
        duringCreated(LivingNormalApiProvider.m72487O7(false)).subscribe(dhw.m115826e(new y20() { // from class: l.m04
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134293a.m165420l4((BLiveAnchor) obj);
            }
        }, new y20() { // from class: l.n04
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f47612J9);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public final void m165422n4() {
        m213811F2().CallEvent.anchorCall().mo199273j(Boolean.FALSE);
    }
}
