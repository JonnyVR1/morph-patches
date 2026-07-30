package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class UtilsKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final AnnotationDescriptor m90393a(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaWildcardType javaWildcardType) {
        lazyJavaResolverContext.getClass();
        javaWildcardType.getClass();
        AnnotationDescriptor annotationDescriptor = null;
        if (javaWildcardType.mo89964o() == null) {
            wg3.m206174a("Nullability annotations on unbounded wildcards aren't supported");
            return null;
        }
        loop0: for (AnnotationDescriptor annotationDescriptor2 : new LazyJavaAnnotations(lazyJavaResolverContext, javaWildcardType, false, 4, null)) {
            AnnotationDescriptor annotationDescriptor3 = annotationDescriptor2;
            for (FqName fqName : JavaNullabilityAnnotationSettingsKt.m90301e()) {
                if (Intrinsics.m88377d(annotationDescriptor3.mo89522d(), fqName)) {
                    annotationDescriptor = annotationDescriptor2;
                    break loop0;
                }
            }
        }
        return annotationDescriptor;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m90394b(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return (callableMemberDescriptor instanceof FunctionDescriptor) && Intrinsics.m88377d(callableMemberDescriptor.mo89334J(JavaMethodDescriptor.f65474H), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m90395c(@NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        javaTypeEnhancementState.getClass();
        return javaTypeEnhancementState.m90309b().invoke(JavaNullabilityAnnotationSettingsKt.m90300d()) == ReportLevel.STRICT;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final DescriptorVisibility m90396d(@NotNull Visibility visibility) {
        visibility.getClass();
        DescriptorVisibility descriptorVisibilityM90288g = JavaDescriptorVisibilities.m90288g(visibility);
        descriptorVisibilityM90288g.getClass();
        return descriptorVisibilityM90288g;
    }
}
