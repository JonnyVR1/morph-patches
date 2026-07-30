package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* JADX INFO: renamed from: F */
    @NotNull
    public final ProtoBuf.Constructor f66063F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final NameResolver f66064G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final TypeTable f66065H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public final VersionRequirementTable f66066I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public final DeserializedContainerSource f66067J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor, @Nullable ConstructorDescriptor constructorDescriptor, @NotNull Annotations annotations, boolean z, @NotNull CallableMemberDescriptor.Kind kind, @NotNull ProtoBuf.Constructor constructor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable SourceElement sourceElement) {
        super(classDescriptor, constructorDescriptor, annotations, z, kind, sourceElement == null ? SourceElement.f64063a : sourceElement);
        classDescriptor.getClass();
        annotations.getClass();
        kind.getClass();
        constructor.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        this.f66063F = constructor;
        this.f66064G = nameResolver;
        this.f66065H = typeTable;
        this.f66066I = versionRequirementTable;
        this.f66067J = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: W */
    public NameResolver mo92287W() {
        return this.f66064G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* JADX INFO: renamed from: X */
    public DeserializedContainerSource mo92288X() {
        return this.f66067J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public DeserializedClassConstructorDescriptor mo88321E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor((ClassDescriptor) declarationDescriptor, (ConstructorDescriptor) functionDescriptor, annotations, this.f64120E, kind, mo92286G(), mo92287W(), mo92292w(), m92291n1(), mo92288X(), sourceElement);
        deserializedClassConstructorDescriptor.mo88750R0(mo88742J0());
        return deserializedClassConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Constructor mo92286G() {
        return this.f66063F;
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public VersionRequirementTable m92291n1() {
        return this.f66066I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* JADX INFO: renamed from: u */
    public boolean mo88324u() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: w */
    public TypeTable mo92292w() {
        return this.f66065H;
    }

    public /* synthetic */ DeserializedClassConstructorDescriptor(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor constructor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, constructorDescriptor, annotations, z, kind, constructor, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i & 1024) != 0 ? null : sourceElement);
    }
}
