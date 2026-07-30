package p149l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y9s0 implements l7u0 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l7u0) {
            return zzc().equals(((l7u0) obj).zzc());
        }
        return false;
    }

    public final int hashCode() {
        return zzc().hashCode();
    }

    public final String toString() {
        return zzc().toString();
    }
}
