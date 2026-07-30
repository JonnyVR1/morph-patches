package p153l;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class bnf0 extends AbstractSignatureParts<AnnotationDescriptor> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Annotated f77471a;

    /* JADX INFO: renamed from: b */
    public final boolean f77472b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LazyJavaResolverContext f77473c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final AnnotationQualifierApplicabilityType f77474d;

    /* JADX INFO: renamed from: e */
    public final boolean f77475e;

    public bnf0(@Nullable Annotated annotated, boolean z, @NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        lazyJavaResolverContext.getClass();
        annotationQualifierApplicabilityType.getClass();
        this.f77471a = annotated;
        this.f77472b = z;
        this.f77473c = lazyJavaResolverContext;
        this.f77474d = annotationQualifierApplicabilityType;
        this.f77475e = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    /* JADX INFO: renamed from: A */
    public FqNameUnsafe mo90805A(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        ClassDescriptor classDescriptorM93686f = TypeUtils.m93686f((KotlinType) kotlinTypeMarker);
        if (classDescriptorM93686f != null) {
            return DescriptorUtils.m92663m(classDescriptorM93686f);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: D */
    public boolean mo90808D() {
        return this.f77475e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: F */
    public boolean mo90810F(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return KotlinBuiltIns.m89075f0((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: G */
    public boolean mo90811G() {
        return this.f77472b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: H */
    public boolean mo90812H(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return this.f77473c.m90508a().m90483k().mo93794a((KotlinType) kotlinTypeMarker, (KotlinType) kotlinTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: I */
    public boolean mo90813I(@NotNull TypeParameterMarker typeParameterMarker) {
        typeParameterMarker.getClass();
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: J */
    public boolean mo90814J(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KotlinType) kotlinTypeMarker).mo93516J0() instanceof NotNullTypeParameterImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public boolean mo90823o(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable KotlinTypeMarker kotlinTypeMarker) {
        annotationDescriptor.getClass();
        if ((annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).mo90410f()) {
            return true;
        }
        if ((annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && !mo90832x() && (((LazyJavaAnnotationDescriptor) annotationDescriptor).m90546l() || mo90828t() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return kotlinTypeMarker != null && KotlinBuiltIns.m89087r0((KotlinType) kotlinTypeMarker) && mo90824p().m90220p(annotationDescriptor) && !this.f77473c.m90508a().m90489q().mo90500d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public AnnotationTypeQualifierResolver mo90824p() {
        return this.f77473c.m90508a().m90473a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public KotlinType mo90833y(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return TypeWithEnhancementKt.m93706a((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public TypeSystemInferenceExtensionContext mo90809E() {
        return SimpleClassicTypeSystemContext.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: q */
    public Iterable<AnnotationDescriptor> mo90825q(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: s */
    public Iterable<AnnotationDescriptor> mo90827s() {
        Annotations annotations;
        Annotated annotated = this.f77471a;
        return (annotated == null || (annotations = annotated.getAnnotations()) == null) ? CollectionsKt.emptyList() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: t */
    public AnnotationQualifierApplicabilityType mo90828t() {
        return this.f77474d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    /* JADX INFO: renamed from: u */
    public JavaTypeQualifiersByElementType mo90829u() {
        return this.f77473c.m90509b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: v */
    public boolean mo90830v() {
        Annotated annotated = this.f77471a;
        return (annotated instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) annotated).mo89509w0() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    /* JADX INFO: renamed from: w */
    public NullabilityQualifierWithMigrationStatus mo90831w(@Nullable NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @Nullable JavaDefaultQualifiers javaDefaultQualifiers) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90866b;
        if (nullabilityQualifierWithMigrationStatus != null && (nullabilityQualifierWithMigrationStatusM90866b = NullabilityQualifierWithMigrationStatus.m90866b(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return nullabilityQualifierWithMigrationStatusM90866b;
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.m90278d();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: x */
    public boolean mo90832x() {
        return this.f77473c.m90508a().m90489q().mo90499c();
    }

    public /* synthetic */ bnf0(Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, (i & 16) != 0 ? false : z2);
    }
}
