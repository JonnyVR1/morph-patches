package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class q8w0 {
    /* JADX INFO: renamed from: a */
    public static void m175827a(Context context, boolean z) {
        if (z) {
            dct0.m115297f("This request is sent from a test device.");
            return;
        }
        k6s0.m148569b();
        dct0.m115297f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + obt0.m167034A(context) + "\")) to get test ads on this device.");
    }

    /* JADX INFO: renamed from: b */
    public static void m175828b(int i, Throwable th, String str) {
        dct0.m115297f("Ad failed to load : " + i);
        d2v0.m113738l(str, th);
        if (i == 3) {
            return;
        }
        bxy0.m106933q().m120274v(th, str);
    }
}
