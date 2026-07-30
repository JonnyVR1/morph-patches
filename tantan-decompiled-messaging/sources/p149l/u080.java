package p149l;

import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes5.dex */
public class u080 {

    /* JADX INFO: renamed from: a */
    public final bsm f172856a;

    /* JADX INFO: renamed from: b */
    public c4g0 f172857b;

    public u080(bsm bsmVar) {
        this.f172856a = bsmVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ PkData m191306e(PkData pkData) {
        return (PkData) ht70.m132852i("PkRequestLooper callback", pkData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PkData m191307f(j760 j760Var) {
        if (NullChecker.m81303a(j760Var)) {
            return new PkData((BLivePk) j760Var.f116564a, (List) j760Var.f116565b, this.f172856a.f77102h.m132146l0());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C22306c m191308g(String str, e30 e30Var, Long l2) {
        return this.f172856a.f77101g.duringCreated((C22306c) LivingNormalApiProvider.m71448e7(str).map(new w9j() { // from class: l.t080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167116a.m191307f((j760) obj);
            }
        })).filter(new y180()).doOnError(e30Var).materialize();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m191309h(PkData pkData) {
        m191311j();
    }

    /* JADX INFO: renamed from: i */
    public void m191310i(final String str, final BLivePkStage bLivePkStage, e30<PkData> e30Var, final e30<Throwable> e30Var2) {
        mkd0.m154992z(this.f172857b);
        ht70.m132853j("start runLooper pkId:" + str + "，state =" + bLivePkStage.toString());
        bsm bsmVar = this.f172856a;
        this.f172857b = bsmVar.f77101g.duringCreated(bsmVar.f77102h.m132135h2(3, TimeUnit.SECONDS)).take(10).onBackpressureLatest().observeOn(jo0.m142408a()).flatMap(new w9j() { // from class: l.o080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141299a.m191308g(str, e30Var2, (Long) obj);
            }
        }).onBackpressureLatest().filter(new vs20()).filter(new pqu()).filter(new w9j() { // from class: l.p080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((PkData) ((Notification) obj).m221295f()).isTargetState(bLivePkStage);
            }
        }).map(new w9j() { // from class: l.q080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return (PkData) ((Notification) obj).m221295f();
            }
        }).take(1).doOnNext(new e30() { // from class: l.r080
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157152a.m191309h((PkData) obj);
            }
        }).map(new w9j() { // from class: l.s080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return u080.m191306e((PkData) obj);
            }
        }).subscribe(ffw.m121194e(e30Var, e30Var2));
    }

    /* JADX INFO: renamed from: j */
    public void m191311j() {
        ht70.m132853j("PkRequestLooper stop");
        mkd0.m154992z(this.f172857b);
    }
}
