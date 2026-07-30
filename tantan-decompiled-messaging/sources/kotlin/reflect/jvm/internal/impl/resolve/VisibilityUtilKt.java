package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class VisibilityUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CallableMemberDescriptor m91887a(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        Integer numM88485d;
        collection.getClass();
        collection.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            if (callableMemberDescriptor == null || ((numM88485d = DescriptorVisibilities.m88485d(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && numM88485d.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        callableMemberDescriptor.getClass();
        return callableMemberDescriptor;
    }
}
