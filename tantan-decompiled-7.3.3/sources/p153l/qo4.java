package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class qo4 extends g33 {

    /* JADX INFO: renamed from: b */
    private static final byte[] f158695b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(kzq.f129442a);

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f158695b);
    }

    @Override // p153l.g33
    /* JADX INFO: renamed from: c */
    public Bitmap mo128711c(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i, int i2) {
        return ugj0.m195905b(w23Var, bitmap, i, i2);
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        return obj instanceof qo4;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return -599754482;
    }
}
