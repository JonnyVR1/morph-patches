package p153l;

import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.C1318a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import kotlin.Metadata;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/u13;", "Ll/lpl;", "Ll/x13;", "bitmapDownloader", "<init>", "(Ll/x13;)V", "Ll/t13;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Ll/t13;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ll/x13;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class u13 implements lpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final x13 bitmapDownloader;

    public u13(@NotNull x13 x13Var) {
        x13Var.getClass();
        this.bitmapDownloader = x13Var;
    }

    @Override // p153l.lpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo151950a(@NotNull t13 bitmapDownloadRequest) {
        bitmapDownloadRequest.getClass();
        Logger.m5927v("handling bitmap download request in BitmapDownloadRequestHandler....");
        String strM188839f = bitmapDownloadRequest.m188839f();
        if (strM188839f == null || StringsKt.m94329e0(strM188839f)) {
            return C1318a.m6866c(C1318a.INSTANCE, DownloadedBitmap.Status.NO_IMAGE, null, 2, null);
        }
        return this.bitmapDownloader.m208904b(C15493d.m94370F(C15493d.m94370F(C15493d.m94370F(C15493d.m94370F(strM188839f, "///", "/", false, 4, null), "//", "/", false, 4, null), "http:/", "http://", false, 4, null), "https:/", "https://", false, 4, null));
    }
}
