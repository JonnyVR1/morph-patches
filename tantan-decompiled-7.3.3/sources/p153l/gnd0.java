package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class gnd0 extends g33 {

    /* JADX INFO: renamed from: c */
    private static final byte[] f105075c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(kzq.f129442a);

    /* JADX INFO: renamed from: b */
    private final int f105076b;

    public gnd0(int i) {
        vn80.m201941a(i > 0, "roundingRadius must be greater than 0.");
        this.f105076b = i;
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f105075c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f105076b).array());
    }

    @Override // p153l.g33
    /* JADX INFO: renamed from: c */
    public Bitmap mo128711c(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i, int i2) {
        return ugj0.m195917n(w23Var, bitmap, this.f105076b);
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        return (obj instanceof gnd0) && this.f105076b == ((gnd0) obj).f105076b;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return ylk0.m216591o(-569625254, ylk0.m216590n(this.f105076b));
    }
}
