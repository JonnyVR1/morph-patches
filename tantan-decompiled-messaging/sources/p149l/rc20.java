package p149l;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, m87232d2 = {"", "a", "[I", "defaultCapabilities", "Landroid/net/NetworkRequest;", "c", "(Landroid/net/NetworkRequest;)[I", "transportTypesCompat", "b", "capabilitiesCompat", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class rc20 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final int[] f158711a = {13, 15, 14};

    @RequiresApi(28)
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final int[] m178736b(@NotNull NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return pc20.INSTANCE.m168306a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (mc20.INSTANCE.m153981c(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt.toIntArray(arrayList);
    }

    @RequiresApi(28)
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final int[] m178737c(@NotNull NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return pc20.INSTANCE.m168307b(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (mc20.INSTANCE.m153982d(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt.toIntArray(arrayList);
    }
}
