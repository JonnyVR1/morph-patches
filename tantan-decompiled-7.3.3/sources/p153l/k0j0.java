package p153l;

/* JADX INFO: loaded from: classes3.dex */
public final class k0j0<T> {

    /* JADX INFO: renamed from: a */
    public final long f123402a;

    /* JADX INFO: renamed from: b */
    public final T f123403b;

    public k0j0(long j, T t) {
        this.f123403b = t;
        this.f123402a = j;
    }

    /* JADX INFO: renamed from: a */
    public long m147793a() {
        return this.f123402a;
    }

    /* JADX INFO: renamed from: b */
    public T m147794b() {
        return this.f123403b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k0j0)) {
            return false;
        }
        k0j0 k0j0Var = (k0j0) obj;
        if (this.f123402a != k0j0Var.f123402a) {
            return false;
        }
        T t = this.f123403b;
        T t2 = k0j0Var.f123403b;
        return t == t2 || (t != null && t.equals(t2));
    }

    public int hashCode() {
        long j = this.f123402a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f123403b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.f123402a), this.f123403b.toString());
    }
}
