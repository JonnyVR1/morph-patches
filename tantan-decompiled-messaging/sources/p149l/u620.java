package p149l;

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
public final class u620 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static Intent m191904a(@NonNull Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strM191906c = m191906c(activity);
        if (strM191906c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM191906c);
        try {
            return m191907d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM191906c + "' in manifest");
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Intent m191905b(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM191907d = m191907d(context, componentName);
        if (strM191907d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM191907d);
        return m191907d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m191906c(@NonNull Activity activity) {
        try {
            return m191907d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            fg3.m121203a(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m191907d(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
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
    public static void m191908e(@NonNull Activity activity) {
        Intent intentM191904a = m191904a(activity);
        if (intentM191904a != null) {
            m191909f(activity, intentM191904a);
        } else {
            all.m97315a("Activity ", activity.getClass().getSimpleName(), " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m191909f(@NonNull Activity activity, @NonNull Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m191910g(@NonNull Activity activity, @NonNull Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
