package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: a */
    public R mo88465a(ClassDescriptor classDescriptor, D d) {
        return m88709n(classDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: b */
    public R mo88466b(PackageViewDescriptor packageViewDescriptor, D d) {
        return m88709n(packageViewDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: c */
    public R mo87670c(PropertyDescriptor propertyDescriptor, D d) {
        return m88710o(propertyDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: d */
    public R mo88467d(PropertySetterDescriptor propertySetterDescriptor, D d) {
        return mo87671l(propertySetterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: e */
    public R mo88468e(ValueParameterDescriptor valueParameterDescriptor, D d) {
        return m88710o(valueParameterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: f */
    public R mo87843f(ConstructorDescriptor constructorDescriptor, D d) {
        return mo87671l(constructorDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: g */
    public R mo88469g(ReceiverParameterDescriptor receiverParameterDescriptor, D d) {
        return m88709n(receiverParameterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: h */
    public R mo88470h(TypeParameterDescriptor typeParameterDescriptor, D d) {
        return m88709n(typeParameterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: i */
    public R mo88471i(TypeAliasDescriptor typeAliasDescriptor, D d) {
        return m88709n(typeAliasDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: j */
    public R mo88472j(PropertyGetterDescriptor propertyGetterDescriptor, D d) {
        return mo87671l(propertyGetterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: k */
    public R mo88473k(PackageFragmentDescriptor packageFragmentDescriptor, D d) {
        return m88709n(packageFragmentDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: l */
    public R mo87671l(FunctionDescriptor functionDescriptor, D d) {
        return m88709n(functionDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: m */
    public R mo88474m(ModuleDescriptor moduleDescriptor, D d) {
        return m88709n(moduleDescriptor, d);
    }

    /* JADX INFO: renamed from: n */
    public R m88709n(DeclarationDescriptor declarationDescriptor, D d) {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public R m88710o(VariableDescriptor variableDescriptor, D d) {
        return m88709n(variableDescriptor, d);
    }
}
