package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import org.jetbrains.annotations.NotNull;
import p153l.obr;
import p153l.sar;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f65509a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> f65510b;

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents javaResolverComponents) {
        javaResolverComponents.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(javaResolverComponents, TypeParameterResolver.EMPTY.INSTANCE, obr.m167033c(null));
        this.f65509a = lazyJavaResolverContext;
        this.f65510b = lazyJavaResolverContext.m90512e().mo93336d();
    }

    /* JADX INFO: renamed from: f */
    public static final LazyJavaPackageFragment m90505f(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        return new LazyJavaPackageFragment(lazyJavaPackageFragmentProvider.f65509a, javaPackage);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<LazyJavaPackageFragment> mo89454a(@NotNull FqName fqName) {
        fqName.getClass();
        return CollectionsKt.listOfNotNull(m90506e(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: b */
    public void mo89460b(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(collection, m90506e(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: c */
    public boolean mo89461c(@NotNull FqName fqName) {
        fqName.getClass();
        return JavaClassFinder$$Util.m90272a(this.f65509a.m90508a().m90476d(), fqName, false, 2, null) == null;
    }

    /* JADX INFO: renamed from: e */
    public final LazyJavaPackageFragment m90506e(FqName fqName) {
        JavaPackage javaPackageM90272a = JavaClassFinder$$Util.m90272a(this.f65509a.m90508a().m90476d(), fqName, false, 2, null);
        if (javaPackageM90272a == null) {
            return null;
        }
        return this.f65510b.mo93326a(fqName, new sar(this, javaPackageM90272a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<FqName> mo89455m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        LazyJavaPackageFragment lazyJavaPackageFragmentM90506e = m90506e(fqName);
        List<FqName> listM90655J0 = lazyJavaPackageFragmentM90506e != null ? lazyJavaPackageFragmentM90506e.m90655J0() : null;
        return listM90655J0 == null ? CollectionsKt.emptyList() : listM90655J0;
    }

    @NotNull
    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f65509a.m90508a().m90485m();
    }
}
