package p149l;

import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes.dex */
public final class jw5 {
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: a */
    public static boolean m143647a(@NonNull ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
