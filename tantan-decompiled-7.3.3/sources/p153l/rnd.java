package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class rnd extends bi2 {
    public rnd(fb5<Bitmap> fb5Var, qvb0 qvb0Var, int i, int i2) {
        super(fb5Var, qvb0Var, i, i2);
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        huf.m137198z("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public rnd(Bitmap bitmap, w4d0<Bitmap> w4d0Var, qvb0 qvb0Var, int i, int i2) {
        super(bitmap, w4d0Var, qvb0Var, i, i2);
    }
}
