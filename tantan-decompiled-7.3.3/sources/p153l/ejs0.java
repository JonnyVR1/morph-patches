package p153l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ejs0 implements rgu0 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgu0) {
            return zzc().equals(((rgu0) obj).zzc());
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
