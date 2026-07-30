package p153l;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.p051p1.mobile.putong.common.R$string;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: loaded from: classes10.dex */
public class hve0 extends ive0 {

    /* JADX INFO: renamed from: d */
    public static final boolean f111752d;

    static {
        f111752d = Build.VERSION.SDK_INT >= 34;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m137320v() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !(str.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI) || str.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_HONOR) || str.toLowerCase().contains("hw"))) {
            return ive0.m142292f();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m137321w() {
        return ive0.m142298l();
    }

    /* JADX INFO: renamed from: x */
    public static void m137322x(Activity activity) {
        ive0.m142300n(activity, activity.getString(R$string.f18187m2));
    }
}
