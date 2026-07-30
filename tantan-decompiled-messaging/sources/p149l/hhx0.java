package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.base.Optional;
import com.momo.momortc.MMConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class hhx0 {

    /* JADX INFO: renamed from: a */
    public static volatile Optional<Boolean> f107857a = Optional.absent();

    /* JADX INFO: renamed from: b */
    public static final Object f107858b = new Object();

    /* JADX INFO: renamed from: a */
    public static boolean m131193a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & MMConstants.ERR_WATERMARK_READ) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m131194b(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f107857a.isPresent()) {
            return f107857a.get().booleanValue();
        }
        synchronized (f107858b) {
            try {
                if (f107857a.isPresent()) {
                    return f107857a.get().booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    f107857a = Optional.m15413of(Boolean.valueOf(z));
                    return f107857a.get().booleanValue();
                }
                if (m131193a(context)) {
                    z = true;
                }
                f107857a = Optional.m15413of(Boolean.valueOf(z));
                return f107857a.get().booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
