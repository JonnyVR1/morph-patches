package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorVisibility {
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Integer m88504a(@NotNull DescriptorVisibility descriptorVisibility) {
        descriptorVisibility.getClass();
        return mo88475b().mo88626a(descriptorVisibility.mo88475b());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract Visibility mo88475b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract String mo88476c();

    /* JADX INFO: renamed from: d */
    public final boolean m88505d() {
        return mo88475b().m88627c();
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z);

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract DescriptorVisibility mo88477f();

    @NotNull
    public final String toString() {
        return mo88475b().toString();
    }
}
