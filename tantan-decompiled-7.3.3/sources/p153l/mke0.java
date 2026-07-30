package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface mke0 {
    /* JADX INFO: renamed from: d */
    C18640a mo107791d(long j);

    /* JADX INFO: renamed from: e */
    boolean mo107792e();

    /* JADX INFO: renamed from: i */
    long mo107793i();

    /* JADX INFO: renamed from: l.mke0$a */
    public static final class C18640a {

        /* JADX INFO: renamed from: a */
        public final oke0 f137283a;

        /* JADX INFO: renamed from: b */
        public final oke0 f137284b;

        public C18640a(oke0 oke0Var, oke0 oke0Var2) {
            this.f137283a = (oke0) w11.m204369e(oke0Var);
            this.f137284b = (oke0) w11.m204369e(oke0Var2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C18640a.class == obj.getClass()) {
                C18640a c18640a = (C18640a) obj;
                if (this.f137283a.equals(c18640a.f137283a) && this.f137284b.equals(c18640a.f137284b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f137283a.hashCode() * 31) + this.f137284b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f137283a);
            if (this.f137283a.equals(this.f137284b)) {
                str = "";
            } else {
                str = ", " + this.f137284b;
            }
            sb.append(str);
            sb.append(Constants.AES_SUFFIX);
            return sb.toString();
        }

        public C18640a(oke0 oke0Var) {
            this(oke0Var, oke0Var);
        }
    }

    /* JADX INFO: renamed from: l.mke0$b */
    public static class C18641b implements mke0 {

        /* JADX INFO: renamed from: a */
        public final long f137285a;

        /* JADX INFO: renamed from: b */
        public final C18640a f137286b;

        public C18641b(long j, long j2) {
            this.f137285a = j;
            this.f137286b = new C18640a(j2 == 0 ? oke0.f147750c : new oke0(0L, j2));
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: d */
        public C18640a mo107791d(long j) {
            return this.f137286b;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: e */
        public boolean mo107792e() {
            return false;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: i */
        public long mo107793i() {
            return this.f137285a;
        }

        public C18641b(long j) {
            this(j, 0L);
        }
    }
}
