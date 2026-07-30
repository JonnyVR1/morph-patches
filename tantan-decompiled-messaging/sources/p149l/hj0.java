package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class hj0 {
    /* JADX INFO: renamed from: a */
    public static String m131314a(User user) {
        if (x4k0.m206994e(user)) {
            return (CoreModule.f17545c.f19561E0.m203772B3(user) || user.unilateralBlock()) ? "" : x4k0.m206990a(user);
        }
        if (CoreModule.f17545c.f19561E0.m203772B3(user)) {
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
    public static void m131315b(Conversation conversation, User user, int i, String str, String str2) {
        m131317d(conversation, user, i, "null", str, false, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m131316c(Conversation conversation, User user, int i, String str, boolean z) {
        m131317d(conversation, user, i, "null", str, z, "");
    }

    /* JADX INFO: renamed from: d */
    public static void m131317d(Conversation conversation, User user, int i, String str, String str2, boolean z, String str3) {
        if (NullChecker.m81303a(conversation) && NullChecker.m81303a(user)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(o6j0.C18854a.m162879i("active_status", CoreModule.f17545c.f19588N0.m31966j3(user)));
            arrayList.add(o6j0.C18854a.m162879i("red_dot_or_not", !conversation.read.booleanValue()));
            arrayList.add(o6j0.C18854a.m162879i("superlike_or_not", user.superLikedMe()));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(o6j0.C18854a.m162878h("card_click_type", str3));
            }
            if (z) {
                arrayList.add(o6j0.C18854a.m162878h("other_user_id", conversation.otherUser));
                o6j0.m162859c("e_nochat_match_photo", str2, (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
                return;
            }
            arrayList.add(o6j0.C18854a.m162876f("profile_photo_number", i));
            arrayList.add(o6j0.C18854a.m162878h("match_distance", m131314a(user)));
            arrayList.add(o6j0.C18854a.m162878h("moments_user_id", conversation.otherUser));
            if (TextUtils.isEmpty(str)) {
                str = "null";
            }
            arrayList.add(o6j0.C18854a.m162878h("all_match_recommend_reason", str));
            o6j0.m162859c("e_all_matches_photo", str2, (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m131318e(Conversation conversation, User user, int i, String str, boolean z) {
        m131319f(conversation, user, i, "null", str, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m131319f(Conversation conversation, User user, int i, String str, String str2, boolean z) {
        if (NullChecker.m81303a(conversation) && NullChecker.m81303a(user)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(o6j0.C18854a.m162879i("superlike_or_not", user.superLikedMe()));
            arrayList.add(o6j0.C18854a.m162879i("active_status", CoreModule.f17545c.f19588N0.m31966j3(user)));
            arrayList.add(o6j0.C18854a.m162879i("red_dot_or_not", !conversation.read.booleanValue()));
            if (z) {
                arrayList.add(o6j0.C18854a.m162878h("other_user_id", conversation.otherUser));
                o6j0.m162864h("e_nochat_match_photo", str2, (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
                return;
            }
            arrayList.add(o6j0.C18854a.m162878h("match_distance", m131314a(user)));
            arrayList.add(o6j0.C18854a.m162878h("moments_user_id", conversation.otherUser));
            arrayList.add(o6j0.C18854a.m162876f("profile_photo_number", i));
            if (TextUtils.isEmpty(str)) {
                str = "null";
            }
            arrayList.add(o6j0.C18854a.m162878h("all_match_recommend_reason", str));
            o6j0.m162864h("e_all_matches_photo", str2, (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
        }
    }
}
