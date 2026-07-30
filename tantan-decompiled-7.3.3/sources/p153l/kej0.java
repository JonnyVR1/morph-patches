package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes13.dex */
public class kej0 {
    /* JADX INFO: renamed from: a */
    public static void m149335a(String str, String str2) {
        try {
            File file = new File(str);
            File file2 = new File(str2);
            File parentFile = file2.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.renameTo(file2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            du2.m118062v("LiveTrace", "[IO][M][trace_file] " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m149336b(String str, String str2) {
        try {
            File file = new File(str);
            if (file.exists()) {
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file3 : fileArrListFiles) {
                        file3.renameTo(new File(file2, file3.getName()));
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            du2.m118062v("LiveTrace", "[IO][M][trace_file] " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m149337c(String str, String str2) throws Throwable {
        File file = new File(str2);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (Exception unused) {
            }
        }
        if (!file.exists() || TextUtils.isEmpty(str)) {
            return;
        }
        PrintWriter printWriter = null;
        try {
            try {
                PrintWriter printWriter2 = new PrintWriter(new FileWriter(file, true));
                try {
                    printWriter2.write(str);
                    zlk0.m220245g(printWriter2);
                } catch (Exception e) {
                    e = e;
                    printWriter = printWriter2;
                    du2.m118062v("LiveTrace", "[IO][W][trace_file] " + e.getMessage());
                    zlk0.m220245g(printWriter);
                } catch (Throwable th) {
                    th = th;
                    printWriter = printWriter2;
                    zlk0.m220245g(printWriter);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
