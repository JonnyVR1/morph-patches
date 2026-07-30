package p153l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J/\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/c23;", "", "", "frameNumber", "Ll/fb5;", "Landroid/graphics/Bitmap;", Constants.INAPP_DATA_TAG, "(I)Ll/fb5;", "a", "width", "height", "f", "(III)Ll/fb5;", "", "c", "(I)Z", "", BLiveResOperation.clear, "()V", "bitmapReference", "frameType", "b", "(ILl/fb5;I)V", "e", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface c23 {
    @Nullable
    /* JADX INFO: renamed from: a */
    fb5<Bitmap> mo107667a(int frameNumber);

    /* JADX INFO: renamed from: b */
    void mo107668b(int frameNumber, @NotNull fb5<Bitmap> bitmapReference, int frameType);

    /* JADX INFO: renamed from: c */
    boolean mo107669c(int frameNumber);

    void clear();

    @Nullable
    /* JADX INFO: renamed from: d */
    fb5<Bitmap> mo107670d(int frameNumber);

    /* JADX INFO: renamed from: e */
    void mo107671e(int frameNumber, @NotNull fb5<Bitmap> bitmapReference, int frameType);

    @Nullable
    /* JADX INFO: renamed from: f */
    fb5<Bitmap> mo107672f(int frameNumber, int width, int height);
}
