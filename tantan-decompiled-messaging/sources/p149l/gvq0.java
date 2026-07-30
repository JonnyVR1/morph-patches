package p149l;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class gvq0 {
    /* JADX INFO: renamed from: a */
    public static void m128290a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m128291b(String str, int i) {
        cjq0.m107234b("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i), -1, -1);
    }

    /* JADX INFO: renamed from: c */
    public static void m128292c(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }
}
