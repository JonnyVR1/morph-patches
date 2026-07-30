package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wvq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmPackageScope implements MemberScope {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f65527e = {Reflection.m88403i(new PropertyReference1Impl(JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f65528a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LazyJavaPackageFragment f65529b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LazyJavaPackageScope f65530c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue f65531d;

    public JvmPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        lazyJavaPackageFragment.getClass();
        this.f65528a = lazyJavaResolverContext;
        this.f65529b = lazyJavaPackageFragment;
        this.f65530c = new LazyJavaPackageScope(lazyJavaResolverContext, javaPackage, lazyJavaPackageFragment);
        this.f65531d = lazyJavaResolverContext.m90512e().mo93337e(new wvq(this));
    }

    /* JADX INFO: renamed from: k */
    public static final MemberScope[] m90532k(JvmPackageScope jvmPackageScope) {
        Collection<KotlinJvmBinaryClass> collectionValues = jvmPackageScope.f65529b.m90653H0().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            MemberScope memberScopeM91196c = jvmPackageScope.f65528a.m90508a().m90474b().m91196c(jvmPackageScope.f65529b, (KotlinJvmBinaryClass) it.next());
            if (memberScopeM91196c != null) {
                arrayList.add(memberScopeM91196c);
            }
        }
        return (MemberScope[]) ScopeUtilsKt.m94068b(arrayList).toArray(new MemberScope[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo89610a() {
        MemberScope[] memberScopeArrM90535j = m90535j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrM90535j) {
            CollectionsKt.addAll(linkedHashSet, memberScope.mo89610a());
        }
        linkedHashSet.addAll(this.f65530c.mo89610a());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m90536l(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f65530c;
        MemberScope[] memberScopeArrM90535j = m90535j();
        Collection<? extends SimpleFunctionDescriptor> collectionMo89611b = lazyJavaPackageScope.mo89611b(name, lookupLocation);
        int length = memberScopeArrM90535j.length;
        int i = 0;
        Collection collection = collectionMo89611b;
        while (i < length) {
            Collection collectionM94067a = ScopeUtilsKt.m94067a(collection, memberScopeArrM90535j[i].mo89611b(name, lookupLocation));
            i++;
            collection = collectionM94067a;
        }
        return collection == null ? SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m90536l(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f65530c;
        MemberScope[] memberScopeArrM90535j = m90535j();
        Collection<? extends PropertyDescriptor> collectionMo89612c = lazyJavaPackageScope.mo89612c(name, lookupLocation);
        int length = memberScopeArrM90535j.length;
        int i = 0;
        Collection collection = collectionMo89612c;
        while (i < length) {
            Collection collectionM94067a = ScopeUtilsKt.m94067a(collection, memberScopeArrM90535j[i].mo89612c(name, lookupLocation));
            i++;
            collection = collectionM94067a;
        }
        return collection == null ? SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo89613d() {
        MemberScope[] memberScopeArrM90535j = m90535j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrM90535j) {
            CollectionsKt.addAll(linkedHashSet, memberScope.mo89613d());
        }
        linkedHashSet.addAll(this.f65530c.mo89613d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo89614e() {
        Set<Name> setM92957a = MemberScopeKt.m92957a(ArraysKt.asIterable(m90535j()));
        if (setM92957a == null) {
            return null;
        }
        setM92957a.addAll(this.f65530c.mo89614e());
        return setM92957a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m90536l(name, lookupLocation);
        ClassDescriptor classDescriptorM90662l0 = this.f65530c.mo90533f(name, lookupLocation);
        if (classDescriptorM90662l0 != null) {
            return classDescriptorM90662l0;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : m90535j()) {
            ClassifierDescriptor classifierDescriptorMo90533f = memberScope.mo90533f(name, lookupLocation);
            if (classifierDescriptorMo90533f != null) {
                if (!(classifierDescriptorMo90533f instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo90533f).mo89198n0()) {
                    return classifierDescriptorMo90533f;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo90533f;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        LazyJavaPackageScope lazyJavaPackageScope = this.f65530c;
        MemberScope[] memberScopeArrM90535j = m90535j();
        Collection<DeclarationDescriptor> collectionMo89615g = lazyJavaPackageScope.mo89615g(descriptorKindFilter, function1);
        for (MemberScope memberScope : memberScopeArrM90535j) {
            collectionMo89615g = ScopeUtilsKt.m94067a(collectionMo89615g, memberScope.mo89615g(descriptorKindFilter, function1));
        }
        return collectionMo89615g == null ? SetsKt.emptySet() : collectionMo89615g;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final LazyJavaPackageScope m90534i() {
        return this.f65530c;
    }

    /* JADX INFO: renamed from: j */
    public final MemberScope[] m90535j() {
        return (MemberScope[]) StorageKt.m93375a(this.f65531d, this, f65527e[0]);
    }

    /* JADX INFO: renamed from: l */
    public void m90536l(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        UtilsKt.m89966b(this.f65528a.m90508a().m90484l(), lookupLocation, this.f65529b, name);
    }

    @NotNull
    public String toString() {
        return "scope for " + this.f65529b;
    }
}
