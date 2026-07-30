package p002l;

import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.j760;
import l.w9j;
import l.ypv;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tzj0<D extends ho2> extends wr2<qzj0<D>, D> {
    public tzj0(bsm<D> bsmVar, LinearLayout linearLayout, LiveGuardEntranceView liveGuardEntranceView) {
        super(bsmVar);
        C(new qzj0(linearLayout, liveGuardEntranceView));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        ((qzj0) ((bwr) this).viewModel).f18292d.m8238n0();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        if (mo18414g4() == null || m25546D2()) {
            return;
        }
        ((qzj0) ((bwr) this).viewModel).m21647l(m25336f4().userId(), mo18414g4().m19973m());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m23241k4(BLiveUserProfileConfig bLiveUserProfileConfig) {
        return bLiveUserProfileConfig.showGiftWallEntrance;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m23242l4(BLiveUserProfileConfig bLiveUserProfileConfig, String str) {
        return bLiveUserProfileConfig.showGuardEntrance && ((DbObject) m25547E2().m14582l0()).id.equals(str);
    }

    /* JADX INFO: renamed from: m4 */
    public void m23243m4() {
        LivingNormalApiProvider.m4803d5(m25547E2().m17234j().anchor.id, null);
        m25707N3(((ggv) ypv.l(fld0.c)).e.filter(new w9j() { // from class: l.rzj0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((j760) obj));
            }
        })).subscribe(ffw.h(new e30() { // from class: l.szj0
            public final void call(Object obj) {
                this.f19343a.m23245o4((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m23244n4() {
        LivingNormalApiProvider.m4983x5(m25547E2().m17234j().anchor.id);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m23245o4(j760 j760Var) {
        qzj0 qzj0Var = (qzj0) ((bwr) this).viewModel;
        boolean zBooleanValue = ((Boolean) j760Var.a).booleanValue();
        Object obj = j760Var.b;
        qzj0Var.m21646k(zBooleanValue, (BLiveData) obj, ((BLiveData) obj).knightsInfosSummary);
    }
}
