package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.C0029a;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.AbstractC0035a;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.api.d0;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.MissMatch;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.likeminded.a;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.abi;
import l.cp60;
import l.e30;
import l.ezc0;
import l.g6a;
import l.gj40;
import l.hei0;
import l.j760;
import l.j8w;
import l.m7e0;
import l.mkd0;
import l.mx0;
import l.n3b0;
import l.ogl0;
import l.q8p;
import l.qib0;
import l.qqi0;
import l.roj0;
import l.rxg0;
import l.swh0;
import l.tpd0;
import l.u59;
import l.upa;
import l.vdj;
import l.vwb;
import l.wge0;
import l.wp0;
import l.xy5;
import l.zpd0;
import l.zvf0;
import p009l.ic50;
import p009l.mgh0;
import p009l.mqi0;
import p009l.p1i;
import p009l.p3m;
import p009l.qff0;
import p009l.qsd0;
import p009l.rvi0;
import p009l.ubo;
import p009l.yij0;
import p009l.zub;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class AbstractC0035a implements p3m<C0062j.a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final tpd0 f831a = new tpd0("profile_purpose_dialog_show_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public final zpd0 f832b = new zpd0("profile_purpose_dialog_last_show_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public final long f833c = 600000;

    /* JADX INFO: renamed from: d */
    public boolean f834d = false;

    /* JADX INFO: renamed from: e */
    public boolean f835e = false;

    /* JADX INFO: renamed from: f */
    public boolean f836f = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1474c(C0062j.a aVar, String str) {
        aVar.f878g = true;
        CoreModule.c.Y0.t = 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1477f(MissMatch missMatch) {
        if (((int) ((mqi0.m18549n() - qqi0.c((long) CoreModule.c.e0.p9().createdTime)) / 86400000)) >= missMatch.actived_duration && ((Integer) CoreModule.c.m0.Q0.get()).intValue() >= 0 && !missMatch.interval_day.isEmpty()) {
            double dDoubleValue = ((Double) missMatch.interval_day.get(Math.max(Math.min(((Integer) CoreModule.c.m0.Q0.get()).intValue() - 1, missMatch.interval_day.size() - 1), 0))).doubleValue();
            if (dDoubleValue < 0.0d) {
                return false;
            }
            if (mqi0.m18550o() - ((Long) CoreModule.c.m0.P0.get()).longValue() >= TimeUnit.MILLISECONDS.convert((int) (dDoubleValue * 24.0d), TimeUnit.HOURS)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m1478g() {
        if (CoreModule.P().a().dj()) {
            int iP0 = upa.p0();
            int iQ0 = upa.q0();
            if (((iP0 <= 0 || CoreModule.c.m0.P1 != iP0) && (iQ0 <= 0 || CoreModule.c.m0.O1 != iQ0)) || ((Integer) CoreModule.c.e0.J4.get()).intValue() >= upa.o0() || CoreModule.c.e0.b8(false) || mqi0.m18535D(((Long) CoreModule.c.e0.O4.get()).longValue()) || upa.n0() <= 0 || upa.o0() <= 0 || mqi0.m18550o() - ((Long) CoreModule.c.e0.K4.get()).longValue() < ((long) (upa.n0() * 24)) * 3600000) {
                return;
            }
            CoreModule.c.e0.O4.put(Long.valueOf(mqi0.m18550o()));
            CoreModule.c.e0.K4.put(Long.valueOf(mqi0.m18550o()));
            tpd0 tpd0Var = CoreModule.c.e0.J4;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.MarryAdCard;
            userInfo.id = "VirtualCard";
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.c.m0.w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public Counter m1479h() {
        return CoreModule.c.o3();
    }

    /* JADX INFO: renamed from: i */
    public void m1480i(final boolean z, final boolean z2, User user, final User user2, Map<String, String> map, final User user3, final boolean z3, boolean z4, boolean z5, final C0062j.a aVar) {
        final User user4;
        SwipeDirection swipeDirection;
        if (upa.E1() && NullChecker.a(user2) && NullChecker.a(user)) {
            user4 = user;
            if (TextUtils.equals(((DbObject) user2).id, ((DbObject) user4).id)) {
                return;
            }
        } else {
            user4 = user;
        }
        aVar.f877f.m2448e(map);
        boolean z6 = u59.f0() && aVar.f872a.m19441j6(((DbObject) aVar.f874c.m17130d()).id);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        if (upa.E1() && NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17131e()) && NullChecker.a(aVar.f874c.m17131e().cityCData) && TextUtils.equals(aVar.f874c.m17131e().cityCData.userId, aVar.f874c.m17131e().id)) {
            likeExtraDataNew_.status = MatchFrom.get("cityC");
        }
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z4).matchSource((z5 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user2).pageId("p_suggest_users_home_view").build();
        CoreModule.c.m0.f0 = aVar.f874c.m17131e();
        if (CoreModule.N().ko() && CoreModule.N().xa("p_suggest_users_home_view")) {
            this.f835e = false;
            p1i.m20075c().f18320a = false;
            p1i.m20075c().m20080f();
            if (!aVar.f878g && !aVar.f873b.act().isDialogShowing() && aVar.f873b.act().m3888e6(TabName.Card)) {
                this.f835e = p1i.m20075c().m20077b();
            }
        } else {
            this.f835e = false;
        }
        if (upa.h0().enable && ((swipeDirection = aVar.f875d) == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP)) {
            rvi0.m21827h();
            CoreModule.c.e0.N3.onNext(roj0.a);
        }
        final int iD = wge0.f().d(((DbObject) user2).id);
        final boolean z7 = z6;
        CoreModule.c.m0.a8(z, z2, map, (User) null, aVar.f872a.f17680Q, LikeFrom.get("home"), true, likeExtraDataNew_, aVar.f877f.m2452i(), (String) null, true, iD, false).subscribe(mkd0.H(new e30() { // from class: l.f6
            public final void call(Object obj) {
                this.f12825a.m1483l(aVar, user2, z, user4, z2, z3, z7, iD, user3, (Relationship) obj);
            }
        }, new e30() { // from class: l.g6
            public final void call(Object obj) {
                this.f13318a.m1484m(aVar, z3, (Throwable) obj);
            }
        }));
        m1481j(z);
        if (NullChecker.a(aVar.f873b.f666M)) {
            int size = aVar.f873b.f666M.f1028c.size();
            if (size == 6) {
                qib0.E.m9164u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                aVar.f872a.m19333L8(false);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1481j(boolean z) {
        MissMatch missMatchE = CoreModule.d.E();
        if (missMatchE != null && !z && TEnum.equals(CoreModule.c.e0.p9().gender, "male") && n3b0.q()) {
            if ((missMatchE.num_limited_left == 0 || ((Integer) CoreModule.c.m0.Q0.get()).intValue() < missMatchE.num_limited_left) && m1477f(missMatchE)) {
                long jLongValue = ((Long) CoreModule.c.m0.O0.get()).longValue();
                if (!mqi0.m18535D(jLongValue) && jLongValue < mqi0.m18550o()) {
                    CoreModule.c.m0.N0.put(0);
                    CoreModule.c.m0.O0.put(Long.valueOf(mqi0.m18550o()));
                }
                tpd0 tpd0Var = CoreModule.c.m0.N0;
                tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
                int iIntValue = ((Integer) CoreModule.c.m0.N0.get()).intValue();
                if ((!mqi0.m18535D((long) CoreModule.c.e0.p9().createdTime) || iIntValue < 10 || iIntValue % 5 != 0 || iIntValue >= 200) && (mqi0.m18535D((long) CoreModule.c.e0.p9().createdTime) || iIntValue != 10)) {
                    return;
                }
                CoreModule.c.m0.R0.onNext(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m1482k(C0062j.a aVar) {
        SwipeDirection swipeDirection = aVar.f875d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m1483l(final C0062j.a aVar, User user, boolean z, User user2, boolean z2, boolean z3, boolean z4, int i, User user3, Relationship relationship) {
        int i2;
        IdealInfo idealInfo;
        long jGuessedCurrentServerTime;
        int i3;
        int i4 = (NullChecker.a(aVar) && NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17131e()) && NullChecker.a(aVar.f874c.m17131e().intlInsertCardData)) ? aVar.f874c.m17131e().intlInsertCardData.cardType : 0;
        if (!user.isUltraPremium()) {
            if (z) {
                CoreModule.c.m0.L8(user2, user, i4);
            } else {
                CoreModule.c.m0.K8(user2, user, i4);
            }
        }
        C0029a.Companion companion = C0029a.INSTANCE;
        if (companion.m964j()) {
            hei0.b(aVar.f873b.act());
        }
        if (companion.m959e()) {
            a.INSTANCE.f(aVar.f873b.act(), false);
        }
        if (companion.m958d()) {
            xy5.a(aVar.f873b.act());
        }
        if (companion.m960f()) {
            long jLongValue = ((Long) CoreModule.c.e0.P0.get()).longValue();
            cp60 cp60Var = cp60.INSTANCE;
            if (jLongValue == cp60Var.k() && !((Boolean) cp60Var.x().get()).booleanValue() && cp60Var.d0() && !cp60Var.m(user2)) {
                cp60Var.f0();
                cp60Var.e0(aVar.f873b.act(), 1);
            }
        }
        if (companion.m961g()) {
            qff0.INSTANCE.m20949n(aVar.f873b.act(), 1);
        }
        if (companion.m963i()) {
            ubo.INSTANCE.m22784n(aVar.f873b.act(), 1);
        }
        m7e0.a(aVar.f873b);
        if (u59.d0()) {
            j8w.Companion.a().s1();
        }
        if (companion.m956b()) {
            wp0.INSTANCE.n(aVar.f872a.m19361T4(), ((Long) CoreModule.c.e0.P0.get()).longValue());
        }
        gj40 gj40Var = gj40.INSTANCE;
        if (gj40Var.m()) {
            gj40Var.q(aVar.f872a.m19361T4());
        }
        CoreModule.c.Y0.c(z || z2, relationship);
        if (ogl0.s() && !aVar.f878g) {
            ic50.m16316j().m16322f().m17391L(aVar.f872a.m19361T4(), true, new e30() { // from class: l.h6
                public final void call(Object obj) {
                    AbstractC0035a.m1474c(aVar, (String) obj);
                }
            });
        }
        if (!ogl0.u() && !aVar.f878g) {
            m1486o(CoreModule.c.B0, aVar, TEnum.equals(relationship.state, "matched"));
        }
        if (z3) {
            if (NullChecker.a(user) && NullChecker.a(user.location)) {
                i3 = user.location.distance;
                jGuessedCurrentServerTime = (long) ((qib0.H.guessedCurrentServerTime() - user.location.updatedTime) / 1000.0d);
            } else {
                jGuessedCurrentServerTime = 0;
                i3 = 0;
            }
            aVar.f877f.m2445b(new j760<>("distance_content", Integer.valueOf(i3)));
            aVar.f877f.m2445b(new j760<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
            aVar.f872a.m19348P8(aVar.f877f, "success");
        }
        CoreModule.c.H0.R++;
        if (z2 && !aVar.f873b.m1144K3() && !z4) {
            aVar.f873b.m1304o6(1300);
            rxg0.L(aVar.f873b.act());
        }
        if (ogl0.Z()) {
            if (z2 && i > 1) {
                rxg0.j().z(false, (String) null);
                rxg0.j().m = null;
                wge0.b bVarE = wge0.f().e(((DbObject) user).id);
                if (NullChecker.a(bVarE)) {
                    zvf0.D("e_send_superlike", aVar.f873b.m1310q2().pageId(), new j760[]{vwb.Y("other_user_id", ((DbObject) user).id), vwb.Y("superlike_quantity", Integer.valueOf(bVarE.c())), vwb.Y("superlike_types", bVarE.a() ? "click" : "combo")});
                }
            }
            wge0.f().h();
        }
        if (ezc0.m0()) {
            if (ezc0.i0().l0()) {
                CoreModule.c.G0.t3();
            } else if (ezc0.i0().h0()) {
                ezc0.i0().e0();
                if (!z && ezc0.i0().n0()) {
                    aVar.f873b.m1100B6(3000L);
                    ezc0.i0().r0(false);
                }
            }
        }
        if (ogl0.T()) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreModule.c.o2.f3();
                CoreModule.c.o2.d3();
            }
            CoreModule.c.o2.g3();
            CoreModule.c.o2.e3();
        }
        if (upa.Y1() && z && (idealInfo = aVar.f874c.m17131e().idealInfo) != null && !vwb.J(idealInfo.fitIdeals)) {
            if (mqi0.m18535D(((Long) CoreModule.c.r2.a0.get()).longValue())) {
                CoreModule.c.r2.b0.a(1);
            } else {
                CoreModule.c.r2.b0.put(1);
            }
            CoreModule.c.r2.a0.put(Long.valueOf(mqi0.m18550o()));
        }
        if (TEnum.equals(relationship.state, "matched")) {
            if (ogl0.U() || g6a.s()) {
                qsd0.INSTANCE.m21239e();
            }
            c cVar = CoreModule.c;
            CoreSuggested coreSuggested = cVar.m0;
            coreSuggested.O1 = 0;
            coreSuggested.y0 = 0;
            coreSuggested.A0 = 0;
            coreSuggested.z0 = 0;
            coreSuggested.G0 = 0;
            cVar.Y0.t = 0;
            if (!relationship.status.contains(MatchFrom.get("xmasActivity"))) {
                if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "letter")) {
                    boolean z5 = NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.relationshipExtensions) && !TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherLetter);
                    i2 = (z5 && z4) ? 39 : z5 ? 37 : 38;
                } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
                    i2 = 13;
                } else if ((relationship.status.size() == 0 || !TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) && !user.superLikedMe()) {
                    if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) {
                        i2 = 1;
                    } else if (q8p.Companion.m(aVar.f874c.m17131e())) {
                        i2 = 47;
                    } else if (z2) {
                        i2 = 12;
                    } else {
                        i2 = 0;
                    }
                } else if (z2 && !user.superLikedMe()) {
                    i2 = 12;
                } else if (z2 && user.superLikedMe()) {
                    i2 = 13;
                } else {
                    i2 = 11;
                }
                if (u59.f0()) {
                    CoreModule.c.f0.Fo();
                }
                boolean zIsFemale = CoreModule.c.e0.p9().isFemale();
                ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = aVar.f873b;
                if (zIsFemale) {
                    abi.J(viewTreeObserverOnGlobalLayoutListenerC0030b.act(), user);
                    if (!IntlCountryCodeController.v()) {
                        mgh0.m18465s();
                    }
                    if (i2 == 13 && mx0.o().B()) {
                        if (ogl0.F()) {
                            ic50.m16316j().m16322f().m17407b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
                        }
                        mx0.I(aVar.f873b.act(), false, 5.0f, "superlike");
                    }
                } else if (NullChecker.a(viewTreeObserverOnGlobalLayoutListenerC0030b.m1310q2())) {
                    Intent intentG2 = MatchAct.g2(aVar.f873b.act(), vwb.f0(new String[]{((DbObject) user).id}), i2, (ArrayList) relationship.scenarios, (upa.S1() || upa.j2()) ? "tmp_from_home_swipe" : null);
                    intentG2.putExtra("picks_guide_bubble_user", (Serializable) null);
                    intentG2.putExtra("picks_guide_bubble_direction", 0);
                    aVar.f873b.m1310q2().w4(intentG2, upa.n3() ? new MatchAct.a() : new MatchAct.b());
                    if (CoreModule.N().ko()) {
                        p1i.m20075c().f18320a = true;
                    }
                    if (upa.d3()) {
                        CoreModule.c.f0.Fo();
                    }
                }
            }
        } else {
            if (z) {
                CoreSuggested coreSuggested2 = CoreModule.c.m0;
                coreSuggested2.y0++;
                coreSuggested2.z0++;
                coreSuggested2.G0++;
                coreSuggested2.O1++;
                coreSuggested2.P1 = 0;
                coreSuggested2.A0++;
                if (ogl0.U()) {
                    if (z) {
                        qsd0.INSTANCE.m21238d();
                    }
                    qsd0 qsd0Var = qsd0.INSTANCE;
                    if (qsd0Var.m21235a()) {
                        qsd0Var.m21237c();
                    }
                }
                if (g6a.s() && z) {
                    qsd0 qsd0Var2 = qsd0.INSTANCE;
                    qsd0Var2.m21238d();
                    if (qsd0Var2.m21235a()) {
                        qsd0Var2.m21237c();
                    }
                }
            } else {
                CoreSuggested coreSuggested3 = CoreModule.c.m0;
                coreSuggested3.P1++;
                coreSuggested3.A0 = 0;
            }
            m1478g();
            if (!aVar.f878g && CoreModule.c.m0.z0 >= 10 && aVar.f872a.m19416d9(user3)) {
                aVar.f878g = true;
                CoreModule.c.m0.B0.onNext(roj0.a);
            }
            CoreSuggested coreSuggested4 = CoreModule.c.m0;
            if (coreSuggested4.G0 >= 5) {
                coreSuggested4.I0.onNext(roj0.a);
            }
            if (!aVar.f878g && CoreModule.c.H0.R >= 30 && !((Boolean) aVar.f872a.f17716x.get()).booleanValue() && swh0.v() && swh0.P() && qqi0.h(mqi0.m18550o(), ((Long) CoreModule.c.J0.U.get()).longValue(), 1)) {
                aVar.f878g = true;
                aVar.f872a.f17714v.onNext(roj0.a);
            }
            if (com.p1.mobile.putong.core.ui.match.a.w().L()) {
                aVar.f873b.m1275i6();
            }
            if (z2 && i > 1) {
                rxg0.F(aVar.f873b.act(), user);
            }
            for (Media media : user.pictures) {
                if (vdj.c()) {
                    if (!TextUtils.isEmpty(aVar.f872a.m19460n5()) && !aVar.f872a.m19460n5().equals(zub.m25966f(media).formatted())) {
                        qib0.G.R(aVar.f872a.m19460n5());
                    }
                    aVar.f872a.m19360S8(zub.m25966f(media).formatted());
                } else {
                    qib0.G.R(zub.m25966f(media).formatted());
                }
            }
        }
        if (!CoreModule.N().ko() || !this.f835e || p1i.m20075c().f18320a || aVar.f878g || aVar.f872a.m19361T4().isDialogShowing() || !aVar.f873b.act().m3888e6(TabName.Card)) {
            return;
        }
        aVar.f878g = true;
        CoreModule.N().cj(aVar.f873b.act(), "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m1484m(C0062j.a aVar, boolean z, Throwable th) {
        if (CoreModule.N().ko() && this.f835e && !p1i.m20075c().f18320a && !aVar.f878g && !aVar.f872a.m19361T4().isDialogShowing() && aVar.f873b.act().m3888e6(TabName.Card)) {
            aVar.f878g = true;
            CoreModule.N().cj(aVar.f873b.act(), "p_suggest_users_home_view");
        }
        if (z) {
            aVar.f872a.m19344O8(aVar.f877f, th);
        }
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: n */
    public User m1485n() {
        return CoreModule.c.e0.p9();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1486o(d0 d0Var, C0062j.a aVar, boolean z) {
        return false;
    }
}
