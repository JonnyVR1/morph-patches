package p149l;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class vxf0 {
    /* JADX INFO: renamed from: a */
    public static long m200547a(@NonNull StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    /* JADX INFO: renamed from: b */
    public static long m200548b(@NonNull StatFs statFs) {
        return statFs.getBlockCountLong();
    }

    /* JADX INFO: renamed from: c */
    public static long m200549c(@NonNull StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    /* JADX INFO: renamed from: d */
    public static File[] m200550d(Context context) {
        return context.getExternalFilesDirs(null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static File m200551e(Context context, @Nullable File file) {
        File[] fileArrM200550d = m200550d(context);
        if (fileArrM200550d != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : fileArrM200550d) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static StatFs m200552f(Context context, @Nullable File file) {
        File fileM200551e;
        if (m200557k() || (fileM200551e = m200551e(context, file)) == null) {
            return null;
        }
        return new StatFs(fileM200551e.getPath());
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static Long m200553g(@NonNull StatFs statFs) {
        try {
            return Long.valueOf(m200548b(statFs) * m200549c(statFs));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Long m200554h(@NonNull StatFs statFs) {
        try {
            return Long.valueOf(m200548b(statFs) * m200549c(statFs));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Long m200555i(@NonNull StatFs statFs) {
        try {
            return Long.valueOf(m200547a(statFs) * m200549c(statFs));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static Long m200556j(@NonNull StatFs statFs) {
        try {
            return Long.valueOf(m200547a(statFs) * m200549c(statFs));
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m200557k() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }
}
