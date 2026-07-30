package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes5.dex */
public class e14 extends i74 {

    /* JADX INFO: renamed from: j */
    public w6d0 f88705j;

    public e14(bsm bsmVar, CallWidgetView callWidgetView, w6d0 w6d0Var) {
        super(bsmVar, callWidgetView, w6d0Var);
        this.f88705j = w6d0Var;
    }

    @Override // p149l.i74
    /* JADX INFO: renamed from: P3 */
    public void mo114367P3(int i) {
        final BLiveCall bLiveCallM108751d = this.f88705j.m162531Z3().m108751d(i);
        if (bLiveCallM108751d == null || v44.m196940h(bLiveCallM108751d)) {
            return;
        }
        act().dialog().m20500D(R$string.f47247g1).m20556t0(R$string.f47577v2, new Runnable() { // from class: l.d14
            @Override // java.lang.Runnable
            public final void run() {
                this.f83232a.m114372f4(bLiveCallM108751d);
            }
        }).m20541k0(R$string.f46842N1).m20568z0();
    }

    @Override // p149l.i74
    /* JADX INFO: renamed from: R3 */
    public void mo114368R3(cud cudVar) {
        super.mo114368R3(cudVar);
        if (cudVar.m108753f(ypv.f199493a.m199309D0()) != null) {
            V v2 = this.viewModel;
            if (((CallWidgetView) v2).f51503n) {
                ((CallWidgetView) v2).m75949L(false);
            } else {
                ((CallWidgetView) v2).setMinimizeVisible(false);
            }
        }
    }

    @Override // p149l.i74
    /* JADX INFO: renamed from: T3 */
    public void mo114369T3(cud cudVar) {
        super.mo114369T3(cudVar);
        if (v44.m196943k(cudVar.f82557d)) {
            V v2 = this.viewModel;
            ((CallWidgetView) v2).setMinimizeVisible(!((CallWidgetView) v2).f51503n);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.ho2] */
    @Override // p149l.i74
    /* JADX INFO: renamed from: Y3 */
    public void mo114370Y3(BLiveCall bLiveCall, i54 i54Var) {
        if (TextUtils.equals(bLiveCall.user, ypv.f199493a.m199309D0())) {
            m206028F2().CallEvent.personalManager().mo172463j(new v14().m196538a(i54Var).m196539b(bLiveCall));
        } else if (m206027E2().m132146l0() == null) {
            CrashHelper.m81296c(new NullPointerException("CallAudienceWidgetPresenter onClickDeputyPosIfHasCall data().getAnchor_() is null"));
        } else {
            m206028F2().OpenUserCardDialogEvent.show().mo172463j(new UserCardData.Builder(4400).giftSource("callVoiceVice").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, i54Var.f111520a, 4400)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, i54Var.f111520a, 4400)).userId(i54Var.f111520a).setSource("live").setScene("call").build());
        }
    }

    @Override // p149l.i74
    /* JADX INFO: renamed from: Z3 */
    public void mo114371Z3(Integer num) {
        if (this.f88705j.m162531Z3().m108753f(ypv.f199493a.m199309D0()) == null) {
            m206028F2().CallEvent.audienceCallAnchor().mo172463j(Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m114372f4(BLiveCall bLiveCall) {
        this.f88705j.m162528W3(bLiveCall);
    }
}
