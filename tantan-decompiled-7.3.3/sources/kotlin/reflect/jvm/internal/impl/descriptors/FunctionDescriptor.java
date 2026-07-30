package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface FunctionDescriptor extends CallableMemberDescriptor {

    public interface CopyBuilder<D extends FunctionDescriptor> {
        @NotNull
        /* JADX INFO: renamed from: a */
        CopyBuilder<D> mo89407a(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor);

        @NotNull
        /* JADX INFO: renamed from: b */
        CopyBuilder<D> mo89408b(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor);

        @Nullable
        D build();

        @NotNull
        /* JADX INFO: renamed from: c */
        CopyBuilder<D> mo89409c(@NotNull TypeSubstitution typeSubstitution);

        @NotNull
        /* JADX INFO: renamed from: d */
        <V> CopyBuilder<D> mo89410d(@NotNull CallableDescriptor.UserDataKey<V> userDataKey, V v2);

        @NotNull
        /* JADX INFO: renamed from: e */
        CopyBuilder<D> mo89411e();

        @NotNull
        /* JADX INFO: renamed from: f */
        CopyBuilder<D> mo89412f(@NotNull Name name);

        @NotNull
        /* JADX INFO: renamed from: g */
        CopyBuilder<D> mo89413g();

        @NotNull
        /* JADX INFO: renamed from: h */
        CopyBuilder<D> mo89414h(@NotNull KotlinType kotlinType);

        @NotNull
        /* JADX INFO: renamed from: i */
        CopyBuilder<D> mo89415i(@Nullable CallableMemberDescriptor callableMemberDescriptor);

        @NotNull
        /* JADX INFO: renamed from: j */
        CopyBuilder<D> mo89416j(boolean z);

        @NotNull
        /* JADX INFO: renamed from: k */
        CopyBuilder<D> mo89417k(@NotNull List<TypeParameterDescriptor> list);

        @NotNull
        /* JADX INFO: renamed from: l */
        CopyBuilder<D> mo89418l(@NotNull Annotations annotations);

        @NotNull
        /* JADX INFO: renamed from: m */
        CopyBuilder<D> mo89419m();

        @NotNull
        /* JADX INFO: renamed from: n */
        CopyBuilder<D> mo89420n(@NotNull List<ValueParameterDescriptor> list);

        @NotNull
        /* JADX INFO: renamed from: o */
        CopyBuilder<D> mo89421o();

        @NotNull
        /* JADX INFO: renamed from: p */
        CopyBuilder<D> mo89422p(@NotNull DescriptorVisibility descriptorVisibility);

        @NotNull
        /* JADX INFO: renamed from: q */
        CopyBuilder<D> mo89423q(@NotNull Modality modality);

        @NotNull
        /* JADX INFO: renamed from: r */
        CopyBuilder<D> mo89424r(@NotNull DeclarationDescriptor declarationDescriptor);

        @NotNull
        /* JADX INFO: renamed from: s */
        CopyBuilder<D> mo89425s(@NotNull CallableMemberDescriptor.Kind kind);

        @NotNull
        /* JADX INFO: renamed from: t */
        CopyBuilder<D> mo89426t();
    }

    /* JADX INFO: renamed from: A0 */
    boolean mo89403A0();

    /* JADX INFO: renamed from: O */
    boolean mo89404O();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    FunctionDescriptor mo89336a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    DeclarationDescriptor mo89190b();

    @Nullable
    /* JADX INFO: renamed from: c */
    FunctionDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<? extends FunctionDescriptor> mo89338e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    @NotNull
    /* JADX INFO: renamed from: k */
    CopyBuilder<? extends FunctionDescriptor> mo89405k();

    /* JADX INFO: renamed from: u */
    boolean mo89215u();

    @Nullable
    /* JADX INFO: renamed from: u0 */
    FunctionDescriptor mo89406u0();
}
