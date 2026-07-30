package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p153l.j26;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class WorkSourceUtil {
    private static final int zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;

    @GuardedBy("WorkSourceUtil.class")
    private static Boolean zzj;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        zza = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        zzb = method;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                method2 = WorkSource.class.getMethod("add", cls, String.class);
            } catch (Exception unused2) {
                method2 = null;
            }
        } else {
            method2 = null;
        }
        zzc = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        zzd = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        zze = method4;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                method5 = WorkSource.class.getMethod("getName", cls);
            } catch (Exception unused5) {
                method5 = null;
            }
        } else {
            method5 = null;
        }
        zzf = method5;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception unused6) {
                method6 = null;
            }
        } else {
            method6 = null;
        }
        zzg = method6;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception unused7) {
                method7 = null;
            }
        } else {
            method7 = null;
        }
        zzh = method7;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused8) {
                }
            } catch (Exception unused9) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        zzi = method8;
        zzj = null;
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@NonNull WorkSource workSource, int i, @NonNull String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackage(@NonNull Context context, @NonNull String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            return null;
        }
        int i = -1;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
            } else {
                i = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
        }
        if (i < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = zzg;
        if (method2 == null || (method = zzh) == null) {
            add(workSource, i, str);
        } else {
            try {
                Object objInvoke = method2.invoke(workSource, null);
                int i2 = zza;
                if (i != i2) {
                    method.invoke(objInvoke, Integer.valueOf(i), str);
                }
                method.invoke(objInvoke, Integer.valueOf(i2), str2);
            } catch (Exception unused2) {
            }
        }
        return workSource;
    }

    @KeepForSdk
    public static int get(@NonNull WorkSource workSource, int i) {
        Method method = zze;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, Integer.valueOf(i));
            Preconditions.checkNotNull(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return 0;
        }
    }

    @NonNull
    @KeepForSdk
    public static String getName(@NonNull WorkSource workSource, int i) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i));
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public static List<String> getNames(@NonNull WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(@NonNull Context context) {
        Boolean bool = zzj;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z = j26.m143188a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        zzj = Boolean.valueOf(z);
        return z;
    }

    @KeepForSdk
    public static boolean isEmpty(@NonNull WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(@NonNull WorkSource workSource) {
        Method method = zzd;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            Preconditions.checkNotNull(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return 0;
        }
    }
}
