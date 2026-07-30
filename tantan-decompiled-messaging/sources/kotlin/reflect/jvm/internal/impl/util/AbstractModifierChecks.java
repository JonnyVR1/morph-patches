package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractModifierChecks {
    @NotNull
    /* JADX INFO: renamed from: a */
    public final CheckResult m93126a(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        for (Checks checks : mo93127b()) {
            if (checks.m93138b(functionDescriptor)) {
                return checks.m93137a(functionDescriptor);
            }
        }
        return CheckResult.IllegalFunctionName.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract List<Checks> mo93127b();
}
