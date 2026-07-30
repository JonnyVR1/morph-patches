package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class px2 {

    /* JADX INFO: renamed from: a */
    public final C19354a f151615a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC19359f f151616b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C19356c f151617c;

    /* JADX INFO: renamed from: d */
    public final int f151618d;

    /* JADX INFO: renamed from: l.px2$a */
    public static class C19354a implements hce0 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC19357d f151619a;

        /* JADX INFO: renamed from: b */
        public final long f151620b;

        /* JADX INFO: renamed from: c */
        public final long f151621c;

        /* JADX INFO: renamed from: d */
        public final long f151622d;

        /* JADX INFO: renamed from: e */
        public final long f151623e;

        /* JADX INFO: renamed from: f */
        public final long f151624f;

        /* JADX INFO: renamed from: g */
        public final long f151625g;

        public C19354a(InterfaceC19357d interfaceC19357d, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f151619a = interfaceC19357d;
            this.f151620b = j;
            this.f151621c = j2;
            this.f151622d = j3;
            this.f151623e = j4;
            this.f151624f = j5;
            this.f151625g = j6;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: d */
        public hce0.C17274a mo98121d(long j) {
            return new hce0.C17274a(new jce0(j, C19356c.m171804h(this.f151619a.mo171796a(j), this.f151621c, this.f151622d, this.f151623e, this.f151624f, this.f151625g)));
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: e */
        public boolean mo98122e() {
            return true;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: i */
        public long mo98123i() {
            return this.f151620b;
        }

        /* JADX INFO: renamed from: k */
        public long m171795k(long j) {
            return this.f151619a.mo171796a(j);
        }
    }

    /* JADX INFO: renamed from: l.px2$c */
    public static class C19356c {

        /* JADX INFO: renamed from: a */
        public final long f151626a;

        /* JADX INFO: renamed from: b */
        public final long f151627b;

        /* JADX INFO: renamed from: c */
        public final long f151628c;

        /* JADX INFO: renamed from: d */
        public long f151629d;

        /* JADX INFO: renamed from: e */
        public long f151630e;

        /* JADX INFO: renamed from: f */
        public long f151631f;

        /* JADX INFO: renamed from: g */
        public long f151632g;

        /* JADX INFO: renamed from: h */
        public long f151633h;

        public C19356c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f151626a = j;
            this.f151627b = j2;
            this.f151629d = j3;
            this.f151630e = j4;
            this.f151631f = j5;
            this.f151632g = j6;
            this.f151628c = j7;
            this.f151633h = m171804h(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: renamed from: h */
        public static long m171804h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return vck0.m197886r(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: renamed from: i */
        public final long m171805i() {
            return this.f151632g;
        }

        /* JADX INFO: renamed from: j */
        public final long m171806j() {
            return this.f151631f;
        }

        /* JADX INFO: renamed from: k */
        public final long m171807k() {
            return this.f151633h;
        }

        /* JADX INFO: renamed from: l */
        public final long m171808l() {
            return this.f151626a;
        }

        /* JADX INFO: renamed from: m */
        public final long m171809m() {
            return this.f151627b;
        }

        /* JADX INFO: renamed from: n */
        public final void m171810n() {
            this.f151633h = m171804h(this.f151627b, this.f151629d, this.f151630e, this.f151631f, this.f151632g, this.f151628c);
        }

        /* JADX INFO: renamed from: o */
        public final void m171811o(long j, long j2) {
            this.f151630e = j;
            this.f151632g = j2;
            m171810n();
        }

        /* JADX INFO: renamed from: p */
        public final void m171812p(long j, long j2) {
            this.f151629d = j;
            this.f151631f = j2;
            m171810n();
        }
    }

    /* JADX INFO: renamed from: l.px2$d */
    public interface InterfaceC19357d {
        /* JADX INFO: renamed from: a */
        long mo171796a(long j);
    }

    /* JADX INFO: renamed from: l.px2$e */
    public static final class C19358e {

        /* JADX INFO: renamed from: d */
        public static final C19358e f151634d = new C19358e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a */
        public final int f151635a;

        /* JADX INFO: renamed from: b */
        public final long f151636b;

        /* JADX INFO: renamed from: c */
        public final long f151637c;

        public C19358e(int i, long j, long j2) {
            this.f151635a = i;
            this.f151636b = j;
            this.f151637c = j2;
        }

        /* JADX INFO: renamed from: d */
        public static C19358e m171816d(long j, long j2) {
            return new C19358e(-1, j, j2);
        }

        /* JADX INFO: renamed from: e */
        public static C19358e m171817e(long j) {
            return new C19358e(0, -9223372036854775807L, j);
        }

        /* JADX INFO: renamed from: f */
        public static C19358e m171818f(long j, long j2) {
            return new C19358e(-2, j, j2);
        }
    }

    public px2(InterfaceC19357d interfaceC19357d, InterfaceC19359f interfaceC19359f, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f151616b = interfaceC19359f;
        this.f151618d = i;
        this.f151615a = new C19354a(interfaceC19357d, j, j2, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: a */
    public C19356c m171781a(long j) {
        return new C19356c(j, this.f151615a.m171795k(j), this.f151615a.f151621c, this.f151615a.f151622d, this.f151615a.f151623e, this.f151615a.f151624f, this.f151615a.f151625g);
    }

    /* JADX INFO: renamed from: b */
    public final hce0 m171782b() {
        return this.f151615a;
    }

    /* JADX INFO: renamed from: c */
    public int m171783c(tqf tqfVar, fd80 fd80Var) throws IOException {
        while (true) {
            C19356c c19356c = (C19356c) p11.m167015i(this.f151617c);
            long jM171806j = c19356c.m171806j();
            long jM171805i = c19356c.m171805i();
            long jM171807k = c19356c.m171807k();
            if (jM171805i - jM171806j <= this.f151618d) {
                m171785e(false, jM171806j);
                return m171787g(tqfVar, jM171806j, fd80Var);
            }
            if (!m171789i(tqfVar, jM171807k)) {
                return m171787g(tqfVar, jM171807k, fd80Var);
            }
            tqfVar.mo150657h();
            C19358e c19358eMo100975a = this.f151616b.mo100975a(tqfVar, c19356c.m171809m());
            int i = c19358eMo100975a.f151635a;
            if (i == -3) {
                m171785e(false, jM171807k);
                return m171787g(tqfVar, jM171807k, fd80Var);
            }
            if (i == -2) {
                c19356c.m171812p(c19358eMo100975a.f151636b, c19358eMo100975a.f151637c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        qkq0.m175383a("Invalid case");
                        return 0;
                    }
                    m171789i(tqfVar, c19358eMo100975a.f151637c);
                    m171785e(true, c19358eMo100975a.f151637c);
                    return m171787g(tqfVar, c19358eMo100975a.f151637c, fd80Var);
                }
                c19356c.m171811o(c19358eMo100975a.f151636b, c19358eMo100975a.f151637c);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m171784d() {
        return this.f151617c != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m171785e(boolean z, long j) {
        this.f151617c = null;
        this.f151616b.mo100976b();
        m171786f(z, j);
    }

    /* JADX INFO: renamed from: g */
    public final int m171787g(tqf tqfVar, long j, fd80 fd80Var) {
        if (j == tqfVar.getPosition()) {
            return 0;
        }
        fd80Var.f97018a = j;
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m171788h(long j) {
        C19356c c19356c = this.f151617c;
        if (c19356c == null || c19356c.m171808l() != j) {
            this.f151617c = m171781a(j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m171789i(tqf tqfVar, long j) throws IOException {
        long position = j - tqfVar.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        tqfVar.mo150661o((int) position);
        return true;
    }

    /* JADX INFO: renamed from: l.px2$f */
    public interface InterfaceC19359f {
        /* JADX INFO: renamed from: a */
        C19358e mo100975a(tqf tqfVar, long j) throws IOException;

        /* JADX INFO: renamed from: b */
        default void mo100976b() {
        }
    }

    /* JADX INFO: renamed from: l.px2$b */
    public static final class C19355b implements InterfaceC19357d {
        @Override // p149l.px2.InterfaceC19357d
        /* JADX INFO: renamed from: a */
        public long mo171796a(long j) {
            return j;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m171786f(boolean z, long j) {
    }
}
