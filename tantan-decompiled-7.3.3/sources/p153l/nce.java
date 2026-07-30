package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class nce implements y4d0<Drawable, byte[]> {

    /* JADX INFO: renamed from: a */
    private final w23 f141337a;

    /* JADX INFO: renamed from: b */
    private final y4d0<Bitmap, byte[]> f141338b;

    /* JADX INFO: renamed from: c */
    private final y4d0<bnj, byte[]> f141339c;

    public nce(@NonNull w23 w23Var, @NonNull y4d0<Bitmap, byte[]> y4d0Var, @NonNull y4d0<bnj, byte[]> y4d0Var2) {
        this.f141337a = w23Var;
        this.f141338b = y4d0Var;
        this.f141339c = y4d0Var2;
    }

    @Override // p153l.y4d0
    @Nullable
    /* JADX INFO: renamed from: a */
    public u3d0<byte[]> mo95615a(@NonNull u3d0<Drawable> u3d0Var, @NonNull u560 u560Var) {
        Drawable drawable = u3d0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f141338b.mo95615a(e33.m119246b(((BitmapDrawable) drawable).getBitmap(), this.f141337a), u560Var);
        }
        if (drawable instanceof bnj) {
            return this.f141339c.mo95615a(m162519b(u3d0Var), u560Var);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: b */
    private static u3d0<bnj> m162519b(@NonNull u3d0<Drawable> u3d0Var) {
        return u3d0Var;
    }
}
