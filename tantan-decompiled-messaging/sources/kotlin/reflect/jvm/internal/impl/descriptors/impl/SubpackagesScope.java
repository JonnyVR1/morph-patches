package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class SubpackagesScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ModuleDescriptor f64295a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FqName f64296b;

    public SubpackagesScope(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName) {
        moduleDescriptor.getClass();
        fqName.getClass();
        this.f64295a = moduleDescriptor;
        this.f64296b = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: e */
    public Set<Name> mo88723e() {
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        if (!descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92048f())) {
            return CollectionsKt.emptyList();
        }
        if (this.f64296b.m91048c() && descriptorKindFilter.m92040l().contains(DescriptorKindExclude.TopLevelPackages.INSTANCE)) {
            return CollectionsKt.emptyList();
        }
        Collection<FqName> collectionMo88547m = this.f64295a.mo88547m(this.f64296b, function1);
        ArrayList arrayList = new ArrayList(collectionMo88547m.size());
        Iterator<FqName> it = collectionMo88547m.iterator();
        while (it.hasNext()) {
            Name nameM91051f = it.next().m91051f();
            if (function1.invoke(nameM91051f).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, m88903h(nameM91051f));
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final PackageViewDescriptor m88903h(@NotNull Name name) {
        name.getClass();
        if (name.m91085j()) {
            return null;
        }
        PackageViewDescriptor packageViewDescriptorMo88543I = this.f64295a.mo88543I(this.f64296b.m91047b(name));
        if (packageViewDescriptorMo88543I.isEmpty()) {
            return null;
        }
        return packageViewDescriptorMo88543I;
    }

    @NotNull
    public String toString() {
        return "subpackages of " + this.f64296b + " from " + this.f64295a;
    }
}
