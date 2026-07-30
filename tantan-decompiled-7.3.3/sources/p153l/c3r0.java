package p153l;

import android.os.Process;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class c3r0 {
    /* JADX INFO: renamed from: a */
    public static int m107806a() {
        try {
            return new File("/proc/" + Process.myPid() + "/fd").listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
