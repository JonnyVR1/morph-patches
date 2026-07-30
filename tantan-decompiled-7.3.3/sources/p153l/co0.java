package p153l;

import com.jaredrummler.android.processes.models.AndroidAppProcess;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class co0 {

    /* JADX INFO: renamed from: a */
    private static boolean f82799a;

    /* JADX INFO: renamed from: a */
    public static List<AndroidAppProcess> m111560a() {
        ArrayList arrayList = new ArrayList();
        for (File file : new File("/proc").listFiles()) {
            if (file.isDirectory()) {
                try {
                    int i = Integer.parseInt(file.getName());
                    try {
                        arrayList.add(new AndroidAppProcess(i));
                    } catch (IOException e) {
                        m111562c(e, "Error reading from /proc/%d.", Integer.valueOf(i));
                    }
                } catch (AndroidAppProcess.NotAndroidAppProcessException | NumberFormatException unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m111561b(String str, Object... objArr) {
        if (!f82799a || objArr.length == 0) {
            return;
        }
        String.format(str, objArr);
    }

    /* JADX INFO: renamed from: c */
    public static void m111562c(Throwable th, String str, Object... objArr) {
        if (!f82799a || objArr.length == 0) {
            return;
        }
        String.format(str, objArr);
    }
}
