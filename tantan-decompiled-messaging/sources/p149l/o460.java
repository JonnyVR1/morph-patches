package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Process;
import androidx.annotation.NonNull;
import com.jaredrummler.android.processes.models.AndroidAppProcess;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class o460 {

    /* JADX INFO: renamed from: a */
    public static int f141747a;

    /* JADX INFO: renamed from: l.o460$a */
    public static class C18838a {

        /* JADX INFO: renamed from: a */
        public String f141748a;

        /* JADX INFO: renamed from: b */
        public String f141749b;

        /* JADX INFO: renamed from: c */
        public String f141750c;

        /* JADX INFO: renamed from: d */
        public int f141751d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m162548a(String str) {
        try {
            f16.m119092a().getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m162549b(String[] strArr) {
        for (String str : strArr) {
            if (m162548a(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0053 A[EXC_TOP_SPLITTER, PHI: r2
      0x0053: PHI (r2v4 java.io.BufferedReader) = (r2v3 java.io.BufferedReader), (r2v10 java.io.BufferedReader) binds: [B:27:0x0051, B:33:0x005f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:1: B:36:0x007a->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0033: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:52), block:B:9:0x0033 */
    /* JADX INFO: renamed from: c */
    public static String m162550c() throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        int iMyPid;
        BufferedReader bufferedReader3 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        int i = bufferedReader.read();
                        if (i <= 0) {
                            String string = sb.toString();
                            try {
                                bufferedReader.close();
                                return string;
                            } catch (IOException e) {
                                CrashHelper.m81296c(e);
                                return string;
                            }
                        }
                        sb.append((char) i);
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    CrashHelper.m81296c(e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            CrashHelper.m81296c(e3);
                        }
                    }
                    iMyPid = Process.myPid();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) f16.m119092a().getSystemService("activity")).getRunningAppProcesses()) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            return runningAppProcessInfo.processName;
                        }
                    }
                    return null;
                } catch (IOException e4) {
                    e = e4;
                    CrashHelper.m81296c(e);
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    iMyPid = Process.myPid();
                    while (r2.hasNext()) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            return runningAppProcessInfo.processName;
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader3 = bufferedReader2;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                    } catch (IOException e5) {
                        CrashHelper.m81296c(e5);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e6) {
            e = e6;
            bufferedReader = null;
        } catch (IOException e7) {
            e = e7;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader3 != null) {
                bufferedReader3.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Intent m162551d(@NonNull Context context, String str) {
        return context.getPackageManager().getLaunchIntentForPackage(str);
    }

    /* JADX INFO: renamed from: e */
    public static List<C18838a> m162552e(@NonNull Context context) {
        List<AndroidAppProcess> listM127208a = go0.m127208a();
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (AndroidAppProcess androidAppProcess : listM127208a) {
            C18838a c18838a = new C18838a();
            try {
                c18838a.f141748a = androidAppProcess.m19586e(context, 0).applicationInfo.loadLabel(packageManager).toString();
                c18838a.f141749b = androidAppProcess.m19587f();
                c18838a.f141751d = androidAppProcess.pid;
                c18838a.f141750c = androidAppProcess.name;
                arrayList.add(c18838a);
            } catch (PackageManager.NameNotFoundException e) {
                CrashHelper.m81297d(e, 50);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static List<ResolveInfo> m162553f(@NonNull Context context, @NonNull Intent intent, int i) {
        return context.getPackageManager().queryIntentActivities(intent, i);
    }

    /* JADX INFO: renamed from: g */
    public static int m162554g() {
        if (f141747a <= 0) {
            try {
                f141747a = f16.m119092a().getPackageManager().getApplicationInfo(f16.m119092a().getPackageName(), 0).targetSdkVersion;
            } catch (PackageManager.NameNotFoundException e) {
                CrashHelper.m81296c(e);
            }
        }
        return f141747a;
    }
}
