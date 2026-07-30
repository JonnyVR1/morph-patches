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
import p153l.mbr;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f65515a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DeclarationDescriptor f65516b;

    /* JADX INFO: renamed from: c */
    public final int f65517c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<JavaTypeParameter, Integer> f65518d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> f65519e;

    public LazyJavaTypeParameterResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        lazyJavaResolverContext.getClass();
        declarationDescriptor.getClass();
        javaTypeParameterListOwner.getClass();
        this.f65515a = lazyJavaResolverContext;
        this.f65516b = declarationDescriptor;
        this.f65517c = i;
        this.f65518d = CollectionsKt.m94072d(javaTypeParameterListOwner.getTypeParameters());
        this.f65519e = lazyJavaResolverContext.m90512e().mo93335c(new mbr(this));
    }

    /* JADX INFO: renamed from: c */
    public static final LazyJavaTypeParameterDescriptor m90516c(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver, JavaTypeParameter javaTypeParameter) {
        javaTypeParameter.getClass();
        Integer num = lazyJavaTypeParameterResolver.f65518d.get(javaTypeParameter);
        if (num == null) {
            return null;
        }
        return new LazyJavaTypeParameterDescriptor(ContextKt.m90470k(ContextKt.m90463d(lazyJavaTypeParameterResolver.f65515a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f65516b.getAnnotations()), javaTypeParameter, lazyJavaTypeParameterResolver.f65517c + num.intValue(), lazyJavaTypeParameterResolver.f65516b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    @Nullable
    /* JADX INFO: renamed from: a */
    public TypeParameterDescriptor mo90517a(@NotNull JavaTypeParameter javaTypeParameter) {
        javaTypeParameter.getClass();
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptorInvoke = this.f65519e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptorInvoke != null ? lazyJavaTypeParameterDescriptorInvoke : this.f65515a.m90513f().mo90517a(javaTypeParameter);
    }
}
