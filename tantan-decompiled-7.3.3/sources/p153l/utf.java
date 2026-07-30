package p153l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class utf extends zr2 {

    /* JADX INFO: renamed from: c */
    private htf f180941c;

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
    public utf() {
        this.f180941c = null;
        this.f180941c = new htf();
        ktf ktfVar = new ktf();
        ttf ttfVar = new ttf();
        jtf jtfVar = new jtf();
        this.f180941c.addTarget(ktfVar);
        ktfVar.addTarget(ttfVar);
        jtfVar.addTarget(ktfVar);
        ttfVar.addTarget(this);
        ktfVar.registerFilterLocation(this.f180941c);
        ktfVar.registerFilterLocation(jtfVar);
        registerFilter(this.f180941c);
        registerFilter(ktfVar);
        registerFilter(ttfVar);
        registerFilter(jtfVar);
        registerEffectInnerFilter(this.f180941c);
        registerEffectInnerFilter(ktfVar);
        registerEffectInnerFilter(ttfVar);
        registerEffectInnerFilter(jtfVar);
        registerInitialFilter(this.f180941c);
        registerInitialFilter(jtfVar);
        registerTerminalFilter(ttfVar);
    }

    @Override // p153l.AbstractC17634i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f180941c.m147844Q1(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
