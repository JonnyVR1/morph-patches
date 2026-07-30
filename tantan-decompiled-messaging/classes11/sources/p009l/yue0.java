package p009l;

import android.app.Activity;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yue0 {

    /* JADX INFO: renamed from: a */
    public static String f23233a;

    /* JADX INFO: renamed from: a */
    public static q480 m25509a(String str, Activity activity) {
        if ("WECHAT_MOMENT".equals(str)) {
            return new gmp0(activity);
        }
        if ("WECHAT_SESSION".equals(str)) {
            return new rmp0(activity);
        }
        if ("QQ_MOMENT".equals(str)) {
            return new cnb0(activity);
        }
        if ("QQ_SESSION".equals(str)) {
            return new dnb0(activity);
        }
        if ("SINA_WEIBO".equals(str)) {
            return new whf0(activity);
        }
        ig3.a("no platform found !!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m25510b(String str) {
        f23233a = str;
    }
}
