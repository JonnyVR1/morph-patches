package p153l;

import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes.dex */
public final class ox5 {
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: a */
    public static boolean m169675a(@NonNull ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
