package p153l;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/Network;", "a", "(Landroid/net/ConnectivityManager;)Landroid/net/Network;", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
public final class nj20 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Network m163403a(@NotNull ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        return connectivityManager.getActiveNetwork();
    }
}
