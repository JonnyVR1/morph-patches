package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface VariableDescriptor extends ValueDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: c */
    VariableDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor);

    boolean isConst();

    @Nullable
    /* JADX INFO: renamed from: q0 */
    ConstantValue<?> mo89510q0();

    /* JADX INFO: renamed from: y */
    boolean mo89511y();

    /* JADX INFO: renamed from: y0 */
    boolean mo89512y0();
}
