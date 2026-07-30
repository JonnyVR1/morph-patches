package p149l;

import android.system.Os;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class knq0 {
    /* JADX INFO: renamed from: a */
    public static long m146588a(String str) {
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0L;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return 0L;
        }
    }
}
