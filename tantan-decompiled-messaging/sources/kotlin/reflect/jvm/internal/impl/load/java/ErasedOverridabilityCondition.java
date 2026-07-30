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
import p149l.v1f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64649a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f64649a = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m89375d(ValueParameterDescriptor valueParameterDescriptor) {
        return valueParameterDescriptor.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: a */
    public ExternalOverridabilityCondition.Contract mo89376a() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: b */
    public ExternalOverridabilityCondition.Result mo89377b(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        if (callableDescriptor2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
            List<TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            typeParameters.getClass();
            if (typeParameters.isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoM91832w = OverridingUtil.m91832w(callableDescriptor, callableDescriptor2);
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
                Object[] objArr = 0;
                if ((overrideCompatibilityInfoM91832w != null ? overrideCompatibilityInfoM91832w.m91846c() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<ValueParameterDescriptor> listMo88448g = javaMethodDescriptor.mo88448g();
                listMo88448g.getClass();
                Sequence sequenceM93294N = SequencesKt___SequencesKt.m93294N(CollectionsKt.asSequence(listMo88448g), v1f.INSTANCE);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                returnType.getClass();
                Sequence sequenceM93297Q = SequencesKt___SequencesKt.m93297Q(sequenceM93294N, returnType);
                ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = javaMethodDescriptor.mo88446b0();
                for (KotlinType kotlinType : SequencesKt___SequencesKt.m93296P(sequenceM93297Q, CollectionsKt.listOfNotNull(receiverParameterDescriptorMo88446b0 != null ? receiverParameterDescriptorMo88446b0.getType() : null))) {
                    if (!kotlinType.mo91888E0().isEmpty() && !(kotlinType.mo92625J0() instanceof RawTypeImpl)) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                CallableDescriptor callableDescriptorMo88453c = callableDescriptor.mo88453c(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0).m92757c());
                if (callableDescriptorMo88453c == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (callableDescriptorMo88453c instanceof SimpleFunctionDescriptor) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptorMo88453c;
                    List<TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    typeParameters2.getClass();
                    if (!typeParameters2.isEmpty()) {
                        callableDescriptorMo88453c = simpleFunctionDescriptor.mo88514k().mo88526k(CollectionsKt.emptyList()).build();
                        callableDescriptorMo88453c.getClass();
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result resultM91846c = OverridingUtil.f65815f.m91838F(callableDescriptorMo88453c, callableDescriptor2, false).m91846c();
                resultM91846c.getClass();
                return WhenMappings.f64649a[resultM91846c.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
