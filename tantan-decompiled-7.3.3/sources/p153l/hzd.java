package p153l;

import android.os.Build;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;

/* JADX INFO: loaded from: classes8.dex */
public class hzd {
    /* JADX INFO: renamed from: a */
    public static boolean m137885a() {
        return m137889e();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m137886b() {
        return ThirdPushManager.VENDOR_TYPE_XIAOMI.equalsIgnoreCase(Build.BRAND) && "Redmi 4A".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m137887c() {
        return ThirdPushManager.VENDOR_TYPE_XIAOMI.equalsIgnoreCase(Build.BRAND) && "MIX".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m137888d() {
        return RomUtil.ROM_OPPO.equals(Build.BRAND) && "PCCM00".equals(Build.MODEL);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m137889e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        return "GT-I9208".equalsIgnoreCase(str) || "GT-I9150".equalsIgnoreCase(str) || "GT-I9152".equalsIgnoreCase(str) || "GT-I9200".equalsIgnoreCase(str) || "GT-I9205".equalsIgnoreCase(str);
    }
}
