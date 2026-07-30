package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedSimpleFunctionDescriptor extends SimpleFunctionDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* JADX INFO: renamed from: E */
    @NotNull
    public final ProtoBuf.Function f66815E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final NameResolver f66816F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final TypeTable f66817G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final VersionRequirementTable f66818H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public final DeserializedContainerSource f66819I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedSimpleFunctionDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull ProtoBuf.Function function, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable SourceElement sourceElement) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement == null ? SourceElement.f64737a : sourceElement);
        declarationDescriptor.getClass();
        annotations.getClass();
        name.getClass();
        kind.getClass();
        function.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        this.f66815E = function;
        this.f66816F = nameResolver;
        this.f66817G = typeTable;
        this.f66818H = versionRequirementTable;
        this.f66819I = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public FunctionDescriptorImpl mo89212E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        Name name2;
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            Name name3 = getName();
            name3.getClass();
            name2 = name3;
        } else {
            name2 = name;
        }
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name2, kind, mo93177G(), mo93178W(), mo93183w(), m93317j1(), mo93179X(), sourceElement);
        deserializedSimpleFunctionDescriptor.mo89641R0(mo89633J0());
        return deserializedSimpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: W */
    public NameResolver mo93178W() {
        return this.f66816F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* JADX INFO: renamed from: X */
    public DeserializedContainerSource mo93179X() {
        return this.f66819I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Function mo93177G() {
        return this.f66815E;
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public VersionRequirementTable m93317j1() {
        return this.f66818H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: w */
    public TypeTable mo93183w() {
        return this.f66817G;
    }

    public /* synthetic */ DeserializedSimpleFunctionDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, ProtoBuf.Function function, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, function, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i & 1024) != 0 ? null : sourceElement);
    }
}
