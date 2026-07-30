package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveState;
import com.p046p1.mobile.putong.data.VoiceLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.subjects.C22392a;
import p149l.a5m;
import p149l.b5m;
import p149l.co5;
import p149l.d30;
import p149l.dwf;
import p149l.e51;
import p149l.fap;
import p149l.g6a;
import p149l.g83;
import p149l.idi;
import p149l.lsi0;
import p149l.mah0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n3b0;
import p149l.nkp;
import p149l.nt30;
import p149l.o6j0;
import p149l.ogl0;
import p149l.qib0;
import p149l.qp8;
import p149l.rxg0;
import p149l.tpd0;
import p149l.ttn;
import p149l.u4k;
import p149l.u59;
import p149l.upa;
import p149l.ura;
import p149l.vdj;
import p149l.vwb;
import p149l.wge0;
import p149l.xdl0;
import p149l.zch0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.u */
/* JADX INFO: loaded from: classes11.dex */
public class C7926u extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public final zpd0 f22137g = CoreModule.f17550h.f119919b;

    /* JADX INFO: renamed from: h */
    public final zpd0 f22138h = new zpd0("gp_swipe_count_" + CoreModule.m29931H().userId(), 1L);

    /* JADX INFO: renamed from: i */
    public final zpd0 f22139i = CoreModule.f17550h.f119922e;

    /* JADX INFO: renamed from: j */
    public final tpd0 f22140j = new tpd0("intl_live_card_dlg_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: k */
    public boolean f22141k = false;

    /* JADX INFO: renamed from: l */
    public boolean f22142l = false;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, Object> m37768s(User user, VoiceLiveState voiceLiveState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("anchorId", user.f56011id);
        map.put("liveId", voiceLiveState.voiceLiveId);
        map.put("audio_card_type", "swipe_card");
        map.put(FirebaseAnalytics.Param.INDEX, 0);
        map.put("user_type", TextUtils.equals(user.f56011id, voiceLiveState.anchorId) ? "anchor" : "audience_voicechat");
        return map;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        Boolean boolM221515e;
        if (NullChecker.m81303a(aVar.f22096c.m141746e()) && aVar.f22096c.m141746e().isLivingCard() && !CoreModule.m29936Q().mo67286t7().mo152520a()) {
            if (!ura.m195053e().m195057d().mo33762V6()) {
                CoreModule.f17545c.f19663m0.m30986C8("swipe_final_step_1");
            }
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (NullChecker.m81303a(aVar.f22096c.m141745d()) && CoreModule.f17545c.f19663m0.m31020L6(aVar.f22096c.m141745d().f56011id)) {
            if (u59.m191835j0() && NullChecker.m81303a(aVar.f22096c.m141742a()) && (aVar.f22096c.m141742a() instanceof b5m) && !aVar.f22098e && aVar.f22097d == SwipeDirection.RIGHT && !this.f22141k && !this.f22142l && this.f22140j.get().intValue() < u59.m191837k0()) {
                ((b5m) aVar.f22096c.m141742a()).mo36929s();
                CoreDlg.m45032V1(aVar.f22095b.act(), aVar.f22096c.m141745d(), new d30() { // from class: l.v7h0
                    @Override // p149l.d30
                    public final void call() {
                        this.f180387a.m37770u(aVar);
                    }
                }, new d30() { // from class: l.w7h0
                    @Override // p149l.d30
                    public final void call() {
                        this.f185054a.m37771v(aVar);
                    }
                });
                return VSwipeStack.OnCardSwipeResult.back;
            }
            aVar.f22095b.m37227T2();
            SwipeDirection swipeDirection = aVar.f22097d;
            if (swipeDirection == SwipeDirection.RIGHT) {
                if ((!this.f22142l && this.f22140j.get().intValue() < u59.m191837k0()) || !u59.m191835j0()) {
                    User userM141745d = aVar.f22096c.m141745d();
                    if (!aVar.f22098e || this.f22141k) {
                        ttn.m190607a("p_suggest_users_home_view", userM141745d);
                    }
                }
            } else if (swipeDirection == SwipeDirection.LEFT && (aVar.f22098e || !u59.m191835j0())) {
                CoreModule.f17545c.f19663m0.m31089c8(aVar.f22096c.m141745d().f56011id);
            }
            if (NullChecker.m81303a(aVar.f22095b.f21888M)) {
                int size = aVar.f22095b.f21888M.f22250c.size();
                if (size == 6) {
                    qib0.f154687E.m78869u(180000L);
                } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                    aVar.f22094a.m161129L8(false);
                }
            }
            this.f22141k = false;
            this.f22142l = false;
            if (aVar.f22097d == SwipeDirection.LEFT) {
                return VSwipeStack.OnCardSwipeResult.pass;
            }
        }
        if (CoreModule.f17545c.f19663m0.m31024M6(aVar.f22096c.m141745d().f56011id)) {
            aVar.f22095b.m37286e6();
            if (aVar.f22097d == SwipeDirection.LEFT) {
                CoreModule.f17545c.f19663m0.m31114i9(aVar.f22096c.m141745d().f56011id);
                return VSwipeStack.OnCardSwipeResult.pass;
            }
        }
        if (mah0.m153720m0()) {
            mah0.m153729s0().m153761W0(aVar.m37660a());
        }
        User userM141745d2 = aVar.f22096c.m141745d();
        User userM37514n = m37514n();
        boolean z = upa.m194628E1() && NullChecker.m81303a(userM141745d2) && NullChecker.m81303a(userM37514n) && TextUtils.equals(userM141745d2.f56011id, userM37514n.f56011id);
        SwipeDirection swipeDirection2 = aVar.f22097d;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z2 = swipeDirection2 == swipeDirection3;
        if (g6a.m124574w() && !z && aVar.f22098e && z2 && !aVar.f22094a.m161235j6(userM141745d2.f56011id) && !rxg0.m181572j().m181589l(userM141745d2.f56011id)) {
            a5m a5mVarM141742a = aVar.f22096c.m141742a();
            if (NullChecker.m81303a(a5mVarM141742a) ? a5mVarM141742a.m95053i() : false) {
                rxg0.m181572j().m181595w(userM141745d2.f56011id);
                e51.m114743H(aVar.f22095b.act(), new Runnable() { // from class: l.x7h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
                    }
                }, 350L);
                return VSwipeStack.OnCardSwipeResult.stay;
            }
        }
        if (g6a.m124574w()) {
            a5m a5mVarM141742a2 = aVar.f22096c.m141742a();
            if (NullChecker.m81303a(a5mVarM141742a2)) {
                a5mVarM141742a2.m95054n();
            }
            rxg0.m181572j().m181595w(null);
        }
        if (!nt30.f140337W0.get().booleanValue() && !TextUtils.isEmpty(nt30.f140339Y0) && nt30.f140339Y0.equals(userM141745d2.f56011id)) {
            nt30.f140337W0.put(Boolean.TRUE);
        }
        wge0.m203034f().m203037d(userM141745d2.f56011id);
        if (u59.m191827f0() && aVar.f22094a.m161235j6(userM141745d2.f56011id) && m37511k(aVar) && !z) {
            lsi0.m151578h(R$string.f18229W2);
        }
        HashMap map = new HashMap();
        map.put("sourcepage", aVar.f22094a.f140387g ? nt30.f140332R0 : nt30.f140333S0);
        map.put("actiontype", aVar.f22098e ? nt30.f140334T0 : nt30.f140335U0);
        SwipeDirection swipeDirection4 = aVar.f22097d;
        SwipeDirection swipeDirection5 = SwipeDirection.LEFT;
        if (swipeDirection4 == swipeDirection5 && NullChecker.m81303a(aVar.f22096c.m141746e()) && aVar.f22096c.m141746e().compliment != null) {
            co5.m107937i(aVar.f22094a.f140387g ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_suggest_users_home_view");
        }
        m37509i(m37511k(aVar), z2, userM37514n, userM141745d2, map, userM37514n, true, aVar.f22098e, aVar.f22094a.f140387g, aVar);
        String str = "";
        if (qp8.m175817b() && NullChecker.m81303a(aVar.f22095b.m37125A2().mo38818o()) && NullChecker.m81303a(aVar.f22095b.m37125A2().mo38818o().m141745d()) && CoreModule.m29936Q().getUserLiveId(aVar.f22095b.m37125A2().mo38818o().m141745d().f56011id) != null) {
            User userM141745d3 = aVar.f22095b.m37125A2().mo38818o().m141745d();
            UserLiveState userLiveStateMo67272lt = CoreModule.m29936Q().mo67272lt(userM141745d3.f56011id);
            String userLiveId = CoreModule.m29936Q().getUserLiveId(userM141745d3.f56011id);
            if (userLiveId == null) {
                userLiveId = "";
            }
            m37774y(userLiveStateMo67272lt, userM141745d3.f56011id, userLiveId);
        }
        if (NullChecker.m81303a(aVar.f22095b.m37125A2().mo38818o()) && NullChecker.m81303a(aVar.f22095b.m37125A2().mo38818o().m141745d()) && CoreModule.m29936Q().getUserVirtualVoiceId(aVar.f22095b.m37125A2().mo38818o().m141745d().f56011id) != null && !upa.m194839x1()) {
            User userM141745d4 = aVar.f22095b.m37125A2().mo38818o().m141745d();
            VoiceLiveState voiceLiveStateMo67252Zl = CoreModule.m29936Q().mo67252Zl(userM141745d4.f56011id);
            String userLiveId2 = CoreModule.m29936Q().getUserLiveId(userM141745d4.f56011id);
            if (userLiveId2 == null) {
                userLiveId2 = "";
            }
            m37775z(voiceLiveStateMo67252Zl, userM141745d4, userLiveId2);
        }
        if (u59.m191812U() && C8455a.m47588w().m47613s().get().longValue() < 0) {
            C8455a.m47588w().m47613s().put(this.f22138h.get());
        }
        CoreModule.f17545c.f19639e0.f149301X.put(this.f22138h.get());
        if (!vdj.m198001c()) {
            if (nkp.m159986e() && !xdl0.m208349O0(aVar.f22095b.m37139D2())) {
                aVar.f22095b.m37277d2();
            }
            if (nkp.m159982a() && CoreModule.f17545c.f19654j0.m30574B4() && !xdl0.m208349O0(aVar.f22095b.m37297h2())) {
                aVar.f22095b.m37287f2();
            }
            if (!aVar.f22094a.m161137N8()) {
                CoreModule.f17545c.f19687u0.m30425Y6();
                aVar.f22094a.m161161T8(true);
            }
        }
        if (u59.m191827f0() && (((boolM221515e = fap.f96633f.m221515e()) == null || boolM221515e == Boolean.FALSE) && nkp.m159987f())) {
            fap.m120266y();
        }
        zpd0 zpd0Var = this.f22137g;
        zpd0Var.put(Long.valueOf(zpd0Var.get().longValue() + 1));
        zpd0 zpd0Var2 = this.f22138h;
        zpd0Var2.put(Long.valueOf(zpd0Var2.get().longValue() + 1));
        C22392a<Integer> c22392a = CoreModule.f17545c.f19639e0.f149334b1;
        c22392a.m132487l(Integer.valueOf(c22392a.m221515e().intValue() + 1));
        zpd0 zpd0Var3 = CoreModule.f17545c.f19639e0.f149224N0;
        zpd0Var3.put(Long.valueOf(zpd0Var3.get().longValue() + 1));
        if (g83.m124741d()) {
            aVar.f22095b.m37296g6();
        }
        if (z2 && !rxg0.m181572j().m181582I()) {
            rxg0.m181572j().f161461f.put(Boolean.TRUE);
        }
        if (rxg0.m181573p()) {
            aVar.f22095b.m37310j6();
        }
        if (mqi0.m155929D(CoreModule.f17545c.f19639e0.f149231O0.get().longValue())) {
            zpd0 zpd0Var4 = CoreModule.f17545c.f19639e0.f149238P0;
            zpd0Var4.put(Long.valueOf(zpd0Var4.get().longValue() + 1));
        } else {
            CoreModule.f17545c.f19639e0.f149231O0.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19639e0.f149238P0.put(1L);
            CoreModule.f17545c.f19639e0.f149246Q0.put(0L);
        }
        SwipeDirection swipeDirection6 = aVar.f22097d;
        SwipeDirection swipeDirection7 = SwipeDirection.RIGHT;
        if (swipeDirection6 == swipeDirection7) {
            zpd0 zpd0Var5 = CoreModule.f17545c.f19639e0.f149246Q0;
            zpd0Var5.put(Long.valueOf(zpd0Var5.get().longValue() + 1));
        }
        zpd0 zpd0Var6 = this.f22139i;
        zpd0Var6.put(Long.valueOf(zpd0Var6.get().longValue() + 1));
        CoreBusinessModule.f17537g.m146314a().f68814i.put(this.f22137g.get());
        CoreBusinessModule.f17537g.m146314a().f68809d++;
        m37772w();
        if (dwf.m113867b() && !zch0.m218024a().m218025b()) {
            dwf.m113868c(aVar.f22095b.act());
        }
        if (ogl0.m164228G()) {
            C8456b.m47637q().m47647k();
        }
        if (g6a.m124562k()) {
            idi.m135447c().m135451d();
        }
        if (upa.m194675N3()) {
            SwipeDirection swipeDirection8 = aVar.f22097d;
            if (swipeDirection8 == swipeDirection5) {
                str = "dislike";
            } else if (swipeDirection8 == swipeDirection3) {
                str = "superlike";
            } else if (swipeDirection8 == swipeDirection7) {
                str = "like";
            }
            if (!TextUtils.isEmpty(str)) {
                o6j0.m162863g("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", str));
            }
        }
        C7888f1.m37616t();
        aVar.f22094a.m161186Y8(false);
        aVar.f22094a.m161181X8(false);
        aVar.f22094a.m161171V8(false);
        aVar.f22094a.m161166U8(false);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m37770u(C7898j.a aVar) {
        this.f22141k = true;
        aVar.f22095b.m37125A2().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m37771v(C7898j.a aVar) {
        tpd0 tpd0Var = this.f22140j;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        this.f22142l = true;
        aVar.f22095b.m37125A2().mo38801A(SwipeDirection.RIGHT);
        CoreModule.f17545c.f19663m0.m31089c8(aVar.f22096c.m141745d().f56011id);
    }

    /* JADX INFO: renamed from: w */
    public final void m37772w() {
        if (!IntlCountryCodeController.m28115k() || CoreModule.f17545c.f19639e0.f149238P0.get().longValue() < u4k.f174602a || CoreModule.f17545c.f19639e0.f149246Q0.get().longValue() < u4k.f174603b || CoreModule.f17545c.f19639e0.m169520na().isVIP() || !n3b0.m157742q() || CoreModule.f17545c.f19639e0.f149262S0.get().booleanValue()) {
            return;
        }
        CoreModule.f17545c.f19639e0.f149262S0.put(Boolean.TRUE);
        CoreModule.f17545c.f19639e0.m169440S7().subscribe(mkd0.m154950B());
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m37774y(UserLiveState userLiveState, String str, String str2) {
        zvf0.m220368A("e_live_room_enter", "p_suggest_users_home_view", vwb.m200311Y("liveId", str2), vwb.m200311Y("anchorId", str), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("show_label", userLiveState != null && userLiveState.callInfo.ongoingCall ? "" : "连线"), vwb.m200311Y("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? BLiveOperationTitleShowType.off : "on"), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("trace_id", ""), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("show_label", ""), vwb.m200311Y("liveRecommendCategory", "basic"));
    }

    /* JADX INFO: renamed from: z */
    public final void m37775z(VoiceLiveState voiceLiveState, User user, String str) {
        zvf0.m220403y("e_live_audio_room_enter", "p_suggest_users_home_view", m37768s(user, voiceLiveState));
    }
}
