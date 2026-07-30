package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractModifierChecks {
    @NotNull
    /* JADX INFO: renamed from: a */
    public final CheckResult m94017a(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        for (Checks checks : mo94018b()) {
            if (checks.m94029b(functionDescriptor)) {
                return checks.m94028a(functionDescriptor);
            }
        }
        return CheckResult.IllegalFunctionName.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract List<Checks> mo94018b();
}
