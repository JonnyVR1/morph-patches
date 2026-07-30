package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class xc80 {
    /* JADX INFO: renamed from: a */
    public fb5<Bitmap> m210132a(int i, int i2) {
        return m210133b(i, i2, Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: renamed from: b */
    public fb5<Bitmap> m210133b(int i, int i2, Bitmap.Config config) {
        return m210134c(i, i2, config, null);
    }

    /* JADX INFO: renamed from: c */
    public fb5<Bitmap> m210134c(int i, int i2, Bitmap.Config config, Object obj) {
        return mo188699d(i, i2, config);
    }

    /* JADX INFO: renamed from: d */
    public abstract fb5<Bitmap> mo188699d(int i, int i2, Bitmap.Config config);
}
