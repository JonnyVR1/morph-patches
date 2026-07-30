package p153l;

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
public class j26 {

    /* JADX INFO: renamed from: a */
    public static final Object f118035a = new Object();

    /* JADX INFO: renamed from: l.j26$a */
    @RequiresApi(21)
    public static class C17856a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Drawable m143203a(Context context, int i) {
            return context.getDrawable(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static File m143204b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: l.j26$b */
    @RequiresApi(23)
    public static class C17857b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m143205a(Context context, int i) {
            return context.getColor(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static <T> T m143206b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }

    /* JADX INFO: renamed from: l.j26$c */
    @RequiresApi(24)
    public static class C17858c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Context m143207a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* JADX INFO: renamed from: l.j26$d */
    @RequiresApi(26)
    public static class C17859d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Intent m143208a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, j26.m143197j(context), handler);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static ComponentName m143209b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: l.j26$e */
    @RequiresApi(33)
    public static class C17860e {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Intent m143210a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m143188a(@NonNull Context context, @NonNull String str) {
        l950.m153330d(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return c050.m107319e(context).m107322a() ? 0 : -1;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Context m143189b(@NonNull Context context) {
        return C17858c.m143207a(context);
    }

    @ColorInt
    /* JADX INFO: renamed from: c */
    public static int m143190c(@NonNull Context context, @ColorRes int i) {
        return C17857b.m143205a(context, i);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ColorStateList m143191d(@NonNull Context context, @ColorRes int i) {
        return c5d0.m108034d(context.getResources(), i, context.getTheme());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Drawable m143192e(@NonNull Context context, @DrawableRes int i) {
        return C17856a.m143203a(context, i);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static File[] m143193f(@NonNull Context context) {
        return context.getExternalCacheDirs();
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static File[] m143194g(@NonNull Context context, @Nullable String str) {
        return context.getExternalFilesDirs(str);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static File m143195h(@NonNull Context context) {
        return C17856a.m143204b(context);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static <T> T m143196i(@NonNull Context context, @NonNull Class<T> cls) {
        return (T) C17857b.m143206b(context, cls);
    }

    /* JADX INFO: renamed from: j */
    public static String m143197j(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (sr60.m187592b(context, str) == 0) {
            return str;
        }
        xmw.m212069a("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static Intent m143198k(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i) {
        return m143199l(context, broadcastReceiver, intentFilter, null, null, i);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static Intent m143199l(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            wg3.m206174a("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            wg3.m206174a("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            wg3.m206174a("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return C17860e.m143210a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if (i5 >= 26) {
            return C17859d.m143208a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        return ((i3 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, m143197j(context), handler);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m143200m(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static void m143201n(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    /* JADX INFO: renamed from: o */
    public static void m143202o(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17859d.m143209b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
