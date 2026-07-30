package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
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
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaResolverComponents {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final StorageManager f65480a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaClassFinder f65481b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinClassFinder f65482c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final DeserializedDescriptorResolver f65483d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final SignaturePropagator f65484e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final ErrorReporter f65485f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final JavaResolverCache f65486g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final JavaPropertyInitializerEvaluator f65487h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final SamConversionResolver f65488i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final JavaSourceElementFactory f65489j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ModuleClassResolver f65490k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final PackagePartProvider f65491l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final SupertypeLoopChecker f65492m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LookupTracker f65493n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final ModuleDescriptor f65494o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final ReflectionTypes f65495p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final AnnotationTypeQualifierResolver f65496q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final SignatureEnhancement f65497r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final JavaClassesTracker f65498s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final JavaResolverSettings f65499t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final NewKotlinTypeChecker f65500u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final JavaTypeEnhancementState f65501v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final JavaModuleAnnotationsProvider f65502w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final SyntheticJavaPartsProvider f65503x;

    public JavaResolverComponents(@NotNull StorageManager storageManager, @NotNull JavaClassFinder javaClassFinder, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull SignaturePropagator signaturePropagator, @NotNull ErrorReporter errorReporter, @NotNull JavaResolverCache javaResolverCache, @NotNull JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, @NotNull SamConversionResolver samConversionResolver, @NotNull JavaSourceElementFactory javaSourceElementFactory, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull LookupTracker lookupTracker, @NotNull ModuleDescriptor moduleDescriptor, @NotNull ReflectionTypes reflectionTypes, @NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull SignatureEnhancement signatureEnhancement, @NotNull JavaClassesTracker javaClassesTracker, @NotNull JavaResolverSettings javaResolverSettings, @NotNull NewKotlinTypeChecker newKotlinTypeChecker, @NotNull JavaTypeEnhancementState javaTypeEnhancementState, @NotNull JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, @NotNull SyntheticJavaPartsProvider syntheticJavaPartsProvider) {
        storageManager.getClass();
        javaClassFinder.getClass();
        kotlinClassFinder.getClass();
        deserializedDescriptorResolver.getClass();
        signaturePropagator.getClass();
        errorReporter.getClass();
        javaResolverCache.getClass();
        javaPropertyInitializerEvaluator.getClass();
        samConversionResolver.getClass();
        javaSourceElementFactory.getClass();
        moduleClassResolver.getClass();
        packagePartProvider.getClass();
        supertypeLoopChecker.getClass();
        lookupTracker.getClass();
        moduleDescriptor.getClass();
        reflectionTypes.getClass();
        annotationTypeQualifierResolver.getClass();
        signatureEnhancement.getClass();
        javaClassesTracker.getClass();
        javaResolverSettings.getClass();
        newKotlinTypeChecker.getClass();
        javaTypeEnhancementState.getClass();
        javaModuleAnnotationsProvider.getClass();
        syntheticJavaPartsProvider.getClass();
        this.f65480a = storageManager;
        this.f65481b = javaClassFinder;
        this.f65482c = kotlinClassFinder;
        this.f65483d = deserializedDescriptorResolver;
        this.f65484e = signaturePropagator;
        this.f65485f = errorReporter;
        this.f65486g = javaResolverCache;
        this.f65487h = javaPropertyInitializerEvaluator;
        this.f65488i = samConversionResolver;
        this.f65489j = javaSourceElementFactory;
        this.f65490k = moduleClassResolver;
        this.f65491l = packagePartProvider;
        this.f65492m = supertypeLoopChecker;
        this.f65493n = lookupTracker;
        this.f65494o = moduleDescriptor;
        this.f65495p = reflectionTypes;
        this.f65496q = annotationTypeQualifierResolver;
        this.f65497r = signatureEnhancement;
        this.f65498s = javaClassesTracker;
        this.f65499t = javaResolverSettings;
        this.f65500u = newKotlinTypeChecker;
        this.f65501v = javaTypeEnhancementState;
        this.f65502w = javaModuleAnnotationsProvider;
        this.f65503x = syntheticJavaPartsProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AnnotationTypeQualifierResolver m90473a() {
        return this.f65496q;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final DeserializedDescriptorResolver m90474b() {
        return this.f65483d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ErrorReporter m90475c() {
        return this.f65485f;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final JavaClassFinder m90476d() {
        return this.f65481b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final JavaClassesTracker m90477e() {
        return this.f65498s;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final JavaModuleAnnotationsProvider m90478f() {
        return this.f65502w;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JavaPropertyInitializerEvaluator m90479g() {
        return this.f65487h;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final JavaResolverCache m90480h() {
        return this.f65486g;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final JavaTypeEnhancementState m90481i() {
        return this.f65501v;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final KotlinClassFinder m90482j() {
        return this.f65482c;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final NewKotlinTypeChecker m90483k() {
        return this.f65500u;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final LookupTracker m90484l() {
        return this.f65493n;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ModuleDescriptor m90485m() {
        return this.f65494o;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final ModuleClassResolver m90486n() {
        return this.f65490k;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final PackagePartProvider m90487o() {
        return this.f65491l;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ReflectionTypes m90488p() {
        return this.f65495p;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final JavaResolverSettings m90489q() {
        return this.f65499t;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final SignatureEnhancement m90490r() {
        return this.f65497r;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final SignaturePropagator m90491s() {
        return this.f65484e;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final JavaSourceElementFactory m90492t() {
        return this.f65489j;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageManager m90493u() {
        return this.f65480a;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SupertypeLoopChecker m90494v() {
        return this.f65492m;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final SyntheticJavaPartsProvider m90495w() {
        return this.f65503x;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final JavaResolverComponents m90496x(@NotNull JavaResolverCache javaResolverCache) {
        javaResolverCache.getClass();
        return new JavaResolverComponents(this.f65480a, this.f65481b, this.f65482c, this.f65483d, this.f65484e, this.f65485f, javaResolverCache, this.f65487h, this.f65488i, this.f65489j, this.f65490k, this.f65491l, this.f65492m, this.f65493n, this.f65494o, this.f65495p, this.f65496q, this.f65497r, this.f65498s, this.f65499t, this.f65500u, this.f65501v, this.f65502w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i & 8388608) != 0 ? SyntheticJavaPartsProvider.Companion.m92913a() : syntheticJavaPartsProvider);
    }
}
