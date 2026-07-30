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
public class n180 extends pat<ho2> implements b0m {

    /* JADX INFO: renamed from: i */
    public rp70 f136619i;

    /* JADX INFO: renamed from: j */
    public e30<PkData> f136620j;

    public n180(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ PkData m157340L3(PkData pkData) {
        return (PkData) ht70.m132852i("PkRoomMonitor pkTimeOut requestPk callback", pkData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ PkData m157341M3(j760 j760Var) {
        if (NullChecker.m81303a(j760Var)) {
            return new PkData((BLivePk) j760Var.f116564a, (List) j760Var.f116565b, m206027E2().m132146l0());
        }
        return null;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22306c m157342N3(Long l2) {
        return duringCreated((C22306c) LivingNormalApiProvider.m71448e7(this.f136619i.m180303N3().f51567pk.f44421id).map(new w9j() { // from class: l.m180
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130814a.m157341M3((j760) obj);
            }
        })).filter(new y180());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: O3 */
    public void m157343O3(BLivePkStage bLivePkStage) {
        ht70.m132853j("PkRoomMonitor pkTimeOut ,stage=" + bLivePkStage.toString());
        duringCreated(m206027E2().m132135h2(10, TimeUnit.SECONDS).take(1)).onBackpressureLatest().flatMap(new w9j() { // from class: l.k180
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120547a.m157342N3((Long) obj);
            }
        }).map(new w9j() { // from class: l.l180
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return n180.m157340L3((PkData) obj);
            }
        }).subscribe(ffw.m121194e(this.f136620j, new a280()));
    }

    @Override // p149l.b0m
    /* JADX INFO: renamed from: a0 */
    public void mo99782a0(rp70 rp70Var) {
        this.f136619i = rp70Var;
    }

    @Override // p149l.b0m
    /* JADX INFO: renamed from: k */
    public void mo99784k(e30<PkData> e30Var) {
        this.f136620j = e30Var;
    }

    @Override // p149l.b0m
    /* JADX INFO: renamed from: f */
    public void mo99783f(PkData pkData) {
    }

    @Override // p149l.b0m
    public void reset() {
    }
}
