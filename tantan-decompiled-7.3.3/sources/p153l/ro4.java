package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class ro4 extends g33 {

    /* JADX INFO: renamed from: b */
    private static final byte[] f164152b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(kzq.f129442a);

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f164152b);
    }

    @Override // p153l.g33
    /* JADX INFO: renamed from: c */
    public Bitmap mo128711c(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i, int i2) {
        return ugj0.m195906c(w23Var, bitmap, i, i2);
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        return obj instanceof ro4;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return -670243078;
    }
}
