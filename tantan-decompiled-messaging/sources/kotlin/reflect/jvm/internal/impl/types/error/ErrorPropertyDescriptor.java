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
    public final /* synthetic */ PropertyDescriptorImpl f66325a;

    public ErrorPropertyDescriptor() {
        ErrorUtils errorUtils = ErrorUtils.INSTANCE;
        PropertyDescriptorImpl propertyDescriptorImplM88846I0 = PropertyDescriptorImpl.m88846I0(errorUtils.m93009h(), Annotations.Companion.m88641b(), Modality.OPEN, DescriptorVisibilities.f64026e, true, Name.m91081n(ErrorEntity.ERROR_PROPERTY.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f64063a, false, false, false, false, false, false);
        propertyDescriptorImplM88846I0.m88864V0(errorUtils.m93012k(), CollectionsKt.emptyList(), null, null, CollectionsKt.emptyList());
        this.f66325a = propertyDescriptorImplM88846I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: J */
    public <V> V mo88443J(CallableDescriptor.UserDataKey<V> userDataKey) {
        return (V) this.f66325a.mo88443J(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: K */
    public FieldDescriptor mo88583K() {
        return this.f66325a.mo88583K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: N */
    public void mo88451N(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        collection.getClass();
        this.f66325a.mo88451N(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) this.f66325a.mo88464S(declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    /* JADX INFO: renamed from: T */
    public boolean mo88622T() {
        return this.f66325a.mo88622T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: Y */
    public ReceiverParameterDescriptor mo88444Y() {
        return this.f66325a.mo88444Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public PropertyDescriptor mo88445a() {
        PropertyDescriptor propertyDescriptorMo88445a = this.f66325a.mo88445a();
        propertyDescriptorMo88445a.getClass();
        return propertyDescriptorMo88445a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public CallableMemberDescriptor mo88452a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        PropertyDescriptor propertyDescriptorM88853H0 = this.f66325a.mo88452a0(declarationDescriptor, modality, descriptorVisibility, kind, z);
        propertyDescriptorM88853H0.getClass();
        return propertyDescriptorM88853H0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo88299b() {
        DeclarationDescriptor declarationDescriptorMo88299b = this.f66325a.mo88299b();
        declarationDescriptorMo88299b.getClass();
        return declarationDescriptorMo88299b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public ReceiverParameterDescriptor mo88446b0() {
        return this.f66325a.mo88446b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: c */
    public PropertyDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        return this.f66325a.mo88453c(typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends PropertyDescriptor> mo88447e() {
        Collection<? extends PropertyDescriptor> collectionMo88447e = this.f66325a.mo88447e();
        collectionMo88447e.getClass();
        return collectionMo88447e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return this.f66325a.mo88301e0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<ValueParameterDescriptor> mo88448g() {
        List<ValueParameterDescriptor> listMo88448g = this.f66325a.mo88448g();
        listMo88448g.getClass();
        return listMo88448g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f66325a.getAnnotations();
        annotations.getClass();
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertyGetterDescriptor getGetter() {
        return this.f66325a.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f66325a.getKind();
        kind.getClass();
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f66325a.getName();
        name.getClass();
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public KotlinType getReturnType() {
        return this.f66325a.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.f66325a.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement source = this.f66325a.getSource();
        source.getClass();
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType type = this.f66325a.getType();
        type.getClass();
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> typeParameters = this.f66325a.getTypeParameters();
        typeParameters.getClass();
        return typeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f66325a.getVisibility();
        visibility.getClass();
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo88303i() {
        Modality modalityMo88303i = this.f66325a.mo88303i();
        modalityMo88303i.getClass();
        return modalityMo88303i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f66325a.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f66325a.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo88449k0() {
        return this.f66325a.mo88449k0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        return this.f66325a.mo88307n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    @Nullable
    /* JADX INFO: renamed from: q0 */
    public ConstantValue<?> mo88619q0() {
        return this.f66325a.mo88619q0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    /* JADX INFO: renamed from: r */
    public List<PropertyAccessorDescriptor> mo88584r() {
        List<PropertyAccessorDescriptor> listMo88584r = this.f66325a.mo88584r();
        listMo88584r.getClass();
        return listMo88584r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public List<ReceiverParameterDescriptor> mo88450x0() {
        List<ReceiverParameterDescriptor> listMo88450x0 = this.f66325a.mo88450x0();
        listMo88450x0.getClass();
        return listMo88450x0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y */
    public boolean mo88620y() {
        return this.f66325a.mo88620y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y0 */
    public boolean mo88621y0() {
        return this.f66325a.mo88621y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* JADX INFO: renamed from: z */
    public FieldDescriptor mo88585z() {
        return this.f66325a.mo88585z();
    }
}
