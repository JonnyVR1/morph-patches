package p153l;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class d950 implements kzq {

    /* JADX INFO: renamed from: b */
    private final Object f85715b;

    public d950(@NonNull Object obj) {
        this.f85715b = vn80.m201944d(obj);
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f85715b.toString().getBytes(kzq.f129442a));
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof d950) {
            return this.f85715b.equals(((d950) obj).f85715b);
        }
        return false;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return this.f85715b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f85715b + '}';
    }
}
