package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1318a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.task.Task;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/w13;", "Ll/lpl;", "iBitmapDownloadRequestHandler", "<init>", "(Ll/lpl;)V", "Ll/t13;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Ll/t13;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ll/lpl;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class w13 implements lpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final lpl iBitmapDownloadRequestHandler;

    public w13(@NotNull lpl lplVar) {
        lplVar.getClass();
        this.iBitmapDownloadRequestHandler = lplVar;
    }

    /* JADX INFO: renamed from: b */
    public static DownloadedBitmap m204376b(w13 w13Var, t13 t13Var) {
        w13Var.getClass();
        t13Var.getClass();
        return w13Var.iBitmapDownloadRequestHandler.mo151950a(t13Var);
    }

    @Override // p153l.lpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo151950a(@NotNull final t13 bitmapDownloadRequest) {
        bitmapDownloadRequest.getClass();
        Logger.m5927v("handling bitmap download request in BitmapDownloadRequestHandlerWithTimeLimit....");
        boolean fallbackToAppIcon = bitmapDownloadRequest.getFallbackToAppIcon();
        Context context = bitmapDownloadRequest.getContext();
        CleverTapInstanceConfig instanceConfig = bitmapDownloadRequest.getInstanceConfig();
        long downloadTimeLimitInMillis = bitmapDownloadRequest.getDownloadTimeLimitInMillis();
        if (instanceConfig == null || downloadTimeLimitInMillis == -1) {
            Logger.m5927v("either config is null or downloadTimeLimitInMillis is negative.");
            Logger.m5927v("will download bitmap without time limit");
            return this.iBitmapDownloadRequestHandler.mo151950a(bitmapDownloadRequest);
        }
        Task taskM187987a = ru3.m183186c(instanceConfig).m187987a();
        taskM187987a.getClass();
        DownloadedBitmap downloadedBitmapM6869b = (DownloadedBitmap) taskM187987a.m7006o("getNotificationBitmap", new Callable() { // from class: l.v13
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w13.m204376b(this.f181920a, bitmapDownloadRequest);
            }
        }, downloadTimeLimitInMillis);
        if (downloadedBitmapM6869b == null) {
            Logger.m5919d("Task timeout or executor framework error");
            downloadedBitmapM6869b = C1318a.INSTANCE.m6869b(DownloadedBitmap.Status.DOWNLOAD_FAILED, "Task timeout or executor framework error");
        }
        DownloadedBitmap downloadedBitmapM5970m = Utils.m5970m(fallbackToAppIcon, context, downloadedBitmapM6869b);
        downloadedBitmapM5970m.getClass();
        return downloadedBitmapM5970m;
    }
}
