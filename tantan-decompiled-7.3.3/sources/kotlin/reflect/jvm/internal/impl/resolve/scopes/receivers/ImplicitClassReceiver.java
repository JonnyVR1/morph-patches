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
    public final ClassDescriptor f66610a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ImplicitClassReceiver f66611b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ClassDescriptor f66612c;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        classDescriptor.getClass();
        this.f66610a = classDescriptor;
        this.f66611b = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.f66612c = classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        SimpleType simpleTypeMo89349o = this.f66610a.mo89349o();
        simpleTypeMo89349o.getClass();
        return simpleTypeMo89349o;
    }

    public boolean equals(@Nullable Object obj) {
        ClassDescriptor classDescriptor = this.f66610a;
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.m88377d(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.f66610a : null);
    }

    public int hashCode() {
        return this.f66610a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    /* JADX INFO: renamed from: j */
    public final ClassDescriptor mo92988j() {
        return this.f66610a;
    }

    @NotNull
    public String toString() {
        return "Class{" + getType() + '}';
    }
}
