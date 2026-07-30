package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
final class tbe {

    /* JADX INFO: renamed from: a */
    private static final g23 f169251a = new C20139a();

    @Nullable
    /* JADX INFO: renamed from: a */
    public static rvc0<Bitmap> m187852a(g23 g23Var, Drawable drawable, int i, int i2) {
        Bitmap bitmapM187853b;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapM187853b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM187853b = null;
        } else {
            bitmapM187853b = m187853b(g23Var, current, i, i2);
            z = true;
        }
        if (!z) {
            g23Var = f169251a;
        }
        return o23.m162285b(bitmapM187853b, g23Var);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private static Bitmap m187853b(g23 g23Var, Drawable drawable, int i, int i2) {
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
        Lock lockM173283f = q7j0.m173283f();
        lockM173283f.lock();
        Bitmap bitmapMo124143d = g23Var.mo124143d(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo124143d);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo124143d;
        } finally {
            lockM173283f.unlock();
        }
    }

    /* JADX INFO: renamed from: l.tbe$a */
    public class C20139a extends h23 {
        @Override // p149l.h23, p149l.g23
        /* JADX INFO: renamed from: c */
        public void mo124142c(Bitmap bitmap) {
        }
    }
}
