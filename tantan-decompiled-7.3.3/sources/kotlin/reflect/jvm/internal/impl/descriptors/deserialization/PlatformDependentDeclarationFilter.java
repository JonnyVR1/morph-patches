package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface PlatformDependentDeclarationFilter {

    public static final class All implements PlatformDependentDeclarationFilter {

        @NotNull
        public static final All INSTANCE = new All();

        private All() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        /* JADX INFO: renamed from: a */
        public boolean mo89304a(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            classDescriptor.getClass();
            simpleFunctionDescriptor.getClass();
            return true;
        }
    }

    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {

        @NotNull
        public static final NoPlatformDependent INSTANCE = new NoPlatformDependent();

        private NoPlatformDependent() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        /* JADX INFO: renamed from: a */
        public boolean mo89304a(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            classDescriptor.getClass();
            simpleFunctionDescriptor.getClass();
            return !simpleFunctionDescriptor.getAnnotations().mo89530d0(PlatformDependentDeclarationFilterKt.m89544a());
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo89304a(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor);
}
