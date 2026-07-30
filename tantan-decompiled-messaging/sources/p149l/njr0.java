package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class njr0 {

    /* JADX INFO: renamed from: a */
    public final m7r0 f139317a;

    /* JADX INFO: renamed from: b */
    public long f139318b;

    /* JADX INFO: renamed from: c */
    public boolean f139319c;

    /* JADX INFO: renamed from: d */
    public int f139320d;

    /* JADX INFO: renamed from: e */
    public long f139321e;

    /* JADX INFO: renamed from: f */
    public boolean f139322f;

    /* JADX INFO: renamed from: g */
    public boolean f139323g;

    /* JADX INFO: renamed from: h */
    public boolean f139324h;

    /* JADX INFO: renamed from: i */
    public boolean f139325i;

    /* JADX INFO: renamed from: j */
    public boolean f139326j;

    /* JADX INFO: renamed from: k */
    public long f139327k;

    /* JADX INFO: renamed from: l */
    public long f139328l;

    /* JADX INFO: renamed from: m */
    public boolean f139329m;

    public njr0(m7r0 m7r0Var) {
        this.f139317a = m7r0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m159785a(long j) {
        this.f139318b = j;
        m159790f(0);
        this.f139325i = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m159786b(long j, int i, boolean z) {
        if (this.f139326j && this.f139323g) {
            this.f139329m = this.f139319c;
            this.f139326j = false;
        } else if (this.f139324h || this.f139323g) {
            if (z && this.f139325i) {
                m159790f(i + ((int) (j - this.f139318b)));
            }
            this.f139327k = this.f139318b;
            this.f139328l = this.f139321e;
            this.f139329m = this.f139319c;
            this.f139325i = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m159787c(byte[] bArr, int i, int i2) {
        if (this.f139322f) {
            int i3 = this.f139320d;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.f139320d = i3 + (i2 - i);
            } else {
                this.f139323g = (bArr[i4] & 128) != 0;
                this.f139322f = false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m159788d() {
        this.f139322f = false;
        this.f139323g = false;
        this.f139324h = false;
        this.f139325i = false;
        this.f139326j = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m159789e(long j, int i, int i2, long j2, boolean z) {
        this.f139323g = false;
        this.f139324h = false;
        this.f139321e = j2;
        this.f139320d = 0;
        this.f139318b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f139325i && !this.f139326j) {
                if (z) {
                    m159790f(i);
                }
                this.f139325i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f139324h = !this.f139326j;
                this.f139326j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        this.f139319c = z2;
        this.f139322f = z2 || i2 <= 9;
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
    public final void m159790f(int i) {
        long j = this.f139328l;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.f139329m;
        long j2 = this.f139318b - this.f139327k;
        this.f139317a.mo134530c(j, z ? 1 : 0, (int) j2, i, null);
    }
}
