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
import p149l.i460;
import p149l.j460;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Collection<PackageFragmentDescriptor> f64054a;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(@NotNull Collection<? extends PackageFragmentDescriptor> collection) {
        collection.getClass();
        this.f64054a = collection;
    }

    /* JADX INFO: renamed from: f */
    public static final FqName m88567f(PackageFragmentDescriptor packageFragmentDescriptor) {
        packageFragmentDescriptor.getClass();
        return packageFragmentDescriptor.mo88562d();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m88568g(FqName fqName, FqName fqName2) {
        fqName2.getClass();
        return !fqName2.m91048c() && Intrinsics.m87488d(fqName2.m91049d(), fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<PackageFragmentDescriptor> mo88563a(@NotNull FqName fqName) {
        fqName.getClass();
        Collection<PackageFragmentDescriptor> collection = this.f64054a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.m87488d(((PackageFragmentDescriptor) obj).mo88562d(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: b */
    public void mo88569b(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        for (Object obj : this.f64054a) {
            if (Intrinsics.m87488d(((PackageFragmentDescriptor) obj).mo88562d(), fqName)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    /* JADX INFO: renamed from: c */
    public boolean mo88570c(@NotNull FqName fqName) {
        fqName.getClass();
        Collection<PackageFragmentDescriptor> collection = this.f64054a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m87488d(((PackageFragmentDescriptor) it.next()).mo88562d(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* JADX INFO: renamed from: m */
    public Collection<FqName> mo88564m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return SequencesKt___SequencesKt.m93302V(SequencesKt___SequencesKt.m93281A(SequencesKt___SequencesKt.m93294N(CollectionsKt.asSequence(this.f64054a), i460.INSTANCE), new j460(fqName)));
    }
}
