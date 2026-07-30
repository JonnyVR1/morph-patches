package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* JADX INFO: loaded from: classes.dex */
public class r460 {
    /* JADX INFO: renamed from: a */
    public static boolean m177777a(@NonNull Context context) {
        try {
            String str = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m177778b(@NonNull Context context) {
        return m177779c(context, "com.android.vending") || m177779c(context, "com.google.market");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m177779c(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
