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
public class xx70 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final sx70 f196611i;

    /* JADX INFO: renamed from: j */
    public PkData f196612j;

    /* JADX INFO: renamed from: k */
    public C22507a<PkData> f196613k;

    /* JADX INFO: renamed from: l */
    public v2m f196614l;

    public xx70(dum dumVar, sx70 sx70Var) {
        super(dumVar);
        this.f196612j = new PkData(BLivePkStage.get("unknown_"));
        this.f196613k = C22507a.m222758b();
        this.f196611i = sx70Var;
    }

    /* JADX INFO: renamed from: M3 */
    private boolean m213498M3(LivePkMessage livePkMessage) {
        return TextUtils.equals(livePkMessage.type, "pk_created") || TextUtils.equals(livePkMessage.type, "pk_start") || TextUtils.equals(livePkMessage.type, "pk_result") || TextUtils.equals(livePkMessage.type, "pk_end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ PkData m213499T3(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var)) {
            return new PkData((BLivePk) pf60Var.f152156a, (List) pf60Var.f152157b, m213810E2().m168532l0());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m213500U3(PkData pkData) {
        if (pkData == null) {
            return;
        }
        n180.m161093j("next stage = " + pkData.f52415pk.situation.currentStageInfo.stage);
        if (!this.f196612j.isUnknown() && !TextUtils.equals(this.f196612j.f52415pk.f45269id, pkData.f52415pk.f45269id)) {
            m213510Y3();
        }
        if (pkData.f52415pk.situation.currentStageInfo.stage.ordinal() <= this.f196612j.state.ordinal()) {
            return;
        }
        BLivePkStage bLivePkStage = this.f196612j.state;
        this.f196612j = pkData;
        pkData.lastState = bLivePkStage;
        m213502a4(pkData);
    }

    /* JADX INFO: renamed from: W3 */
    private void m213501W3(String str, final boolean z, final y20<PkData> y20Var) {
        duringCreated((C22421c) LivingNormalApiProvider.m72631e7(str).map(new qcj() { // from class: l.vx70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186241a.m213499T3((pf60) obj);
            }
        })).filter(new ea80()).subscribe(dhw.m115826e(new y20() { // from class: l.wx70
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(((PkData) obj).setOnceMore(z));
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: a4 */
    private void m213502a4(PkData pkData) {
        pkData.state = pkData.f52415pk.situation.currentStageInfo.stage;
        this.f196613k.onNext(pkData);
        v2m v2mVar = this.f196614l;
        if (v2mVar != null) {
            v2mVar.mo101436f(pkData);
        }
        n180.m161093j("state change to " + pkData.state);
    }

    /* JADX INFO: renamed from: N3 */
    public PkData m213503N3() {
        return this.f196612j;
    }

    /* JADX INFO: renamed from: O3 */
    public int m213504O3() {
        if (this.f196612j.isRandom()) {
            return 1;
        }
        return this.f196612j.isBountyPk() ? 3 : 2;
    }

    /* JADX INFO: renamed from: P3 */
    public C22421c<PkData> m213505P3() {
        return this.f196613k.asObservable();
    }

    /* JADX INFO: renamed from: R3 */
    public void m213506R3(v2m v2mVar) {
        this.f196614l = v2mVar;
        v2mVar.mo101431a0(this);
        v2mVar.mo101442k(new tx70(this));
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m213507S3() {
        return this.f196612j.isPking();
    }

    /* JADX INFO: renamed from: V3 */
    public void m213508V3(LivePkMessage livePkMessage) {
        if (m213498M3(livePkMessage)) {
            m213501W3(livePkMessage.f48600id, livePkMessage.pkInfo.getIsOnceMore(), new tx70(this));
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m213509X3(String str) {
        m213501W3(str, false, new tx70(this));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m213510Y3() {
        n180.m161093j("resetState");
        this.f196614l.reset();
        PkData pkData = new PkData(BLivePkStage.get("unknown_"));
        this.f196612j = pkData;
        this.f196613k.onNext(pkData);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m213511Z3() {
        this.f196611i.f171086j.m148634y4(true);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m213510Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98256U()).subscribe(dhw.m115825d(new y20() { // from class: l.ux70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181353a.m213508V3((LivePkMessage) obj);
            }
        }));
    }
}
