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
    public final StorageManager f64806a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaClassFinder f64807b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinClassFinder f64808c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final DeserializedDescriptorResolver f64809d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final SignaturePropagator f64810e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final ErrorReporter f64811f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final JavaResolverCache f64812g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final JavaPropertyInitializerEvaluator f64813h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final SamConversionResolver f64814i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final JavaSourceElementFactory f64815j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ModuleClassResolver f64816k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final PackagePartProvider f64817l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final SupertypeLoopChecker f64818m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LookupTracker f64819n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final ModuleDescriptor f64820o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final ReflectionTypes f64821p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final AnnotationTypeQualifierResolver f64822q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final SignatureEnhancement f64823r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final JavaClassesTracker f64824s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final JavaResolverSettings f64825t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final NewKotlinTypeChecker f64826u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final JavaTypeEnhancementState f64827v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final JavaModuleAnnotationsProvider f64828w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final SyntheticJavaPartsProvider f64829x;

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
        this.f64806a = storageManager;
        this.f64807b = javaClassFinder;
        this.f64808c = kotlinClassFinder;
        this.f64809d = deserializedDescriptorResolver;
        this.f64810e = signaturePropagator;
        this.f64811f = errorReporter;
        this.f64812g = javaResolverCache;
        this.f64813h = javaPropertyInitializerEvaluator;
        this.f64814i = samConversionResolver;
        this.f64815j = javaSourceElementFactory;
        this.f64816k = moduleClassResolver;
        this.f64817l = packagePartProvider;
        this.f64818m = supertypeLoopChecker;
        this.f64819n = lookupTracker;
        this.f64820o = moduleDescriptor;
        this.f64821p = reflectionTypes;
        this.f64822q = annotationTypeQualifierResolver;
        this.f64823r = signatureEnhancement;
        this.f64824s = javaClassesTracker;
        this.f64825t = javaResolverSettings;
        this.f64826u = newKotlinTypeChecker;
        this.f64827v = javaTypeEnhancementState;
        this.f64828w = javaModuleAnnotationsProvider;
        this.f64829x = syntheticJavaPartsProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AnnotationTypeQualifierResolver m89582a() {
        return this.f64822q;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final DeserializedDescriptorResolver m89583b() {
        return this.f64809d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ErrorReporter m89584c() {
        return this.f64811f;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final JavaClassFinder m89585d() {
        return this.f64807b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final JavaClassesTracker m89586e() {
        return this.f64824s;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final JavaModuleAnnotationsProvider m89587f() {
        return this.f64828w;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JavaPropertyInitializerEvaluator m89588g() {
        return this.f64813h;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final JavaResolverCache m89589h() {
        return this.f64812g;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final JavaTypeEnhancementState m89590i() {
        return this.f64827v;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final KotlinClassFinder m89591j() {
        return this.f64808c;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final NewKotlinTypeChecker m89592k() {
        return this.f64826u;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final LookupTracker m89593l() {
        return this.f64819n;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ModuleDescriptor m89594m() {
        return this.f64820o;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final ModuleClassResolver m89595n() {
        return this.f64816k;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final PackagePartProvider m89596o() {
        return this.f64817l;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ReflectionTypes m89597p() {
        return this.f64821p;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final JavaResolverSettings m89598q() {
        return this.f64825t;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final SignatureEnhancement m89599r() {
        return this.f64823r;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final SignaturePropagator m89600s() {
        return this.f64810e;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final JavaSourceElementFactory m89601t() {
        return this.f64815j;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageManager m89602u() {
        return this.f64806a;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SupertypeLoopChecker m89603v() {
        return this.f64818m;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final SyntheticJavaPartsProvider m89604w() {
        return this.f64829x;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final JavaResolverComponents m89605x(@NotNull JavaResolverCache javaResolverCache) {
        javaResolverCache.getClass();
        return new JavaResolverComponents(this.f64806a, this.f64807b, this.f64808c, this.f64809d, this.f64810e, this.f64811f, javaResolverCache, this.f64813h, this.f64814i, this.f64815j, this.f64816k, this.f64817l, this.f64818m, this.f64819n, this.f64820o, this.f64821p, this.f64822q, this.f64823r, this.f64824s, this.f64825t, this.f64826u, this.f64827v, this.f64828w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i & 8388608) != 0 ? SyntheticJavaPartsProvider.Companion.m92022a() : syntheticJavaPartsProvider);
    }
}
