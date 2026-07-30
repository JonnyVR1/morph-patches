package p153l;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileInputStream;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class qk90 {

    /* JADX INFO: renamed from: a */
    private static volatile String f158115a;

    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098 A[Catch: Exception -> 0x00a3, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a3, blocks: (B:43:0x008e, B:44:0x0092, B:46:0x0098), top: B:62:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[LOOP:1: B:44:0x0092->B:69:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static String m176942a(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        int i;
        if (!TextUtils.isEmpty(f158115a)) {
            return f158115a;
        }
        int iMyPid = Process.myPid();
        if (context != null && iMyPid > 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                f158115a = Application.getProcessName();
                return f158115a;
            }
            byte[] bArr = new byte[128];
            try {
                FileInputStream fileInputStream = new FileInputStream("/proc/" + iMyPid + "/cmdline");
                try {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 > 0) {
                        for (0; i < i2; i + 1) {
                            byte b = bArr[i];
                            i = ((b & 255) <= 128 && b > 0) ? i + 1 : 0;
                            i2 = i;
                            break;
                        }
                        f158115a = new String(bArr, 0, i2);
                        String str = f158115a;
                        fileInputStream.close();
                        return str;
                    }
                    fileInputStream.close();
                    activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager != null) {
                        Log.e("yyd", "getCurrentProcessName: !!!!!!!!!!!1");
                        runningAppProcesses = activityManager.getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            runningAppProcessInfo = null;
                            try {
                                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : runningAppProcesses) {
                                    if (runningAppProcessInfo2.pid == iMyPid) {
                                        runningAppProcessInfo = runningAppProcessInfo2;
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (runningAppProcessInfo != null && !TextUtils.isEmpty(runningAppProcessInfo.processName)) {
                                f158115a = runningAppProcessInfo.processName;
                                return f158115a;
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
            activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                Log.e("yyd", "getCurrentProcessName: !!!!!!!!!!!1");
                runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    runningAppProcessInfo = null;
                    while (r10.hasNext()) {
                        if (runningAppProcessInfo2.pid == iMyPid) {
                            runningAppProcessInfo = runningAppProcessInfo2;
                            break;
                        }
                    }
                    if (runningAppProcessInfo != null) {
                        f158115a = runningAppProcessInfo.processName;
                        return f158115a;
                    }
                }
            }
        }
        return "";
    }
}
