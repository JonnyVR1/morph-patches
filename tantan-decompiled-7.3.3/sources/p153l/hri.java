package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class hri extends g33 {

    /* JADX INFO: renamed from: b */
    private static final byte[] f111344b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(kzq.f129442a);

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f111344b);
    }

    @Override // p153l.g33
    /* JADX INFO: renamed from: c */
    public Bitmap mo128711c(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i, int i2) {
        return ugj0.m195908e(w23Var, bitmap, i, i2);
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        return obj instanceof hri;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return 1572326941;
    }
}
