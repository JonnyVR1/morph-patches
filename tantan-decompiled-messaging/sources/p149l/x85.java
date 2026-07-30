package p149l;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class x85 implements StdlibClassFinder {

    @NotNull
    public static final x85 INSTANCE = new x85();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassDescriptor mo91885a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return FindClassInModuleKt.m88507b(moduleDescriptor, StandardClassIds.INSTANCE.m91099j());
    }
}
