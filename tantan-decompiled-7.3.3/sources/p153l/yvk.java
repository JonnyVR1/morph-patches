package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ImproveInformationConfig;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class yvk {
    /* JADX INFO: renamed from: a */
    public static void m217520a() {
        CoreModule.f18264c.f20381e0.f89116R5.clear();
    }

    /* JADX INFO: renamed from: b */
    public static int m217521b() {
        return CoreModule.f18264c.f20381e0.f89132T5.get().intValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m217522c() {
        return CoreModule.f18264c.f20381e0.f89124S5.get().intValue();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m217523d(String str, User user) {
        int iM217524e;
        Profile profile;
        Extensions extensions;
        ExtensionGame extensionGame;
        int iM217531l;
        Extensions extensions2;
        Physical physical;
        int iM217521b;
        Extensions extensions3;
        Physical physical2;
        int iM217522c;
        Extensions extensions4;
        Physical physical3;
        ImproveInformationConfig improveInformationConfigM131714m0 = gra.m131714m0();
        if (improveInformationConfigM131714m0 == null) {
            return false;
        }
        int i = improveInformationConfigM131714m0.maximumDisplayPerDay;
        int iM217532m = m217532m();
        String str2 = CoreModule.f18264c.f20381e0.f89172Y5.get();
        if (!TextUtils.equals(user.f56859id, str2) && iM217532m >= i) {
            return false;
        }
        int i2 = improveInformationConfigM131714m0.showIntervalCardSwipe;
        long jM217530k = m217530k();
        if (jM217530k >= 0) {
            Long l2 = CoreModule.f18264c.f20364Y0.f161161c.get();
            if (l2.longValue() == jM217530k && !TextUtils.equals(str2, user.f56859id)) {
                return false;
            }
            if (l2.longValue() < ((long) i2) + jM217530k && !TextUtils.equals(user.f56859id, str2)) {
                return false;
            }
        }
        int i3 = improveInformationConfigM131714m0.sameInforCanBeDisplayedAtMost;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        boolean zEquals = TextUtils.equals(CoreModule.f18264c.f20381e0.f89212d6.get(), user.f56859id);
        boolean zEquals2 = TextUtils.equals(CoreModule.f18264c.f20381e0.f89220e6.get(), user.f56859id);
        boolean zEquals3 = TextUtils.equals(CoreModule.f18264c.f20381e0.f89228f6.get(), user.f56859id);
        boolean zEquals4 = TextUtils.equals(CoreModule.f18264c.f20381e0.f89236g6.get(), user.f56859id);
        if (TextUtils.equals(str, "fitness")) {
            if (zEquals2 || zEquals3 || zEquals4 || (iM217522c = m217522c()) > i3 || (iM217522c == i3 && !TextUtils.equals(user.f56859id, str2))) {
                return false;
            }
            Profile profile2 = userM116600p9.profile;
            if ((profile2 == null || (extensions4 = profile2.extensions) == null || (physical3 = extensions4.physical) == null || jyb.m147479J(physical3.fitness) || TextUtils.equals(userM116600p9.profile.extensions.physical.fitness.get(0), "") || userM116600p9.profile.extensions.physical.fitness.contains("not_reveal")) && NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.fitness)) {
                List<String> list = user.profile.extensions.physical.fitness;
                if (list.contains("habit") || list.contains("occasionally")) {
                    return true;
                }
            }
        }
        if (TextUtils.equals(str, "drink")) {
            if (zEquals || zEquals3 || zEquals4 || (iM217521b = m217521b()) > i3 || (iM217521b == i3 && !TextUtils.equals(user.f56859id, str2))) {
                return false;
            }
            Profile profile3 = userM116600p9.profile;
            if ((profile3 == null || (extensions3 = profile3.extensions) == null || (physical2 = extensions3.physical) == null || jyb.m147479J(physical2.drink) || userM116600p9.profile.extensions.physical.drink.contains("not_reveal") || TextUtils.equals(userM116600p9.profile.extensions.physical.drink.get(0), "")) && NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.drink)) {
                List<String> list2 = user.profile.extensions.physical.drink;
                if (list2.contains("social") || list2.contains("fan") || list2.contains("sometime") || list2.contains("quit_drink") || list2.contains("never")) {
                    return true;
                }
            }
        }
        if (TextUtils.equals(str, "smoke")) {
            if (zEquals || zEquals2 || zEquals4 || (iM217531l = m217531l()) > i3 || (iM217531l == i3 && !TextUtils.equals(user.f56859id, str2))) {
                return false;
            }
            Profile profile4 = userM116600p9.profile;
            if ((profile4 == null || (extensions2 = profile4.extensions) == null || (physical = extensions2.physical) == null || jyb.m147479J(physical.smoke) || userM116600p9.profile.extensions.physical.smoke.contains("not_reveal") || TextUtils.equals(userM116600p9.profile.extensions.physical.smoke.get(0), "")) && NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.smoke)) {
                List<String> list3 = user.profile.extensions.physical.smoke;
                if (list3.contains("quit_smoke") || list3.contains("never")) {
                    return true;
                }
            }
        }
        return TextUtils.equals(str, "game") && !zEquals && !zEquals2 && !zEquals3 && (iM217524e = m217524e()) <= i3 && (iM217524e != i3 || TextUtils.equals(user.f56859id, str2)) && (((profile = userM116600p9.profile) == null || (extensions = profile.extensions) == null || (extensionGame = extensions.game) == null || ((jyb.m147479J(extensionGame.name) || TextUtils.equals(userM116600p9.profile.extensions.game.name.get(0), "")) && (jyb.m147479J(userM116600p9.profile.extensions.game.together) || TextUtils.equals(userM116600p9.profile.extensions.game.together.get(0), "")))) && NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.game) && !jyb.m147479J(user.profile.extensions.game.name) && !TextUtils.equals(user.profile.extensions.game.name.get(0), "") && !jyb.m147479J(user.profile.extensions.game.together) && !TextUtils.equals(user.profile.extensions.game.together.get(0), ""));
    }

    /* JADX INFO: renamed from: e */
    public static int m217524e() {
        return CoreModule.f18264c.f20381e0.f89148V5.get().intValue();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m217525f(User user, CoreSuggested.UserInfo userInfo) {
        return user.likedMe() || user.superLikedMe() || user.letter() || m217528i(user, userInfo) || userInfo.isSpecialLike();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m217526g(CoreSuggested.UserInfo userInfo) {
        return m217527h(CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id), userInfo);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m217527h(User user, CoreSuggested.UserInfo userInfo) {
        if (!gra.m131547C()) {
            return false;
        }
        if ((gra.m131589K1() && CoreModule.f18264c.f20446z2.m31253r3()) || user.popLevel < 4 || m217525f(user, userInfo)) {
            return false;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        boolean z = userM116600p9.isBanned() || userM116600p9.isBannedNew();
        boolean zM116555e8 = CoreModule.f18264c.f20381e0.m116555e8();
        if (z || zM116555e8 || CoreModule.f18264c.m32487o3().profileLike.remaining <= 0) {
            return false;
        }
        return m217523d("fitness", user) || m217523d("drink", user) || m217523d("smoke", user) || m217523d("game", user);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m217528i(User user, CoreSuggested.UserInfo userInfo) {
        if (e760.INSTANCE.m119687c(userInfo)) {
            return true;
        }
        if ((userInfo.isUserLikeMe() && CoreModule.m30930K().me_().isFemale()) || m217529j(user, userInfo) || (userInfo.hasLikeMeSlideCardReward && wrf0.m207589g() && wrf0.m207590h())) {
            return true;
        }
        return NullChecker.m82486a(userInfo.cardInfos) && userInfo.cardInfos.momentLikedYou;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m217529j(User user, CoreSuggested.UserInfo userInfo) {
        if (gra.m131564F1() && NullChecker.m82486a(user) && NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.relationshipExtensions) && !TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherMomentId)) {
            return true;
        }
        return CoreModule.m30932N().mo61516Wm() && !TextUtils.isEmpty(userInfo.hasLikeMeFrom);
    }

    /* JADX INFO: renamed from: k */
    public static long m217530k() {
        return CoreModule.f18264c.f20381e0.f89116R5.get().longValue();
    }

    /* JADX INFO: renamed from: l */
    public static int m217531l() {
        return CoreModule.f18264c.f20381e0.f89140U5.get().intValue();
    }

    /* JADX INFO: renamed from: m */
    public static int m217532m() {
        if (pzi0.m174438C(CoreModule.f18264c.f20381e0.f89156W5.get().longValue(), pzi0.m174454o())) {
            return CoreModule.f18264c.f20381e0.f89164X5.get().intValue();
        }
        CoreModule.f18264c.f20381e0.f89156W5.put(Long.valueOf(pzi0.m174454o()));
        m217520a();
        return 0;
    }
}
