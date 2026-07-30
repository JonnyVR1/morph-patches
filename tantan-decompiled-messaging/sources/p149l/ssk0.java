package p149l;

import android.app.Activity;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import p147v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public final class ssk0 {
    /* JADX INFO: renamed from: a */
    public static void m185749a(Activity activity) {
        if (!"com.p1.mobile.light".equals(activity.getPackageName()) || System.currentTimeMillis() >= 1567180800000L) {
            return;
        }
        if (HardwareEarMonitorUtils.MANUFACTURER_XIAOMI.equals(mr4.f135329a)) {
            activity.setContentView(c6c0.f79512m0);
            ((VImage) activity.findViewById(q4c0.f152604k0)).setImageResource(v2c0.f179445W1);
        } else if ("sougou".equals(mr4.f135329a)) {
            activity.setContentView(c6c0.f79512m0);
            ((VImage) activity.findViewById(q4c0.f152604k0)).setImageResource(v2c0.f179442V1);
        }
    }
}
