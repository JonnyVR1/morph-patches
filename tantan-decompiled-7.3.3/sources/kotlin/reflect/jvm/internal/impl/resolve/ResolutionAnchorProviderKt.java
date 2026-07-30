package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ResolutionAnchorProviderKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModuleCapability<ResolutionAnchorProvider> f66511a = new ModuleCapability<>("ResolutionAnchorProvider");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ModuleDescriptor m92775a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        ResolutionAnchorProvider resolutionAnchorProvider = (ResolutionAnchorProvider) moduleDescriptor.mo89436Q(f66511a);
        if (resolutionAnchorProvider != null) {
            return resolutionAnchorProvider.m92774a(moduleDescriptor);
        }
        return null;
    }
}
