package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes11.dex */
public class yx0 {
    /* JADX INFO: renamed from: a */
    public static void m217666a(Context context) {
        try {
            ((ActivityManager) context.getSystemService("activity")).clearApplicationUserData();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            m217670e(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m217667b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m217668c(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (TextUtils.equals(runningAppProcessInfo.processName, packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m217669d() {
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX INFO: renamed from: e */
    public static void m217670e(@NonNull Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            context.startActivity(launchIntentForPackage);
        }
        m217669d();
    }
}
