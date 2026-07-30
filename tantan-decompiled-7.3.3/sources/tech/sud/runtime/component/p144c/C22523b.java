package tech.sud.runtime.component.p144c;

import android.os.Build;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22523b {

    /* JADX INFO: renamed from: a */
    private static a f208485a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f208486b = false;

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
    public static a m222864a() {
        a aVar = f208485a;
        if (aVar != null) {
            return aVar;
        }
        f208485a = a.unknown;
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (lowerCase.contains(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI)) {
            f208485a = a.huawei;
        } else if (lowerCase.contains(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI)) {
            f208485a = a.xiaomi;
        } else if (lowerCase.contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO)) {
            f208486b = true;
            f208485a = a.vivo;
        } else if (lowerCase.contains(HardwareEarMonitorUtils.MANUFACTURER_OPPO)) {
            f208486b = true;
            f208485a = a.oppo;
        } else if (lowerCase.contains("samsung")) {
            f208485a = a.samsung;
        } else if (lowerCase.contains("smartisan")) {
            f208485a = a.smartisan;
        }
        return f208485a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m222865b() {
        return f208485a == a.smartisan;
    }
}
