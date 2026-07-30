package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import p149l.x85;

/* JADX INFO: loaded from: classes2.dex */
public final class StdlibClassFinderKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModuleCapability<StdlibClassFinder> f65838a = new ModuleCapability<>("StdlibClassFinder");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final StdlibClassFinder m91886a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.mo88545Q(f65838a);
        return stdlibClassFinder == null ? x85.INSTANCE : stdlibClassFinder;
    }
}
