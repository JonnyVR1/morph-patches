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
import p153l.C15939b7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final StorageManager f66632a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinMetadataFinder f66633b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ModuleDescriptor f66634c;

    /* JADX INFO: renamed from: d */
    public DeserializationComponents f66635d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> f66636e;

    public AbstractDeserializedPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull KotlinMetadataFinder kotlinMetadataFinder, @NotNull ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        kotlinMetadataFinder.getClass();
        moduleDescriptor.getClass();
        this.f66632a = storageManager;
        this.f66633b = kotlinMetadataFinder;
        this.f66634c = moduleDescriptor;
        this.f66636e = storageManager.mo93335c(new C15939b7(this));
    }

    /* JADX INFO: renamed from: f */
    public static final PackageFragmentDescriptor m93009f(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider, FqName fqName) {
        fqName.getClass();
        DeserializedPackageFragment deserializedPackageFragmentMo89321e = abstractDeserializedPackageFragmentProvider.mo89321e(fqName);
        if (deserializedPackageFragmentMo89321e == null) {
            return null;
        }
        deserializedPackageFragmentMo89321e.mo93082E0(abstractDeserializedPackageFragmentProvider.m93010g());
        return deserializedPackageFragmentMo89321e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<PackageFragmentDescriptor> mo89454a(@NotNull FqName fqName) {
        fqName.getClass();
        return CollectionsKt.listOfNotNull(this.f66636e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: b */
    public void mo89460b(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(collection, this.f66636e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: c */
    public boolean mo89461c(@NotNull FqName fqName) {
        fqName.getClass();
        return (this.f66636e.mo93364e(fqName) ? this.f66636e.invoke(fqName) : mo89321e(fqName)) == null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract DeserializedPackageFragment mo89321e(@NotNull FqName fqName);

    @NotNull
    /* JADX INFO: renamed from: g */
    public final DeserializationComponents m93010g() {
        DeserializationComponents deserializationComponents = this.f66635d;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.m88391r("components");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final KotlinMetadataFinder m93011h() {
        return this.f66633b;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ModuleDescriptor m93012i() {
        return this.f66634c;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageManager m93013j() {
        return this.f66632a;
    }

    /* JADX INFO: renamed from: k */
    public final void m93014k(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.f66635d = deserializationComponents;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* JADX INFO: renamed from: m */
    public Collection<FqName> mo89455m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return SetsKt.emptySet();
    }
}
