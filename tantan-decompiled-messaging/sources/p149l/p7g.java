package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class p7g extends x6s<ho2, y6g> {

    /* JADX INFO: renamed from: j */
    public m6g f147502j;

    /* JADX INFO: renamed from: l.p7g$a */
    public class C19149a implements zfv.C21687a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ htl f147503a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveFanBaseDetail f147504b;

        public C19149a(htl htlVar, BLiveFanBaseDetail bLiveFanBaseDetail) {
            this.f147503a = htlVar;
            this.f147504b = bLiveFanBaseDetail;
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            p7g.this.m167736I4(this.f147503a.mo112923b(), this.f147503a.mo112923b().m175686a(), this.f147504b);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
            this.f147503a.mo112923b().m175687b().call("0");
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            ((y6g) p7g.this.viewModel).m213121P();
            this.f147503a.mo112923b().m175687b().call("0");
        }
    }

    /* JADX INFO: renamed from: l.p7g$c */
    public class RunnableC19151c implements Runnable {
        public RunnableC19151c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p7g.this.m206028F2().FansGroupEvent.showApplyDialog().mo172463j("");
        }
    }

    public p7g(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new y6g(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m167705D4(Boolean bool) {
        if (!bool.booleanValue()) {
            ((y6g) this.viewModel).m71839q(null);
            return;
        }
        if (m206032L2()) {
            m206028F2().FansClubEvent.showFansClubDialog().mo172463j(Boolean.TRUE);
        } else if (m167728r4()) {
            if (m167727q4()) {
                m206028F2().FansClubEvent.showFansClubDialog().mo172463j(Boolean.TRUE);
            } else {
                m167706J4();
            }
        }
    }

    /* JADX INFO: renamed from: J4 */
    private void m167706J4() {
        ((y6g) this.viewModel).m71834E();
        m167735H4();
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ m6g m167710V3(BLiveFanBase bLiveFanBase, BLiveEnvelope bLiveEnvelope) {
        return new m6g(bLiveEnvelope, bLiveFanBase.f44363id);
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ gm0 m167711W3(BLiveEnvelope bLiveEnvelope) {
        return new gm0(bLiveEnvelope);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2] */
    /* JADX INFO: renamed from: q4 */
    private boolean m167727q4() {
        return (m206027E2().m132146l0() == null || m206027E2().m132161r0() == null || !m206027E2().m132161r0().m129238c(qib0.f154713b0.f139230a.userId())) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    private boolean m167728r4() {
        return m206027E2().mo132100V0();
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ C22306c m167729A4(BLiveFanBase bLiveFanBase, m6g m6gVar) {
        this.f147502j = m6gVar;
        ((y6g) this.viewModel).m213125T(m6gVar);
        return LivingNormalApiProvider.m71292N4(bLiveFanBase.f44363id);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m167730B4(qnq qnqVar, BLiveJoinFanBaseContent bLiveJoinFanBaseContent, BLiveEnvelope bLiveEnvelope) {
        qnqVar.m175687b().call("1");
        if (TextUtils.equals(bLiveJoinFanBaseContent.anchorId, m206027E2().m132146l0().f56011id)) {
            m206027E2().m132148l2(bLiveEnvelope);
            m206028F2().GiftDialogEventGroup.reloadGift().mo172463j(900);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m167731C4(qnq qnqVar, Throwable th) {
        qnqVar.m175687b().call("0");
        ((y6g) this.viewModel).m213121P();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m167732E4(dpq dpqVar) {
        if (dpqVar != null) {
            m167741p4(dpqVar);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m167733F4(ym5 ym5Var) {
        if (ym5Var != null) {
            m167741p4(ym5Var);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ BLiveGiftItem m167734G4(q7g q7gVar) {
        return m167740o4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: H4 */
    public final void m167735H4() {
        User userM132146l0 = m206027E2().m132146l0();
        if (userM132146l0 == null) {
            return;
        }
        ((y6g) this.viewModel).m213124S(userM132146l0, m206032L2());
        String strUserId = qib0.f154713b0.f139230a.userId();
        final BLiveFanBase bLiveFanBaseM129237b = m206027E2().m132161r0().m129237b();
        if (bLiveFanBaseM129237b != null) {
            duringCreated(LivingNormalApiProvider.m71256J4(bLiveFanBaseM129237b.f44363id, strUserId)).map(new w9j() { // from class: l.j7g
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return p7g.m167710V3(bLiveFanBaseM129237b, (BLiveEnvelope) obj);
                }
            }).flatMap(new w9j() { // from class: l.k7g
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f121573a.m167729A4(bLiveFanBaseM129237b, (m6g) obj);
                }
            }).map(new w9j() { // from class: l.l7g
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return p7g.m167711W3((BLiveEnvelope) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.m7g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131825a.m167748y4((gm0) obj);
                }
            }, new e30() { // from class: l.n7g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f137504a.m167749z4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final void m167736I4(final qnq qnqVar, final BLiveJoinFanBaseContent bLiveJoinFanBaseContent, BLiveFanBaseDetail bLiveFanBaseDetail) {
        duringCreated(LivingNormalApiProvider.m71501k6(bLiveFanBaseDetail.f44364id, bLiveJoinFanBaseContent.userId)).subscribe(ffw.m121194e(new e30() { // from class: l.e7g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89706a.m167730B4(qnqVar, bLiveJoinFanBaseContent, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.f7g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96260a.m167731C4(qnqVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final void m167737K4() {
        m206028F2().FansClubEvent.showFansClubDialog().mo172463j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m167738m4() {
        if (!w220.m201015b()) {
            return false;
        }
        lsi0.m151593w(R$string.f47606w9);
        return true;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f147502j = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m167739n4(String str) {
        duringCreated(LivingNormalApiProvider.m71501k6(str, qib0.f154713b0.f139230a.userId())).subscribe(ffw.m121194e(new e30() { // from class: l.c7g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79613a.m167744u4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.d7g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84741a.m167745v4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public final BLiveGiftItem m167740o4() {
        m6g m6gVar = this.f147502j;
        if (m6gVar == null || m6gVar.f131680a == null) {
            return null;
        }
        return ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(this.f147502j.f131680a.joinFanbase.giftId);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m167741p4(final htl htlVar) {
        final qnq qnqVarMo112923b = htlVar.mo112923b();
        if (qnqVarMo112923b == null || qnqVarMo112923b.m175686a() == null) {
            return;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContentM175686a = htlVar.mo112923b().m175686a();
        m6g m6gVar = this.f147502j;
        if (m6gVar != null) {
            m167746w4(htlVar, m6gVar);
        } else {
            duringCreated(LivingNormalApiProvider.m71265K4(bLiveJoinFanBaseContentM175686a)).subscribe(ffw.m121194e(new e30() { // from class: l.o7g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f142489a.m167746w4(htlVar, (m6g) obj);
                }
            }, new e30() { // from class: l.b7g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f73969a.m167747x4(qnqVarMo112923b, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s4, reason: merged with bridge method [inline-methods] */
    public final void m167746w4(htl htlVar, m6g m6gVar) {
        this.f147502j = m6gVar;
        BLiveFanBaseDetail bLiveFanBaseDetail = m6gVar.f131680a;
        if (m167738m4()) {
            return;
        }
        if (bLiveFanBaseDetail != null) {
            htlVar.mo112922a(this, bLiveFanBaseDetail.joinFanbase.giftId, new C19149a(htlVar, bLiveFanBaseDetail));
        } else {
            htlVar.mo112923b().m175687b().call("0");
            ((y6g) this.viewModel).m213121P();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (m206027E2().m132060D0().contains("group_profile_fans")) {
            m167706J4();
        }
        duringCreated(m206028F2().FansClubEntryEvent.openEntry().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.a7g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67921a.m167705D4((Boolean) obj);
            }
        }));
        duringCreated(m206028F2().LiveBridgeImplEvent.fanBaseController().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.g7g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101380a.m167732E4((dpq) obj);
            }
        }));
        duringCreated(m206028F2().FansClubEntryEvent.companyFansGift().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.h7g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106272a.m167733F4((ym5) obj);
            }
        }));
        m129301d3(q7g.class, new w9j() { // from class: l.i7g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f111882a.m167734G4((q7g) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX INFO: renamed from: t4 */
    public void m167743t4() {
        User userM132146l0 = m206027E2().m132146l0();
        m6g m6gVar = this.f147502j;
        if (m6gVar == null || m6gVar.f131680a == null || userM132146l0 == null) {
            return;
        }
        if (!userM132146l0.matchedOrFollowed()) {
            m206027E2().m132122d0(true, mo77274R2(), "fanbase_entry");
        }
        if (m167738m4()) {
            return;
        }
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106530u(this.f147502j.f131680a.joinFanbase.giftId, new C19150b(), 1, "fans_club", "join_club", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))).m106529t());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.ho2] */
    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m167744u4(BLiveEnvelope bLiveEnvelope) {
        ((y6g) this.viewModel).m213122Q();
        m206027E2().m132148l2(bLiveEnvelope);
        ((y6g) this.viewModel).m71839q(null);
        m167737K4();
        m206028F2().GiftDialogEventGroup.reloadGift().mo172463j(900);
        if (m206027E2().m132060D0().contains("group_profile_fans")) {
            m129320z3(500L, new RunnableC19151c());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m167745v4(Throwable th) {
        ((y6g) this.viewModel).m213121P();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m167747x4(qnq qnqVar, Throwable th) {
        qnqVar.m175687b().call("0");
        ((y6g) this.viewModel).m213121P();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m167748y4(gm0 gm0Var) {
        ((y6g) this.viewModel).m213126U(gm0Var, this.f147502j);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m167749z4(Throwable th) {
        ((y6g) this.viewModel).m213123R(th);
    }

    /* JADX INFO: renamed from: l.p7g$b */
    public class C19150b implements zfv.C21687a.a {
        public C19150b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            p7g p7gVar = p7g.this;
            p7gVar.m167739n4(p7gVar.f147502j.f131680a.f44364id);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            ((y6g) p7g.this.viewModel).m213121P();
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
        }
    }
}
