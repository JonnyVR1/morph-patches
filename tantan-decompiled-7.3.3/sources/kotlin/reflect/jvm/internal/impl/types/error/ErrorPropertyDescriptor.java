package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorPropertyDescriptor implements PropertyDescriptor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PropertyDescriptorImpl f66999a;

    public ErrorPropertyDescriptor() {
        ErrorUtils errorUtils = ErrorUtils.INSTANCE;
        PropertyDescriptorImpl propertyDescriptorImplM89737I0 = PropertyDescriptorImpl.m89737I0(errorUtils.m93900h(), Annotations.Companion.m89532b(), Modality.OPEN, DescriptorVisibilities.f64700e, true, Name.m91972n(ErrorEntity.ERROR_PROPERTY.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f64737a, false, false, false, false, false, false);
        propertyDescriptorImplM89737I0.m89755V0(errorUtils.m93903k(), CollectionsKt.emptyList(), null, null, CollectionsKt.emptyList());
        this.f66999a = propertyDescriptorImplM89737I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: J */
    public <V> V mo89334J(CallableDescriptor.UserDataKey<V> userDataKey) {
        return (V) this.f66999a.mo89334J(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: K */
    public FieldDescriptor mo89474K() {
        return this.f66999a.mo89474K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: N */
    public void mo89342N(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        collection.getClass();
        this.f66999a.mo89342N(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) this.f66999a.mo89355S(declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    /* JADX INFO: renamed from: T */
    public boolean mo89513T() {
        return this.f66999a.mo89513T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: Y */
    public ReceiverParameterDescriptor mo89335Y() {
        return this.f66999a.mo89335Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public PropertyDescriptor mo89336a() {
        PropertyDescriptor propertyDescriptorMo89336a = this.f66999a.mo89336a();
        propertyDescriptorMo89336a.getClass();
        return propertyDescriptorMo89336a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public CallableMemberDescriptor mo89343a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        PropertyDescriptor propertyDescriptorM89744H0 = this.f66999a.mo89343a0(declarationDescriptor, modality, descriptorVisibility, kind, z);
        propertyDescriptorM89744H0.getClass();
        return propertyDescriptorM89744H0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        DeclarationDescriptor declarationDescriptorMo89190b = this.f66999a.mo89190b();
        declarationDescriptorMo89190b.getClass();
        return declarationDescriptorMo89190b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public ReceiverParameterDescriptor mo89337b0() {
        return this.f66999a.mo89337b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: c */
    public PropertyDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        return this.f66999a.mo89344c(typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends PropertyDescriptor> mo89338e() {
        Collection<? extends PropertyDescriptor> collectionMo89338e = this.f66999a.mo89338e();
        collectionMo89338e.getClass();
        return collectionMo89338e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo89192e0() {
        return this.f66999a.mo89192e0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<ValueParameterDescriptor> mo89339g() {
        List<ValueParameterDescriptor> listMo89339g = this.f66999a.mo89339g();
        listMo89339g.getClass();
        return listMo89339g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f66999a.getAnnotations();
        annotations.getClass();
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertyGetterDescriptor getGetter() {
        return this.f66999a.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f66999a.getKind();
        kind.getClass();
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f66999a.getName();
        name.getClass();
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public KotlinType getReturnType() {
        return this.f66999a.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.f66999a.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement source = this.f66999a.getSource();
        source.getClass();
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType type = this.f66999a.getType();
        type.getClass();
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> typeParameters = this.f66999a.getTypeParameters();
        typeParameters.getClass();
        return typeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f66999a.getVisibility();
        visibility.getClass();
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo89194i() {
        Modality modalityMo89194i = this.f66999a.mo89194i();
        modalityMo89194i.getClass();
        return modalityMo89194i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f66999a.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f66999a.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo89340k0() {
        return this.f66999a.mo89340k0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo89198n0() {
        return this.f66999a.mo89198n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    @Nullable
    /* JADX INFO: renamed from: q0 */
    public ConstantValue<?> mo89510q0() {
        return this.f66999a.mo89510q0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    /* JADX INFO: renamed from: r */
    public List<PropertyAccessorDescriptor> mo89475r() {
        List<PropertyAccessorDescriptor> listMo89475r = this.f66999a.mo89475r();
        listMo89475r.getClass();
        return listMo89475r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public List<ReceiverParameterDescriptor> mo89341x0() {
        List<ReceiverParameterDescriptor> listMo89341x0 = this.f66999a.mo89341x0();
        listMo89341x0.getClass();
        return listMo89341x0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y */
    public boolean mo89511y() {
        return this.f66999a.mo89511y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y0 */
    public boolean mo89512y0() {
        return this.f66999a.mo89512y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: z */
    public FieldDescriptor mo89476z() {
        return this.f66999a.mo89476z();
    }
}
