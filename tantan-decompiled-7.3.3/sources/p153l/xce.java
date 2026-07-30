package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
final class xce {

    /* JADX INFO: renamed from: a */
    private static final w23 f193307a = new C21279a();

    @Nullable
    /* JADX INFO: renamed from: a */
    public static u3d0<Bitmap> m210144a(w23 w23Var, Drawable drawable, int i, int i2) {
        Bitmap bitmapM210145b;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapM210145b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM210145b = null;
        } else {
            bitmapM210145b = m210145b(w23Var, current, i, i2);
            z = true;
        }
        if (!z) {
            w23Var = f193307a;
        }
        return e33.m119246b(bitmapM210145b, w23Var);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private static Bitmap m210145b(w23 w23Var, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                drawable.toString();
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                drawable.toString();
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock lockM195911h = ugj0.m195911h();
        lockM195911h.lock();
        Bitmap bitmapMo191127d = w23Var.mo191127d(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo191127d);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo191127d;
        } finally {
            lockM195911h.unlock();
        }
    }

    /* JADX INFO: renamed from: l.xce$a */
    public class C21279a extends x23 {
        @Override // p153l.x23, p153l.w23
        /* JADX INFO: renamed from: c */
        public void mo191126c(Bitmap bitmap) {
        }
    }
}
