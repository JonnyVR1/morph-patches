package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.EnumC14725q;

/* JADX INFO: loaded from: classes2.dex */
public class ztq0 {

    /* JADX INFO: renamed from: a */
    private static int f204751a = -1;

    /* JADX INFO: renamed from: a */
    public static EnumC14725q m220130a(Context context) {
        if (m220132c(context)) {
            return EnumC14725q.HUAWEI;
        }
        if (m220134e(context)) {
            return EnumC14725q.OPPO;
        }
        return m220135f(context) ? EnumC14725q.VIVO : EnumC14725q.OTHER;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m220131b() {
        try {
            String str = (String) ikq0.m136884g("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            return !TextUtils.isEmpty(str) && Integer.parseInt(str) >= 9;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m220132c(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null && m220131b();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m220133d(Context context) {
        Object objM136882e = ikq0.m136882e(ikq0.m136884g("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object objM136883f = ikq0.m136883f("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (objM136883f == null || !(objM136883f instanceof Integer)) {
            ilq0.m137053z("google service is not avaliable");
            f204751a = 0;
            return false;
        }
        int iIntValue = ((Integer) Integer.class.cast(objM136883f)).intValue();
        if (objM136882e != null) {
            if (objM136882e instanceof Integer) {
                f204751a = ((Integer) Integer.class.cast(objM136882e)).intValue() == iIntValue ? 1 : 0;
            } else {
                f204751a = 0;
                ilq0.m137053z("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder("is google service can be used");
        sb.append(f204751a > 0);
        ilq0.m137053z(sb.toString());
        return f204751a > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m220134e(Context context) {
        Object objM136884g = ikq0.m136884g("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        boolean zBooleanValue = (objM136884g == null || !(objM136884g instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(objM136884g)).booleanValue();
        ilq0.m137053z("color os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m220135f(Context context) {
        Object objM136884g = ikq0.m136884g("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        boolean zBooleanValue = (objM136884g == null || !(objM136884g instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(objM136884g)).booleanValue();
        ilq0.m137053z("fun touch os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }
}
