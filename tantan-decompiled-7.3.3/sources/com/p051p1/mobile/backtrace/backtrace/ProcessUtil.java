package com.p051p1.mobile.backtrace.backtrace;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes8.dex */
public class ProcessUtil {
    private static String sProcessName;

    public static synchronized String getProcessNameByPid(Context context) {
        try {
            if (sProcessName == null) {
                sProcessName = getProcessNameByPidImpl(context, Process.myPid());
            }
        } catch (Throwable th) {
            throw th;
        }
        return sProcessName;
    }

    private static String getProcessNameByPidImpl(Context context, int i) throws Throwable {
        int i2;
        String str;
        if (context != null && i > 0) {
            try {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == i && (str = runningAppProcessInfo.processName) != null && !str.equals("")) {
                        return runningAppProcessInfo.processName;
                    }
                }
            } catch (Exception unused) {
            }
            byte[] bArr = new byte[128];
            BufferedInputStream bufferedInputStream = null;
            try {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream("/proc/" + i + "/cmdline"));
                    try {
                        int i3 = bufferedInputStream2.read(bArr);
                        if (i3 > 0) {
                            for (0; i2 < i3; i2 + 1) {
                                byte b = bArr[i2];
                                i2 = (b <= 128 && b > 0) ? i2 + 1 : 0;
                                i3 = i2;
                                break;
                            }
                            String str2 = new String(bArr, 0, i3);
                            try {
                                bufferedInputStream2.close();
                            } catch (Exception unused2) {
                            }
                            return str2;
                        }
                        bufferedInputStream2.close();
                    } catch (Exception unused3) {
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
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

    public static boolean isMainProcess(Context context) {
        return context.getPackageName().equalsIgnoreCase(getProcessNameByPid(context));
    }
}
