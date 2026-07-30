package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class lc90 {

    /* JADX INFO: renamed from: a */
    private static volatile String f127388a;

    /* JADX INFO: renamed from: a */
    public static String m149285a(Context context) throws Throwable {
        int i;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager.RunningAppProcessInfo next;
        if (!TextUtils.isEmpty(f127388a)) {
            return f127388a;
        }
        int iMyPid = Process.myPid();
        if (context != null && iMyPid > 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            FileInputStream fileInputStream = null;
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                try {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (next.pid != iMyPid);
                } catch (Exception unused) {
                }
                if (next != null && !TextUtils.isEmpty(next.processName)) {
                    f127388a = next.processName;
                    return f127388a;
                }
            }
            byte[] bArr = new byte[128];
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream("/proc/" + iMyPid + "/cmdline");
                    try {
                        int i2 = fileInputStream2.read(bArr);
                        if (i2 > 0) {
                            for (0; i < i2; i + 1) {
                                byte b = bArr[i];
                                i = ((b & 255) <= 128 && b > 0) ? i + 1 : 0;
                                i2 = i;
                                break;
                            }
                            f127388a = new String(bArr, 0, i2);
                            String str = f127388a;
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused2) {
                            }
                            return str;
                        }
                        fileInputStream2.close();
                    } catch (Exception unused3) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused5) {
                }
            } catch (Exception unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m149286b(Context context) throws Throwable {
        String strM149285a = m149285a(context);
        if (TextUtils.equals(strM149285a, context.getPackageName())) {
            return BLiveTraceServerLocation.main;
        }
        return (strM149285a == null || !strM149285a.contains(":") || strM149285a.indexOf(":") <= 0) ? "" : strM149285a.substring(strM149285a.indexOf(":") + 1);
    }
}
