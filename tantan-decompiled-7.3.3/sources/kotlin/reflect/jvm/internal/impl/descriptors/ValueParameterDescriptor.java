package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    public static final class DefaultImpls {
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    ValueParameterDescriptor mo89505E(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i);

    /* JADX INFO: renamed from: M */
    boolean mo89506M();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    ValueParameterDescriptor mo89336a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    CallableDescriptor mo89190b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<ValueParameterDescriptor> mo89338e();

    int getIndex();

    /* JADX INFO: renamed from: r0 */
    boolean mo89507r0();

    /* JADX INFO: renamed from: t0 */
    boolean mo89508t0();

    @Nullable
    /* JADX INFO: renamed from: w0 */
    KotlinType mo89509w0();
}
