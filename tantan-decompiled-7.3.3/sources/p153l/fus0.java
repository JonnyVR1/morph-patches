package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class fus0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ots0 f100941a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e9t0 f100942b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvs0 f100943c;

    public fus0(bvs0 bvs0Var, v2s0 v2s0Var, ots0 ots0Var, e9t0 e9t0Var) {
        this.f100941a = ots0Var;
        this.f100942b = e9t0Var;
        this.f100943c = bvs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l.bqs0] */
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
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        d2v0.m113737k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.f100943c.f78623a) {
            try {
                d2v0.m113737k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                dct0.m115297f("JS Engine is requesting an update");
                if (this.f100943c.f78631i == 0) {
                    dct0.m115297f("Starting reload.");
                    this.f100943c.f78631i = 2;
                    this.f100943c.m106606d(null);
                }
                this.f100941a.mo112871k0("/requestReload", this.f100942b.m119955a());
            } catch (Throwable th) {
                throw th;
            }
        }
        d2v0.m113737k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
