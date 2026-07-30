package p002l;

import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.ffw;
import l.l3m;
import l.mqv;
import l.sgj;
import l.vwb;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cfj extends h4t<ho2, yti> implements l3m {
    public cfj(bsm bsmVar) {
        super(bsmVar);
        sgj.a(ypv.a.D0());
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m10990J3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m10994N3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public final void m10998S3() {
        sgj.e();
    }

    /* JADX INFO: renamed from: T */
    public void m10999T() {
        super.T();
        sgj.c();
        sgj.n(false);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m11000T3(double d) {
        sgj.f();
        sgj.g(d);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m11001U3(rge0 rge0Var) {
        if (rge0Var == null || rge0Var.getSendGiftRequestInfo().f17280e == null) {
            return;
        }
        m11000T3(rge0Var.getSendGiftRequestInfo().f17280e.purchasePrice);
        m10998S3();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Boolean m11002V3(LongLinkGiftMessage.LiveRankings liveRankings) {
        return Boolean.valueOf(liveRankings.getRoomId().equals(m25547E2().m17238n().id) && LongLinkGiftMessage.LiveRankingType.live.equals(liveRankings.getType()));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m11003W3(LongLinkGiftMessage.LiveRankings liveRankings) {
        m11005Y3(new pfg(liveRankings));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m11004X3(far farVar) {
        m11005Y3(new pfg(farVar));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Y3 */
    public final void m11005Y3(pfg pfgVar) {
        mqv mqvVar = (mqv) vwb.r(pfgVar.m20227b(), new w9j() { // from class: l.bfj
            public final Object call(Object obj) {
                return Boolean.valueOf(ypv.a.D0().equals(((i4g) ((mqv) obj).a).f13039a));
            }
        });
        if (NullChecker.a(mqvVar)) {
            String str = m25547E2().m17238n().id;
            String str2 = m25547E2().m17234j().id;
            Object obj = mqvVar.a;
            sgj.h(str, str2, ((i4g) obj).f13041c, ((i4g) obj).f13042d);
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        sgj.n(true);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v17, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m11006t() {
        super.t();
        duringCreated((c) m25548F2().SendGiftEventGroup.sendGiftSuccess().g()).subscribe(ffw.d(new e30() { // from class: l.uej
            public final void call(Object obj) {
                this.f20601a.m11001U3((rge0) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.sendMessageResult().g()).subscribe(ffw.d(new e30() { // from class: l.vej
            public final void call(Object obj) {
                sgj.j();
            }
        }));
        duringCreated(m25547E2().m14596q1().Z()).filter(new w9j() { // from class: l.wej
            public final Object call(Object obj) {
                return this.f21678a.m11002V3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.xej
            public final void call(Object obj) {
                this.f22247a.m11003W3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }, new e30() { // from class: l.yej
            public final void call(Object obj) {
                cfj.m10990J3((Throwable) obj);
            }
        }));
        duringCreated(m25547E2().m14586m1()).subscribe(ffw.e(new e30() { // from class: l.zej
            public final void call(Object obj) {
                this.f23363a.m11004X3((far) obj);
            }
        }, new e30() { // from class: l.afj
            public final void call(Object obj) {
                cfj.m10994N3((Throwable) obj);
            }
        }));
    }
}
