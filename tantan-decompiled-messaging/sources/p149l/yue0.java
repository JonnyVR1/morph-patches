package p149l;

import android.app.Activity;

/* JADX INFO: loaded from: classes11.dex */
public class yue0 {

    /* JADX INFO: renamed from: a */
    public static String f200074a;

    /* JADX INFO: renamed from: a */
    public static q480 m216109a(String str, Activity activity) {
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
        ig3.m135964a("no platform found !!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m216110b(String str) {
        f200074a = str;
    }
}
