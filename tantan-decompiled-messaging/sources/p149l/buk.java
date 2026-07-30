package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class buk implements dse {

    /* JADX INFO: renamed from: a */
    public final qce0 f77329a;

    /* JADX INFO: renamed from: b */
    public String f77330b;

    /* JADX INFO: renamed from: c */
    public m6j0 f77331c;

    /* JADX INFO: renamed from: d */
    public C15977a f77332d;

    /* JADX INFO: renamed from: e */
    public boolean f77333e;

    /* JADX INFO: renamed from: l */
    public long f77340l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f77334f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final a320 f77335g = new a320(32, 128);

    /* JADX INFO: renamed from: h */
    public final a320 f77336h = new a320(33, 128);

    /* JADX INFO: renamed from: i */
    public final a320 f77337i = new a320(34, 128);

    /* JADX INFO: renamed from: j */
    public final a320 f77338j = new a320(39, 128);

    /* JADX INFO: renamed from: k */
    public final a320 f77339k = new a320(40, 128);

    /* JADX INFO: renamed from: m */
    public long f77341m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final d860 f77342n = new d860();

    /* JADX INFO: renamed from: l.buk$a */
    public static final class C15977a {

        /* JADX INFO: renamed from: a */
        public final m6j0 f77343a;

        /* JADX INFO: renamed from: b */
        public long f77344b;

        /* JADX INFO: renamed from: c */
        public boolean f77345c;

        /* JADX INFO: renamed from: d */
        public int f77346d;

        /* JADX INFO: renamed from: e */
        public long f77347e;

        /* JADX INFO: renamed from: f */
        public boolean f77348f;

        /* JADX INFO: renamed from: g */
        public boolean f77349g;

        /* JADX INFO: renamed from: h */
        public boolean f77350h;

        /* JADX INFO: renamed from: i */
        public boolean f77351i;

        /* JADX INFO: renamed from: j */
        public boolean f77352j;

        /* JADX INFO: renamed from: k */
        public long f77353k;

        /* JADX INFO: renamed from: l */
        public long f77354l;

        /* JADX INFO: renamed from: m */
        public boolean f77355m;

        public C15977a(m6j0 m6j0Var) {
            this.f77343a = m6j0Var;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m103926b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m103927c(int i) {
            return i < 32 || i == 40;
        }

        /* JADX INFO: renamed from: a */
        public void m103928a(long j, int i, boolean z) {
            if (this.f77352j && this.f77349g) {
                this.f77355m = this.f77345c;
                this.f77352j = false;
            } else if (this.f77350h || this.f77349g) {
                if (z && this.f77351i) {
                    m103929d(i + ((int) (j - this.f77344b)));
                }
                this.f77353k = this.f77344b;
                this.f77354l = this.f77347e;
                this.f77355m = this.f77345c;
                this.f77351i = true;
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: d */
        public final void m103929d(int i) {
            long j = this.f77354l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f77355m;
            this.f77343a.mo11109a(j, z ? 1 : 0, (int) (this.f77344b - this.f77353k), i, null);
        }

        /* JADX INFO: renamed from: e */
        public void m103930e(byte[] bArr, int i, int i2) {
            if (this.f77348f) {
                int i3 = this.f77346d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.f77346d = i3 + (i2 - i);
                } else {
                    this.f77349g = (bArr[i4] & 128) != 0;
                    this.f77348f = false;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m103931f() {
            this.f77348f = false;
            this.f77349g = false;
            this.f77350h = false;
            this.f77351i = false;
            this.f77352j = false;
        }

        /* JADX INFO: renamed from: g */
        public void m103932g(long j, int i, int i2, long j2, boolean z) {
            this.f77349g = false;
            this.f77350h = false;
            this.f77347e = j2;
            this.f77346d = 0;
            this.f77344b = j;
            if (!m103927c(i2)) {
                if (this.f77351i && !this.f77352j) {
                    if (z) {
                        m103929d(i);
                    }
                    this.f77351i = false;
                }
                if (m103926b(i2)) {
                    this.f77350h = !this.f77352j;
                    this.f77352j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f77345c = z2;
            this.f77348f = z2 || i2 <= 9;
        }
    }

    public buk(qce0 qce0Var) {
        this.f77329a = qce0Var;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: f */
    private void m103921f() {
        p11.m167015i(this.f77331c);
        vck0.m197866j(this.f77332d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: g */
    private void m103922g(long j, int i, int i2, long j2) {
        this.f77332d.m103928a(j, i, this.f77333e);
        if (!this.f77333e) {
            this.f77335g.m94638b(i2);
            this.f77336h.m94638b(i2);
            this.f77337i.m94638b(i2);
            if (this.f77335g.m94639c() && this.f77336h.m94639c() && this.f77337i.m94639c()) {
                this.f77331c.mo11110b(m103924i(this.f77330b, this.f77335g, this.f77336h, this.f77337i));
                this.f77333e = true;
            }
        }
        if (this.f77338j.m94638b(i2)) {
            a320 a320Var = this.f77338j;
            this.f77342n.m110290S(this.f77338j.f67316d, b320.m100054q(a320Var.f67316d, a320Var.f67317e));
            this.f77342n.m110293V(5);
            this.f77329a.m173866a(j2, this.f77342n);
        }
        if (this.f77339k.m94638b(i2)) {
            a320 a320Var2 = this.f77339k;
            this.f77342n.m110290S(this.f77339k.f67316d, b320.m100054q(a320Var2.f67316d, a320Var2.f67317e));
            this.f77342n.m110293V(5);
            this.f77329a.m173866a(j2, this.f77342n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: h */
    private void m103923h(byte[] bArr, int i, int i2) {
        this.f77332d.m103930e(bArr, i, i2);
        if (!this.f77333e) {
            this.f77335g.m94637a(bArr, i, i2);
            this.f77336h.m94637a(bArr, i, i2);
            this.f77337i.m94637a(bArr, i, i2);
        }
        this.f77338j.m94637a(bArr, i, i2);
        this.f77339k.m94637a(bArr, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public static C1871k m103924i(@Nullable String str, a320 a320Var, a320 a320Var2, a320 a320Var3) {
        int i = a320Var.f67317e;
        byte[] bArr = new byte[a320Var2.f67317e + i + a320Var3.f67317e];
        System.arraycopy(a320Var.f67316d, 0, bArr, 0, i);
        System.arraycopy(a320Var2.f67316d, 0, bArr, a320Var.f67317e, a320Var2.f67317e);
        System.arraycopy(a320Var3.f67316d, 0, bArr, a320Var.f67317e + a320Var2.f67317e, a320Var3.f67317e);
        b320.C15783a c15783aM100045h = b320.m100045h(a320Var2.f67316d, 3, a320Var2.f67317e);
        return new C1871k.b().m10334U(str).m10346g0("video/hevc").m10324K(lb5.m149201c(c15783aM100045h.f72766a, c15783aM100045h.f72767b, c15783aM100045h.f72768c, c15783aM100045h.f72769d, c15783aM100045h.f72773h, c15783aM100045h.f72774i)).m10353n0(c15783aM100045h.f72776k).m10332S(c15783aM100045h.f72777l).m10342c0(c15783aM100045h.f72778m).m10335V(Collections.singletonList(bArr)).m10320G();
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        m103921f();
        while (d860Var.m110295a() > 0) {
            int iM110300f = d860Var.m110300f();
            int iM110301g = d860Var.m110301g();
            byte[] bArrM110299e = d860Var.m110299e();
            this.f77340l += (long) d860Var.m110295a();
            this.f77331c.m153238d(d860Var, d860Var.m110295a());
            while (iM110300f < iM110301g) {
                int iM100040c = b320.m100040c(bArrM110299e, iM110300f, iM110301g, this.f77334f);
                if (iM100040c == iM110301g) {
                    m103923h(bArrM110299e, iM110300f, iM110301g);
                    return;
                }
                int iM100042e = b320.m100042e(bArrM110299e, iM100040c);
                int i = iM100040c - iM110300f;
                if (i > 0) {
                    m103923h(bArrM110299e, iM110300f, iM100040c);
                }
                int i2 = iM110301g - iM100040c;
                long j = this.f77340l - ((long) i2);
                m103922g(j, i2, i < 0 ? -i : 0, this.f77341m);
                m103925j(j, i2, iM100042e, this.f77341m);
                iM110300f = iM100040c + 3;
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f77340l = 0L;
        this.f77341m = -9223372036854775807L;
        b320.m100038a(this.f77334f);
        this.f77335g.m94640d();
        this.f77336h.m94640d();
        this.f77337i.m94640d();
        this.f77338j.m94640d();
        this.f77339k.m94640d();
        C15977a c15977a = this.f77332d;
        if (c15977a != null) {
            c15977a.m103931f();
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f77341m = j;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f77330b = c16793d.m120358b();
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 2);
        this.f77331c = m6j0VarMo11362b;
        this.f77332d = new C15977a(m6j0VarMo11362b);
        this.f77329a.m173867b(uqfVar, c16793d);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: j */
    public final void m103925j(long j, int i, int i2, long j2) {
        this.f77332d.m103932g(j, i, i2, j2, this.f77333e);
        if (!this.f77333e) {
            this.f77335g.m94641e(i2);
            this.f77336h.m94641e(i2);
            this.f77337i.m94641e(i2);
        }
        this.f77338j.m94641e(i2);
        this.f77339k.m94641e(i2);
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }
}
