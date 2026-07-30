package p149l;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class e16 {

    /* JADX INFO: renamed from: a */
    public static final Object f88711a = new Object();

    /* JADX INFO: renamed from: l.e16$a */
    @RequiresApi(21)
    public static class C16519a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Drawable m114388a(Context context, int i) {
            return context.getDrawable(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static File m114389b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: l.e16$b */
    @RequiresApi(23)
    public static class C16520b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m114390a(Context context, int i) {
            return context.getColor(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static <T> T m114391b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }

    /* JADX INFO: renamed from: l.e16$c */
    @RequiresApi(24)
    public static class C16521c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Context m114392a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* JADX INFO: renamed from: l.e16$d */
    @RequiresApi(26)
    public static class C16522d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Intent m114393a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, e16.m114382j(context), handler);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static ComponentName m114394b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: l.e16$e */
    @RequiresApi(33)
    public static class C16523e {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Intent m114395a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m114373a(@NonNull Context context, @NonNull String str) {
        w050.m200831d(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return nr40.m160709e(context).m160712a() ? 0 : -1;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Context m114374b(@NonNull Context context) {
        return C16521c.m114392a(context);
    }

    @ColorInt
    /* JADX INFO: renamed from: c */
    public static int m114375c(@NonNull Context context, @ColorRes int i) {
        return C16520b.m114390a(context, i);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ColorStateList m114376d(@NonNull Context context, @ColorRes int i) {
        return ywc0.m216333d(context.getResources(), i, context.getTheme());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Drawable m114377e(@NonNull Context context, @DrawableRes int i) {
        return C16519a.m114388a(context, i);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static File[] m114378f(@NonNull Context context) {
        return context.getExternalCacheDirs();
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static File[] m114379g(@NonNull Context context, @Nullable String str) {
        return context.getExternalFilesDirs(str);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static File m114380h(@NonNull Context context) {
        return C16519a.m114389b(context);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static <T> T m114381i(@NonNull Context context, @NonNull Class<T> cls) {
        return (T) C16520b.m114391b(context, cls);
    }

    /* JADX INFO: renamed from: j */
    public static String m114382j(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (nj60.m159646b(context, str) == 0) {
            return str;
        }
        yjw.m215098a("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static Intent m114383k(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i) {
        return m114384l(context, broadcastReceiver, intentFilter, null, null, i);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static Intent m114384l(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            ig3.m135964a("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            ig3.m135964a("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            ig3.m135964a("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return C16523e.m114395a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if (i5 >= 26) {
            return C16522d.m114393a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        return ((i3 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, m114382j(context), handler);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m114385m(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static void m114386n(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    /* JADX INFO: renamed from: o */
    public static void m114387o(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C16522d.m114394b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
