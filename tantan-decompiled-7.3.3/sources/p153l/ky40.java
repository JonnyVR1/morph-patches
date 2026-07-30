package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1318a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/ky40;", "Ll/lpl;", "iBitmapDownloadRequestHandler", "<init>", "(Ll/lpl;)V", "Ll/t13;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Ll/t13;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ll/lpl;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ky40 implements lpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final lpl iBitmapDownloadRequestHandler;

    public ky40(@NotNull lpl lplVar) {
        lplVar.getClass();
        this.iBitmapDownloadRequestHandler = lplVar;
    }

    @Override // p153l.lpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo151950a(@NotNull t13 bitmapDownloadRequest) {
        bitmapDownloadRequest.getClass();
        Logger.m5927v("handling bitmap download request in NotificationBitmapDownloadRequestHandler....");
        String bitmapPath = bitmapDownloadRequest.getBitmapPath();
        boolean fallbackToAppIcon = bitmapDownloadRequest.getFallbackToAppIcon();
        Context context = bitmapDownloadRequest.getContext();
        if (bitmapPath == null || StringsKt.m94329e0(bitmapPath)) {
            DownloadedBitmap downloadedBitmapM5970m = Utils.m5970m(fallbackToAppIcon, context, C1318a.m6866c(C1318a.INSTANCE, DownloadedBitmap.Status.NO_IMAGE, null, 2, null));
            downloadedBitmapM5970m.getClass();
            return downloadedBitmapM5970m;
        }
        DownloadedBitmap downloadedBitmapM5970m2 = Utils.m5970m(fallbackToAppIcon, context, this.iBitmapDownloadRequestHandler.mo151950a(bitmapDownloadRequest));
        downloadedBitmapM5970m2.getClass();
        return downloadedBitmapM5970m2;
    }
}
