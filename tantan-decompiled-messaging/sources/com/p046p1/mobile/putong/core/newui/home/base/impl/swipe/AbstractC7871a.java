package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.C4735d0;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.MissMatch;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.C7865a;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.AbstractC7871a;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.likeminded.C8411a;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p149l.abi;
import p149l.cp60;
import p149l.e30;
import p149l.ezc0;
import p149l.g6a;
import p149l.gj40;
import p149l.hei0;
import p149l.ic50;
import p149l.j760;
import p149l.j8w;
import p149l.m7e0;
import p149l.mgh0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.mx0;
import p149l.n3b0;
import p149l.ogl0;
import p149l.p1i;
import p149l.p3m;
import p149l.q8p;
import p149l.qff0;
import p149l.qib0;
import p149l.qqi0;
import p149l.qsd0;
import p149l.roj0;
import p149l.rvi0;
import p149l.rxg0;
import p149l.swh0;
import p149l.tpd0;
import p149l.u59;
import p149l.ubo;
import p149l.upa;
import p149l.vdj;
import p149l.vwb;
import p149l.wge0;
import p149l.wp0;
import p149l.xy5;
import p149l.yij0;
import p149l.zpd0;
import p149l.zub;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC7871a implements p3m<C7898j.a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final tpd0 f22053a = new tpd0("profile_purpose_dialog_show_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public final zpd0 f22054b = new zpd0("profile_purpose_dialog_last_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public final long f22055c = AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;

    /* JADX INFO: renamed from: d */
    public boolean f22056d = false;

    /* JADX INFO: renamed from: e */
    public boolean f22057e = false;

    /* JADX INFO: renamed from: f */
    public boolean f22058f = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m37503c(C7898j.a aVar, String str) {
        aVar.f22100g = true;
        CoreModule.f17545c.f19622Y0.f94275t = 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m37506f(MissMatch missMatch) {
        if (((int) ((mqi0.m155943n() - qqi0.m175935c((long) CoreModule.f17545c.f19639e0.m169527p9().createdTime)) / 86400000)) >= missMatch.actived_duration && CoreModule.f17545c.f19663m0.f19365Q0.get().intValue() >= 0 && !missMatch.interval_day.isEmpty()) {
            double dDoubleValue = missMatch.interval_day.get(Math.max(Math.min(CoreModule.f17545c.f19663m0.f19365Q0.get().intValue() - 1, missMatch.interval_day.size() - 1), 0)).doubleValue();
            if (dDoubleValue < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return false;
            }
            if (mqi0.m155944o() - CoreModule.f17545c.f19663m0.f19363P0.get().longValue() >= TimeUnit.MILLISECONDS.convert((int) (dDoubleValue * 24.0d), TimeUnit.HOURS)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m37507g() {
        if (CoreModule.m29935P().m94651a().mo33484dj()) {
            int iM194798p0 = upa.m194798p0();
            int iM194803q0 = upa.m194803q0();
            if (((iM194798p0 <= 0 || CoreModule.f17545c.f19663m0.f19364P1 != iM194798p0) && (iM194803q0 <= 0 || CoreModule.f17545c.f19663m0.f19362O1 != iM194803q0)) || CoreModule.f17545c.f19639e0.f149200J4.get().intValue() >= upa.m194793o0() || CoreModule.f17545c.f19639e0.m169472b8(false) || mqi0.m155929D(CoreModule.f17545c.f19639e0.f149235O4.get().longValue()) || upa.m194788n0() <= 0 || upa.m194793o0() <= 0 || mqi0.m155944o() - CoreModule.f17545c.f19639e0.f149207K4.get().longValue() < ((long) (upa.m194788n0() * 24)) * 3600000) {
                return;
            }
            CoreModule.f17545c.f19639e0.f149235O4.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19639e0.f149207K4.put(Long.valueOf(mqi0.m155944o()));
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149200J4;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.MarryAdCard;
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public Counter m37508h() {
        return CoreModule.f17545c.m31484o3();
    }

    /* JADX INFO: renamed from: i */
    public void m37509i(final boolean z, final boolean z2, User user, final User user2, Map<String, String> map, final User user3, final boolean z3, boolean z4, boolean z5, final C7898j.a aVar) {
        final User user4;
        SwipeDirection swipeDirection;
        if (upa.m194628E1() && NullChecker.m81303a(user2) && NullChecker.m81303a(user)) {
            user4 = user;
            if (TextUtils.equals(user2.f56011id, user4.f56011id)) {
                return;
            }
        } else {
            user4 = user;
        }
        aVar.f22099f.m38470e(map);
        boolean z6 = u59.m191827f0() && aVar.f22094a.m161235j6(aVar.f22096c.m141745d().f56011id);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        if (upa.m194628E1() && NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141746e()) && NullChecker.m81303a(aVar.f22096c.m141746e().cityCData) && TextUtils.equals(aVar.f22096c.m141746e().cityCData.userId, aVar.f22096c.m141746e().f19472id)) {
            likeExtraDataNew_.status = MatchFrom.get(MatchFrom.cityC);
        }
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z4).matchSource((z5 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user2).pageId("p_suggest_users_home_view").build();
        CoreModule.f17545c.f19663m0.f19409f0 = aVar.f22096c.m141746e();
        if (CoreModule.m29934N().mo60365ko() && CoreModule.m29934N().mo60401xa("p_suggest_users_home_view")) {
            this.f22057e = false;
            p1i.m167059c().f146680a = false;
            p1i.m167059c().m167064f();
            if (!aVar.f22100g && !aVar.f22095b.act().isDialogShowing() && aVar.f22095b.act().m39812e6(TabName.Card)) {
                this.f22057e = p1i.m167059c().m167061b();
            }
        } else {
            this.f22057e = false;
        }
        if (upa.m194758h0().enable && ((swipeDirection = aVar.f22097d) == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP)) {
            rvi0.m181297h();
            CoreModule.f17545c.f19639e0.f149227N3.onNext(roj0.f160388a);
        }
        final int iM203037d = wge0.m203034f().m203037d(user2.f56011id);
        final boolean z7 = z6;
        CoreModule.f17545c.f19663m0.m31081a8(z, z2, map, null, aVar.f22094a.f140370Q, LikeFrom.get("home"), true, likeExtraDataNew_, aVar.f22099f.m38474i(), null, true, iM203037d, false).subscribe(mkd0.m154956H(new e30() { // from class: l.f6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f95216a.m37512l(aVar, user2, z, user4, z2, z3, z7, iM203037d, user3, (Relationship) obj);
            }
        }, new e30() { // from class: l.g6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101213a.m37513m(aVar, z3, (Throwable) obj);
            }
        }));
        m37510j(z);
        if (NullChecker.m81303a(aVar.f22095b.f21888M)) {
            int size = aVar.f22095b.f21888M.f22250c.size();
            if (size == 6) {
                qib0.f154687E.m78869u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                aVar.f22094a.m161129L8(false);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m37510j(boolean z) {
        MissMatch missMatchM200499E = CoreModule.f17546d.m200499E();
        if (missMatchM200499E != null && !z && TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "male") && n3b0.m157742q()) {
            if ((missMatchM200499E.num_limited_left == 0 || CoreModule.f17545c.f19663m0.f19365Q0.get().intValue() < missMatchM200499E.num_limited_left) && m37506f(missMatchM200499E)) {
                long jLongValue = CoreModule.f17545c.f19663m0.f19361O0.get().longValue();
                if (!mqi0.m155929D(jLongValue) && jLongValue < mqi0.m155944o()) {
                    CoreModule.f17545c.f19663m0.f19359N0.put(0);
                    CoreModule.f17545c.f19663m0.f19361O0.put(Long.valueOf(mqi0.m155944o()));
                }
                tpd0 tpd0Var = CoreModule.f17545c.f19663m0.f19359N0;
                tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
                int iIntValue = CoreModule.f17545c.f19663m0.f19359N0.get().intValue();
                if ((!mqi0.m155929D((long) CoreModule.f17545c.f19639e0.m169527p9().createdTime) || iIntValue < 10 || iIntValue % 5 != 0 || iIntValue >= 200) && (mqi0.m155929D((long) CoreModule.f17545c.f19639e0.m169527p9().createdTime) || iIntValue != 10)) {
                    return;
                }
                CoreModule.f17545c.f19663m0.f19368R0.onNext(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m37511k(C7898j.a aVar) {
        SwipeDirection swipeDirection = aVar.f22097d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m37512l(final C7898j.a aVar, User user, boolean z, User user2, boolean z2, boolean z3, boolean z4, int i, User user3, Relationship relationship) {
        int i2;
        IdealInfo idealInfo;
        long jGuessedCurrentServerTime;
        int i3;
        int i4 = (NullChecker.m81303a(aVar) && NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141746e()) && NullChecker.m81303a(aVar.f22096c.m141746e().intlInsertCardData)) ? aVar.f22096c.m141746e().intlInsertCardData.cardType : 0;
        if (!user.isUltraPremium()) {
            if (z) {
                CoreModule.f17545c.f19663m0.m31022L8(user2, user, i4);
            } else {
                CoreModule.f17545c.f19663m0.m31018K8(user2, user, i4);
            }
        }
        C7865a.Companion aVar2 = C7865a.INSTANCE;
        if (aVar2.m36997j()) {
            hei0.m130637b(aVar.f22095b.act());
        }
        if (aVar2.m36992e()) {
            C8411a.INSTANCE.m46885f(aVar.f22095b.act(), false);
        }
        if (aVar2.m36991d()) {
            xy5.m211723a(aVar.f22095b.act());
        }
        if (aVar2.m36993f()) {
            long jLongValue = CoreModule.f17545c.f19639e0.f149238P0.get().longValue();
            cp60 cp60Var = cp60.INSTANCE;
            if (jLongValue == cp60Var.m108097k() && !cp60Var.m108110x().get().booleanValue() && cp60Var.m108085d0() && !cp60Var.m108099m(user2)) {
                cp60Var.m108089f0();
                cp60Var.m108087e0(aVar.f22095b.act(), 1);
            }
        }
        if (aVar2.m36994g()) {
            qff0.INSTANCE.m174302n(aVar.f22095b.act(), 1);
        }
        if (aVar2.m36996i()) {
            ubo.INSTANCE.m192893n(aVar.f22095b.act(), 1);
        }
        m7e0.m153366a(aVar.f22095b);
        if (u59.m191823d0()) {
            j8w.INSTANCE.m140473a().m140465s1();
        }
        if (aVar2.m36989b()) {
            wp0.INSTANCE.m204892n(aVar.f22094a.m161157T4(), CoreModule.f17545c.f19639e0.f149238P0.get().longValue());
        }
        gj40 gj40Var = gj40.INSTANCE;
        if (gj40Var.m126451m()) {
            gj40Var.m126455q(aVar.f22094a.m161157T4());
        }
        CoreModule.f17545c.f19622Y0.m119253c(z || z2, relationship);
        if (ogl0.m164266s() && !aVar.f22100g) {
            ic50.m135327j().m135333f().m145225L(aVar.f22094a.m161157T4(), true, new e30() { // from class: l.h6
                @Override // p149l.e30
                public final void call(Object obj) {
                    AbstractC7871a.m37503c(aVar, (String) obj);
                }
            });
        }
        if (!ogl0.m164268u() && !aVar.f22100g) {
            m37515o(CoreModule.f17545c.f19552B0, aVar, TEnum.equals(relationship.state, "matched"));
        }
        if (z3) {
            if (NullChecker.m81303a(user) && NullChecker.m81303a(user.location)) {
                i3 = user.location.distance;
                jGuessedCurrentServerTime = (long) ((qib0.f154693H.guessedCurrentServerTime() - user.location.updatedTime) / 1000.0d);
            } else {
                jGuessedCurrentServerTime = 0;
                i3 = 0;
            }
            aVar.f22099f.m38467b(new j760<>("distance_content", Integer.valueOf(i3)));
            aVar.f22099f.m38467b(new j760<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
            aVar.f22094a.m161144P8(aVar.f22099f, "success");
        }
        CoreModule.f17545c.f19570H0.f193796R++;
        if (z2 && !aVar.f22095b.m37176K3() && !z4) {
            aVar.f22095b.m37335o6(1300);
            rxg0.m181562L(aVar.f22095b.act());
        }
        if (ogl0.m164247Z()) {
            if (z2 && i > 1) {
                rxg0.m181572j().m181598z(false, null);
                rxg0.m181572j().f161468m = null;
                wge0.C20873b c20873bM203038e = wge0.m203034f().m203038e(user.f56011id);
                if (NullChecker.m81303a(c20873bM203038e)) {
                    zvf0.m220371D("e_send_superlike", aVar.f22095b.m37341q2().pageId(), vwb.m200311Y("other_user_id", user.f56011id), vwb.m200311Y("superlike_quantity", Integer.valueOf(c20873bM203038e.getSuperLikeCount())), vwb.m200311Y("superlike_types", c20873bM203038e.getClick() ? "click" : "combo"));
                }
            }
            wge0.m203034f().m203039h();
        }
        if (ezc0.m118907m0()) {
            if (ezc0.m118906i0().m118915l0()) {
                CoreModule.f17545c.f19567G0.m172213t3();
            } else if (ezc0.m118906i0().getCanGuideUndoTips()) {
                ezc0.m118906i0().m118909e0();
                if (!z && ezc0.m118906i0().m118916n0()) {
                    aVar.f22095b.m37133B6(3000L);
                    ezc0.m118906i0().m118919r0(false);
                }
            }
        }
        if (ogl0.m164241T()) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreModule.f17545c.f19671o2.m154146f3();
                CoreModule.f17545c.f19671o2.m154144d3();
            }
            CoreModule.f17545c.f19671o2.m154147g3();
            CoreModule.f17545c.f19671o2.m154145e3();
        }
        if (upa.m194718Y1() && z && (idealInfo = aVar.f22096c.m141746e().idealInfo) != null && !vwb.m200296J(idealInfo.fitIdeals)) {
            if (mqi0.m155929D(CoreModule.f17545c.f19680r2.f113520a0.get().longValue())) {
                CoreModule.f17545c.f19680r2.f113521b0.m189988a(1);
            } else {
                CoreModule.f17545c.f19680r2.f113521b0.put(1);
            }
            CoreModule.f17545c.f19680r2.f113520a0.put(Long.valueOf(mqi0.m155944o()));
        }
        if (TEnum.equals(relationship.state, "matched")) {
            if (ogl0.m164242U() || g6a.m124570s()) {
                qsd0.INSTANCE.m176231e();
            }
            C4732c c4732c = CoreModule.f17545c;
            CoreSuggested coreSuggested = c4732c.f19663m0;
            coreSuggested.f19362O1 = 0;
            coreSuggested.f19466y0 = 0;
            coreSuggested.f19320A0 = 0;
            coreSuggested.f19469z0 = 0;
            coreSuggested.f19338G0 = 0;
            c4732c.f19622Y0.f94275t = 0;
            if (!relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
                if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "letter")) {
                    boolean z5 = NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.relationshipExtensions) && !TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherLetter);
                    i2 = (z5 && z4) ? 39 : z5 ? 37 : 38;
                } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                    i2 = 13;
                } else if ((relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) && !user.superLikedMe()) {
                    if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                        i2 = 1;
                    } else if (q8p.INSTANCE.m173438m(aVar.f22096c.m141746e())) {
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
                if (u59.m191827f0()) {
                    CoreModule.f17545c.f19642f0.m32650Fo();
                }
                boolean zIsFemale = CoreModule.f17545c.f19639e0.m169527p9().isFemale();
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = aVar.f22095b;
                if (zIsFemale) {
                    abi.m95622J(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), user);
                    if (!IntlCountryCodeController.m28126v()) {
                        mgh0.m154563s();
                    }
                    if (i2 == 13 && mx0.m156802o().m156804B()) {
                        if (ogl0.m164227F()) {
                            ic50.m135327j().m135333f().m145241b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
                        }
                        mx0.m156782I(aVar.f22095b.act(), false, 5.0f, "superlike");
                    }
                } else if (NullChecker.m81303a(viewTreeObserverOnGlobalLayoutListenerC7866b.m37341q2())) {
                    Intent intentM47564g2 = MatchAct.m47564g2(aVar.f22095b.act(), vwb.m200324f0(user.f56011id), i2, (ArrayList) relationship.scenarios, (upa.m194694S1() || upa.m194770j2()) ? "tmp_from_home_swipe" : null);
                    intentM47564g2.putExtra("picks_guide_bubble_user", (Serializable) null);
                    intentM47564g2.putExtra("picks_guide_bubble_direction", 0);
                    aVar.f22095b.m37341q2().m20603w4(intentM47564g2, upa.m194791n3() ? new MatchAct.C8453a() : new MatchAct.C8454b());
                    if (CoreModule.m29934N().mo60365ko()) {
                        p1i.m167059c().f146680a = true;
                    }
                    if (upa.m194741d3()) {
                        CoreModule.f17545c.f19642f0.m32650Fo();
                    }
                }
            }
        } else {
            if (z) {
                CoreSuggested coreSuggested2 = CoreModule.f17545c.f19663m0;
                coreSuggested2.f19466y0++;
                coreSuggested2.f19469z0++;
                coreSuggested2.f19338G0++;
                coreSuggested2.f19362O1++;
                coreSuggested2.f19364P1 = 0;
                coreSuggested2.f19320A0++;
                if (ogl0.m164242U()) {
                    if (z) {
                        qsd0.INSTANCE.m176230d();
                    }
                    qsd0 qsd0Var = qsd0.INSTANCE;
                    if (qsd0Var.m176227a()) {
                        qsd0Var.m176229c();
                    }
                }
                if (g6a.m124570s() && z) {
                    qsd0 qsd0Var2 = qsd0.INSTANCE;
                    qsd0Var2.m176230d();
                    if (qsd0Var2.m176227a()) {
                        qsd0Var2.m176229c();
                    }
                }
            } else {
                CoreSuggested coreSuggested3 = CoreModule.f17545c.f19663m0;
                coreSuggested3.f19364P1++;
                coreSuggested3.f19320A0 = 0;
            }
            m37507g();
            if (!aVar.f22100g && CoreModule.f17545c.f19663m0.f19469z0 >= 10 && aVar.f22094a.m161210d9(user3)) {
                aVar.f22100g = true;
                CoreModule.f17545c.f19663m0.f19323B0.onNext(roj0.f160388a);
            }
            CoreSuggested coreSuggested4 = CoreModule.f17545c.f19663m0;
            if (coreSuggested4.f19338G0 >= 5) {
                coreSuggested4.f19344I0.onNext(roj0.f160388a);
            }
            if (!aVar.f22100g && CoreModule.f17545c.f19570H0.f193796R >= 30 && !aVar.f22094a.f140406x.get().booleanValue() && swh0.m186269v() && swh0.m186210P() && qqi0.m175940h(mqi0.m155944o(), CoreModule.f17545c.f19576J0.f115743U.get().longValue(), 1)) {
                aVar.f22100g = true;
                aVar.f22094a.f140404v.onNext(roj0.f160388a);
            }
            if (C8455a.m47588w().m47600L()) {
                aVar.f22095b.m37306i6();
            }
            if (z2 && i > 1) {
                rxg0.m181559F(aVar.f22095b.act(), user);
            }
            for (Media media : user.pictures) {
                if (vdj.m198001c()) {
                    if (!TextUtils.isEmpty(aVar.f22094a.m161254n5()) && !aVar.f22094a.m161254n5().equals(zub.m220207f(media).formatted())) {
                        qib0.f154691G.m102342R(aVar.f22094a.m161254n5());
                    }
                    aVar.f22094a.m161156S8(zub.m220207f(media).formatted());
                } else {
                    qib0.f154691G.m102342R(zub.m220207f(media).formatted());
                }
            }
        }
        if (!CoreModule.m29934N().mo60365ko() || !this.f22057e || p1i.m167059c().f146680a || aVar.f22100g || aVar.f22094a.m161157T4().isDialogShowing() || !aVar.f22095b.act().m39812e6(TabName.Card)) {
            return;
        }
        aVar.f22100g = true;
        CoreModule.m29934N().mo60343cj(aVar.f22095b.act(), "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m37513m(C7898j.a aVar, boolean z, Throwable th) {
        if (CoreModule.m29934N().mo60365ko() && this.f22057e && !p1i.m167059c().f146680a && !aVar.f22100g && !aVar.f22094a.m161157T4().isDialogShowing() && aVar.f22095b.act().m39812e6(TabName.Card)) {
            aVar.f22100g = true;
            CoreModule.m29934N().mo60343cj(aVar.f22095b.act(), "p_suggest_users_home_view");
        }
        if (z) {
            aVar.f22094a.m161140O8(aVar.f22099f, th);
        }
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: n */
    public User m37514n() {
        return CoreModule.f17545c.f19639e0.m169527p9();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m37515o(C4735d0 c4735d0, C7898j.a aVar, boolean z) {
        return false;
    }
}
