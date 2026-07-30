package p153l;

import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "", "a", "(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
public final class oj20 {
    /* JADX INFO: renamed from: a */
    public static final void m167840a(@NotNull ConnectivityManager connectivityManager, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
