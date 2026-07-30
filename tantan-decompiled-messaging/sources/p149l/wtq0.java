package p149l;

import android.os.Process;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class wtq0 {
    /* JADX INFO: renamed from: a */
    public static int m205580a() {
        try {
            return new File("/proc/" + Process.myPid() + "/fd").listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
