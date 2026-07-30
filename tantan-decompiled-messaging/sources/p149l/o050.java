package p149l;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class o050 implements kxq {

    /* JADX INFO: renamed from: b */
    private final Object f141288b;

    public o050(@NonNull Object obj) {
        this.f141288b = qf80.m174276d(obj);
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f141288b.toString().getBytes(kxq.f125153a));
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof o050) {
            return this.f141288b.equals(((o050) obj).f141288b);
        }
        return false;
    }

    @Override // p149l.kxq
    public int hashCode() {
        return this.f141288b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f141288b + '}';
    }
}
