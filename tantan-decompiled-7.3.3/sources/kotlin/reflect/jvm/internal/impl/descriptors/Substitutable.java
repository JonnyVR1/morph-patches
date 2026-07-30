package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface Substitutable<T extends DeclarationDescriptorNonRoot> {
    @NotNull
    /* JADX INFO: renamed from: c */
    T mo89344c(@NotNull TypeSubstitutor typeSubstitutor);
}
