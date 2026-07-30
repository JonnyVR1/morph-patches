package p003l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class srf extends jr2 {

    /* JADX INFO: renamed from: c */
    private asf f7290c;

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
    public srf() {
        this.f7290c = null;
        this.f7290c = new asf();
        lsf lsfVar = new lsf();
        rrf rrfVar = new rrf();
        rrfVar.addTarget(lsfVar);
        this.f7290c.addTarget(lsfVar);
        lsfVar.addTarget(this);
        lsfVar.registerFilterLocation(rrfVar);
        lsfVar.registerFilterLocation(this.f7290c);
        registerEffectInnerFilter(this.f7290c);
        registerEffectInnerFilter(lsfVar);
        registerEffectInnerFilter(rrfVar);
        registerFilter(this.f7290c);
        registerFilter(lsfVar);
        registerFilter(rrfVar);
        registerInitialFilter(this.f7290c);
        registerInitialFilter(rrfVar);
        registerTerminalFilter(lsfVar);
    }

    @Override // p003l.AbstractC0341i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f7290c.m8268Q1(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
