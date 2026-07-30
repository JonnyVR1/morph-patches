package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorFunctionDescriptor extends SimpleFunctionDescriptorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorFunctionDescriptor(@NotNull ClassDescriptor classDescriptor) {
        super(classDescriptor, null, Annotations.Companion.m89532b(), Name.m91972n(ErrorEntity.ERROR_FUNCTION.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f64737a);
        classDescriptor.getClass();
        mo89634K0(null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), ErrorUtils.m93893d(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.OPEN, DescriptorVisibilities.f64700e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public FunctionDescriptorImpl mo89212E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: J */
    public <V> V mo89334J(@NotNull CallableDescriptor.UserDataKey<V> userDataKey) {
        userDataKey.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: N */
    public void mo89342N(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        collection.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptor mo89343a0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @NotNull CallableMemberDescriptor.Kind kind, boolean z) {
        declarationDescriptor.getClass();
        modality.getClass();
        descriptorVisibility.getClass();
        kind.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    /* JADX INFO: renamed from: k */
    public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89405k() {
        return new FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.types.error.ErrorFunctionDescriptor$newCopyBuilder$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: a */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89407a(ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: b */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89408b(ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: c */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89409c(TypeSubstitution typeSubstitution) {
                typeSubstitution.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: d */
            public <V> FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89410d(CallableDescriptor.UserDataKey<V> userDataKey, V v2) {
                userDataKey.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: e */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89411e() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: f */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89412f(Name name) {
                name.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: g */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89413g() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: h */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89414h(KotlinType kotlinType) {
                kotlinType.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: i */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89415i(CallableMemberDescriptor callableMemberDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: j */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89416j(boolean z) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: k */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89417k(List<? extends TypeParameterDescriptor> list) {
                list.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: l */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89418l(Annotations annotations) {
                annotations.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: m */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89419m() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: n */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89420n(List<? extends ValueParameterDescriptor> list) {
                list.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: o */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89421o() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: p */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89422p(DescriptorVisibility descriptorVisibility) {
                descriptorVisibility.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: q */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89423q(Modality modality) {
                modality.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: r */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89424r(DeclarationDescriptor declarationDescriptor) {
                declarationDescriptor.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: s */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89425s(CallableMemberDescriptor.Kind kind) {
                kind.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: t */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo89426t() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public SimpleFunctionDescriptor build() {
                return this.f66993a;
            }
        };
    }
}
