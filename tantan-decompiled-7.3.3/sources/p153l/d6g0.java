package p153l;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class d6g0 {
    /* JADX INFO: renamed from: a */
    public static long m114429a(@NonNull StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    /* JADX INFO: renamed from: b */
    public static long m114430b(@NonNull StatFs statFs) {
        return statFs.getBlockCountLong();
    }

    /* JADX INFO: renamed from: c */
    public static long m114431c(@NonNull StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    /* JADX INFO: renamed from: d */
    public static File[] m114432d(Context context) {
        return context.getExternalFilesDirs(null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static File m114433e(Context context, @Nullable File file) {
        File[] fileArrM114432d = m114432d(context);
        if (fileArrM114432d != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : fileArrM114432d) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static StatFs m114434f(Context context, @Nullable File file) {
        File fileM114433e;
        if (m114439k() || (fileM114433e = m114433e(context, file)) == null) {
            return null;
        }
        return new StatFs(fileM114433e.getPath());
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static Long m114435g(@NonNull StatFs statFs) {
        try {
            return Long.valueOf(m114430b(statFs) * m114431c(statFs));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Long m114436h(@NonNull StatFs statFs) {
        try {
            return Long.valueOf(m114430b(statFs) * m114431c(statFs));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Long m114437i(@NonNull StatFs statFs) {
        try {
            return Long.valueOf(m114429a(statFs) * m114431c(statFs));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static Long m114438j(@NonNull StatFs statFs) {
        try {
            return Long.valueOf(m114429a(statFs) * m114431c(statFs));
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m114439k() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }
}
