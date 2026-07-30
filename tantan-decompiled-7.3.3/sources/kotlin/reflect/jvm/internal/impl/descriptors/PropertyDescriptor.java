package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface PropertyDescriptor extends CallableMemberDescriptor, VariableDescriptorWithAccessors {
    @Nullable
    /* JADX INFO: renamed from: K */
    FieldDescriptor mo89474K();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    PropertyDescriptor mo89336a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: c */
    PropertyDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<? extends PropertyDescriptor> mo89338e();

    @Nullable
    PropertyGetterDescriptor getGetter();

    @Nullable
    PropertySetterDescriptor getSetter();

    @NotNull
    /* JADX INFO: renamed from: r */
    List<PropertyAccessorDescriptor> mo89475r();

    @Nullable
    /* JADX INFO: renamed from: z */
    FieldDescriptor mo89476z();
}
