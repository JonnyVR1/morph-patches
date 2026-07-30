package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class h23 implements g23 {
    @Override // p149l.g23
    /* JADX INFO: renamed from: c */
    public void mo124142c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p149l.g23
    @NonNull
    /* JADX INFO: renamed from: d */
    public Bitmap mo124143d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p149l.g23
    @NonNull
    /* JADX INFO: renamed from: e */
    public Bitmap mo124144e(int i, int i2, Bitmap.Config config) {
        return mo124143d(i, i2, config);
    }

    @Override // p149l.g23
    /* JADX INFO: renamed from: b */
    public void mo124141b() {
    }

    @Override // p149l.g23
    /* JADX INFO: renamed from: a */
    public void mo124140a(int i) {
    }
}
