package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageFragmentProviderKt {
    /* JADX INFO: renamed from: a */
    public static final void m88571a(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        packageFragmentProvider.getClass();
        fqName.getClass();
        collection.getClass();
        if (packageFragmentProvider instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized) packageFragmentProvider).mo88569b(fqName, collection);
        } else {
            collection.addAll(packageFragmentProvider.mo88563a(fqName));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m88572b(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName) {
        packageFragmentProvider.getClass();
        fqName.getClass();
        return packageFragmentProvider instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized) packageFragmentProvider).mo88570c(fqName) : m88573c(packageFragmentProvider, fqName).isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final List<PackageFragmentDescriptor> m88573c(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName) {
        packageFragmentProvider.getClass();
        fqName.getClass();
        ArrayList arrayList = new ArrayList();
        m88571a(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }
}
