package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;

/* JADX INFO: loaded from: classes5.dex */
public class pz3 extends i74 {

    /* JADX INFO: renamed from: j */
    public final q0s f151913j;

    public pz3(bsm bsmVar, CallWidgetView callWidgetView, q0s q0sVar) {
        super(bsmVar, callWidgetView, q0sVar);
        this.f151913j = q0sVar;
    }

    @Override // p149l.i74
    /* JADX INFO: renamed from: N3 */
    public void mo134729N3() {
        super.mo134729N3();
        if (((Boolean) m129297F3(new a35(4400))).booleanValue()) {
            new xh0.C21150a(act()).m208740s(this.f188513f.getString(R$string.f47226f2)).m208730i(R$string.f47248g2).m208737p(h1c0.f105394p0).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.mz3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f136347a.m172179j4(view);
                }
            }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208722a().m208721g();
        } else {
            m172182m4();
        }
    }

    @Override // p149l.i74
    /* JADX INFO: renamed from: P3 */
    public void mo114367P3(int i) {
        BLiveCall bLiveCallM108751d = this.f151913j.m162531Z3().m108751d(i);
        if (bLiveCallM108751d == null || v44.m196940h(bLiveCallM108751d)) {
            return;
        }
        m172178i4(bLiveCallM108751d);
    }

    @Override // p149l.i74
    /* JADX INFO: renamed from: Y3 */
    public void mo114370Y3(BLiveCall bLiveCall, i54 i54Var) {
        m206028F2().CallEvent.personalManager().mo172463j(new v14().m196538a(i54Var).m196539b(bLiveCall));
    }

    @Override // p149l.i74
    /* JADX INFO: renamed from: Z3 */
    public void mo114371Z3(Integer num) {
        m206028F2().CallEvent.anchorCallManageDialog().m172467p();
    }

    /* JADX INFO: renamed from: i4 */
    public void m172178i4(final BLiveCall bLiveCall) {
        new xh0.C21150a(act()).m208731j(this.f188513f.getString(R$string.f47489r2, bLiveCall.userName)).m208737p(h1c0.f105394p0).m208738q(R$string.f47577v2).m208736o(new View.OnClickListener() { // from class: l.lz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130621a.m172180k4(bLiveCall, view);
            }
        }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m172179j4(View view) {
        m172182m4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m172180k4(BLiveCall bLiveCall, View view) {
        this.f151913j.m162528W3(bLiveCall);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m172181l4(BLiveAnchor bLiveAnchor) {
        m172183n4();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m172182m4() {
        duringCreated(LivingNormalApiProvider.m71304O7(false)).subscribe(ffw.m121194e(new e30() { // from class: l.nz3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141184a.m172181l4((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.oz3
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f46764J9);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public final void m172183n4() {
        m206028F2().CallEvent.anchorCall().mo172463j(Boolean.FALSE);
    }
}
