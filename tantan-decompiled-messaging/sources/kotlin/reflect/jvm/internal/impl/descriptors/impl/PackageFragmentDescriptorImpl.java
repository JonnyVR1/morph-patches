package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PackageFragmentDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PackageFragmentDescriptor {

    /* JADX INFO: renamed from: e */
    @NotNull
    public final FqName f64244e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final String f64245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageFragmentDescriptorImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName) {
        super(moduleDescriptor, Annotations.Companion.m88641b(), fqName.m91052g(), SourceElement.f64063a);
        moduleDescriptor.getClass();
        fqName.getClass();
        this.f64244e = fqName;
        this.f64245f = "package " + fqName + " of " + moduleDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.mo88473k(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public ModuleDescriptor mo88299b() {
        DeclarationDescriptor declarationDescriptorMo88299b = super.mo88299b();
        declarationDescriptorMo88299b.getClass();
        return (ModuleDescriptor) declarationDescriptorMo88299b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    /* JADX INFO: renamed from: d */
    public final FqName mo88562d() {
        return this.f64244e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.f64063a;
        sourceElement.getClass();
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return this.f64245f;
    }
}
