package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class ogd0 extends ar2<rgd0> {

    /* JADX INFO: renamed from: a */
    public final BLiveAbsData f147212a;

    /* JADX INFO: renamed from: b */
    public String f147213b;

    /* JADX INFO: renamed from: c */
    public final ajt f147214c;

    /* JADX INFO: renamed from: d */
    public final bjt f147215d;

    /* JADX INFO: renamed from: e */
    public final String f147216e;

    /* JADX INFO: renamed from: f */
    public final agd0 f147217f;

    /* JADX INFO: renamed from: g */
    public final ojd0 f147218g;

    /* JADX INFO: renamed from: h */
    public oo2 f147219h;

    /* JADX INFO: renamed from: i */
    public final RoomFrag f147220i;

    /* JADX INFO: renamed from: j */
    public bas f147221j;

    /* JADX INFO: renamed from: k */
    public rvk f147222k;

    /* JADX INFO: renamed from: l */
    public long f147223l;

    /* JADX INFO: renamed from: m */
    public boolean f147224m;

    /* JADX INFO: renamed from: n */
    public boolean f147225n;

    /* JADX INFO: renamed from: o */
    public u4j f147226o;

    /* JADX INFO: renamed from: p */
    public final boolean f147227p;

    public ogd0(RoomFrag roomFrag, oo2 oo2Var, AudienceStartData audienceStartData) {
        super(roomFrag);
        this.f147220i = roomFrag;
        this.f147219h = oo2Var;
        BLiveAbsData bLiveAbsData = audienceStartData.live;
        this.f147212a = bLiveAbsData;
        String str = audienceStartData.category;
        this.f147216e = str;
        this.f147213b = audienceStartData.traceId;
        this.f147227p = audienceStartData.handleEnterRoomResult;
        ajt ajtVar = new ajt(audienceStartData.source);
        this.f147214c = ajtVar;
        ajtVar.m98473t(audienceStartData.showSignInDialog);
        ajtVar.m98470q(audienceStartData.open);
        ajtVar.m98471r(bLiveAbsData.getRecommendCategoryForTrack());
        ajtVar.m98476w(audienceStartData.voiceEnterType);
        ajtVar.m98467n(audienceStartData.liveSchema);
        ajtVar.m98469p(audienceStartData.isOfficialShowAnchor);
        bjt bjtVar = new bjt();
        this.f147215d = bjtVar;
        this.f147217f = new agd0(roomFrag, bLiveAbsData, ajtVar);
        this.f147221j = new bas(roomFrag, this, ajtVar);
        this.f147222k = new rvk();
        this.f147226o = new u4j(roomFrag, str, audienceStartData);
        ojd0 ojd0Var = new ojd0(this, roomFrag, audienceStartData, ajtVar, bjtVar);
        this.f147218g = ojd0Var;
        ojd0Var.m167859m(oo2Var);
        fhw.m125605a("[live]push", ajtVar.f71865b);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m167536o0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public String m167538A0() {
        return this.f147214c.f71865b;
    }

    /* JADX INFO: renamed from: B1 */
    public void m167539B1(boolean z, LiveScrollViewContainer liveScrollViewContainer, boolean z2, JumpRoomData jumpRoomData) {
        lej0.INSTANCE.m153910d("live_swipe_in_room_rtc");
        this.f147221j.m103229a();
        if (jumpRoomData != null) {
            m167595z1(jumpRoomData, liveScrollViewContainer);
            return;
        }
        pf60<BLiveAbsData, JumpRoomData> pf60VarMo150409c = this.f147217f.m97612q().mo150409c(z);
        BLiveAbsData bLiveAbsDataM97613r = this.f147217f.m97613r();
        BLiveAbsData bLiveAbsData = pf60VarMo150409c.f152156a;
        if (bLiveAbsData == null) {
            return;
        }
        JumpRoomData jumpRoomData2 = pf60VarMo150409c.f152157b;
        AbstractC21253x5 abstractC21253x5M167595z1 = jumpRoomData2 != null ? m167595z1(jumpRoomData2, liveScrollViewContainer) : m167595z1(new JumpRoomData.C12924a().m74209o(bLiveAbsData).m74215u(this.f147214c.m98456c()).m74208n(JumpRoomType.USER_SWIPE).m74207m(), liveScrollViewContainer);
        if (z2) {
            return;
        }
        abstractC21253x5M167595z1.m213811F2().AvatarEvent.onScrollNext().mo199273j(jyb.m147494Y(Boolean.valueOf(z), bLiveAbsData.room.f45267id));
        if (bLiveAbsDataM97613r == null) {
            return;
        }
        afu.m97557f(ljt.m154551c().m154566m(bLiveAbsDataM97613r, bLiveAbsData).m154570q(this.f147214c.m98460g()).m154572s(this.f147214c.f71865b).m154574u(this.f147214c.m98456c()).m154576w(z ? "up" : "down").m154571r(this.f147217f.m97602B(bLiveAbsData.f45171id)).m154577x(this.f147214c.m98463j()).m154575v(bLiveAbsData.getRecommendCategoryForTrack()).m154565l(), pageId());
        m167543D1(bLiveAbsData, z ? "swipe_up" : "swipe_down", abstractC21253x5M167595z1.mo78457R2(), bLiveAbsDataM97613r);
    }

    /* JADX INFO: renamed from: C0 */
    public String m167540C0() {
        return this.f147216e;
    }

    /* JADX INFO: renamed from: C1 */
    public final void m167541C1(ugd0 ugd0Var) {
        ljt.C18404a c18404aM154573t = ljt.m154551c().m154571r(0).m154577x(this.f147214c.m98463j()).m154575v(ugd0Var.f138293c.getRecommendCategoryForTrack()).m154572s(this.f147214c.f71865b).m154574u(this.f147214c.m98456c()).m154573t(ugd0Var.f138293c.f45171id);
        User user = ugd0Var.f138291a;
        afu.m97557f(c18404aM154573t.m154567n(user == null ? "" : user.f56859id).m154570q(this.f147214c.m98460g()).m154576w("default").m154565l(), pageId());
    }

    /* JADX INFO: renamed from: D0 */
    public RightSideViewGroup.C13103d m167542D0() {
        return ((rgd0) this.viewModel).m181414k();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m167543D1(BLiveAbsData bLiveAbsData, String str, String str2, BLiveAbsData bLiveAbsData2) {
        kfd0.C18147a c18147aM149403l = kfd0.m149385x().m149393b(bLiveAbsData).m149414w(str).m149403l(this.f147217f.m97602B(bLiveAbsData.f45171id));
        BLiveOwner bLiveOwner = bLiveAbsData2.anchor;
        if (bLiveOwner != null) {
            c18147aM149403l.m149402k(bLiveOwner.f45267id);
        } else {
            CrashHelper.m82479c(new NullPointerException("Null oldLive Anchor occurs in RoomFragPresenter.trackRoomEnter"));
        }
        afu.m97559h(c18147aM149403l.m149392a(), str2);
    }

    /* JADX INFO: renamed from: E0 */
    public agd0 m167544E0() {
        return this.f147217f;
    }

    /* JADX INFO: renamed from: E1 */
    public final void m167545E1(final String str) {
        ((rgd0) this.viewModel).m181422v(true);
        ((rgd0) this.viewModel).f162993a.post(new Runnable() { // from class: l.lgd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f131952a.m167567d1(str);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public final String m167546F0() {
        BLiveAbsData bLiveAbsData;
        return (wft.m206159b(2) || (bLiveAbsData = this.f147212a) == null || !bLiveAbsData.isVoiceLive()) ? zrv.f205803e.getString(R$string.f48225m0) : zrv.f205803e.getString(R$string.f48247n0);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m167547F1() {
        if (this.f147212a.isVoiceLive()) {
            return false;
        }
        return this.f147222k.m183272e(this.f147212a);
    }

    /* JADX INFO: renamed from: G0 */
    public void m167548G0() {
        ((rgd0) this.viewModel).m181416m();
    }

    /* JADX INFO: renamed from: H0 */
    public void m167549H0(Act act) {
        m167579p1();
        duringCreated(ConnectivityReceiver.m82473m()).map(new qcj() { // from class: l.hgd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82470j());
            }
        }).distinctUntilChanged().subscribe(dhw.m115826e(new y20() { // from class: l.igd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114777a.m167561W0((Boolean) obj);
            }
        }, new y20() { // from class: l.jgd0
            @Override // p153l.y20
            public final void call(Object obj) {
                ogd0.m167536o0((Throwable) obj);
            }
        }));
        if (ConnectivityReceiver.m82470j()) {
            o1j0.m165620B(m167546F0(), false, true);
        }
        act.addSwipeBackListener(new C19129a());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: I0 */
    public void m167550I0() {
        ogd0 ogd0Var;
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153910d("enter_live_room");
        lej0Var.m153910d("enter_voice_room");
        m167593y0().mo120628m(true);
        if (this.f147212a.isVoiceLive()) {
            ((rgd0) this.viewModel).m181422v(false);
            ((rgd0) this.viewModel).m181423w(false, false);
        }
        BLiveAbsData bLiveAbsDataMo183435j = m167593y0().m213810E2().mo183435j();
        AbstractC21253x5 abstractC21253x5M167593y0 = m167593y0();
        if (!this.f147225n) {
            abstractC21253x5M167593y0.m209353h4(this.f147213b);
            abstractC21253x5M167593y0.mo120627i4();
            lej0Var.m153909c("enter_live_room", "roomPresenter.start()");
            lej0Var.m153909c("enter_voice_room", "roomPresenter.start()");
        }
        this.f147225n = true;
        BLiveAbsData bLiveAbsData = this.f147212a;
        if (bLiveAbsDataMo183435j != null) {
            m167554O0(abstractC21253x5M167593y0, bLiveAbsData, new y20() { // from class: l.fgd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98922a.m167574k1((ugd0) obj);
                }
            });
            ogd0Var = this;
        } else {
            ogd0Var = this;
            ogd0Var.m167553N0(abstractC21253x5M167593y0, true, bLiveAbsData, new y20() { // from class: l.ggd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104014a.m167562X0((ugd0) obj);
                }
            }, new y20() { // from class: l.fgd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98922a.m167574k1((ugd0) obj);
                }
            });
        }
        ogd0Var.m167581q1();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m167551J0(AbstractC21253x5 abstractC21253x5, BLiveAbsData bLiveAbsData, y20<ugd0> y20Var) {
        m167553N0(abstractC21253x5, false, bLiveAbsData, null, y20Var);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m167552L0(AbstractC21253x5 abstractC21253x5, BLiveAbsData bLiveAbsData, final boolean z) {
        m167551J0(abstractC21253x5, bLiveAbsData, new y20() { // from class: l.egd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93918a.m167563Y0(z, (ugd0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m167553N0(AbstractC21253x5 abstractC21253x5, boolean z, BLiveAbsData bLiveAbsData, y20<ugd0> y20Var, y20<ugd0> y20Var2) {
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153909c("live_enter_room_rtc", "RoomFragPresenter:initRoomInfo");
        lej0Var.m153909c("live_enter_room_cdn", "RoomFragPresenter:initRoomInfo");
        abstractC21253x5.mo120623c4(bLiveAbsData);
        lej0Var.m153909c("enter_live_room", "roomPresenter.quickPlay(live)");
        m167589u1(bLiveAbsData);
        abstractC21253x5.mo120613S3(bLiveAbsData, z, y20Var, y20Var2, this.f147227p);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m167554O0(AbstractC21253x5 abstractC21253x5, BLiveAbsData bLiveAbsData, y20<ugd0> y20Var) {
        abstractC21253x5.mo120623c4(bLiveAbsData);
        abstractC21253x5.mo120614T3(y20Var);
        m167589u1(bLiveAbsData);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m167555P0(int i) {
        return m167593y0().mo120615U3(i);
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m167556Q0() {
        AbstractC21253x5 abstractC21253x5M167593y0 = m167593y0();
        return abstractC21253x5M167593y0 != null && abstractC21253x5M167593y0.mo120616V3();
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m167557R0() {
        return ((rgd0) this.viewModel).m181418p();
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m167558S0() {
        return this.f147224m;
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m167559U0() {
        return this.f147217f.m97615t().m199905g() < zrv.m221193k().m203683n5();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: V0 */
    public void m167560V0(JumpRoomData jumpRoomData) {
        if (jumpRoomData == null) {
            return;
        }
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.CHANGE_SOURCE_WITH_BACK && TextUtils.isEmpty(jumpRoomData.getOldSource())) {
            jumpRoomData.setOldSource(m167593y0().m213810E2().mo160117o0());
        }
        if (!m167568e1(1) || "chatHall".equals(jumpRoomData.getSource())) {
            BLiveAbsData bLiveAbsDataMo183435j = m167593y0().m213810E2().mo183435j();
            if (jumpRoomData.getLive() == null || bLiveAbsDataMo183435j == null || !jumpRoomData.getLive().f45171id.equals(bLiveAbsDataMo183435j.f45171id)) {
                if (jumpRoomData.getLive() == null) {
                    BLiveAbsData bLiveVoice = TextUtils.equals(BLiveAbsData.VOICE_LIVE, jumpRoomData.getLiveType()) ? new BLiveVoice() : new BLive();
                    bLiveVoice.f45171id = jumpRoomData.getToLiveId();
                    BLiveOwner bLiveOwner = new BLiveOwner();
                    bLiveVoice.room = bLiveOwner;
                    bLiveOwner.f45267id = jumpRoomData.getToRoomId();
                    if (TextUtils.isEmpty(jumpRoomData.getSource())) {
                        jumpRoomData.setSource(this.f147214c.f71865b);
                    }
                    jumpRoomData.setLive(bLiveVoice);
                    if (TextUtils.isEmpty(bLiveVoice.f45171id) && TextUtils.isEmpty(bLiveVoice.room.f45267id)) {
                        return;
                    }
                }
                ((rgd0) this.viewModel).m181420s(jumpRoomData);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m167561W0(Boolean bool) {
        if (bool.booleanValue()) {
            o1j0.m165620B(m167546F0(), false, true);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m167562X0(ugd0 ugd0Var) {
        m167570g1(this.f147212a, ugd0Var);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m167563Y0(boolean z, ugd0 ugd0Var) {
        this.f147217f.m97620y(ugd0Var, z);
        if (z) {
            m167541C1(ugd0Var);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m167564a1(AbstractC21253x5 abstractC21253x5, jsv jsvVar) {
        abstractC21253x5.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(this.f147214c.m98457d()).m103152c());
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m167565b1(isv isvVar) {
        BLiveSuggestLive bLiveSuggestLiveM141981l;
        int iMo150410d = this.f147217f.m97612q().mo150410d() + 1;
        if (iMo150410d < 0 || iMo150410d >= isvVar.m141983n()) {
            HashSet hashSet = new HashSet();
            hashSet.add(this.f147217f.m97612q().mo150411e().f45171id);
            if (this.f147217f.m97613r() != null) {
                hashSet.add(this.f147217f.m97613r().f45171id);
            }
            bLiveSuggestLiveM141981l = isvVar.m141981l(hashSet);
        } else {
            bLiveSuggestLiveM141981l = isvVar.m141978i(iMo150410d);
        }
        if (bLiveSuggestLiveM141981l == null) {
            return;
        }
        this.f147221j.m103230b(bLiveSuggestLiveM141981l);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m167566c1(Bundle bundle) {
        oo2 oo2Var = this.f147219h;
        BLiveAbsData bLiveAbsDataMo183435j = oo2Var == null ? this.f147212a : oo2Var.mo183435j();
        this.f147218g.m167860n(((rgd0) this.viewModel).f162994b);
        this.f147218g.m167856j(bLiveAbsDataMo183435j, ((rgd0) this.viewModel).m181413j());
        m167550I0();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m167567d1(String str) {
        if (wft.m206159b(2)) {
            m7f0 m7f0Var = new m7f0();
            if (m7f0Var.m157280b(str)) {
                ((rgd0) this.viewModel).m181423w(true, false);
                m7f0Var.m157279a();
                return;
            }
            return;
        }
        ldp ldpVar = new ldp();
        if (ldpVar.m153786c(str)) {
            ((rgd0) this.viewModel).m181423w(true, false);
            ldpVar.m153784a();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
        m167593y0().mo70300n();
        this.f147226o.mo120629s2();
        this.f147221j.m103231c();
        this.f147222k.m183270c();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m167568e1(int i) {
        return m167593y0().mo120618X3(i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.dum] */
    /* JADX INFO: renamed from: f1 */
    public boolean m167569f1() {
        AbstractC21253x5 abstractC21253x5M167593y0 = m167593y0();
        if (abstractC21253x5M167593y0 == null) {
            return false;
        }
        if (bf10.m103837m(abstractC21253x5M167593y0.m163462K3())) {
            abstractC21253x5M167593y0.m213811F2().MultiCallEvent.openMatchStayDlg().mo199273j(Boolean.TRUE);
            return true;
        }
        if (m167568e1(2)) {
            return true;
        }
        if (((rgd0) this.viewModel).m181415l()) {
            m167548G0();
        }
        if (!m167547F1()) {
            return abstractC21253x5M167593y0.mo120619Y3(!m167558S0(), false);
        }
        m167592x1();
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m167570g1(BLiveAbsData bLiveAbsData, ugd0 ugd0Var) {
        if ((ugd0Var.f138293c instanceof BLive) && TextUtils.equals(bLiveAbsData.f45171id, User.ID_TEAM_ACCOUNT)) {
            this.f147214c.m98472s(((BLive) ugd0Var.f138293c).source);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.dum] */
    /* JADX INFO: renamed from: h1 */
    public void m167571h1() {
        if (bf10.m103837m(m167593y0().m163462K3())) {
            m167593y0().m213811F2().MultiCallEvent.openMatchStayDlg().mo199273j(Boolean.TRUE);
            return;
        }
        if (m167568e1(2)) {
            return;
        }
        if (m167547F1()) {
            m167592x1();
        } else {
            if (m167593y0().mo120619Y3(!m167558S0(), true)) {
                return;
            }
            bf10.m103802H(m167593y0());
            m167588u0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: i1 */
    public final void m167572i1(ugd0 ugd0Var) {
        final AbstractC21253x5 abstractC21253x5M167593y0 = m167593y0();
        if (TextUtils.equals("DanmuChat", this.f147214c.m98459f())) {
            abstractC21253x5M167593y0.m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(true, "").m202992b("1"));
        } else {
            if (TextUtils.isEmpty(this.f147214c.m98457d())) {
                return;
            }
            duringCreated(abstractC21253x5M167593y0.m213810E2().mo183454y()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.dgd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88288a.m167564a1(abstractC21253x5M167593y0, (jsv) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m167573j1() {
        if (!m167556Q0()) {
            df80.m115507a().m115511e(true);
        }
        if (m167593y0() != null) {
            m167593y0().mo154499d4("exit");
        }
        this.f147226o.destroy();
        long jM174454o = pzi0.m174454o();
        try {
            LiveWatchCounter.m77513h().m77514e(this.f147223l, jM174454o);
        } catch (Exception e) {
            fhw.m125605a("[live]leaveRoom", "startTime: " + this.f147223l + ",currentTime :" + jM174454o);
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m167574k1(ugd0 ugd0Var) {
        if (ugd0Var.f138293c.isNormalLive() && !u9t.m195115d(ugd0Var.f138293c)) {
            m167590v1(this.f147214c.f71865b, ugd0Var);
            l51.m152888H(act(), new Runnable() { // from class: l.kgd0
                @Override // java.lang.Runnable
                public final void run() {
                    LiveWatchCounter.m77513h().m77523o();
                }
            }, 3000L);
        }
        this.f147217f.m97620y(ugd0Var, true);
        m167572i1(ugd0Var);
        m167541C1(ugd0Var);
    }

    /* JADX INFO: renamed from: l1 */
    public void m167575l1() {
        if (m167538A0().contains("group_profile_fans") || ((rgd0) this.viewModel).m181418p()) {
            return;
        }
        duringCreated(this.f147217f.m97611p().mo104857g()).filter(new qcj() { // from class: l.mgd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((isv) obj).m141983n() > 0);
            }
        }).take(1).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.ngd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141810a.m167565b1((isv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public pf60<Boolean, BLiveAbsData> m167576m1(boolean z) {
        return this.f147217f.m97612q().mo150407a(z);
    }

    /* JADX INFO: renamed from: n1 */
    public void m167577n1() {
        creates(new y20() { // from class: l.cgd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81662a.m167566c1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public void m167578o1(boolean z) {
        BLiveAbsData bLiveAbsDataMo150408b = this.f147217f.m97612q().mo150408b(z);
        if (bLiveAbsDataMo150408b == null || !bLiveAbsDataMo150408b.isLiving()) {
            return;
        }
        if (((rgd0) this.viewModel).m181412i().getPresenter() == null || !((rgd0) this.viewModel).m181412i().getPresenter().mo120617W3()) {
            this.f147218g.m167855i(bLiveAbsDataMo150408b, ((rgd0) this.viewModel).m181412i()).mo120622b4(z, bLiveAbsDataMo150408b);
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m167579p1() {
        BLiveAbsData bLiveAbsData = this.f147212a;
        if (bLiveAbsData == null || !bLiveAbsData.isNormalLive()) {
            return;
        }
        htd0<ifv> htd0Var = htd0.f111523e;
        ((ifv) zrv.m221194l(htd0Var)).f114693b.put(Long.valueOf(pzi0.m174454o()));
        if (((ifv) zrv.m221194l(htd0Var)).f114694c.get().longValue() == 0) {
            ((ifv) zrv.m221194l(htd0Var)).f114694c.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    public String pageId() {
        return this.f147214c.m98458e().equals("live") ? "p_user_live_room" : "p_user_audio_room";
    }

    /* JADX INFO: renamed from: q0 */
    public void m167580q0(RightSideViewGroup.InterfaceC13102c interfaceC13102c) {
        ((rgd0) this.viewModel).m181410e(interfaceC13102c);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m167581q1() {
        this.f147223l = pzi0.m174454o();
    }

    /* JADX INFO: renamed from: r0 */
    public void m167582r0(ugd0 ugd0Var) {
        this.f147217f.m97608m(ugd0Var);
    }

    /* JADX INFO: renamed from: r1 */
    public void m167583r1() {
        AbstractC21253x5 presenter = ((rgd0) this.viewModel).m181412i().getPresenter();
        if (presenter != null) {
            presenter.mo120609N3();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m167584s0() {
        ((rgd0) this.viewModel).m181420s(null);
    }

    /* JADX INFO: renamed from: s1 */
    public void m167585s1(LiveScrollViewContainer liveScrollViewContainer, boolean z) {
        if (liveScrollViewContainer.getPresenter() != null) {
            liveScrollViewContainer.getPresenter().mo154499d4(z ? "click" : "swipe");
            liveScrollViewContainer.getPresenter().mo70300n();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m167586t0() {
        return m167593y0().mo120610O3();
    }

    /* JADX INFO: renamed from: t1 */
    public void m167587t1(RightSideViewGroup.InterfaceC13102c interfaceC13102c) {
        ((rgd0) this.viewModel).m181421u(interfaceC13102c);
    }

    /* JADX INFO: renamed from: u0 */
    public void m167588u0() {
        m167593y0().mo120611P3();
        this.f147220i.act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m167589u1(BLiveAbsData bLiveAbsData) {
        if (u9t.m195115d(bLiveAbsData)) {
            ((rgd0) this.viewModel).m181423w(false, false);
            ((rgd0) this.viewModel).m181422v(false);
            return;
        }
        boolean zIsNormalLive = bLiveAbsData.isNormalLive();
        V v2 = this.viewModel;
        if (zIsNormalLive) {
            ((rgd0) v2).m181422v(zrv.m221193k().m203681mb(this.f147214c.m98456c()));
        } else {
            ((rgd0) v2).m181422v(false);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m167590v1(String str, ugd0 ugd0Var) {
        if (!TextUtils.equals("default", ugd0Var.m195899b())) {
            boolean zEquals = TextUtils.equals(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, ugd0Var.m195899b());
            V v2 = this.viewModel;
            if (zEquals) {
                ((rgd0) v2).m181422v(true);
                ((rgd0) this.viewModel).m181423w(true, false);
                return;
            } else {
                ((rgd0) v2).m181422v(true);
                ((rgd0) this.viewModel).m181423w(false, false);
                return;
            }
        }
        if (!wft.m206159b(2) && m167559U0()) {
            ((rgd0) this.viewModel).m181422v(false);
            return;
        }
        if (q0j.m174711b(ugd0Var.f138291a, ugd0Var.f138294d)) {
            return;
        }
        if (!zrv.m221193k().m203681mb(str) || m167593y0().m213814K2().m189705l(LiveDialogEnum.SIGN_IN)) {
            ((rgd0) this.viewModel).m181422v(false);
        } else {
            m167545E1(str);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public u4j m167591x0() {
        return this.f147226o;
    }

    /* JADX INFO: renamed from: x1 */
    public void m167592x1() {
        this.f147224m = true;
        ((rgd0) this.viewModel).m181425y(this.f147222k.f165023b);
    }

    /* JADX INFO: renamed from: y0 */
    public AbstractC21253x5 m167593y0() {
        return this.f147218g.m167853g();
    }

    /* JADX INFO: renamed from: z0 */
    public BLiveAbsData m167594z0() {
        return this.f147212a;
    }

    /* JADX INFO: renamed from: z1 */
    public final AbstractC21253x5 m167595z1(JumpRoomData jumpRoomData, LiveScrollViewContainer liveScrollViewContainer) {
        this.f147214c.m98473t(false);
        this.f147214c.m98465l();
        AbstractC21253x5 abstractC21253x5M167856j = this.f147218g.m167856j(jumpRoomData.getLive(), liveScrollViewContainer);
        if (jumpRoomData.getJumpRoomType().needChangeSource()) {
            String source = jumpRoomData.getSource();
            if (TextUtils.isEmpty(source)) {
                source = this.f147214c.m98456c();
            }
            abstractC21253x5M167856j.mo120624e4(jumpRoomData);
            this.f147214c.m98466m(source);
            abstractC21253x5M167856j.m209353h4(UUID.randomUUID().toString());
            abstractC21253x5M167856j.mo120627i4();
            this.f147217f.m97603C(jumpRoomData.getSource(), jumpRoomData.getLive());
            this.f147220i.m72986U4(this.f147217f, jumpRoomData.getSource());
            m167552L0(abstractC21253x5M167856j, jumpRoomData.getLive(), true);
        } else {
            abstractC21253x5M167856j.m209353h4(UUID.randomUUID().toString());
            abstractC21253x5M167856j.mo120627i4();
            m167552L0(abstractC21253x5M167856j, jumpRoomData.getLive(), false);
        }
        this.f147217f.m97621z(jumpRoomData);
        return abstractC21253x5M167856j;
    }

    /* JADX INFO: renamed from: l.ogd0$a */
    public class C19129a implements ujh0 {
        public C19129a() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            ogd0.this.m167593y0().mo120621a4();
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
        }
    }
}
