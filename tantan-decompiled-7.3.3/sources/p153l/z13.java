package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class z13 implements c4d0<BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    private final w23 f202478a;

    /* JADX INFO: renamed from: b */
    private final c4d0<Bitmap> f202479b;

    public z13(w23 w23Var, c4d0<Bitmap> c4d0Var) {
        this.f202478a = w23Var;
        this.f202479b = c4d0Var;
    }

    @Override // p153l.c4d0
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo101610b(@NonNull u560 u560Var) {
        return this.f202479b.mo101610b(u560Var);
    }

    @Override // p153l.v0f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo99642a(@NonNull u3d0<BitmapDrawable> u3d0Var, @NonNull File file, @NonNull u560 u560Var) {
        return this.f202479b.mo99642a((Bitmap) new e33(u3d0Var.get().getBitmap(), this.f202478a), file, u560Var);
    }
}
