package p153l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class s9r implements u3d0<BitmapDrawable>, fum {

    /* JADX INFO: renamed from: a */
    private final Resources f166966a;

    /* JADX INFO: renamed from: b */
    private final u3d0<Bitmap> f166967b;

    private s9r(@NonNull Resources resources, @NonNull u3d0<Bitmap> u3d0Var) {
        this.f166966a = (Resources) vn80.m201944d(resources);
        this.f166967b = (u3d0) vn80.m201944d(u3d0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static u3d0<BitmapDrawable> m185217b(@NonNull Resources resources, @Nullable u3d0<Bitmap> u3d0Var) {
        if (u3d0Var == null) {
            return null;
        }
        return new s9r(resources, u3d0Var);
    }

    @Override // p153l.u3d0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f166966a, this.f166967b.get());
    }

    @Override // p153l.u3d0
    @NonNull
    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override // p153l.u3d0
    public int getSize() {
        return this.f166967b.getSize();
    }

    @Override // p153l.fum
    public void initialize() {
        u3d0<Bitmap> u3d0Var = this.f166967b;
        if (u3d0Var instanceof fum) {
            ((fum) u3d0Var).initialize();
        }
    }

    @Override // p153l.u3d0
    public void recycle() {
        this.f166967b.recycle();
    }
}
