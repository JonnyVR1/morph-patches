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
public class b280 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final my70 f72661i;

    /* JADX INFO: renamed from: j */
    public PkData f72662j;

    /* JADX INFO: renamed from: k */
    public C22392a<PkData> f72663k;

    /* JADX INFO: renamed from: l */
    public a0m f72664l;

    public b280(bsm bsmVar, my70 my70Var) {
        super(bsmVar);
        this.f72662j = new PkData(BLivePkStage.get("unknown_"));
        this.f72663k = C22392a.m221512b();
        this.f72661i = my70Var;
    }

    /* JADX INFO: renamed from: M3 */
    public final boolean m99903M3(LivePkMessage livePkMessage) {
        return TextUtils.equals(livePkMessage.type, "pk_created") || TextUtils.equals(livePkMessage.type, "pk_start") || TextUtils.equals(livePkMessage.type, "pk_result") || TextUtils.equals(livePkMessage.type, "pk_end");
    }

    /* JADX INFO: renamed from: N3 */
    public PkData m99904N3() {
        return this.f72662j;
    }

    /* JADX INFO: renamed from: O3 */
    public int m99905O3() {
        if (this.f72662j.isRandom()) {
            return 1;
        }
        return this.f72662j.isBountyPk() ? 3 : 2;
    }

    /* JADX INFO: renamed from: P3 */
    public C22306c<PkData> m99906P3() {
        return this.f72663k.asObservable();
    }

    /* JADX INFO: renamed from: R3 */
    public void m99907R3(a0m a0mVar) {
        this.f72664l = a0mVar;
        a0mVar.mo94443G(this);
        a0mVar.mo94445k(new v180(this));
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m99908S3() {
        return this.f72662j.isPking();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ PkData m99909T3(j760 j760Var) {
        if (NullChecker.m81303a(j760Var)) {
            return new PkData((BLivePk) j760Var.f116564a, (List) j760Var.f116565b, m206027E2().m132146l0());
        }
        return null;
    }

    /* JADX INFO: renamed from: U3 */
    public final void m99910U3(PkData pkData) {
        if (pkData == null) {
            return;
        }
        ht70.m132853j("next stage = " + pkData.f51567pk.situation.currentStageInfo.stage);
        if (!this.f72662j.isUnknown() && !TextUtils.equals(this.f72662j.f51567pk.f44421id, pkData.f51567pk.f44421id)) {
            m99914Y3();
        }
        if (pkData.f51567pk.situation.currentStageInfo.stage.ordinal() <= this.f72662j.state.ordinal()) {
            return;
        }
        BLivePkStage bLivePkStage = this.f72662j.state;
        this.f72662j = pkData;
        pkData.lastState = bLivePkStage;
        m99916a4(pkData);
    }

    /* JADX INFO: renamed from: V3 */
    public void m99911V3(LivePkMessage livePkMessage) {
        if (m99903M3(livePkMessage)) {
            m99912W3(livePkMessage.f47752id, livePkMessage.pkInfo.getIsOnceMore(), new v180(this));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m99912W3(String str, final boolean z, final e30<PkData> e30Var) {
        duringCreated((C22306c) LivingNormalApiProvider.m71448e7(str).map(new w9j() { // from class: l.x180
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f189037a.m99909T3((j760) obj);
            }
        })).filter(new y180()).subscribe(ffw.m121194e(new e30() { // from class: l.z180
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(((PkData) obj).setOnceMore(z));
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: X3 */
    public void m99913X3(String str) {
        m99912W3(str, false, new v180(this));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m99914Y3() {
        ht70.m132853j("resetState");
        this.f72664l.reset();
        PkData pkData = new PkData(BLivePkStage.get("unknown_"));
        this.f72662j = pkData;
        this.f72663k.onNext(pkData);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m99915Z3() {
        this.f72661i.f136260j.m211924A4(true);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m99916a4(PkData pkData) {
        pkData.state = pkData.f51567pk.situation.currentStageInfo.stage;
        this.f72663k.onNext(pkData);
        a0m a0mVar = this.f72664l;
        if (a0mVar != null) {
            a0mVar.mo94444f(pkData);
        }
        ht70.m132853j("state change to " + pkData.state);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m99914Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189074U()).subscribe(ffw.m121193d(new e30() { // from class: l.w180
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183979a.m99911V3((LivePkMessage) obj);
            }
        }));
    }
}
