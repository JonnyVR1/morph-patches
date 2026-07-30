package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes13.dex */
public class iyh {
    /* JADX INFO: renamed from: a */
    public static String m142655a(String str, String str2, String str3, String str4) {
        String str5 = qv5.f159711o;
        String str6 = (TextUtils.isEmpty(str5) || str5.contains("staging2")) ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&from=%3$s&moment_id=%4$s&language=%5$s" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/report/index.html?_bid=1002576#/?receive_report_user_id=%1$s&reporter_user_id=%2$s&from=%3$s&moment_id=%4$s&language=%5$s";
        if (TextUtils.isEmpty(str4)) {
            return String.format(str6, str, FeedModule.m61405F().userId(), str2, str3, Network.language());
        }
        return String.format(str6, str, FeedModule.m61405F().userId(), str2, str3, Network.language()) + "&comment_id=" + str4;
    }

    /* JADX INFO: renamed from: b */
    public static void m142656b(Act act, String str, String str2) {
        act.startActivity(orb0.m168889f(act, m142655a(str, "moment", str2, null)));
    }
}
