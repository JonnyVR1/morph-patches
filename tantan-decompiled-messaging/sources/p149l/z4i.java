package p149l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class z4i {
    /* JADX INFO: renamed from: a */
    public static String m217093a(Moment moment, User user, String str) {
        String strM199575v = NullChecker.m81303a(moment.location) ? vqg.m199575v(moment.location) : "";
        if (fm20.m122110C(str)) {
            strM199575v = TextUtils.isEmpty(moment.getLocationName()) ? "" : moment.getLocationName();
        }
        return ("topic_latest".equals(str) || "topic_recommend".equals(str) || "from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str) || (nkg.m159904s() && (("from_discover_discussion".equals(str) && !fm20.m122114G()) || ("from_discover_dating".equals(str) && !fm20.m122111D())))) ? "" : strM199575v;
    }

    /* JADX INFO: renamed from: b */
    public static String m217094b(Moment moment, User user, String str) {
        String strM199500C0;
        if ("topic_recommend".equals(str) || "from_group_detail_recommend".equals(str) || ("from_discover_discussion".equals(str) && moment.getRecommendTime() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            strM199500C0 = ((double) System.currentTimeMillis()) < moment.getRecommendTime() ? "1秒以前推荐" : vqg.m199500C0(moment.getRecommendTime());
        } else {
            strM199500C0 = a5i.m95041q(moment.createdTime);
        }
        if ("from_discover_dating".equals(str)) {
            strM199500C0 = vqg.m199509H((long) moment.createdTime, user == null ? 0L : user.getLastActiveTimeMillis());
        }
        if (nkg.m159904s()) {
            if ("from_discover_discussion".equals(str) && !fm20.m122116I()) {
                return "";
            }
            if ("from_discover_dating".equals(str) && !fm20.m122113F()) {
                return "";
            }
        }
        return strM199500C0;
    }
}
