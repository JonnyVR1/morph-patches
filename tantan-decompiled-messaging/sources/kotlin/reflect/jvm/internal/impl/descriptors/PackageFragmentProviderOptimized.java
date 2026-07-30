package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageFragmentProviderOptimized extends PackageFragmentProvider {
    /* JADX INFO: renamed from: b */
    void mo88569b(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection);

    /* JADX INFO: renamed from: c */
    boolean mo88570c(@NotNull FqName fqName);
}
