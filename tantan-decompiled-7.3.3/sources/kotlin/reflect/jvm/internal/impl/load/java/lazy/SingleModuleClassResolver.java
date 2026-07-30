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
    public JavaDescriptorResolver f65520a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassDescriptor mo90518a(@NotNull JavaClass javaClass) {
        javaClass.getClass();
        return m90519b().m92904b(javaClass);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JavaDescriptorResolver m90519b() {
        JavaDescriptorResolver javaDescriptorResolver = this.f65520a;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver;
        }
        Intrinsics.m88391r("resolver");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m90520c(@NotNull JavaDescriptorResolver javaDescriptorResolver) {
        javaDescriptorResolver.getClass();
        this.f65520a = javaDescriptorResolver;
    }
}
