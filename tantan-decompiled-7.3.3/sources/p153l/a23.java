package p153l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class a23 implements y4d0<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    private final Resources f67930a;

    public a23(@NonNull Resources resources) {
        this.f67930a = (Resources) vn80.m201944d(resources);
    }

    @Override // p153l.y4d0
    @Nullable
    /* JADX INFO: renamed from: a */
    public u3d0<BitmapDrawable> mo95615a(@NonNull u3d0<Bitmap> u3d0Var, @NonNull u560 u560Var) {
        return s9r.m185217b(this.f67930a, u3d0Var);
    }
}
