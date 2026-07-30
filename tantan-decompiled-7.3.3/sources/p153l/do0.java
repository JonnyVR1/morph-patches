package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class do0 implements kzq {

    /* JADX INFO: renamed from: b */
    private final int f89852b;

    /* JADX INFO: renamed from: c */
    private final kzq f89853c;

    private do0(int i, kzq kzqVar) {
        this.f89852b = i;
        this.f89853c = kzqVar;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static kzq m117088c(@NonNull Context context) {
        return new do0(context.getResources().getConfiguration().uiMode & 48, az0.m100975c(context));
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        this.f89853c.mo5434a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f89852b).array());
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof do0) {
            do0 do0Var = (do0) obj;
            if (this.f89852b == do0Var.f89852b && this.f89853c.equals(do0Var.f89853c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return ylk0.m216592p(this.f89853c, this.f89852b);
    }
}
