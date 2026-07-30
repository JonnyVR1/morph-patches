package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
public class o1x0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @GuardedBy("DirectBootUtils.class")
    public static UserManager f141486a;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f141487b = !m162270a();

    @ChecksSdkIntAtLeast(api = 24)
    /* JADX INFO: renamed from: a */
    public static boolean m162270a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m162271b(Context context) {
        return m162270a() && !m162273d(context);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m162272c(Context context) {
        return !m162270a() || m162273d(context);
    }

    @RequiresApi(24)
    @TargetApi(24)
    /* JADX INFO: renamed from: d */
    public static boolean m162273d(Context context) {
        if (f141487b) {
            return true;
        }
        synchronized (o1x0.class) {
            try {
                if (f141487b) {
                    return true;
                }
                boolean zM162274e = m162274e(context);
                if (zM162274e) {
                    f141487b = zM162274e;
                }
                return zM162274e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(24)
    @TargetApi(24)
    @GuardedBy("DirectBootUtils.class")
    /* JADX INFO: renamed from: e */
    public static boolean m162274e(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f141486a == null) {
                f141486a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f141486a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
                break;
            } catch (NullPointerException unused) {
                f141486a = null;
                i++;
            }
        }
        if (z) {
            f141486a = null;
        }
        return z;
    }
}
