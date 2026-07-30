package p153l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes3.dex */
public class qzi0<T> {

    /* JADX INFO: renamed from: a */
    public final long f160267a;

    /* JADX INFO: renamed from: b */
    public final T f160268b;

    public qzi0(long j, T t) {
        this.f160268b = t;
        this.f160267a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qzi0 qzi0Var = (qzi0) obj;
        if (this.f160267a != qzi0Var.f160267a) {
            return false;
        }
        T t = this.f160268b;
        T t2 = qzi0Var.f160268b;
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
        long j = this.f160267a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f160268b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.f160267a + ", value=" + this.f160268b + Constants.AES_SUFFIX;
    }
}
