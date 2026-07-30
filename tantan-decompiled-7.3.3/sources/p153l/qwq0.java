package p153l;

import android.system.Os;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class qwq0 {
    /* JADX INFO: renamed from: a */
    public static long m178535a(String str) {
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0L;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return 0L;
        }
    }
}
