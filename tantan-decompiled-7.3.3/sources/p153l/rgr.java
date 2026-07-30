package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.popup.ProfileFakeView;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.DclExtensions;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class rgr {

    /* JADX INFO: renamed from: l.rgr$a */
    public class RunnableC19843a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f163033a;

        /* JADX INFO: renamed from: b */
        public TextView f163034b;

        /* JADX INFO: renamed from: c */
        public kcg0 f163035c = C22421c.interval(1, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.qgr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157449a.m181486d((Long) obj);
            }
        }));

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f163036d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Act f163037e;

        public RunnableC19843a(CounterLikeLimit counterLikeLimit, Act act) {
            this.f163036d = counterLikeLimit;
            this.f163037e = act;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m181486d(Long l2) {
            m181489g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m181487e() {
            this.f163035c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m181488f(DialogInterface dialogInterface) {
            this.f163035c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m181489g() {
            long jResetNowMillis = this.f163036d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m82486a(this.f163033a)) {
                this.f163033a.cancel();
            }
            String strM193664b = tzi0.m193664b(jResetNowMillis);
            if (NullChecker.m82486a(this.f163034b)) {
                this.f163034b.setText(strM193664b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM21567z0 = this.f163037e.dialog().m21506G0(this.f163037e.getString(R$string.f18630L3, Integer.valueOf(this.f163036d.total))).m21503F(this.f163037e.getString(R$string.f18599K3, Integer.valueOf(this.f163036d.total))).m21556u().m21532c0(dbc0.f87133ju).m21559v0("", new Runnable() { // from class: l.ogr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147302a.m181487e();
                }
            }).m21561w0(this.f163037e.getResources().getDrawable(dbc0.f87166ku)).m21493A(new DialogInterface.OnCancelListener() { // from class: l.pgr
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f152323a.m181488f(dialogInterface);
                }
            }).m21567z0();
            this.f163033a = dialogM21567z0;
            TextView textViewM105519J0 = bnl0.m105519J0(dialogM21567z0.m21464Z());
            this.f163034b = textViewM105519J0;
            textViewM105519J0.setTextSize(0, textViewM105519J0.getTextSize() * 1.1f);
            m181489g();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m181464a(y20 y20Var, C8145d c8145d, Throwable th) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(th);
        }
        HomeStatisticsHelper.m37690A(c8145d, th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m181465b(C8145d c8145d, x20 x20Var, Act act, User user, boolean z, y20 y20Var, y20 y20Var2, String str, String str2, String str3) {
        c8145d.m39484p();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        m181475l(act, user, true, true, z, y20Var, y20Var2, c8145d, str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m181466c(Act act, User user, boolean z, boolean z2, C8145d c8145d, Map map, z20 z20Var) {
        a5i0.m96160p0().m96210Y0();
        m181480q(act, user, z, z2, c8145d, map, z20Var);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m181467d(boolean z, Act act, z20 z20Var, User user, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
        }
        if (NullChecker.m82486a(z20Var)) {
            z20Var.call(user, relationship);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m181468e(Act act, User user, boolean z, boolean z2, C8145d c8145d, Map map, z20 z20Var) {
        a5i0.m96160p0().m96210Y0();
        m181480q(act, user, z, z2, c8145d, map, z20Var);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m181469f(Act act, User user, boolean z, boolean z2, boolean z3, String str, LikeExtraData likeExtraData, y20 y20Var, C8145d c8145d, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.f18264c.f20384f0.m33653Fo();
            if (spl0.m187369U()) {
                s0e0.INSTANCE.m183926e();
            }
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            coreSuggested.f20208y0 = 0;
            coreSuggested.f20211z0 = 0;
            m181479p(act, user, z, z2, z3, relationship, str, likeExtraData);
        } else {
            if (z) {
                CoreSuggested coreSuggested2 = CoreModule.f18264c.f20405m0;
                coreSuggested2.f20208y0++;
                coreSuggested2.f20211z0++;
            }
            if (spl0.m187369U()) {
                if (z) {
                    s0e0.INSTANCE.m183925d();
                }
                s0e0 s0e0Var = s0e0.INSTANCE;
                if (s0e0Var.m183922a()) {
                    s0e0Var.m183924c();
                }
            }
        }
        CoreModule.m30932N().processMomentLikeStatusChanged(relationship, user, z, z2);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(relationship);
        }
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (CoreModule.m30932N().mo61451Co()) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreModule.f18264c.f20420r0.f20769h0.m137019l(pf60.m172085a(user.f56859id, relationship.state));
            } else if (z2) {
                CoreModule.f18264c.f20420r0.f20769h0.m137019l(pf60.m172085a(user.f56859id, RelationshipStatus.get("superliked")));
            } else {
                CoreModule.f18264c.f20420r0.f20769h0.m137019l(pf60.m172085a(user.f56859id, relationship.state));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m181471h(C8145d c8145d, x20 x20Var, Act act, User user, boolean z, y20 y20Var, y20 y20Var2, String str, String str2, String str3) {
        c8145d.m39484p();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        m181475l(act, user, true, true, z, y20Var, y20Var2, c8145d, str, str2, str3);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m181472i(User user, Act act, z20 z20Var, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.f18264c.f20405m0.m31993D8(user.f56859id);
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act.startActivity(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()));
        }
        if (NullChecker.m82486a(z20Var)) {
            z20Var.call(user, relationship);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m181474k(Act act, User user, boolean z, boolean z2, boolean z3, boolean z4, String str, rcj<Boolean, Boolean, Boolean> rcjVar, C8145d c8145d) {
        if (act == null || user == null) {
            HomeStatisticsHelper.m37691B(c8145d, "failDataError");
            return false;
        }
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (counterM32487o3 == null) {
            HomeStatisticsHelper.m37691B(c8145d, "failDataError");
            return false;
        }
        CounterLikeLimit counterLikeLimit = counterM32487o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3.superLikeLimit;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m37691B(c8145d, "failJailedUser");
            return false;
        }
        if (userM116600p9.status.contains(UserStatus.get("hidden")) && !App.f16092i.get().equals(CoreModule.f18264c.f20381e0.m116472I7())) {
            m181482s(act);
            HomeStatisticsHelper.m37691B(c8145d, "failFakeUser");
            return false;
        }
        if (z2 && a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
            if (qj90.m176831c(userM116600p9, PurchaseType.TYPE_SUPERLIKE_PKG) || d79.m114669b0()) {
                C8927c.m54574F1(act, str);
                HomeStatisticsHelper.m37691B(c8145d, "failExhaustSuperlike");
            } else {
                C8927c.m54595M1(act, str, Privilege.vip_super_like, null, null, false, user);
                HomeStatisticsHelper.m37691B(c8145d, "failLessVipSuperLike");
            }
            return false;
        }
        if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && z) {
            if (qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                new RunnableC19843a(counterLikeLimit, act).run();
            } else {
                C8927c.m54595M1(act, str, Privilege.vip_unlimited_likes, null, null, false, user);
            }
            HomeStatisticsHelper.m37691B(c8145d, "failExhaustSwipe");
            return false;
        }
        if ((!CoreModule.f18264c.f20405m0.f20193t0.get().booleanValue() || !CoreModule.f18264c.f20405m0.f20199v0.get().booleanValue()) && NullChecker.m82486a(userM116600p9) && uqb0.f180376H.guessedCurrentServerTime() - userM116600p9.createdTime >= 2.592E8d) {
            jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20199v0;
            Boolean bool = Boolean.TRUE;
            jxd0Var.put(bool);
            CoreModule.f18264c.f20405m0.f20193t0.put(bool);
        }
        if (!NullChecker.m82486a(rcjVar) || !rcjVar.call(Boolean.valueOf(z), Boolean.valueOf(z2)).booleanValue()) {
            return true;
        }
        HomeStatisticsHelper.m37691B(c8145d, "failFirstSwipe");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m181475l(final Act act, final User user, final boolean z, final boolean z2, final boolean z3, final y20<Relationship> y20Var, final y20<Throwable> y20Var2, final C8145d c8145d, final String str, String str2, String str3) {
        if (d79.m114685j0() && !TextUtils.isEmpty(str3) && str3.equals(user.f56859id) && !TextUtils.isEmpty(str2) && (z || z2)) {
            o1j0.m165634h(R$string.f19019Y2);
        }
        HashMap map = new HashMap();
        c8145d.m39473e(map);
        final LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton("click".equals(c8145d.m39475g())).isSuperLiked(z2).user(user).pageId(c8145d.m39476h()).build();
        if (str != null && str.contains(BLiveType.voiceLive)) {
            likeExtraDataNew_.liveExtraInfo = DclExtensions.new_();
            JSONObject object = JSON.parseObject(str);
            likeExtraDataNew_.liveExtraInfo.voiceLiveId = object.getString("voiceLiveId");
            likeExtraDataNew_.liveExtraInfo.voiceRoomId = object.getString("voiceRoomId");
            likeExtraDataNew_.liveExtraInfo.businessType = object.getString("businessType");
            likeExtraDataNew_.liveExtraInfo.liveLikeSource = object.getString("liveLikeSource");
        }
        act.duringCreated(CoreModule.f18264c.f20405m0.m32068W7(z, z2, map, user, str2, m181476m(str), true, likeExtraDataNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.mgr
            @Override // p153l.y20
            public final void call(Object obj) {
                rgr.m181469f(act, user, z, z2, z3, str, likeExtraDataNew_, y20Var, c8145d, (Relationship) obj);
            }
        }, new y20() { // from class: l.ngr
            @Override // p153l.y20
            public final void call(Object obj) {
                rgr.m181464a(y20Var2, c8145d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static LikeFrom m181476m(String str) {
        return TextUtils.equals(str, "from_find_partner") ? LikeFrom.get("partner") : LikeFrom.get("unknown_");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m181477n(Act act, User user, boolean z, boolean z2, boolean z3, String str, rcj<Boolean, Boolean, Boolean> rcjVar, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2, LikeExtraData likeExtraData, String str3, String str4) {
        return m181478o(act, user, z, z2, z3, str, rcjVar, y20Var, y20Var2, str2, likeExtraData, str3, str4, null);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m181478o(final Act act, final User user, boolean z, boolean z2, final boolean z3, final String str, rcj<Boolean, Boolean, Boolean> rcjVar, final y20<Relationship> y20Var, final y20<Throwable> y20Var2, String str2, LikeExtraData likeExtraData, final String str3, final String str4, final x20 x20Var) {
        final C8145d c8145dM37699b = HomeStatisticsHelper.m37699b(str2, user, z, z2, likeExtraData);
        if (act == null || user == null) {
            HomeStatisticsHelper.m37691B(c8145dM37699b, "failDataError");
            return false;
        }
        if (!m181474k(act, user, z, z2, true, false, str, rcjVar, c8145dM37699b)) {
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str3) && a5i0.m96092E1(act, new x20() { // from class: l.egr
            @Override // p153l.x20
            public final void call() {
                rgr.m181465b(c8145dM37699b, x20Var, act, user, z3, y20Var, y20Var2, str, str3, str4);
            }
        })) {
            HomeStatisticsHelper.m37691B(c8145dM37699b, "tantanCoin");
            return false;
        }
        if (!z2 || ((d79.m114685j0() && !TextUtils.isEmpty(str3)) || !a5i0.m96098G1(act, new x20() { // from class: l.fgr
            @Override // p153l.x20
            public final void call() {
                rgr.m181471h(c8145dM37699b, x20Var, act, user, z3, y20Var, y20Var2, str, str3, str4);
            }
        }))) {
            m181475l(act, user, z, z2, z3, y20Var, y20Var2, c8145dM37699b, str, str3, str4);
            return true;
        }
        HomeStatisticsHelper.m37691B(c8145dM37699b, "tantanCoin");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX INFO: renamed from: p */
    public static void m181479p(Act act, User user, boolean z, boolean z2, boolean z3, Relationship relationship, String str, LikeExtraData likeExtraData) {
        if (TEnum.equals(relationship.state, "matched")) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
            if ((!NullChecker.m82486a(conversationM33859Xe) || TEnum.equals(conversationM33859Xe.status, "dismissed")) && !relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
                int i = 0;
                if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                    i = 13;
                } else if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                    if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                        i = 1;
                    } else if (z2) {
                        i = 12;
                    }
                } else if (z2) {
                    i = 12;
                } else {
                    i = 11;
                }
                if (s7a.m184979h() && k8e0.f124376a.equals(str)) {
                    act.startActivityWithCustomTransition(MatchAct.m48747h2(act, jyb.m147507f0(user.f56859id), i, (ArrayList) relationship.scenarios, str), new MatchAct.C8617b());
                    return;
                }
                if (!CoreModule.m30930K().me_().isFemale() && NullChecker.m82486a(likeExtraData) && NullChecker.m82486a(likeExtraData.liveExtraInfo)) {
                    TextUtils.equals(likeExtraData.liveExtraInfo.liveLikeSource, "profileCard");
                }
                act.startActivityWithCustomTransition(MatchAct.m48747h2(act, jyb.m147507f0(user.f56859id), i, (ArrayList) relationship.scenarios, str), new MatchAct.C8617b());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m181480q(final Act act, final User user, boolean z, final boolean z2, final C8145d c8145d, Map<String, String> map, final z20<User, Relationship> z20Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32060U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(psd0.m173597H(new y20() { // from class: l.kgr
            @Override // p153l.y20
            public final void call(Object obj) {
                rgr.m181467d(z2, act, z20Var, user, (Relationship) obj);
            }
        }, new y20() { // from class: l.lgr
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37690A(c8145d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public static void m181481r(final Act act, final User user, final boolean z, final boolean z2, String str, final z20<User, Relationship> z20Var) {
        final C8145d c8145dM37703f = HomeStatisticsHelper.m37703f(str, false, z, z2, user);
        final HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", "");
        c8145dM37703f.m39473e(map);
        if (z2) {
            if (!dk90.m116230i() && a5i0.m96108L1()) {
                if (qj90.m176831c(CoreModule.f18264c.f20381e0.m116600p9(), PurchaseType.TYPE_SUPERLIKE_PKG) || d79.m114669b0()) {
                    C8927c.m54574F1(act, "p_suggest_users_home_view,e_superlike,click");
                    return;
                } else {
                    C8927c.m54595M1(act, "p_suggest_users_home_view,e_superlike,click", Privilege.vip_super_like, null, null, false, user);
                    return;
                }
            }
            if (a5i0.m96160p0().m96221j1()) {
                int iM105817d = bpe0.m105814f().m105817d(user.f56859id);
                if ((CoreModule.m30933P().m143405a().mo34371Mf() && iM105817d > a5i0.m96175v0() && iM105817d <= a5i0.m96181x0()) || (a5i0.m96108L1() && a5i0.m96105J1())) {
                    if (iM105817d > 1) {
                        o5h0.m166150w(act, iM105817d, new x20() { // from class: l.ggr
                            @Override // p153l.x20
                            public final void call() {
                                rgr.m181466c(act, user, z, z2, c8145dM37703f, map, z20Var);
                            }
                        }, null);
                        return;
                    } else {
                        a5i0.m96085B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new x20() { // from class: l.hgr
                            @Override // p153l.x20
                            public final void call() {
                                rgr.m181468e(act, user, z, z2, c8145dM37703f, map, z20Var);
                            }
                        }, null);
                        return;
                    }
                }
            }
            if ((joa.m146361M3() || dk90.m116230i()) && a5i0.m96108L1() && !a5i0.m96105J1()) {
                a5i0.m96179w1(act, str);
                return;
            }
        }
        if (!z) {
            m181480q(act, user, z, z2, c8145dM37703f, map, z20Var);
            return;
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SEE.getFrom()).isLike(true).isFromButton(false).isSuperLiked(z2).user(user.f56859id).isBoostResultRev(true).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(true, z2, null, user, "", LikeFrom.get("mymeet"), true, likeExtraDataNew_, 0, null)).subscribe(psd0.m173596G(new y20() { // from class: l.igr
            @Override // p153l.y20
            public final void call(Object obj) {
                rgr.m181472i(user, act, z20Var, (Relationship) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static void m181482s(final Act act) {
        if (act == null) {
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        ProfileFakeView profileFakeView = (ProfileFakeView) act.inflater().inflate(kec0.f125398Ee, (ViewGroup) null, false);
        profileFakeView.mo51611a(true, userM116600p9.m61308fp());
        new jl80.C17971a(act).m146023R(profileFakeView).m146021P(false).m146034c0(act.string(R$string.f19221el), new Runnable() { // from class: l.jgr
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m80102Y1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            }
        }).m146020O().show();
    }
}
