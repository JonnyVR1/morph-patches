package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveRtcToken;
import l.c4g0;
import l.e30;
import l.ffw;
import l.mkd0;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ww00 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final jxl f22009i;

    /* JADX INFO: renamed from: j */
    public final c4g0 f22010j;

    /* JADX INFO: renamed from: k */
    public final c4g0 f22011k;

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v23, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    public ww00(bsm bsmVar) {
        super(bsmVar);
        if (m25547E2().m14503H0() != null) {
            this.f22009i = m25547E2().m14503H0();
        } else {
            this.f22009i = new iu00(ypv.e);
        }
        m25547E2().m14549Z1(this.f22009i);
        m14188d3(jw00.class, new w9j() { // from class: l.nw00
            public final Object call(Object obj) {
                return this.f16277a.m25527S3((jw00) obj);
            }
        });
        m14188d3(tt00.class, new w9j() { // from class: l.ow00
            public final Object call(Object obj) {
                return this.f16810a.m25528T3((tt00) obj);
            }
        });
        m14188d3(bu00.class, new w9j() { // from class: l.pw00
            public final Object call(Object obj) {
                return this.f17703a.m25529U3((bu00) obj);
            }
        });
        m14188d3(rv00.class, new w9j() { // from class: l.qw00
            public final Object call(Object obj) {
                return this.f18253a.m25530V3((rv00) obj);
            }
        });
        m14188d3(s0f.class, new w9j() { // from class: l.rw00
            public final Object call(Object obj) {
                return this.f18700a.m25531W3((s0f) obj);
            }
        });
        m14188d3(ix00.class, new w9j() { // from class: l.sw00
            public final Object call(Object obj) {
                return this.f19306a.m25532X3((ix00) obj);
            }
        });
        this.f22010j = ((c) m25548F2().MomoSdkEvent.sdkActionEvent().g()).subscribe(ffw.d(new e30() { // from class: l.tw00
            public final void call(Object obj) {
                this.f20411a.m25533Y3((Integer) obj);
            }
        }));
        this.f22011k = ((c) m25548F2().MomoSdkEvent.renewRtcToken().g()).subscribe(ffw.d(new e30() { // from class: l.uw00
            public final void call(Object obj) {
                this.f20852a.m25536b4((xw00) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ exl m25527S3(jw00 jw00Var) {
        return this.f22009i.mo15383e();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ zwl m25528T3(tt00 tt00Var) {
        return this.f22009i.mo15384f();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ bxl m25529U3(bu00 bu00Var) {
        return this.f22009i.mo15379a();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ oxl m25530V3(rv00 rv00Var) {
        return this.f22009i.mo15382d();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ kql m25531W3(s0f s0fVar) {
        return this.f22009i.mo15380b();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ kxl m25532X3(ix00 ix00Var) {
        return this.f22009i.mo15381c();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m25533Y3(Integer num) {
        if (num.intValue() == 1) {
            this.f22009i.onPause();
        } else if (num.intValue() == 2) {
            this.f22009i.onResume();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m25534Z3(BLiveRtcToken bLiveRtcToken) {
        this.f22009i.mo15383e().mo12840o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: a4 */
    public void m25535a4(BLiveRtcToken bLiveRtcToken) {
        this.f22009i.mo15383e().mo12840o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: b4 */
    public void m25536b4(xw00 xw00Var) {
        LivingNormalApiProvider.m4904o7(xw00Var.f22486a, xw00Var.f22487b, xw00Var.f22488c).subscribe(ffw.h(new e30() { // from class: l.vw00
            public final void call(Object obj) {
                this.f21352a.m25534Z3((BLiveRtcToken) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f22010j);
        mkd0.z(this.f22011k);
        if (m25547E2().m14545Y0()) {
            return;
        }
        this.f22009i.release();
        m25547E2().m14549Z1(null);
    }
}
