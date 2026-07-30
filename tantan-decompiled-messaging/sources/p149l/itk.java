package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ImproveInformationConfig;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class itk {
    /* JADX INFO: renamed from: a */
    public static void m138201a() {
        CoreModule.f17545c.f19639e0.f149259R5.clear();
    }

    /* JADX INFO: renamed from: b */
    public static int m138202b() {
        return CoreModule.f17545c.f19639e0.f149275T5.get().intValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m138203c() {
        return CoreModule.f17545c.f19639e0.f149267S5.get().intValue();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m138204d(String str, User user) {
        int iM138205e;
        Profile profile;
        Extensions extensions;
        ExtensionGame extensionGame;
        int iM138212l;
        Extensions extensions2;
        Physical physical;
        int iM138202b;
        Extensions extensions3;
        Physical physical2;
        int iM138203c;
        Extensions extensions4;
        Physical physical3;
        ImproveInformationConfig improveInformationConfigM194783m0 = upa.m194783m0();
        if (improveInformationConfigM194783m0 == null) {
            return false;
        }
        int i = improveInformationConfigM194783m0.maximumDisplayPerDay;
        int iM138213m = m138213m();
        String str2 = CoreModule.f17545c.f19639e0.f149315Y5.get();
        if (!TextUtils.equals(user.f56011id, str2) && iM138213m >= i) {
            return false;
        }
        int i2 = improveInformationConfigM194783m0.showIntervalCardSwipe;
        long jM138211k = m138211k();
        if (jM138211k >= 0) {
            Long l2 = CoreModule.f17545c.f19622Y0.f94258c.get();
            if (l2.longValue() == jM138211k && !TextUtils.equals(str2, user.f56011id)) {
                return false;
            }
            if (l2.longValue() < ((long) i2) + jM138211k && !TextUtils.equals(user.f56011id, str2)) {
                return false;
            }
        }
        int i3 = improveInformationConfigM194783m0.sameInforCanBeDisplayedAtMost;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        boolean zEquals = TextUtils.equals(CoreModule.f17545c.f19639e0.f149355d6.get(), user.f56011id);
        boolean zEquals2 = TextUtils.equals(CoreModule.f17545c.f19639e0.f149363e6.get(), user.f56011id);
        boolean zEquals3 = TextUtils.equals(CoreModule.f17545c.f19639e0.f149371f6.get(), user.f56011id);
        boolean zEquals4 = TextUtils.equals(CoreModule.f17545c.f19639e0.f149379g6.get(), user.f56011id);
        if (TextUtils.equals(str, "fitness")) {
            if (zEquals2 || zEquals3 || zEquals4 || (iM138203c = m138203c()) > i3 || (iM138203c == i3 && !TextUtils.equals(user.f56011id, str2))) {
                return false;
            }
            Profile profile2 = userM169527p9.profile;
            if ((profile2 == null || (extensions4 = profile2.extensions) == null || (physical3 = extensions4.physical) == null || vwb.m200296J(physical3.fitness) || TextUtils.equals(userM169527p9.profile.extensions.physical.fitness.get(0), "") || userM169527p9.profile.extensions.physical.fitness.contains("not_reveal")) && NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.physical) && !vwb.m200296J(user.profile.extensions.physical.fitness)) {
                List<String> list = user.profile.extensions.physical.fitness;
                if (list.contains("habit") || list.contains("occasionally")) {
                    return true;
                }
            }
        }
        if (TextUtils.equals(str, "drink")) {
            if (zEquals || zEquals3 || zEquals4 || (iM138202b = m138202b()) > i3 || (iM138202b == i3 && !TextUtils.equals(user.f56011id, str2))) {
                return false;
            }
            Profile profile3 = userM169527p9.profile;
            if ((profile3 == null || (extensions3 = profile3.extensions) == null || (physical2 = extensions3.physical) == null || vwb.m200296J(physical2.drink) || userM169527p9.profile.extensions.physical.drink.contains("not_reveal") || TextUtils.equals(userM169527p9.profile.extensions.physical.drink.get(0), "")) && NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.physical) && !vwb.m200296J(user.profile.extensions.physical.drink)) {
                List<String> list2 = user.profile.extensions.physical.drink;
                if (list2.contains("social") || list2.contains("fan") || list2.contains("sometime") || list2.contains("quit_drink") || list2.contains("never")) {
                    return true;
                }
            }
        }
        if (TextUtils.equals(str, "smoke")) {
            if (zEquals || zEquals2 || zEquals4 || (iM138212l = m138212l()) > i3 || (iM138212l == i3 && !TextUtils.equals(user.f56011id, str2))) {
                return false;
            }
            Profile profile4 = userM169527p9.profile;
            if ((profile4 == null || (extensions2 = profile4.extensions) == null || (physical = extensions2.physical) == null || vwb.m200296J(physical.smoke) || userM169527p9.profile.extensions.physical.smoke.contains("not_reveal") || TextUtils.equals(userM169527p9.profile.extensions.physical.smoke.get(0), "")) && NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.physical) && !vwb.m200296J(user.profile.extensions.physical.smoke)) {
                List<String> list3 = user.profile.extensions.physical.smoke;
                if (list3.contains("quit_smoke") || list3.contains("never")) {
                    return true;
                }
            }
        }
        return TextUtils.equals(str, "game") && !zEquals && !zEquals2 && !zEquals3 && (iM138205e = m138205e()) <= i3 && (iM138205e != i3 || TextUtils.equals(user.f56011id, str2)) && (((profile = userM169527p9.profile) == null || (extensions = profile.extensions) == null || (extensionGame = extensions.game) == null || ((vwb.m200296J(extensionGame.name) || TextUtils.equals(userM169527p9.profile.extensions.game.name.get(0), "")) && (vwb.m200296J(userM169527p9.profile.extensions.game.together) || TextUtils.equals(userM169527p9.profile.extensions.game.together.get(0), "")))) && NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.game) && !vwb.m200296J(user.profile.extensions.game.name) && !TextUtils.equals(user.profile.extensions.game.name.get(0), "") && !vwb.m200296J(user.profile.extensions.game.together) && !TextUtils.equals(user.profile.extensions.game.together.get(0), ""));
    }

    /* JADX INFO: renamed from: e */
    public static int m138205e() {
        return CoreModule.f17545c.f19639e0.f149291V5.get().intValue();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m138206f(User user, CoreSuggested.UserInfo userInfo) {
        return user.likedMe() || user.superLikedMe() || user.letter() || m138209i(user, userInfo) || userInfo.isSpecialLike();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m138207g(CoreSuggested.UserInfo userInfo) {
        return m138208h(CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id), userInfo);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m138208h(User user, CoreSuggested.UserInfo userInfo) {
        if (!upa.m194616C()) {
            return false;
        }
        if ((upa.m194658K1() && CoreModule.f17545c.f19704z2.m30255r3()) || user.popLevel < 4 || m138206f(user, userInfo)) {
            return false;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        boolean z = userM169527p9.isBanned() || userM169527p9.isBannedNew();
        boolean zM169482e8 = CoreModule.f17545c.f19639e0.m169482e8();
        if (z || zM169482e8 || CoreModule.f17545c.m31484o3().profileLike.remaining <= 0) {
            return false;
        }
        return m138204d("fitness", user) || m138204d("drink", user) || m138204d("smoke", user) || m138204d("game", user);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m138209i(User user, CoreSuggested.UserInfo userInfo) {
        if (zy50.INSTANCE.m220890c(userInfo)) {
            return true;
        }
        if ((userInfo.isUserLikeMe() && CoreModule.m29932K().me_().isFemale()) || m138210j(user, userInfo) || (userInfo.hasLikeMeSlideCardReward && njf0.m159656g() && njf0.m159657h())) {
            return true;
        }
        return NullChecker.m81303a(userInfo.cardInfos) && userInfo.cardInfos.momentLikedYou;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m138210j(User user, CoreSuggested.UserInfo userInfo) {
        if (upa.m194633F1() && NullChecker.m81303a(user) && NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.relationshipExtensions) && !TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherMomentId)) {
            return true;
        }
        return CoreModule.m29934N().mo60332Wm() && !TextUtils.isEmpty(userInfo.hasLikeMeFrom);
    }

    /* JADX INFO: renamed from: k */
    public static long m138211k() {
        return CoreModule.f17545c.f19639e0.f149259R5.get().longValue();
    }

    /* JADX INFO: renamed from: l */
    public static int m138212l() {
        return CoreModule.f17545c.f19639e0.f149283U5.get().intValue();
    }

    /* JADX INFO: renamed from: m */
    public static int m138213m() {
        if (mqi0.m155928C(CoreModule.f17545c.f19639e0.f149299W5.get().longValue(), mqi0.m155944o())) {
            return CoreModule.f17545c.f19639e0.f149307X5.get().intValue();
        }
        CoreModule.f17545c.f19639e0.f149299W5.put(Long.valueOf(mqi0.m155944o()));
        m138201a();
        return 0;
    }
}
