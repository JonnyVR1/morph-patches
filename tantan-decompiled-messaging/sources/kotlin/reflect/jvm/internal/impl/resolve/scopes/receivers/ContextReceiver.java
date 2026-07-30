package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CallableDescriptor f65933c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Name f65934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(@NotNull CallableDescriptor callableDescriptor, @NotNull KotlinType kotlinType, @Nullable Name name, @Nullable ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        callableDescriptor.getClass();
        kotlinType.getClass();
        this.f65933c = callableDescriptor;
        this.f65934d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    @Nullable
    /* JADX INFO: renamed from: a */
    public Name mo92093a() {
        return this.f65934d;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public CallableDescriptor m92094d() {
        return this.f65933c;
    }

    @NotNull
    public String toString() {
        return "Cxt { " + m92094d() + " }";
    }
}
