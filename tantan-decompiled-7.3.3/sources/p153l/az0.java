package p153l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class az0 {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentMap<String, kzq> f74066a = new ConcurrentHashMap();

    @Nullable
    /* JADX INFO: renamed from: a */
    private static PackageInfo m100973a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static String m100974b(@Nullable PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static kzq m100975c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, kzq> concurrentMap = f74066a;
        kzq kzqVar = concurrentMap.get(packageName);
        if (kzqVar != null) {
            return kzqVar;
        }
        kzq kzqVarM100976d = m100976d(context);
        kzq kzqVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, kzqVarM100976d);
        return kzqVarPutIfAbsent == null ? kzqVarM100976d : kzqVarPutIfAbsent;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    private static kzq m100976d(@NonNull Context context) {
        return new d950(m100974b(m100973a(context)));
    }
}
