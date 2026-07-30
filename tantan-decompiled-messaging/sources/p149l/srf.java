package p149l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class srf extends jr2 {

    /* JADX INFO: renamed from: c */
    private asf f166088c;

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
        this.f166088c = null;
        this.f166088c = new asf();
        lsf lsfVar = new lsf();
        rrf rrfVar = new rrf();
        rrfVar.addTarget(lsfVar);
        this.f166088c.addTarget(lsfVar);
        lsfVar.addTarget(this);
        lsfVar.registerFilterLocation(rrfVar);
        lsfVar.registerFilterLocation(this.f166088c);
        registerEffectInnerFilter(this.f166088c);
        registerEffectInnerFilter(lsfVar);
        registerEffectInnerFilter(rrfVar);
        registerFilter(this.f166088c);
        registerFilter(lsfVar);
        registerFilter(rrfVar);
        registerInitialFilter(this.f166088c);
        registerInitialFilter(rrfVar);
        registerTerminalFilter(lsfVar);
    }

    @Override // p149l.AbstractC17477i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f166088c.m196469Q1(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
