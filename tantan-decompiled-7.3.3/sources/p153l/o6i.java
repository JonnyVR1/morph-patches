package p153l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class o6i {
    /* JADX INFO: renamed from: a */
    public static String m166228a(Moment moment, User user, String str) {
        String strM151234v = NullChecker.m82486a(moment.location) ? ksg.m151234v(moment.location) : "";
        if (pu20.m173798C(str)) {
            strM151234v = TextUtils.isEmpty(moment.getLocationName()) ? "" : moment.getLocationName();
        }
        return ("topic_latest".equals(str) || "topic_recommend".equals(str) || "from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str) || (cmg.m111233s() && (("from_discover_discussion".equals(str) && !pu20.m173802G()) || ("from_discover_dating".equals(str) && !pu20.m173799D())))) ? "" : strM151234v;
    }

    /* JADX INFO: renamed from: b */
    public static String m166229b(Moment moment, User user, String str) {
        String strM151159C0;
        if ("topic_recommend".equals(str) || "from_group_detail_recommend".equals(str) || ("from_discover_discussion".equals(str) && moment.getRecommendTime() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            strM151159C0 = ((double) System.currentTimeMillis()) < moment.getRecommendTime() ? "1秒以前推荐" : ksg.m151159C0(moment.getRecommendTime());
        } else {
            strM151159C0 = p6i.m170908q(moment.createdTime);
        }
        if ("from_discover_dating".equals(str)) {
            strM151159C0 = ksg.m151168H((long) moment.createdTime, user == null ? 0L : user.getLastActiveTimeMillis());
        }
        if (cmg.m111233s()) {
            if ("from_discover_discussion".equals(str) && !pu20.m173804I()) {
                return "";
            }
            if ("from_discover_dating".equals(str) && !pu20.m173801F()) {
                return "";
            }
        }
        return strM151159C0;
    }
}
