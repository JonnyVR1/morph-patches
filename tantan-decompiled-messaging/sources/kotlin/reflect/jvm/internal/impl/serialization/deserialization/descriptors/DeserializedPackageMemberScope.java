package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class DeserializedPackageMemberScope extends DeserializedMemberScope {

    /* JADX INFO: renamed from: f */
    @NotNull
    public final PackageFragmentDescriptor f66133f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final String f66134g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final FqName f66135h;

    public DeserializedPackageMemberScope(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull ProtoBuf.Package r9, @NotNull NameResolver nameResolver, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource, @NotNull DeserializationComponents deserializationComponents, @NotNull String str, @NotNull Function0<? extends Collection<Name>> function0) {
        packageFragmentDescriptor.getClass();
        r9.getClass();
        nameResolver.getClass();
        binaryVersion.getClass();
        deserializationComponents.getClass();
        str.getClass();
        function0.getClass();
        ProtoBuf.TypeTable typeTable = r9.getTypeTable();
        typeTable.getClass();
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r9.getVersionRequirementTable();
        versionRequirementTable.getClass();
        DeserializationContext deserializationContextM92149a = deserializationComponents.m92149a(packageFragmentDescriptor, nameResolver, typeTable2, companion.m90932a(versionRequirementTable), binaryVersion, deserializedContainerSource);
        List<ProtoBuf.Function> functionList = r9.getFunctionList();
        functionList.getClass();
        List<ProtoBuf.Property> propertyList = r9.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf.TypeAlias> typeAliasList = r9.getTypeAliasList();
        typeAliasList.getClass();
        super(deserializationContextM92149a, functionList, propertyList, typeAliasList, function0);
        this.f66133f = packageFragmentDescriptor;
        this.f66134g = str;
        this.f66135h = packageFragmentDescriptor.mo88562d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        Collection<DeclarationDescriptor> collectionM92356m = m92356m(descriptorKindFilter, function1, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<ClassDescriptorFactory> iterableM92160l = m92359s().m92180c().m92160l();
        ArrayList arrayList = new ArrayList();
        Iterator<ClassDescriptorFactory> it = iterableM92160l.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, it.next().mo88283c(this.f66135h));
        }
        return CollectionsKt.plus((Collection) collectionM92356m, (Iterable) arrayList);
    }

    /* JADX INFO: renamed from: C */
    public void m92422C(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        UtilsKt.m89075b(m92359s().m92180c().m92164p(), lookupLocation, this.f66133f, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m92422C(name, lookupLocation);
        return super.mo89642f(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: j */
    public void mo92333j(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1) {
        collection.getClass();
        function1.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    /* JADX INFO: renamed from: p */
    public ClassId mo92336p(@NotNull Name name) {
        name.getClass();
        return new ClassId(this.f66135h, name);
    }

    @NotNull
    public String toString() {
        return this.f66134g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @Nullable
    /* JADX INFO: renamed from: v */
    public Set<Name> mo92337v() {
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    /* JADX INFO: renamed from: w */
    public Set<Name> mo92338w() {
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    /* JADX INFO: renamed from: x */
    public Set<Name> mo92339x() {
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: z */
    public boolean mo92363z(@NotNull Name name) {
        name.getClass();
        if (super.mo92363z(name)) {
            return true;
        }
        Iterable<ClassDescriptorFactory> iterableM92160l = m92359s().m92180c().m92160l();
        if ((iterableM92160l instanceof Collection) && ((Collection) iterableM92160l).isEmpty()) {
            return false;
        }
        Iterator<ClassDescriptorFactory> it = iterableM92160l.iterator();
        while (it.hasNext()) {
            if (it.next().mo88281a(this.f66135h, name)) {
                return true;
            }
        }
        return false;
    }
}
