package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class d9g extends y8s<oo2, m8g> {

    /* JADX INFO: renamed from: j */
    public a8g f85768j;

    /* JADX INFO: renamed from: l.d9g$a */
    public class C16489a implements aiv.C15716a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vvl f85769a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveFanBaseDetail f85770b;

        public C16489a(vvl vvlVar, BLiveFanBaseDetail bLiveFanBaseDetail) {
            this.f85769a = vvlVar;
            this.f85770b = bLiveFanBaseDetail;
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            d9g.this.m115052I4(this.f85769a.mo111570b(), this.f85769a.mo111570b().m173249a(), this.f85770b);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
            this.f85769a.mo111570b().m173250b().call("0");
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            ((m8g) d9g.this.viewModel).m157369P();
            this.f85769a.mo111570b().m173250b().call("0");
        }
    }

    /* JADX INFO: renamed from: l.d9g$c */
    public class RunnableC16491c implements Runnable {
        public RunnableC16491c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d9g.this.m213811F2().FansGroupEvent.showApplyDialog().mo199273j("");
        }
    }

    public d9g(dum dumVar) {
        super(dumVar);
        mo52715C(new m8g(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m115021D4(Boolean bool) {
        if (!bool.booleanValue()) {
            ((m8g) this.viewModel).m73022q(null);
            return;
        }
        if (m213815L2()) {
            m213811F2().FansClubEvent.showFansClubDialog().mo199273j(Boolean.TRUE);
        } else if (m115044r4()) {
            if (m115043q4()) {
                m213811F2().FansClubEvent.showFansClubDialog().mo199273j(Boolean.TRUE);
            } else {
                m115022J4();
            }
        }
    }

    /* JADX INFO: renamed from: J4 */
    private void m115022J4() {
        ((m8g) this.viewModel).m73017E();
        m115051H4();
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ a8g m115026V3(BLiveFanBase bLiveFanBase, BLiveEnvelope bLiveEnvelope) {
        return new a8g(bLiveEnvelope, bLiveFanBase.f45211id);
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ cm0 m115027W3(BLiveEnvelope bLiveEnvelope) {
        return new cm0(bLiveEnvelope);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.oo2] */
    /* JADX INFO: renamed from: q4 */
    private boolean m115043q4() {
        return (m213810E2().m168532l0() == null || m213810E2().m168546r0() == null || !m213810E2().m168546r0().m199847c(uqb0.f180396b0.f170324a.userId())) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: r4 */
    private boolean m115044r4() {
        return m213810E2().mo168486V0();
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ C22421c m115045A4(BLiveFanBase bLiveFanBase, a8g a8gVar) {
        this.f85768j = a8gVar;
        ((m8g) this.viewModel).m157373T(a8gVar);
        return LivingNormalApiProvider.m72475N4(bLiveFanBase.f45211id);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m115046B4(ppq ppqVar, BLiveJoinFanBaseContent bLiveJoinFanBaseContent, BLiveEnvelope bLiveEnvelope) {
        ppqVar.m173250b().call("1");
        if (TextUtils.equals(bLiveJoinFanBaseContent.anchorId, m213810E2().m168532l0().f56859id)) {
            m213810E2().m168534l2(bLiveEnvelope);
            m213811F2().GiftDialogEventGroup.reloadGift().mo199273j(900);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m115047C4(ppq ppqVar, Throwable th) {
        ppqVar.m173250b().call("0");
        ((m8g) this.viewModel).m157369P();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m115048E4(drq drqVar) {
        if (drqVar != null) {
            m115057p4(drqVar);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m115049F4(co5 co5Var) {
        if (co5Var != null) {
            m115057p4(co5Var);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ BLiveGiftItem m115050G4(e9g e9gVar) {
        return m115056o4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX INFO: renamed from: H4 */
    public final void m115051H4() {
        User userM168532l0 = m213810E2().m168532l0();
        if (userM168532l0 == null) {
            return;
        }
        ((m8g) this.viewModel).m157372S(userM168532l0, m213815L2());
        String strUserId = uqb0.f180396b0.f170324a.userId();
        final BLiveFanBase bLiveFanBaseM199846b = m213810E2().m168546r0().m199846b();
        if (bLiveFanBaseM199846b != null) {
            duringCreated(LivingNormalApiProvider.m72439J4(bLiveFanBaseM199846b.f45211id, strUserId)).map(new qcj() { // from class: l.x8g
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return d9g.m115026V3(bLiveFanBaseM199846b, (BLiveEnvelope) obj);
                }
            }).flatMap(new qcj() { // from class: l.y8g
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f198001a.m115045A4(bLiveFanBaseM199846b, (a8g) obj);
                }
            }).map(new qcj() { // from class: l.z8g
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return d9g.m115027W3((BLiveEnvelope) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.a9g
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f69041a.m115064y4((cm0) obj);
                }
            }, new y20() { // from class: l.b9g
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f75576a.m115065z4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final void m115052I4(final ppq ppqVar, final BLiveJoinFanBaseContent bLiveJoinFanBaseContent, BLiveFanBaseDetail bLiveFanBaseDetail) {
        duringCreated(LivingNormalApiProvider.m72684k6(bLiveFanBaseDetail.f45212id, bLiveJoinFanBaseContent.userId)).subscribe(dhw.m115826e(new y20() { // from class: l.s8g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166818a.m115046B4(ppqVar, bLiveJoinFanBaseContent, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.t8g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172531a.m115047C4(ppqVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final void m115053K4() {
        m213811F2().FansClubEvent.showFansClubDialog().mo199273j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m115054m4() {
        if (!eb20.m120149b()) {
            return false;
        }
        o1j0.m165649w(R$string.f48454w9);
        return true;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f85768j = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m115055n4(String str) {
        duringCreated(LivingNormalApiProvider.m72684k6(str, uqb0.f180396b0.f170324a.userId())).subscribe(dhw.m115826e(new y20() { // from class: l.q8g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156108a.m115060u4((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.r8g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161708a.m115061v4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public final BLiveGiftItem m115056o4() {
        a8g a8gVar = this.f85768j;
        if (a8gVar == null || a8gVar.f68918a == null) {
            return null;
        }
        return ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(this.f85768j.f68918a.joinFanbase.giftId);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m115057p4(final vvl vvlVar) {
        final ppq ppqVarMo111570b = vvlVar.mo111570b();
        if (ppqVarMo111570b == null || ppqVarMo111570b.m173249a() == null) {
            return;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContentM173249a = vvlVar.mo111570b().m173249a();
        a8g a8gVar = this.f85768j;
        if (a8gVar != null) {
            m115062w4(vvlVar, a8gVar);
        } else {
            duringCreated(LivingNormalApiProvider.m72448K4(bLiveJoinFanBaseContentM173249a)).subscribe(dhw.m115826e(new y20() { // from class: l.c9g
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f80482a.m115062w4(vvlVar, (a8g) obj);
                }
            }, new y20() { // from class: l.p8g
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151025a.m115063x4(ppqVarMo111570b, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s4, reason: merged with bridge method [inline-methods] */
    public final void m115062w4(vvl vvlVar, a8g a8gVar) {
        this.f85768j = a8gVar;
        BLiveFanBaseDetail bLiveFanBaseDetail = a8gVar.f68918a;
        if (m115054m4()) {
            return;
        }
        if (bLiveFanBaseDetail != null) {
            vvlVar.mo111569a(this, bLiveFanBaseDetail.joinFanbase.giftId, new C16489a(vvlVar, bLiveFanBaseDetail));
        } else {
            vvlVar.mo111570b().m173250b().call("0");
            ((m8g) this.viewModel).m157369P();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (m213810E2().m168449D0().contains("group_profile_fans")) {
            m115022J4();
        }
        duringCreated(m213811F2().FansClubEntryEvent.openEntry().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.o8g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145410a.m115021D4((Boolean) obj);
            }
        }));
        duringCreated(m213811F2().LiveBridgeImplEvent.fanBaseController().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.u8g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178040a.m115048E4((drq) obj);
            }
        }));
        duringCreated(m213811F2().FansClubEntryEvent.companyFansGift().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.v8g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182874a.m115049F4((co5) obj);
            }
        }));
        m138860d3(e9g.class, new qcj() { // from class: l.w8g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187852a.m115050G4((e9g) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2] */
    /* JADX INFO: renamed from: t4 */
    public void m115059t4() {
        User userM168532l0 = m213810E2().m168532l0();
        a8g a8gVar = this.f85768j;
        if (a8gVar == null || a8gVar.f68918a == null || userM168532l0 == null) {
            return;
        }
        if (!userM168532l0.matchedOrFollowed()) {
            m213810E2().m168508d0(true, mo78457R2(), "fanbase_entry");
        }
        if (m115054m4()) {
            return;
        }
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136084u(this.f85768j.f68918a.joinFanbase.giftId, new C16490b(), 1, "fans_club", "join_club", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))).m136083t());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.oo2] */
    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m115060u4(BLiveEnvelope bLiveEnvelope) {
        ((m8g) this.viewModel).m157370Q();
        m213810E2().m168534l2(bLiveEnvelope);
        ((m8g) this.viewModel).m73022q(null);
        m115053K4();
        m213811F2().GiftDialogEventGroup.reloadGift().mo199273j(900);
        if (m213810E2().m168449D0().contains("group_profile_fans")) {
            m138879z3(500L, new RunnableC16491c());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m115061v4(Throwable th) {
        ((m8g) this.viewModel).m157369P();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m115063x4(ppq ppqVar, Throwable th) {
        ppqVar.m173250b().call("0");
        ((m8g) this.viewModel).m157369P();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m115064y4(cm0 cm0Var) {
        ((m8g) this.viewModel).m157374U(cm0Var, this.f85768j);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m115065z4(Throwable th) {
        ((m8g) this.viewModel).m157371R(th);
    }

    /* JADX INFO: renamed from: l.d9g$b */
    public class C16490b implements aiv.C15716a.a {
        public C16490b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            d9g d9gVar = d9g.this;
            d9gVar.m115055n4(d9gVar.f85768j.f68918a.f45212id);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            ((m8g) d9g.this.viewModel).m157369P();
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
        }
    }
}
