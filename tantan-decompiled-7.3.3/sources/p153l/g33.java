package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C1057a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g33 implements tgj0<Bitmap> {
    @Override // p153l.tgj0
    @NonNull
    /* JADX INFO: renamed from: b */
    public final u3d0<Bitmap> mo100877b(@NonNull Context context, @NonNull u3d0<Bitmap> u3d0Var, int i, int i2) {
        if (!ylk0.m216597u(i, i2)) {
            vsd0.m202605a("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL");
            return null;
        }
        w23 w23VarM5330f = ComponentCallbacks2C1057a.m5319c(context).m5330f();
        Bitmap bitmap = u3d0Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo128711c = mo128711c(w23VarM5330f, bitmap, i, i2);
        return bitmap.equals(bitmapMo128711c) ? u3d0Var : e33.m119246b(bitmapMo128711c, w23VarM5330f);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo128711c(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i, int i2);
}
