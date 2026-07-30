package p153l;

import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class t980 extends qct<oo2> implements v2m {

    /* JADX INFO: renamed from: i */
    public xx70 f172615i;

    /* JADX INFO: renamed from: j */
    public y20<PkData> f172616j;

    public t980(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ PkData m189739L3(PkData pkData) {
        return (PkData) n180.m161092i("PkRoomMonitor pkTimeOut requestPk callback", pkData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ PkData m189740M3(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var)) {
            return new PkData((BLivePk) pf60Var.f152156a, (List) pf60Var.f152157b, m213810E2().m168532l0());
        }
        return null;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22421c m189741N3(Long l2) {
        return duringCreated((C22421c) LivingNormalApiProvider.m72631e7(this.f172615i.m213503N3().f52415pk.f45269id).map(new qcj() { // from class: l.s980
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166914a.m189740M3((pf60) obj);
            }
        })).filter(new ea80());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2] */
    /* JADX INFO: renamed from: O3 */
    public void m189742O3(BLivePkStage bLivePkStage) {
        n180.m161093j("PkRoomMonitor pkTimeOut ,stage=" + bLivePkStage.toString());
        duringCreated(m213810E2().m168521h2(10, TimeUnit.SECONDS).take(1)).onBackpressureLatest().flatMap(new qcj() { // from class: l.q980
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156202a.m189741N3((Long) obj);
            }
        }).map(new qcj() { // from class: l.r980
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return t980.m189739L3((PkData) obj);
            }
        }).subscribe(dhw.m115826e(this.f172616j, new ga80()));
    }

    @Override // p153l.v2m
    /* JADX INFO: renamed from: a0 */
    public void mo101431a0(xx70 xx70Var) {
        this.f172615i = xx70Var;
    }

    @Override // p153l.v2m
    /* JADX INFO: renamed from: k */
    public void mo101442k(y20<PkData> y20Var) {
        this.f172616j = y20Var;
    }

    @Override // p153l.v2m
    /* JADX INFO: renamed from: f */
    public void mo101436f(PkData pkData) {
    }

    @Override // p153l.v2m
    public void reset() {
    }
}
