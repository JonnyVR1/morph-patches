package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.m26;
import p153l.n26;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextKt {
    /* JADX INFO: renamed from: c */
    public static final LazyJavaResolverContext m90462c(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, Lazy<JavaTypeQualifiersByElementType> lazy) {
        return new LazyJavaResolverContext(lazyJavaResolverContext.m90508a(), javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i) : lazyJavaResolverContext.m90513f(), lazy);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final LazyJavaResolverContext m90463d(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        lazyJavaResolverContext.getClass();
        typeParameterResolver.getClass();
        return new LazyJavaResolverContext(lazyJavaResolverContext.m90508a(), typeParameterResolver, lazyJavaResolverContext.m90510c());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final LazyJavaResolverContext m90464e(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, @Nullable JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        lazyJavaResolverContext.getClass();
        classOrPackageFragmentDescriptor.getClass();
        return m90462c(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i, LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new m26(lazyJavaResolverContext, classOrPackageFragmentDescriptor)));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ LazyJavaResolverContext m90465f(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m90464e(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }

    /* JADX INFO: renamed from: g */
    public static final JavaTypeQualifiersByElementType m90466g(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        return m90469j(lazyJavaResolverContext, classOrPackageFragmentDescriptor.getAnnotations());
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final LazyJavaResolverContext m90467h(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        lazyJavaResolverContext.getClass();
        declarationDescriptor.getClass();
        javaTypeParameterListOwner.getClass();
        return m90462c(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i, lazyJavaResolverContext.m90510c());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ LazyJavaResolverContext m90468i(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m90467h(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final JavaTypeQualifiersByElementType m90469j(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations annotations) {
        lazyJavaResolverContext.getClass();
        annotations.getClass();
        return lazyJavaResolverContext.m90508a().m90473a().m90209d(lazyJavaResolverContext.m90509b(), annotations);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final LazyJavaResolverContext m90470k(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations annotations) {
        lazyJavaResolverContext.getClass();
        annotations.getClass();
        return annotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.m90508a(), lazyJavaResolverContext.m90513f(), LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new n26(lazyJavaResolverContext, annotations)));
    }

    /* JADX INFO: renamed from: l */
    public static final JavaTypeQualifiersByElementType m90471l(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        return m90469j(lazyJavaResolverContext, annotations);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final LazyJavaResolverContext m90472m(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaResolverComponents javaResolverComponents) {
        lazyJavaResolverContext.getClass();
        javaResolverComponents.getClass();
        return new LazyJavaResolverContext(javaResolverComponents, lazyJavaResolverContext.m90513f(), lazyJavaResolverContext.m90510c());
    }
}
