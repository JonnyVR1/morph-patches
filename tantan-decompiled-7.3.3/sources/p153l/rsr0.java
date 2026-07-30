package p153l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class rsr0 {

    /* JADX INFO: renamed from: a */
    public final sgr0 f164715a;

    /* JADX INFO: renamed from: d */
    public final b5x0 f164718d;

    /* JADX INFO: renamed from: e */
    public final byte[] f164719e;

    /* JADX INFO: renamed from: f */
    public int f164720f;

    /* JADX INFO: renamed from: g */
    public long f164721g;

    /* JADX INFO: renamed from: h */
    public long f164722h;

    /* JADX INFO: renamed from: l */
    public long f164726l;

    /* JADX INFO: renamed from: m */
    public long f164727m;

    /* JADX INFO: renamed from: n */
    public boolean f164728n;

    /* JADX INFO: renamed from: o */
    public boolean f164729o;

    /* JADX INFO: renamed from: b */
    public final SparseArray f164716b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final SparseArray f164717c = new SparseArray();

    /* JADX INFO: renamed from: i */
    public final qsr0 f164723i = new qsr0(null);

    /* JADX INFO: renamed from: j */
    public final qsr0 f164724j = new qsr0(null);

    /* JADX INFO: renamed from: k */
    public boolean f164725k = false;

    public rsr0(sgr0 sgr0Var, boolean z, boolean z2) {
        this.f164715a = sgr0Var;
        byte[] bArr = new byte[128];
        this.f164719e = bArr;
        this.f164718d = new b5x0(bArr, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m183024a(long j) {
        this.f164721g = j;
        m183030g(0);
        this.f164725k = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m183025b(j1x0 j1x0Var) {
        this.f164717c.append(j1x0Var.f117999a, j1x0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m183026c(p2x0 p2x0Var) {
        this.f164716b.append(p2x0Var.f150333d, p2x0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m183027d() {
        this.f164725k = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m183028e(long j, int i, long j2, boolean z) {
        this.f164720f = i;
        this.f164722h = j2;
        this.f164721g = j;
        this.f164729o = z;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m183029f(long j, int i, boolean z) {
        boolean z2 = false;
        if (this.f164720f == 9) {
            if (z && this.f164725k) {
                m183030g(i + ((int) (j - this.f164721g)));
            }
            this.f164726l = this.f164721g;
            this.f164727m = this.f164722h;
            this.f164728n = false;
            this.f164725k = true;
        }
        boolean z3 = this.f164729o;
        boolean z4 = this.f164728n;
        int i2 = this.f164720f;
        if (i2 == 5 || (z3 && i2 == 1)) {
            z2 = true;
        }
        boolean z5 = z4 | z2;
        this.f164728n = z5;
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
    public final void m183030g(int i) {
        long j = this.f164727m;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.f164728n;
        long j2 = this.f164721g - this.f164726l;
        this.f164715a.mo99372c(j, z ? 1 : 0, (int) j2, i, null);
    }
}
