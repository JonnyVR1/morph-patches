package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.EnumC14873q;

/* JADX INFO: loaded from: classes2.dex */
public class f3r0 {

    /* JADX INFO: renamed from: a */
    private static int f97007a = -1;

    /* JADX INFO: renamed from: a */
    public static EnumC14873q m123794a(Context context) {
        if (m123796c(context)) {
            return EnumC14873q.HUAWEI;
        }
        if (m123798e(context)) {
            return EnumC14873q.OPPO;
        }
        return m123799f(context) ? EnumC14873q.VIVO : EnumC14873q.OTHER;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m123795b() {
        try {
            String str = (String) otq0.m169169g("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            return !TextUtils.isEmpty(str) && Integer.parseInt(str) >= 9;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m123796c(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null && m123795b();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m123797d(Context context) {
        Object objM169167e = otq0.m169167e(otq0.m169169g("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object objM169168f = otq0.m169168f("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (objM169168f == null || !(objM169168f instanceof Integer)) {
            ouq0.m169406z("google service is not avaliable");
            f97007a = 0;
            return false;
        }
        int iIntValue = ((Integer) Integer.class.cast(objM169168f)).intValue();
        if (objM169167e != null) {
            if (objM169167e instanceof Integer) {
                f97007a = ((Integer) Integer.class.cast(objM169167e)).intValue() == iIntValue ? 1 : 0;
            } else {
                f97007a = 0;
                ouq0.m169406z("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder("is google service can be used");
        sb.append(f97007a > 0);
        ouq0.m169406z(sb.toString());
        return f97007a > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m123798e(Context context) {
        Object objM169169g = otq0.m169169g("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        boolean zBooleanValue = (objM169169g == null || !(objM169169g instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(objM169169g)).booleanValue();
        ouq0.m169406z("color os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m123799f(Context context) {
        Object objM169169g = otq0.m169169g("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        boolean zBooleanValue = (objM169169g == null || !(objM169169g instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(objM169169g)).booleanValue();
        ouq0.m169406z("fun touch os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }
}
