package p009l;

import android.os.Build;
import com.p008ss.android.ttvecamera.C0743g;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tih0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f20721a = {2, 0, 1, 3};

    /* JADX INFO: renamed from: b */
    public static final int[] f20722b = {1, 2, 0, 3, 4};

    /* JADX INFO: renamed from: a */
    public static boolean m22543a() {
        String lowerCase = Build.BRAND.toLowerCase();
        return lowerCase.equals("huawei") || lowerCase.equals("honor");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22544b() {
        if (!Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
            return false;
        }
        C0743g.m11165a("TECameraHardware2", "MTK Platform.");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m22545c() {
        String lowerCase = Build.HARDWARE.toLowerCase();
        if (!lowerCase.equals("qcom") && !lowerCase.matches("msm[0-9]*")) {
            return false;
        }
        C0743g.m11165a("TECameraHardware2", "QCOM Platform.");
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22546d() {
        return Build.BRAND.toLowerCase().equals("samsung");
    }
}
