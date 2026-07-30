package p153l;

import com.clevertap.android.sdk.bitmap.HttpBitmapLoader;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.network.C1318a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.NetworkMonitor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/tii;", "Ll/uii;", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "networkMonitor", "<init>", "(Lcom/clevertap/android/sdk/network/NetworkMonitor;)V", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMeta", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Lkotlin/Pair;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class tii implements uii {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final NetworkMonitor networkMonitor;

    /* JADX INFO: renamed from: l.tii$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C20324a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f174468a;

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
            f174468a = iArr;
        }
    }

    public /* synthetic */ tii(NetworkMonitor networkMonitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : networkMonitor);
    }

    @Override // p153l.uii
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo191334a(@NotNull Pair<String, ? extends CtCacheType> urlMeta) {
        HttpBitmapLoader.HttpBitmapOperation httpBitmapOperation;
        urlMeta.getClass();
        NetworkMonitor networkMonitor = this.networkMonitor;
        if (networkMonitor != null && !networkMonitor.m6857n()) {
            return C1318a.m6866c(C1318a.INSTANCE, DownloadedBitmap.Status.NO_NETWORK, null, 2, null);
        }
        t13 t13Var = new t13(urlMeta.getFirst(), false, null, null, 0L, 0, 62, null);
        int i = C20324a.f174468a[urlMeta.getSecond().ordinal()];
        if (i == 1 || i == 2) {
            httpBitmapOperation = HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_INAPP_BITMAP;
        } else {
            if (i != 3) {
                nbr.m162172a();
                return null;
            }
            httpBitmapOperation = HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_BYTES;
        }
        return HttpBitmapLoader.m6001a(httpBitmapOperation, t13Var);
    }

    public tii(@Nullable NetworkMonitor networkMonitor) {
        this.networkMonitor = networkMonitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tii() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
