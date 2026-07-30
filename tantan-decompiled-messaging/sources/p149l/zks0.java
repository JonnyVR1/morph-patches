package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zks0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iks0 f203560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yzs0 f203561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vls0 f203562c;

    public zks0(vls0 vls0Var, ptr0 ptr0Var, iks0 iks0Var, yzs0 yzs0Var) {
        this.f203560a = iks0Var;
        this.f203561b = yzs0Var;
        this.f203562c = vls0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l.vgs0] */
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
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        xsu0.m210834k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.f203562c.f181980a) {
            try {
                xsu0.m210834k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                x2t0.m206868f("JS Engine is requesting an update");
                if (this.f203562c.f181988i == 0) {
                    x2t0.m206868f("Starting reload.");
                    this.f203562c.f181988i = 2;
                    this.f203562c.m198864d(null);
                }
                this.f203560a.mo175388k0("/requestReload", this.f203561b.m216696a());
            } catch (Throwable th) {
                throw th;
            }
        }
        xsu0.m210834k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
