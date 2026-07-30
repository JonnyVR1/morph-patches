package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageFragmentProvider {
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: a */
    List<PackageFragmentDescriptor> mo89454a(@NotNull FqName fqName);

    @NotNull
    /* JADX INFO: renamed from: m */
    Collection<FqName> mo89455m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1);
}
