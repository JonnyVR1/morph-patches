package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1295a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.task.Task;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/h13;", "Ll/anl;", "iBitmapDownloadRequestHandler", "<init>", "(Ll/anl;)V", "Ll/e13;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Ll/e13;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ll/anl;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class h13 implements anl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final anl iBitmapDownloadRequestHandler;

    public h13(@NotNull anl anlVar) {
        anlVar.getClass();
        this.iBitmapDownloadRequestHandler = anlVar;
    }

    /* JADX INFO: renamed from: b */
    public static DownloadedBitmap m129020b(h13 h13Var, e13 e13Var) {
        h13Var.getClass();
        e13Var.getClass();
        return h13Var.iBitmapDownloadRequestHandler.mo97757a(e13Var);
    }

    @Override // p149l.anl
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo97757a(@NotNull final e13 bitmapDownloadRequest) {
        bitmapDownloadRequest.getClass();
        Logger.m5873v("handling bitmap download request in BitmapDownloadRequestHandlerWithTimeLimit....");
        boolean fallbackToAppIcon = bitmapDownloadRequest.getFallbackToAppIcon();
        Context context = bitmapDownloadRequest.getContext();
        CleverTapInstanceConfig instanceConfig = bitmapDownloadRequest.getInstanceConfig();
        long downloadTimeLimitInMillis = bitmapDownloadRequest.getDownloadTimeLimitInMillis();
        if (instanceConfig == null || downloadTimeLimitInMillis == -1) {
            Logger.m5873v("either config is null or downloadTimeLimitInMillis is negative.");
            Logger.m5873v("will download bitmap without time limit");
            return this.iBitmapDownloadRequestHandler.mo97757a(bitmapDownloadRequest);
        }
        Task taskM190589a = st3.m185849c(instanceConfig).m190589a();
        taskM190589a.getClass();
        DownloadedBitmap downloadedBitmapM6815b = (DownloadedBitmap) taskM190589a.m6952o("getNotificationBitmap", new Callable() { // from class: l.g13
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h13.m129020b(this.f100111a, bitmapDownloadRequest);
            }
        }, downloadTimeLimitInMillis);
        if (downloadedBitmapM6815b == null) {
            Logger.m5865d("Task timeout or executor framework error");
            downloadedBitmapM6815b = C1295a.INSTANCE.m6815b(DownloadedBitmap.Status.DOWNLOAD_FAILED, "Task timeout or executor framework error");
        }
        DownloadedBitmap downloadedBitmapM5916m = Utils.m5916m(fallbackToAppIcon, context, downloadedBitmapM6815b);
        downloadedBitmapM5916m.getClass();
        return downloadedBitmapM5916m;
    }
}
