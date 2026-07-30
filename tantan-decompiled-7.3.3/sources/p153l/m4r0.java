package p153l;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class m4r0 {
    /* JADX INFO: renamed from: a */
    public static void m157051a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m157052b(String str, int i) {
        hsq0.m137029b("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i), -1, -1);
    }

    /* JADX INFO: renamed from: c */
    public static void m157053c(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }
}
