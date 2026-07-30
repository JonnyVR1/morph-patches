package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    /* JADX INFO: renamed from: a */
    R mo88465a(ClassDescriptor classDescriptor, D d);

    /* JADX INFO: renamed from: b */
    R mo88466b(PackageViewDescriptor packageViewDescriptor, D d);

    /* JADX INFO: renamed from: c */
    R mo87670c(PropertyDescriptor propertyDescriptor, D d);

    /* JADX INFO: renamed from: d */
    R mo88467d(PropertySetterDescriptor propertySetterDescriptor, D d);

    /* JADX INFO: renamed from: e */
    R mo88468e(ValueParameterDescriptor valueParameterDescriptor, D d);

    /* JADX INFO: renamed from: f */
    R mo87843f(ConstructorDescriptor constructorDescriptor, D d);

    /* JADX INFO: renamed from: g */
    R mo88469g(ReceiverParameterDescriptor receiverParameterDescriptor, D d);

    /* JADX INFO: renamed from: h */
    R mo88470h(TypeParameterDescriptor typeParameterDescriptor, D d);

    /* JADX INFO: renamed from: i */
    R mo88471i(TypeAliasDescriptor typeAliasDescriptor, D d);

    /* JADX INFO: renamed from: j */
    R mo88472j(PropertyGetterDescriptor propertyGetterDescriptor, D d);

    /* JADX INFO: renamed from: k */
    R mo88473k(PackageFragmentDescriptor packageFragmentDescriptor, D d);

    /* JADX INFO: renamed from: l */
    R mo87671l(FunctionDescriptor functionDescriptor, D d);

    /* JADX INFO: renamed from: m */
    R mo88474m(ModuleDescriptor moduleDescriptor, D d);
}
