package p149l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m87232d2 = {"Ll/i23;", "Ll/xew;", "Landroid/graphics/Bitmap;", "<init>", "()V", "bitmap", "", "f", "(Landroid/graphics/Bitmap;)V", "", "size", "c", "(I)Landroid/graphics/Bitmap;", Constants.INAPP_DATA_TAG, "(Landroid/graphics/Bitmap;)I", "", "e", "(Landroid/graphics/Bitmap;)Z", "Companion", "a", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class i23 extends xew<Bitmap> {
    @Override // p149l.xew, p149l.qa80
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int size) {
        Bitmap bitmap = (Bitmap) super.get(size);
        if (bitmap == null || !m134044e(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // p149l.qa80
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int mo134041a(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        return t23.m186960i(bitmap);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m134044e(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            tsf.m190534B("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        tsf.m190534B("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // p149l.xew, p149l.qa80
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        if (m134044e(bitmap)) {
            super.put(bitmap);
        }
    }
}
