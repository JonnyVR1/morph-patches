package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageFragmentProviderKt {
    /* JADX INFO: renamed from: a */
    public static final void m89462a(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        packageFragmentProvider.getClass();
        fqName.getClass();
        collection.getClass();
        if (packageFragmentProvider instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized) packageFragmentProvider).mo89460b(fqName, collection);
        } else {
            collection.addAll(packageFragmentProvider.mo89454a(fqName));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m89463b(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName) {
        packageFragmentProvider.getClass();
        fqName.getClass();
        return packageFragmentProvider instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized) packageFragmentProvider).mo89461c(fqName) : m89464c(packageFragmentProvider, fqName).isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final List<PackageFragmentDescriptor> m89464c(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName) {
        packageFragmentProvider.getClass();
        fqName.getClass();
        ArrayList arrayList = new ArrayList();
        m89462a(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }
}
