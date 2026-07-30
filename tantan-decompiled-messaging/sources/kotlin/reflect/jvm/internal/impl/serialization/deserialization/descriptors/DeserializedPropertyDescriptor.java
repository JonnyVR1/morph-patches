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
    public final ProtoBuf.Property f66136C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public final NameResolver f66137D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final TypeTable f66138E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final VersionRequirementTable f66139F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public final DeserializedContainerSource f66140G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPropertyDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull ProtoBuf.Property property, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z, name, kind, SourceElement.f64063a, z2, z3, z6, false, z4, z5);
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
        this.f66136C = property;
        this.f66137D = nameResolver;
        this.f66138E = typeTable;
        this.f66139F = versionRequirementTable;
        this.f66140G = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public PropertyDescriptorImpl mo88854J0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        modality.getClass();
        descriptorVisibility.getClass();
        kind.getClass();
        name.getClass();
        sourceElement.getClass();
        return new DeserializedPropertyDescriptor(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, mo88620y(), name, kind, mo88621y0(), isConst(), isExternal(), mo88622T(), mo88307n0(), mo92286G(), mo92287W(), mo92292w(), m92424a1(), mo92288X());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: W */
    public NameResolver mo92287W() {
        return this.f66137D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* JADX INFO: renamed from: X */
    public DeserializedContainerSource mo92288X() {
        return this.f66140G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Property mo92286G() {
        return this.f66136C;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public VersionRequirementTable m92424a1() {
        return this.f66139F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean boolMo90875d = Flags.f65346G.mo90875d(mo92286G().getFlags());
        boolMo90875d.getClass();
        return boolMo90875d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: w */
    public TypeTable mo92292w() {
        return this.f66138E;
    }
}
