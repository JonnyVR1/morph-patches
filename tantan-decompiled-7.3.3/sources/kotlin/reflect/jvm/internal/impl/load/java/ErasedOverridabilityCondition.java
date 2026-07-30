package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a3f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65323a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f65323a = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m90266d(ValueParameterDescriptor valueParameterDescriptor) {
        return valueParameterDescriptor.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: a */
    public ExternalOverridabilityCondition.Contract mo90267a() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: b */
    public ExternalOverridabilityCondition.Result mo90268b(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        if (callableDescriptor2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
            List<TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            typeParameters.getClass();
            if (typeParameters.isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoM92723w = OverridingUtil.m92723w(callableDescriptor, callableDescriptor2);
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
                Object[] objArr = 0;
                if ((overrideCompatibilityInfoM92723w != null ? overrideCompatibilityInfoM92723w.m92737c() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<ValueParameterDescriptor> listMo89339g = javaMethodDescriptor.mo89339g();
                listMo89339g.getClass();
                Sequence sequenceM94185N = SequencesKt___SequencesKt.m94185N(CollectionsKt.asSequence(listMo89339g), a3f.INSTANCE);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                returnType.getClass();
                Sequence sequenceM94188Q = SequencesKt___SequencesKt.m94188Q(sequenceM94185N, returnType);
                ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = javaMethodDescriptor.mo89337b0();
                for (KotlinType kotlinType : SequencesKt___SequencesKt.m94187P(sequenceM94188Q, CollectionsKt.listOfNotNull(receiverParameterDescriptorMo89337b0 != null ? receiverParameterDescriptorMo89337b0.getType() : null))) {
                    if (!kotlinType.mo92779E0().isEmpty() && !(kotlinType.mo93516J0() instanceof RawTypeImpl)) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                CallableDescriptor callableDescriptorMo89344c = callableDescriptor.mo89344c(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0).m93648c());
                if (callableDescriptorMo89344c == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (callableDescriptorMo89344c instanceof SimpleFunctionDescriptor) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptorMo89344c;
                    List<TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    typeParameters2.getClass();
                    if (!typeParameters2.isEmpty()) {
                        callableDescriptorMo89344c = simpleFunctionDescriptor.mo89405k().mo89417k(CollectionsKt.emptyList()).build();
                        callableDescriptorMo89344c.getClass();
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result resultM92737c = OverridingUtil.f66489f.m92729F(callableDescriptorMo89344c, callableDescriptor2, false).m92737c();
                resultM92737c.getClass();
                return WhenMappings.f65323a[resultM92737c.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
