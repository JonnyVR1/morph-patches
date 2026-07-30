package p153l;

import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.tantanapp.common.utils.NullChecker;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class z8k0<D extends oo2> extends ms2<w8k0<D>, D> {
    public z8k0(dum<D> dumVar, LinearLayout linearLayout, LiveGuardEntranceView liveGuardEntranceView) {
        super(dumVar);
        mo52715C(new w8k0(linearLayout, liveGuardEntranceView));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        ((w8k0) this.viewModel).f187865d.m75828n0();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        if (mo159733g4() == null || m213809D2()) {
            return;
        }
        ((w8k0) this.viewModel).m205420l(m159732f4().userId(), mo159733g4().m200538m());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m219004k4(BLiveUserProfileConfig bLiveUserProfileConfig) {
        return bLiveUserProfileConfig.showGiftWallEntrance;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m219005l4(BLiveUserProfileConfig bLiveUserProfileConfig, String str) {
        return bLiveUserProfileConfig.showGuardEntrance && m213810E2().m168532l0().f56859id.equals(str);
    }

    /* JADX INFO: renamed from: m4 */
    public void m219006m4() {
        LivingNormalApiProvider.m72620d5(m213810E2().mo183435j().anchor.f45267id, null);
        m214779N3(((hiv) zrv.m221194l(htd0.f111521c)).f110074e.filter(new qcj() { // from class: l.x8k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((pf60) obj));
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.y8k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198012a.m219008o4((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m219007n4() {
        LivingNormalApiProvider.m72800x5(m213810E2().mo183435j().anchor.f45267id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m219008o4(pf60 pf60Var) {
        w8k0 w8k0Var = (w8k0) this.viewModel;
        boolean zBooleanValue = ((Boolean) pf60Var.f152156a).booleanValue();
        S s = pf60Var.f152157b;
        w8k0Var.m205419k(zBooleanValue, (BLiveData) s, ((BLiveData) s).knightsInfosSummary);
    }
}
