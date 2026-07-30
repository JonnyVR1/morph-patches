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
    public R mo89356a(ClassDescriptor classDescriptor, D d) {
        return m89600n(classDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: b */
    public R mo89357b(PackageViewDescriptor packageViewDescriptor, D d) {
        return m89600n(packageViewDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: c */
    public R mo88561c(PropertyDescriptor propertyDescriptor, D d) {
        return m89601o(propertyDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: d */
    public R mo89358d(PropertySetterDescriptor propertySetterDescriptor, D d) {
        return mo88562l(propertySetterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: e */
    public R mo89359e(ValueParameterDescriptor valueParameterDescriptor, D d) {
        return m89601o(valueParameterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: f */
    public R mo88734f(ConstructorDescriptor constructorDescriptor, D d) {
        return mo88562l(constructorDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: g */
    public R mo89360g(ReceiverParameterDescriptor receiverParameterDescriptor, D d) {
        return m89600n(receiverParameterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: h */
    public R mo89361h(TypeParameterDescriptor typeParameterDescriptor, D d) {
        return m89600n(typeParameterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: i */
    public R mo89362i(TypeAliasDescriptor typeAliasDescriptor, D d) {
        return m89600n(typeAliasDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: j */
    public R mo89363j(PropertyGetterDescriptor propertyGetterDescriptor, D d) {
        return mo88562l(propertyGetterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: k */
    public R mo89364k(PackageFragmentDescriptor packageFragmentDescriptor, D d) {
        return m89600n(packageFragmentDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: l */
    public R mo88562l(FunctionDescriptor functionDescriptor, D d) {
        return m89600n(functionDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: m */
    public R mo89365m(ModuleDescriptor moduleDescriptor, D d) {
        return m89600n(moduleDescriptor, d);
    }

    /* JADX INFO: renamed from: n */
    public R m89600n(DeclarationDescriptor declarationDescriptor, D d) {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public R m89601o(VariableDescriptor variableDescriptor, D d) {
        return m89600n(variableDescriptor, d);
    }
}
