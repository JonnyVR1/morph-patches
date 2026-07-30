package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaResolverContext {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaResolverComponents f64837a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeParameterResolver f64838b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> f64839c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final JavaTypeResolver f64840d;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents javaResolverComponents, @NotNull TypeParameterResolver typeParameterResolver, @NotNull Lazy<JavaTypeQualifiersByElementType> lazy) {
        javaResolverComponents.getClass();
        typeParameterResolver.getClass();
        lazy.getClass();
        this.f64837a = javaResolverComponents;
        this.f64838b = typeParameterResolver;
        this.f64839c = lazy;
        this.f64840d = new JavaTypeResolver(this, typeParameterResolver);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JavaResolverComponents m89617a() {
        return this.f64837a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final JavaTypeQualifiersByElementType m89618b() {
        return this.f64839c.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Lazy<JavaTypeQualifiersByElementType> m89619c() {
        return this.f64839c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ModuleDescriptor m89620d() {
        return this.f64837a.m89594m();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageManager m89621e() {
        return this.f64837a.m89602u();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TypeParameterResolver m89622f() {
        return this.f64838b;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JavaTypeResolver m89623g() {
        return this.f64840d;
    }
}
