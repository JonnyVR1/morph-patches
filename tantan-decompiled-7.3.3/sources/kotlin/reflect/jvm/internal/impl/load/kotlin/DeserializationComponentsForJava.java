package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationComponentsForJava {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationComponents f65708a;

    public static final class Companion {

        public static final class ModuleData {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final DeserializationComponentsForJava f65709a;

            /* JADX INFO: renamed from: b */
            @NotNull
            public final DeserializedDescriptorResolver f65710b;

            public ModuleData(@NotNull DeserializationComponentsForJava deserializationComponentsForJava, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
                deserializationComponentsForJava.getClass();
                deserializedDescriptorResolver.getClass();
                this.f65709a = deserializationComponentsForJava;
                this.f65710b = deserializedDescriptorResolver;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final DeserializationComponentsForJava m91188a() {
                return this.f65709a;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final DeserializedDescriptorResolver m91189b() {
                return this.f65710b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ModuleData m91187a(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull KotlinClassFinder kotlinClassFinder2, @NotNull JavaClassFinder javaClassFinder, @NotNull String str, @NotNull ErrorReporter errorReporter, @NotNull JavaSourceElementFactory javaSourceElementFactory) {
            kotlinClassFinder.getClass();
            kotlinClassFinder2.getClass();
            javaClassFinder.getClass();
            str.getClass();
            errorReporter.getClass();
            javaSourceElementFactory.getClass();
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            Name nameM91972n = Name.m91972n("<" + str + '>');
            nameM91972n.getClass();
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(nameM91972n, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.m89101F0(moduleDescriptorImpl);
            jvmBuiltIns.m89276N0(moduleDescriptorImpl, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProviderM91191b = DeserializationComponentsForJavaKt.m91191b(javaClassFinder, moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, singleModuleClassResolver, (512 & 512) != 0 ? PackagePartProvider.Empty.INSTANCE : null);
            DeserializationComponentsForJava deserializationComponentsForJavaM91190a = DeserializationComponentsForJavaKt.m91190a(moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, lazyJavaPackageFragmentProviderM91191b, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, MetadataVersion.INSTANCE);
            deserializedDescriptorResolver.m91207o(deserializationComponentsForJavaM91190a);
            JavaResolverCache javaResolverCache = JavaResolverCache.f65456a;
            javaResolverCache.getClass();
            JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProviderM91191b, javaResolverCache);
            singleModuleClassResolver.m90520c(javaDescriptorResolver);
            JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, kotlinClassFinder2, moduleDescriptorImpl, notFoundClasses, jvmBuiltIns.m89275M0(), jvmBuiltIns.m89275M0(), DeserializationConfiguration.Default.INSTANCE, NewKotlinTypeChecker.Companion.m93831a(), new SamConversionResolverImpl(lockBasedStorageManager, CollectionsKt.emptyList()));
            moduleDescriptorImpl.m89720P0(moduleDescriptorImpl);
            moduleDescriptorImpl.m89715H0(new CompositePackageFragmentProvider(CollectionsKt.listOf((Object[]) new PackageFragmentProviderOptimized[]{javaDescriptorResolver.m92903a(), jvmBuiltInsPackageFragmentProvider}), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl));
            return new ModuleData(deserializationComponentsForJavaM91190a, deserializedDescriptorResolver);
        }

        private Companion() {
        }
    }

    public DeserializationComponentsForJava(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull JavaClassDataFinder javaClassDataFinder, @NotNull BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull NotFoundClasses notFoundClasses, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull ContractDeserializer contractDeserializer, @NotNull NewKotlinTypeChecker newKotlinTypeChecker, @NotNull TypeAttributeTranslators typeAttributeTranslators) {
        PlatformDependentDeclarationFilter platformDependentDeclarationFilterM89275M0;
        AdditionalClassPartsProvider additionalClassPartsProviderM89275M0;
        storageManager.getClass();
        moduleDescriptor.getClass();
        deserializationConfiguration.getClass();
        javaClassDataFinder.getClass();
        binaryClassAnnotationAndConstantLoaderImpl.getClass();
        lazyJavaPackageFragmentProvider.getClass();
        notFoundClasses.getClass();
        errorReporter.getClass();
        lookupTracker.getClass();
        contractDeserializer.getClass();
        newKotlinTypeChecker.getClass();
        typeAttributeTranslators.getClass();
        KotlinBuiltIns kotlinBuiltInsMo89437f = moduleDescriptor.mo89437f();
        JvmBuiltIns jvmBuiltIns = kotlinBuiltInsMo89437f instanceof JvmBuiltIns ? (JvmBuiltIns) kotlinBuiltInsMo89437f : null;
        this.f65708a = new DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, LocalClassifierTypeSettings.Default.INSTANCE, errorReporter, lookupTracker, JavaFlexibleTypeDeserializer.INSTANCE, CollectionsKt.emptyList(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (additionalClassPartsProviderM89275M0 = jvmBuiltIns.m89275M0()) == null) ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProviderM89275M0, (jvmBuiltIns == null || (platformDependentDeclarationFilterM89275M0 = jvmBuiltIns.m89275M0()) == null) ? PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE : platformDependentDeclarationFilterM89275M0, JvmProtoBufUtil.INSTANCE.m91916a(), newKotlinTypeChecker, new SamConversionResolverImpl(storageManager, CollectionsKt.emptyList()), typeAttributeTranslators.m93907a(), JvmEnumEntriesDeserializationSupport.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DeserializationComponents m91186a() {
        return this.f65708a;
    }
}
