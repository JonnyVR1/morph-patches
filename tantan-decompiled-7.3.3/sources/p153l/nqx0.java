package p153l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.base.Optional;
import com.momo.momortc.MMConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class nqx0 {

    /* JADX INFO: renamed from: a */
    public static volatile Optional<Boolean> f143265a = Optional.absent();

    /* JADX INFO: renamed from: b */
    public static final Object f143266b = new Object();

    /* JADX INFO: renamed from: a */
    public static boolean m164359a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & MMConstants.ERR_WATERMARK_READ) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m164360b(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f143265a.isPresent()) {
            return f143265a.get().booleanValue();
        }
        synchronized (f143266b) {
            try {
                if (f143265a.isPresent()) {
                    return f143265a.get().booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : SQLiteDatabase.CREATE_IF_NECESSARY);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    f143265a = Optional.m15467of(Boolean.valueOf(z));
                    return f143265a.get().booleanValue();
                }
                if (m164359a(context)) {
                    z = true;
                }
                f143265a = Optional.m15467of(Boolean.valueOf(z));
                return f143265a.get().booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
