package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1871k;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class nce0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final fcc0 f138149a;

    /* JADX INFO: renamed from: b */
    public final long f138150b;

    /* JADX INFO: renamed from: c */
    public final long f138151c;

    /* JADX INFO: renamed from: l.nce0$a */
    public static abstract class AbstractC18672a extends nce0 {

        /* JADX INFO: renamed from: d */
        public final long f138152d;

        /* JADX INFO: renamed from: e */
        public final long f138153e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final List<C18675d> f138154f;

        /* JADX INFO: renamed from: g */
        public final long f138155g;

        /* JADX INFO: renamed from: h */
        public final long f138156h;

        /* JADX INFO: renamed from: i */
        @VisibleForTesting
        public final long f138157i;

        public AbstractC18672a(@Nullable fcc0 fcc0Var, long j, long j2, long j3, long j4, @Nullable List<C18675d> list, long j5, long j6, long j7) {
            super(fcc0Var, j, j2);
            this.f138152d = j3;
            this.f138153e = j4;
            this.f138154f = list;
            this.f138157i = j5;
            this.f138155g = j6;
            this.f138156h = j7;
        }

        /* JADX INFO: renamed from: c */
        public long m158932c(long j, long j2) {
            long jMo158936g = mo158936g(j);
            return jMo158936g != -1 ? jMo158936g : (int) (m158938i((j2 - this.f138156h) + this.f138157i, j) - m158933d(j, j2));
        }

        /* JADX INFO: renamed from: d */
        public long m158933d(long j, long j2) {
            if (mo158936g(j) == -1) {
                long j3 = this.f138155g;
                if (j3 != -9223372036854775807L) {
                    return Math.max(m158934e(), m158938i((j2 - this.f138156h) - j3, j));
                }
            }
            return m158934e();
        }

        /* JADX INFO: renamed from: e */
        public long m158934e() {
            return this.f138152d;
        }

        /* JADX INFO: renamed from: f */
        public long m158935f(long j, long j2) {
            if (this.f138154f != null) {
                return -9223372036854775807L;
            }
            long jM158933d = m158933d(j, j2) + m158932c(j, j2);
            return (m158939j(jM158933d) + m158937h(jM158933d, j)) - this.f138157i;
        }

        /* JADX INFO: renamed from: g */
        public abstract long mo158936g(long j);

        /* JADX INFO: renamed from: h */
        public final long m158937h(long j, long j2) {
            List<C18675d> list = this.f138154f;
            if (list != null) {
                return (list.get((int) (j - this.f138152d)).f138163b * 1000000) / this.f138150b;
            }
            long jMo158936g = mo158936g(j2);
            return (jMo158936g == -1 || j != (m158934e() + jMo158936g) - 1) ? (this.f138153e * 1000000) / this.f138150b : j2 - m158939j(j);
        }

        /* JADX INFO: renamed from: i */
        public long m158938i(long j, long j2) {
            long jM158934e = m158934e();
            long jMo158936g = mo158936g(j2);
            if (jMo158936g != 0) {
                if (this.f138154f != null) {
                    long j3 = (jMo158936g + jM158934e) - 1;
                    long j4 = jM158934e;
                    while (j4 <= j3) {
                        long j5 = ((j3 - j4) / 2) + j4;
                        long jM158939j = m158939j(j5);
                        if (jM158939j < j) {
                            j4 = j5 + 1;
                        } else {
                            if (jM158939j <= j) {
                                return j5;
                            }
                            j3 = j5 - 1;
                        }
                    }
                    return j4 == jM158934e ? j4 : j3;
                }
                long j6 = this.f138152d + (j / ((this.f138153e * 1000000) / this.f138150b));
                if (j6 >= jM158934e) {
                    return jMo158936g == -1 ? j6 : Math.min(j6, (jM158934e + jMo158936g) - 1);
                }
            }
            return jM158934e;
        }

        /* JADX INFO: renamed from: j */
        public final long m158939j(long j) {
            List<C18675d> list = this.f138154f;
            long j2 = this.f138152d;
            return vck0.m197832W0(list != null ? list.get((int) (j - j2)).f138162a - this.f138151c : (j - j2) * this.f138153e, 1000000L, this.f138150b);
        }

        /* JADX INFO: renamed from: k */
        public abstract fcc0 mo158940k(otc0 otc0Var, long j);

        /* JADX INFO: renamed from: l */
        public boolean mo158941l() {
            return this.f138154f != null;
        }
    }

    /* JADX INFO: renamed from: l.nce0$b */
    public static final class C18673b extends AbstractC18672a {

        /* JADX INFO: renamed from: j */
        @Nullable
        public final List<fcc0> f138158j;

        public C18673b(fcc0 fcc0Var, long j, long j2, long j3, long j4, @Nullable List<C18675d> list, long j5, @Nullable List<fcc0> list2, long j6, long j7) {
            super(fcc0Var, j, j2, j3, j4, list, j5, j6, j7);
            this.f138158j = list2;
        }

        @Override // p149l.nce0.AbstractC18672a
        /* JADX INFO: renamed from: g */
        public long mo158936g(long j) {
            return this.f138158j.size();
        }

        @Override // p149l.nce0.AbstractC18672a
        /* JADX INFO: renamed from: k */
        public fcc0 mo158940k(otc0 otc0Var, long j) {
            return this.f138158j.get((int) (j - this.f138152d));
        }

        @Override // p149l.nce0.AbstractC18672a
        /* JADX INFO: renamed from: l */
        public boolean mo158941l() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.nce0$c */
    public static final class C18674c extends AbstractC18672a {

        /* JADX INFO: renamed from: j */
        @Nullable
        public final uwj0 f138159j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public final uwj0 f138160k;

        /* JADX INFO: renamed from: l */
        public final long f138161l;

        public C18674c(fcc0 fcc0Var, long j, long j2, long j3, long j4, long j5, @Nullable List<C18675d> list, long j6, @Nullable uwj0 uwj0Var, @Nullable uwj0 uwj0Var2, long j7, long j8) {
            super(fcc0Var, j, j2, j3, j5, list, j6, j7, j8);
            this.f138159j = uwj0Var;
            this.f138160k = uwj0Var2;
            this.f138161l = j4;
        }

        @Override // p149l.nce0
        @Nullable
        /* JADX INFO: renamed from: a */
        public fcc0 mo158930a(otc0 otc0Var) {
            uwj0 uwj0Var = this.f138159j;
            if (uwj0Var == null) {
                return super.mo158930a(otc0Var);
            }
            C1871k c1871k = otc0Var.f145562b;
            return new fcc0(uwj0Var.m196132a(c1871k.f7737a, 0L, c1871k.f7744h, 0L), 0L, -1L);
        }

        @Override // p149l.nce0.AbstractC18672a
        /* JADX INFO: renamed from: g */
        public long mo158936g(long j) {
            List<C18675d> list = this.f138154f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.f138161l;
            if (j2 != -1) {
                return (j2 - this.f138152d) + 1;
            }
            if (j != -9223372036854775807L) {
                return cx2.m109079a(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f138150b)), BigInteger.valueOf(this.f138153e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p149l.nce0.AbstractC18672a
        /* JADX INFO: renamed from: k */
        public fcc0 mo158940k(otc0 otc0Var, long j) {
            List<C18675d> list = this.f138154f;
            long j2 = this.f138152d;
            long j3 = list != null ? list.get((int) (j - j2)).f138162a : (j - j2) * this.f138153e;
            uwj0 uwj0Var = this.f138160k;
            C1871k c1871k = otc0Var.f145562b;
            return new fcc0(uwj0Var.m196132a(c1871k.f7737a, j, c1871k.f7744h, j3), 0L, -1L);
        }
    }

    /* JADX INFO: renamed from: l.nce0$d */
    public static final class C18675d {

        /* JADX INFO: renamed from: a */
        public final long f138162a;

        /* JADX INFO: renamed from: b */
        public final long f138163b;

        public C18675d(long j, long j2) {
            this.f138162a = j;
            this.f138163b = j2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C18675d.class == obj.getClass()) {
                C18675d c18675d = (C18675d) obj;
                if (this.f138162a == c18675d.f138162a && this.f138163b == c18675d.f138163b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f138162a) * 31) + ((int) this.f138163b);
        }
    }

    public nce0(@Nullable fcc0 fcc0Var, long j, long j2) {
        this.f138149a = fcc0Var;
        this.f138150b = j;
        this.f138151c = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public fcc0 mo158930a(otc0 otc0Var) {
        return this.f138149a;
    }

    /* JADX INFO: renamed from: b */
    public long m158931b() {
        return vck0.m197832W0(this.f138151c, 1000000L, this.f138150b);
    }

    /* JADX INFO: renamed from: l.nce0$e */
    public static class C18676e extends nce0 {

        /* JADX INFO: renamed from: d */
        public final long f138164d;

        /* JADX INFO: renamed from: e */
        public final long f138165e;

        public C18676e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public fcc0 m158942c() {
            long j = this.f138165e;
            if (j <= 0) {
                return null;
            }
            return new fcc0(null, this.f138164d, j);
        }

        public C18676e(@Nullable fcc0 fcc0Var, long j, long j2, long j3, long j4) {
            super(fcc0Var, j, j2);
            this.f138164d = j3;
            this.f138165e = j4;
        }
    }
}
