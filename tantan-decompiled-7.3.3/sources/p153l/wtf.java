package p153l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class wtf extends zr2 {

    /* JADX INFO: renamed from: c */
    private htf f190756c;

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
    public wtf() {
        this.f190756c = null;
        this.f190756c = new htf();
        vtf vtfVar = new vtf();
        jtf jtfVar = new jtf();
        jtfVar.addTarget(vtfVar);
        this.f190756c.addTarget(vtfVar);
        vtfVar.addTarget(this);
        vtfVar.registerFilterLocation(jtfVar, 0);
        vtfVar.registerFilterLocation(this.f190756c, 1);
        registerEffectInnerFilter(jtfVar);
        registerEffectInnerFilter(this.f190756c);
        registerEffectInnerFilter(vtfVar);
        registerInitialFilter(jtfVar);
        registerInitialFilter(this.f190756c);
        registerTerminalFilter(vtfVar);
    }

    @Override // p153l.AbstractC17634i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f190756c.m147844Q1(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
