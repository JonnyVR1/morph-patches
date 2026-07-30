package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationContext {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationComponents f65999a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NameResolver f66000b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DeclarationDescriptor f66001c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TypeTable f66002d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final VersionRequirementTable f66003e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final BinaryVersion f66004f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final DeserializedContainerSource f66005g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final TypeDeserializer f66006h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MemberDeserializer f66007i;

    public DeserializationContext(@NotNull DeserializationComponents deserializationComponents, @NotNull NameResolver nameResolver, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> list) {
        String strMo90326a;
        deserializationComponents.getClass();
        nameResolver.getClass();
        declarationDescriptor.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        binaryVersion.getClass();
        list.getClass();
        this.f65999a = deserializationComponents;
        this.f66000b = nameResolver;
        this.f66001c = declarationDescriptor;
        this.f66002d = typeTable;
        this.f66003e = versionRequirementTable;
        this.f66004f = binaryVersion;
        this.f66005g = deserializedContainerSource;
        this.f66006h = new TypeDeserializer(this, typeDeserializer, list, "Deserializer for \"" + declarationDescriptor.getName() + '\"', (deserializedContainerSource == null || (strMo90326a = deserializedContainerSource.mo90326a()) == null) ? "[container not found]" : strMo90326a);
        this.f66007i = new MemberDeserializer(this);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DeserializationContext m92178b(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i, Object obj) {
        if ((i & 4) != 0) {
            nameResolver = deserializationContext.f66000b;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i & 8) != 0) {
            typeTable = deserializationContext.f66002d;
        }
        TypeTable typeTable2 = typeTable;
        if ((i & 16) != 0) {
            versionRequirementTable = deserializationContext.f66003e;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i & 32) != 0) {
            binaryVersion = deserializationContext.f66004f;
        }
        return deserializationContext.m92179a(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DeserializationContext m92179a(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<ProtoBuf.TypeParameter> list, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion) {
        declarationDescriptor.getClass();
        list.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        binaryVersion.getClass();
        DeserializationComponents deserializationComponents = this.f65999a;
        if (!VersionSpecificBehaviorKt.m90935b(binaryVersion)) {
            versionRequirementTable = this.f66003e;
        }
        return new DeserializationContext(deserializationComponents, nameResolver, declarationDescriptor, typeTable, versionRequirementTable, binaryVersion, this.f66005g, this.f66006h, list);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final DeserializationComponents m92180c() {
        return this.f65999a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final DeserializedContainerSource m92181d() {
        return this.f66005g;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final DeclarationDescriptor m92182e() {
        return this.f66001c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final MemberDeserializer m92183f() {
        return this.f66007i;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final NameResolver m92184g() {
        return this.f66000b;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final StorageManager m92185h() {
        return this.f65999a.m92169u();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TypeDeserializer m92186i() {
        return this.f66006h;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TypeTable m92187j() {
        return this.f66002d;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VersionRequirementTable m92188k() {
        return this.f66003e;
    }
}
