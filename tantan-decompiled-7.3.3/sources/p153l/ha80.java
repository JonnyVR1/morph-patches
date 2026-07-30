package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class ha80 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final s680 f108478i;

    /* JADX INFO: renamed from: j */
    public PkData f108479j;

    /* JADX INFO: renamed from: k */
    public C22507a<PkData> f108480k;

    /* JADX INFO: renamed from: l */
    public u2m f108481l;

    public ha80(dum dumVar, s680 s680Var) {
        super(dumVar);
        this.f108479j = new PkData(BLivePkStage.get("unknown_"));
        this.f108480k = C22507a.m222758b();
        this.f108478i = s680Var;
    }

    /* JADX INFO: renamed from: M3 */
    public final boolean m134134M3(LivePkMessage livePkMessage) {
        return TextUtils.equals(livePkMessage.type, "pk_created") || TextUtils.equals(livePkMessage.type, "pk_start") || TextUtils.equals(livePkMessage.type, "pk_result") || TextUtils.equals(livePkMessage.type, "pk_end");
    }

    /* JADX INFO: renamed from: N3 */
    public PkData m134135N3() {
        return this.f108479j;
    }

    /* JADX INFO: renamed from: O3 */
    public int m134136O3() {
        if (this.f108479j.isRandom()) {
            return 1;
        }
        return this.f108479j.isBountyPk() ? 3 : 2;
    }

    /* JADX INFO: renamed from: P3 */
    public C22421c<PkData> m134137P3() {
        return this.f108480k.asObservable();
    }

    /* JADX INFO: renamed from: R3 */
    public void m134138R3(u2m u2mVar) {
        this.f108481l = u2mVar;
        u2mVar.mo142947G(this);
        u2mVar.mo142955k(new ba80(this));
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m134139S3() {
        return this.f108479j.isPking();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ PkData m134140T3(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var)) {
            return new PkData((BLivePk) pf60Var.f152156a, (List) pf60Var.f152157b, m213810E2().m168532l0());
        }
        return null;
    }

    /* JADX INFO: renamed from: U3 */
    public final void m134141U3(PkData pkData) {
        if (pkData == null) {
            return;
        }
        n180.m161093j("next stage = " + pkData.f52415pk.situation.currentStageInfo.stage);
        if (!this.f108479j.isUnknown() && !TextUtils.equals(this.f108479j.f52415pk.f45269id, pkData.f52415pk.f45269id)) {
            m134145Y3();
        }
        if (pkData.f52415pk.situation.currentStageInfo.stage.ordinal() <= this.f108479j.state.ordinal()) {
            return;
        }
        BLivePkStage bLivePkStage = this.f108479j.state;
        this.f108479j = pkData;
        pkData.lastState = bLivePkStage;
        m134147a4(pkData);
    }

    /* JADX INFO: renamed from: V3 */
    public void m134142V3(LivePkMessage livePkMessage) {
        if (m134134M3(livePkMessage)) {
            m134143W3(livePkMessage.f48600id, livePkMessage.pkInfo.getIsOnceMore(), new ba80(this));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m134143W3(String str, final boolean z, final y20<PkData> y20Var) {
        duringCreated((C22421c) LivingNormalApiProvider.m72631e7(str).map(new qcj() { // from class: l.da80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f85851a.m134140T3((pf60) obj);
            }
        })).filter(new ea80()).subscribe(dhw.m115826e(new y20() { // from class: l.fa80
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(((PkData) obj).setOnceMore(z));
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: X3 */
    public void m134144X3(String str) {
        m134143W3(str, false, new ba80(this));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m134145Y3() {
        n180.m161093j("resetState");
        this.f108481l.reset();
        PkData pkData = new PkData(BLivePkStage.get("unknown_"));
        this.f108479j = pkData;
        this.f108480k.onNext(pkData);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m134146Z3() {
        this.f108478i.f166544j.m114811A4(true);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m134147a4(PkData pkData) {
        pkData.state = pkData.f52415pk.situation.currentStageInfo.stage;
        this.f108480k.onNext(pkData);
        u2m u2mVar = this.f108481l;
        if (u2mVar != null) {
            u2mVar.mo142951f(pkData);
        }
        n180.m161093j("state change to " + pkData.state);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m134145Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98256U()).subscribe(dhw.m115825d(new y20() { // from class: l.ca80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80560a.m134142V3((LivePkMessage) obj);
            }
        }));
    }
}
