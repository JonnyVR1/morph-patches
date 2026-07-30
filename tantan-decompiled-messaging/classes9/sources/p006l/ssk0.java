package p006l;

import android.app.Activity;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class ssk0 {
    /* JADX INFO: renamed from: a */
    public static void m24191a(Activity activity) {
        if (!"com.p1.mobile.light".equals(activity.getPackageName()) || System.currentTimeMillis() >= 1567180800000L) {
            return;
        }
        if ("xiaomi".equals(mr4.f17192a)) {
            activity.setContentView(c6c0.f9442m0);
            activity.findViewById(q4c0.f19614k0).setImageResource(v2c0.f24009W1);
        } else if ("sougou".equals(mr4.f17192a)) {
            activity.setContentView(c6c0.f9442m0);
            activity.findViewById(q4c0.f19614k0).setImageResource(v2c0.f24006V1);
        }
    }
}
