package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidModuleExceptionKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModuleCapability<InvalidModuleNotifier> f64041a = new ModuleCapability<>("InvalidModuleNotifier");

    /* JADX INFO: renamed from: a */
    public static final void m88539a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.mo88545Q(f64041a);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.m88540a(moduleDescriptor);
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
        }
    }
}
