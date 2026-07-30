package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class lmd extends uh2 {
    public lmd(fa5<Bitmap> fa5Var, mnb0 mnb0Var, int i, int i2) {
        super(fa5Var, mnb0Var, i, i2);
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        tsf.m190560z("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public lmd(Bitmap bitmap, twc0<Bitmap> twc0Var, mnb0 mnb0Var, int i, int i2) {
        super(bitmap, twc0Var, mnb0Var, i, i2);
    }
}
