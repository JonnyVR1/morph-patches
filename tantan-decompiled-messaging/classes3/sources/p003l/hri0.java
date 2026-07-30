package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class hri0<T> {

    /* JADX INFO: renamed from: a */
    public final long f4264a;

    /* JADX INFO: renamed from: b */
    public final T f4265b;

    public hri0(long j, T t) {
        this.f4265b = t;
        this.f4264a = j;
    }

    /* JADX INFO: renamed from: a */
    public long m4995a() {
        return this.f4264a;
    }

    /* JADX INFO: renamed from: b */
    public T m4996b() {
        return this.f4265b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hri0)) {
            return false;
        }
        hri0 hri0Var = (hri0) obj;
        if (this.f4264a != hri0Var.f4264a) {
            return false;
        }
        T t = this.f4265b;
        T t2 = hri0Var.f4265b;
        return t == t2 || (t != null && t.equals(t2));
    }

    public int hashCode() {
        long j = this.f4264a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f4265b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.f4264a), this.f4265b.toString());
    }
}
