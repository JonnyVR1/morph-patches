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
    public final ModuleDescriptor f64969a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FqName f64970b;

    public SubpackagesScope(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName) {
        moduleDescriptor.getClass();
        fqName.getClass();
        this.f64969a = moduleDescriptor;
        this.f64970b = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: e */
    public Set<Name> mo89614e() {
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        if (!descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92939f())) {
            return CollectionsKt.emptyList();
        }
        if (this.f64970b.m91939c() && descriptorKindFilter.m92931l().contains(DescriptorKindExclude.TopLevelPackages.INSTANCE)) {
            return CollectionsKt.emptyList();
        }
        Collection<FqName> collectionMo89438m = this.f64969a.mo89438m(this.f64970b, function1);
        ArrayList arrayList = new ArrayList(collectionMo89438m.size());
        Iterator<FqName> it = collectionMo89438m.iterator();
        while (it.hasNext()) {
            Name nameM91942f = it.next().m91942f();
            if (function1.invoke(nameM91942f).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, m89794h(nameM91942f));
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final PackageViewDescriptor m89794h(@NotNull Name name) {
        name.getClass();
        if (name.m91976j()) {
            return null;
        }
        PackageViewDescriptor packageViewDescriptorMo89434I = this.f64969a.mo89434I(this.f64970b.m91938b(name));
        if (packageViewDescriptorMo89434I.isEmpty()) {
            return null;
        }
        return packageViewDescriptorMo89434I;
    }

    @NotNull
    public String toString() {
        return "subpackages of " + this.f64970b + " from " + this.f64969a;
    }
}
