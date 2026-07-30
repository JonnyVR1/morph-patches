package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ReceiverParameterDescriptor extends ParameterDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    /* JADX INFO: renamed from: c */
    ReceiverParameterDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor);

    @NotNull
    ReceiverValue getValue();
}
