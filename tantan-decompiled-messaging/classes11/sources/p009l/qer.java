package p009l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.popup.ProfileFakeView;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.DclExtensions;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.dd80;
import l.e30;
import l.f30;
import l.f6c0;
import l.g0e0;
import l.g6a;
import l.gxg0;
import l.hpd0;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mb90;
import l.mkd0;
import l.ogl0;
import l.qib0;
import l.qqi0;
import l.swh0;
import l.t100;
import l.u59;
import l.vwb;
import l.wge0;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xma;
import l.zb90;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qer {

    /* JADX INFO: renamed from: l.qer$a */
    public class RunnableC1138a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f19197a;

        /* JADX INFO: renamed from: b */
        public TextView f19198b;

        /* JADX INFO: renamed from: c */
        public c4g0 f19199c = c.interval(1, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.per
            public final void call(Object obj) {
                this.f18516a.m20931d((Long) obj);
            }
        }));

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f19200d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Act f19201e;

        public RunnableC1138a(CounterLikeLimit counterLikeLimit, Act act) {
            this.f19200d = counterLikeLimit;
            this.f19201e = act;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m20931d(Long l2) {
            m20934g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m20932e() {
            this.f19199c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m20933f(DialogInterface dialogInterface) {
            this.f19199c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m20934g() {
            long jResetNowMillis = this.f19200d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.a(this.f19197a)) {
                this.f19197a.cancel();
            }
            String strB = qqi0.b(jResetNowMillis);
            if (NullChecker.a(this.f19198b)) {
                this.f19198b.setText(strB);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogZ0 = this.f19201e.dialog().G0(this.f19201e.getString(R.string.J3, Integer.valueOf(this.f19200d.total))).F(this.f19201e.getString(R.string.I3, Integer.valueOf(this.f19200d.total))).u().c0(x2c0.vt).v0("", new Runnable() { // from class: l.ner
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17434a.m20932e();
                }
            }).w0(this.f19201e.getResources().getDrawable(x2c0.wt)).A(new DialogInterface.OnCancelListener() { // from class: l.oer
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f17942a.m20933f(dialogInterface);
                }
            }).z0();
            this.f19197a = dialogZ0;
            TextView textViewJ0 = xdl0.J0(dialogZ0.Z());
            this.f19198b = textViewJ0;
            textViewJ0.setTextSize(0, textViewJ0.getTextSize() * 1.1f);
            m20934g();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20909a(e30 e30Var, C0158d c0158d, Throwable th) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(th);
        }
        HomeStatisticsHelper.m636A(c0158d, th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20910b(C0158d c0158d, d30 d30Var, Act act, User user, boolean z, e30 e30Var, e30 e30Var2, String str, String str2, String str3) {
        c0158d.m2459p();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        m20920l(act, user, true, true, z, e30Var, e30Var2, c0158d, str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20911c(Act act, User user, boolean z, boolean z2, C0158d c0158d, Map map, f30 f30Var) {
        swh0.p0().Y0();
        m20925q(act, user, z, z2, c0158d, map, f30Var);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20912d(boolean z, Act act, f30 f30Var, User user, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
        }
        if (NullChecker.a(f30Var)) {
            f30Var.call(user, relationship);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m20913e(Act act, User user, boolean z, boolean z2, C0158d c0158d, Map map, f30 f30Var) {
        swh0.p0().Y0();
        m20925q(act, user, z, z2, c0158d, map, f30Var);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m20914f(Act act, User user, boolean z, boolean z2, boolean z3, String str, LikeExtraData likeExtraData, e30 e30Var, C0158d c0158d, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.c.f0.Fo();
            if (ogl0.U()) {
                qsd0.INSTANCE.m21239e();
            }
            CoreSuggested coreSuggested = CoreModule.c.m0;
            coreSuggested.y0 = 0;
            coreSuggested.z0 = 0;
            m20924p(act, user, z, z2, z3, relationship, str, likeExtraData);
        } else {
            if (z) {
                CoreSuggested coreSuggested2 = CoreModule.c.m0;
                coreSuggested2.y0++;
                coreSuggested2.z0++;
            }
            if (ogl0.U()) {
                if (z) {
                    qsd0.INSTANCE.m21238d();
                }
                qsd0 qsd0Var = qsd0.INSTANCE;
                if (qsd0Var.m21235a()) {
                    qsd0Var.m21237c();
                }
            }
        }
        CoreModule.N().processMomentLikeStatusChanged(relationship, user, z, z2);
        if (NullChecker.a(e30Var)) {
            e30Var.call(relationship);
        }
        HomeStatisticsHelper.m637B(c0158d, "success");
        if (CoreModule.N().Co()) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreModule.c.r0.h0.onNext(j760.a(((DbObject) user).id, relationship.state));
            } else if (z2) {
                CoreModule.c.r0.h0.onNext(j760.a(((DbObject) user).id, RelationshipStatus.get("superliked")));
            } else {
                CoreModule.c.r0.h0.onNext(j760.a(((DbObject) user).id, relationship.state));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m20916h(C0158d c0158d, d30 d30Var, Act act, User user, boolean z, e30 e30Var, e30 e30Var2, String str, String str2, String str3) {
        c0158d.m2459p();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        m20920l(act, user, true, true, z, e30Var, e30Var2, c0158d, str, str2, str3);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m20917i(User user, Act act, f30 f30Var, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.c.m0.D8(((DbObject) user).id);
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLiked")) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act.startActivity(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()));
        }
        if (NullChecker.a(f30Var)) {
            f30Var.call(user, relationship);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m20919k(Act act, User user, boolean z, boolean z2, boolean z3, boolean z4, String str, x9j<Boolean, Boolean, Boolean> x9jVar, C0158d c0158d) {
        if (act == null || user == null) {
            HomeStatisticsHelper.m637B(c0158d, "failDataError");
            return false;
        }
        Counter counterO3 = CoreModule.c.o3();
        if (counterO3 == null) {
            HomeStatisticsHelper.m637B(c0158d, "failDataError");
            return false;
        }
        CounterLikeLimit counterLikeLimit = counterO3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3.superLikeLimit;
        User userP9 = CoreModule.c.e0.p9();
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m637B(c0158d, "failJailedUser");
            return false;
        }
        if (userP9.status.contains(UserStatus.get("hidden")) && !((Integer) App.i.get()).equals(CoreModule.c.e0.I7())) {
            m20927s(act);
            HomeStatisticsHelper.m637B(c0158d, "failFakeUser");
            return false;
        }
        if (z2 && swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
            if (mb90.c(userP9, PurchaseType.TYPE_SUPERLIKE_PKG) || u59.a0()) {
                com.p1.mobile.putong.core.ui.purchase.c.F1(act, str);
                HomeStatisticsHelper.m637B(c0158d, "failExhaustSuperlike");
            } else {
                com.p1.mobile.putong.core.ui.purchase.c.M1(act, str, Privilege.vip_super_like, (d30) null, (d30) null, false, user);
                HomeStatisticsHelper.m637B(c0158d, "failLessVipSuperLike");
            }
            return false;
        }
        if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && z) {
            if (mb90.c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                new RunnableC1138a(counterLikeLimit, act).run();
            } else {
                com.p1.mobile.putong.core.ui.purchase.c.M1(act, str, Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, user);
            }
            HomeStatisticsHelper.m637B(c0158d, "failExhaustSwipe");
            return false;
        }
        if ((!((Boolean) CoreModule.c.m0.t0.get()).booleanValue() || !((Boolean) CoreModule.c.m0.v0.get()).booleanValue()) && NullChecker.a(userP9) && qib0.H.guessedCurrentServerTime() - userP9.createdTime >= 2.592E8d) {
            hpd0 hpd0Var = CoreModule.c.m0.v0;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            CoreModule.c.m0.t0.put(bool);
        }
        if (!NullChecker.a(x9jVar) || !((Boolean) x9jVar.call(Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue()) {
            return true;
        }
        HomeStatisticsHelper.m637B(c0158d, "failFirstSwipe");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m20920l(final Act act, final User user, final boolean z, final boolean z2, final boolean z3, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, final C0158d c0158d, final String str, String str2, String str3) {
        if (u59.f0() && !TextUtils.isEmpty(str3) && str3.equals(((DbObject) user).id) && !TextUtils.isEmpty(str2) && (z || z2)) {
            lsi0.h(R.string.W2);
        }
        HashMap map = new HashMap();
        c0158d.m2448e(map);
        final LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c0158d.m2449f().getFrom()).isLike(z).isFromButton("click".equals(c0158d.m2450g())).isSuperLiked(z2).user(user).pageId(c0158d.m2451h()).build();
        if (str != null && str.contains("voiceLive")) {
            likeExtraDataNew_.liveExtraInfo = DclExtensions.new_();
            JSONObject object = JSON.parseObject(str);
            likeExtraDataNew_.liveExtraInfo.voiceLiveId = object.getString("voiceLiveId");
            likeExtraDataNew_.liveExtraInfo.voiceRoomId = object.getString("voiceRoomId");
            likeExtraDataNew_.liveExtraInfo.businessType = object.getString("businessType");
            likeExtraDataNew_.liveExtraInfo.liveLikeSource = object.getString("liveLikeSource");
        }
        act.duringCreated(CoreModule.c.m0.W7(z, z2, map, user, str2, m20921m(str), true, likeExtraDataNew_)).subscribe(mkd0.H(new e30() { // from class: l.ler
            public final void call(Object obj) {
                qer.m20914f(act, user, z, z2, z3, str, likeExtraDataNew_, e30Var, c0158d, (Relationship) obj);
            }
        }, new e30() { // from class: l.mer
            public final void call(Object obj) {
                qer.m20909a(e30Var2, c0158d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static LikeFrom m20921m(String str) {
        return TextUtils.equals(str, "from_find_partner") ? LikeFrom.get("partner") : LikeFrom.get("unknown_");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m20922n(Act act, User user, boolean z, boolean z2, boolean z3, String str, x9j<Boolean, Boolean, Boolean> x9jVar, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, String str3, String str4) {
        return m20923o(act, user, z, z2, z3, str, x9jVar, e30Var, e30Var2, str2, likeExtraData, str3, str4, null);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m20923o(final Act act, final User user, boolean z, boolean z2, final boolean z3, final String str, x9j<Boolean, Boolean, Boolean> x9jVar, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, final String str3, final String str4, final d30 d30Var) {
        final C0158d c0158dM645b = HomeStatisticsHelper.m645b(str2, user, z, z2, likeExtraData);
        if (act == null || user == null) {
            HomeStatisticsHelper.m637B(c0158dM645b, "failDataError");
            return false;
        }
        if (!m20919k(act, user, z, z2, true, false, str, x9jVar, c0158dM645b)) {
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str3) && swh0.E1(act, new d30() { // from class: l.der
            public final void call() {
                qer.m20910b(c0158dM645b, d30Var, act, user, z3, e30Var, e30Var2, str, str3, str4);
            }
        })) {
            HomeStatisticsHelper.m637B(c0158dM645b, "tantanCoin");
            return false;
        }
        if (!z2 || ((u59.f0() && !TextUtils.isEmpty(str3)) || !swh0.G1(act, new d30() { // from class: l.eer
            public final void call() {
                qer.m20916h(c0158dM645b, d30Var, act, user, z3, e30Var, e30Var2, str, str3, str4);
            }
        }))) {
            m20920l(act, user, z, z2, z3, e30Var, e30Var2, c0158dM645b, str, str3, str4);
            return true;
        }
        HomeStatisticsHelper.m637B(c0158dM645b, "tantanCoin");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX INFO: renamed from: p */
    public static void m20924p(Act act, User user, boolean z, boolean z2, boolean z3, Relationship relationship, String str, LikeExtraData likeExtraData) {
        if (TEnum.equals(relationship.state, "matched")) {
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
            if ((!NullChecker.a(conversationXe) || TEnum.equals(conversationXe.status, "dismissed")) && !relationship.status.contains(MatchFrom.get("xmasActivity"))) {
                int i = 0;
                if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
                    i = 13;
                } else if (relationship.status.size() == 0 || !TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
                    if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) {
                        i = 1;
                    } else if (z2) {
                        i = 12;
                    }
                } else if (z2) {
                    i = 12;
                } else {
                    i = 11;
                }
                if (g6a.h() && g0e0.a.equals(str)) {
                    act.startActivityWithCustomTransition(MatchAct.g2(act, vwb.f0(new String[]{((DbObject) user).id}), i, (ArrayList) relationship.scenarios, str), new MatchAct.b());
                    return;
                }
                if (!CoreModule.K().me_().isFemale() && NullChecker.a(likeExtraData) && NullChecker.a(likeExtraData.liveExtraInfo)) {
                    TextUtils.equals(likeExtraData.liveExtraInfo.liveLikeSource, "profileCard");
                }
                act.startActivityWithCustomTransition(MatchAct.g2(act, vwb.f0(new String[]{((DbObject) user).id}), i, (ArrayList) relationship.scenarios, str), new MatchAct.b());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m20925q(final Act act, final User user, boolean z, final boolean z2, final C0158d c0158d, Map<String, String> map, final f30<User, Relationship> f30Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c0158d.m2449f().getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId(c0158d.m2451h()).build();
        act.duringCreated(CoreModule.c.m0.U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.H(new e30() { // from class: l.jer
            public final void call(Object obj) {
                qer.m20912d(z2, act, f30Var, user, (Relationship) obj);
            }
        }, new e30() { // from class: l.ker
            public final void call(Object obj) {
                HomeStatisticsHelper.m636A(c0158d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public static void m20926r(final Act act, final User user, final boolean z, final boolean z2, String str, final f30<User, Relationship> f30Var) {
        final C0158d c0158dM649f = HomeStatisticsHelper.m649f(str, false, z, z2, user);
        final HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", "");
        c0158dM649f.m2448e(map);
        if (z2) {
            if (!zb90.i() && swh0.L1()) {
                if (mb90.c(CoreModule.c.e0.p9(), PurchaseType.TYPE_SUPERLIKE_PKG) || u59.a0()) {
                    com.p1.mobile.putong.core.ui.purchase.c.F1(act, "p_suggest_users_home_view,e_superlike,click");
                    return;
                } else {
                    com.p1.mobile.putong.core.ui.purchase.c.M1(act, "p_suggest_users_home_view,e_superlike,click", Privilege.vip_super_like, (d30) null, (d30) null, false, user);
                    return;
                }
            }
            if (swh0.p0().j1()) {
                int iD = wge0.f().d(((DbObject) user).id);
                if ((CoreModule.P().a().Mf() && iD > swh0.v0() && iD <= swh0.x0()) || (swh0.L1() && swh0.J1())) {
                    if (iD > 1) {
                        gxg0.w(act, iD, new d30() { // from class: l.fer
                            public final void call() {
                                qer.m20911c(act, user, z, z2, c0158dM649f, map, f30Var);
                            }
                        }, (d30) null);
                        return;
                    } else {
                        swh0.B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new d30() { // from class: l.ger
                            public final void call() {
                                qer.m20913e(act, user, z, z2, c0158dM649f, map, f30Var);
                            }
                        }, (d30) null);
                        return;
                    }
                }
            }
            if ((xma.L3() || zb90.i()) && swh0.L1() && !swh0.J1()) {
                swh0.w1(act, str);
                return;
            }
        }
        if (!z) {
            m20925q(act, user, z, z2, c0158dM649f, map, f30Var);
            return;
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SEE.getFrom()).isLike(true).isFromButton(false).isSuperLiked(z2).user(((DbObject) user).id).isBoostResultRev(true).build();
        act.duringCreated(CoreModule.c.m0.Y7(true, z2, (Map) null, user, "", LikeFrom.get("mymeet"), true, likeExtraDataNew_, 0, (String) null)).subscribe(mkd0.G(new e30() { // from class: l.her
            public final void call(Object obj) {
                qer.m20917i(user, act, f30Var, (Relationship) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static void m20927s(final Act act) {
        if (act == null) {
            return;
        }
        User userP9 = CoreModule.c.e0.p9();
        ProfileFakeView profileFakeViewInflate = act.inflater().inflate(f6c0.xe, (ViewGroup) null, false);
        profileFakeViewInflate.a(true, userP9.fp());
        new dd80.a(act).R(profileFakeViewInflate).P(false).c0(act.string(R.string.Ik), new Runnable() { // from class: l.ier
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m9216X1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).build()), 786);
            }
        }).O().show();
    }
}
