package p153l;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, m88121d2 = {"", "a", "[I", "defaultCapabilities", "Landroid/net/NetworkRequest;", "c", "(Landroid/net/NetworkRequest;)[I", "transportTypesCompat", "b", "capabilitiesCompat", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class bl20 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final int[] f77141a = {13, 15, 14};

    @RequiresApi(28)
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final int[] m104868b(@NotNull NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return zk20.INSTANCE.m220049a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (wk20.INSTANCE.m206739c(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt.toIntArray(arrayList);
    }

    @RequiresApi(28)
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final int[] m104869c(@NotNull NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return zk20.INSTANCE.m220050b(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (wk20.INSTANCE.m206740d(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt.toIntArray(arrayList);
    }
}
