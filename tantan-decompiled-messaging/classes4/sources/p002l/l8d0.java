package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveOwner;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashSet;
import java.util.UUID;
import l.e30;
import l.e51;
import l.ffw;
import l.fld0;
import l.h5j0;
import l.h7d0;
import l.hdv;
import l.hfw;
import l.j760;
import l.jo0;
import l.jq2;
import l.kht;
import l.lsi0;
import l.mbh0;
import l.mqi0;
import l.r610;
import l.r8d0;
import l.s7m;
import l.uxi;
import l.vdt;
import l.vwb;
import l.w9j;
import l.wq2;
import l.ypv;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l8d0 extends jq2<o8d0> {

    /* JADX INFO: renamed from: a */
    public final BLiveAbsData f14717a;

    /* JADX INFO: renamed from: b */
    public String f14718b;

    /* JADX INFO: renamed from: c */
    public final zgt f14719c;

    /* JADX INFO: renamed from: d */
    public final aht f14720d;

    /* JADX INFO: renamed from: e */
    public final String f14721e;

    /* JADX INFO: renamed from: f */
    public final x7d0 f14722f;

    /* JADX INFO: renamed from: g */
    public final mbd0 f14723g;

    /* JADX INFO: renamed from: h */
    public ho2 f14724h;

    /* JADX INFO: renamed from: i */
    public final RoomFrag f14725i;

    /* JADX INFO: renamed from: j */
    public a8s f14726j;

    /* JADX INFO: renamed from: k */
    public btk f14727k;

    /* JADX INFO: renamed from: l */
    public long f14728l;

    /* JADX INFO: renamed from: m */
    public boolean f14729m;

    /* JADX INFO: renamed from: n */
    public boolean f14730n;

    /* JADX INFO: renamed from: o */
    public z1j f14731o;

    /* JADX INFO: renamed from: p */
    public final boolean f14732p;

    public l8d0(RoomFrag roomFrag, ho2 ho2Var, AudienceStartData audienceStartData) {
        super(roomFrag);
        this.f14725i = roomFrag;
        this.f14724h = ho2Var;
        BLiveAbsData bLiveAbsData = audienceStartData.live;
        this.f14717a = bLiveAbsData;
        String str = audienceStartData.category;
        this.f14721e = str;
        this.f14718b = audienceStartData.traceId;
        this.f14732p = audienceStartData.handleEnterRoomResult;
        zgt zgtVar = new zgt(audienceStartData.source);
        this.f14719c = zgtVar;
        zgtVar.m27360t(audienceStartData.showSignInDialog);
        zgtVar.m27357q(audienceStartData.open);
        zgtVar.m27358r(bLiveAbsData.getRecommendCategoryForTrack());
        zgtVar.m27363w(audienceStartData.voiceEnterType);
        zgtVar.m27354n(audienceStartData.liveSchema);
        zgtVar.m27356p(audienceStartData.isOfficialShowAnchor);
        aht ahtVar = new aht();
        this.f14720d = ahtVar;
        this.f14722f = new x7d0(roomFrag, bLiveAbsData, zgtVar);
        this.f14726j = new a8s(roomFrag, this, zgtVar);
        this.f14727k = new btk();
        this.f14731o = new z1j(roomFrag, str, audienceStartData);
        mbd0 mbd0Var = new mbd0(this, roomFrag, audienceStartData, zgtVar, ahtVar);
        this.f14723g = mbd0Var;
        mbd0Var.m17810m(ho2Var);
        hfw.a("[live]push", zgtVar.f23406b);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m17052o0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public String m17054A0() {
        return this.f14719c.f23406b;
    }

    /* JADX INFO: renamed from: B1 */
    public void m17055B1(boolean z, LiveScrollViewContainer liveScrollViewContainer, boolean z2, JumpRoomData jumpRoomData) {
        h5j0.INSTANCE.d("live_swipe_in_room_rtc");
        this.f14726j.m9449a();
        if (jumpRoomData != null) {
            m17111z1(jumpRoomData, liveScrollViewContainer);
            return;
        }
        j760<BLiveAbsData, JumpRoomData> j760VarMo14441c = this.f14722f.m25727q().mo14441c(z);
        BLiveAbsData bLiveAbsDataM25728r = this.f14722f.m25728r();
        BLiveAbsData bLiveAbsData = (BLiveAbsData) j760VarMo14441c.a;
        if (bLiveAbsData == null) {
            return;
        }
        Object obj = j760VarMo14441c.b;
        AbstractC0485a6 abstractC0485a6M17111z1 = obj != null ? m17111z1((JumpRoomData) obj, liveScrollViewContainer) : m17111z1(new JumpRoomData.C0350a().m6549o(bLiveAbsData).m6555u(this.f14719c.m27343c()).m6548n(JumpRoomType.USER_SWIPE).m6547m(), liveScrollViewContainer);
        if (z2) {
            return;
        }
        abstractC0485a6M17111z1.m25548F2().AvatarEvent.onScrollNext().j(vwb.Y(Boolean.valueOf(z), bLiveAbsData.room.id));
        if (bLiveAbsDataM25728r == null) {
            return;
        }
        zcu.f(kht.c().m(bLiveAbsDataM25728r, bLiveAbsData).q(this.f14719c.m27347g()).s(this.f14719c.f23406b).u(this.f14719c.m27343c()).w(z ? "up" : "down").r(this.f14722f.m25717B(bLiveAbsData.id)).x(this.f14719c.m27350j()).v(bLiveAbsData.getRecommendCategoryForTrack()).l(), pageId());
        m17059D1(bLiveAbsData, z ? "swipe_up" : "swipe_down", abstractC0485a6M17111z1.mo21430R2(), bLiveAbsDataM25728r);
    }

    /* JADX INFO: renamed from: C0 */
    public String m17056C0() {
        return this.f14721e;
    }

    /* JADX INFO: renamed from: C1 */
    public final void m17057C1(r8d0 r8d0Var) {
        kht.a aVarT = kht.c().r(0).x(this.f14719c.m27350j()).v(((wq2) r8d0Var).c.getRecommendCategoryForTrack()).s(this.f14719c.f23406b).u(this.f14719c.m27343c()).t(((wq2) r8d0Var).c.id);
        User user = ((wq2) r8d0Var).a;
        zcu.f(aVarT.n(user == null ? "" : ((DbObject) user).id).q(this.f14719c.m27347g()).w("default").l(), pageId());
    }

    /* JADX INFO: renamed from: D0 */
    public RightSideViewGroup.d m17058D0() {
        return ((o8d0) ((jq2) this).viewModel).m19300k();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m17059D1(BLiveAbsData bLiveAbsData, String str, String str2, BLiveAbsData bLiveAbsData2) {
        h7d0.a aVarL = h7d0.x().b(bLiveAbsData).w(str).l(this.f14722f.m25717B(bLiveAbsData.id));
        BLiveOwner bLiveOwner = bLiveAbsData2.anchor;
        if (bLiveOwner != null) {
            aVarL.k(bLiveOwner.id);
        } else {
            CrashHelper.c(new NullPointerException("Null oldLive Anchor occurs in RoomFragPresenter.trackRoomEnter"));
        }
        zcu.h(aVarL.a(), str2);
    }

    /* JADX INFO: renamed from: E0 */
    public x7d0 m17060E0() {
        return this.f14722f;
    }

    /* JADX INFO: renamed from: E1 */
    public final void m17061E1(final String str) {
        ((o8d0) ((jq2) this).viewModel).m19308v(true);
        ((o8d0) ((jq2) this).viewModel).f16427a.post(new Runnable() { // from class: l.i8d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13102a.m17083d1(str);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public final String m17062F0() {
        BLiveAbsData bLiveAbsData;
        return (vdt.b(2) || (bLiveAbsData = this.f14717a) == null || !bLiveAbsData.isVoiceLive()) ? ypv.e.getString(R$string.f3419m0) : ypv.e.getString(R$string.f3441n0);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m17063F1() {
        if (this.f14717a.isVoiceLive()) {
            return false;
        }
        return this.f14727k.m10618e(this.f14717a);
    }

    /* JADX INFO: renamed from: G0 */
    public void m17064G0() {
        ((o8d0) ((jq2) this).viewModel).m19302m();
    }

    /* JADX INFO: renamed from: H0 */
    public void m17065H0(Act act) {
        m17095p1();
        duringCreated(ConnectivityReceiver.m()).map(new w9j() { // from class: l.e8d0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.j());
            }
        }).distinctUntilChanged().subscribe(ffw.e(new e30() { // from class: l.f8d0
            public final void call(Object obj) {
                this.f10187a.m17077W0((Boolean) obj);
            }
        }, new e30() { // from class: l.g8d0
            public final void call(Object obj) {
                l8d0.m17052o0((Throwable) obj);
            }
        }));
        if (ConnectivityReceiver.j()) {
            lsi0.B(m17062F0(), false, true);
        }
        act.addSwipeBackListener(new C0656a());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: I0 */
    public void m17066I0() {
        l8d0 l8d0Var;
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.d("enter_live_room");
        h5j0Var.d("enter_voice_room");
        m17109y0().mo9426m(true);
        if (this.f14717a.isVoiceLive()) {
            ((o8d0) ((jq2) this).viewModel).m19308v(false);
            ((o8d0) ((jq2) this).viewModel).m19309w(false, false);
        }
        BLiveAbsData bLiveAbsDataM17234j = m17109y0().m25547E2().m17234j();
        AbstractC0485a6 abstractC0485a6M17109y0 = m17109y0();
        if (!this.f14730n) {
            abstractC0485a6M17109y0.m9424h4(this.f14718b);
            abstractC0485a6M17109y0.mo9425i4();
            h5j0Var.c("enter_live_room", "roomPresenter.start()");
            h5j0Var.c("enter_voice_room", "roomPresenter.start()");
        }
        this.f14730n = true;
        BLiveAbsData bLiveAbsData = this.f14717a;
        if (bLiveAbsDataM17234j != null) {
            m17070O0(abstractC0485a6M17109y0, bLiveAbsData, new e30() { // from class: l.c8d0
                public final void call(Object obj) {
                    this.f8542a.m17090k1((r8d0) obj);
                }
            });
            l8d0Var = this;
        } else {
            l8d0Var = this;
            l8d0Var.m17069N0(abstractC0485a6M17109y0, true, bLiveAbsData, new e30() { // from class: l.d8d0
                public final void call(Object obj) {
                    this.f9111a.m17078X0((r8d0) obj);
                }
            }, new e30() { // from class: l.c8d0
                public final void call(Object obj) {
                    this.f8542a.m17090k1((r8d0) obj);
                }
            });
        }
        l8d0Var.m17097q1();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m17067J0(AbstractC0485a6 abstractC0485a6, BLiveAbsData bLiveAbsData, e30<r8d0> e30Var) {
        m17069N0(abstractC0485a6, false, bLiveAbsData, null, e30Var);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m17068L0(AbstractC0485a6 abstractC0485a6, BLiveAbsData bLiveAbsData, final boolean z) {
        m17067J0(abstractC0485a6, bLiveAbsData, new e30() { // from class: l.b8d0
            public final void call(Object obj) {
                this.f8031a.m17079Y0(z, (r8d0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m17069N0(AbstractC0485a6 abstractC0485a6, boolean z, BLiveAbsData bLiveAbsData, e30<r8d0> e30Var, e30<r8d0> e30Var2) {
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.c("live_enter_room_rtc", "RoomFragPresenter:initRoomInfo");
        h5j0Var.c("live_enter_room_cdn", "RoomFragPresenter:initRoomInfo");
        abstractC0485a6.mo9419c4(bLiveAbsData);
        h5j0Var.c("enter_live_room", "roomPresenter.quickPlay(live)");
        m17105u1(bLiveAbsData);
        abstractC0485a6.mo9409S3(bLiveAbsData, z, e30Var, e30Var2, this.f14732p);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m17070O0(AbstractC0485a6 abstractC0485a6, BLiveAbsData bLiveAbsData, e30<r8d0> e30Var) {
        abstractC0485a6.mo9419c4(bLiveAbsData);
        abstractC0485a6.mo9410T3(e30Var);
        m17105u1(bLiveAbsData);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m17071P0(int i) {
        return m17109y0().mo9411U3(i);
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m17072Q0() {
        AbstractC0485a6 abstractC0485a6M17109y0 = m17109y0();
        return abstractC0485a6M17109y0 != null && abstractC0485a6M17109y0.mo9412V3();
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m17073R0() {
        return ((o8d0) ((jq2) this).viewModel).m19304p();
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m17074S0() {
        return this.f14729m;
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m17075U0() {
        return this.f14722f.m25730t().m12171g() < ypv.k().n5();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: V0 */
    public void m17076V0(JumpRoomData jumpRoomData) {
        if (jumpRoomData == null) {
            return;
        }
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.CHANGE_SOURCE_WITH_BACK && TextUtils.isEmpty(jumpRoomData.getOldSource())) {
            jumpRoomData.setOldSource(m17109y0().m25547E2().mo14591o0());
        }
        if (!m17084e1(1) || "chatHall".equals(jumpRoomData.getSource())) {
            BLiveAbsData bLiveAbsDataM17234j = m17109y0().m25547E2().m17234j();
            if (jumpRoomData.getLive() == null || bLiveAbsDataM17234j == null || !jumpRoomData.getLive().id.equals(bLiveAbsDataM17234j.id)) {
                if (jumpRoomData.getLive() == null) {
                    BLiveVoice bLiveVoice = TextUtils.equals("voice-live", jumpRoomData.getLiveType()) ? new BLiveVoice() : new BLive();
                    ((BLiveAbsData) bLiveVoice).id = jumpRoomData.getToLiveId();
                    BLiveOwner bLiveOwner = new BLiveOwner();
                    ((BLiveAbsData) bLiveVoice).room = bLiveOwner;
                    bLiveOwner.id = jumpRoomData.getToRoomId();
                    if (TextUtils.isEmpty(jumpRoomData.getSource())) {
                        jumpRoomData.setSource(this.f14719c.f23406b);
                    }
                    jumpRoomData.setLive(bLiveVoice);
                    if (TextUtils.isEmpty(((BLiveAbsData) bLiveVoice).id) && TextUtils.isEmpty(((BLiveAbsData) bLiveVoice).room.id)) {
                        return;
                    }
                }
                ((o8d0) ((jq2) this).viewModel).m19306s(jumpRoomData);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m17077W0(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.B(m17062F0(), false, true);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m17078X0(r8d0 r8d0Var) {
        m17086g1(this.f14717a, r8d0Var);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m17079Y0(boolean z, r8d0 r8d0Var) {
        this.f14722f.m25735y(r8d0Var, z);
        if (z) {
            m17057C1(r8d0Var);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m17080a1(AbstractC0485a6 abstractC0485a6, iqv iqvVar) {
        abstractC0485a6.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(200).m25610e(this.f14719c.m27344d()).m25608c());
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m17081b1(hqv hqvVar) {
        BLiveSuggestLive bLiveSuggestLiveM14719l;
        int iMo14442d = this.f14722f.m25727q().mo14442d() + 1;
        if (iMo14442d < 0 || iMo14442d >= hqvVar.m14721n()) {
            HashSet hashSet = new HashSet();
            hashSet.add(this.f14722f.m25727q().mo14443e().id);
            if (this.f14722f.m25728r() != null) {
                hashSet.add(this.f14722f.m25728r().id);
            }
            bLiveSuggestLiveM14719l = hqvVar.m14719l(hashSet);
        } else {
            bLiveSuggestLiveM14719l = hqvVar.m14716i(iMo14442d);
        }
        if (bLiveSuggestLiveM14719l == null) {
            return;
        }
        this.f14726j.m9450b(bLiveSuggestLiveM14719l);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m17082c1(Bundle bundle) {
        ho2 ho2Var = this.f14724h;
        BLiveAbsData bLiveAbsDataM17234j = ho2Var == null ? this.f14717a : ho2Var.m17234j();
        this.f14723g.m17811n(((o8d0) ((jq2) this).viewModel).f16428b);
        this.f14723g.m17807j(bLiveAbsDataM17234j, ((o8d0) ((jq2) this).viewModel).m19299j());
        m17066I0();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m17083d1(String str) {
        if (vdt.b(2)) {
            fze0 fze0Var = new fze0();
            if (fze0Var.m13514b(str)) {
                ((o8d0) ((jq2) this).viewModel).m19309w(true, false);
                fze0Var.m13513a();
                return;
            }
            return;
        }
        lbp lbpVar = new lbp();
        if (lbpVar.m17127c(str)) {
            ((o8d0) ((jq2) this).viewModel).m19309w(true, false);
            lbpVar.m17125a();
        }
    }

    public void destroy() {
        m17109y0().mo5949n();
        this.f14731o.m27041s2();
        this.f14726j.m9451c();
        this.f14727k.m10616c();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m17084e1(int i) {
        return m17109y0().mo9414X3(i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.bsm] */
    /* JADX INFO: renamed from: f1 */
    public boolean m17085f1() {
        AbstractC0485a6 abstractC0485a6M17109y0 = m17109y0();
        if (abstractC0485a6M17109y0 == null) {
            return false;
        }
        if (r610.m((bsm) abstractC0485a6M17109y0.m17947K3())) {
            abstractC0485a6M17109y0.m25548F2().MultiCallEvent.openMatchStayDlg().j(Boolean.TRUE);
            return true;
        }
        if (m17084e1(2)) {
            return true;
        }
        if (((o8d0) ((jq2) this).viewModel).m19301l()) {
            m17064G0();
        }
        if (!m17063F1()) {
            return abstractC0485a6M17109y0.mo9415Y3(!m17074S0(), false);
        }
        m17108x1();
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m17086g1(BLiveAbsData bLiveAbsData, r8d0 r8d0Var) {
        if ((((wq2) r8d0Var).c instanceof BLive) && TextUtils.equals(bLiveAbsData.id, "-1")) {
            this.f14719c.m27359s(((wq2) r8d0Var).c.source);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.bsm] */
    /* JADX INFO: renamed from: h1 */
    public void m17087h1() {
        if (r610.m((bsm) m17109y0().m17947K3())) {
            m17109y0().m25548F2().MultiCallEvent.openMatchStayDlg().j(Boolean.TRUE);
            return;
        }
        if (m17084e1(2)) {
            return;
        }
        if (m17063F1()) {
            m17108x1();
        } else {
            if (m17109y0().mo9415Y3(!m17074S0(), true)) {
                return;
            }
            r610.H(m17109y0());
            m17104u0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: i1 */
    public final void m17088i1(r8d0 r8d0Var) {
        final AbstractC0485a6 abstractC0485a6M17109y0 = m17109y0();
        if (TextUtils.equals("DanmuChat", this.f14719c.m27346f())) {
            abstractC0485a6M17109y0.m25548F2().ChatEvent.chatInputClick().j(new wu4(true, "").m25482b("1"));
        } else {
            if (TextUtils.isEmpty(this.f14719c.m27344d())) {
                return;
            }
            duringCreated(abstractC0485a6M17109y0.m25547E2().m17248y()).take(1).subscribe(ffw.d(new e30() { // from class: l.a8d0
                public final void call(Object obj) {
                    this.f7443a.m17080a1(abstractC0485a6M17109y0, (iqv) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m17089j1() {
        if (!m17072Q0()) {
            x680.m25692a().m25696e(true);
        }
        if (m17109y0() != null) {
            m17109y0().mo9420d4("exit");
        }
        this.f14731o.destroy();
        long jO = mqi0.o();
        try {
            LiveWatchCounter.h().e(this.f14728l, jO);
        } catch (Exception e) {
            hfw.a("[live]leaveRoom", "startTime: " + this.f14728l + ",currentTime :" + jO);
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m17090k1(r8d0 r8d0Var) {
        if (((wq2) r8d0Var).c.isNormalLive() && !t7t.m22812d(((wq2) r8d0Var).c)) {
            m17106v1(this.f14719c.f23406b, r8d0Var);
            e51.H(act(), new Runnable() { // from class: l.h8d0
                @Override // java.lang.Runnable
                public final void run() {
                    LiveWatchCounter.h().o();
                }
            }, 3000L);
        }
        this.f14722f.m25735y(r8d0Var, true);
        m17088i1(r8d0Var);
        m17057C1(r8d0Var);
    }

    /* JADX INFO: renamed from: l1 */
    public void m17091l1() {
        if (m17054A0().contains("group_profile_fans") || ((o8d0) ((jq2) this).viewModel).m19304p()) {
            return;
        }
        duringCreated(this.f14722f.m25726p().mo9809g()).filter(new w9j() { // from class: l.j8d0
            public final Object call(Object obj) {
                return Boolean.valueOf(((hqv) obj).m14721n() > 0);
            }
        }).take(1).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.k8d0
            public final void call(Object obj) {
                this.f14246a.m17081b1((hqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public j760<Boolean, BLiveAbsData> m17092m1(boolean z) {
        return this.f14722f.m25727q().mo14439a(z);
    }

    /* JADX INFO: renamed from: n1 */
    public void m17093n1() {
        creates(new e30() { // from class: l.z7d0
            public final void call(Object obj) {
                this.f23293a.m17082c1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public void m17094o1(boolean z) {
        BLiveAbsData bLiveAbsDataMo14440b = this.f14722f.m25727q().mo14440b(z);
        if (bLiveAbsDataMo14440b == null || !bLiveAbsDataMo14440b.isLiving()) {
            return;
        }
        if (((o8d0) ((jq2) this).viewModel).m19297i().getPresenter() == null || !((o8d0) ((jq2) this).viewModel).m19297i().getPresenter().mo9413W3()) {
            this.f14723g.m17806i(bLiveAbsDataMo14440b, ((o8d0) ((jq2) this).viewModel).m19297i()).mo9418b4(z, bLiveAbsDataMo14440b);
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m17095p1() {
        BLiveAbsData bLiveAbsData = this.f14717a;
        if (bLiveAbsData == null || !bLiveAbsData.isNormalLive()) {
            return;
        }
        fld0 fld0Var = fld0.e;
        ((hdv) ypv.l(fld0Var)).b.put(Long.valueOf(mqi0.o()));
        if (((Long) ((hdv) ypv.l(fld0Var)).c.get()).longValue() == 0) {
            ((hdv) ypv.l(fld0Var)).c.put(Long.valueOf(mqi0.o()));
        }
    }

    public String pageId() {
        return this.f14719c.m27345e().equals("live") ? "p_user_live_room" : "p_user_audio_room";
    }

    /* JADX INFO: renamed from: q0 */
    public void m17096q0(RightSideViewGroup.c cVar) {
        ((o8d0) ((jq2) this).viewModel).m19295e(cVar);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m17097q1() {
        this.f14728l = mqi0.o();
    }

    /* JADX INFO: renamed from: r0 */
    public void m17098r0(r8d0 r8d0Var) {
        this.f14722f.m25723m(r8d0Var);
    }

    /* JADX INFO: renamed from: r1 */
    public void m17099r1() {
        AbstractC0485a6 presenter = ((o8d0) ((jq2) this).viewModel).m19297i().getPresenter();
        if (presenter != null) {
            presenter.mo9405N3();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m17100s0() {
        ((o8d0) ((jq2) this).viewModel).m19306s(null);
    }

    /* JADX INFO: renamed from: s1 */
    public void m17101s1(LiveScrollViewContainer liveScrollViewContainer, boolean z) {
        if (liveScrollViewContainer.getPresenter() != null) {
            liveScrollViewContainer.getPresenter().mo9420d4(z ? "click" : "swipe");
            liveScrollViewContainer.getPresenter().mo5949n();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m17102t0() {
        return m17109y0().mo9406O3();
    }

    /* JADX INFO: renamed from: t1 */
    public void m17103t1(RightSideViewGroup.c cVar) {
        ((o8d0) ((jq2) this).viewModel).m19307u(cVar);
    }

    /* JADX INFO: renamed from: u0 */
    public void m17104u0() {
        m17109y0().mo9407P3();
        this.f14725i.act().finish();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m17105u1(BLiveAbsData bLiveAbsData) {
        if (t7t.m22812d(bLiveAbsData)) {
            ((o8d0) ((jq2) this).viewModel).m19309w(false, false);
            ((o8d0) ((jq2) this).viewModel).m19308v(false);
            return;
        }
        boolean zIsNormalLive = bLiveAbsData.isNormalLive();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zIsNormalLive) {
            ((o8d0) s7mVar).m19308v(ypv.k().mb(this.f14719c.m27343c()));
        } else {
            ((o8d0) s7mVar).m19308v(false);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m17106v1(String str, r8d0 r8d0Var) {
        if (!TextUtils.equals("default", r8d0Var.b())) {
            boolean zEquals = TextUtils.equals("display", r8d0Var.b());
            s7m s7mVar = ((jq2) this).viewModel;
            if (zEquals) {
                ((o8d0) s7mVar).m19308v(true);
                ((o8d0) ((jq2) this).viewModel).m19309w(true, false);
                return;
            } else {
                ((o8d0) s7mVar).m19308v(true);
                ((o8d0) ((jq2) this).viewModel).m19309w(false, false);
                return;
            }
        }
        if (!vdt.b(2) && m17075U0()) {
            ((o8d0) ((jq2) this).viewModel).m19308v(false);
            return;
        }
        if (uxi.b(((wq2) r8d0Var).a, ((wq2) r8d0Var).d)) {
            return;
        }
        if (!ypv.k().mb(str) || m17109y0().m25551K2().m22224l(LiveDialogEnum.SIGN_IN)) {
            ((o8d0) ((jq2) this).viewModel).m19308v(false);
        } else {
            m17061E1(str);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public z1j m17107x0() {
        return this.f14731o;
    }

    /* JADX INFO: renamed from: x1 */
    public void m17108x1() {
        this.f14729m = true;
        ((o8d0) ((jq2) this).viewModel).m19311y(this.f14727k.f8350b);
    }

    /* JADX INFO: renamed from: y0 */
    public AbstractC0485a6 m17109y0() {
        return this.f14723g.m17804g();
    }

    /* JADX INFO: renamed from: z0 */
    public BLiveAbsData m17110z0() {
        return this.f14717a;
    }

    /* JADX INFO: renamed from: z1 */
    public final AbstractC0485a6 m17111z1(JumpRoomData jumpRoomData, LiveScrollViewContainer liveScrollViewContainer) {
        this.f14719c.m27360t(false);
        this.f14719c.m27352l();
        AbstractC0485a6 abstractC0485a6M17807j = this.f14723g.m17807j(jumpRoomData.getLive(), liveScrollViewContainer);
        if (jumpRoomData.getJumpRoomType().needChangeSource()) {
            String source = jumpRoomData.getSource();
            if (TextUtils.isEmpty(source)) {
                source = this.f14719c.m27343c();
            }
            abstractC0485a6M17807j.mo9421e4(jumpRoomData);
            this.f14719c.m27353m(source);
            abstractC0485a6M17807j.m9424h4(UUID.randomUUID().toString());
            abstractC0485a6M17807j.mo9425i4();
            this.f14722f.m25718C(jumpRoomData.getSource(), jumpRoomData.getLive());
            this.f14725i.m5172U4(this.f14722f, jumpRoomData.getSource());
            m17068L0(abstractC0485a6M17807j, jumpRoomData.getLive(), true);
        } else {
            abstractC0485a6M17807j.m9424h4(UUID.randomUUID().toString());
            abstractC0485a6M17807j.mo9425i4();
            m17068L0(abstractC0485a6M17807j, jumpRoomData.getLive(), false);
        }
        this.f14722f.m25736z(jumpRoomData);
        return abstractC0485a6M17807j;
    }

    /* JADX INFO: renamed from: l.l8d0$a */
    public class C0656a implements mbh0 {
        public C0656a() {
        }

        /* JADX INFO: renamed from: O */
        public void m17114O() {
            l8d0.this.m17109y0().mo9417a4();
        }

        /* JADX INFO: renamed from: E0 */
        public void m17113E0() {
        }

        /* JADX INFO: renamed from: Z */
        public void m17115Z() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m17112D0(boolean z, float f, int i) {
        }
    }
}
