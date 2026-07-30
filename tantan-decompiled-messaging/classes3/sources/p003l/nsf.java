package p003l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class nsf extends jr2 {

    /* JADX INFO: renamed from: c */
    private asf f5960c;

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
    public nsf() {
        this.f5960c = null;
        this.f5960c = new asf();
        dsf dsfVar = new dsf();
        msf msfVar = new msf();
        csf csfVar = new csf();
        this.f5960c.addTarget(dsfVar);
        dsfVar.addTarget(msfVar);
        csfVar.addTarget(dsfVar);
        msfVar.addTarget(this);
        dsfVar.registerFilterLocation(this.f5960c);
        dsfVar.registerFilterLocation(csfVar);
        registerFilter(this.f5960c);
        registerFilter(dsfVar);
        registerFilter(msfVar);
        registerFilter(csfVar);
        registerEffectInnerFilter(this.f5960c);
        registerEffectInnerFilter(dsfVar);
        registerEffectInnerFilter(msfVar);
        registerEffectInnerFilter(csfVar);
        registerInitialFilter(this.f5960c);
        registerInitialFilter(csfVar);
        registerTerminalFilter(msfVar);
    }

    @Override // p003l.AbstractC0341i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f5960c.m8268Q1(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
