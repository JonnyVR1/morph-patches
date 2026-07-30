package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class kzv0 {
    /* JADX INFO: renamed from: a */
    public static void m147956a(Context context, boolean z) {
        if (z) {
            x2t0.m206868f("This request is sent from a test device.");
            return;
        }
        exr0.m118703b();
        x2t0.m206868f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + i2t0.m134081A(context) + "\")) to get test ads on this device.");
    }

    /* JADX INFO: renamed from: b */
    public static void m147957b(int i, Throwable th, String str) {
        x2t0.m206868f("Ad failed to load : " + i);
        xsu0.m210835l(str, th);
        if (i == 3) {
            return;
        }
        vny0.m199079q().m212289v(th, str);
    }
}
