package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ExternalOverridabilityCondition {

    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum Result {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Contract mo90267a();

    @NotNull
    /* JADX INFO: renamed from: b */
    Result mo90268b(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor);
}
