package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface Check {

    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static String m93135a(@NotNull Check check, @NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            if (check.mo93134b(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    String mo93133a(@NotNull FunctionDescriptor functionDescriptor);

    /* JADX INFO: renamed from: b */
    boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor);

    @NotNull
    String getDescription();
}
