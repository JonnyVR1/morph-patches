package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1295a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/wp40;", "Ll/anl;", "iBitmapDownloadRequestHandler", "<init>", "(Ll/anl;)V", "Ll/e13;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Ll/e13;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ll/anl;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class wp40 implements anl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final anl iBitmapDownloadRequestHandler;

    public wp40(@NotNull anl anlVar) {
        anlVar.getClass();
        this.iBitmapDownloadRequestHandler = anlVar;
    }

    @Override // p149l.anl
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo97757a(@NotNull e13 bitmapDownloadRequest) {
        bitmapDownloadRequest.getClass();
        Logger.m5873v("handling bitmap download request in NotificationBitmapDownloadRequestHandler....");
        String bitmapPath = bitmapDownloadRequest.getBitmapPath();
        boolean fallbackToAppIcon = bitmapDownloadRequest.getFallbackToAppIcon();
        Context context = bitmapDownloadRequest.getContext();
        if (bitmapPath == null || StringsKt.m93438e0(bitmapPath)) {
            DownloadedBitmap downloadedBitmapM5916m = Utils.m5916m(fallbackToAppIcon, context, C1295a.m6812c(C1295a.INSTANCE, DownloadedBitmap.Status.NO_IMAGE, null, 2, null));
            downloadedBitmapM5916m.getClass();
            return downloadedBitmapM5916m;
        }
        DownloadedBitmap downloadedBitmapM5916m2 = Utils.m5916m(fallbackToAppIcon, context, this.iBitmapDownloadRequestHandler.mo97757a(bitmapDownloadRequest));
        downloadedBitmapM5916m2.getClass();
        return downloadedBitmapM5916m2;
    }
}
