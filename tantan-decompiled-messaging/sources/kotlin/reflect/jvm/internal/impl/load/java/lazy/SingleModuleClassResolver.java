package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleModuleClassResolver implements ModuleClassResolver {

    /* JADX INFO: renamed from: a */
    public JavaDescriptorResolver f64846a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassDescriptor mo89627a(@NotNull JavaClass javaClass) {
        javaClass.getClass();
        return m89628b().m92013b(javaClass);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JavaDescriptorResolver m89628b() {
        JavaDescriptorResolver javaDescriptorResolver = this.f64846a;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver;
        }
        Intrinsics.m87502r("resolver");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m89629c(@NotNull JavaDescriptorResolver javaDescriptorResolver) {
        javaDescriptorResolver.getClass();
        this.f64846a = javaDescriptorResolver;
    }
}
