package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class e33 implements u3d0<Bitmap>, fum {

    /* JADX INFO: renamed from: a */
    private final Bitmap f91920a;

    /* JADX INFO: renamed from: b */
    private final w23 f91921b;

    public e33(@NonNull Bitmap bitmap, @NonNull w23 w23Var) {
        this.f91920a = (Bitmap) vn80.m201945e(bitmap, "Bitmap must not be null");
        this.f91921b = (w23) vn80.m201945e(w23Var, "BitmapPool must not be null");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static e33 m119246b(@Nullable Bitmap bitmap, @NonNull w23 w23Var) {
        if (bitmap == null) {
            return null;
        }
        return new e33(bitmap, w23Var);
    }

    @Override // p153l.u3d0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f91920a;
    }

    @Override // p153l.u3d0
    @NonNull
    public Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }

    @Override // p153l.u3d0
    public int getSize() {
        return ylk0.m216584h(this.f91920a);
    }

    @Override // p153l.fum
    public void initialize() {
        this.f91920a.prepareToDraw();
    }

    @Override // p153l.u3d0
    public void recycle() {
        this.f91921b.mo191126c(this.f91920a);
    }
}
