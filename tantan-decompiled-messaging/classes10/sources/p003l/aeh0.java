package p003l;

import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.home.d;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
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
import java.util.ArrayList;
import java.util.HashMap;
import l.d30;
import l.e30;
import l.f30;
import l.hpd0;
import l.mkd0;
import l.n3b0;
import l.swh0;
import l.u59;
import l.vwb;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aeh0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5361a(d dVar, boolean z, f30 f30Var, Act act, Relationship relationship) {
        HomeStatisticsHelper.B(dVar, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            if (NullChecker.a(f30Var)) {
                f30Var.call(relationship, Integer.valueOf(i));
            } else {
                act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5362b(d dVar, boolean z, User user, Act act, f30 f30Var, d30 d30Var) {
        dVar.p();
        m5370j(true, true, z, dVar, user, act, f30Var, d30Var);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5364d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m5365e(Act act, User user, final d30 d30Var, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || ((Boolean) CoreModule.c.m0.u0.get()).booleanValue() || !NullChecker.a(CoreModule.c.o3()) || n3b0.t()) {
            return Boolean.FALSE;
        }
        hpd0 hpd0Var = CoreModule.c.m0.u0;
        Boolean bool3 = Boolean.TRUE;
        hpd0Var.put(bool3);
        ok3.m8468G(act, true, user.name, CoreModule.c.o3().superLikeLimit.remainToday() + "", TEnum.equals(user.gender, "male"), new Runnable() { // from class: l.ydh0
            @Override // java.lang.Runnable
            public final void run() {
                d30Var.call();
            }
        }, new Runnable() { // from class: l.zdh0
            @Override // java.lang.Runnable
            public final void run() {
                aeh0.m5364d();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: h */
    public static d m5368h(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        HomeStatisticsHelper.ScActionName scActionName;
        d dVar = new d(str);
        d dVarE = dVar.s(z ? "click" : "swipe").E(user == null ? "" : ((DbObject) user).id);
        if (!z) {
            str2 = "e_card";
        } else if (z3) {
            str2 = "e_superlikeButton";
        } else {
            str2 = z2 ? "e_likeButton" : "e_dislikeButton";
        }
        d dVarW = dVarE.w(str2);
        if (z3) {
            scActionName = HomeStatisticsHelper.ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? HomeStatisticsHelper.ScActionName.LIKE : HomeStatisticsHelper.ScActionName.DISLIKE;
        }
        dVarW.q(scActionName);
        if (NullChecker.b(user)) {
            dVar.B(((Media) user.pictures.get(0)).url);
            dVar.A(user.pictures.size());
            dVar.z(0);
        }
        return dVar;
    }

    /* JADX INFO: renamed from: i */
    public static x9j<Boolean, Boolean, Boolean> m5369i(final Act act, final User user, final d30 d30Var) {
        return new x9j() { // from class: l.xdh0
            public final Object call(Object obj, Object obj2) {
                return aeh0.m5365e(act, user, d30Var, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static void m5370j(boolean z, final boolean z2, boolean z3, final d dVar, User user, final Act act, final f30<Relationship, Integer> f30Var, d30 d30Var) {
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", dVar.m());
        map.put("sourcepage", dVar.j());
        map.put("actiontype", dVar.g());
        dVar.e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(dVar.f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(dVar.h()).build();
        act.duringCreated(CoreModule.c.m0.U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.H(new e30() { // from class: l.vdh0
            public final void call(Object obj) {
                aeh0.m5361a(dVar, z2, f30Var, act, (Relationship) obj);
            }
        }, new e30() { // from class: l.wdh0
            public final void call(Object obj) {
                HomeStatisticsHelper.A(dVar, (Throwable) obj);
            }
        }));
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m5371k(boolean z, boolean z2, final boolean z3, final d dVar, final User user, final Act act, final f30<Relationship, Integer> f30Var, final d30 d30Var) {
        Counter counterO3 = CoreModule.c.o3();
        CounterLikeLimit counterLikeLimit = counterO3 == null ? null : counterO3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3 != null ? counterO3.superLikeLimit : null;
        User userP9 = CoreModule.c.e0.p9();
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            HomeStatisticsHelper.B(dVar, "failJailedUser");
            return false;
        }
        if (ark.m5528F0(act, new Runnable() { // from class: l.tdh0
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.d2(act2, 1, false, false, true, (String) null), 786);
            }
        })) {
            HomeStatisticsHelper.B(dVar, "failFakeUser");
            return false;
        }
        if (NullChecker.a(userP9) && userP9.isNameFake()) {
            HomeStatisticsHelper.B(dVar, "failFakeUser");
            ark.m5556T0(act);
            return false;
        }
        if ((z || z2) && counterO3 == null) {
            HomeStatisticsHelper.B(dVar, "failDataError");
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m8138c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            c.M1(act, "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, user);
            HomeStatisticsHelper.B(dVar, "failExhaustSwipe");
            return false;
        }
        if (z2 && swh0.G1(act, new d30() { // from class: l.udh0
            public final void call() {
                aeh0.m5362b(dVar, z3, user, act, f30Var, d30Var);
            }
        })) {
            HomeStatisticsHelper.B(dVar, "tantanCoin");
            return false;
        }
        if (!z2 || swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m5370j(z, z2, z3, dVar, user, act, f30Var, d30Var);
            return true;
        }
        if (mb90.m8137b(PurchaseType.TYPE_SUPERLIKE_PKG) || u59.a0()) {
            c.F1(act, "p_see_who_likes_me_view,e_superlike,click");
            HomeStatisticsHelper.B(dVar, "failExhaustSuperlike");
        } else {
            c.M1(act, "p_see_who_likes_me_view,e_superlike,click", Privilege.vip_super_like, (d30) null, (d30) null, false, user);
            HomeStatisticsHelper.B(dVar, "failLessVipSuperLike");
        }
        return false;
    }
}
