package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class hjr0 {

    /* JADX INFO: renamed from: a */
    public final m7r0 f108108a;

    /* JADX INFO: renamed from: b */
    public boolean f108109b;

    /* JADX INFO: renamed from: c */
    public boolean f108110c;

    /* JADX INFO: renamed from: d */
    public boolean f108111d;

    /* JADX INFO: renamed from: e */
    public int f108112e;

    /* JADX INFO: renamed from: f */
    public int f108113f;

    /* JADX INFO: renamed from: g */
    public long f108114g;

    /* JADX INFO: renamed from: h */
    public long f108115h;

    public hjr0(m7r0 m7r0Var) {
        this.f108108a = m7r0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m131402a(byte[] bArr, int i, int i2) {
        if (this.f108110c) {
            int i3 = this.f108113f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f108113f = i3 + (i2 - i);
            } else {
                this.f108111d = ((bArr[i4] & 192) >> 6) == 0;
                this.f108110c = false;
            }
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
    /* JADX INFO: renamed from: b */
    public final void m131403b(long j, int i, boolean z) {
        f5v0.m119535f(this.f108115h != -9223372036854775807L);
        if (this.f108112e == 182 && z && this.f108109b) {
            this.f108108a.mo134530c(this.f108115h, this.f108111d ? 1 : 0, (int) (j - this.f108114g), i, null);
        }
        if (this.f108112e != 179) {
            this.f108114g = j;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m131404c(int i, long j) {
        boolean z;
        this.f108112e = i;
        this.f108111d = false;
        if (i == 182) {
            z = true;
        } else if (i == 179) {
            i = 179;
            z = true;
        } else {
            z = false;
        }
        this.f108109b = z;
        this.f108110c = i == 182;
        this.f108113f = 0;
        this.f108115h = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m131405d() {
        this.f108109b = false;
        this.f108110c = false;
        this.f108111d = false;
        this.f108112e = -1;
    }
}
