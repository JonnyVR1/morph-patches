package p153l;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/pfe;", "Ll/v23;", "<init>", "()V", "", "size", "Landroid/graphics/Bitmap;", "g", "(I)Landroid/graphics/Bitmap;", "value", "", "h", "(Landroid/graphics/Bitmap;)V", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class pfe implements v23 {
    @Override // p153l.vi80
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int size) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) size) / 2.0d), Bitmap.Config.RGB_565);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    @Override // p153l.vi80, p153l.w4d0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void release(@NotNull Bitmap value) {
        value.getClass();
        value.recycle();
    }
}
