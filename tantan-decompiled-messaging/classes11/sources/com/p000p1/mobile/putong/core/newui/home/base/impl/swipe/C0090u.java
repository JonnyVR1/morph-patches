package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.match.a;
import com.p1.mobile.putong.core.ui.match.b;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveState;
import com.p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.co5;
import l.d30;
import l.dwf;
import l.e51;
import l.fap;
import l.g6a;
import l.g83;
import l.j760;
import l.lsi0;
import l.mah0;
import l.mkd0;
import l.n3b0;
import l.nkp;
import l.o6j0;
import l.ogl0;
import l.qib0;
import l.qp8;
import l.rxg0;
import l.tpd0;
import l.u4k;
import l.u59;
import l.upa;
import l.ura;
import l.vdj;
import l.vwb;
import l.wge0;
import l.xdl0;
import l.zpd0;
import l.zvf0;
import p009l.a5m;
import p009l.b5m;
import p009l.idi;
import p009l.mqi0;
import p009l.nt30;
import p009l.ttn;
import p009l.zch0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.u */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0090u extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public final zpd0 f915g = CoreModule.h.b;

    /* JADX INFO: renamed from: h */
    public final zpd0 f916h = new zpd0("gp_swipe_count_" + CoreModule.H().userId(), 1L);

    /* JADX INFO: renamed from: i */
    public final zpd0 f917i = CoreModule.h.e;

    /* JADX INFO: renamed from: j */
    public final tpd0 f918j = new tpd0("intl_live_card_dlg_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: k */
    public boolean f919k = false;

    /* JADX INFO: renamed from: l */
    public boolean f920l = false;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, Object> m1739s(User user, VoiceLiveState voiceLiveState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("anchorId", ((DbObject) user).id);
        map.put("liveId", voiceLiveState.voiceLiveId);
        map.put("audio_card_type", "swipe_card");
        map.put("index", 0);
        map.put("user_type", TextUtils.equals(((DbObject) user).id, voiceLiveState.anchorId) ? "anchor" : "audience_voicechat");
        return map;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        Boolean bool;
        if (NullChecker.a(aVar.f874c.m17131e()) && aVar.f874c.m17131e().isLivingCard() && !CoreModule.Q().m9071t7().m18210a()) {
            if (!ura.e().d().V6()) {
                CoreModule.c.m0.C8("swipe_final_step_1");
            }
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (NullChecker.a(aVar.f874c.m17130d()) && CoreModule.c.m0.L6(((DbObject) aVar.f874c.m17130d()).id)) {
            if (u59.j0() && NullChecker.a(aVar.f874c.m17127a()) && (aVar.f874c.m17127a() instanceof b5m) && !aVar.f876e && aVar.f875d == SwipeDirection.RIGHT && !this.f919k && !this.f920l && ((Integer) this.f918j.get()).intValue() < u59.k0()) {
                ((b5m) aVar.f874c.m17127a()).mo895s();
                CoreDlg.V1(aVar.f873b.act(), aVar.f874c.m17130d(), new d30() { // from class: l.v7h0
                    public final void call() {
                        this.f21474a.m1741u(aVar);
                    }
                }, new d30() { // from class: l.w7h0
                    public final void call() {
                        this.f21934a.m1742v(aVar);
                    }
                });
                return VSwipeStack.OnCardSwipeResult.back;
            }
            aVar.f873b.m1195T2();
            SwipeDirection swipeDirection = aVar.f875d;
            if (swipeDirection == SwipeDirection.RIGHT) {
                if ((!this.f920l && ((Integer) this.f918j.get()).intValue() < u59.k0()) || !u59.j0()) {
                    User userM17130d = aVar.f874c.m17130d();
                    if (!aVar.f876e || this.f919k) {
                        ttn.m22660a("p_suggest_users_home_view", userM17130d);
                    }
                }
            } else if (swipeDirection == SwipeDirection.LEFT && (aVar.f876e || !u59.j0())) {
                CoreModule.c.m0.c8(((DbObject) aVar.f874c.m17130d()).id);
            }
            if (NullChecker.a(aVar.f873b.f666M)) {
                int size = aVar.f873b.f666M.f1028c.size();
                if (size == 6) {
                    qib0.E.m9164u(180000L);
                } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                    aVar.f872a.m19333L8(false);
                }
            }
            this.f919k = false;
            this.f920l = false;
            if (aVar.f875d == SwipeDirection.LEFT) {
                return VSwipeStack.OnCardSwipeResult.pass;
            }
        }
        if (CoreModule.c.m0.M6(((DbObject) aVar.f874c.m17130d()).id)) {
            aVar.f873b.m1254e6();
            if (aVar.f875d == SwipeDirection.LEFT) {
                CoreModule.c.m0.i9(((DbObject) aVar.f874c.m17130d()).id);
                return VSwipeStack.OnCardSwipeResult.pass;
            }
        }
        if (mah0.m0()) {
            mah0.s0().W0(aVar.m1631a());
        }
        User userM17130d2 = aVar.f874c.m17130d();
        User userM1485n = m1485n();
        boolean z = upa.E1() && NullChecker.a(userM17130d2) && NullChecker.a(userM1485n) && TextUtils.equals(((DbObject) userM17130d2).id, ((DbObject) userM1485n).id);
        SwipeDirection swipeDirection2 = aVar.f875d;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z2 = swipeDirection2 == swipeDirection3;
        if (g6a.w() && !z && aVar.f876e && z2 && !aVar.f872a.m19441j6(((DbObject) userM17130d2).id) && !rxg0.j().l(((DbObject) userM17130d2).id)) {
            a5m a5mVarM17127a = aVar.f874c.m17127a();
            if (NullChecker.a(a5mVarM17127a) ? a5mVarM17127a.m11244i() : false) {
                rxg0.j().w(((DbObject) userM17130d2).id);
                e51.H(aVar.f873b.act(), new Runnable() { // from class: l.x7h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
                    }
                }, 350L);
                return VSwipeStack.OnCardSwipeResult.stay;
            }
        }
        if (g6a.w()) {
            a5m a5mVarM17127a2 = aVar.f874c.m17127a();
            if (NullChecker.a(a5mVarM17127a2)) {
                a5mVarM17127a2.m11245n();
            }
            rxg0.j().w((String) null);
        }
        if (!((Boolean) nt30.f17647W0.get()).booleanValue() && !TextUtils.isEmpty(nt30.f17649Y0) && nt30.f17649Y0.equals(((DbObject) userM17130d2).id)) {
            nt30.f17647W0.put(Boolean.TRUE);
        }
        wge0.f().d(((DbObject) userM17130d2).id);
        if (u59.f0() && aVar.f872a.m19441j6(((DbObject) userM17130d2).id) && m1482k(aVar) && !z) {
            lsi0.h(R.string.W2);
        }
        HashMap map = new HashMap();
        map.put("sourcepage", aVar.f872a.f17697g ? nt30.f17642R0 : nt30.f17643S0);
        map.put("actiontype", aVar.f876e ? nt30.f17644T0 : nt30.f17645U0);
        SwipeDirection swipeDirection4 = aVar.f875d;
        SwipeDirection swipeDirection5 = SwipeDirection.LEFT;
        if (swipeDirection4 == swipeDirection5 && NullChecker.a(aVar.f874c.m17131e()) && aVar.f874c.m17131e().compliment != null) {
            co5.i(aVar.f872a.f17697g ? "p_suggest_user_profile_info_view" : "p_suggest_users_home_view");
        }
        m1480i(m1482k(aVar), z2, userM1485n, userM17130d2, map, userM1485n, true, aVar.f876e, aVar.f872a.f17697g, aVar);
        String str = "";
        if (qp8.b() && NullChecker.a(aVar.f873b.m1092A2().mo2814o()) && NullChecker.a(aVar.f873b.m1092A2().mo2814o().m17130d()) && CoreModule.Q().getUserLiveId(((DbObject) aVar.f873b.m1092A2().mo2814o().m17130d()).id) != null) {
            User userM17130d3 = aVar.f873b.m1092A2().mo2814o().m17130d();
            UserLiveState userLiveStateM9057lt = CoreModule.Q().m9057lt(((DbObject) userM17130d3).id);
            String userLiveId = CoreModule.Q().getUserLiveId(((DbObject) userM17130d3).id);
            if (userLiveId == null) {
                userLiveId = "";
            }
            m1745y(userLiveStateM9057lt, ((DbObject) userM17130d3).id, userLiveId);
        }
        if (NullChecker.a(aVar.f873b.m1092A2().mo2814o()) && NullChecker.a(aVar.f873b.m1092A2().mo2814o().m17130d()) && CoreModule.Q().getUserVirtualVoiceId(((DbObject) aVar.f873b.m1092A2().mo2814o().m17130d()).id) != null && !upa.x1()) {
            User userM17130d4 = aVar.f873b.m1092A2().mo2814o().m17130d();
            VoiceLiveState voiceLiveStateM9037Zl = CoreModule.Q().m9037Zl(((DbObject) userM17130d4).id);
            String userLiveId2 = CoreModule.Q().getUserLiveId(((DbObject) userM17130d4).id);
            if (userLiveId2 == null) {
                userLiveId2 = "";
            }
            m1746z(voiceLiveStateM9037Zl, userM17130d4, userLiveId2);
        }
        if (u59.U() && ((Long) a.w().s().get()).longValue() < 0) {
            a.w().s().put((Long) this.f916h.get());
        }
        CoreModule.c.e0.X.put((Long) this.f916h.get());
        if (!vdj.c()) {
            if (nkp.e() && !xdl0.O0(aVar.f873b.m1107D2())) {
                aVar.f873b.m1245d2();
            }
            if (nkp.a() && CoreModule.c.j0.B4() && !xdl0.O0(aVar.f873b.m1265h2())) {
                aVar.f873b.m1255f2();
            }
            if (!aVar.f872a.m19341N8()) {
                CoreModule.c.u0.Y6();
                aVar.f872a.m19365T8(true);
            }
        }
        if (u59.f0() && (((bool = (Boolean) fap.f.e()) == null || bool == Boolean.FALSE) && nkp.f())) {
            fap.y();
        }
        zpd0 zpd0Var = this.f915g;
        zpd0Var.put(Long.valueOf(((Long) zpd0Var.get()).longValue() + 1));
        zpd0 zpd0Var2 = this.f916h;
        zpd0Var2.put(Long.valueOf(((Long) zpd0Var2.get()).longValue() + 1));
        rx.subjects.a aVar2 = CoreModule.c.e0.b1;
        aVar2.onNext(Integer.valueOf(((Integer) aVar2.e()).intValue() + 1));
        zpd0 zpd0Var3 = CoreModule.c.e0.N0;
        zpd0Var3.put(Long.valueOf(((Long) zpd0Var3.get()).longValue() + 1));
        if (g83.d()) {
            aVar.f873b.m1264g6();
        }
        if (z2 && !rxg0.j().I()) {
            rxg0.j().f.put(Boolean.TRUE);
        }
        if (rxg0.p()) {
            aVar.f873b.m1279j6();
        }
        if (mqi0.m18535D(((Long) CoreModule.c.e0.O0.get()).longValue())) {
            zpd0 zpd0Var4 = CoreModule.c.e0.P0;
            zpd0Var4.put(Long.valueOf(((Long) zpd0Var4.get()).longValue() + 1));
        } else {
            CoreModule.c.e0.O0.put(Long.valueOf(mqi0.m18550o()));
            CoreModule.c.e0.P0.put(1L);
            CoreModule.c.e0.Q0.put(0L);
        }
        SwipeDirection swipeDirection6 = aVar.f875d;
        SwipeDirection swipeDirection7 = SwipeDirection.RIGHT;
        if (swipeDirection6 == swipeDirection7) {
            zpd0 zpd0Var5 = CoreModule.c.e0.Q0;
            zpd0Var5.put(Long.valueOf(((Long) zpd0Var5.get()).longValue() + 1));
        }
        zpd0 zpd0Var6 = this.f917i;
        zpd0Var6.put(Long.valueOf(((Long) zpd0Var6.get()).longValue() + 1));
        CoreBusinessModule.g.m17547a().f9393i.put((Long) this.f915g.get());
        CoreBusinessModule.g.m17547a().f9388d++;
        m1743w();
        if (dwf.b() && !zch0.m25654a().m25655b()) {
            dwf.c(aVar.f873b.act());
        }
        if (ogl0.G()) {
            b.q().k();
        }
        if (g6a.k()) {
            idi.m16341c().m16345d();
        }
        if (upa.N3()) {
            SwipeDirection swipeDirection8 = aVar.f875d;
            if (swipeDirection8 == swipeDirection5) {
                str = "dislike";
            } else if (swipeDirection8 == swipeDirection3) {
                str = "superlike";
            } else if (swipeDirection8 == swipeDirection7) {
                str = "like";
            }
            if (!TextUtils.isEmpty(str)) {
                o6j0.g("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", str)});
            }
        }
        C0052f1.m1587t();
        aVar.f872a.m19390Y8(false);
        aVar.f872a.m19385X8(false);
        aVar.f872a.m19375V8(false);
        aVar.f872a.m19370U8(false);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m1741u(C0062j.a aVar) {
        this.f919k = true;
        aVar.f873b.m1092A2().mo2797A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m1742v(C0062j.a aVar) {
        tpd0 tpd0Var = this.f918j;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        this.f920l = true;
        aVar.f873b.m1092A2().mo2797A(SwipeDirection.RIGHT);
        CoreModule.c.m0.c8(((DbObject) aVar.f874c.m17130d()).id);
    }

    /* JADX INFO: renamed from: w */
    public final void m1743w() {
        if (!IntlCountryCodeController.k() || ((Long) CoreModule.c.e0.P0.get()).longValue() < u4k.a || ((Long) CoreModule.c.e0.Q0.get()).longValue() < u4k.b || CoreModule.c.e0.na().isVIP() || !n3b0.q() || ((Boolean) CoreModule.c.e0.S0.get()).booleanValue()) {
            return;
        }
        CoreModule.c.e0.S0.put(Boolean.TRUE);
        CoreModule.c.e0.S7().subscribe(mkd0.B());
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m1745y(UserLiveState userLiveState, String str, String str2) {
        zvf0.A("e_live_room_enter", "p_suggest_users_home_view", new j760[]{vwb.Y("liveId", str2), vwb.Y("anchorId", str), vwb.Y("index", "NA"), vwb.Y("show_label", userLiveState != null && userLiveState.callInfo.ongoingCall ? "" : "连线"), vwb.Y("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? "off" : "on"), vwb.Y("module", "page"), vwb.Y("trace_id", ""), vwb.Y("right_recommend_type", ""), vwb.Y("show_label", ""), vwb.Y("liveRecommendCategory", "basic")});
    }

    /* JADX INFO: renamed from: z */
    public final void m1746z(VoiceLiveState voiceLiveState, User user, String str) {
        zvf0.y("e_live_audio_room_enter", "p_suggest_users_home_view", m1739s(user, voiceLiveState));
    }
}
