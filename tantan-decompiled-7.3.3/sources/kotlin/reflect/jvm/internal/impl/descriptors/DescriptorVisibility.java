package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorVisibility {
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Integer m89395a(@NotNull DescriptorVisibility descriptorVisibility) {
        descriptorVisibility.getClass();
        return mo89366b().mo89517a(descriptorVisibility.mo89366b());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract Visibility mo89366b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract String mo89367c();

    /* JADX INFO: renamed from: d */
    public final boolean m89396d() {
        return mo89366b().m89518c();
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z);

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract DescriptorVisibility mo89368f();

    @NotNull
    public final String toString() {
        return mo89366b().toString();
    }
}
