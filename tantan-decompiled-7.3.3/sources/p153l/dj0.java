package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class dj0 {
    /* JADX INFO: renamed from: a */
    public static String m116007a(User user) {
        if (dek0.m115424e(user)) {
            return (CoreModule.f18264c.f20303E0.m141060B3(user) || user.unilateralBlock()) ? "" : dek0.m115420a(user);
        }
        if (CoreModule.f18264c.f20303E0.m141060B3(user)) {
            return "";
        }
        Location location = user.location;
        if (location.distance <= 500) {
            return user.location.distance + "m";
        }
        boolean zIsEmpty = TextUtils.isEmpty(location.region.district);
        Location location2 = user.location;
        if (!zIsEmpty) {
            return location2.region.district;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(location2.region.city);
        Location location3 = user.location;
        if (zIsEmpty2) {
            return !TextUtils.isEmpty(location3.region.country) ? user.location.region.country : "";
        }
        return location3.region.city;
    }

    /* JADX INFO: renamed from: b */
    public static void m116008b(Conversation conversation, User user, int i, String str, String str2) {
        m116010d(conversation, user, i, "null", str, false, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m116009c(Conversation conversation, User user, int i, String str, boolean z) {
        m116010d(conversation, user, i, "null", str, z, "");
    }

    /* JADX INFO: renamed from: d */
    public static void m116010d(Conversation conversation, User user, int i, String str, String str2, boolean z, String str3) {
        if (NullChecker.m82486a(conversation) && NullChecker.m82486a(user)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(sfj0.C20032a.m185616i("active_status", CoreModule.f18264c.f20330N0.m32969j3(user)));
            arrayList.add(sfj0.C20032a.m185616i("red_dot_or_not", !conversation.read.booleanValue()));
            arrayList.add(sfj0.C20032a.m185616i("superlike_or_not", user.superLikedMe()));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(sfj0.C20032a.m185615h("card_click_type", str3));
            }
            if (z) {
                arrayList.add(sfj0.C20032a.m185615h("other_user_id", conversation.otherUser));
                sfj0.m185596c("e_nochat_match_photo", str2, (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
                return;
            }
            arrayList.add(sfj0.C20032a.m185613f("profile_photo_number", i));
            arrayList.add(sfj0.C20032a.m185615h("match_distance", m116007a(user)));
            arrayList.add(sfj0.C20032a.m185615h("moments_user_id", conversation.otherUser));
            if (TextUtils.isEmpty(str)) {
                str = "null";
            }
            arrayList.add(sfj0.C20032a.m185615h("all_match_recommend_reason", str));
            sfj0.m185596c("e_all_matches_photo", str2, (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m116011e(Conversation conversation, User user, int i, String str, boolean z) {
        m116012f(conversation, user, i, "null", str, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m116012f(Conversation conversation, User user, int i, String str, String str2, boolean z) {
        if (NullChecker.m82486a(conversation) && NullChecker.m82486a(user)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(sfj0.C20032a.m185616i("superlike_or_not", user.superLikedMe()));
            arrayList.add(sfj0.C20032a.m185616i("active_status", CoreModule.f18264c.f20330N0.m32969j3(user)));
            arrayList.add(sfj0.C20032a.m185616i("red_dot_or_not", !conversation.read.booleanValue()));
            if (z) {
                arrayList.add(sfj0.C20032a.m185615h("other_user_id", conversation.otherUser));
                sfj0.m185601h("e_nochat_match_photo", str2, (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
                return;
            }
            arrayList.add(sfj0.C20032a.m185615h("match_distance", m116007a(user)));
            arrayList.add(sfj0.C20032a.m185615h("moments_user_id", conversation.otherUser));
            arrayList.add(sfj0.C20032a.m185613f("profile_photo_number", i));
            if (TextUtils.isEmpty(str)) {
                str = "null";
            }
            arrayList.add(sfj0.C20032a.m185615h("all_match_recommend_reason", str));
            sfj0.m185601h("e_all_matches_photo", str2, (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
        }
    }
}
