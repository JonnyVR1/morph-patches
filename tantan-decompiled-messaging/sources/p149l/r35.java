package p149l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class r35 {

    /* JADX INFO: renamed from: a */
    public final m6j0 f157481a;

    /* JADX INFO: renamed from: b */
    public final int f157482b;

    /* JADX INFO: renamed from: c */
    public final int f157483c;

    /* JADX INFO: renamed from: d */
    public final long f157484d;

    /* JADX INFO: renamed from: e */
    public final int f157485e;

    /* JADX INFO: renamed from: f */
    public int f157486f;

    /* JADX INFO: renamed from: g */
    public int f157487g;

    /* JADX INFO: renamed from: h */
    public int f157488h;

    /* JADX INFO: renamed from: i */
    public int f157489i;

    /* JADX INFO: renamed from: j */
    public int f157490j;

    /* JADX INFO: renamed from: k */
    public long[] f157491k;

    /* JADX INFO: renamed from: l */
    public int[] f157492l;

    public r35(int i, int i2, long j, int i3, m6j0 m6j0Var) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        p11.m167007a(z);
        this.f157484d = j;
        this.f157485e = i3;
        this.f157481a = m6j0Var;
        this.f157482b = m177640d(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f157483c = i2 == 2 ? m177640d(i, 1650720768) : -1;
        this.f157491k = new long[512];
        this.f157492l = new int[512];
    }

    /* JADX INFO: renamed from: d */
    public static int m177640d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* JADX INFO: renamed from: a */
    public void m177641a() {
        this.f157488h++;
    }

    /* JADX INFO: renamed from: b */
    public void m177642b(long j) {
        if (this.f157490j == this.f157492l.length) {
            long[] jArr = this.f157491k;
            this.f157491k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f157492l;
            this.f157492l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f157491k;
        int i = this.f157490j;
        jArr2[i] = j;
        this.f157492l[i] = this.f157489i;
        this.f157490j = i + 1;
    }

    /* JADX INFO: renamed from: c */
    public void m177643c() {
        this.f157491k = Arrays.copyOf(this.f157491k, this.f157490j);
        this.f157492l = Arrays.copyOf(this.f157492l, this.f157490j);
    }

    /* JADX INFO: renamed from: e */
    public final long m177644e(int i) {
        return (this.f157484d * ((long) i)) / ((long) this.f157485e);
    }

    /* JADX INFO: renamed from: f */
    public long m177645f() {
        return m177644e(this.f157488h);
    }

    /* JADX INFO: renamed from: g */
    public long m177646g() {
        return m177644e(1);
    }

    /* JADX INFO: renamed from: h */
    public final jce0 m177647h(int i) {
        return new jce0(((long) this.f157492l[i]) * m177646g(), this.f157491k[i]);
    }

    /* JADX INFO: renamed from: i */
    public hce0.C17274a m177648i(long j) {
        int iM177646g = (int) (j / m177646g());
        int iM197860h = vck0.m197860h(this.f157492l, iM177646g, true, true);
        if (this.f157492l[iM197860h] == iM177646g) {
            return new hce0.C17274a(m177647h(iM197860h));
        }
        jce0 jce0VarM177647h = m177647h(iM197860h);
        int i = iM197860h + 1;
        return i < this.f157491k.length ? new hce0.C17274a(jce0VarM177647h, m177647h(i)) : new hce0.C17274a(jce0VarM177647h);
    }

    /* JADX INFO: renamed from: j */
    public boolean m177649j(int i) {
        return this.f157482b == i || this.f157483c == i;
    }

    /* JADX INFO: renamed from: k */
    public void m177650k() {
        this.f157489i++;
    }

    /* JADX INFO: renamed from: l */
    public boolean m177651l() {
        return Arrays.binarySearch(this.f157492l, this.f157488h) >= 0;
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
    /* JADX INFO: renamed from: m */
    public boolean m177652m(tqf tqfVar) throws IOException {
        int i = this.f157487g;
        int iM153239e = i - this.f157481a.m153239e(tqfVar, i, false);
        this.f157487g = iM153239e;
        boolean z = iM153239e == 0;
        if (z) {
            if (this.f157486f > 0) {
                this.f157481a.mo11109a(m177645f(), m177651l() ? 1 : 0, this.f157486f, 0, null);
            }
            m177641a();
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public void m177653n(int i) {
        this.f157486f = i;
        this.f157487g = i;
    }

    /* JADX INFO: renamed from: o */
    public void m177654o(long j) {
        if (this.f157490j == 0) {
            this.f157488h = 0;
        } else {
            this.f157488h = this.f157492l[vck0.m197863i(this.f157491k, j, true, true)];
        }
    }
}
