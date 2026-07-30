package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ze10 extends j510<am40> {

    /* JADX INFO: renamed from: m */
    public boolean f202763m;

    /* JADX INFO: renamed from: n */
    public boolean f202764n;

    /* JADX INFO: renamed from: o */
    public boolean f202765o;

    public ze10(bsm<am40> bsmVar, ta10 ta10Var) {
        super(bsmVar, ta10Var);
        this.f202764n = true;
        this.f202765o = false;
        this.f116261l = (ue10) m144512z2(new uf10(bsmVar, ta10Var.f169087b, this));
        m144512z2(new gas(bsmVar));
        m144512z2(new zf10(bsmVar, ta10Var.f169086a, this));
        m144512z2(new xu2(bsmVar));
        m144512z2(new sh10(bsmVar));
        m144512z2(new t310(bsmVar));
    }

    /* JADX INFO: renamed from: B4 */
    public final void m218263B4(List<BLiveMultiCall> list) {
        m139821w4(list);
        if (!this.f202765o) {
            this.f202765o = true;
            m206028F2().MultiCallEvent.hasGetMultiCallList().mo172464m(Boolean.TRUE);
        }
        if (vwb.m200296J(list)) {
            return;
        }
        m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
        m206028F2().MultiCallEvent.showAudienceApplyIcon().mo172464m(Boolean.TRUE);
        BLiveMultiCall bLiveMultiCall = list.get(0);
        m139800b4().m100368n(bLiveMultiCall.ownerMultiCallOrder);
        m218266E4();
        duringCreated(LivingNormalApiProvider.m71175A4(bLiveMultiCall.ownerUserId, bLiveMultiCall.f44400id)).subscribe(ffw.m121197h(new e30() { // from class: l.ye10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197654a.m218264C4((BLiveMultiCallAsset) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m218264C4(BLiveMultiCallAsset bLiveMultiCallAsset) {
        m139800b4().f73728b = bLiveMultiCallAsset.freeCall;
        m206028F2().MultiCallEvent.refreshCallView().mo172463j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m218265D4(Boolean bool) {
        m218267F4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final void m218266E4() {
        BLiveMultiCall bLiveMultiCallM177970E = r610.m177970E(this, ((am40) m206027E2()).m132146l0().f56011id);
        l610.m148692i(this, NullChecker.m81303a(bLiveMultiCallM177970E) ? l610.m148690g(bLiveMultiCallM177970E) : "live");
    }

    /* JADX INFO: renamed from: F4 */
    public void m218267F4() {
        k4t k4tVar = this.f116261l;
        if (k4tVar instanceof uf10) {
            ((uf10) k4tVar).m193366L4();
        }
    }

    @Override // p149l.j510, p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.j510, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(LivingNormalApiProvider.m71185B5(((am40) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.we10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185900a.m218263B4((List) obj);
            }
        }, new z2k()));
        m129304h3(m206028F2().MultiCallEvent.switchToVideo(), new e30() { // from class: l.xe10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192516a.m218265D4((Boolean) obj);
            }
        });
    }
}
