package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class pfh {
    /* JADX INFO: renamed from: a */
    public static String m172096a(MomentActivity momentActivity) {
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
    public static boolean m172097b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ksg.m151186U(FeedModule.m61406H().mo31744Zj(str));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m172098c(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        return TEnum.equals(momentActivity.action, "like") || TEnum.equals(momentActivity.action, ActivityActionApi.merge_likes) || TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.comment_like);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m172099d(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        User userMo225055clone = FeedModule.f39703d.m145688e8(momentActivity.actors).mo225055clone();
        if (NullChecker.m82486a(userMo225055clone) && NullChecker.m82486a(userMo225055clone.localRelationship)) {
            return userMo225055clone.likedMe();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m172100e(MomentActivity momentActivity) {
        if (momentActivity == null) {
            return false;
        }
        return (!TextUtils.isEmpty(momentActivity.actors) && m172097b(momentActivity.actors)) || m172099d(momentActivity);
    }
}
