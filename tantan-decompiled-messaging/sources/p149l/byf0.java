package p149l;

import android.os.Environment;
import android.os.StatFs;
import com.immomo.mmutil.log.Log4Android;

/* JADX INFO: loaded from: classes7.dex */
public class byf0 {
    /* JADX INFO: renamed from: a */
    public static boolean m104450a(long j) {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > j;
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m104451b() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
