package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BuiltInsResourceLoader f66059a = new BuiltInsResourceLoader();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    @NotNull
    /* JADX INFO: renamed from: a */
    public PackageFragmentProvider mo88133a(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        iterable.getClass();
        platformDependentDeclarationFilter.getClass();
        additionalClassPartsProvider.getClass();
        return m92282b(storageManager, moduleDescriptor, StandardNames.f63808J, iterable, platformDependentDeclarationFilter, additionalClassPartsProvider, z, new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f66059a));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final PackageFragmentProvider m92282b(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Set<FqName> set, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z, @NotNull Function1<? super String, ? extends InputStream> function1) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        set.getClass();
        iterable.getClass();
        platformDependentDeclarationFilter.getClass();
        additionalClassPartsProvider.getClass();
        function1.getClass();
        ArrayList arrayList = new ArrayList();
        for (FqName fqName : set) {
            InputStream inputStreamInvoke = function1.invoke(BuiltInSerializerProtocol.INSTANCE.m92280r(fqName));
            BuiltInsPackageFragmentImpl builtInsPackageFragmentImplM92283a = inputStreamInvoke != null ? BuiltInsPackageFragmentImpl.Companion.m92283a(fqName, storageManager, moduleDescriptor, inputStreamInvoke, z) : null;
            if (builtInsPackageFragmentImplM92283a != null) {
                arrayList.add(builtInsPackageFragmentImplM92283a);
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager, moduleDescriptor);
        DeserializationConfiguration.Default r3 = DeserializationConfiguration.Default.INSTANCE;
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.INSTANCE;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r7 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter errorReporter = ErrorReporter.f66016a;
        errorReporter.getClass();
        DeserializationComponents deserializationComponents = new DeserializationComponents(storageManager, moduleDescriptor, r3, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl, r7, errorReporter, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, iterable, notFoundClasses, ContractDeserializer.Companion.m92148a(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.m92104e(), null, new SamConversionResolverImpl(storageManager, CollectionsKt.emptyList()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).mo92191E0(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }
}
