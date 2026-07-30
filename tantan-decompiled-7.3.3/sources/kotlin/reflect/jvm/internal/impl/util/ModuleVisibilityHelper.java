package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ModuleVisibilityHelper {

    public static final class EMPTY implements ModuleVisibilityHelper {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        /* JADX INFO: renamed from: a */
        public boolean mo94036a(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
            declarationDescriptor.getClass();
            declarationDescriptor2.getClass();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo94036a(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2);
}
