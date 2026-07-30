package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class mbg extends tk2<hbg> {

    /* JADX INFO: renamed from: j */
    public f9c f135719j;

    public mbg(dum<? extends oo2> dumVar, tk2 tk2Var) {
        super(dumVar);
        mo52715C(new hbg());
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m157776j4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m157778l4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public final void m157779m4() {
        final String strUserId = uqb0.f180396b0.f170324a.userId();
        duringCreated(m191481Z3().m209631x(strUserId)).flatMap(new qcj() { // from class: l.kbg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f124944a.m157780n4(strUserId, (Boolean) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.lbg
            @Override // p153l.y20
            public final void call(Object obj) {
                mbg.m157776j4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ C22421c m157780n4(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            return C22421c.error(new RuntimeException());
        }
        this.f135719j.m124633b();
        return duringCreated(m191481Z3().m209627V(str));
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m157781o4(Long l2) {
        m157779m4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        f9c f9cVar = new f9c("expire_medal_fanbase" + m213810E2().m168532l0().f56859id, 0L, false);
        this.f135719j = f9cVar;
        if (f9cVar.m124632a(1)) {
            m138859I3(m213810E2().m168521h2((int) zrv.m221193k().m203412F5(), TimeUnit.SECONDS), true).take(1).subscribe(dhw.m115826e(new y20() { // from class: l.ibg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114215a.m157781o4((Long) obj);
                }
            }, new y20() { // from class: l.jbg
                @Override // p153l.y20
                public final void call(Object obj) {
                    mbg.m157778l4((Throwable) obj);
                }
            }));
        }
    }
}
