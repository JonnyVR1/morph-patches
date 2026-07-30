package p149l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes13.dex */
public class g5j0 {
    /* JADX INFO: renamed from: a */
    public static void m124527a(String str, String str2) {
        try {
            File file = new File(str);
            File file2 = new File(str2);
            File parentFile = file2.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.renameTo(file2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            nt2.m160831v("LiveTrace", "[IO][M][trace_file] " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m124528b(String str, String str2) {
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
            CrashHelper.m81296c(e);
            nt2.m160831v("LiveTrace", "[IO][M][trace_file] " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m124529c(String str, String str2) throws Throwable {
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
                    tck0.m188006g(printWriter2);
                } catch (Exception e) {
                    e = e;
                    printWriter = printWriter2;
                    nt2.m160831v("LiveTrace", "[IO][W][trace_file] " + e.getMessage());
                    tck0.m188006g(printWriter);
                } catch (Throwable th) {
                    th = th;
                    printWriter = printWriter2;
                    tck0.m188006g(printWriter);
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
