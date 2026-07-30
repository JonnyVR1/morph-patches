package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class VisibilityUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CallableMemberDescriptor m92778a(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        Integer numM89376d;
        collection.getClass();
        collection.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            if (callableMemberDescriptor == null || ((numM89376d = DescriptorVisibilities.m89376d(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && numM89376d.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        callableMemberDescriptor.getClass();
        return callableMemberDescriptor;
    }
}
