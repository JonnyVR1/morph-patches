package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface Check {

    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static String m94026a(@NotNull Check check, @NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            if (check.mo94025b(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    String mo94024a(@NotNull FunctionDescriptor functionDescriptor);

    /* JADX INFO: renamed from: b */
    boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor);

    @NotNull
    String getDescription();
}
