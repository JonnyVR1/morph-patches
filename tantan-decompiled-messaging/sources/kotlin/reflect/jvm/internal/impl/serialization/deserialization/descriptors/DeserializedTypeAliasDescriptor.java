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
    public final ProtoBuf.TypeAlias f66146k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final NameResolver f66147l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final TypeTable f66148m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final VersionRequirementTable f66149n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final DeserializedContainerSource f66150o;

    /* JADX INFO: renamed from: p */
    public SimpleType f66151p;

    /* JADX INFO: renamed from: q */
    public SimpleType f66152q;

    /* JADX INFO: renamed from: r */
    public List<? extends TypeParameterDescriptor> f66153r;

    /* JADX INFO: renamed from: s */
    public SimpleType f66154s;

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
        SourceElement sourceElement = SourceElement.f64063a;
        sourceElement.getClass();
        super(storageManager, declarationDescriptor, annotations, name, sourceElement, descriptorVisibility);
        this.f66146k = typeAlias;
        this.f66147l = nameResolver;
        this.f66148m = typeTable;
        this.f66149n = versionRequirementTable;
        this.f66150o = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public List<TypeParameterDescriptor> mo88673K0() {
        List list = this.f66153r;
        if (list != null) {
            return list;
        }
        Intrinsics.m87502r("typeConstructorParameters");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.TypeAlias mo92286G() {
        return this.f66146k;
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public VersionRequirementTable m92428O0() {
        return this.f66149n;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m92429P0(@NotNull List<? extends TypeParameterDescriptor> list, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        list.getClass();
        simpleType.getClass();
        simpleType2.getClass();
        m88674L0(list);
        this.f66151p = simpleType;
        this.f66152q = simpleType2;
        this.f66153r = TypeParameterUtilsKt.m88609g(this);
        this.f66154s = m88670F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        if (typeSubstitutor.m92779l()) {
            return this;
        }
        StorageManager storageManagerM88675Z = m88675Z();
        DeclarationDescriptor declarationDescriptorMo88299b = mo88299b();
        declarationDescriptorMo88299b.getClass();
        Annotations annotations = getAnnotations();
        annotations.getClass();
        Name name = getName();
        name.getClass();
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManagerM88675Z, declarationDescriptorMo88299b, annotations, name, getVisibility(), mo92286G(), mo92287W(), mo92292w(), m92428O0(), mo92288X());
        List<TypeParameterDescriptor> listMo88309p = mo88309p();
        SimpleType simpleTypeMo88598v0 = mo88598v0();
        Variance variance = Variance.INVARIANT;
        KotlinType kotlinTypeM92781o = typeSubstitutor.m92781o(simpleTypeMo88598v0, variance);
        kotlinTypeM92781o.getClass();
        SimpleType simpleTypeM92760a = TypeSubstitutionKt.m92760a(kotlinTypeM92781o);
        KotlinType kotlinTypeM92781o2 = typeSubstitutor.m92781o(mo88596V(), variance);
        kotlinTypeM92781o2.getClass();
        deserializedTypeAliasDescriptor.m92429P0(listMo88309p, simpleTypeM92760a, TypeSubstitutionKt.m92760a(kotlinTypeM92781o2));
        return deserializedTypeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @NotNull
    /* JADX INFO: renamed from: V */
    public SimpleType mo88596V() {
        SimpleType simpleType = this.f66152q;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m87502r("expandedType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: W */
    public NameResolver mo92287W() {
        return this.f66147l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* JADX INFO: renamed from: X */
    public DeserializedContainerSource mo92288X() {
        return this.f66150o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @Nullable
    /* JADX INFO: renamed from: j */
    public ClassDescriptor mo88597j() {
        if (KotlinTypeKt.m92644a(mo88596V())) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo88316e = mo88596V().mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo88316e;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo88458o() {
        SimpleType simpleType = this.f66154s;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m87502r("defaultTypeImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @NotNull
    /* JADX INFO: renamed from: v0 */
    public SimpleType mo88598v0() {
        SimpleType simpleType = this.f66151p;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m87502r("underlyingType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: w */
    public TypeTable mo92292w() {
        return this.f66148m;
    }
}
