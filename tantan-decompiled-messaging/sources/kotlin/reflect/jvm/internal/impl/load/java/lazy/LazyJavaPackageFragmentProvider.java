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
import p149l.m9r;
import p149l.q8r;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f64835a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> f64836b;

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents javaResolverComponents) {
        javaResolverComponents.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(javaResolverComponents, TypeParameterResolver.EMPTY.INSTANCE, m9r.m153617c(null));
        this.f64835a = lazyJavaResolverContext;
        this.f64836b = lazyJavaResolverContext.m89621e().mo92445d();
    }

    /* JADX INFO: renamed from: f */
    public static final LazyJavaPackageFragment m89614f(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        return new LazyJavaPackageFragment(lazyJavaPackageFragmentProvider.f64835a, javaPackage);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<LazyJavaPackageFragment> mo88563a(@NotNull FqName fqName) {
        fqName.getClass();
        return CollectionsKt.listOfNotNull(m89615e(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: b */
    public void mo88569b(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(collection, m89615e(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: c */
    public boolean mo88570c(@NotNull FqName fqName) {
        fqName.getClass();
        return JavaClassFinder$$Util.m89381a(this.f64835a.m89617a().m89585d(), fqName, false, 2, null) == null;
    }

    /* JADX INFO: renamed from: e */
    public final LazyJavaPackageFragment m89615e(FqName fqName) {
        JavaPackage javaPackageM89381a = JavaClassFinder$$Util.m89381a(this.f64835a.m89617a().m89585d(), fqName, false, 2, null);
        if (javaPackageM89381a == null) {
            return null;
        }
        return this.f64836b.mo92435a(fqName, new q8r(this, javaPackageM89381a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<FqName> mo88564m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        LazyJavaPackageFragment lazyJavaPackageFragmentM89615e = m89615e(fqName);
        List<FqName> listM89764J0 = lazyJavaPackageFragmentM89615e != null ? lazyJavaPackageFragmentM89615e.m89764J0() : null;
        return listM89764J0 == null ? CollectionsKt.emptyList() : listM89764J0;
    }

    @NotNull
    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f64835a.m89617a().m89594m();
    }
}
