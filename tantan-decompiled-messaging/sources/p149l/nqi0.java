package p149l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes3.dex */
public class nqi0<T> {

    /* JADX INFO: renamed from: a */
    public final long f140071a;

    /* JADX INFO: renamed from: b */
    public final T f140072b;

    public nqi0(long j, T t) {
        this.f140072b = t;
        this.f140071a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nqi0 nqi0Var = (nqi0) obj;
        if (this.f140071a != nqi0Var.f140071a) {
            return false;
        }
        T t = this.f140072b;
        T t2 = nqi0Var.f140072b;
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
        long j = this.f140071a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f140072b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.f140071a + ", value=" + this.f140072b + Constants.AES_SUFFIX;
    }
}
