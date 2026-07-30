package p149l;

/* JADX INFO: loaded from: classes3.dex */
public final class hri0<T> {

    /* JADX INFO: renamed from: a */
    public final long f109225a;

    /* JADX INFO: renamed from: b */
    public final T f109226b;

    public hri0(long j, T t) {
        this.f109226b = t;
        this.f109225a = j;
    }

    /* JADX INFO: renamed from: a */
    public long m132687a() {
        return this.f109225a;
    }

    /* JADX INFO: renamed from: b */
    public T m132688b() {
        return this.f109226b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hri0)) {
            return false;
        }
        hri0 hri0Var = (hri0) obj;
        if (this.f109225a != hri0Var.f109225a) {
            return false;
        }
        T t = this.f109226b;
        T t2 = hri0Var.f109226b;
        return t == t2 || (t != null && t.equals(t2));
    }

    public int hashCode() {
        long j = this.f109225a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f109226b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.f109225a), this.f109226b.toString());
    }
}
