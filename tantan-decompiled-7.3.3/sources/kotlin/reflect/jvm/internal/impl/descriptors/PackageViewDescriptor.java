package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageViewDescriptor extends DeclarationDescriptor {
    @NotNull
    /* JADX INFO: renamed from: H */
    List<PackageFragmentDescriptor> mo89465H();

    @NotNull
    /* JADX INFO: renamed from: d */
    FqName mo89466d();

    boolean isEmpty();

    @NotNull
    /* JADX INFO: renamed from: n */
    MemberScope mo89467n();

    @NotNull
    /* JADX INFO: renamed from: z0 */
    ModuleDescriptor mo89468z0();
}
