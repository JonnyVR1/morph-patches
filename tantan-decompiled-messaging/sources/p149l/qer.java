package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.popup.ProfileFakeView;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.DclExtensions;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class qer {

    /* JADX INFO: renamed from: l.qer$a */
    public class RunnableC19477a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f154050a;

        /* JADX INFO: renamed from: b */
        public TextView f154051b;

        /* JADX INFO: renamed from: c */
        public c4g0 f154052c = C22306c.interval(1, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.per
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148478a.m174252d((Long) obj);
            }
        }));

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f154053d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Act f154054e;

        public RunnableC19477a(CounterLikeLimit counterLikeLimit, Act act) {
            this.f154053d = counterLikeLimit;
            this.f154054e = act;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m174252d(Long l2) {
            m174255g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m174253e() {
            this.f154052c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m174254f(DialogInterface dialogInterface) {
            this.f154052c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m174255g() {
            long jResetNowMillis = this.f154053d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m81303a(this.f154050a)) {
                this.f154050a.cancel();
            }
            String strM175934b = qqi0.m175934b(jResetNowMillis);
            if (NullChecker.m81303a(this.f154051b)) {
                this.f154051b.setText(strM175934b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM20568z0 = this.f154054e.dialog().m20507G0(this.f154054e.getString(R$string.f17840J3, Integer.valueOf(this.f154053d.total))).m20504F(this.f154054e.getString(R$string.f17810I3, Integer.valueOf(this.f154053d.total))).m20557u().m20533c0(x2c0.f190664vt).m20560v0("", new Runnable() { // from class: l.ner
                @Override // java.lang.Runnable
                public final void run() {
                    this.f138644a.m174253e();
                }
            }).m20562w0(this.f154054e.getResources().getDrawable(x2c0.f190696wt)).m20494A(new DialogInterface.OnCancelListener() { // from class: l.oer
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f143360a.m174254f(dialogInterface);
                }
            }).m20568z0();
            this.f154050a = dialogM20568z0;
            TextView textViewM208339J0 = xdl0.m208339J0(dialogM20568z0.m20465Z());
            this.f154051b = textViewM208339J0;
            textViewM208339J0.setTextSize(0, textViewM208339J0.getTextSize() * 1.1f);
            m174255g();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m174230a(e30 e30Var, C7994d c7994d, Throwable th) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(th);
        }
        HomeStatisticsHelper.m36687A(c7994d, th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m174231b(C7994d c7994d, d30 d30Var, Act act, User user, boolean z, e30 e30Var, e30 e30Var2, String str, String str2, String str3) {
        c7994d.m38481p();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        m174241l(act, user, true, true, z, e30Var, e30Var2, c7994d, str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m174232c(Act act, User user, boolean z, boolean z2, C7994d c7994d, Map map, f30 f30Var) {
        swh0.m186255p0().m186305Y0();
        m174246q(act, user, z, z2, c7994d, map, f30Var);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m174233d(boolean z, Act act, f30 f30Var, User user, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
        }
        if (NullChecker.m81303a(f30Var)) {
            f30Var.call(user, relationship);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m174234e(Act act, User user, boolean z, boolean z2, C7994d c7994d, Map map, f30 f30Var) {
        swh0.m186255p0().m186305Y0();
        m174246q(act, user, z, z2, c7994d, map, f30Var);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m174235f(Act act, User user, boolean z, boolean z2, boolean z3, String str, LikeExtraData likeExtraData, e30 e30Var, C7994d c7994d, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.f17545c.f19642f0.m32650Fo();
            if (ogl0.m164242U()) {
                qsd0.INSTANCE.m176231e();
            }
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            coreSuggested.f19466y0 = 0;
            coreSuggested.f19469z0 = 0;
            m174245p(act, user, z, z2, z3, relationship, str, likeExtraData);
        } else {
            if (z) {
                CoreSuggested coreSuggested2 = CoreModule.f17545c.f19663m0;
                coreSuggested2.f19466y0++;
                coreSuggested2.f19469z0++;
            }
            if (ogl0.m164242U()) {
                if (z) {
                    qsd0.INSTANCE.m176230d();
                }
                qsd0 qsd0Var = qsd0.INSTANCE;
                if (qsd0Var.m176227a()) {
                    qsd0Var.m176229c();
                }
            }
        }
        CoreModule.m29934N().processMomentLikeStatusChanged(relationship, user, z, z2);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(relationship);
        }
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (CoreModule.m29934N().mo60267Co()) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreModule.f17545c.f19678r0.f20027h0.m132487l(j760.m140076a(user.f56011id, relationship.state));
            } else if (z2) {
                CoreModule.f17545c.f19678r0.f20027h0.m132487l(j760.m140076a(user.f56011id, RelationshipStatus.get("superliked")));
            } else {
                CoreModule.f17545c.f19678r0.f20027h0.m132487l(j760.m140076a(user.f56011id, relationship.state));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m174237h(C7994d c7994d, d30 d30Var, Act act, User user, boolean z, e30 e30Var, e30 e30Var2, String str, String str2, String str3) {
        c7994d.m38481p();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        m174241l(act, user, true, true, z, e30Var, e30Var2, c7994d, str, str2, str3);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m174238i(User user, Act act, f30 f30Var, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.f17545c.f19663m0.m30990D8(user.f56011id);
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act.startActivity(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()));
        }
        if (NullChecker.m81303a(f30Var)) {
            f30Var.call(user, relationship);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m174240k(Act act, User user, boolean z, boolean z2, boolean z3, boolean z4, String str, x9j<Boolean, Boolean, Boolean> x9jVar, C7994d c7994d) {
        if (act == null || user == null) {
            HomeStatisticsHelper.m36688B(c7994d, "failDataError");
            return false;
        }
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        if (counterM31484o3 == null) {
            HomeStatisticsHelper.m36688B(c7994d, "failDataError");
            return false;
        }
        CounterLikeLimit counterLikeLimit = counterM31484o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3.superLikeLimit;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m36688B(c7994d, "failJailedUser");
            return false;
        }
        if (userM169527p9.status.contains(UserStatus.get("hidden")) && !App.f15373i.get().equals(CoreModule.f17545c.f19639e0.m169399I7())) {
            m174248s(act);
            HomeStatisticsHelper.m36688B(c7994d, "failFakeUser");
            return false;
        }
        if (z2 && swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
            if (mb90.m153867c(userM169527p9, PurchaseType.TYPE_SUPERLIKE_PKG) || u59.m191818a0()) {
                C8764c.m53391F1(act, str);
                HomeStatisticsHelper.m36688B(c7994d, "failExhaustSuperlike");
            } else {
                C8764c.m53412M1(act, str, Privilege.vip_super_like, null, null, false, user);
                HomeStatisticsHelper.m36688B(c7994d, "failLessVipSuperLike");
            }
            return false;
        }
        if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && z) {
            if (mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                new RunnableC19477a(counterLikeLimit, act).run();
            } else {
                C8764c.m53412M1(act, str, Privilege.vip_unlimited_likes, null, null, false, user);
            }
            HomeStatisticsHelper.m36688B(c7994d, "failExhaustSwipe");
            return false;
        }
        if ((!CoreModule.f17545c.f19663m0.f19451t0.get().booleanValue() || !CoreModule.f17545c.f19663m0.f19457v0.get().booleanValue()) && NullChecker.m81303a(userM169527p9) && qib0.f154693H.guessedCurrentServerTime() - userM169527p9.createdTime >= 2.592E8d) {
            hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19457v0;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            CoreModule.f17545c.f19663m0.f19451t0.put(bool);
        }
        if (!NullChecker.m81303a(x9jVar) || !x9jVar.call(Boolean.valueOf(z), Boolean.valueOf(z2)).booleanValue()) {
            return true;
        }
        HomeStatisticsHelper.m36688B(c7994d, "failFirstSwipe");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m174241l(final Act act, final User user, final boolean z, final boolean z2, final boolean z3, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, final C7994d c7994d, final String str, String str2, String str3) {
        if (u59.m191827f0() && !TextUtils.isEmpty(str3) && str3.equals(user.f56011id) && !TextUtils.isEmpty(str2) && (z || z2)) {
            lsi0.m151578h(R$string.f18229W2);
        }
        HashMap map = new HashMap();
        c7994d.m38470e(map);
        final LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton("click".equals(c7994d.m38472g())).isSuperLiked(z2).user(user).pageId(c7994d.m38473h()).build();
        if (str != null && str.contains(BLiveType.voiceLive)) {
            likeExtraDataNew_.liveExtraInfo = DclExtensions.new_();
            JSONObject object = JSON.parseObject(str);
            likeExtraDataNew_.liveExtraInfo.voiceLiveId = object.getString("voiceLiveId");
            likeExtraDataNew_.liveExtraInfo.voiceRoomId = object.getString("voiceRoomId");
            likeExtraDataNew_.liveExtraInfo.businessType = object.getString("businessType");
            likeExtraDataNew_.liveExtraInfo.liveLikeSource = object.getString("liveLikeSource");
        }
        act.duringCreated(CoreModule.f17545c.f19663m0.m31065W7(z, z2, map, user, str2, m174242m(str), true, likeExtraDataNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.ler
            @Override // p149l.e30
            public final void call(Object obj) {
                qer.m174235f(act, user, z, z2, z3, str, likeExtraDataNew_, e30Var, c7994d, (Relationship) obj);
            }
        }, new e30() { // from class: l.mer
            @Override // p149l.e30
            public final void call(Object obj) {
                qer.m174230a(e30Var2, c7994d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static LikeFrom m174242m(String str) {
        return TextUtils.equals(str, "from_find_partner") ? LikeFrom.get("partner") : LikeFrom.get("unknown_");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m174243n(Act act, User user, boolean z, boolean z2, boolean z3, String str, x9j<Boolean, Boolean, Boolean> x9jVar, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, String str3, String str4) {
        return m174244o(act, user, z, z2, z3, str, x9jVar, e30Var, e30Var2, str2, likeExtraData, str3, str4, null);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m174244o(final Act act, final User user, boolean z, boolean z2, final boolean z3, final String str, x9j<Boolean, Boolean, Boolean> x9jVar, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, final String str3, final String str4, final d30 d30Var) {
        final C7994d c7994dM36696b = HomeStatisticsHelper.m36696b(str2, user, z, z2, likeExtraData);
        if (act == null || user == null) {
            HomeStatisticsHelper.m36688B(c7994dM36696b, "failDataError");
            return false;
        }
        if (!m174240k(act, user, z, z2, true, false, str, x9jVar, c7994dM36696b)) {
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str3) && swh0.m186187E1(act, new d30() { // from class: l.der
            @Override // p149l.d30
            public final void call() {
                qer.m174231b(c7994dM36696b, d30Var, act, user, z3, e30Var, e30Var2, str, str3, str4);
            }
        })) {
            HomeStatisticsHelper.m36688B(c7994dM36696b, "tantanCoin");
            return false;
        }
        if (!z2 || ((u59.m191827f0() && !TextUtils.isEmpty(str3)) || !swh0.m186193G1(act, new d30() { // from class: l.eer
            @Override // p149l.d30
            public final void call() {
                qer.m174237h(c7994dM36696b, d30Var, act, user, z3, e30Var, e30Var2, str, str3, str4);
            }
        }))) {
            m174241l(act, user, z, z2, z3, e30Var, e30Var2, c7994dM36696b, str, str3, str4);
            return true;
        }
        HomeStatisticsHelper.m36688B(c7994dM36696b, "tantanCoin");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX INFO: renamed from: p */
    public static void m174245p(Act act, User user, boolean z, boolean z2, boolean z3, Relationship relationship, String str, LikeExtraData likeExtraData) {
        if (TEnum.equals(relationship.state, "matched")) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
            if ((!NullChecker.m81303a(conversationM32856Xe) || TEnum.equals(conversationM32856Xe.status, "dismissed")) && !relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
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
                if (g6a.m124559h() && g0e0.f100037a.equals(str)) {
                    act.startActivityWithCustomTransition(MatchAct.m47564g2(act, vwb.m200324f0(user.f56011id), i, (ArrayList) relationship.scenarios, str), new MatchAct.C8454b());
                    return;
                }
                if (!CoreModule.m29932K().me_().isFemale() && NullChecker.m81303a(likeExtraData) && NullChecker.m81303a(likeExtraData.liveExtraInfo)) {
                    TextUtils.equals(likeExtraData.liveExtraInfo.liveLikeSource, "profileCard");
                }
                act.startActivityWithCustomTransition(MatchAct.m47564g2(act, vwb.m200324f0(user.f56011id), i, (ArrayList) relationship.scenarios, str), new MatchAct.C8454b());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m174246q(final Act act, final User user, boolean z, final boolean z2, final C7994d c7994d, Map<String, String> map, final f30<User, Relationship> f30Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31057U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.m154956H(new e30() { // from class: l.jer
            @Override // p149l.e30
            public final void call(Object obj) {
                qer.m174233d(z2, act, f30Var, user, (Relationship) obj);
            }
        }, new e30() { // from class: l.ker
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36687A(c7994d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public static void m174247r(final Act act, final User user, final boolean z, final boolean z2, String str, final f30<User, Relationship> f30Var) {
        final C7994d c7994dM36700f = HomeStatisticsHelper.m36700f(str, false, z, z2, user);
        final HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", "");
        c7994dM36700f.m38470e(map);
        if (z2) {
            if (!zb90.m217832i() && swh0.m186203L1()) {
                if (mb90.m153867c(CoreModule.f17545c.f19639e0.m169527p9(), PurchaseType.TYPE_SUPERLIKE_PKG) || u59.m191818a0()) {
                    C8764c.m53391F1(act, "p_suggest_users_home_view,e_superlike,click");
                    return;
                } else {
                    C8764c.m53412M1(act, "p_suggest_users_home_view,e_superlike,click", Privilege.vip_super_like, null, null, false, user);
                    return;
                }
            }
            if (swh0.m186255p0().m186316j1()) {
                int iM203037d = wge0.m203034f().m203037d(user.f56011id);
                if ((CoreModule.m29935P().m94651a().mo33368Mf() && iM203037d > swh0.m186270v0() && iM203037d <= swh0.m186276x0()) || (swh0.m186203L1() && swh0.m186200J1())) {
                    if (iM203037d > 1) {
                        gxg0.m128614w(act, iM203037d, new d30() { // from class: l.fer
                            @Override // p149l.d30
                            public final void call() {
                                qer.m174232c(act, user, z, z2, c7994dM36700f, map, f30Var);
                            }
                        }, null);
                        return;
                    } else {
                        swh0.m186180B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new d30() { // from class: l.ger
                            @Override // p149l.d30
                            public final void call() {
                                qer.m174234e(act, user, z, z2, c7994dM36700f, map, f30Var);
                            }
                        }, null);
                        return;
                    }
                }
            }
            if ((xma.m210047L3() || zb90.m217832i()) && swh0.m186203L1() && !swh0.m186200J1()) {
                swh0.m186274w1(act, str);
                return;
            }
        }
        if (!z) {
            m174246q(act, user, z, z2, c7994dM36700f, map, f30Var);
            return;
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SEE.getFrom()).isLike(true).isFromButton(false).isSuperLiked(z2).user(user.f56011id).isBoostResultRev(true).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(true, z2, null, user, "", LikeFrom.get("mymeet"), true, likeExtraDataNew_, 0, null)).subscribe(mkd0.m154955G(new e30() { // from class: l.her
            @Override // p149l.e30
            public final void call(Object obj) {
                qer.m174238i(user, act, f30Var, (Relationship) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static void m174248s(final Act act) {
        if (act == null) {
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        ProfileFakeView profileFakeView = (ProfileFakeView) act.inflater().inflate(f6c0.f96087xe, (ViewGroup) null, false);
        profileFakeView.mo50428a(true, userM169527p9.m60124fp());
        new dd80.C16336a(act).m110963R(profileFakeView).m110961P(false).m110974c0(act.string(R$string.f17827Ik), new Runnable() { // from class: l.ier
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m78919X1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            }
        }).m110960O().show();
    }
}
