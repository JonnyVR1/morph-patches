package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* JADX INFO: renamed from: C */
    @NotNull
    public final ProtoBuf.Property f66810C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public final NameResolver f66811D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final TypeTable f66812E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final VersionRequirementTable f66813F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public final DeserializedContainerSource f66814G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPropertyDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull ProtoBuf.Property property, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z, name, kind, SourceElement.f64737a, z2, z3, z6, false, z4, z5);
        declarationDescriptor.getClass();
        annotations.getClass();
        modality.getClass();
        descriptorVisibility.getClass();
        name.getClass();
        kind.getClass();
        property.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        this.f66810C = property;
        this.f66811D = nameResolver;
        this.f66812E = typeTable;
        this.f66813F = versionRequirementTable;
        this.f66814G = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public PropertyDescriptorImpl mo89745J0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        modality.getClass();
        descriptorVisibility.getClass();
        kind.getClass();
        name.getClass();
        sourceElement.getClass();
        return new DeserializedPropertyDescriptor(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, mo89511y(), name, kind, mo89512y0(), isConst(), isExternal(), mo89513T(), mo89198n0(), mo93177G(), mo93178W(), mo93183w(), m93315a1(), mo93179X());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: W */
    public NameResolver mo93178W() {
        return this.f66811D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* JADX INFO: renamed from: X */
    public DeserializedContainerSource mo93179X() {
        return this.f66814G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Property mo93177G() {
        return this.f66810C;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public VersionRequirementTable m93315a1() {
        return this.f66813F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean boolMo91766d = Flags.f66020G.mo91766d(mo93177G().getFlags());
        boolMo91766d.getClass();
        return boolMo91766d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: w */
    public TypeTable mo93183w() {
        return this.f66812E;
    }
}
