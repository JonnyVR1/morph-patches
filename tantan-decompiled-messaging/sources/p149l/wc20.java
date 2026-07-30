package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u0005*\u00020\u000b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u0005*\u00020\u00158AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Landroid/content/Context;", "context", "Ll/zei0;", "taskExecutor", "Ll/ez5;", "Ll/uc20;", "a", "(Landroid/content/Context;Ll/zei0;)Ll/ez5;", "", "Ljava/lang/String;", "TAG", "Landroid/net/ConnectivityManager;", "", "e", "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "c", "(Landroid/net/ConnectivityManager;)Ll/uc20;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "activeNetworkState", "Landroid/net/NetworkCapabilities;", Constants.INAPP_DATA_TAG, "(Landroid/net/NetworkCapabilities;)Ll/uc20;", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class wc20 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f185638a;

    static {
        String strM190978i = txv.m190978i("NetworkStateTracker");
        strM190978i.getClass();
        f185638a = strM190978i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ez5<uc20> m202597a(@NotNull Context context, @NotNull zei0 zei0Var) {
        context.getClass();
        zei0Var.getClass();
        return new vc20(context, zei0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final uc20 m202599c(@NotNull ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zM202601e = m202601e(connectivityManager);
        boolean zM143647a = jw5.m143647a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new uc20(z2, zM202601e, zM143647a, z);
    }

    @RequiresApi(28)
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final uc20 m202600d(@NotNull NetworkCapabilities networkCapabilities) {
        networkCapabilities.getClass();
        return new uc20(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m202601e(@NotNull ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        try {
            NetworkCapabilities networkCapabilitiesM110636a = db20.m110636a(connectivityManager, eb20.m115453a(connectivityManager));
            if (networkCapabilitiesM110636a != null) {
                return db20.m110637b(networkCapabilitiesM110636a, 16);
            }
            return false;
        } catch (SecurityException e) {
            txv.m190976e().mo190982d(f185638a, "Unable to validate active network", e);
            return false;
        }
    }
}
