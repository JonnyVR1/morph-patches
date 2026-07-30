package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface hce0 {
    /* JADX INFO: renamed from: d */
    C17274a mo98121d(long j);

    /* JADX INFO: renamed from: e */
    boolean mo98122e();

    /* JADX INFO: renamed from: i */
    long mo98123i();

    /* JADX INFO: renamed from: l.hce0$a */
    public static final class C17274a {

        /* JADX INFO: renamed from: a */
        public final jce0 f107040a;

        /* JADX INFO: renamed from: b */
        public final jce0 f107041b;

        public C17274a(jce0 jce0Var, jce0 jce0Var2) {
            this.f107040a = (jce0) p11.m167011e(jce0Var);
            this.f107041b = (jce0) p11.m167011e(jce0Var2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C17274a.class == obj.getClass()) {
                C17274a c17274a = (C17274a) obj;
                if (this.f107040a.equals(c17274a.f107040a) && this.f107041b.equals(c17274a.f107041b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f107040a.hashCode() * 31) + this.f107041b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f107040a);
            if (this.f107040a.equals(this.f107041b)) {
                str = "";
            } else {
                str = ", " + this.f107041b;
            }
            sb.append(str);
            sb.append(Constants.AES_SUFFIX);
            return sb.toString();
        }

        public C17274a(jce0 jce0Var) {
            this(jce0Var, jce0Var);
        }
    }

    /* JADX INFO: renamed from: l.hce0$b */
    public static class C17275b implements hce0 {

        /* JADX INFO: renamed from: a */
        public final long f107042a;

        /* JADX INFO: renamed from: b */
        public final C17274a f107043b;

        public C17275b(long j, long j2) {
            this.f107042a = j;
            this.f107043b = new C17274a(j2 == 0 ? jce0.f117294c : new jce0(0L, j2));
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: d */
        public C17274a mo98121d(long j) {
            return this.f107043b;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: e */
        public boolean mo98122e() {
            return false;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: i */
        public long mo98123i() {
            return this.f107042a;
        }

        public C17275b(long j) {
            this(j, 0L);
        }
    }
}
