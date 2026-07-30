package p153l;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class ksh0 {

    /* JADX INFO: renamed from: a */
    private static String f128574a = "takephoto_cache";

    /* JADX INFO: renamed from: a */
    public static void m151244a(String str) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.delete()) {
                return;
            }
            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m151245b(Context context, File file) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file2 = new File(cacheDir, f128574a);
            if (file2.mkdirs() || (file2.exists() && file2.isDirectory())) {
                return new File(file2, file.getName());
            }
        } else if (Log.isLoggable("TFileUtils", 6)) {
            Log.e("TFileUtils", "default disk cache dir is null");
        }
        return file;
    }
}
