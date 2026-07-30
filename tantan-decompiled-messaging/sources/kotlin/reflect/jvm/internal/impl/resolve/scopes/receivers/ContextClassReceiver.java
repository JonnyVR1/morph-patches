package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ClassDescriptor f65931c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Name f65932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextClassReceiver(@NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @Nullable Name name, @Nullable ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        classDescriptor.getClass();
        kotlinType.getClass();
        this.f65931c = classDescriptor;
        this.f65932d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    @Nullable
    /* JADX INFO: renamed from: a */
    public Name mo92093a() {
        return this.f65932d;
    }

    @NotNull
    public String toString() {
        return getType() + ": Ctx { " + this.f65931c + " }";
    }
}
