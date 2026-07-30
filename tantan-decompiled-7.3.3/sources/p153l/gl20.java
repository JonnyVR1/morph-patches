package p153l;

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
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u0005*\u00020\u000b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u0005*\u00020\u00158AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Landroid/content/Context;", "context", "Ll/zni0;", "taskExecutor", "Ll/j06;", "Ll/el20;", "a", "(Landroid/content/Context;Ll/zni0;)Ll/j06;", "", "Ljava/lang/String;", "TAG", "Landroid/net/ConnectivityManager;", "", "e", "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "c", "(Landroid/net/ConnectivityManager;)Ll/el20;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "activeNetworkState", "Landroid/net/NetworkCapabilities;", Constants.INAPP_DATA_TAG, "(Landroid/net/NetworkCapabilities;)Ll/el20;", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class gl20 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f104793a;

    static {
        String strM178831i = qzv.m178831i("NetworkStateTracker");
        strM178831i.getClass();
        f104793a = strM178831i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final j06<el20> m130611a(@NotNull Context context, @NotNull zni0 zni0Var) {
        context.getClass();
        zni0Var.getClass();
        return new fl20(context, zni0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final el20 m130613c(@NotNull ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zM130615e = m130615e(connectivityManager);
        boolean zM169675a = ox5.m169675a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new el20(z2, zM130615e, zM169675a, z);
    }

    @RequiresApi(28)
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final el20 m130614d(@NotNull NetworkCapabilities networkCapabilities) {
        networkCapabilities.getClass();
        return new el20(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m130615e(@NotNull ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        try {
            NetworkCapabilities networkCapabilitiesM158565a = mj20.m158565a(connectivityManager, nj20.m163403a(connectivityManager));
            if (networkCapabilitiesM158565a != null) {
                return mj20.m158566b(networkCapabilitiesM158565a, 16);
            }
            return false;
        } catch (SecurityException e) {
            qzv.m178829e().mo178835d(f104793a, "Unable to validate active network", e);
            return false;
        }
    }
}
