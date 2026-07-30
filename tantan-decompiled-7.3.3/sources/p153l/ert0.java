package p153l;

import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public final class ert0 {
    /* JADX INFO: renamed from: a */
    public static boolean m122288a(boolean z) {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }
}
