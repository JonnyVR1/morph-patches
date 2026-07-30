package p149l;

import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.tantanapp.common.utils.NullChecker;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class tzj0<D extends ho2> extends wr2<qzj0<D>, D> {
    public tzj0(bsm<D> bsmVar, LinearLayout linearLayout, LiveGuardEntranceView liveGuardEntranceView) {
        super(bsmVar);
        mo51532C(new qzj0(linearLayout, liveGuardEntranceView));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        ((qzj0) this.viewModel).f157061d.m74645n0();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        if (mo157426g4() == null || m206026D2()) {
            return;
        }
        ((qzj0) this.viewModel).m177231l(m205086f4().userId(), mo157426g4().m167093m());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m191201k4(BLiveUserProfileConfig bLiveUserProfileConfig) {
        return bLiveUserProfileConfig.showGiftWallEntrance;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m191202l4(BLiveUserProfileConfig bLiveUserProfileConfig, String str) {
        return bLiveUserProfileConfig.showGuardEntrance && m206027E2().m132146l0().f56011id.equals(str);
    }

    /* JADX INFO: renamed from: m4 */
    public void m191203m4() {
        LivingNormalApiProvider.m71437d5(m206027E2().mo149813j().anchor.f44419id, null);
        m207199N3(((ggv) ypv.m215673l(fld0.f98148c)).f102544e.filter(new w9j() { // from class: l.rzj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((j760) obj));
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.szj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167064a.m191205o4((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m191204n4() {
        LivingNormalApiProvider.m71617x5(m206027E2().mo149813j().anchor.f44419id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m191205o4(j760 j760Var) {
        qzj0 qzj0Var = (qzj0) this.viewModel;
        boolean zBooleanValue = ((Boolean) j760Var.f116564a).booleanValue();
        S s = j760Var.f116565b;
        qzj0Var.m177230k(zBooleanValue, (BLiveData) s, ((BLiveData) s).knightsInfosSummary);
    }
}
