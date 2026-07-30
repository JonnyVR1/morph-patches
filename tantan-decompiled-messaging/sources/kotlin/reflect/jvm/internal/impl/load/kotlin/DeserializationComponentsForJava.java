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
    public final DeserializationComponents f65034a;

    public static final class Companion {

        public static final class ModuleData {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final DeserializationComponentsForJava f65035a;

            /* JADX INFO: renamed from: b */
            @NotNull
            public final DeserializedDescriptorResolver f65036b;

            public ModuleData(@NotNull DeserializationComponentsForJava deserializationComponentsForJava, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
                deserializationComponentsForJava.getClass();
                deserializedDescriptorResolver.getClass();
                this.f65035a = deserializationComponentsForJava;
                this.f65036b = deserializedDescriptorResolver;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final DeserializationComponentsForJava m90297a() {
                return this.f65035a;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final DeserializedDescriptorResolver m90298b() {
                return this.f65036b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ModuleData m90296a(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull KotlinClassFinder kotlinClassFinder2, @NotNull JavaClassFinder javaClassFinder, @NotNull String str, @NotNull ErrorReporter errorReporter, @NotNull JavaSourceElementFactory javaSourceElementFactory) {
            kotlinClassFinder.getClass();
            kotlinClassFinder2.getClass();
            javaClassFinder.getClass();
            str.getClass();
            errorReporter.getClass();
            javaSourceElementFactory.getClass();
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            Name nameM91081n = Name.m91081n("<" + str + '>');
            nameM91081n.getClass();
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(nameM91081n, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.m88210F0(moduleDescriptorImpl);
            jvmBuiltIns.m88385N0(moduleDescriptorImpl, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProviderM90300b = DeserializationComponentsForJavaKt.m90300b(javaClassFinder, moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, singleModuleClassResolver, (512 & 512) != 0 ? PackagePartProvider.Empty.INSTANCE : null);
            DeserializationComponentsForJava deserializationComponentsForJavaM90299a = DeserializationComponentsForJavaKt.m90299a(moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, lazyJavaPackageFragmentProviderM90300b, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, MetadataVersion.INSTANCE);
            deserializedDescriptorResolver.m90316o(deserializationComponentsForJavaM90299a);
            JavaResolverCache javaResolverCache = JavaResolverCache.f64782a;
            javaResolverCache.getClass();
            JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProviderM90300b, javaResolverCache);
            singleModuleClassResolver.m89629c(javaDescriptorResolver);
            JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, kotlinClassFinder2, moduleDescriptorImpl, notFoundClasses, jvmBuiltIns.m88384M0(), jvmBuiltIns.m88384M0(), DeserializationConfiguration.Default.INSTANCE, NewKotlinTypeChecker.Companion.m92940a(), new SamConversionResolverImpl(lockBasedStorageManager, CollectionsKt.emptyList()));
            moduleDescriptorImpl.m88829P0(moduleDescriptorImpl);
            moduleDescriptorImpl.m88824H0(new CompositePackageFragmentProvider(CollectionsKt.listOf((Object[]) new PackageFragmentProviderOptimized[]{javaDescriptorResolver.m92012a(), jvmBuiltInsPackageFragmentProvider}), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl));
            return new ModuleData(deserializationComponentsForJavaM90299a, deserializedDescriptorResolver);
        }

        private Companion() {
        }
    }

    public DeserializationComponentsForJava(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull JavaClassDataFinder javaClassDataFinder, @NotNull BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull NotFoundClasses notFoundClasses, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull ContractDeserializer contractDeserializer, @NotNull NewKotlinTypeChecker newKotlinTypeChecker, @NotNull TypeAttributeTranslators typeAttributeTranslators) {
        PlatformDependentDeclarationFilter platformDependentDeclarationFilterM88384M0;
        AdditionalClassPartsProvider additionalClassPartsProviderM88384M0;
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
        KotlinBuiltIns kotlinBuiltInsMo88546f = moduleDescriptor.mo88546f();
        JvmBuiltIns jvmBuiltIns = kotlinBuiltInsMo88546f instanceof JvmBuiltIns ? (JvmBuiltIns) kotlinBuiltInsMo88546f : null;
        this.f65034a = new DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, LocalClassifierTypeSettings.Default.INSTANCE, errorReporter, lookupTracker, JavaFlexibleTypeDeserializer.INSTANCE, CollectionsKt.emptyList(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (additionalClassPartsProviderM88384M0 = jvmBuiltIns.m88384M0()) == null) ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProviderM88384M0, (jvmBuiltIns == null || (platformDependentDeclarationFilterM88384M0 = jvmBuiltIns.m88384M0()) == null) ? PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE : platformDependentDeclarationFilterM88384M0, JvmProtoBufUtil.INSTANCE.m91025a(), newKotlinTypeChecker, new SamConversionResolverImpl(storageManager, CollectionsKt.emptyList()), typeAttributeTranslators.m93016a(), JvmEnumEntriesDeserializationSupport.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DeserializationComponents m90295a() {
        return this.f65034a;
    }
}
