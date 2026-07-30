package p149l;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class zsw0 extends apw0 {

    /* JADX INFO: renamed from: a */
    public final String f204650a;

    public zsw0(String str) {
        this.f204650a = str;
    }

    /* JADX INFO: renamed from: b */
    public static zsw0 m220081b(String str) throws GeneralSecurityException {
        return new zsw0(str);
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final String m220082c() {
        return this.f204650a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zsw0) {
            return ((zsw0) obj).f204650a.equals(this.f204650a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zsw0.class, this.f204650a);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f204650a + ")";
    }
}
