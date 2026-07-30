package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class ww00 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final jxl f188300i;

    /* JADX INFO: renamed from: j */
    public final c4g0 f188301j;

    /* JADX INFO: renamed from: k */
    public final c4g0 f188302k;

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v23, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    public ww00(bsm bsmVar) {
        super(bsmVar);
        if (m206027E2().m132067H0() != null) {
            this.f188300i = m206027E2().m132067H0();
        } else {
            this.f188300i = new iu00(ypv.f199497e);
        }
        m206027E2().m132113Z1(this.f188300i);
        m129301d3(jw00.class, new w9j() { // from class: l.nw00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f140862a.m205809S3((jw00) obj);
            }
        });
        m129301d3(tt00.class, new w9j() { // from class: l.ow00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f145900a.m205810T3((tt00) obj);
            }
        });
        m129301d3(bu00.class, new w9j() { // from class: l.pw00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151528a.m205811U3((bu00) obj);
            }
        });
        m129301d3(rv00.class, new w9j() { // from class: l.qw00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f156647a.m205812V3((rv00) obj);
            }
        });
        m129301d3(s0f.class, new w9j() { // from class: l.rw00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161294a.m205813W3((s0f) obj);
            }
        });
        m129301d3(ix00.class, new w9j() { // from class: l.sw00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166614a.m205814X3((ix00) obj);
            }
        });
        this.f188301j = m206028F2().MomoSdkEvent.sdkActionEvent().m172460g().subscribe(ffw.m121193d(new e30() { // from class: l.tw00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172356a.m205815Y3((Integer) obj);
            }
        }));
        this.f188302k = m206028F2().MomoSdkEvent.renewRtcToken().m172460g().subscribe(ffw.m121193d(new e30() { // from class: l.uw00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178581a.m205818b4((xw00) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ exl m205809S3(jw00 jw00Var) {
        return this.f188300i.mo138339e();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ zwl m205810T3(tt00 tt00Var) {
        return this.f188300i.mo138340f();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ bxl m205811U3(bu00 bu00Var) {
        return this.f188300i.mo138335a();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ oxl m205812V3(rv00 rv00Var) {
        return this.f188300i.mo138338d();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ kql m205813W3(s0f s0fVar) {
        return this.f188300i.mo138336b();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ kxl m205814X3(ix00 ix00Var) {
        return this.f188300i.mo138337c();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m205815Y3(Integer num) {
        if (num.intValue() == 1) {
            this.f188300i.onPause();
        } else if (num.intValue() == 2) {
            this.f188300i.onResume();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m205816Z3(BLiveRtcToken bLiveRtcToken) {
        this.f188300i.mo138339e().mo118680o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: a4 */
    public void m205817a4(BLiveRtcToken bLiveRtcToken) {
        this.f188300i.mo138339e().mo118680o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: b4 */
    public void m205818b4(xw00 xw00Var) {
        LivingNormalApiProvider.m71538o7(xw00Var.f194682a, xw00Var.f194683b, xw00Var.f194684c).subscribe(ffw.m121197h(new e30() { // from class: l.vw00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183291a.m205816Z3((BLiveRtcToken) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f188301j);
        mkd0.m154992z(this.f188302k);
        if (m206027E2().m132109Y0()) {
            return;
        }
        this.f188300i.release();
        m206027E2().m132113Z1(null);
    }
}
