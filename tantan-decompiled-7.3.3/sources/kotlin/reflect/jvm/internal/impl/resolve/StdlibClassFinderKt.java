package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import p153l.y95;

/* JADX INFO: loaded from: classes2.dex */
public final class StdlibClassFinderKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModuleCapability<StdlibClassFinder> f66512a = new ModuleCapability<>("StdlibClassFinder");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final StdlibClassFinder m92777a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.mo89436Q(f66512a);
        return stdlibClassFinder == null ? y95.INSTANCE : stdlibClassFinder;
    }
}
