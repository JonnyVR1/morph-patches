package p153l;

import android.app.Activity;

/* JADX INFO: loaded from: classes10.dex */
public class f3f0 {

    /* JADX INFO: renamed from: a */
    public static String f96988a;

    /* JADX INFO: renamed from: a */
    public static wc80 m123730a(String str, Activity activity) {
        if ("WECHAT_MOMENT".equals(str)) {
            return new kvp0(activity);
        }
        if ("WECHAT_SESSION".equals(str)) {
            return new vvp0(activity);
        }
        if ("QQ_MOMENT".equals(str)) {
            return new gvb0(activity);
        }
        if ("QQ_SESSION".equals(str)) {
            return new hvb0(activity);
        }
        if ("SINA_WEIBO".equals(str)) {
            return new fqf0(activity);
        }
        wg3.m206174a("no platform found !!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m123731b(String str) {
        f96988a = str;
    }
}
