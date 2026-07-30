package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class aeh {
    /* JADX INFO: renamed from: a */
    public static String m96092a(MomentActivity momentActivity) {
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
    public static boolean m96093b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return vqg.m199527U(FeedModule.m60222H().mo30741Zj(str));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m96094c(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        return TEnum.equals(momentActivity.action, "like") || TEnum.equals(momentActivity.action, ActivityActionApi.merge_likes) || TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.comment_like);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m96095d(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        User userMo223809clone = FeedModule.f38855d.m209447e8(momentActivity.actors).mo223809clone();
        if (NullChecker.m81303a(userMo223809clone) && NullChecker.m81303a(userMo223809clone.localRelationship)) {
            return userMo223809clone.likedMe();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m96096e(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        return (!TextUtils.isEmpty(momentActivity.actors) && m96093b(momentActivity.actors)) || m96095d(momentActivity);
    }
}
