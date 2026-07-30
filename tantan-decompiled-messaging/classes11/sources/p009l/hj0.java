package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.o6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hj0 {
    /* JADX INFO: renamed from: a */
    public static String m15854a(User user) {
        if (x4k0.m24710e(user)) {
            return (CoreModule.c.E0.B3(user) || user.unilateralBlock()) ? "" : x4k0.m24706a(user);
        }
        if (CoreModule.c.E0.B3(user)) {
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
    public static void m15855b(Conversation conversation, User user, int i, String str, String str2) {
        m15857d(conversation, user, i, "null", str, false, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m15856c(Conversation conversation, User user, int i, String str, boolean z) {
        m15857d(conversation, user, i, "null", str, z, "");
    }

    /* JADX INFO: renamed from: d */
    public static void m15857d(Conversation conversation, User user, int i, String str, String str2, boolean z, String str3) {
        if (NullChecker.a(conversation) && NullChecker.a(user)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(o6j0.a.i("active_status", CoreModule.c.N0.j3(user)));
            arrayList.add(o6j0.a.i("red_dot_or_not", !conversation.read.booleanValue()));
            arrayList.add(o6j0.a.i("superlike_or_not", user.superLikedMe()));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(o6j0.a.h("card_click_type", str3));
            }
            if (z) {
                arrayList.add(o6j0.a.h("other_user_id", conversation.otherUser));
                o6j0.c("e_nochat_match_photo", str2, (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
                return;
            }
            arrayList.add(o6j0.a.f("profile_photo_number", i));
            arrayList.add(o6j0.a.h("match_distance", m15854a(user)));
            arrayList.add(o6j0.a.h("moments_user_id", conversation.otherUser));
            if (TextUtils.isEmpty(str)) {
                str = "null";
            }
            arrayList.add(o6j0.a.h("all_match_recommend_reason", str));
            o6j0.c("e_all_matches_photo", str2, (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m15858e(Conversation conversation, User user, int i, String str, boolean z) {
        m15859f(conversation, user, i, "null", str, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m15859f(Conversation conversation, User user, int i, String str, String str2, boolean z) {
        if (NullChecker.a(conversation) && NullChecker.a(user)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(o6j0.a.i("superlike_or_not", user.superLikedMe()));
            arrayList.add(o6j0.a.i("active_status", CoreModule.c.N0.j3(user)));
            arrayList.add(o6j0.a.i("red_dot_or_not", !conversation.read.booleanValue()));
            if (z) {
                arrayList.add(o6j0.a.h("other_user_id", conversation.otherUser));
                o6j0.h("e_nochat_match_photo", str2, (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
                return;
            }
            arrayList.add(o6j0.a.h("match_distance", m15854a(user)));
            arrayList.add(o6j0.a.h("moments_user_id", conversation.otherUser));
            arrayList.add(o6j0.a.f("profile_photo_number", i));
            if (TextUtils.isEmpty(str)) {
                str = "null";
            }
            arrayList.add(o6j0.a.h("all_match_recommend_reason", str));
            o6j0.h("e_all_matches_photo", str2, (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
        }
    }
}
