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
import p149l.vtq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmPackageScope implements MemberScope {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f64853e = {Reflection.m87514i(new PropertyReference1Impl(JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f64854a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LazyJavaPackageFragment f64855b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LazyJavaPackageScope f64856c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue f64857d;

    public JvmPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        lazyJavaPackageFragment.getClass();
        this.f64854a = lazyJavaResolverContext;
        this.f64855b = lazyJavaPackageFragment;
        this.f64856c = new LazyJavaPackageScope(lazyJavaResolverContext, javaPackage, lazyJavaPackageFragment);
        this.f64857d = lazyJavaResolverContext.m89621e().mo92446e(new vtq(this));
    }

    /* JADX INFO: renamed from: k */
    public static final MemberScope[] m89641k(JvmPackageScope jvmPackageScope) {
        Collection<KotlinJvmBinaryClass> collectionValues = jvmPackageScope.f64855b.m89762H0().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            MemberScope memberScopeM90305c = jvmPackageScope.f64854a.m89617a().m89583b().m90305c(jvmPackageScope.f64855b, (KotlinJvmBinaryClass) it.next());
            if (memberScopeM90305c != null) {
                arrayList.add(memberScopeM90305c);
            }
        }
        return (MemberScope[]) ScopeUtilsKt.m93177b(arrayList).toArray(new MemberScope[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo88719a() {
        MemberScope[] memberScopeArrM89644j = m89644j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrM89644j) {
            CollectionsKt.addAll(linkedHashSet, memberScope.mo88719a());
        }
        linkedHashSet.addAll(this.f64856c.mo88719a());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m89645l(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f64856c;
        MemberScope[] memberScopeArrM89644j = m89644j();
        Collection<? extends SimpleFunctionDescriptor> collectionMo88720b = lazyJavaPackageScope.mo88720b(name, lookupLocation);
        int length = memberScopeArrM89644j.length;
        int i = 0;
        Collection collection = collectionMo88720b;
        while (i < length) {
            Collection collectionM93176a = ScopeUtilsKt.m93176a(collection, memberScopeArrM89644j[i].mo88720b(name, lookupLocation));
            i++;
            collection = collectionM93176a;
        }
        return collection == null ? SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m89645l(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f64856c;
        MemberScope[] memberScopeArrM89644j = m89644j();
        Collection<? extends PropertyDescriptor> collectionMo88721c = lazyJavaPackageScope.mo88721c(name, lookupLocation);
        int length = memberScopeArrM89644j.length;
        int i = 0;
        Collection collection = collectionMo88721c;
        while (i < length) {
            Collection collectionM93176a = ScopeUtilsKt.m93176a(collection, memberScopeArrM89644j[i].mo88721c(name, lookupLocation));
            i++;
            collection = collectionM93176a;
        }
        return collection == null ? SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo88722d() {
        MemberScope[] memberScopeArrM89644j = m89644j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrM89644j) {
            CollectionsKt.addAll(linkedHashSet, memberScope.mo88722d());
        }
        linkedHashSet.addAll(this.f64856c.mo88722d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo88723e() {
        Set<Name> setM92066a = MemberScopeKt.m92066a(ArraysKt.asIterable(m89644j()));
        if (setM92066a == null) {
            return null;
        }
        setM92066a.addAll(this.f64856c.mo88723e());
        return setM92066a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m89645l(name, lookupLocation);
        ClassDescriptor classDescriptorM89771l0 = this.f64856c.mo89642f(name, lookupLocation);
        if (classDescriptorM89771l0 != null) {
            return classDescriptorM89771l0;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : m89644j()) {
            ClassifierDescriptor classifierDescriptorMo89642f = memberScope.mo89642f(name, lookupLocation);
            if (classifierDescriptorMo89642f != null) {
                if (!(classifierDescriptorMo89642f instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo89642f).mo88307n0()) {
                    return classifierDescriptorMo89642f;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo89642f;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        LazyJavaPackageScope lazyJavaPackageScope = this.f64856c;
        MemberScope[] memberScopeArrM89644j = m89644j();
        Collection<DeclarationDescriptor> collectionMo88724g = lazyJavaPackageScope.mo88724g(descriptorKindFilter, function1);
        for (MemberScope memberScope : memberScopeArrM89644j) {
            collectionMo88724g = ScopeUtilsKt.m93176a(collectionMo88724g, memberScope.mo88724g(descriptorKindFilter, function1));
        }
        return collectionMo88724g == null ? SetsKt.emptySet() : collectionMo88724g;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final LazyJavaPackageScope m89643i() {
        return this.f64856c;
    }

    /* JADX INFO: renamed from: j */
    public final MemberScope[] m89644j() {
        return (MemberScope[]) StorageKt.m92484a(this.f64857d, this, f64853e[0]);
    }

    /* JADX INFO: renamed from: l */
    public void m89645l(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        UtilsKt.m89075b(this.f64854a.m89617a().m89593l(), lookupLocation, this.f64855b, name);
    }

    @NotNull
    public String toString() {
        return "scope for " + this.f64855b;
    }
}
