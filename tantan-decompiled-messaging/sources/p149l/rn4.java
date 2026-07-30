package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class rn4 extends q23 {

    /* JADX INFO: renamed from: b */
    private static final byte[] f160236b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(kxq.f125153a);

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f160236b);
    }

    @Override // p149l.q23
    /* JADX INFO: renamed from: c */
    public Bitmap mo150773c(@NonNull g23 g23Var, @NonNull Bitmap bitmap, int i, int i2) {
        return q7j0.m173279b(g23Var, bitmap, i, i2);
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        return obj instanceof rn4;
    }

    @Override // p149l.kxq
    public int hashCode() {
        return -599754482;
    }
}
