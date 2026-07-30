package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class imh0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m140923a(C8145d c8145d, boolean z, z20 z20Var, Act act, Relationship relationship) {
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            if (NullChecker.m82486a(z20Var)) {
                z20Var.call(relationship, Integer.valueOf(i));
            } else {
                act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m140924b(C8145d c8145d, boolean z, User user, Act act, z20 z20Var, x20 x20Var) {
        c8145d.m39484p();
        m140932j(true, true, z, c8145d, user, act, z20Var, x20Var);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m140926d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m140927e(Act act, User user, final x20 x20Var, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue() || !NullChecker.m82486a(CoreModule.f18264c.m32487o3()) || rbb0.m180747t()) {
            return Boolean.FALSE;
        }
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20196u0;
        Boolean bool3 = Boolean.TRUE;
        jxd0Var.put(bool3);
        hl3.m135664G(act, true, user.name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", TEnum.equals(user.gender, "male"), new Runnable() { // from class: l.gmh0
            @Override // java.lang.Runnable
            public final void run() {
                x20Var.call();
            }
        }, new Runnable() { // from class: l.hmh0
            @Override // java.lang.Runnable
            public final void run() {
                imh0.m140926d();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: h */
    public static C8145d m140930h(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        HomeStatisticsHelper.ScActionName scActionName;
        C8145d c8145d = new C8145d(str);
        C8145d c8145dM39467E = c8145d.m39487s(z ? "click" : "swipe").m39467E(user == null ? "" : user.f56859id);
        if (!z) {
            str2 = MatchScData.ModuleId.mid_e_card;
        } else if (z3) {
            str2 = MatchScData.ModuleId.mid_e_superlikeButton;
        } else {
            str2 = z2 ? MatchScData.ModuleId.mid_e_likeButton : "e_dislikeButton";
        }
        C8145d c8145dM39491w = c8145dM39467E.m39491w(str2);
        if (z3) {
            scActionName = HomeStatisticsHelper.ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? HomeStatisticsHelper.ScActionName.LIKE : HomeStatisticsHelper.ScActionName.DISLIKE;
        }
        c8145dM39491w.m39485q(scActionName);
        if (NullChecker.m82487b(user)) {
            c8145d.m39464B(user.pictures.get(0).url);
            c8145d.m39463A(user.pictures.size());
            c8145d.m39494z(0);
        }
        return c8145d;
    }

    /* JADX INFO: renamed from: i */
    public static rcj<Boolean, Boolean, Boolean> m140931i(final Act act, final User user, final x20 x20Var) {
        return new rcj() { // from class: l.fmh0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return imh0.m140927e(act, user, x20Var, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static void m140932j(boolean z, final boolean z2, boolean z3, final C8145d c8145d, User user, final Act act, final z20<Relationship, Integer> z20Var, x20 x20Var) {
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", c8145d.m39481m());
        map.put("sourcepage", c8145d.m39478j());
        map.put("actiontype", c8145d.m39475g());
        c8145d.m39473e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32060U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(psd0.m173597H(new y20() { // from class: l.dmh0
            @Override // p153l.y20
            public final void call(Object obj) {
                imh0.m140923a(c8145d, z2, z20Var, act, (Relationship) obj);
            }
        }, new y20() { // from class: l.emh0
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37690A(c8145d, (Throwable) obj);
            }
        }));
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m140933k(boolean z, boolean z2, final boolean z3, final C8145d c8145d, final User user, final Act act, final z20<Relationship, Integer> z20Var, final x20 x20Var) {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3 == null ? null : counterM32487o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3 != null ? counterM32487o3.superLikeLimit : null;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m37691B(c8145d, "failJailedUser");
            return false;
        }
        if (qtk.m177971F0(act, new Runnable() { // from class: l.bmh0
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m48966e2(act2, 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            HomeStatisticsHelper.m37691B(c8145d, "failFakeUser");
            return false;
        }
        if (NullChecker.m82486a(userM116600p9) && userM116600p9.isNameFake()) {
            HomeStatisticsHelper.m37691B(c8145d, "failFakeUser");
            qtk.m177999T0(act);
            return false;
        }
        if ((z || z2) && counterM32487o3 == null) {
            HomeStatisticsHelper.m37691B(c8145d, "failDataError");
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8927c.m54595M1(act, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, user);
            HomeStatisticsHelper.m37691B(c8145d, "failExhaustSwipe");
            return false;
        }
        if (z2 && a5i0.m96098G1(act, new x20() { // from class: l.cmh0
            @Override // p153l.x20
            public final void call() {
                imh0.m140924b(c8145d, z3, user, act, z20Var, x20Var);
            }
        })) {
            HomeStatisticsHelper.m37691B(c8145d, "tantanCoin");
            return false;
        }
        if (!z2 || a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m140932j(z, z2, z3, c8145d, user, act, z20Var, x20Var);
            return true;
        }
        if (qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG) || d79.m114669b0()) {
            C8927c.m54574F1(act, "p_see_who_likes_me_view,e_superlike,click");
            HomeStatisticsHelper.m37691B(c8145d, "failExhaustSuperlike");
        } else {
            C8927c.m54595M1(act, "p_see_who_likes_me_view,e_superlike,click", Privilege.vip_super_like, null, null, false, user);
            HomeStatisticsHelper.m37691B(c8145d, "failLessVipSuperLike");
        }
        return false;
    }
}
