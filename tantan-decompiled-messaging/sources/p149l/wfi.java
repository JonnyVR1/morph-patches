package p149l;

import com.clevertap.android.sdk.bitmap.HttpBitmapLoader;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.network.C1295a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.NetworkMonitor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/wfi;", "Ll/xfi;", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "networkMonitor", "<init>", "(Lcom/clevertap/android/sdk/network/NetworkMonitor;)V", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMeta", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Lkotlin/Pair;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class wfi implements xfi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final NetworkMonitor networkMonitor;

    /* JADX INFO: renamed from: l.wfi$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C20868a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f186084a;

        static {
            int[] iArr = new int[CtCacheType.values().length];
            try {
                iArr[CtCacheType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CtCacheType.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CtCacheType.FILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f186084a = iArr;
        }
    }

    public /* synthetic */ wfi(NetworkMonitor networkMonitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : networkMonitor);
    }

    @Override // p149l.xfi
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo202984a(@NotNull Pair<String, ? extends CtCacheType> urlMeta) {
        HttpBitmapLoader.HttpBitmapOperation httpBitmapOperation;
        urlMeta.getClass();
        NetworkMonitor networkMonitor = this.networkMonitor;
        if (networkMonitor != null && !networkMonitor.m6803n()) {
            return C1295a.m6812c(C1295a.INSTANCE, DownloadedBitmap.Status.NO_NETWORK, null, 2, null);
        }
        e13 e13Var = new e13(urlMeta.getFirst(), false, null, null, 0L, 0, 62, null);
        int i = C20868a.f186084a[urlMeta.getSecond().ordinal()];
        if (i == 1 || i == 2) {
            httpBitmapOperation = HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_INAPP_BITMAP;
        } else {
            if (i != 3) {
                l9r.m149037a();
                return null;
            }
            httpBitmapOperation = HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_BYTES;
        }
        return HttpBitmapLoader.m5947a(httpBitmapOperation, e13Var);
    }

    public wfi(@Nullable NetworkMonitor networkMonitor) {
        this.networkMonitor = networkMonitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wfi() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
