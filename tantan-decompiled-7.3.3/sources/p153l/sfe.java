package p153l;

import android.graphics.Bitmap;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/sfe;", "Ll/v23;", "<init>", "()V", "", "size", "Landroid/graphics/Bitmap;", "g", "(I)Landroid/graphics/Bitmap;", "value", "", "h", "(Landroid/graphics/Bitmap;)V", "", "a", "Ljava/util/Set;", "inUseValues", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class sfe implements v23 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Set<Bitmap> inUseValues;

    public sfe() {
        Set<Bitmap> setM106564b = bve0.m106564b();
        setM106564b.getClass();
        this.inUseValues = setM106564b;
    }

    @Override // p153l.vi80
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int size) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) size) / 2.0d), Bitmap.Config.RGB_565);
        bitmapCreateBitmap.getClass();
        this.inUseValues.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // p153l.vi80, p153l.w4d0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void release(@NotNull Bitmap value) {
        value.getClass();
        this.inUseValues.remove(value);
        value.recycle();
    }
}
