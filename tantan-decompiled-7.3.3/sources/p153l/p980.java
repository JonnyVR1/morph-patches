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
public class p980 extends qct<oo2> implements u2m {

    /* JADX INFO: renamed from: i */
    public ha80 f151117i;

    /* JADX INFO: renamed from: j */
    public y20<PkData> f151118j;

    public p980(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ PkData m171343K3(PkData pkData) {
        return (PkData) n180.m161092i("PkRoomMonitor pkTimeOut requestPk callback", pkData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ PkData m171345M3(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var)) {
            return new PkData((BLivePk) pf60Var.f152156a, (List) pf60Var.f152157b, m213810E2().m168532l0());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ C22421c m171346N3(Long l2) {
        return duringCreated((C22421c) LivingNormalApiProvider.m72631e7(this.f151117i.m134135N3().f52415pk.f45269id).map(new qcj() { // from class: l.o980
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f145506a.m171345M3((pf60) obj);
            }
        })).filter(new ea80());
    }

    @Override // p153l.u2m
    /* JADX INFO: renamed from: G */
    public void mo142947G(ha80 ha80Var) {
        this.f151117i = ha80Var;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2] */
    /* JADX INFO: renamed from: O3 */
    public void m171347O3(BLivePkStage bLivePkStage) {
        n180.m161093j("PkRoomMonitor pkTimeOut ,stage=" + bLivePkStage.toString());
        duringCreated(m213810E2().m168521h2(10, TimeUnit.SECONDS).take(1)).onBackpressureLatest().flatMap(new qcj() { // from class: l.m980
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135359a.m171346N3((Long) obj);
            }
        }).map(new qcj() { // from class: l.n980
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p980.m171343K3((PkData) obj);
            }
        }).subscribe(dhw.m115826e(this.f151118j, new ga80()));
    }

    @Override // p153l.u2m
    /* JADX INFO: renamed from: k */
    public void mo142955k(y20<PkData> y20Var) {
        this.f151118j = y20Var;
    }

    @Override // p153l.u2m
    /* JADX INFO: renamed from: f */
    public void mo142951f(PkData pkData) {
    }

    @Override // p153l.u2m
    public void reset() {
    }
}
