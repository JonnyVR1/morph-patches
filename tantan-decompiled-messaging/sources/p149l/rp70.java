package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class rp70 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final mp70 f160481i;

    /* JADX INFO: renamed from: j */
    public PkData f160482j;

    /* JADX INFO: renamed from: k */
    public C22392a<PkData> f160483k;

    /* JADX INFO: renamed from: l */
    public b0m f160484l;

    public rp70(bsm bsmVar, mp70 mp70Var) {
        super(bsmVar);
        this.f160482j = new PkData(BLivePkStage.get("unknown_"));
        this.f160483k = C22392a.m221512b();
        this.f160481i = mp70Var;
    }

    /* JADX INFO: renamed from: M3 */
    private boolean m180298M3(LivePkMessage livePkMessage) {
        return TextUtils.equals(livePkMessage.type, "pk_created") || TextUtils.equals(livePkMessage.type, "pk_start") || TextUtils.equals(livePkMessage.type, "pk_result") || TextUtils.equals(livePkMessage.type, "pk_end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ PkData m180299T3(j760 j760Var) {
        if (NullChecker.m81303a(j760Var)) {
            return new PkData((BLivePk) j760Var.f116564a, (List) j760Var.f116565b, m206027E2().m132146l0());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m180300U3(PkData pkData) {
        if (pkData == null) {
            return;
        }
        ht70.m132853j("next stage = " + pkData.f51567pk.situation.currentStageInfo.stage);
        if (!this.f160482j.isUnknown() && !TextUtils.equals(this.f160482j.f51567pk.f44421id, pkData.f51567pk.f44421id)) {
            m180310Y3();
        }
        if (pkData.f51567pk.situation.currentStageInfo.stage.ordinal() <= this.f160482j.state.ordinal()) {
            return;
        }
        BLivePkStage bLivePkStage = this.f160482j.state;
        this.f160482j = pkData;
        pkData.lastState = bLivePkStage;
        m180302a4(pkData);
    }

    /* JADX INFO: renamed from: W3 */
    private void m180301W3(String str, final boolean z, final e30<PkData> e30Var) {
        duringCreated((C22306c) LivingNormalApiProvider.m71448e7(str).map(new w9j() { // from class: l.pp70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150631a.m180299T3((j760) obj);
            }
        })).filter(new y180()).subscribe(ffw.m121194e(new e30() { // from class: l.qp70
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(((PkData) obj).setOnceMore(z));
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: a4 */
    private void m180302a4(PkData pkData) {
        pkData.state = pkData.f51567pk.situation.currentStageInfo.stage;
        this.f160483k.onNext(pkData);
        b0m b0mVar = this.f160484l;
        if (b0mVar != null) {
            b0mVar.mo99783f(pkData);
        }
        ht70.m132853j("state change to " + pkData.state);
    }

    /* JADX INFO: renamed from: N3 */
    public PkData m180303N3() {
        return this.f160482j;
    }

    /* JADX INFO: renamed from: O3 */
    public int m180304O3() {
        if (this.f160482j.isRandom()) {
            return 1;
        }
        return this.f160482j.isBountyPk() ? 3 : 2;
    }

    /* JADX INFO: renamed from: P3 */
    public C22306c<PkData> m180305P3() {
        return this.f160483k.asObservable();
    }

    /* JADX INFO: renamed from: R3 */
    public void m180306R3(b0m b0mVar) {
        this.f160484l = b0mVar;
        b0mVar.mo99782a0(this);
        b0mVar.mo99784k(new np70(this));
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m180307S3() {
        return this.f160482j.isPking();
    }

    /* JADX INFO: renamed from: V3 */
    public void m180308V3(LivePkMessage livePkMessage) {
        if (m180298M3(livePkMessage)) {
            m180301W3(livePkMessage.f47752id, livePkMessage.pkInfo.getIsOnceMore(), new np70(this));
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m180309X3(String str) {
        m180301W3(str, false, new np70(this));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m180310Y3() {
        ht70.m132853j("resetState");
        this.f160484l.reset();
        PkData pkData = new PkData(BLivePkStage.get("unknown_"));
        this.f160482j = pkData;
        this.f160483k.onNext(pkData);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m180311Z3() {
        this.f160481i.f135016j.m118892y4(true);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m180310Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189074U()).subscribe(ffw.m121193d(new e30() { // from class: l.op70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144956a.m180308V3((LivePkMessage) obj);
            }
        }));
    }
}
