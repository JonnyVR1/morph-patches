package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r480 {
    /* JADX INFO: renamed from: a */
    public fa5<Bitmap> m177780a(int i, int i2) {
        return m177781b(i, i2, Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: renamed from: b */
    public fa5<Bitmap> m177781b(int i, int i2, Bitmap.Config config) {
        return m177782c(i, i2, config, null);
    }

    /* JADX INFO: renamed from: c */
    public fa5<Bitmap> m177782c(int i, int i2, Bitmap.Config config, Object obj) {
        return mo152410d(i, i2, config);
    }

    /* JADX INFO: renamed from: d */
    public abstract fa5<Bitmap> mo152410d(int i, int i2, Bitmap.Config config);
}
