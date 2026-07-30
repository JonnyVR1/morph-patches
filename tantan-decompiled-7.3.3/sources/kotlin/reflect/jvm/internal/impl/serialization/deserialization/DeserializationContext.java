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
    public final DeserializationComponents f66673a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NameResolver f66674b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DeclarationDescriptor f66675c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TypeTable f66676d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final VersionRequirementTable f66677e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final BinaryVersion f66678f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final DeserializedContainerSource f66679g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final TypeDeserializer f66680h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MemberDeserializer f66681i;

    public DeserializationContext(@NotNull DeserializationComponents deserializationComponents, @NotNull NameResolver nameResolver, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> list) {
        String strMo91217a;
        deserializationComponents.getClass();
        nameResolver.getClass();
        declarationDescriptor.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        binaryVersion.getClass();
        list.getClass();
        this.f66673a = deserializationComponents;
        this.f66674b = nameResolver;
        this.f66675c = declarationDescriptor;
        this.f66676d = typeTable;
        this.f66677e = versionRequirementTable;
        this.f66678f = binaryVersion;
        this.f66679g = deserializedContainerSource;
        this.f66680h = new TypeDeserializer(this, typeDeserializer, list, "Deserializer for \"" + declarationDescriptor.getName() + '\"', (deserializedContainerSource == null || (strMo91217a = deserializedContainerSource.mo91217a()) == null) ? "[container not found]" : strMo91217a);
        this.f66681i = new MemberDeserializer(this);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DeserializationContext m93069b(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i, Object obj) {
        if ((i & 4) != 0) {
            nameResolver = deserializationContext.f66674b;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i & 8) != 0) {
            typeTable = deserializationContext.f66676d;
        }
        TypeTable typeTable2 = typeTable;
        if ((i & 16) != 0) {
            versionRequirementTable = deserializationContext.f66677e;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i & 32) != 0) {
            binaryVersion = deserializationContext.f66678f;
        }
        return deserializationContext.m93070a(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DeserializationContext m93070a(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<ProtoBuf.TypeParameter> list, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion) {
        declarationDescriptor.getClass();
        list.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        binaryVersion.getClass();
        DeserializationComponents deserializationComponents = this.f66673a;
        if (!VersionSpecificBehaviorKt.m91826b(binaryVersion)) {
            versionRequirementTable = this.f66677e;
        }
        return new DeserializationContext(deserializationComponents, nameResolver, declarationDescriptor, typeTable, versionRequirementTable, binaryVersion, this.f66679g, this.f66680h, list);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final DeserializationComponents m93071c() {
        return this.f66673a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final DeserializedContainerSource m93072d() {
        return this.f66679g;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final DeclarationDescriptor m93073e() {
        return this.f66675c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final MemberDeserializer m93074f() {
        return this.f66681i;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final NameResolver m93075g() {
        return this.f66674b;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final StorageManager m93076h() {
        return this.f66673a.m93060u();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TypeDeserializer m93077i() {
        return this.f66680h;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TypeTable m93078j() {
        return this.f66676d;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VersionRequirementTable m93079k() {
        return this.f66677e;
    }
}
