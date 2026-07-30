package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C17015g7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final StorageManager f65958a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinMetadataFinder f65959b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ModuleDescriptor f65960c;

    /* JADX INFO: renamed from: d */
    public DeserializationComponents f65961d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> f65962e;

    public AbstractDeserializedPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull KotlinMetadataFinder kotlinMetadataFinder, @NotNull ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        kotlinMetadataFinder.getClass();
        moduleDescriptor.getClass();
        this.f65958a = storageManager;
        this.f65959b = kotlinMetadataFinder;
        this.f65960c = moduleDescriptor;
        this.f65962e = storageManager.mo92444c(new C17015g7(this));
    }

    /* JADX INFO: renamed from: f */
    public static final PackageFragmentDescriptor m92118f(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider, FqName fqName) {
        fqName.getClass();
        DeserializedPackageFragment deserializedPackageFragmentMo88430e = abstractDeserializedPackageFragmentProvider.mo88430e(fqName);
        if (deserializedPackageFragmentMo88430e == null) {
            return null;
        }
        deserializedPackageFragmentMo88430e.mo92191E0(abstractDeserializedPackageFragmentProvider.m92119g());
        return deserializedPackageFragmentMo88430e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<PackageFragmentDescriptor> mo88563a(@NotNull FqName fqName) {
        fqName.getClass();
        return CollectionsKt.listOfNotNull(this.f65962e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: b */
    public void mo88569b(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(collection, this.f65962e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: c */
    public boolean mo88570c(@NotNull FqName fqName) {
        fqName.getClass();
        return (this.f65962e.mo92473e(fqName) ? this.f65962e.invoke(fqName) : mo88430e(fqName)) == null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract DeserializedPackageFragment mo88430e(@NotNull FqName fqName);

    @NotNull
    /* JADX INFO: renamed from: g */
    public final DeserializationComponents m92119g() {
        DeserializationComponents deserializationComponents = this.f65961d;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.m87502r("components");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final KotlinMetadataFinder m92120h() {
        return this.f65959b;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ModuleDescriptor m92121i() {
        return this.f65960c;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageManager m92122j() {
        return this.f65958a;
    }

    /* JADX INFO: renamed from: k */
    public final void m92123k(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.f65961d = deserializationComponents;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* JADX INFO: renamed from: m */
    public Collection<FqName> mo88564m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return SetsKt.emptySet();
    }
}
