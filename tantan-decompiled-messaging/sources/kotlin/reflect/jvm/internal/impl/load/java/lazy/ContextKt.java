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
import p149l.h16;
import p149l.i16;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextKt {
    /* JADX INFO: renamed from: c */
    public static final LazyJavaResolverContext m89571c(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, Lazy<JavaTypeQualifiersByElementType> lazy) {
        return new LazyJavaResolverContext(lazyJavaResolverContext.m89617a(), javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i) : lazyJavaResolverContext.m89622f(), lazy);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final LazyJavaResolverContext m89572d(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        lazyJavaResolverContext.getClass();
        typeParameterResolver.getClass();
        return new LazyJavaResolverContext(lazyJavaResolverContext.m89617a(), typeParameterResolver, lazyJavaResolverContext.m89619c());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final LazyJavaResolverContext m89573e(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, @Nullable JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        lazyJavaResolverContext.getClass();
        classOrPackageFragmentDescriptor.getClass();
        return m89571c(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i, LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new h16(lazyJavaResolverContext, classOrPackageFragmentDescriptor)));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ LazyJavaResolverContext m89574f(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m89573e(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }

    /* JADX INFO: renamed from: g */
    public static final JavaTypeQualifiersByElementType m89575g(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        return m89578j(lazyJavaResolverContext, classOrPackageFragmentDescriptor.getAnnotations());
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final LazyJavaResolverContext m89576h(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        lazyJavaResolverContext.getClass();
        declarationDescriptor.getClass();
        javaTypeParameterListOwner.getClass();
        return m89571c(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i, lazyJavaResolverContext.m89619c());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ LazyJavaResolverContext m89577i(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m89576h(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final JavaTypeQualifiersByElementType m89578j(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations annotations) {
        lazyJavaResolverContext.getClass();
        annotations.getClass();
        return lazyJavaResolverContext.m89617a().m89582a().m89318d(lazyJavaResolverContext.m89618b(), annotations);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final LazyJavaResolverContext m89579k(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations annotations) {
        lazyJavaResolverContext.getClass();
        annotations.getClass();
        return annotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.m89617a(), lazyJavaResolverContext.m89622f(), LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new i16(lazyJavaResolverContext, annotations)));
    }

    /* JADX INFO: renamed from: l */
    public static final JavaTypeQualifiersByElementType m89580l(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        return m89578j(lazyJavaResolverContext, annotations);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final LazyJavaResolverContext m89581m(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaResolverComponents javaResolverComponents) {
        lazyJavaResolverContext.getClass();
        javaResolverComponents.getClass();
        return new LazyJavaResolverContext(javaResolverComponents, lazyJavaResolverContext.m89622f(), lazyJavaResolverContext.m89619c());
    }
}
