package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<PackageFragmentProvider> f64804a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f64805b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositePackageFragmentProvider(@NotNull List<? extends PackageFragmentProvider> list, @NotNull String str) {
        list.getClass();
        str.getClass();
        this.f64804a = list;
        this.f64805b = str;
        list.size();
        CollectionsKt.toSet(list).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<PackageFragmentDescriptor> mo89454a(@NotNull FqName fqName) {
        fqName.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<PackageFragmentProvider> it = this.f64804a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.m89462a(it.next(), fqName, arrayList);
        }
        return CollectionsKt.toList(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: b */
    public void mo89460b(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        Iterator<PackageFragmentProvider> it = this.f64804a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.m89462a(it.next(), fqName, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: c */
    public boolean mo89461c(@NotNull FqName fqName) {
        fqName.getClass();
        List<PackageFragmentProvider> list = this.f64804a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!PackageFragmentProviderKt.m89463b((PackageFragmentProvider) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* JADX INFO: renamed from: m */
    public Collection<FqName> mo89455m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        HashSet hashSet = new HashSet();
        Iterator<PackageFragmentProvider> it = this.f64804a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().mo89455m(fqName, function1));
        }
        return hashSet;
    }

    @NotNull
    public String toString() {
        return this.f64805b;
    }
}
