package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    /* JADX INFO: renamed from: b */
    public void mo92693b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        callableMemberDescriptor.getClass();
        callableMemberDescriptor2.getClass();
        mo89626e(callableMemberDescriptor, callableMemberDescriptor2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    /* JADX INFO: renamed from: c */
    public void mo92694c(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        callableMemberDescriptor.getClass();
        callableMemberDescriptor2.getClass();
        mo89626e(callableMemberDescriptor, callableMemberDescriptor2);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo89626e(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);
}
