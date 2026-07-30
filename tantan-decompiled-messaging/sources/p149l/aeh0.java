package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class aeh0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m96097a(C7994d c7994d, boolean z, f30 f30Var, Act act, Relationship relationship) {
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            if (NullChecker.m81303a(f30Var)) {
                f30Var.call(relationship, Integer.valueOf(i));
            } else {
                act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m96098b(C7994d c7994d, boolean z, User user, Act act, f30 f30Var, d30 d30Var) {
        c7994d.m38481p();
        m96106j(true, true, z, c7994d, user, act, f30Var, d30Var);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m96100d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m96101e(Act act, User user, final d30 d30Var, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue() || !NullChecker.m81303a(CoreModule.f17545c.m31484o3()) || n3b0.m157745t()) {
            return Boolean.FALSE;
        }
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19454u0;
        Boolean bool3 = Boolean.TRUE;
        hpd0Var.put(bool3);
        ok3.m164808G(act, true, user.name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", TEnum.equals(user.gender, "male"), new Runnable() { // from class: l.ydh0
            @Override // java.lang.Runnable
            public final void run() {
                d30Var.call();
            }
        }, new Runnable() { // from class: l.zdh0
            @Override // java.lang.Runnable
            public final void run() {
                aeh0.m96100d();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: h */
    public static C7994d m96104h(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        HomeStatisticsHelper.ScActionName scActionName;
        C7994d c7994d = new C7994d(str);
        C7994d c7994dM38464E = c7994d.m38484s(z ? "click" : "swipe").m38464E(user == null ? "" : user.f56011id);
        if (!z) {
            str2 = MatchScData.ModuleId.mid_e_card;
        } else if (z3) {
            str2 = MatchScData.ModuleId.mid_e_superlikeButton;
        } else {
            str2 = z2 ? MatchScData.ModuleId.mid_e_likeButton : "e_dislikeButton";
        }
        C7994d c7994dM38488w = c7994dM38464E.m38488w(str2);
        if (z3) {
            scActionName = HomeStatisticsHelper.ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? HomeStatisticsHelper.ScActionName.LIKE : HomeStatisticsHelper.ScActionName.DISLIKE;
        }
        c7994dM38488w.m38482q(scActionName);
        if (NullChecker.m81304b(user)) {
            c7994d.m38461B(user.pictures.get(0).url);
            c7994d.m38460A(user.pictures.size());
            c7994d.m38491z(0);
        }
        return c7994d;
    }

    /* JADX INFO: renamed from: i */
    public static x9j<Boolean, Boolean, Boolean> m96105i(final Act act, final User user, final d30 d30Var) {
        return new x9j() { // from class: l.xdh0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return aeh0.m96101e(act, user, d30Var, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static void m96106j(boolean z, final boolean z2, boolean z3, final C7994d c7994d, User user, final Act act, final f30<Relationship, Integer> f30Var, d30 d30Var) {
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", c7994d.m38478m());
        map.put("sourcepage", c7994d.m38475j());
        map.put("actiontype", c7994d.m38472g());
        c7994d.m38470e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31057U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.m154956H(new e30() { // from class: l.vdh0
            @Override // p149l.e30
            public final void call(Object obj) {
                aeh0.m96097a(c7994d, z2, f30Var, act, (Relationship) obj);
            }
        }, new e30() { // from class: l.wdh0
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36687A(c7994d, (Throwable) obj);
            }
        }));
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m96107k(boolean z, boolean z2, final boolean z3, final C7994d c7994d, final User user, final Act act, final f30<Relationship, Integer> f30Var, final d30 d30Var) {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3 == null ? null : counterM31484o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3 != null ? counterM31484o3.superLikeLimit : null;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m36688B(c7994d, "failJailedUser");
            return false;
        }
        if (ark.m98421F0(act, new Runnable() { // from class: l.tdh0
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m47783d2(act2, 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            HomeStatisticsHelper.m36688B(c7994d, "failFakeUser");
            return false;
        }
        if (NullChecker.m81303a(userM169527p9) && userM169527p9.isNameFake()) {
            HomeStatisticsHelper.m36688B(c7994d, "failFakeUser");
            ark.m98449T0(act);
            return false;
        }
        if ((z || z2) && counterM31484o3 == null) {
            HomeStatisticsHelper.m36688B(c7994d, "failDataError");
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8764c.m53412M1(act, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, user);
            HomeStatisticsHelper.m36688B(c7994d, "failExhaustSwipe");
            return false;
        }
        if (z2 && swh0.m186193G1(act, new d30() { // from class: l.udh0
            @Override // p149l.d30
            public final void call() {
                aeh0.m96098b(c7994d, z3, user, act, f30Var, d30Var);
            }
        })) {
            HomeStatisticsHelper.m36688B(c7994d, "tantanCoin");
            return false;
        }
        if (!z2 || swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m96106j(z, z2, z3, c7994d, user, act, f30Var, d30Var);
            return true;
        }
        if (mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG) || u59.m191818a0()) {
            C8764c.m53391F1(act, "p_see_who_likes_me_view,e_superlike,click");
            HomeStatisticsHelper.m36688B(c7994d, "failExhaustSuperlike");
        } else {
            C8764c.m53412M1(act, "p_see_who_likes_me_view,e_superlike,click", Privilege.vip_super_like, null, null, false, user);
            HomeStatisticsHelper.m36688B(c7994d, "failLessVipSuperLike");
        }
        return false;
    }
}
