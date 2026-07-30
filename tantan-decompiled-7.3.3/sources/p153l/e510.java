package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class e510 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final c0m f92174i;

    /* JADX INFO: renamed from: j */
    public final kcg0 f92175j;

    /* JADX INFO: renamed from: k */
    public final kcg0 f92176k;

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v23, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2] */
    public e510(dum dumVar) {
        super(dumVar);
        if (m213810E2().m168456H0() != null) {
            this.f92174i = m213810E2().m168456H0();
        } else {
            this.f92174i = new r210(zrv.f205803e);
        }
        m213810E2().m168499Z1(this.f92174i);
        m138860d3(r410.class, new qcj() { // from class: l.v410
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f182328a.m119495S3((r410) obj);
            }
        });
        m138860d3(c210.class, new qcj() { // from class: l.w410
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187200a.m119496T3((c210) obj);
            }
        });
        m138860d3(k210.class, new qcj() { // from class: l.x410
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192327a.m119497U3((k210) obj);
            }
        });
        m138860d3(z310.class, new qcj() { // from class: l.y410
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197404a.m119498V3((z310) obj);
            }
        });
        m138860d3(w1f.class, new qcj() { // from class: l.z410
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f202892a.m119499W3((w1f) obj);
            }
        });
        m138860d3(s510.class, new qcj() { // from class: l.a510
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68482a.m119500X3((s510) obj);
            }
        });
        this.f92175j = m213811F2().MomoSdkEvent.sdkActionEvent().m199270g().subscribe(dhw.m115825d(new y20() { // from class: l.b510
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75013a.m119501Y3((Integer) obj);
            }
        }));
        this.f92176k = m213811F2().MomoSdkEvent.renewRtcToken().m199270g().subscribe(dhw.m115825d(new y20() { // from class: l.c510
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79751a.m119504b4((f510) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ xzl m119495S3(r410 r410Var) {
        return this.f92174i.mo107434e();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ szl m119496T3(c210 c210Var) {
        return this.f92174i.mo107435f();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ uzl m119497U3(k210 k210Var) {
        return this.f92174i.mo107430a();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ h0m m119498V3(z310 z310Var) {
        return this.f92174i.mo107433d();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ wsl m119499W3(w1f w1fVar) {
        return this.f92174i.mo107431b();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ d0m m119500X3(s510 s510Var) {
        return this.f92174i.mo107432c();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m119501Y3(Integer num) {
        if (num.intValue() == 1) {
            this.f92174i.onPause();
        } else if (num.intValue() == 2) {
            this.f92174i.onResume();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m119502Z3(BLiveRtcToken bLiveRtcToken) {
        this.f92174i.mo107434e().mo170538o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: a4 */
    public void m119503a4(BLiveRtcToken bLiveRtcToken) {
        this.f92174i.mo107434e().mo170538o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: b4 */
    public void m119504b4(f510 f510Var) {
        LivingNormalApiProvider.m72721o7(f510Var.f97181a, f510Var.f97182b, f510Var.f97183c).subscribe(dhw.m115829h(new y20() { // from class: l.d510
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85091a.m119502Z3((BLiveRtcToken) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f92175j);
        psd0.m173633z(this.f92176k);
        if (m213810E2().m168495Y0()) {
            return;
        }
        this.f92174i.release();
        m213810E2().m168499Z1(null);
    }
}
