package p153l;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ojw0 {
    /* JADX INFO: renamed from: a */
    public static File m167968a(@NonNull File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: b */
    public static File m167969b(String str, String str2, @NonNull File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(m167970c(str, file), str2);
    }

    /* JADX INFO: renamed from: c */
    public static File m167970c(String str, @NonNull File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        m167968a(file2, false);
        return file2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m167971d(@NonNull File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z = true;
            for (int i = 0; i < fileArrListFiles.length; i++) {
                File file2 = fileArrListFiles[i];
                z = file2 != null && m167971d(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m167972e(@NonNull File file, @NonNull byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                IOUtils.closeQuietly(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
