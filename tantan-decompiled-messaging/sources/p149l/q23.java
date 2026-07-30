package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C1053a;

/* JADX INFO: loaded from: classes.dex */
public abstract class q23 implements p7j0<Bitmap> {
    @Override // p149l.p7j0
    @NonNull
    /* JADX INFO: renamed from: b */
    public final rvc0<Bitmap> mo167760b(@NonNull Context context, @NonNull rvc0<Bitmap> rvc0Var, int i, int i2) {
        if (!sck0.m183419s(i, i2)) {
            skd0.m184586a("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL");
            return null;
        }
        g23 g23VarM5321f = ComponentCallbacks2C1053a.m5309c(context).m5321f();
        Bitmap bitmap = rvc0Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo150773c = mo150773c(g23VarM5321f, bitmap, i, i2);
        return bitmap.equals(bitmapMo150773c) ? rvc0Var : o23.m162285b(bitmapMo150773c, g23VarM5321f);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo150773c(@NonNull g23 g23Var, @NonNull Bitmap bitmap, int i, int i2);
}
