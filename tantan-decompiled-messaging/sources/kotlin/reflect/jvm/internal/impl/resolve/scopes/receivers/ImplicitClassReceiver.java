package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassDescriptor f65936a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ImplicitClassReceiver f65937b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ClassDescriptor f65938c;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        classDescriptor.getClass();
        this.f65936a = classDescriptor;
        this.f65937b = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.f65938c = classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        SimpleType simpleTypeMo88458o = this.f65936a.mo88458o();
        simpleTypeMo88458o.getClass();
        return simpleTypeMo88458o;
    }

    public boolean equals(@Nullable Object obj) {
        ClassDescriptor classDescriptor = this.f65936a;
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.m87488d(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.f65936a : null);
    }

    public int hashCode() {
        return this.f65936a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    /* JADX INFO: renamed from: j */
    public final ClassDescriptor mo92097j() {
        return this.f65936a;
    }

    @NotNull
    public String toString() {
        return "Class{" + getType() + '}';
    }
}
