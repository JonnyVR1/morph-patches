package p149l;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes6.dex */
public final class r7s0 {
    /* JADX INFO: renamed from: a */
    public static Object m178209a(zfw0 zfw0Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zfw0Var.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
