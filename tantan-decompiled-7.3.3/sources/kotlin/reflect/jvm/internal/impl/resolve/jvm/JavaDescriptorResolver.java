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
    public final LazyJavaPackageFragmentProvider f66544a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaResolverCache f66545b;

    public JavaDescriptorResolver(@NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull JavaResolverCache javaResolverCache) {
        lazyJavaPackageFragmentProvider.getClass();
        javaResolverCache.getClass();
        this.f66544a = lazyJavaPackageFragmentProvider;
        this.f66545b = javaResolverCache;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageFragmentProvider m92903a() {
        return this.f66544a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ClassDescriptor m92904b(@NotNull JavaClass javaClass) {
        LazyJavaPackageFragment lazyJavaPackageFragment;
        javaClass.getClass();
        FqName fqNameMo89923d = javaClass.mo89923d();
        if (fqNameMo89923d != null && javaClass.mo89927v() == LightClassOriginKind.SOURCE) {
            return this.f66545b.mo90429e(fqNameMo89923d);
        }
        JavaClass javaClassMo89924h = javaClass.mo89924h();
        if (javaClassMo89924h == null) {
            if (fqNameMo89923d == null || (lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.firstOrNull((List) this.f66544a.mo89454a(fqNameMo89923d.m91940d()))) == null) {
                return null;
            }
            return lazyJavaPackageFragment.m90652G0(javaClass);
        }
        ClassDescriptor classDescriptorM92904b = m92904b(javaClassMo89924h);
        MemberScope memberScopeMo89345C = classDescriptorM92904b != null ? classDescriptorM92904b.mo89345C() : null;
        ClassifierDescriptor classifierDescriptorMo90533f = memberScopeMo89345C != null ? memberScopeMo89345C.mo90533f(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
        if (classifierDescriptorMo90533f instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo90533f;
        }
        return null;
    }
}
