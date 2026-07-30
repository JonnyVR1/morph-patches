package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class aeh {
    /* JADX INFO: renamed from: a */
    public static String m8504a(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return null;
        }
        if (TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.comment_like)) {
            return "e_user_comment";
        }
        if (TEnum.equals(momentActivity.action, "like")) {
            return "e_user_like";
        }
        if (TEnum.equals(momentActivity.action, ActivityActionApi.merge_likes)) {
            return "e_user_like_merge";
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8505b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return vqg.m15497U(FeedModule.m1140H().Zj(str));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8506c(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        return TEnum.equals(momentActivity.action, "like") || TEnum.equals(momentActivity.action, ActivityActionApi.merge_likes) || TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.comment_like);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8507d(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        User userM19150clone = FeedModule.f316d.m16628e8(momentActivity.actors).m19150clone();
        if (NullChecker.a(userM19150clone) && NullChecker.a(userM19150clone.localRelationship)) {
            return userM19150clone.likedMe();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m8508e(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        return (!TextUtils.isEmpty(momentActivity.actors) && m8505b(momentActivity.actors)) || m8507d(momentActivity);
    }
}
