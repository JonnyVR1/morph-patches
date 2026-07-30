package p153l;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class f2x0 extends gyw0 {

    /* JADX INFO: renamed from: a */
    public final String f96934a;

    public f2x0(String str) {
        this.f96934a = str;
    }

    /* JADX INFO: renamed from: b */
    public static f2x0 m123685b(String str) throws GeneralSecurityException {
        return new f2x0(str);
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final String m123686c() {
        return this.f96934a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f2x0) {
            return ((f2x0) obj).f96934a.equals(this.f96934a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(f2x0.class, this.f96934a);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f96934a + ")";
    }
}
