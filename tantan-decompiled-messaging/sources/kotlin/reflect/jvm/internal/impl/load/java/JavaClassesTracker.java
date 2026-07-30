package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaClassesTracker {

    public static final class Default implements JavaClassesTracker {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        /* JADX INFO: renamed from: a */
        public void mo89383a(@NotNull JavaClassDescriptor javaClassDescriptor) {
            javaClassDescriptor.getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo89383a(@NotNull JavaClassDescriptor javaClassDescriptor);
}
