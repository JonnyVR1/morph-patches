package p149l;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.p046p1.mobile.putong.common.R$string;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: loaded from: classes11.dex */
public class ane0 extends bne0 {

    /* JADX INFO: renamed from: d */
    public static final boolean f70732d;

    static {
        f70732d = Build.VERSION.SDK_INT >= 34;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m97750v() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !(str.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI) || str.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_HONOR) || str.toLowerCase().contains("hw"))) {
            return bne0.m102777f();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m97751w() {
        return bne0.m102783l();
    }

    /* JADX INFO: renamed from: x */
    public static void m97752x(Activity activity) {
        bne0.m102785n(activity, activity.getString(R$string.f17468m2));
    }
}
