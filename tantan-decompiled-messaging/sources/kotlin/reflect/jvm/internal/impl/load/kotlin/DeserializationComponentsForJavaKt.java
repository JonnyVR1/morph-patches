package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationComponentsForJavaKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final DeserializationComponentsForJava m90299a(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull NotFoundClasses notFoundClasses, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ErrorReporter errorReporter, @NotNull MetadataVersion metadataVersion) {
        moduleDescriptor.getClass();
        storageManager.getClass();
        notFoundClasses.getClass();
        lazyJavaPackageFragmentProvider.getClass();
        kotlinClassFinder.getClass();
        deserializedDescriptorResolver.getClass();
        errorReporter.getClass();
        metadataVersion.getClass();
        return new DeserializationComponentsForJava(storageManager, moduleDescriptor, DeserializationConfiguration.Default.INSTANCE, new JavaClassDataFinder(kotlinClassFinder, deserializedDescriptorResolver), BinaryClassAnnotationAndConstantLoaderImplKt.m90191a(moduleDescriptor, notFoundClasses, storageManager, kotlinClassFinder, metadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, LookupTracker.DO_NOTHING.INSTANCE, ContractDeserializer.Companion.m92148a(), NewKotlinTypeChecker.Companion.m92940a(), new TypeAttributeTranslators(CollectionsKt.listOf(DefaultTypeAttributeTranslator.INSTANCE)));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final LazyJavaPackageFragmentProvider m90300b(@NotNull JavaClassFinder javaClassFinder, @NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull NotFoundClasses notFoundClasses, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ErrorReporter errorReporter, @NotNull JavaSourceElementFactory javaSourceElementFactory, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider) {
        javaClassFinder.getClass();
        moduleDescriptor.getClass();
        storageManager.getClass();
        notFoundClasses.getClass();
        kotlinClassFinder.getClass();
        deserializedDescriptorResolver.getClass();
        errorReporter.getClass();
        javaSourceElementFactory.getClass();
        moduleClassResolver.getClass();
        packagePartProvider.getClass();
        JavaTypeEnhancementState javaTypeEnhancementStateM89422b = JavaTypeEnhancementState.Companion.m89422b(new KotlinVersion(1, 9));
        SignaturePropagator signaturePropagator = SignaturePropagator.f64787a;
        signaturePropagator.getClass();
        JavaResolverCache javaResolverCache = JavaResolverCache.f64782a;
        javaResolverCache.getClass();
        JavaPropertyInitializerEvaluator.DoNothing doNothing = JavaPropertyInitializerEvaluator.DoNothing.INSTANCE;
        SamConversionResolverImpl samConversionResolverImpl = new SamConversionResolverImpl(storageManager, CollectionsKt.emptyList());
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.INSTANCE;
        ReflectionTypes reflectionTypes = new ReflectionTypes(moduleDescriptor, notFoundClasses);
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(javaTypeEnhancementStateM89422b);
        JavaResolverSettings.Default r8 = JavaResolverSettings.Default.INSTANCE;
        return new LazyJavaPackageFragmentProvider(new JavaResolverComponents(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, doNothing, samConversionResolverImpl, javaSourceElementFactory, moduleClassResolver, packagePartProvider, empty, do_nothing, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, new SignatureEnhancement(new JavaTypeEnhancement(r8)), JavaClassesTracker.Default.INSTANCE, r8, NewKotlinTypeChecker.Companion.m92940a(), javaTypeEnhancementStateM89422b, new JavaModuleAnnotationsProvider() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1
            @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider
            /* JADX INFO: renamed from: a */
            public List<JavaAnnotation> mo89405a(ClassId classId) {
                classId.getClass();
                return null;
            }
        }, null, 8388608, null));
    }
}
