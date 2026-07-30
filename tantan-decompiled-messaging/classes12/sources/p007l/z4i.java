package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z4i {
    /* JADX INFO: renamed from: a */
    public static String m17222a(Moment moment, User user, String str) {
        String strM15545v = NullChecker.a(moment.location) ? vqg.m15545v(moment.location) : "";
        if (fm20.m10213C(str)) {
            strM15545v = TextUtils.isEmpty(moment.getLocationName()) ? "" : moment.getLocationName();
        }
        return ("topic_latest".equals(str) || "topic_recommend".equals(str) || "from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str) || (nkg.m12263s() && (("from_discover_discussion".equals(str) && !fm20.m10217G()) || ("from_discover_dating".equals(str) && !fm20.m10214D())))) ? "" : strM15545v;
    }

    /* JADX INFO: renamed from: b */
    public static String m17223b(Moment moment, User user, String str) {
        String strM15470C0;
        if ("topic_recommend".equals(str) || "from_group_detail_recommend".equals(str) || ("from_discover_discussion".equals(str) && moment.getRecommendTime() != 0.0d)) {
            strM15470C0 = ((double) System.currentTimeMillis()) < moment.getRecommendTime() ? "1秒以前推荐" : vqg.m15470C0(moment.getRecommendTime());
        } else {
            strM15470C0 = a5i.m8417q(moment.createdTime);
        }
        if ("from_discover_dating".equals(str)) {
            strM15470C0 = vqg.m15479H((long) moment.createdTime, user == null ? 0L : user.getLastActiveTimeMillis());
        }
        if (nkg.m12263s()) {
            if ("from_discover_discussion".equals(str) && !fm20.m10219I()) {
                return "";
            }
            if ("from_discover_dating".equals(str) && !fm20.m10216F()) {
                return "";
            }
        }
        return strM15470C0;
    }
}
