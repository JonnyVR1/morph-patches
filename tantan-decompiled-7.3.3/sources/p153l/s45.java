package p153l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class s45 {

    /* JADX INFO: renamed from: a */
    public final qfj0 f166156a;

    /* JADX INFO: renamed from: b */
    public final int f166157b;

    /* JADX INFO: renamed from: c */
    public final int f166158c;

    /* JADX INFO: renamed from: d */
    public final long f166159d;

    /* JADX INFO: renamed from: e */
    public final int f166160e;

    /* JADX INFO: renamed from: f */
    public int f166161f;

    /* JADX INFO: renamed from: g */
    public int f166162g;

    /* JADX INFO: renamed from: h */
    public int f166163h;

    /* JADX INFO: renamed from: i */
    public int f166164i;

    /* JADX INFO: renamed from: j */
    public int f166165j;

    /* JADX INFO: renamed from: k */
    public long[] f166166k;

    /* JADX INFO: renamed from: l */
    public int[] f166167l;

    public s45(int i, int i2, long j, int i3, qfj0 qfj0Var) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        w11.m204365a(z);
        this.f166159d = j;
        this.f166160e = i3;
        this.f166156a = qfj0Var;
        this.f166157b = m184434d(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f166158c = i2 == 2 ? m184434d(i, 1650720768) : -1;
        this.f166166k = new long[512];
        this.f166167l = new int[512];
    }

    /* JADX INFO: renamed from: d */
    public static int m184434d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* JADX INFO: renamed from: a */
    public void m184435a() {
        this.f166163h++;
    }

    /* JADX INFO: renamed from: b */
    public void m184436b(long j) {
        if (this.f166165j == this.f166167l.length) {
            long[] jArr = this.f166166k;
            this.f166166k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f166167l;
            this.f166167l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f166166k;
        int i = this.f166165j;
        jArr2[i] = j;
        this.f166167l[i] = this.f166164i;
        this.f166165j = i + 1;
    }

    /* JADX INFO: renamed from: c */
    public void m184437c() {
        this.f166166k = Arrays.copyOf(this.f166166k, this.f166165j);
        this.f166167l = Arrays.copyOf(this.f166167l, this.f166165j);
    }

    /* JADX INFO: renamed from: e */
    public final long m184438e(int i) {
        return (this.f166159d * ((long) i)) / ((long) this.f166160e);
    }

    /* JADX INFO: renamed from: f */
    public long m184439f() {
        return m184438e(this.f166163h);
    }

    /* JADX INFO: renamed from: g */
    public long m184440g() {
        return m184438e(1);
    }

    /* JADX INFO: renamed from: h */
    public final oke0 m184441h(int i) {
        return new oke0(((long) this.f166167l[i]) * m184440g(), this.f166166k[i]);
    }

    /* JADX INFO: renamed from: i */
    public mke0.C18640a m184442i(long j) {
        int iM184440g = (int) (j / m184440g());
        int iM105138h = bmk0.m105138h(this.f166167l, iM184440g, true, true);
        if (this.f166167l[iM105138h] == iM184440g) {
            return new mke0.C18640a(m184441h(iM105138h));
        }
        oke0 oke0VarM184441h = m184441h(iM105138h);
        int i = iM105138h + 1;
        return i < this.f166166k.length ? new mke0.C18640a(oke0VarM184441h, m184441h(i)) : new mke0.C18640a(oke0VarM184441h);
    }

    /* JADX INFO: renamed from: j */
    public boolean m184443j(int i) {
        return this.f166157b == i || this.f166158c == i;
    }

    /* JADX INFO: renamed from: k */
    public void m184444k() {
        this.f166164i++;
    }

    /* JADX INFO: renamed from: l */
    public boolean m184445l() {
        return Arrays.binarySearch(this.f166167l, this.f166163h) >= 0;
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
    public boolean m184446m(asf asfVar) throws IOException {
        int i = this.f166162g;
        int iM176371e = i - this.f166156a.m176371e(asfVar, i, false);
        this.f166162g = iM176371e;
        boolean z = iM176371e == 0;
        if (z) {
            if (this.f166161f > 0) {
                this.f166156a.mo11163a(m184439f(), m184445l() ? 1 : 0, this.f166161f, 0, null);
            }
            m184435a();
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public void m184447n(int i) {
        this.f166161f = i;
        this.f166162g = i;
    }

    /* JADX INFO: renamed from: o */
    public void m184448o(long j) {
        if (this.f166165j == 0) {
            this.f166163h = 0;
        } else {
            this.f166163h = this.f166167l[bmk0.m105141i(this.f166166k, j, true, true)];
        }
    }
}
