package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.dpq;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.lsi0;
import l.qib0;
import l.qnq;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p7g extends x6s<ho2, y6g> {

    /* JADX INFO: renamed from: j */
    public m6g f17037j;

    /* JADX INFO: renamed from: l.p7g$a */
    public class C0741a implements zfv.C0940a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ htl f17038a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveFanBaseDetail f17039b;

        public C0741a(htl htlVar, BLiveFanBaseDetail bLiveFanBaseDetail) {
            this.f17038a = htlVar;
            this.f17039b = bLiveFanBaseDetail;
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: a */
        public void mo5855a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            p7g.this.m20104I4(this.f17038a.mo14807b(), this.f17038a.mo14807b().a(), this.f17039b);
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: b */
        public void mo5856b() {
            this.f17038a.mo14807b().b().call("0");
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: c */
        public void mo5857c() {
            ((y6g) ((bwr) p7g.this).viewModel).m26393P();
            this.f17038a.mo14807b().b().call("0");
        }
    }

    /* JADX INFO: renamed from: l.p7g$c */
    public class RunnableC0743c implements Runnable {
        public RunnableC0743c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p7g.this.m25548F2().FansGroupEvent.showApplyDialog().j("");
        }
    }

    public p7g(bsm bsmVar) {
        super(bsmVar);
        C(new y6g(bsmVar.f8332a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m20073D4(Boolean bool) {
        if (!bool.booleanValue()) {
            ((y6g) ((bwr) this).viewModel).m5217q(null);
            return;
        }
        if (m25552L2()) {
            m25548F2().FansClubEvent.showFansClubDialog().j(Boolean.TRUE);
        } else if (m20096r4()) {
            if (m20095q4()) {
                m25548F2().FansClubEvent.showFansClubDialog().j(Boolean.TRUE);
            } else {
                m20074J4();
            }
        }
    }

    /* JADX INFO: renamed from: J4 */
    private void m20074J4() {
        ((y6g) ((bwr) this).viewModel).m5211E();
        m20103H4();
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ m6g m20078V3(BLiveFanBase bLiveFanBase, BLiveEnvelope bLiveEnvelope) {
        return new m6g(bLiveEnvelope, bLiveFanBase.id);
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ gm0 m20079W3(BLiveEnvelope bLiveEnvelope) {
        return new gm0(bLiveEnvelope);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2] */
    /* JADX INFO: renamed from: q4 */
    private boolean m20095q4() {
        return (m25547E2().m14582l0() == null || m25547E2().m14597r0() == null || !m25547E2().m14597r0().c(qib0.b0.a.userId())) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    private boolean m20096r4() {
        return m25547E2().m14536V0();
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ c m20097A4(BLiveFanBase bLiveFanBase, m6g m6gVar) {
        this.f17037j = m6gVar;
        ((y6g) ((bwr) this).viewModel).m26397T(m6gVar);
        return LivingNormalApiProvider.m4658N4(bLiveFanBase.id);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m20098B4(qnq qnqVar, BLiveJoinFanBaseContent bLiveJoinFanBaseContent, BLiveEnvelope bLiveEnvelope) {
        qnqVar.b().call("1");
        if (TextUtils.equals(bLiveJoinFanBaseContent.anchorId, ((DbObject) m25547E2().m14582l0()).id)) {
            m25547E2().m14584l2(bLiveEnvelope);
            m25548F2().GiftDialogEventGroup.reloadGift().j(900);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m20099C4(qnq qnqVar, Throwable th) {
        qnqVar.b().call("0");
        ((y6g) ((bwr) this).viewModel).m26393P();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m20100E4(dpq dpqVar) {
        if (dpqVar != null) {
            m20109p4(dpqVar);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m20101F4(ym5 ym5Var) {
        if (ym5Var != null) {
            m20109p4(ym5Var);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ BLiveGiftItem m20102G4(q7g q7gVar) {
        return m20108o4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: H4 */
    public final void m20103H4() {
        User userM14582l0 = m25547E2().m14582l0();
        if (userM14582l0 == null) {
            return;
        }
        ((y6g) ((bwr) this).viewModel).m26396S(userM14582l0, m25552L2());
        String strUserId = qib0.b0.a.userId();
        final BLiveFanBase bLiveFanBaseB = m25547E2().m14597r0().b();
        if (bLiveFanBaseB != null) {
            duringCreated(LivingNormalApiProvider.m4622J4(bLiveFanBaseB.id, strUserId)).map(new w9j() { // from class: l.j7g
                public final Object call(Object obj) {
                    return p7g.m20078V3(bLiveFanBaseB, (BLiveEnvelope) obj);
                }
            }).flatMap(new w9j() { // from class: l.k7g
                public final Object call(Object obj) {
                    return this.f14227a.m20097A4(bLiveFanBaseB, (m6g) obj);
                }
            }).map(new w9j() { // from class: l.l7g
                public final Object call(Object obj) {
                    return p7g.m20079W3((BLiveEnvelope) obj);
                }
            }).subscribe(ffw.e(new e30() { // from class: l.m7g
                public final void call(Object obj) {
                    this.f15263a.m20117y4((gm0) obj);
                }
            }, new e30() { // from class: l.n7g
                public final void call(Object obj) {
                    this.f15856a.m20118z4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final void m20104I4(final qnq qnqVar, final BLiveJoinFanBaseContent bLiveJoinFanBaseContent, BLiveFanBaseDetail bLiveFanBaseDetail) {
        duringCreated(LivingNormalApiProvider.m4867k6(bLiveFanBaseDetail.id, bLiveJoinFanBaseContent.userId)).subscribe(ffw.e(new e30() { // from class: l.e7g
            public final void call(Object obj) {
                this.f9613a.m20098B4(qnqVar, bLiveJoinFanBaseContent, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.f7g
            public final void call(Object obj) {
                this.f10177a.m20099C4(qnqVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final void m20105K4() {
        m25548F2().FansClubEvent.showFansClubDialog().j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m20106m4() {
        if (!w220.m24291b()) {
            return false;
        }
        lsi0.w(R$string.f3648w9);
        return true;
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f17037j = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m20107n4(String str) {
        duringCreated(LivingNormalApiProvider.m4867k6(str, qib0.b0.a.userId())).subscribe(ffw.e(new e30() { // from class: l.c7g
            public final void call(Object obj) {
                this.f8524a.m20113u4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.d7g
            public final void call(Object obj) {
                this.f9088a.m20114v4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public final BLiveGiftItem m20108o4() {
        m6g m6gVar = this.f17037j;
        if (m6gVar == null || m6gVar.f15251a == null) {
            return null;
        }
        return ((ggv) ypv.l(fld0.c)).m(this.f17037j.f15251a.joinFanbase.giftId);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m20109p4(final htl htlVar) {
        final qnq qnqVarMo14807b = htlVar.mo14807b();
        if (qnqVarMo14807b == null || qnqVarMo14807b.a() == null) {
            return;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContentA = htlVar.mo14807b().a();
        m6g m6gVar = this.f17037j;
        if (m6gVar != null) {
            m20115w4(htlVar, m6gVar);
        } else {
            duringCreated(LivingNormalApiProvider.m4631K4(bLiveJoinFanBaseContentA)).subscribe(ffw.e(new e30() { // from class: l.o7g
                public final void call(Object obj) {
                    this.f16418a.m20115w4(htlVar, (m6g) obj);
                }
            }, new e30() { // from class: l.b7g
                public final void call(Object obj) {
                    this.f8019a.m20116x4(qnqVarMo14807b, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s4, reason: merged with bridge method [inline-methods] */
    public final void m20115w4(htl htlVar, m6g m6gVar) {
        this.f17037j = m6gVar;
        BLiveFanBaseDetail bLiveFanBaseDetail = m6gVar.f15251a;
        if (m20106m4()) {
            return;
        }
        if (bLiveFanBaseDetail != null) {
            htlVar.mo14806a(this, bLiveFanBaseDetail.joinFanbase.giftId, new C0741a(htlVar, bLiveFanBaseDetail));
        } else {
            htlVar.mo14807b().b().call("0");
            ((y6g) ((bwr) this).viewModel).m26393P();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m20111t() {
        super.t();
        if (m25547E2().m14495D0().contains("group_profile_fans")) {
            m20074J4();
        }
        duringCreated((c) m25548F2().FansClubEntryEvent.openEntry().g()).subscribe(ffw.d(new e30() { // from class: l.a7g
            public final void call(Object obj) {
                this.f7433a.m20073D4((Boolean) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBridgeImplEvent.fanBaseController().g()).subscribe(ffw.d(new e30() { // from class: l.g7g
            public final void call(Object obj) {
                this.f11296a.m20100E4((dpq) obj);
            }
        }));
        duringCreated((c) m25548F2().FansClubEntryEvent.companyFansGift().g()).subscribe(ffw.d(new e30() { // from class: l.h7g
            public final void call(Object obj) {
                this.f11905a.m20101F4((ym5) obj);
            }
        }));
        m14188d3(q7g.class, new w9j() { // from class: l.i7g
            public final Object call(Object obj) {
                return this.f13087a.m20102G4((q7g) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX INFO: renamed from: t4 */
    public void m20112t4() {
        User userM14582l0 = m25547E2().m14582l0();
        m6g m6gVar = this.f17037j;
        if (m6gVar == null || m6gVar.f15251a == null || userM14582l0 == null) {
            return;
        }
        if (!userM14582l0.matchedOrFollowed()) {
            m25547E2().m14558d0(true, mo21430R2(), "fanbase_entry");
        }
        if (m20106m4()) {
            return;
        }
        m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10983u(this.f17037j.f15251a.joinFanbase.giftId, new C0742b(), 1, "fans_club", "join_club", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))).m10982t());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.ho2] */
    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m20113u4(BLiveEnvelope bLiveEnvelope) {
        ((y6g) ((bwr) this).viewModel).m26394Q();
        m25547E2().m14584l2(bLiveEnvelope);
        ((y6g) ((bwr) this).viewModel).m5217q(null);
        m20105K4();
        m25548F2().GiftDialogEventGroup.reloadGift().j(900);
        if (m25547E2().m14495D0().contains("group_profile_fans")) {
            m14207z3(500L, new RunnableC0743c());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m20114v4(Throwable th) {
        ((y6g) ((bwr) this).viewModel).m26393P();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m20116x4(qnq qnqVar, Throwable th) {
        qnqVar.b().call("0");
        ((y6g) ((bwr) this).viewModel).m26393P();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m20117y4(gm0 gm0Var) {
        ((y6g) ((bwr) this).viewModel).m26398U(gm0Var, this.f17037j);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m20118z4(Throwable th) {
        ((y6g) ((bwr) this).viewModel).m26395R(th);
    }

    /* JADX INFO: renamed from: l.p7g$b */
    public class C0742b implements zfv.C0940a.a {
        public C0742b() {
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: a */
        public void mo5855a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            p7g p7gVar = p7g.this;
            p7gVar.m20107n4(p7gVar.f17037j.f15251a.id);
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: c */
        public void mo5857c() {
            ((y6g) ((bwr) p7g.this).viewModel).m26393P();
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: b */
        public void mo5856b() {
        }
    }
}
