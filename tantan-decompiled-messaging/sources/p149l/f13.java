package p149l;

import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.C1295a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import kotlin.Metadata;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/f13;", "Ll/anl;", "Ll/i13;", "bitmapDownloader", "<init>", "(Ll/i13;)V", "Ll/e13;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Ll/e13;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ll/i13;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class f13 implements anl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final i13 bitmapDownloader;

    public f13(@NotNull i13 i13Var) {
        i13Var.getClass();
        this.bitmapDownloader = i13Var;
    }

    @Override // p149l.anl
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo97757a(@NotNull e13 bitmapDownloadRequest) {
        bitmapDownloadRequest.getClass();
        Logger.m5873v("handling bitmap download request in BitmapDownloadRequestHandler....");
        String strM114364f = bitmapDownloadRequest.m114364f();
        if (strM114364f == null || StringsKt.m93438e0(strM114364f)) {
            return C1295a.m6812c(C1295a.INSTANCE, DownloadedBitmap.Status.NO_IMAGE, null, 2, null);
        }
        return this.bitmapDownloader.m133964b(C15386d.m93479F(C15386d.m93479F(C15386d.m93479F(C15386d.m93479F(strM114364f, "///", "/", false, 4, null), "//", "/", false, 4, null), "http:/", "http://", false, 4, null), "https:/", "https://", false, 4, null));
    }
}
