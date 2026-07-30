package p002l;

import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.DbObject;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.ffw;
import l.qib0;
import l.w9j;
import l.ypv;
import l.z7c;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y9g extends lk2<t9g> {

    /* JADX INFO: renamed from: j */
    public z7c f22747j;

    public y9g(bsm<? extends ho2> bsmVar, lk2 lk2Var) {
        super(bsmVar);
        C(new t9g());
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m26451j4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m26453l4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public final void m26454m4() {
        final String strUserId = qib0.b0.a.userId();
        duringCreated(m17286Z3().m15717x(strUserId)).flatMap(new w9j() { // from class: l.w9g
            public final Object call(Object obj) {
                return this.f21574a.m26455n4(strUserId, (Boolean) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.x9g
            public final void call(Object obj) {
                y9g.m26451j4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ c m26455n4(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            return c.error(new RuntimeException());
        }
        this.f22747j.b();
        return duringCreated(m17286Z3().m15713V(str));
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m26456o4(Long l2) {
        m26454m4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m26457t() {
        super.t();
        z7c z7cVar = new z7c("expire_medal_fanbase" + ((DbObject) m25547E2().m14582l0()).id, 0L, false);
        this.f22747j = z7cVar;
        if (z7cVar.a(1)) {
            m14187I3(m25547E2().m14571h2((int) ypv.k().F5(), TimeUnit.SECONDS), true).take(1).subscribe(ffw.e(new e30() { // from class: l.u9g
                public final void call(Object obj) {
                    this.f20556a.m26456o4((Long) obj);
                }
            }, new e30() { // from class: l.v9g
                public final void call(Object obj) {
                    y9g.m26453l4((Throwable) obj);
                }
            }));
        }
    }
}
