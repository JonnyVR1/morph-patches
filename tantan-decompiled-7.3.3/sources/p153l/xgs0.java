package p153l;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes6.dex */
public final class xgs0 {
    /* JADX INFO: renamed from: a */
    public static Object m210936a(fpw0 fpw0Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return fpw0Var.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
