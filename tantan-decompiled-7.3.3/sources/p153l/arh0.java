package p153l;

import android.os.Build;
import com.p074ss.android.ttvecamera.C13504g;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: loaded from: classes11.dex */
public class arh0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f72945a = {2, 0, 1, 3};

    /* JADX INFO: renamed from: b */
    public static final int[] f72946b = {1, 2, 0, 3, 4};

    /* JADX INFO: renamed from: a */
    public static boolean m99702a() {
        String lowerCase = Build.BRAND.toLowerCase();
        return lowerCase.equals(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI) || lowerCase.equals(HardwareEarMonitorUtils.MANUFACTURER_HONOR);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m99703b() {
        if (!Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
            return false;
        }
        C13504g.m81997a("TECameraHardware2", "MTK Platform.");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m99704c() {
        String lowerCase = Build.HARDWARE.toLowerCase();
        if (!lowerCase.equals("qcom") && !lowerCase.matches("msm[0-9]*")) {
            return false;
        }
        C13504g.m81997a("TECameraHardware2", "QCOM Platform.");
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99705d() {
        return Build.BRAND.toLowerCase().equals("samsung");
    }
}
