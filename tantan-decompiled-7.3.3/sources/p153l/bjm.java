package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class bjm extends ogk implements gam {

    /* JADX INFO: renamed from: a */
    private gt2 f76999a;

    /* JADX INFO: renamed from: b */
    private jt2 f77000b;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public bjm(jt2 jt2Var) {
        if (jt2Var instanceof gam) {
            this.f77000b = jt2Var;
        }
        jt2 qv40Var = new qv40();
        gt2 gt2Var = new gt2();
        this.f76999a = gt2Var;
        qv40Var.addTarget(gt2Var);
        jt2Var.addTarget(this.f76999a);
        this.f76999a.registerFilterLocation(qv40Var, 0);
        this.f76999a.registerFilterLocation(jt2Var, 1);
        this.f76999a.addTarget(this);
        registerInitialFilter(qv40Var);
        registerInitialFilter(jt2Var);
        registerTerminalFilter(this.f76999a);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m104631Q1(String str) {
        gt2 gt2Var = this.f76999a;
        if (gt2Var != null) {
            gt2Var.setBlendType(str);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m104632R1() {
        this.f76999a.m132193Q1();
    }

    /* JADX INFO: renamed from: S1 */
    public void m104633S1(float f) {
        this.f76999a.m132194R1(f);
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        Object obj = this.f77000b;
        if (obj == null || !(obj instanceof gam)) {
            return;
        }
        ((gam) obj).setTimeStamp(j);
    }
}
