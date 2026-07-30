package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleAwareClassDescriptorKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final MemberScope m89701a(@NotNull ClassDescriptor classDescriptor, @NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        classDescriptor.getClass();
        typeSubstitution.getClass();
        kotlinTypeRefiner.getClass();
        return ModuleAwareClassDescriptor.Companion.m89699a(classDescriptor, typeSubstitution, kotlinTypeRefiner);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final MemberScope m89702b(@NotNull ClassDescriptor classDescriptor, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        classDescriptor.getClass();
        kotlinTypeRefiner.getClass();
        return ModuleAwareClassDescriptor.Companion.m89700b(classDescriptor, kotlinTypeRefiner);
    }
}
