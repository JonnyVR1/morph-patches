package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
public class uax0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @GuardedBy("DirectBootUtils.class")
    public static UserManager f178245a;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f178246b = !m195203a();

    @ChecksSdkIntAtLeast(api = 24)
    /* JADX INFO: renamed from: a */
    public static boolean m195203a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m195204b(Context context) {
        return m195203a() && !m195206d(context);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m195205c(Context context) {
        return !m195203a() || m195206d(context);
    }

    @RequiresApi(24)
    @TargetApi(24)
    /* JADX INFO: renamed from: d */
    public static boolean m195206d(Context context) {
        if (f178246b) {
            return true;
        }
        synchronized (uax0.class) {
            try {
                if (f178246b) {
                    return true;
                }
                boolean zM195207e = m195207e(context);
                if (zM195207e) {
                    f178246b = zM195207e;
                }
                return zM195207e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(24)
    @TargetApi(24)
    @GuardedBy("DirectBootUtils.class")
    /* JADX INFO: renamed from: e */
    public static boolean m195207e(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f178245a == null) {
                f178245a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f178245a;
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
                f178245a = null;
                i++;
            }
        }
        if (z) {
            f178245a = null;
        }
        return z;
    }
}
