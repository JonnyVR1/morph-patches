package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.ImproveInformationConfig;
import com.p1.mobile.putong.data.ExtensionGame;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.upa;
import l.vwb;
import l.zy50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class itk {
    /* JADX INFO: renamed from: a */
    public static void m16698a() {
        CoreModule.c.e0.R5.clear();
    }

    /* JADX INFO: renamed from: b */
    public static int m16699b() {
        return ((Integer) CoreModule.c.e0.T5.get()).intValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m16700c() {
        return ((Integer) CoreModule.c.e0.S5.get()).intValue();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16701d(String str, User user) {
        int iM16702e;
        Profile profile;
        Extensions extensions;
        ExtensionGame extensionGame;
        int iM16709l;
        Extensions extensions2;
        Physical physical;
        int iM16699b;
        Extensions extensions3;
        Physical physical2;
        int iM16700c;
        Extensions extensions4;
        Physical physical3;
        ImproveInformationConfig improveInformationConfigM0 = upa.m0();
        if (improveInformationConfigM0 == null) {
            return false;
        }
        int i = improveInformationConfigM0.maximumDisplayPerDay;
        int iM16710m = m16710m();
        String str2 = (String) CoreModule.c.e0.Y5.get();
        if (!TextUtils.equals(((DbObject) user).id, str2) && iM16710m >= i) {
            return false;
        }
        int i2 = improveInformationConfigM0.showIntervalCardSwipe;
        long jM16708k = m16708k();
        if (jM16708k >= 0) {
            Long l2 = (Long) CoreModule.c.Y0.c.get();
            if (l2.longValue() == jM16708k && !TextUtils.equals(str2, ((DbObject) user).id)) {
                return false;
            }
            if (l2.longValue() < ((long) i2) + jM16708k && !TextUtils.equals(((DbObject) user).id, str2)) {
                return false;
            }
        }
        int i3 = improveInformationConfigM0.sameInforCanBeDisplayedAtMost;
        User userP9 = CoreModule.c.e0.p9();
        boolean zEquals = TextUtils.equals((CharSequence) CoreModule.c.e0.d6.get(), ((DbObject) user).id);
        boolean zEquals2 = TextUtils.equals((CharSequence) CoreModule.c.e0.e6.get(), ((DbObject) user).id);
        boolean zEquals3 = TextUtils.equals((CharSequence) CoreModule.c.e0.f6.get(), ((DbObject) user).id);
        boolean zEquals4 = TextUtils.equals((CharSequence) CoreModule.c.e0.g6.get(), ((DbObject) user).id);
        if (TextUtils.equals(str, "fitness")) {
            if (zEquals2 || zEquals3 || zEquals4 || (iM16700c = m16700c()) > i3 || (iM16700c == i3 && !TextUtils.equals(((DbObject) user).id, str2))) {
                return false;
            }
            Profile profile2 = userP9.profile;
            if ((profile2 == null || (extensions4 = profile2.extensions) == null || (physical3 = extensions4.physical) == null || vwb.J(physical3.fitness) || TextUtils.equals((CharSequence) userP9.profile.extensions.physical.fitness.get(0), "") || userP9.profile.extensions.physical.fitness.contains("not_reveal")) && NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.physical) && !vwb.J(user.profile.extensions.physical.fitness)) {
                List list = user.profile.extensions.physical.fitness;
                if (list.contains("habit") || list.contains("occasionally")) {
                    return true;
                }
            }
        }
        if (TextUtils.equals(str, "drink")) {
            if (zEquals || zEquals3 || zEquals4 || (iM16699b = m16699b()) > i3 || (iM16699b == i3 && !TextUtils.equals(((DbObject) user).id, str2))) {
                return false;
            }
            Profile profile3 = userP9.profile;
            if ((profile3 == null || (extensions3 = profile3.extensions) == null || (physical2 = extensions3.physical) == null || vwb.J(physical2.drink) || userP9.profile.extensions.physical.drink.contains("not_reveal") || TextUtils.equals((CharSequence) userP9.profile.extensions.physical.drink.get(0), "")) && NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.physical) && !vwb.J(user.profile.extensions.physical.drink)) {
                List list2 = user.profile.extensions.physical.drink;
                if (list2.contains("social") || list2.contains("fan") || list2.contains("sometime") || list2.contains("quit_drink") || list2.contains("never")) {
                    return true;
                }
            }
        }
        if (TextUtils.equals(str, "smoke")) {
            if (zEquals || zEquals2 || zEquals4 || (iM16709l = m16709l()) > i3 || (iM16709l == i3 && !TextUtils.equals(((DbObject) user).id, str2))) {
                return false;
            }
            Profile profile4 = userP9.profile;
            if ((profile4 == null || (extensions2 = profile4.extensions) == null || (physical = extensions2.physical) == null || vwb.J(physical.smoke) || userP9.profile.extensions.physical.smoke.contains("not_reveal") || TextUtils.equals((CharSequence) userP9.profile.extensions.physical.smoke.get(0), "")) && NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.physical) && !vwb.J(user.profile.extensions.physical.smoke)) {
                List list3 = user.profile.extensions.physical.smoke;
                if (list3.contains("quit_smoke") || list3.contains("never")) {
                    return true;
                }
            }
        }
        return TextUtils.equals(str, "game") && !zEquals && !zEquals2 && !zEquals3 && (iM16702e = m16702e()) <= i3 && (iM16702e != i3 || TextUtils.equals(((DbObject) user).id, str2)) && (((profile = userP9.profile) == null || (extensions = profile.extensions) == null || (extensionGame = extensions.game) == null || ((vwb.J(extensionGame.name) || TextUtils.equals((CharSequence) userP9.profile.extensions.game.name.get(0), "")) && (vwb.J(userP9.profile.extensions.game.together) || TextUtils.equals((CharSequence) userP9.profile.extensions.game.together.get(0), "")))) && NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.game) && !vwb.J(user.profile.extensions.game.name) && !TextUtils.equals((CharSequence) user.profile.extensions.game.name.get(0), "") && !vwb.J(user.profile.extensions.game.together) && !TextUtils.equals((CharSequence) user.profile.extensions.game.together.get(0), ""));
    }

    /* JADX INFO: renamed from: e */
    public static int m16702e() {
        return ((Integer) CoreModule.c.e0.V5.get()).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16703f(User user, CoreSuggested.UserInfo userInfo) {
        return user.likedMe() || user.superLikedMe() || user.letter() || m16706i(user, userInfo) || userInfo.isSpecialLike();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16704g(CoreSuggested.UserInfo userInfo) {
        return m16705h(CoreModule.c.e0.Pa(userInfo.id), userInfo);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16705h(User user, CoreSuggested.UserInfo userInfo) {
        if (!upa.C()) {
            return false;
        }
        if ((upa.K1() && CoreModule.c.z2.r3()) || user.popLevel < 4 || m16703f(user, userInfo)) {
            return false;
        }
        User userP9 = CoreModule.c.e0.p9();
        boolean z = userP9.isBanned() || userP9.isBannedNew();
        boolean zE8 = CoreModule.c.e0.e8();
        if (z || zE8 || CoreModule.c.o3().profileLike.remaining <= 0) {
            return false;
        }
        return m16701d("fitness", user) || m16701d("drink", user) || m16701d("smoke", user) || m16701d("game", user);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16706i(User user, CoreSuggested.UserInfo userInfo) {
        if (zy50.INSTANCE.c(userInfo)) {
            return true;
        }
        if ((userInfo.isUserLikeMe() && CoreModule.K().me_().isFemale()) || m16707j(user, userInfo) || (userInfo.hasLikeMeSlideCardReward && njf0.m18904g() && njf0.m18905h())) {
            return true;
        }
        return NullChecker.a(userInfo.cardInfos) && userInfo.cardInfos.momentLikedYou;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m16707j(User user, CoreSuggested.UserInfo userInfo) {
        if (upa.F1() && NullChecker.a(user) && NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.relationshipExtensions) && !TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherMomentId)) {
            return true;
        }
        return CoreModule.N().Wm() && !TextUtils.isEmpty(userInfo.hasLikeMeFrom);
    }

    /* JADX INFO: renamed from: k */
    public static long m16708k() {
        return ((Long) CoreModule.c.e0.R5.get()).longValue();
    }

    /* JADX INFO: renamed from: l */
    public static int m16709l() {
        return ((Integer) CoreModule.c.e0.U5.get()).intValue();
    }

    /* JADX INFO: renamed from: m */
    public static int m16710m() {
        if (mqi0.m18534C(((Long) CoreModule.c.e0.W5.get()).longValue(), mqi0.m18550o())) {
            return ((Integer) CoreModule.c.e0.X5.get()).intValue();
        }
        CoreModule.c.e0.W5.put(Long.valueOf(mqi0.m18550o()));
        m16698a();
        return 0;
    }
}
