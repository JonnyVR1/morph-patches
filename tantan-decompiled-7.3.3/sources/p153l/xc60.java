package p153l;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* JADX INFO: loaded from: classes.dex */
public class xc60 {
    /* JADX INFO: renamed from: a */
    public static boolean m210129a(@NonNull Context context) {
        try {
            String str = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m210130b(@NonNull Context context) {
        return m210131c(context, "com.android.vending") || m210131c(context, "com.google.market");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m210131c(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
