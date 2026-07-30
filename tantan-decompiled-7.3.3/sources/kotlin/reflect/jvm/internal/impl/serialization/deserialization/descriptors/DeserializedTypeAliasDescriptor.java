package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ProtoBuf.TypeAlias f66820k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final NameResolver f66821l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final TypeTable f66822m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final VersionRequirementTable f66823n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final DeserializedContainerSource f66824o;

    /* JADX INFO: renamed from: p */
    public SimpleType f66825p;

    /* JADX INFO: renamed from: q */
    public SimpleType f66826q;

    /* JADX INFO: renamed from: r */
    public List<? extends TypeParameterDescriptor> f66827r;

    /* JADX INFO: renamed from: s */
    public SimpleType f66828s;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeAliasDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull DescriptorVisibility descriptorVisibility, @NotNull ProtoBuf.TypeAlias typeAlias, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource) {
        storageManager.getClass();
        declarationDescriptor.getClass();
        annotations.getClass();
        name.getClass();
        descriptorVisibility.getClass();
        typeAlias.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        SourceElement sourceElement = SourceElement.f64737a;
        sourceElement.getClass();
        super(storageManager, declarationDescriptor, annotations, name, sourceElement, descriptorVisibility);
        this.f66820k = typeAlias;
        this.f66821l = nameResolver;
        this.f66822m = typeTable;
        this.f66823n = versionRequirementTable;
        this.f66824o = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public List<TypeParameterDescriptor> mo89564K0() {
        List list = this.f66827r;
        if (list != null) {
            return list;
        }
        Intrinsics.m88391r("typeConstructorParameters");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.TypeAlias mo93177G() {
        return this.f66820k;
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public VersionRequirementTable m93319O0() {
        return this.f66823n;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m93320P0(@NotNull List<? extends TypeParameterDescriptor> list, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        list.getClass();
        simpleType.getClass();
        simpleType2.getClass();
        m89565L0(list);
        this.f66825p = simpleType;
        this.f66826q = simpleType2;
        this.f66827r = TypeParameterUtilsKt.m89500g(this);
        this.f66828s = m89561F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        if (typeSubstitutor.m93670l()) {
            return this;
        }
        StorageManager storageManagerM89566Z = m89566Z();
        DeclarationDescriptor declarationDescriptorMo89190b = mo89190b();
        declarationDescriptorMo89190b.getClass();
        Annotations annotations = getAnnotations();
        annotations.getClass();
        Name name = getName();
        name.getClass();
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManagerM89566Z, declarationDescriptorMo89190b, annotations, name, getVisibility(), mo93177G(), mo93178W(), mo93183w(), m93319O0(), mo93179X());
        List<TypeParameterDescriptor> listMo89200p = mo89200p();
        SimpleType simpleTypeMo89489v0 = mo89489v0();
        Variance variance = Variance.INVARIANT;
        KotlinType kotlinTypeM93672o = typeSubstitutor.m93672o(simpleTypeMo89489v0, variance);
        kotlinTypeM93672o.getClass();
        SimpleType simpleTypeM93651a = TypeSubstitutionKt.m93651a(kotlinTypeM93672o);
        KotlinType kotlinTypeM93672o2 = typeSubstitutor.m93672o(mo89487V(), variance);
        kotlinTypeM93672o2.getClass();
        deserializedTypeAliasDescriptor.m93320P0(listMo89200p, simpleTypeM93651a, TypeSubstitutionKt.m93651a(kotlinTypeM93672o2));
        return deserializedTypeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @NotNull
    /* JADX INFO: renamed from: V */
    public SimpleType mo89487V() {
        SimpleType simpleType = this.f66826q;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m88391r("expandedType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: W */
    public NameResolver mo93178W() {
        return this.f66821l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* JADX INFO: renamed from: X */
    public DeserializedContainerSource mo93179X() {
        return this.f66824o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @Nullable
    /* JADX INFO: renamed from: j */
    public ClassDescriptor mo89488j() {
        if (KotlinTypeKt.m93535a(mo89487V())) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo89207e = mo89487V().mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo89207e;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo89349o() {
        SimpleType simpleType = this.f66828s;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m88391r("defaultTypeImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @NotNull
    /* JADX INFO: renamed from: v0 */
    public SimpleType mo89489v0() {
        SimpleType simpleType = this.f66825p;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m88391r("underlyingType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: w */
    public TypeTable mo93183w() {
        return this.f66822m;
    }
}
