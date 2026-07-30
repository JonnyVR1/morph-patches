package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDescriptorResolver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaPackageFragmentProvider f65870a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaResolverCache f65871b;

    public JavaDescriptorResolver(@NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull JavaResolverCache javaResolverCache) {
        lazyJavaPackageFragmentProvider.getClass();
        javaResolverCache.getClass();
        this.f65870a = lazyJavaPackageFragmentProvider;
        this.f65871b = javaResolverCache;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageFragmentProvider m92012a() {
        return this.f65870a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ClassDescriptor m92013b(@NotNull JavaClass javaClass) {
        LazyJavaPackageFragment lazyJavaPackageFragment;
        javaClass.getClass();
        FqName fqNameMo89032d = javaClass.mo89032d();
        if (fqNameMo89032d != null && javaClass.mo89036v() == LightClassOriginKind.SOURCE) {
            return this.f65871b.mo89538e(fqNameMo89032d);
        }
        JavaClass javaClassMo89033h = javaClass.mo89033h();
        if (javaClassMo89033h == null) {
            if (fqNameMo89032d == null || (lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.firstOrNull((List) this.f65870a.mo88563a(fqNameMo89032d.m91049d()))) == null) {
                return null;
            }
            return lazyJavaPackageFragment.m89761G0(javaClass);
        }
        ClassDescriptor classDescriptorM92013b = m92013b(javaClassMo89033h);
        MemberScope memberScopeMo88454C = classDescriptorM92013b != null ? classDescriptorM92013b.mo88454C() : null;
        ClassifierDescriptor classifierDescriptorMo89642f = memberScopeMo88454C != null ? memberScopeMo88454C.mo89642f(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
        if (classifierDescriptorMo89642f instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo89642f;
        }
        return null;
    }
}
