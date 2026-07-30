package p149l;

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
public final class ty0 {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentMap<String, kxq> f172549a = new ConcurrentHashMap();

    @Nullable
    /* JADX INFO: renamed from: a */
    private static PackageInfo m190990a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static String m190991b(@Nullable PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static kxq m190992c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, kxq> concurrentMap = f172549a;
        kxq kxqVar = concurrentMap.get(packageName);
        if (kxqVar != null) {
            return kxqVar;
        }
        kxq kxqVarM190993d = m190993d(context);
        kxq kxqVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, kxqVarM190993d);
        return kxqVarPutIfAbsent == null ? kxqVarM190993d : kxqVarPutIfAbsent;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    private static kxq m190993d(@NonNull Context context) {
        return new o050(m190991b(m190990a(context)));
    }
}
