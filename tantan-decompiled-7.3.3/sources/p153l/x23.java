package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class x23 implements w23 {
    @Override // p153l.w23
    /* JADX INFO: renamed from: c */
    public void mo191126c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p153l.w23
    @NonNull
    /* JADX INFO: renamed from: d */
    public Bitmap mo191127d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p153l.w23
    @NonNull
    /* JADX INFO: renamed from: e */
    public Bitmap mo191128e(int i, int i2, Bitmap.Config config) {
        return mo191127d(i, i2, config);
    }

    @Override // p153l.w23
    /* JADX INFO: renamed from: b */
    public void mo191125b() {
    }

    @Override // p153l.w23
    /* JADX INFO: renamed from: a */
    public void mo191124a(int i) {
    }
}
