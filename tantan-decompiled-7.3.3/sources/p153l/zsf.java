package p153l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class zsf extends zr2 {

    /* JADX INFO: renamed from: c */
    private htf f205874c;

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
    public zsf() {
        this.f205874c = null;
        this.f205874c = new htf();
        stf stfVar = new stf();
        ysf ysfVar = new ysf();
        ysfVar.addTarget(stfVar);
        this.f205874c.addTarget(stfVar);
        stfVar.addTarget(this);
        stfVar.registerFilterLocation(ysfVar);
        stfVar.registerFilterLocation(this.f205874c);
        registerEffectInnerFilter(this.f205874c);
        registerEffectInnerFilter(stfVar);
        registerEffectInnerFilter(ysfVar);
        registerFilter(this.f205874c);
        registerFilter(stfVar);
        registerFilter(ysfVar);
        registerInitialFilter(this.f205874c);
        registerInitialFilter(ysfVar);
        registerTerminalFilter(stfVar);
    }

    @Override // p153l.AbstractC17634i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f205874c.m147844Q1(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
