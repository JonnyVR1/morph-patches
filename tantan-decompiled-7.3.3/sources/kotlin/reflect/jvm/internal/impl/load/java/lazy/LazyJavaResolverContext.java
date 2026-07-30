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
    public final JavaResolverComponents f65511a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeParameterResolver f65512b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> f65513c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final JavaTypeResolver f65514d;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents javaResolverComponents, @NotNull TypeParameterResolver typeParameterResolver, @NotNull Lazy<JavaTypeQualifiersByElementType> lazy) {
        javaResolverComponents.getClass();
        typeParameterResolver.getClass();
        lazy.getClass();
        this.f65511a = javaResolverComponents;
        this.f65512b = typeParameterResolver;
        this.f65513c = lazy;
        this.f65514d = new JavaTypeResolver(this, typeParameterResolver);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JavaResolverComponents m90508a() {
        return this.f65511a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final JavaTypeQualifiersByElementType m90509b() {
        return this.f65513c.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Lazy<JavaTypeQualifiersByElementType> m90510c() {
        return this.f65513c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ModuleDescriptor m90511d() {
        return this.f65511a.m90485m();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageManager m90512e() {
        return this.f65511a.m90493u();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TypeParameterResolver m90513f() {
        return this.f65512b;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JavaTypeResolver m90514g() {
        return this.f65514d;
    }
}
