package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1894k;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ske0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final mkc0 f169251a;

    /* JADX INFO: renamed from: b */
    public final long f169252b;

    /* JADX INFO: renamed from: c */
    public final long f169253c;

    /* JADX INFO: renamed from: l.ske0$a */
    public static abstract class AbstractC20083a extends ske0 {

        /* JADX INFO: renamed from: d */
        public final long f169254d;

        /* JADX INFO: renamed from: e */
        public final long f169255e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final List<C20086d> f169256f;

        /* JADX INFO: renamed from: g */
        public final long f169257g;

        /* JADX INFO: renamed from: h */
        public final long f169258h;

        /* JADX INFO: renamed from: i */
        @VisibleForTesting
        public final long f169259i;

        public AbstractC20083a(@Nullable mkc0 mkc0Var, long j, long j2, long j3, long j4, @Nullable List<C20086d> list, long j5, long j6, long j7) {
            super(mkc0Var, j, j2);
            this.f169254d = j3;
            this.f169255e = j4;
            this.f169256f = list;
            this.f169259i = j5;
            this.f169257g = j6;
            this.f169258h = j7;
        }

        /* JADX INFO: renamed from: c */
        public long m186433c(long j, long j2) {
            long jMo186437g = mo186437g(j);
            return jMo186437g != -1 ? jMo186437g : (int) (m186439i((j2 - this.f169258h) + this.f169259i, j) - m186434d(j, j2));
        }

        /* JADX INFO: renamed from: d */
        public long m186434d(long j, long j2) {
            if (mo186437g(j) == -1) {
                long j3 = this.f169257g;
                if (j3 != -9223372036854775807L) {
                    return Math.max(m186435e(), m186439i((j2 - this.f169258h) - j3, j));
                }
            }
            return m186435e();
        }

        /* JADX INFO: renamed from: e */
        public long m186435e() {
            return this.f169254d;
        }

        /* JADX INFO: renamed from: f */
        public long m186436f(long j, long j2) {
            if (this.f169256f != null) {
                return -9223372036854775807L;
            }
            long jM186434d = m186434d(j, j2) + m186433c(j, j2);
            return (m186440j(jM186434d) + m186438h(jM186434d, j)) - this.f169259i;
        }

        /* JADX INFO: renamed from: g */
        public abstract long mo186437g(long j);

        /* JADX INFO: renamed from: h */
        public final long m186438h(long j, long j2) {
            List<C20086d> list = this.f169256f;
            if (list != null) {
                return (list.get((int) (j - this.f169254d)).f169265b * 1000000) / this.f169252b;
            }
            long jMo186437g = mo186437g(j2);
            return (jMo186437g == -1 || j != (m186435e() + jMo186437g) - 1) ? (this.f169255e * 1000000) / this.f169252b : j2 - m186440j(j);
        }

        /* JADX INFO: renamed from: i */
        public long m186439i(long j, long j2) {
            long jM186435e = m186435e();
            long jMo186437g = mo186437g(j2);
            if (jMo186437g != 0) {
                if (this.f169256f != null) {
                    long j3 = (jMo186437g + jM186435e) - 1;
                    long j4 = jM186435e;
                    while (j4 <= j3) {
                        long j5 = ((j3 - j4) / 2) + j4;
                        long jM186440j = m186440j(j5);
                        if (jM186440j < j) {
                            j4 = j5 + 1;
                        } else {
                            if (jM186440j <= j) {
                                return j5;
                            }
                            j3 = j5 - 1;
                        }
                    }
                    return j4 == jM186435e ? j4 : j3;
                }
                long j6 = this.f169254d + (j / ((this.f169255e * 1000000) / this.f169252b));
                if (j6 >= jM186435e) {
                    return jMo186437g == -1 ? j6 : Math.min(j6, (jM186435e + jMo186437g) - 1);
                }
            }
            return jM186435e;
        }

        /* JADX INFO: renamed from: j */
        public final long m186440j(long j) {
            List<C20086d> list = this.f169256f;
            long j2 = this.f169254d;
            return bmk0.m105110W0(list != null ? list.get((int) (j - j2)).f169264a - this.f169253c : (j - j2) * this.f169255e, 1000000L, this.f169252b);
        }

        /* JADX INFO: renamed from: k */
        public abstract mkc0 mo186441k(t1d0 t1d0Var, long j);

        /* JADX INFO: renamed from: l */
        public boolean mo186442l() {
            return this.f169256f != null;
        }
    }

    /* JADX INFO: renamed from: l.ske0$b */
    public static final class C20084b extends AbstractC20083a {

        /* JADX INFO: renamed from: j */
        @Nullable
        public final List<mkc0> f169260j;

        public C20084b(mkc0 mkc0Var, long j, long j2, long j3, long j4, @Nullable List<C20086d> list, long j5, @Nullable List<mkc0> list2, long j6, long j7) {
            super(mkc0Var, j, j2, j3, j4, list, j5, j6, j7);
            this.f169260j = list2;
        }

        @Override // p153l.ske0.AbstractC20083a
        /* JADX INFO: renamed from: g */
        public long mo186437g(long j) {
            return this.f169260j.size();
        }

        @Override // p153l.ske0.AbstractC20083a
        /* JADX INFO: renamed from: k */
        public mkc0 mo186441k(t1d0 t1d0Var, long j) {
            return this.f169260j.get((int) (j - this.f169254d));
        }

        @Override // p153l.ske0.AbstractC20083a
        /* JADX INFO: renamed from: l */
        public boolean mo186442l() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ske0$c */
    public static final class C20085c extends AbstractC20083a {

        /* JADX INFO: renamed from: j */
        @Nullable
        public final y5k0 f169261j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public final y5k0 f169262k;

        /* JADX INFO: renamed from: l */
        public final long f169263l;

        public C20085c(mkc0 mkc0Var, long j, long j2, long j3, long j4, long j5, @Nullable List<C20086d> list, long j6, @Nullable y5k0 y5k0Var, @Nullable y5k0 y5k0Var2, long j7, long j8) {
            super(mkc0Var, j, j2, j3, j5, list, j6, j7, j8);
            this.f169261j = y5k0Var;
            this.f169262k = y5k0Var2;
            this.f169263l = j4;
        }

        @Override // p153l.ske0
        @Nullable
        /* JADX INFO: renamed from: a */
        public mkc0 mo186431a(t1d0 t1d0Var) {
            y5k0 y5k0Var = this.f169261j;
            if (y5k0Var == null) {
                return super.mo186431a(t1d0Var);
            }
            C1894k c1894k = t1d0Var.f171645b;
            return new mkc0(y5k0Var.m214306a(c1894k.f7774a, 0L, c1894k.f7781h, 0L), 0L, -1L);
        }

        @Override // p153l.ske0.AbstractC20083a
        /* JADX INFO: renamed from: g */
        public long mo186437g(long j) {
            List<C20086d> list = this.f169256f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.f169263l;
            if (j2 != -1) {
                return (j2 - this.f169254d) + 1;
            }
            if (j != -9223372036854775807L) {
                return rx2.m183527a(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f169252b)), BigInteger.valueOf(this.f169255e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p153l.ske0.AbstractC20083a
        /* JADX INFO: renamed from: k */
        public mkc0 mo186441k(t1d0 t1d0Var, long j) {
            List<C20086d> list = this.f169256f;
            long j2 = this.f169254d;
            long j3 = list != null ? list.get((int) (j - j2)).f169264a : (j - j2) * this.f169255e;
            y5k0 y5k0Var = this.f169262k;
            C1894k c1894k = t1d0Var.f171645b;
            return new mkc0(y5k0Var.m214306a(c1894k.f7774a, j, c1894k.f7781h, j3), 0L, -1L);
        }
    }

    /* JADX INFO: renamed from: l.ske0$d */
    public static final class C20086d {

        /* JADX INFO: renamed from: a */
        public final long f169264a;

        /* JADX INFO: renamed from: b */
        public final long f169265b;

        public C20086d(long j, long j2) {
            this.f169264a = j;
            this.f169265b = j2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C20086d.class == obj.getClass()) {
                C20086d c20086d = (C20086d) obj;
                if (this.f169264a == c20086d.f169264a && this.f169265b == c20086d.f169265b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f169264a) * 31) + ((int) this.f169265b);
        }
    }

    public ske0(@Nullable mkc0 mkc0Var, long j, long j2) {
        this.f169251a = mkc0Var;
        this.f169252b = j;
        this.f169253c = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public mkc0 mo186431a(t1d0 t1d0Var) {
        return this.f169251a;
    }

    /* JADX INFO: renamed from: b */
    public long m186432b() {
        return bmk0.m105110W0(this.f169253c, 1000000L, this.f169252b);
    }

    /* JADX INFO: renamed from: l.ske0$e */
    public static class C20087e extends ske0 {

        /* JADX INFO: renamed from: d */
        public final long f169266d;

        /* JADX INFO: renamed from: e */
        public final long f169267e;

        public C20087e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public mkc0 m186443c() {
            long j = this.f169267e;
            if (j <= 0) {
                return null;
            }
            return new mkc0(null, this.f169266d, j);
        }

        public C20087e(@Nullable mkc0 mkc0Var, long j, long j2, long j3, long j4) {
            super(mkc0Var, j, j2);
            this.f169266d = j3;
            this.f169267e = j4;
        }
    }
}
