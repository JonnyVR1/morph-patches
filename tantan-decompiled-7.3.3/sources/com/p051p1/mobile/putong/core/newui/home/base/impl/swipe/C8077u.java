package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveState;
import com.p051p1.mobile.putong.data.VoiceLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.subjects.C22507a;
import p153l.b240;
import p153l.bnl0;
import p153l.bpe0;
import p153l.byd0;
import p153l.d79;
import p153l.fcp;
import p153l.gp5;
import p153l.gra;
import p153l.gta;
import p153l.hlh0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.m7k;
import p153l.nmp;
import p153l.o1j0;
import p153l.pgj;
import p153l.psd0;
import p153l.pzi0;
import p153l.q7m;
import p153l.r7m;
import p153l.rbb0;
import p153l.rxf;
import p153l.s7a;
import p153l.sfj0;
import p153l.spl0;
import p153l.tvn;
import p153l.uih0;
import p153l.uqb0;
import p153l.v83;
import p153l.vq8;
import p153l.vxd0;
import p153l.x20;
import p153l.xei;
import p153l.z5h0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.u */
/* JADX INFO: loaded from: classes11.dex */
public class C8077u extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public final byd0 f22879g = CoreModule.f18269h.f186112b;

    /* JADX INFO: renamed from: h */
    public final byd0 f22880h = new byd0("gp_swipe_count_" + CoreModule.m30929H().userId(), 1L);

    /* JADX INFO: renamed from: i */
    public final byd0 f22881i = CoreModule.f18269h.f186115e;

    /* JADX INFO: renamed from: j */
    public final vxd0 f22882j = new vxd0("intl_live_card_dlg_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: k */
    public boolean f22883k = false;

    /* JADX INFO: renamed from: l */
    public boolean f22884l = false;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, Object> m38771s(User user, VoiceLiveState voiceLiveState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("anchorId", user.f56859id);
        map.put("liveId", voiceLiveState.voiceLiveId);
        map.put("audio_card_type", "swipe_card");
        map.put(FirebaseAnalytics.Param.INDEX, 0);
        map.put("user_type", TextUtils.equals(user.f56859id, voiceLiveState.anchorId) ? "anchor" : "audience_voicechat");
        return map;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        Boolean boolM222761e;
        if (NullChecker.m82486a(aVar.f22838c.m140260e()) && aVar.f22838c.m140260e().isLivingCard() && !CoreModule.m30934Q().mo68469t7().mo161253a()) {
            if (!gta.m132210e().m132214d().mo34765V6()) {
                CoreModule.f18264c.f20405m0.m31989C8("swipe_final_step_1");
            }
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (NullChecker.m82486a(aVar.f22838c.m140259d()) && CoreModule.f18264c.f20405m0.m32023L6(aVar.f22838c.m140259d().f56859id)) {
            if (d79.m114693n0() && NullChecker.m82486a(aVar.f22838c.m140256a()) && (aVar.f22838c.m140256a() instanceof r7m) && !aVar.f22840e && aVar.f22839d == SwipeDirection.RIGHT && !this.f22883k && !this.f22884l && this.f22882j.get().intValue() < d79.m114695o0()) {
                ((r7m) aVar.f22838c.m140256a()).mo37932s();
                CoreDlg.m46215V1(aVar.f22837b.act(), aVar.f22838c.m140259d(), new x20() { // from class: l.dgh0
                    @Override // p153l.x20
                    public final void call() {
                        this.f88303a.m38773u(aVar);
                    }
                }, new x20() { // from class: l.egh0
                    @Override // p153l.x20
                    public final void call() {
                        this.f93937a.m38774v(aVar);
                    }
                });
                return VSwipeStack.OnCardSwipeResult.back;
            }
            aVar.f22837b.m38230T2();
            SwipeDirection swipeDirection = aVar.f22839d;
            if (swipeDirection == SwipeDirection.RIGHT) {
                if ((!this.f22884l && this.f22882j.get().intValue() < d79.m114695o0()) || !d79.m114693n0()) {
                    User userM140259d = aVar.f22838c.m140259d();
                    if (!aVar.f22840e || this.f22883k) {
                        tvn.m192813a("p_suggest_users_home_view", userM140259d);
                    }
                }
            } else if (swipeDirection == SwipeDirection.LEFT && (aVar.f22840e || !d79.m114693n0())) {
                CoreModule.f18264c.f20405m0.m32092c8(aVar.f22838c.m140259d().f56859id);
            }
            if (NullChecker.m82486a(aVar.f22837b.f22630M)) {
                int size = aVar.f22837b.f22630M.f22992c.size();
                if (size == 6) {
                    uqb0.f180370E.m80052u(180000L);
                } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                    aVar.f22836a.m101923L8(false);
                }
            }
            this.f22883k = false;
            this.f22884l = false;
            if (aVar.f22839d == SwipeDirection.LEFT) {
                return VSwipeStack.OnCardSwipeResult.pass;
            }
        }
        if (CoreModule.f18264c.f20405m0.m32027M6(aVar.f22838c.m140259d().f56859id)) {
            aVar.f22837b.m38289e6();
            if (aVar.f22839d == SwipeDirection.LEFT) {
                CoreModule.f18264c.f20405m0.m32117i9(aVar.f22838c.m140259d().f56859id);
                return VSwipeStack.OnCardSwipeResult.pass;
            }
        }
        if (uih0.m196214m0()) {
            uih0.m196223s0().m196255W0(aVar.m38663a());
        }
        User userM140259d2 = aVar.f22838c.m140259d();
        User userM38517n = m38517n();
        boolean z = gra.m131559E1() && NullChecker.m82486a(userM140259d2) && NullChecker.m82486a(userM38517n) && TextUtils.equals(userM140259d2.f56859id, userM38517n.f56859id);
        SwipeDirection swipeDirection2 = aVar.f22839d;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z2 = swipeDirection2 == swipeDirection3;
        if (s7a.m184994w() && !z && aVar.f22840e && z2 && !aVar.f22836a.m102029j6(userM140259d2.f56859id) && !z5h0.m218675j().m218692l(userM140259d2.f56859id)) {
            q7m q7mVarM140256a = aVar.f22838c.m140256a();
            if (NullChecker.m82486a(q7mVarM140256a) ? q7mVarM140256a.m175663i() : false) {
                z5h0.m218675j().m218698w(userM140259d2.f56859id);
                l51.m152888H(aVar.f22837b.act(), new Runnable() { // from class: l.fgh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
                    }
                }, 350L);
                return VSwipeStack.OnCardSwipeResult.stay;
            }
        }
        if (s7a.m184994w()) {
            q7m q7mVarM140256a2 = aVar.f22838c.m140256a();
            if (NullChecker.m82486a(q7mVarM140256a2)) {
                q7mVarM140256a2.m175664n();
            }
            z5h0.m218675j().m218698w(null);
        }
        if (!b240.f74489W0.get().booleanValue() && !TextUtils.isEmpty(b240.f74491Y0) && b240.f74491Y0.equals(userM140259d2.f56859id)) {
            b240.f74489W0.put(Boolean.TRUE);
        }
        bpe0.m105814f().m105817d(userM140259d2.f56859id);
        if (d79.m114685j0() && aVar.f22836a.m102029j6(userM140259d2.f56859id) && m38514k(aVar) && !z) {
            o1j0.m165634h(R$string.f19019Y2);
        }
        HashMap map = new HashMap();
        map.put("sourcepage", aVar.f22836a.f74539g ? b240.f74484R0 : b240.f74485S0);
        map.put("actiontype", aVar.f22840e ? b240.f74486T0 : b240.f74487U0);
        SwipeDirection swipeDirection4 = aVar.f22839d;
        SwipeDirection swipeDirection5 = SwipeDirection.LEFT;
        if (swipeDirection4 == swipeDirection5 && NullChecker.m82486a(aVar.f22838c.m140260e()) && aVar.f22838c.m140260e().compliment != null) {
            gp5.m131235i(aVar.f22836a.f74539g ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_suggest_users_home_view");
        }
        m38512i(m38514k(aVar), z2, userM38517n, userM140259d2, map, userM38517n, true, aVar.f22840e, aVar.f22836a.f74539g, aVar);
        String str = "";
        if (vq8.m202358b() && NullChecker.m82486a(aVar.f22837b.m38128A2().mo39821o()) && NullChecker.m82486a(aVar.f22837b.m38128A2().mo39821o().m140259d()) && CoreModule.m30934Q().getUserLiveId(aVar.f22837b.m38128A2().mo39821o().m140259d().f56859id) != null) {
            User userM140259d3 = aVar.f22837b.m38128A2().mo39821o().m140259d();
            UserLiveState userLiveStateMo68455lt = CoreModule.m30934Q().mo68455lt(userM140259d3.f56859id);
            String userLiveId = CoreModule.m30934Q().getUserLiveId(userM140259d3.f56859id);
            if (userLiveId == null) {
                userLiveId = "";
            }
            m38777y(userLiveStateMo68455lt, userM140259d3.f56859id, userLiveId);
        }
        if (NullChecker.m82486a(aVar.f22837b.m38128A2().mo39821o()) && NullChecker.m82486a(aVar.f22837b.m38128A2().mo39821o().m140259d()) && CoreModule.m30934Q().getUserVirtualVoiceId(aVar.f22837b.m38128A2().mo39821o().m140259d().f56859id) != null && !gra.m131770x1()) {
            User userM140259d4 = aVar.f22837b.m38128A2().mo39821o().m140259d();
            VoiceLiveState voiceLiveStateMo68435Zl = CoreModule.m30934Q().mo68435Zl(userM140259d4.f56859id);
            String userLiveId2 = CoreModule.m30934Q().getUserLiveId(userM140259d4.f56859id);
            if (userLiveId2 == null) {
                userLiveId2 = "";
            }
            m38778z(voiceLiveStateMo68435Zl, userM140259d4, userLiveId2);
        }
        if (d79.m114663V() && C8618a.m48771w().m48796s().get().longValue() < 0) {
            C8618a.m48771w().m48796s().put(this.f22880h.get());
        }
        CoreModule.f18264c.f20381e0.f89158X.put(this.f22880h.get());
        if (!pgj.m172246c()) {
            if (nmp.m163836e() && !bnl0.m105529O0(aVar.f22837b.m38142D2())) {
                aVar.f22837b.m38280d2();
            }
            if (nmp.m163832a() && CoreModule.f18264c.f20396j0.m31577B4() && !bnl0.m105529O0(aVar.f22837b.m38300h2())) {
                aVar.f22837b.m38290f2();
            }
            if (!aVar.f22836a.m101931N8()) {
                CoreModule.f18264c.f20429u0.m31435c7();
                aVar.f22836a.m101955T8(true);
            }
        }
        if (d79.m114685j0() && (((boolM222761e = fcp.f98240f.m222761e()) == null || boolM222761e == Boolean.FALSE) && nmp.m163837f())) {
            fcp.m125033y();
        }
        byd0 byd0Var = this.f22879g;
        byd0Var.put(Long.valueOf(byd0Var.get().longValue() + 1));
        byd0 byd0Var2 = this.f22880h;
        byd0Var2.put(Long.valueOf(byd0Var2.get().longValue() + 1));
        C22507a<Integer> c22507a = CoreModule.f18264c.f20381e0.f89191b1;
        c22507a.m137019l(Integer.valueOf(c22507a.m222761e().intValue() + 1));
        byd0 byd0Var3 = CoreModule.f18264c.f20381e0.f89081N0;
        byd0Var3.put(Long.valueOf(byd0Var3.get().longValue() + 1));
        if (v83.m200284d()) {
            aVar.f22837b.m38299g6();
        }
        if (z2 && !z5h0.m218675j().m218685I()) {
            z5h0.m218675j().f203048f.put(Boolean.TRUE);
        }
        if (z5h0.m218676p()) {
            aVar.f22837b.m38313j6();
        }
        if (pzi0.m174439D(CoreModule.f18264c.f20381e0.f89088O0.get().longValue())) {
            byd0 byd0Var4 = CoreModule.f18264c.f20381e0.f89095P0;
            byd0Var4.put(Long.valueOf(byd0Var4.get().longValue() + 1));
        } else {
            CoreModule.f18264c.f20381e0.f89088O0.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20381e0.f89095P0.put(1L);
            CoreModule.f18264c.f20381e0.f89103Q0.put(0L);
        }
        SwipeDirection swipeDirection6 = aVar.f22839d;
        SwipeDirection swipeDirection7 = SwipeDirection.RIGHT;
        if (swipeDirection6 == swipeDirection7) {
            byd0 byd0Var5 = CoreModule.f18264c.f20381e0.f89103Q0;
            byd0Var5.put(Long.valueOf(byd0Var5.get().longValue() + 1));
        }
        byd0 byd0Var6 = this.f22881i;
        byd0Var6.put(Long.valueOf(byd0Var6.get().longValue() + 1));
        CoreBusinessModule.f18256g.m191628a().f115376i.put(this.f22879g.get());
        CoreBusinessModule.f18256g.m191628a().f115371d++;
        m38775w();
        if (rxf.m183540b() && !hlh0.m135741a().m135742b()) {
            rxf.m183541c(aVar.f22837b.act());
        }
        if (spl0.m187355G()) {
            C8619b.m48820q().m48830k();
        }
        if (s7a.m184982k()) {
            xei.m210680c().m210684d();
        }
        if (gra.m131606N3()) {
            SwipeDirection swipeDirection8 = aVar.f22839d;
            if (swipeDirection8 == swipeDirection5) {
                str = "dislike";
            } else if (swipeDirection8 == swipeDirection3) {
                str = "superlike";
            } else if (swipeDirection8 == swipeDirection7) {
                str = "like";
            }
            if (!TextUtils.isEmpty(str)) {
                sfj0.m185600g("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", str));
            }
        }
        C8039f1.m38619t();
        aVar.f22836a.m101980Y8(false);
        aVar.f22836a.m101975X8(false);
        aVar.f22836a.m101965V8(false);
        aVar.f22836a.m101960U8(false);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m38773u(C8049j.a aVar) {
        this.f22883k = true;
        aVar.f22837b.m38128A2().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m38774v(C8049j.a aVar) {
        vxd0 vxd0Var = this.f22882j;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        this.f22884l = true;
        aVar.f22837b.m38128A2().mo39804A(SwipeDirection.RIGHT);
        CoreModule.f18264c.f20405m0.m32092c8(aVar.f22838c.m140259d().f56859id);
    }

    /* JADX INFO: renamed from: w */
    public final void m38775w() {
        if (!IntlCountryCodeController.m29114k() || CoreModule.f18264c.f20381e0.f89095P0.get().longValue() < m7k.f135085a || CoreModule.f18264c.f20381e0.f89103Q0.get().longValue() < m7k.f135086b || CoreModule.f18264c.f20381e0.m116593na().isVIP() || !rbb0.m180744q() || CoreModule.f18264c.f20381e0.f89119S0.get().booleanValue()) {
            return;
        }
        CoreModule.f18264c.f20381e0.f89119S0.put(Boolean.TRUE);
        CoreModule.f18264c.f20381e0.m116513S7().subscribe(psd0.m173591B());
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m38777y(UserLiveState userLiveState, String str, String str2) {
        i4g0.m138492A("e_live_room_enter", "p_suggest_users_home_view", jyb.m147494Y("liveId", str2), jyb.m147494Y("anchorId", str), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("show_label", userLiveState != null && userLiveState.callInfo.ongoingCall ? "" : "连线"), jyb.m147494Y("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? BLiveOperationTitleShowType.off : "on"), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("trace_id", ""), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("show_label", ""), jyb.m147494Y("liveRecommendCategory", "basic"));
    }

    /* JADX INFO: renamed from: z */
    public final void m38778z(VoiceLiveState voiceLiveState, User user, String str) {
        i4g0.m138527y("e_live_audio_room_enter", "p_suggest_users_home_view", m38771s(user, voiceLiveState));
    }
}
