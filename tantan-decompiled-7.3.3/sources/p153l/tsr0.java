package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class tsr0 {

    /* JADX INFO: renamed from: a */
    public final sgr0 f176026a;

    /* JADX INFO: renamed from: b */
    public long f176027b;

    /* JADX INFO: renamed from: c */
    public boolean f176028c;

    /* JADX INFO: renamed from: d */
    public int f176029d;

    /* JADX INFO: renamed from: e */
    public long f176030e;

    /* JADX INFO: renamed from: f */
    public boolean f176031f;

    /* JADX INFO: renamed from: g */
    public boolean f176032g;

    /* JADX INFO: renamed from: h */
    public boolean f176033h;

    /* JADX INFO: renamed from: i */
    public boolean f176034i;

    /* JADX INFO: renamed from: j */
    public boolean f176035j;

    /* JADX INFO: renamed from: k */
    public long f176036k;

    /* JADX INFO: renamed from: l */
    public long f176037l;

    /* JADX INFO: renamed from: m */
    public boolean f176038m;

    public tsr0(sgr0 sgr0Var) {
        this.f176026a = sgr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m192638a(long j) {
        this.f176027b = j;
        m192643f(0);
        this.f176034i = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m192639b(long j, int i, boolean z) {
        if (this.f176035j && this.f176032g) {
            this.f176038m = this.f176028c;
            this.f176035j = false;
        } else if (this.f176033h || this.f176032g) {
            if (z && this.f176034i) {
                m192643f(i + ((int) (j - this.f176027b)));
            }
            this.f176036k = this.f176027b;
            this.f176037l = this.f176030e;
            this.f176038m = this.f176028c;
            this.f176034i = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m192640c(byte[] bArr, int i, int i2) {
        if (this.f176031f) {
            int i3 = this.f176029d;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.f176029d = i3 + (i2 - i);
            } else {
                this.f176032g = (bArr[i4] & 128) != 0;
                this.f176031f = false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m192641d() {
        this.f176031f = false;
        this.f176032g = false;
        this.f176033h = false;
        this.f176034i = false;
        this.f176035j = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m192642e(long j, int i, int i2, long j2, boolean z) {
        this.f176032g = false;
        this.f176033h = false;
        this.f176030e = j2;
        this.f176029d = 0;
        this.f176027b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f176034i && !this.f176035j) {
                if (z) {
                    m192643f(i);
                }
                this.f176034i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f176033h = !this.f176035j;
                this.f176035j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        this.f176028c = z2;
        this.f176031f = z2 || i2 <= 9;
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
    /* JADX INFO: renamed from: f */
    public final void m192643f(int i) {
        long j = this.f176037l;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.f176038m;
        long j2 = this.f176027b - this.f176036k;
        this.f176026a.mo99372c(j, z ? 1 : 0, (int) j2, i, null);
    }
}
