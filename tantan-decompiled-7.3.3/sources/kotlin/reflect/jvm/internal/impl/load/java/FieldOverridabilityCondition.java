package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: a */
    public ExternalOverridabilityCondition.Contract mo90267a() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: b */
    public ExternalOverridabilityCondition.Result mo90268b(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        if (!(callableDescriptor2 instanceof PropertyDescriptor) || !(callableDescriptor instanceof PropertyDescriptor)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor2;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor;
        if (!Intrinsics.m88377d(propertyDescriptor.getName(), propertyDescriptor2.getName())) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (JavaDescriptorUtilKt.m90530a(propertyDescriptor) && JavaDescriptorUtilKt.m90530a(propertyDescriptor2)) {
            return ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        return (JavaDescriptorUtilKt.m90530a(propertyDescriptor) || JavaDescriptorUtilKt.m90530a(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
