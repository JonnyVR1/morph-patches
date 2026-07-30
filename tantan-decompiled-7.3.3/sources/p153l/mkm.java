package p153l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\r\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/mkm;", "", "Ll/kkm;", SocialConstants.TYPE_REQUEST, "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "isCachedRedirect", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Ll/kkm;Ljava/lang/Exception;ZLandroid/graphics/Bitmap;)V", "a", "Ll/kkm;", "c", "()Ll/kkm;", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "Z", Constants.INAPP_DATA_TAG, "()Z", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class mkm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final kkm request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Exception error;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isCachedRedirect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Bitmap bitmap;

    public mkm(@NotNull kkm kkmVar, @Nullable Exception exc, boolean z, @Nullable Bitmap bitmap) {
        kkmVar.getClass();
        this.request = kkmVar;
        this.error = exc;
        this.isCachedRedirect = z;
        this.bitmap = bitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final kkm getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsCachedRedirect() {
        return this.isCachedRedirect;
    }
}
