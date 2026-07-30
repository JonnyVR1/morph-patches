package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class sn4 extends q23 {

    /* JADX INFO: renamed from: b */
    private static final byte[] f165409b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(kxq.f125153a);

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f165409b);
    }

    @Override // p149l.q23
    /* JADX INFO: renamed from: c */
    public Bitmap mo150773c(@NonNull g23 g23Var, @NonNull Bitmap bitmap, int i, int i2) {
        return q7j0.m173280c(g23Var, bitmap, i, i2);
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        return obj instanceof sn4;
    }

    @Override // p149l.kxq
    public int hashCode() {
        return -670243078;
    }
}
