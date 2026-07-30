package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class cfj extends h4t<ho2, yti> implements l3m {
    public cfj(bsm bsmVar) {
        super(bsmVar);
        sgj.m184088a(ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m106558J3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m106562N3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public final void m106566S3() {
        sgj.m184092e();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        sgj.m184090c();
        sgj.m184101n(false);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m106567T3(double d) {
        sgj.m184093f();
        sgj.m184094g(d);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m106568U3(rge0 rge0Var) {
        if (rge0Var == null || rge0Var.getSendGiftRequestInfo().f148656e == null) {
            return;
        }
        m106567T3(rge0Var.getSendGiftRequestInfo().f148656e.purchasePrice);
        m106566S3();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Boolean m106569V3(LongLinkGiftMessage.LiveRankings liveRankings) {
        return Boolean.valueOf(liveRankings.getRoomId().equals(m206027E2().mo149817n().f44324id) && LongLinkGiftMessage.LiveRankingType.live.equals(liveRankings.getType()));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m106570W3(LongLinkGiftMessage.LiveRankings liveRankings) {
        m106572Y3(new pfg(liveRankings));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m106571X3(far farVar) {
        m106572Y3(new pfg(farVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Y3 */
    public final void m106572Y3(pfg pfgVar) {
        mqv mqvVar = (mqv) vwb.m200346r(pfgVar.m168639b(), new w9j() { // from class: l.bfj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ypv.f199493a.m199309D0().equals(((i4g) ((mqv) obj).f135304a).f111441a));
            }
        });
        if (NullChecker.m81303a(mqvVar)) {
            String str = m206027E2().mo149817n().f44324id;
            String str2 = m206027E2().mo149813j().f44323id;
            T t = mqvVar.f135304a;
            sgj.m184095h(str, str2, ((i4g) t).f111443c, ((i4g) t).f111444d);
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        sgj.m184101n(true);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v17, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().SendGiftEventGroup.sendGiftSuccess().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.uej
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176044a.m106568U3((rge0) obj);
            }
        }));
        duringCreated(m206028F2().ChatEvent.sendMessageResult().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vej
            @Override // p149l.e30
            public final void call(Object obj) {
                sgj.m184097j();
            }
        }));
        duringCreated(m206027E2().m132160q1().m189084Z()).filter(new w9j() { // from class: l.wej
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185944a.m106569V3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.xej
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192601a.m106570W3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }, new e30() { // from class: l.yej
            @Override // p149l.e30
            public final void call(Object obj) {
                cfj.m106558J3((Throwable) obj);
            }
        }));
        duringCreated(m206027E2().m132150m1()).subscribe(ffw.m121194e(new e30() { // from class: l.zej
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202834a.m106571X3((far) obj);
            }
        }, new e30() { // from class: l.afj
            @Override // p149l.e30
            public final void call(Object obj) {
                cfj.m106562N3((Throwable) obj);
            }
        }));
    }
}
