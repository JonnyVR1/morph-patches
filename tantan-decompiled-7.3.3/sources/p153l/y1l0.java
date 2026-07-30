package p153l;

import android.app.Activity;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public final class y1l0 {
    /* JADX INFO: renamed from: a */
    public static void m213956a(Activity activity) {
        if (!"com.p1.mobile.light".equals(activity.getPackageName()) || System.currentTimeMillis() >= 1567180800000L) {
            return;
        }
        if (HardwareEarMonitorUtils.MANUFACTURER_XIAOMI.equals(ls4.f133389a)) {
            activity.setContentView(hec0.f109124m0);
            ((VImage) activity.findViewById(wcc0.f188452k0)).setImageResource(bbc0.f75851W1);
        } else if ("sougou".equals(ls4.f133389a)) {
            activity.setContentView(hec0.f109124m0);
            ((VImage) activity.findViewById(wcc0.f188452k0)).setImageResource(bbc0.f75848V1);
        }
    }
}
