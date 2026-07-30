package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ResolutionAnchorProviderKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModuleCapability<ResolutionAnchorProvider> f65837a = new ModuleCapability<>("ResolutionAnchorProvider");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ModuleDescriptor m91884a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        ResolutionAnchorProvider resolutionAnchorProvider = (ResolutionAnchorProvider) moduleDescriptor.mo88545Q(f65837a);
        if (resolutionAnchorProvider != null) {
            return resolutionAnchorProvider.m91883a(moduleDescriptor);
        }
        return null;
    }
}
