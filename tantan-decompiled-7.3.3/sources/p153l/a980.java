package p153l;

import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes5.dex */
public class a980 {

    /* JADX INFO: renamed from: a */
    public final dum f69003a;

    /* JADX INFO: renamed from: b */
    public kcg0 f69004b;

    public a980(dum dumVar) {
        this.f69003a = dumVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ PkData m96544e(PkData pkData) {
        return (PkData) n180.m161092i("PkRequestLooper callback", pkData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PkData m96545f(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var)) {
            return new PkData((BLivePk) pf60Var.f152156a, (List) pf60Var.f152157b, this.f69003a.f90822h.m168532l0());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C22421c m96546g(String str, y20 y20Var, Long l2) {
        return this.f69003a.f90821g.duringCreated((C22421c) LivingNormalApiProvider.m72631e7(str).map(new qcj() { // from class: l.z880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203326a.m96545f((pf60) obj);
            }
        })).filter(new ea80()).doOnError(y20Var).materialize();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m96547h(PkData pkData) {
        m96549j();
    }

    /* JADX INFO: renamed from: i */
    public void m96548i(final String str, final BLivePkStage bLivePkStage, y20<PkData> y20Var, final y20<Throwable> y20Var2) {
        psd0.m173633z(this.f69004b);
        n180.m161093j("start runLooper pkId:" + str + "，state =" + bLivePkStage.toString());
        dum dumVar = this.f69003a;
        this.f69004b = dumVar.f90821g.duringCreated(dumVar.f90822h.m168521h2(3, TimeUnit.SECONDS)).take(10).onBackpressureLatest().observeOn(fo0.m126432a()).flatMap(new qcj() { // from class: l.u880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177991a.m96546g(str, y20Var2, (Long) obj);
            }
        }).onBackpressureLatest().filter(new f130()).filter(new qsu()).filter(new qcj() { // from class: l.v880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((PkData) ((Notification) obj).m222541f()).isTargetState(bLivePkStage);
            }
        }).map(new qcj() { // from class: l.w880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return (PkData) ((Notification) obj).m222541f();
            }
        }).take(1).doOnNext(new y20() { // from class: l.x880
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192801a.m96547h((PkData) obj);
            }
        }).map(new qcj() { // from class: l.y880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return a980.m96544e((PkData) obj);
            }
        }).subscribe(dhw.m115826e(y20Var, y20Var2));
    }

    /* JADX INFO: renamed from: j */
    public void m96549j() {
        n180.m161093j("PkRequestLooper stop");
        psd0.m173633z(this.f69004b);
    }
}
