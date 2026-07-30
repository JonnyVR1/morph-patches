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
        CopyBuilder<D> mo88516a(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor);

        @NotNull
        /* JADX INFO: renamed from: b */
        CopyBuilder<D> mo88517b(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor);

        @Nullable
        D build();

        @NotNull
        /* JADX INFO: renamed from: c */
        CopyBuilder<D> mo88518c(@NotNull TypeSubstitution typeSubstitution);

        @NotNull
        /* JADX INFO: renamed from: d */
        <V> CopyBuilder<D> mo88519d(@NotNull CallableDescriptor.UserDataKey<V> userDataKey, V v2);

        @NotNull
        /* JADX INFO: renamed from: e */
        CopyBuilder<D> mo88520e();

        @NotNull
        /* JADX INFO: renamed from: f */
        CopyBuilder<D> mo88521f(@NotNull Name name);

        @NotNull
        /* JADX INFO: renamed from: g */
        CopyBuilder<D> mo88522g();

        @NotNull
        /* JADX INFO: renamed from: h */
        CopyBuilder<D> mo88523h(@NotNull KotlinType kotlinType);

        @NotNull
        /* JADX INFO: renamed from: i */
        CopyBuilder<D> mo88524i(@Nullable CallableMemberDescriptor callableMemberDescriptor);

        @NotNull
        /* JADX INFO: renamed from: j */
        CopyBuilder<D> mo88525j(boolean z);

        @NotNull
        /* JADX INFO: renamed from: k */
        CopyBuilder<D> mo88526k(@NotNull List<TypeParameterDescriptor> list);

        @NotNull
        /* JADX INFO: renamed from: l */
        CopyBuilder<D> mo88527l(@NotNull Annotations annotations);

        @NotNull
        /* JADX INFO: renamed from: m */
        CopyBuilder<D> mo88528m();

        @NotNull
        /* JADX INFO: renamed from: n */
        CopyBuilder<D> mo88529n(@NotNull List<ValueParameterDescriptor> list);

        @NotNull
        /* JADX INFO: renamed from: o */
        CopyBuilder<D> mo88530o();

        @NotNull
        /* JADX INFO: renamed from: p */
        CopyBuilder<D> mo88531p(@NotNull DescriptorVisibility descriptorVisibility);

        @NotNull
        /* JADX INFO: renamed from: q */
        CopyBuilder<D> mo88532q(@NotNull Modality modality);

        @NotNull
        /* JADX INFO: renamed from: r */
        CopyBuilder<D> mo88533r(@NotNull DeclarationDescriptor declarationDescriptor);

        @NotNull
        /* JADX INFO: renamed from: s */
        CopyBuilder<D> mo88534s(@NotNull CallableMemberDescriptor.Kind kind);

        @NotNull
        /* JADX INFO: renamed from: t */
        CopyBuilder<D> mo88535t();
    }

    /* JADX INFO: renamed from: A0 */
    boolean mo88512A0();

    /* JADX INFO: renamed from: O */
    boolean mo88513O();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    FunctionDescriptor mo88445a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    DeclarationDescriptor mo88299b();

    @Nullable
    /* JADX INFO: renamed from: c */
    FunctionDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<? extends FunctionDescriptor> mo88447e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    @NotNull
    /* JADX INFO: renamed from: k */
    CopyBuilder<? extends FunctionDescriptor> mo88514k();

    /* JADX INFO: renamed from: u */
    boolean mo88324u();

    @Nullable
    /* JADX INFO: renamed from: u0 */
    FunctionDescriptor mo88515u0();
}
