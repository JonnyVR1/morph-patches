package p153l;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "", "c", "(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "a", "(Landroid/net/ConnectivityManager;Landroid/net/Network;)Landroid/net/NetworkCapabilities;", "", "capability", "", "b", "(Landroid/net/NetworkCapabilities;I)Z", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
public final class mj20 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final NetworkCapabilities m158565a(@NotNull ConnectivityManager connectivityManager, @Nullable Network network) {
        connectivityManager.getClass();
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m158566b(@NotNull NetworkCapabilities networkCapabilities, int i) {
        networkCapabilities.getClass();
        return networkCapabilities.hasCapability(i);
    }

    /* JADX INFO: renamed from: c */
    public static final void m158567c(@NotNull ConnectivityManager connectivityManager, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
