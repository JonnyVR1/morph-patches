package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class nqi0<T> {

    /* JADX INFO: renamed from: a */
    public final long f5951a;

    /* JADX INFO: renamed from: b */
    public final T f5952b;

    public nqi0(long j, T t) {
        this.f5952b = t;
        this.f5951a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nqi0 nqi0Var = (nqi0) obj;
        if (this.f5951a != nqi0Var.f5951a) {
            return false;
        }
        T t = this.f5952b;
        T t2 = nqi0Var.f5952b;
        if (t == null) {
            if (t2 != null) {
                return false;
            }
        } else if (!t.equals(t2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f5951a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f5952b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.f5951a + ", value=" + this.f5952b + "]";
    }
}
