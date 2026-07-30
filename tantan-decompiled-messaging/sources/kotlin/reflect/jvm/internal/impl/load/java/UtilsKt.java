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
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class UtilsKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final AnnotationDescriptor m89502a(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaWildcardType javaWildcardType) {
        lazyJavaResolverContext.getClass();
        javaWildcardType.getClass();
        AnnotationDescriptor annotationDescriptor = null;
        if (javaWildcardType.mo89073o() == null) {
            ig3.m135964a("Nullability annotations on unbounded wildcards aren't supported");
            return null;
        }
        loop0: for (AnnotationDescriptor annotationDescriptor2 : new LazyJavaAnnotations(lazyJavaResolverContext, javaWildcardType, false, 4, null)) {
            AnnotationDescriptor annotationDescriptor3 = annotationDescriptor2;
            for (FqName fqName : JavaNullabilityAnnotationSettingsKt.m89410e()) {
                if (Intrinsics.m87488d(annotationDescriptor3.mo88631d(), fqName)) {
                    annotationDescriptor = annotationDescriptor2;
                    break loop0;
                }
            }
        }
        return annotationDescriptor;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m89503b(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return (callableMemberDescriptor instanceof FunctionDescriptor) && Intrinsics.m87488d(callableMemberDescriptor.mo88443J(JavaMethodDescriptor.f64800H), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m89504c(@NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        javaTypeEnhancementState.getClass();
        return javaTypeEnhancementState.m89418b().invoke(JavaNullabilityAnnotationSettingsKt.m89409d()) == ReportLevel.STRICT;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final DescriptorVisibility m89505d(@NotNull Visibility visibility) {
        visibility.getClass();
        DescriptorVisibility descriptorVisibilityM89397g = JavaDescriptorVisibilities.m89397g(visibility);
        descriptorVisibilityM89397g.getClass();
        return descriptorVisibilityM89397g;
    }
}
