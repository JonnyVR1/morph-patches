package p153l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class cf20 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static Intent m109506a(@NonNull Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strM109508c = m109508c(activity);
        if (strM109508c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM109508c);
        try {
            return m109509d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM109508c + "' in manifest");
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Intent m109507b(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM109509d = m109509d(context, componentName);
        if (strM109509d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM109509d);
        return m109509d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m109508c(@NonNull Activity activity) {
        try {
            return m109509d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m109509d(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: e */
    public static void m109510e(@NonNull Activity activity) {
        Intent intentM109506a = m109506a(activity);
        if (intentM109506a != null) {
            m109511f(activity, intentM109506a);
        } else {
            pnl.m173070a("Activity ", activity.getClass().getSimpleName(), " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m109511f(@NonNull Activity activity, @NonNull Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m109512g(@NonNull Activity activity, @NonNull Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
