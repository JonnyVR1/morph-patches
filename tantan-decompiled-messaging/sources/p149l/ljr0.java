package p149l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class ljr0 {

    /* JADX INFO: renamed from: a */
    public final m7r0 f128388a;

    /* JADX INFO: renamed from: d */
    public final vvw0 f128391d;

    /* JADX INFO: renamed from: e */
    public final byte[] f128392e;

    /* JADX INFO: renamed from: f */
    public int f128393f;

    /* JADX INFO: renamed from: g */
    public long f128394g;

    /* JADX INFO: renamed from: h */
    public long f128395h;

    /* JADX INFO: renamed from: l */
    public long f128399l;

    /* JADX INFO: renamed from: m */
    public long f128400m;

    /* JADX INFO: renamed from: n */
    public boolean f128401n;

    /* JADX INFO: renamed from: o */
    public boolean f128402o;

    /* JADX INFO: renamed from: b */
    public final SparseArray f128389b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final SparseArray f128390c = new SparseArray();

    /* JADX INFO: renamed from: i */
    public final kjr0 f128396i = new kjr0(null);

    /* JADX INFO: renamed from: j */
    public final kjr0 f128397j = new kjr0(null);

    /* JADX INFO: renamed from: k */
    public boolean f128398k = false;

    public ljr0(m7r0 m7r0Var, boolean z, boolean z2) {
        this.f128388a = m7r0Var;
        byte[] bArr = new byte[128];
        this.f128392e = bArr;
        this.f128391d = new vvw0(bArr, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m150037a(long j) {
        this.f128394g = j;
        m150043g(0);
        this.f128398k = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m150038b(dsw0 dsw0Var) {
        this.f128390c.append(dsw0Var.f87795a, dsw0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m150039c(jtw0 jtw0Var) {
        this.f128389b.append(jtw0Var.f119681d, jtw0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m150040d() {
        this.f128398k = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m150041e(long j, int i, long j2, boolean z) {
        this.f128393f = i;
        this.f128395h = j2;
        this.f128394g = j;
        this.f128402o = z;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m150042f(long j, int i, boolean z) {
        boolean z2 = false;
        if (this.f128393f == 9) {
            if (z && this.f128398k) {
                m150043g(i + ((int) (j - this.f128394g)));
            }
            this.f128399l = this.f128394g;
            this.f128400m = this.f128395h;
            this.f128401n = false;
            this.f128398k = true;
        }
        boolean z3 = this.f128402o;
        boolean z4 = this.f128401n;
        int i2 = this.f128393f;
        if (i2 == 5 || (z3 && i2 == 1)) {
            z2 = true;
        }
        boolean z5 = z4 | z2;
        this.f128401n = z5;
        return z5;
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
    /* JADX INFO: renamed from: g */
    public final void m150043g(int i) {
        long j = this.f128400m;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.f128401n;
        long j2 = this.f128394g - this.f128399l;
        this.f128388a.mo134530c(j, z ? 1 : 0, (int) j2, i, null);
    }
}
