package p149l;

import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class j180 extends pat<ho2> implements a0m {

    /* JADX INFO: renamed from: i */
    public b280 f115774i;

    /* JADX INFO: renamed from: j */
    public e30<PkData> f115775j;

    public j180(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ PkData m139287K3(PkData pkData) {
        return (PkData) ht70.m132852i("PkRoomMonitor pkTimeOut requestPk callback", pkData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ PkData m139289M3(j760 j760Var) {
        if (NullChecker.m81303a(j760Var)) {
            return new PkData((BLivePk) j760Var.f116564a, (List) j760Var.f116565b, m206027E2().m132146l0());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ C22306c m139290N3(Long l2) {
        return duringCreated((C22306c) LivingNormalApiProvider.m71448e7(this.f115774i.m99904N3().f51567pk.f44421id).map(new w9j() { // from class: l.i180
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f110431a.m139289M3((j760) obj);
            }
        })).filter(new y180());
    }

    @Override // p149l.a0m
    /* JADX INFO: renamed from: G */
    public void mo94443G(b280 b280Var) {
        this.f115774i = b280Var;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: O3 */
    public void m139291O3(BLivePkStage bLivePkStage) {
        ht70.m132853j("PkRoomMonitor pkTimeOut ,stage=" + bLivePkStage.toString());
        duringCreated(m206027E2().m132135h2(10, TimeUnit.SECONDS).take(1)).onBackpressureLatest().flatMap(new w9j() { // from class: l.g180
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f100126a.m139290N3((Long) obj);
            }
        }).map(new w9j() { // from class: l.h180
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j180.m139287K3((PkData) obj);
            }
        }).subscribe(ffw.m121194e(this.f115775j, new a280()));
    }

    @Override // p149l.a0m
    /* JADX INFO: renamed from: k */
    public void mo94445k(e30<PkData> e30Var) {
        this.f115775j = e30Var;
    }

    @Override // p149l.a0m
    /* JADX INFO: renamed from: f */
    public void mo94444f(PkData pkData) {
    }

    @Override // p149l.a0m
    public void reset() {
    }
}
