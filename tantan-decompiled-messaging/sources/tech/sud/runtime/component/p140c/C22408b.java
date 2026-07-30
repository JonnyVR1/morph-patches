package tech.sud.runtime.component.p140c;

import android.os.Build;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22408b {

    /* JADX INFO: renamed from: a */
    private static a f207563a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f207564b = false;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.b$a */
    public enum a {
        huawei,
        xiaomi,
        vivo,
        oppo,
        samsung,
        smartisan,
        unknown
    }

    /* JADX INFO: renamed from: a */
    public static a m221618a() {
        a aVar = f207563a;
        if (aVar != null) {
            return aVar;
        }
        f207563a = a.unknown;
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (lowerCase.contains(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI)) {
            f207563a = a.huawei;
        } else if (lowerCase.contains(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI)) {
            f207563a = a.xiaomi;
        } else if (lowerCase.contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO)) {
            f207564b = true;
            f207563a = a.vivo;
        } else if (lowerCase.contains(HardwareEarMonitorUtils.MANUFACTURER_OPPO)) {
            f207564b = true;
            f207563a = a.oppo;
        } else if (lowerCase.contains("samsung")) {
            f207563a = a.samsung;
        } else if (lowerCase.contains("smartisan")) {
            f207563a = a.smartisan;
        }
        return f207563a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m221619b() {
        return f207563a == a.smartisan;
    }
}
