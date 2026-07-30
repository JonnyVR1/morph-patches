package p003l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class psf extends jr2 {

    /* JADX INFO: renamed from: c */
    private asf f6505c;

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
    public psf() {
        this.f6505c = null;
        this.f6505c = new asf();
        osf osfVar = new osf();
        csf csfVar = new csf();
        csfVar.addTarget(osfVar);
        this.f6505c.addTarget(osfVar);
        osfVar.addTarget(this);
        osfVar.registerFilterLocation(csfVar, 0);
        osfVar.registerFilterLocation(this.f6505c, 1);
        registerEffectInnerFilter(csfVar);
        registerEffectInnerFilter(this.f6505c);
        registerEffectInnerFilter(osfVar);
        registerInitialFilter(csfVar);
        registerInitialFilter(this.f6505c);
        registerTerminalFilter(osfVar);
    }

    @Override // p003l.AbstractC0341i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f6505c.m8268Q1(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
