package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.k9r;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f64841a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DeclarationDescriptor f64842b;

    /* JADX INFO: renamed from: c */
    public final int f64843c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<JavaTypeParameter, Integer> f64844d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> f64845e;

    public LazyJavaTypeParameterResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        lazyJavaResolverContext.getClass();
        declarationDescriptor.getClass();
        javaTypeParameterListOwner.getClass();
        this.f64841a = lazyJavaResolverContext;
        this.f64842b = declarationDescriptor;
        this.f64843c = i;
        this.f64844d = CollectionsKt.m93181d(javaTypeParameterListOwner.getTypeParameters());
        this.f64845e = lazyJavaResolverContext.m89621e().mo92444c(new k9r(this));
    }

    /* JADX INFO: renamed from: c */
    public static final LazyJavaTypeParameterDescriptor m89625c(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver, JavaTypeParameter javaTypeParameter) {
        javaTypeParameter.getClass();
        Integer num = lazyJavaTypeParameterResolver.f64844d.get(javaTypeParameter);
        if (num == null) {
            return null;
        }
        return new LazyJavaTypeParameterDescriptor(ContextKt.m89579k(ContextKt.m89572d(lazyJavaTypeParameterResolver.f64841a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f64842b.getAnnotations()), javaTypeParameter, lazyJavaTypeParameterResolver.f64843c + num.intValue(), lazyJavaTypeParameterResolver.f64842b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    @Nullable
    /* JADX INFO: renamed from: a */
    public TypeParameterDescriptor mo89626a(@NotNull JavaTypeParameter javaTypeParameter) {
        javaTypeParameter.getClass();
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptorInvoke = this.f64845e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptorInvoke != null ? lazyJavaTypeParameterDescriptorInvoke : this.f64841a.m89622f().mo89626a(javaTypeParameter);
    }
}
