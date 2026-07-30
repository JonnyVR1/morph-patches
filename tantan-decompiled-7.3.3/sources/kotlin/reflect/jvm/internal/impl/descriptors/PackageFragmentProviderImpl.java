package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import p153l.oc60;
import p153l.pc60;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Collection<PackageFragmentDescriptor> f64728a;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(@NotNull Collection<? extends PackageFragmentDescriptor> collection) {
        collection.getClass();
        this.f64728a = collection;
    }

    /* JADX INFO: renamed from: f */
    public static final FqName m89458f(PackageFragmentDescriptor packageFragmentDescriptor) {
        packageFragmentDescriptor.getClass();
        return packageFragmentDescriptor.mo89453d();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m89459g(FqName fqName, FqName fqName2) {
        fqName2.getClass();
        return !fqName2.m91939c() && Intrinsics.m88377d(fqName2.m91940d(), fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<PackageFragmentDescriptor> mo89454a(@NotNull FqName fqName) {
        fqName.getClass();
        Collection<PackageFragmentDescriptor> collection = this.f64728a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.m88377d(((PackageFragmentDescriptor) obj).mo89453d(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: b */
    public void mo89460b(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        for (Object obj : this.f64728a) {
            if (Intrinsics.m88377d(((PackageFragmentDescriptor) obj).mo89453d(), fqName)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: c */
    public boolean mo89461c(@NotNull FqName fqName) {
        fqName.getClass();
        Collection<PackageFragmentDescriptor> collection = this.f64728a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m88377d(((PackageFragmentDescriptor) it.next()).mo89453d(), fqName)) {
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
        return SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94172A(SequencesKt___SequencesKt.m94185N(CollectionsKt.asSequence(this.f64728a), oc60.INSTANCE), new pc60(fqName)));
    }
}
