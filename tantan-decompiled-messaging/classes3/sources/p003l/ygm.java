package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ygm extends ydk implements q7m {

    /* JADX INFO: renamed from: a */
    private qs2 f9067a;

    /* JADX INFO: renamed from: b */
    private ts2 f9068b;

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
            this.f9068b = ts2Var;
        }
        ts2 cn40Var = new cn40();
        qs2 qs2Var = new qs2();
        this.f9067a = qs2Var;
        cn40Var.addTarget(qs2Var);
        ts2Var.addTarget(this.f9067a);
        this.f9067a.registerFilterLocation(cn40Var, 0);
        this.f9067a.registerFilterLocation(ts2Var, 1);
        this.f9067a.addTarget(this);
        registerInitialFilter(cn40Var);
        registerInitialFilter(ts2Var);
        registerTerminalFilter(this.f9067a);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m9190Q1(String str) {
        qs2 qs2Var = this.f9067a;
        if (qs2Var != null) {
            qs2Var.setBlendType(str);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m9191R1() {
        this.f9067a.m7028Q1();
    }

    /* JADX INFO: renamed from: S1 */
    public void m9192S1(float f) {
        this.f9067a.m7029R1(f);
    }

    @Override // p003l.q7m
    public void setTimeStamp(long j) {
        jcj jcjVar = this.f9068b;
        if (jcjVar == null || !(jcjVar instanceof q7m)) {
            return;
        }
        ((q7m) jcjVar).setTimeStamp(j);
    }
}
