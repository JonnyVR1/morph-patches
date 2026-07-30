package p149l;

import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.FileUtil;
import immomo.com.mklibrary.fep.FepVersion;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class nhw {
    /* JADX INFO: renamed from: a */
    private static String m159458a() {
        File file;
        if (!"mounted".equals(Environment.getExternalStorageState()) || (file = e16.m114379g(shw.m184283c(), null)[0]) == null) {
            return shw.m184283c().getFilesDir().getAbsolutePath() + File.separator + "fepConfig.json";
        }
        return file.getAbsolutePath() + File.separator + "fepConfig.json";
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX INFO: renamed from: b */
    public static String m159459b(String str, AbstractC17922k4 abstractC17922k4) {
        if (TextUtils.isEmpty(str) || abstractC17922k4 == null || !abstractC17922k4.m144453d()) {
            return str;
        }
        String str2 = "g";
        if (abstractC17922k4 instanceof am10) {
            FepVersion fepVersionM144457i = abstractC17922k4.m144457i(str);
            if (abstractC17922k4.m144459k() && abstractC17922k4.m144460m(fepVersionM144457i)) {
                str2 = "f";
            }
        } else if (!(abstractC17922k4 instanceof yak)) {
            if (abstractC17922k4 instanceof jyi) {
                str2 = "f";
            } else {
                str2 = null;
            }
        }
        return zhw.m218873f(str, "_fep", str2);
    }

    /* JADX INFO: renamed from: c */
    private static File m159460c() throws IOException {
        File file = new File(m159458a());
        if (file.exists()) {
            return file;
        }
        file.createNewFile();
        return file;
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public static String m159461d() {
        try {
            return FileUtil.m18411h(m159460c());
        } catch (Exception e) {
            e.printStackTrace();
            MDLog.m7389d("FepPublishManager", "readWebConfig fail " + e.getMessage());
            return "";
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    public static void m159462e(String str) {
        try {
            FileUtil.m18414k(m159460c(), str);
        } catch (Exception e) {
            e.printStackTrace();
            MDLog.m7389d("FepPublishManager", "saveWebConfig fail " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m159463f(long j, long j2) {
        MDLog.m7389d("FepPublishManager", "localVersion: " + j + " configVersion: " + j2);
        return j / 10 == j2 / 10;
    }
}
