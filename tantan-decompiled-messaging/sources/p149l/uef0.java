package p149l;

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
public final class uef0 extends AbstractSignatureParts<AnnotationDescriptor> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Annotated f176033a;

    /* JADX INFO: renamed from: b */
    public final boolean f176034b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LazyJavaResolverContext f176035c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final AnnotationQualifierApplicabilityType f176036d;

    /* JADX INFO: renamed from: e */
    public final boolean f176037e;

    public uef0(@Nullable Annotated annotated, boolean z, @NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        lazyJavaResolverContext.getClass();
        annotationQualifierApplicabilityType.getClass();
        this.f176033a = annotated;
        this.f176034b = z;
        this.f176035c = lazyJavaResolverContext;
        this.f176036d = annotationQualifierApplicabilityType;
        this.f176037e = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    /* JADX INFO: renamed from: A */
    public FqNameUnsafe mo89914A(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        ClassDescriptor classDescriptorM92795f = TypeUtils.m92795f((KotlinType) kotlinTypeMarker);
        if (classDescriptorM92795f != null) {
            return DescriptorUtils.m91772m(classDescriptorM92795f);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: D */
    public boolean mo89917D() {
        return this.f176037e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: F */
    public boolean mo89919F(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return KotlinBuiltIns.m88184f0((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: G */
    public boolean mo89920G() {
        return this.f176034b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: H */
    public boolean mo89921H(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return this.f176035c.m89617a().m89592k().mo92903a((KotlinType) kotlinTypeMarker, (KotlinType) kotlinTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: I */
    public boolean mo89922I(@NotNull TypeParameterMarker typeParameterMarker) {
        typeParameterMarker.getClass();
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: J */
    public boolean mo89923J(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KotlinType) kotlinTypeMarker).mo92625J0() instanceof NotNullTypeParameterImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public boolean mo89932o(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable KotlinTypeMarker kotlinTypeMarker) {
        annotationDescriptor.getClass();
        if ((annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).mo89519f()) {
            return true;
        }
        if ((annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && !mo89941x() && (((LazyJavaAnnotationDescriptor) annotationDescriptor).m89655l() || mo89937t() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return kotlinTypeMarker != null && KotlinBuiltIns.m88196r0((KotlinType) kotlinTypeMarker) && mo89933p().m89329p(annotationDescriptor) && !this.f176035c.m89617a().m89598q().mo89609d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public AnnotationTypeQualifierResolver mo89933p() {
        return this.f176035c.m89617a().m89582a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public KotlinType mo89942y(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return TypeWithEnhancementKt.m92815a((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public TypeSystemInferenceExtensionContext mo89918E() {
        return SimpleClassicTypeSystemContext.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: q */
    public Iterable<AnnotationDescriptor> mo89934q(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: s */
    public Iterable<AnnotationDescriptor> mo89936s() {
        Annotations annotations;
        Annotated annotated = this.f176033a;
        return (annotated == null || (annotations = annotated.getAnnotations()) == null) ? CollectionsKt.emptyList() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    /* JADX INFO: renamed from: t */
    public AnnotationQualifierApplicabilityType mo89937t() {
        return this.f176036d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    /* JADX INFO: renamed from: u */
    public JavaTypeQualifiersByElementType mo89938u() {
        return this.f176035c.m89618b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: v */
    public boolean mo89939v() {
        Annotated annotated = this.f176033a;
        return (annotated instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) annotated).mo88618w0() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    /* JADX INFO: renamed from: w */
    public NullabilityQualifierWithMigrationStatus mo89940w(@Nullable NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @Nullable JavaDefaultQualifiers javaDefaultQualifiers) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89975b;
        if (nullabilityQualifierWithMigrationStatus != null && (nullabilityQualifierWithMigrationStatusM89975b = NullabilityQualifierWithMigrationStatus.m89975b(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return nullabilityQualifierWithMigrationStatusM89975b;
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.m89387d();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: x */
    public boolean mo89941x() {
        return this.f176035c.m89617a().m89598q().mo89608c();
    }

    public /* synthetic */ uef0(Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, (i & 16) != 0 ? false : z2);
    }
}
