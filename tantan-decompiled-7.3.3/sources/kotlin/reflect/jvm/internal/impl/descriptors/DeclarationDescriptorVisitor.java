package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    /* JADX INFO: renamed from: a */
    R mo89356a(ClassDescriptor classDescriptor, D d);

    /* JADX INFO: renamed from: b */
    R mo89357b(PackageViewDescriptor packageViewDescriptor, D d);

    /* JADX INFO: renamed from: c */
    R mo88561c(PropertyDescriptor propertyDescriptor, D d);

    /* JADX INFO: renamed from: d */
    R mo89358d(PropertySetterDescriptor propertySetterDescriptor, D d);

    /* JADX INFO: renamed from: e */
    R mo89359e(ValueParameterDescriptor valueParameterDescriptor, D d);

    /* JADX INFO: renamed from: f */
    R mo88734f(ConstructorDescriptor constructorDescriptor, D d);

    /* JADX INFO: renamed from: g */
    R mo89360g(ReceiverParameterDescriptor receiverParameterDescriptor, D d);

    /* JADX INFO: renamed from: h */
    R mo89361h(TypeParameterDescriptor typeParameterDescriptor, D d);

    /* JADX INFO: renamed from: i */
    R mo89362i(TypeAliasDescriptor typeAliasDescriptor, D d);

    /* JADX INFO: renamed from: j */
    R mo89363j(PropertyGetterDescriptor propertyGetterDescriptor, D d);

    /* JADX INFO: renamed from: k */
    R mo89364k(PackageFragmentDescriptor packageFragmentDescriptor, D d);

    /* JADX INFO: renamed from: l */
    R mo88562l(FunctionDescriptor functionDescriptor, D d);

    /* JADX INFO: renamed from: m */
    R mo89365m(ModuleDescriptor moduleDescriptor, D d);
}
