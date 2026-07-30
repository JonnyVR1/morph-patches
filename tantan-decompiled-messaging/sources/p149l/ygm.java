package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class ygm extends ydk implements q7m {

    /* JADX INFO: renamed from: a */
    private qs2 f198207a;

    /* JADX INFO: renamed from: b */
    private ts2 f198208b;

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
    public ygm(ts2 ts2Var) {
        if (ts2Var instanceof q7m) {
            this.f198208b = ts2Var;
        }
        ts2 cn40Var = new cn40();
        qs2 qs2Var = new qs2();
        this.f198207a = qs2Var;
        cn40Var.addTarget(qs2Var);
        ts2Var.addTarget(this.f198207a);
        this.f198207a.registerFilterLocation(cn40Var, 0);
        this.f198207a.registerFilterLocation(ts2Var, 1);
        this.f198207a.addTarget(this);
        registerInitialFilter(cn40Var);
        registerInitialFilter(ts2Var);
        registerTerminalFilter(this.f198207a);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m214729Q1(String str) {
        qs2 qs2Var = this.f198207a;
        if (qs2Var != null) {
            qs2Var.setBlendType(str);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m214730R1() {
        this.f198207a.m176145Q1();
    }

    /* JADX INFO: renamed from: S1 */
    public void m214731S1(float f) {
        this.f198207a.m176146R1(f);
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        jcj jcjVar = this.f198208b;
        if (jcjVar == null || !(jcjVar instanceof q7m)) {
            return;
        }
        ((q7m) jcjVar).setTimeStamp(j);
    }
}
