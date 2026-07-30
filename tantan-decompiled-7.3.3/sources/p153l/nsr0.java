package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class nsr0 {

    /* JADX INFO: renamed from: a */
    public final sgr0 f143530a;

    /* JADX INFO: renamed from: b */
    public boolean f143531b;

    /* JADX INFO: renamed from: c */
    public boolean f143532c;

    /* JADX INFO: renamed from: d */
    public boolean f143533d;

    /* JADX INFO: renamed from: e */
    public int f143534e;

    /* JADX INFO: renamed from: f */
    public int f143535f;

    /* JADX INFO: renamed from: g */
    public long f143536g;

    /* JADX INFO: renamed from: h */
    public long f143537h;

    public nsr0(sgr0 sgr0Var) {
        this.f143530a = sgr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m164630a(byte[] bArr, int i, int i2) {
        if (this.f143532c) {
            int i3 = this.f143535f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f143535f = i3 + (i2 - i);
            } else {
                this.f143533d = ((bArr[i4] & 192) >> 6) == 0;
                this.f143532c = false;
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
    public final void m164631b(long j, int i, boolean z) {
        lev0.m153958f(this.f143537h != -9223372036854775807L);
        if (this.f143534e == 182 && z && this.f143531b) {
            this.f143530a.mo99372c(this.f143537h, this.f143533d ? 1 : 0, (int) (j - this.f143536g), i, null);
        }
        if (this.f143534e != 179) {
            this.f143536g = j;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m164632c(int i, long j) {
        boolean z;
        this.f143534e = i;
        this.f143533d = false;
        if (i == 182) {
            z = true;
        } else if (i == 179) {
            i = 179;
            z = true;
        } else {
            z = false;
        }
        this.f143531b = z;
        this.f143532c = i == 182;
        this.f143535f = 0;
        this.f143537h = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m164633d() {
        this.f143531b = false;
        this.f143532c = false;
        this.f143533d = false;
        this.f143534e = -1;
    }
}
