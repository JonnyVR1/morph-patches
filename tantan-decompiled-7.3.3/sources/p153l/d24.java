package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes5.dex */
public class d24 extends h84 {

    /* JADX INFO: renamed from: j */
    public zed0 f84749j;

    public d24(dum dumVar, CallWidgetView callWidgetView, zed0 zed0Var) {
        super(dumVar, callWidgetView, zed0Var);
        this.f84749j = zed0Var;
    }

    @Override // p153l.h84
    /* JADX INFO: renamed from: P3 */
    public void mo113671P3(int i) {
        final BLiveCall bLiveCallM178261d = this.f84749j.m161648Z3().m178261d(i);
        if (bLiveCallM178261d == null || u54.m194528h(bLiveCallM178261d)) {
            return;
        }
        act().dialog().m21499D(R$string.f48095g1).m21555t0(R$string.f48425v2, new Runnable() { // from class: l.c24
            @Override // java.lang.Runnable
            public final void run() {
                this.f79448a.m113676f4(bLiveCallM178261d);
            }
        }).m21540k0(R$string.f47690N1).m21567z0();
    }

    @Override // p153l.h84
    /* JADX INFO: renamed from: R3 */
    public void mo113672R3(qvd qvdVar) {
        super.mo113672R3(qvdVar);
        if (qvdVar.m178263f(zrv.f205799a.m207631D0()) != null) {
            V v2 = this.viewModel;
            if (((CallWidgetView) v2).f52351n) {
                ((CallWidgetView) v2).m77132L(false);
            } else {
                ((CallWidgetView) v2).setMinimizeVisible(false);
            }
        }
    }

    @Override // p153l.h84
    /* JADX INFO: renamed from: T3 */
    public void mo113673T3(qvd qvdVar) {
        super.mo113673T3(qvdVar);
        if (u54.m194531k(qvdVar.f159735d)) {
            V v2 = this.viewModel;
            ((CallWidgetView) v2).setMinimizeVisible(!((CallWidgetView) v2).f52351n);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.oo2] */
    @Override // p153l.h84
    /* JADX INFO: renamed from: Y3 */
    public void mo113674Y3(BLiveCall bLiveCall, h64 h64Var) {
        if (TextUtils.equals(bLiveCall.user, zrv.f205799a.m207631D0())) {
            m213811F2().CallEvent.personalManager().mo199273j(new u24().m194244a(h64Var).m194245b(bLiveCall));
        } else if (m213810E2().m168532l0() == null) {
            CrashHelper.m82479c(new NullPointerException("CallAudienceWidgetPresenter onClickDeputyPosIfHasCall data().getAnchor_() is null"));
        } else {
            m213811F2().OpenUserCardDialogEvent.show().mo199273j(new UserCardData.Builder(4400).giftSource("callVoiceVice").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, h64Var.f107997a, 4400)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, h64Var.f107997a, 4400)).userId(h64Var.f107997a).setSource("live").setScene("call").build());
        }
    }

    @Override // p153l.h84
    /* JADX INFO: renamed from: Z3 */
    public void mo113675Z3(Integer num) {
        if (this.f84749j.m161648Z3().m178263f(zrv.f205799a.m207631D0()) == null) {
            m213811F2().CallEvent.audienceCallAnchor().mo199273j(Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m113676f4(BLiveCall bLiveCall) {
        this.f84749j.m161645W3(bLiveCall);
    }
}
