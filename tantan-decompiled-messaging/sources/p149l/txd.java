package p149l;

import android.os.Build;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;

/* JADX INFO: loaded from: classes8.dex */
public class txd {
    /* JADX INFO: renamed from: a */
    public static boolean m190948a() {
        return m190952e();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m190949b() {
        return ThirdPushManager.VENDOR_TYPE_XIAOMI.equalsIgnoreCase(Build.BRAND) && "Redmi 4A".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m190950c() {
        return ThirdPushManager.VENDOR_TYPE_XIAOMI.equalsIgnoreCase(Build.BRAND) && "MIX".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m190951d() {
        return RomUtil.ROM_OPPO.equals(Build.BRAND) && "PCCM00".equals(Build.MODEL);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m190952e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        return "GT-I9208".equalsIgnoreCase(str) || "GT-I9150".equalsIgnoreCase(str) || "GT-I9152".equalsIgnoreCase(str) || "GT-I9200".equalsIgnoreCase(str) || "GT-I9205".equalsIgnoreCase(str);
    }
}
