package p153l;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class vj60 {
    /* JADX INFO: renamed from: a */
    private static String m201493a(File file) {
        return file == null ? "" : file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static String m201494b() {
        return m201495c() ? "" : m201493a(snk0.m186955c().getExternalCacheDir());
    }

    /* JADX INFO: renamed from: c */
    private static boolean m201495c() {
        return !"mounted".equals(Environment.getExternalStorageState());
    }
}
