package p149l;

import android.os.Build;
import com.p069ss.android.ttvecamera.C13341g;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: loaded from: classes11.dex */
public class tih0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f170583a = {2, 0, 1, 3};

    /* JADX INFO: renamed from: b */
    public static final int[] f170584b = {1, 2, 0, 3, 4};

    /* JADX INFO: renamed from: a */
    public static boolean m189195a() {
        String lowerCase = Build.BRAND.toLowerCase();
        return lowerCase.equals(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI) || lowerCase.equals(HardwareEarMonitorUtils.MANUFACTURER_HONOR);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m189196b() {
        if (!Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
            return false;
        }
        C13341g.m80814a("TECameraHardware2", "MTK Platform.");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m189197c() {
        String lowerCase = Build.HARDWARE.toLowerCase();
        if (!lowerCase.equals("qcom") && !lowerCase.matches("msm[0-9]*")) {
            return false;
        }
        C13341g.m80814a("TECameraHardware2", "QCOM Platform.");
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m189198d() {
        return Build.BRAND.toLowerCase().equals("samsung");
    }
}
