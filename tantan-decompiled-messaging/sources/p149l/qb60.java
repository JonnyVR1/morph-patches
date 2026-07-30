package p149l;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class qb60 {
    /* JADX INFO: renamed from: a */
    private static String m173821a(File file) {
        return file == null ? "" : file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static String m173822b() {
        return m173823c() ? "" : m173821a(mek0.m154241c().getExternalCacheDir());
    }

    /* JADX INFO: renamed from: c */
    private static boolean m173823c() {
        return !"mounted".equals(Environment.getExternalStorageState());
    }
}
