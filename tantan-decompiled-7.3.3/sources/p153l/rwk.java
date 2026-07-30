package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rwk implements hte {

    /* JADX INFO: renamed from: a */
    public final vke0 f165155a;

    /* JADX INFO: renamed from: b */
    public String f165156b;

    /* JADX INFO: renamed from: c */
    public qfj0 f165157c;

    /* JADX INFO: renamed from: d */
    public C19924a f165158d;

    /* JADX INFO: renamed from: e */
    public boolean f165159e;

    /* JADX INFO: renamed from: l */
    public long f165166l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f165160f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final ib20 f165161g = new ib20(32, 128);

    /* JADX INFO: renamed from: h */
    public final ib20 f165162h = new ib20(33, 128);

    /* JADX INFO: renamed from: i */
    public final ib20 f165163i = new ib20(34, 128);

    /* JADX INFO: renamed from: j */
    public final ib20 f165164j = new ib20(39, 128);

    /* JADX INFO: renamed from: k */
    public final ib20 f165165k = new ib20(40, 128);

    /* JADX INFO: renamed from: m */
    public long f165167m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final ig60 f165168n = new ig60();

    /* JADX INFO: renamed from: l.rwk$a */
    public static final class C19924a {

        /* JADX INFO: renamed from: a */
        public final qfj0 f165169a;

        /* JADX INFO: renamed from: b */
        public long f165170b;

        /* JADX INFO: renamed from: c */
        public boolean f165171c;

        /* JADX INFO: renamed from: d */
        public int f165172d;

        /* JADX INFO: renamed from: e */
        public long f165173e;

        /* JADX INFO: renamed from: f */
        public boolean f165174f;

        /* JADX INFO: renamed from: g */
        public boolean f165175g;

        /* JADX INFO: renamed from: h */
        public boolean f165176h;

        /* JADX INFO: renamed from: i */
        public boolean f165177i;

        /* JADX INFO: renamed from: j */
        public boolean f165178j;

        /* JADX INFO: renamed from: k */
        public long f165179k;

        /* JADX INFO: renamed from: l */
        public long f165180l;

        /* JADX INFO: renamed from: m */
        public boolean f165181m;

        public C19924a(qfj0 qfj0Var) {
            this.f165169a = qfj0Var;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m183364b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m183365c(int i) {
            return i < 32 || i == 40;
        }

        /* JADX INFO: renamed from: a */
        public void m183366a(long j, int i, boolean z) {
            if (this.f165178j && this.f165175g) {
                this.f165181m = this.f165171c;
                this.f165178j = false;
            } else if (this.f165176h || this.f165175g) {
                if (z && this.f165177i) {
                    m183367d(i + ((int) (j - this.f165170b)));
                }
                this.f165179k = this.f165170b;
                this.f165180l = this.f165173e;
                this.f165181m = this.f165171c;
                this.f165177i = true;
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
        public final void m183367d(int i) {
            long j = this.f165180l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f165181m;
            this.f165169a.mo11163a(j, z ? 1 : 0, (int) (this.f165170b - this.f165179k), i, null);
        }

        /* JADX INFO: renamed from: e */
        public void m183368e(byte[] bArr, int i, int i2) {
            if (this.f165174f) {
                int i3 = this.f165172d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.f165172d = i3 + (i2 - i);
                } else {
                    this.f165175g = (bArr[i4] & 128) != 0;
                    this.f165174f = false;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m183369f() {
            this.f165174f = false;
            this.f165175g = false;
            this.f165176h = false;
            this.f165177i = false;
            this.f165178j = false;
        }

        /* JADX INFO: renamed from: g */
        public void m183370g(long j, int i, int i2, long j2, boolean z) {
            this.f165175g = false;
            this.f165176h = false;
            this.f165173e = j2;
            this.f165172d = 0;
            this.f165170b = j;
            if (!m183365c(i2)) {
                if (this.f165177i && !this.f165178j) {
                    if (z) {
                        m183367d(i);
                    }
                    this.f165177i = false;
                }
                if (m183364b(i2)) {
                    this.f165176h = !this.f165178j;
                    this.f165178j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f165171c = z2;
            this.f165174f = z2 || i2 <= 9;
        }
    }

    public rwk(vke0 vke0Var) {
        this.f165155a = vke0Var;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: f */
    private void m183359f() {
        w11.m204373i(this.f165157c);
        bmk0.m105144j(this.f165158d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: g */
    private void m183360g(long j, int i, int i2, long j2) {
        this.f165158d.m183366a(j, i, this.f165159e);
        if (!this.f165159e) {
            this.f165161g.m139235b(i2);
            this.f165162h.m139235b(i2);
            this.f165163i.m139235b(i2);
            if (this.f165161g.m139236c() && this.f165162h.m139236c() && this.f165163i.m139236c()) {
                this.f165157c.mo11164b(m183362i(this.f165156b, this.f165161g, this.f165162h, this.f165163i));
                this.f165159e = true;
            }
        }
        if (this.f165164j.m139235b(i2)) {
            ib20 ib20Var = this.f165164j;
            this.f165168n.m139806S(this.f165164j.f113652d, jb20.m144199q(ib20Var.f113652d, ib20Var.f113653e));
            this.f165168n.m139809V(5);
            this.f165155a.m201568a(j2, this.f165168n);
        }
        if (this.f165165k.m139235b(i2)) {
            ib20 ib20Var2 = this.f165165k;
            this.f165168n.m139806S(this.f165165k.f113652d, jb20.m144199q(ib20Var2.f113652d, ib20Var2.f113653e));
            this.f165168n.m139809V(5);
            this.f165155a.m201568a(j2, this.f165168n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: h */
    private void m183361h(byte[] bArr, int i, int i2) {
        this.f165158d.m183368e(bArr, i, i2);
        if (!this.f165159e) {
            this.f165161g.m139234a(bArr, i, i2);
            this.f165162h.m139234a(bArr, i, i2);
            this.f165163i.m139234a(bArr, i, i2);
        }
        this.f165164j.m139234a(bArr, i, i2);
        this.f165165k.m139234a(bArr, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public static C1894k m183362i(@Nullable String str, ib20 ib20Var, ib20 ib20Var2, ib20 ib20Var3) {
        int i = ib20Var.f113653e;
        byte[] bArr = new byte[ib20Var2.f113653e + i + ib20Var3.f113653e];
        System.arraycopy(ib20Var.f113652d, 0, bArr, 0, i);
        System.arraycopy(ib20Var2.f113652d, 0, bArr, ib20Var.f113653e, ib20Var2.f113653e);
        System.arraycopy(ib20Var3.f113652d, 0, bArr, ib20Var.f113653e + ib20Var2.f113653e, ib20Var3.f113653e);
        jb20.C17912a c17912aM144190h = jb20.m144190h(ib20Var2.f113652d, 3, ib20Var2.f113653e);
        return new C1894k.b().m10388U(str).m10400g0("video/hevc").m10378K(lc5.m153623c(c17912aM144190h.f119088a, c17912aM144190h.f119089b, c17912aM144190h.f119090c, c17912aM144190h.f119091d, c17912aM144190h.f119095h, c17912aM144190h.f119096i)).m10407n0(c17912aM144190h.f119098k).m10386S(c17912aM144190h.f119099l).m10396c0(c17912aM144190h.f119100m).m10389V(Collections.singletonList(bArr)).m10374G();
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        m183359f();
        while (ig60Var.m139811a() > 0) {
            int iM139816f = ig60Var.m139816f();
            int iM139817g = ig60Var.m139817g();
            byte[] bArrM139815e = ig60Var.m139815e();
            this.f165166l += (long) ig60Var.m139811a();
            this.f165157c.m176370d(ig60Var, ig60Var.m139811a());
            while (iM139816f < iM139817g) {
                int iM144185c = jb20.m144185c(bArrM139815e, iM139816f, iM139817g, this.f165160f);
                if (iM144185c == iM139817g) {
                    m183361h(bArrM139815e, iM139816f, iM139817g);
                    return;
                }
                int iM144187e = jb20.m144187e(bArrM139815e, iM144185c);
                int i = iM144185c - iM139816f;
                if (i > 0) {
                    m183361h(bArrM139815e, iM139816f, iM144185c);
                }
                int i2 = iM139817g - iM144185c;
                long j = this.f165166l - ((long) i2);
                m183360g(j, i2, i < 0 ? -i : 0, this.f165167m);
                m183363j(j, i2, iM144187e, this.f165167m);
                iM139816f = iM144185c + 3;
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f165166l = 0L;
        this.f165167m = -9223372036854775807L;
        jb20.m144183a(this.f165160f);
        this.f165161g.m139237d();
        this.f165162h.m139237d();
        this.f165163i.m139237d();
        this.f165164j.m139237d();
        this.f165165k.m139237d();
        C19924a c19924a = this.f165158d;
        if (c19924a != null) {
            c19924a.m183369f();
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f165167m = j;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f165156b = c17969d.m145855b();
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 2);
        this.f165157c = qfj0VarMo11416b;
        this.f165158d = new C19924a(qfj0VarMo11416b);
        this.f165155a.m201569b(bsfVar, c17969d);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: j */
    public final void m183363j(long j, int i, int i2, long j2) {
        this.f165158d.m183370g(j, i, i2, j2, this.f165159e);
        if (!this.f165159e) {
            this.f165161g.m139238e(i2);
            this.f165162h.m139238e(i2);
            this.f165163i.m139238e(i2);
        }
        this.f165164j.m139238e(i2);
        this.f165165k.m139238e(i2);
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }
}
