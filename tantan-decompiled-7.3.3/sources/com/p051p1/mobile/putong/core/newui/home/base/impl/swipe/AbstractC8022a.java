package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.C4886d0;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.MissMatch;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.C8016a;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.AbstractC8022a;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.likeminded.C8574a;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p153l.a5i0;
import p153l.bpe0;
import p153l.bsj0;
import p153l.byd0;
import p153l.c06;
import p153l.d79;
import p153l.e3i;
import p153l.g6m;
import p153l.gra;
import p153l.h7d0;
import p153l.haw;
import p153l.hni0;
import p153l.i4g0;
import p153l.ix60;
import p153l.jyb;
import p153l.nwb;
import p153l.pci;
import p153l.pf60;
import p153l.pgj;
import p153l.pk50;
import p153l.psd0;
import p153l.pzi0;
import p153l.qap;
import p153l.rbb0;
import p153l.rfe0;
import p153l.s0e0;
import p153l.s7a;
import p153l.sp0;
import p153l.spl0;
import p153l.toh0;
import p153l.tx0;
import p153l.tzi0;
import p153l.udo;
import p153l.uqb0;
import p153l.ur40;
import p153l.uxj0;
import p153l.v4j0;
import p153l.vxd0;
import p153l.xnf0;
import p153l.y20;
import p153l.z5h0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC8022a implements g6m<C8049j.a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final vxd0 f22795a = new vxd0("profile_purpose_dialog_show_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public final byd0 f22796b = new byd0("profile_purpose_dialog_last_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public final long f22797c = AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;

    /* JADX INFO: renamed from: d */
    public boolean f22798d = false;

    /* JADX INFO: renamed from: e */
    public boolean f22799e = false;

    /* JADX INFO: renamed from: f */
    public boolean f22800f = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m38506c(C8049j.a aVar, String str) {
        aVar.f22842g = true;
        CoreModule.f18264c.f20364Y0.f161178t = 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m38509f(MissMatch missMatch) {
        if (((int) ((pzi0.m174453n() - tzi0.m193665c((long) CoreModule.f18264c.f20381e0.m116600p9().createdTime)) / 86400000)) >= missMatch.actived_duration && CoreModule.f18264c.f20405m0.f20107Q0.get().intValue() >= 0 && !missMatch.interval_day.isEmpty()) {
            double dDoubleValue = missMatch.interval_day.get(Math.max(Math.min(CoreModule.f18264c.f20405m0.f20107Q0.get().intValue() - 1, missMatch.interval_day.size() - 1), 0)).doubleValue();
            if (dDoubleValue < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return false;
            }
            if (pzi0.m174454o() - CoreModule.f18264c.f20405m0.f20105P0.get().longValue() >= TimeUnit.MILLISECONDS.convert((int) (dDoubleValue * 24.0d), TimeUnit.HOURS)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m38510g() {
        if (CoreModule.m30933P().m143405a().mo34487dj()) {
            int iM131729p0 = gra.m131729p0();
            int iM131734q0 = gra.m131734q0();
            if (((iM131729p0 <= 0 || CoreModule.f18264c.f20405m0.f20106P1 != iM131729p0) && (iM131734q0 <= 0 || CoreModule.f18264c.f20405m0.f20104O1 != iM131734q0)) || CoreModule.f18264c.f20381e0.f89057J4.get().intValue() >= gra.m131724o0() || CoreModule.f18264c.f20381e0.m116545b8(false) || pzi0.m174439D(CoreModule.f18264c.f20381e0.f89092O4.get().longValue()) || gra.m131719n0() <= 0 || gra.m131724o0() <= 0 || pzi0.m174454o() - CoreModule.f18264c.f20381e0.f89064K4.get().longValue() < ((long) (gra.m131719n0() * 24)) * 3600000) {
                return;
            }
            CoreModule.f18264c.f20381e0.f89092O4.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20381e0.f89064K4.put(Long.valueOf(pzi0.m174454o()));
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89057J4;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.MarryAdCard;
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public Counter m38511h() {
        return CoreModule.f18264c.m32487o3();
    }

    /* JADX INFO: renamed from: i */
    public void m38512i(final boolean z, final boolean z2, User user, final User user2, Map<String, String> map, final User user3, final boolean z3, boolean z4, boolean z5, final C8049j.a aVar) {
        final User user4;
        SwipeDirection swipeDirection;
        if (gra.m131559E1() && NullChecker.m82486a(user2) && NullChecker.m82486a(user)) {
            user4 = user;
            if (TextUtils.equals(user2.f56859id, user4.f56859id)) {
                return;
            }
        } else {
            user4 = user;
        }
        aVar.f22841f.m39473e(map);
        boolean z6 = d79.m114685j0() && aVar.f22836a.m102029j6(aVar.f22838c.m140259d().f56859id);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        if (gra.m131559E1() && NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140260e()) && NullChecker.m82486a(aVar.f22838c.m140260e().cityCData) && TextUtils.equals(aVar.f22838c.m140260e().cityCData.userId, aVar.f22838c.m140260e().f20214id)) {
            likeExtraDataNew_.status = MatchFrom.get(MatchFrom.cityC);
        }
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z4).matchSource((z5 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user2).pageId("p_suggest_users_home_view").build();
        CoreModule.f18264c.f20405m0.f20151f0 = aVar.f22838c.m140260e();
        if (CoreModule.m30932N().mo61549ko() && CoreModule.m30932N().mo61585xa("p_suggest_users_home_view")) {
            this.f22799e = false;
            e3i.m119288c().f91959a = false;
            e3i.m119288c().m119293f();
            if (!aVar.f22842g && !aVar.f22837b.act().isDialogShowing() && aVar.f22837b.act().m40820i6(TabName.Card)) {
                this.f22799e = e3i.m119288c().m119290b();
            }
        } else {
            this.f22799e = false;
        }
        if (gra.m131689h0().enable && ((swipeDirection = aVar.f22839d) == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP)) {
            v4j0.m199710h();
            CoreModule.f18264c.f20381e0.f89084N3.onNext(uxj0.f181467a);
        }
        final int iM105817d = bpe0.m105814f().m105817d(user2.f56859id);
        final boolean z7 = z6;
        CoreModule.f18264c.f20405m0.m32084a8(z, z2, map, null, aVar.f22836a.f74522Q, LikeFrom.get("home"), true, likeExtraDataNew_, aVar.f22841f.m39477i(), null, true, iM105817d, false).subscribe(psd0.m173597H(new y20() { // from class: l.c6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79912a.m38515l(aVar, user2, z, user4, z2, z3, z7, iM105817d, user3, (Relationship) obj);
            }
        }, new y20() { // from class: l.d6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85222a.m38516m(aVar, z3, (Throwable) obj);
            }
        }));
        m38513j(z);
        if (NullChecker.m82486a(aVar.f22837b.f22630M)) {
            int size = aVar.f22837b.f22630M.f22992c.size();
            if (size == 6) {
                uqb0.f180370E.m80052u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                aVar.f22836a.m101923L8(false);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m38513j(boolean z) {
        MissMatch missMatchM217945E = CoreModule.f18265d.m217945E();
        if (missMatchM217945E != null && !z && TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "male") && rbb0.m180744q()) {
            if ((missMatchM217945E.num_limited_left == 0 || CoreModule.f18264c.f20405m0.f20107Q0.get().intValue() < missMatchM217945E.num_limited_left) && m38509f(missMatchM217945E)) {
                long jLongValue = CoreModule.f18264c.f20405m0.f20103O0.get().longValue();
                if (!pzi0.m174439D(jLongValue) && jLongValue < pzi0.m174454o()) {
                    CoreModule.f18264c.f20405m0.f20101N0.put(0);
                    CoreModule.f18264c.f20405m0.f20103O0.put(Long.valueOf(pzi0.m174454o()));
                }
                vxd0 vxd0Var = CoreModule.f18264c.f20405m0.f20101N0;
                vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
                int iIntValue = CoreModule.f18264c.f20405m0.f20101N0.get().intValue();
                if ((!pzi0.m174439D((long) CoreModule.f18264c.f20381e0.m116600p9().createdTime) || iIntValue < 10 || iIntValue % 5 != 0 || iIntValue >= 200) && (pzi0.m174439D((long) CoreModule.f18264c.f20381e0.m116600p9().createdTime) || iIntValue != 10)) {
                    return;
                }
                CoreModule.f18264c.f20405m0.f20110R0.onNext(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m38514k(C8049j.a aVar) {
        SwipeDirection swipeDirection = aVar.f22839d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m38515l(final C8049j.a aVar, User user, boolean z, User user2, boolean z2, boolean z3, boolean z4, int i, User user3, Relationship relationship) {
        int i2;
        IdealInfo idealInfo;
        long jGuessedCurrentServerTime;
        int i3;
        int i4 = (NullChecker.m82486a(aVar) && NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140260e()) && NullChecker.m82486a(aVar.f22838c.m140260e().intlInsertCardData)) ? aVar.f22838c.m140260e().intlInsertCardData.cardType : 0;
        if (!user.isUltraPremium()) {
            if (z) {
                CoreModule.f18264c.f20405m0.m32025L8(user2, user, i4);
            } else {
                CoreModule.f18264c.f20405m0.m32021K8(user2, user, i4);
            }
        }
        C8016a.Companion aVar2 = C8016a.INSTANCE;
        if (aVar2.m38000j()) {
            hni0.m136117b(aVar.f22837b.act());
        }
        if (aVar2.m37995e()) {
            C8574a.INSTANCE.m48068f(aVar.f22837b.act(), false);
        }
        if (aVar2.m37994d()) {
            c06.m107341a(aVar.f22837b.act());
        }
        if (aVar2.m37996f()) {
            long jLongValue = CoreModule.f18264c.f20381e0.f89095P0.get().longValue();
            ix60 ix60Var = ix60.INSTANCE;
            if (jLongValue == ix60Var.m142480k() && !ix60Var.m142493x().get().booleanValue() && ix60Var.m142468d0() && !ix60Var.m142482m(user2)) {
                ix60Var.m142472f0();
                ix60Var.m142470e0(aVar.f22837b.act(), 1);
            }
        }
        if (aVar2.m37997g()) {
            xnf0.INSTANCE.m212196n(aVar.f22837b.act(), 1);
        }
        if (aVar2.m37999i()) {
            udo.INSTANCE.m195514n(aVar.f22837b.act(), 1);
        }
        rfe0.m181169a(aVar.f22837b);
        if (d79.m114675e0()) {
            haw.INSTANCE.m134320a().m134312s1();
        }
        if (aVar2.m37992b()) {
            sp0.INSTANCE.m187300n(aVar.f22836a.m101951T4(), CoreModule.f18264c.f20381e0.f89095P0.get().longValue());
        }
        ur40 ur40Var = ur40.INSTANCE;
        if (ur40Var.m197469m()) {
            ur40Var.m197473q(aVar.f22836a.m101951T4());
        }
        CoreModule.f18264c.f20364Y0.m179744c(z || z2, relationship);
        if (spl0.m187393s() && !aVar.f22842g) {
            pk50.m172568j().m172574f().m181648L(aVar.f22836a.m101951T4(), true, new y20() { // from class: l.e6
                @Override // p153l.y20
                public final void call(Object obj) {
                    AbstractC8022a.m38506c(aVar, (String) obj);
                }
            });
        }
        if (!spl0.m187395u() && !aVar.f22842g) {
            m38518o(CoreModule.f18264c.f20294B0, aVar, TEnum.equals(relationship.state, "matched"));
        }
        if (z3) {
            if (NullChecker.m82486a(user) && NullChecker.m82486a(user.location)) {
                i3 = user.location.distance;
                jGuessedCurrentServerTime = (long) ((uqb0.f180376H.guessedCurrentServerTime() - user.location.updatedTime) / 1000.0d);
            } else {
                jGuessedCurrentServerTime = 0;
                i3 = 0;
            }
            aVar.f22841f.m39470b(new pf60<>("distance_content", Integer.valueOf(i3)));
            aVar.f22841f.m39470b(new pf60<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
            aVar.f22836a.m101938P8(aVar.f22841f, "success");
        }
        CoreModule.f18264c.f20312H0.f133165R++;
        if (z2 && !aVar.f22837b.m38179K3() && !z4) {
            aVar.f22837b.m38338o6(1300);
            z5h0.m218665L(aVar.f22837b.act());
        }
        if (spl0.m187374Z()) {
            if (z2 && i > 1) {
                z5h0.m218675j().m218701z(false, null);
                z5h0.m218675j().f203055m = null;
                bpe0.C16079b c16079bM105818e = bpe0.m105814f().m105818e(user.f56859id);
                if (NullChecker.m82486a(c16079bM105818e)) {
                    i4g0.m138495D("e_send_superlike", aVar.f22837b.m38344q2().pageId(), jyb.m147494Y("other_user_id", user.f56859id), jyb.m147494Y("superlike_quantity", Integer.valueOf(c16079bM105818e.getSuperLikeCount())), jyb.m147494Y("superlike_types", c16079bM105818e.getClick() ? "click" : "combo"));
                }
            }
            bpe0.m105814f().m105819h();
        }
        if (h7d0.m133774m0()) {
            if (h7d0.m133773i0().m133782l0()) {
                CoreModule.f18264c.f20309G0.m183914t3();
            } else if (h7d0.m133773i0().getCanGuideUndoTips()) {
                h7d0.m133773i0().m133776e0();
                if (!z && h7d0.m133773i0().m133783n0()) {
                    aVar.f22837b.m38136B6(3000L);
                    h7d0.m133773i0().m133786r0(false);
                }
            }
        }
        if (spl0.m187368T()) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreModule.f18264c.f20413o2.m176353f3();
                CoreModule.f18264c.f20413o2.m176351d3();
            }
            CoreModule.f18264c.f20413o2.m176354g3();
            CoreModule.f18264c.f20413o2.m176352e3();
        }
        if (gra.m131649Y1() && z && (idealInfo = aVar.f22838c.m140260e().idealInfo) != null && !jyb.m147479J(idealInfo.fitIdeals)) {
            if (pzi0.m174439D(CoreModule.f18264c.f20422r2.f137258a0.get().longValue())) {
                CoreModule.f18264c.f20422r2.f137259b0.m203841a(1);
            } else {
                CoreModule.f18264c.f20422r2.f137259b0.put(1);
            }
            CoreModule.f18264c.f20422r2.f137258a0.put(Long.valueOf(pzi0.m174454o()));
        }
        if (TEnum.equals(relationship.state, "matched")) {
            if (spl0.m187369U() || s7a.m184990s()) {
                s0e0.INSTANCE.m183926e();
            }
            C4883c c4883c = CoreModule.f18264c;
            CoreSuggested coreSuggested = c4883c.f20405m0;
            coreSuggested.f20104O1 = 0;
            coreSuggested.f20208y0 = 0;
            coreSuggested.f20062A0 = 0;
            coreSuggested.f20211z0 = 0;
            coreSuggested.f20080G0 = 0;
            c4883c.f20364Y0.f161178t = 0;
            if (!relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
                if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "letter")) {
                    boolean z5 = NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.relationshipExtensions) && !TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherLetter);
                    i2 = (z5 && z4) ? 39 : z5 ? 37 : 38;
                } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                    i2 = 13;
                } else if ((relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) && !user.superLikedMe()) {
                    if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                        i2 = 1;
                    } else if (qap.INSTANCE.m175975m(aVar.f22838c.m140260e())) {
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
                if (d79.m114685j0()) {
                    CoreModule.f18264c.f20384f0.m33653Fo();
                }
                boolean zIsFemale = CoreModule.f18264c.f20381e0.m116600p9().isFemale();
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = aVar.f22837b;
                if (zIsFemale) {
                    pci.m171661J(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), user);
                    if (!IntlCountryCodeController.m29125v()) {
                        toh0.m192059s();
                    }
                    if (i2 == 13 && tx0.m193439o().m193441B()) {
                        if (spl0.m187354F()) {
                            pk50.m172568j().m172574f().m181664b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
                        }
                        tx0.m193419I(aVar.f22837b.act(), false, 5.0f, "superlike");
                    }
                } else if (NullChecker.m82486a(viewTreeObserverOnGlobalLayoutListenerC8017b.m38344q2())) {
                    Intent intentM48747h2 = MatchAct.m48747h2(aVar.f22837b.act(), jyb.m147507f0(user.f56859id), i2, (ArrayList) relationship.scenarios, (gra.m131625S1() || gra.m131701j2()) ? "tmp_from_home_swipe" : null);
                    intentM48747h2.putExtra("picks_guide_bubble_user", (Serializable) null);
                    intentM48747h2.putExtra("picks_guide_bubble_direction", 0);
                    aVar.f22837b.m38344q2().m21602w4(intentM48747h2, gra.m131722n3() ? new MatchAct.C8616a() : new MatchAct.C8617b());
                    if (CoreModule.m30932N().mo61549ko()) {
                        e3i.m119288c().f91959a = true;
                    }
                    if (gra.m131672d3()) {
                        CoreModule.f18264c.f20384f0.m33653Fo();
                    }
                }
            }
        } else {
            if (z) {
                CoreSuggested coreSuggested2 = CoreModule.f18264c.f20405m0;
                coreSuggested2.f20208y0++;
                coreSuggested2.f20211z0++;
                coreSuggested2.f20080G0++;
                coreSuggested2.f20104O1++;
                coreSuggested2.f20106P1 = 0;
                coreSuggested2.f20062A0++;
                if (spl0.m187369U()) {
                    if (z) {
                        s0e0.INSTANCE.m183925d();
                    }
                    s0e0 s0e0Var = s0e0.INSTANCE;
                    if (s0e0Var.m183922a()) {
                        s0e0Var.m183924c();
                    }
                }
                if (s7a.m184990s() && z) {
                    s0e0 s0e0Var2 = s0e0.INSTANCE;
                    s0e0Var2.m183925d();
                    if (s0e0Var2.m183922a()) {
                        s0e0Var2.m183924c();
                    }
                }
            } else {
                CoreSuggested coreSuggested3 = CoreModule.f18264c.f20405m0;
                coreSuggested3.f20106P1++;
                coreSuggested3.f20062A0 = 0;
            }
            m38510g();
            if (!aVar.f22842g && CoreModule.f18264c.f20405m0.f20211z0 >= 10 && aVar.f22836a.m102004d9(user3)) {
                aVar.f22842g = true;
                CoreModule.f18264c.f20405m0.f20065B0.onNext(uxj0.f181467a);
            }
            CoreSuggested coreSuggested4 = CoreModule.f18264c.f20405m0;
            if (coreSuggested4.f20080G0 >= 5) {
                coreSuggested4.f20086I0.onNext(uxj0.f181467a);
            }
            if (!aVar.f22842g && CoreModule.f18264c.f20312H0.f133165R >= 30 && !aVar.f22836a.f74558x.get().booleanValue() && a5i0.m96174v() && a5i0.m96115P() && tzi0.m193670h(pzi0.m174454o(), CoreModule.f18264c.f20318J0.f134505U.get().longValue(), 1)) {
                aVar.f22842g = true;
                aVar.f22836a.f74556v.onNext(uxj0.f181467a);
            }
            if (C8618a.m48771w().m48783L()) {
                aVar.f22837b.m38309i6();
            }
            if (z2 && i > 1) {
                z5h0.m218662F(aVar.f22837b.act(), user);
            }
            for (Media media : user.pictures) {
                if (pgj.m172246c()) {
                    if (!TextUtils.isEmpty(aVar.f22836a.m102048n5()) && !aVar.f22836a.m102048n5().equals(nwb.m164968f(media).formatted())) {
                        uqb0.f180374G.m127126R(aVar.f22836a.m102048n5());
                    }
                    aVar.f22836a.m101950S8(nwb.m164968f(media).formatted());
                } else {
                    uqb0.f180374G.m127126R(nwb.m164968f(media).formatted());
                }
            }
        }
        if (!CoreModule.m30932N().mo61549ko() || !this.f22799e || e3i.m119288c().f91959a || aVar.f22842g || aVar.f22836a.m101951T4().isDialogShowing() || !aVar.f22837b.act().m40820i6(TabName.Card)) {
            return;
        }
        aVar.f22842g = true;
        CoreModule.m30932N().mo61527cj(aVar.f22837b.act(), "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m38516m(C8049j.a aVar, boolean z, Throwable th) {
        if (CoreModule.m30932N().mo61549ko() && this.f22799e && !e3i.m119288c().f91959a && !aVar.f22842g && !aVar.f22836a.m101951T4().isDialogShowing() && aVar.f22837b.act().m40820i6(TabName.Card)) {
            aVar.f22842g = true;
            CoreModule.m30932N().mo61527cj(aVar.f22837b.act(), "p_suggest_users_home_view");
        }
        if (z) {
            aVar.f22836a.m101934O8(aVar.f22841f, th);
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: n */
    public User m38517n() {
        return CoreModule.f18264c.f20381e0.m116600p9();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m38518o(C4886d0 c4886d0, C8049j.a aVar, boolean z) {
        return false;
    }
}
