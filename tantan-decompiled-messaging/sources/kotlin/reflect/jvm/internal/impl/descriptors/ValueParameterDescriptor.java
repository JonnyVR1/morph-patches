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
    ValueParameterDescriptor mo88614E(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i);

    /* JADX INFO: renamed from: M */
    boolean mo88615M();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    ValueParameterDescriptor mo88445a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    CallableDescriptor mo88299b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<ValueParameterDescriptor> mo88447e();

    int getIndex();

    /* JADX INFO: renamed from: r0 */
    boolean mo88616r0();

    /* JADX INFO: renamed from: t0 */
    boolean mo88617t0();

    @Nullable
    /* JADX INFO: renamed from: w0 */
    KotlinType mo88618w0();
}
