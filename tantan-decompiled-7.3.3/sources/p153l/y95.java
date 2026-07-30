package p153l;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class y95 implements StdlibClassFinder {

    @NotNull
    public static final y95 INSTANCE = new y95();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassDescriptor mo92776a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return FindClassInModuleKt.m89398b(moduleDescriptor, StandardClassIds.INSTANCE.m91990j());
    }
}
