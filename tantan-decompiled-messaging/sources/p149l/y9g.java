package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class y9g extends lk2<t9g> {

    /* JADX INFO: renamed from: j */
    public z7c f196969j;

    public y9g(bsm<? extends ho2> bsmVar, lk2 lk2Var) {
        super(bsmVar);
        mo51532C(new t9g());
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m213531j4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m213533l4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public final void m213534m4() {
        final String strUserId = qib0.f154713b0.f139230a.userId();
        duringCreated(m150132Z3().m140026x(strUserId)).flatMap(new w9j() { // from class: l.w9g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185351a.m213535n4(strUserId, (Boolean) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.x9g
            @Override // p149l.e30
            public final void call(Object obj) {
                y9g.m213531j4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ C22306c m213535n4(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            return C22306c.error(new RuntimeException());
        }
        this.f196969j.m217452b();
        return duringCreated(m150132Z3().m140022V(str));
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m213536o4(Long l2) {
        m213534m4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        z7c z7cVar = new z7c("expire_medal_fanbase" + m206027E2().m132146l0().f56011id, 0L, false);
        this.f196969j = z7cVar;
        if (z7cVar.m217451a(1)) {
            m129300I3(m206027E2().m132135h2((int) ypv.m215672k().m195625F5(), TimeUnit.SECONDS), true).take(1).subscribe(ffw.m121194e(new e30() { // from class: l.u9g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175264a.m213536o4((Long) obj);
                }
            }, new e30() { // from class: l.v9g
                @Override // p149l.e30
                public final void call(Object obj) {
                    y9g.m213533l4((Throwable) obj);
                }
            }));
        }
    }
}
