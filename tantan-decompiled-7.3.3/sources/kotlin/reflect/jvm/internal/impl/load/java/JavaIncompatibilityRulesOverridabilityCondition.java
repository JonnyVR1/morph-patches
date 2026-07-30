package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m90293a(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
            callableDescriptor.getClass();
            callableDescriptor2.getClass();
            if ((callableDescriptor2 instanceof JavaMethodDescriptor) && (callableDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
                javaMethodDescriptor.mo89339g().size();
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
                functionDescriptor.mo89339g().size();
                List<ValueParameterDescriptor> listMo89339g = javaMethodDescriptor.mo89336a().mo89339g();
                listMo89339g.getClass();
                List<ValueParameterDescriptor> listMo89339g2 = functionDescriptor.mo89336a().mo89339g();
                listMo89339g2.getClass();
                for (Pair pair : CollectionsKt.zip(listMo89339g, listMo89339g2)) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.component1();
                    ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.component2();
                    valueParameterDescriptor.getClass();
                    boolean z = m90295c((FunctionDescriptor) callableDescriptor2, valueParameterDescriptor) instanceof JvmType.Primitive;
                    valueParameterDescriptor2.getClass();
                    if (z != (m90295c(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m90294b(FunctionDescriptor functionDescriptor) {
            if (functionDescriptor.mo89339g().size() != 1) {
                return false;
            }
            DeclarationDescriptor declarationDescriptorMo89190b = functionDescriptor.mo89190b();
            ClassDescriptor classDescriptor = declarationDescriptorMo89190b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89190b : null;
            if (classDescriptor == null) {
                return false;
            }
            List<ValueParameterDescriptor> listMo89339g = functionDescriptor.mo89339g();
            listMo89339g.getClass();
            ClassifierDescriptor classifierDescriptorMo89207e = ((ValueParameterDescriptor) CollectionsKt.single((List) listMo89339g)).getType().mo92781G0().mo89207e();
            ClassDescriptor classDescriptor2 = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
            return classDescriptor2 != null && KotlinBuiltIns.m89088s0(classDescriptor) && Intrinsics.m88377d(DescriptorUtilsKt.m92873o(classDescriptor), DescriptorUtilsKt.m92873o(classDescriptor2));
        }

        /* JADX INFO: renamed from: c */
        public final JvmType m90295c(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            if (MethodSignatureMappingKt.m91271e(functionDescriptor) || m90294b(functionDescriptor)) {
                KotlinType type = valueParameterDescriptor.getType();
                type.getClass();
                return MethodSignatureMappingKt.m91273g(TypeUtilsKt.m93967B(type));
            }
            KotlinType type2 = valueParameterDescriptor.getType();
            type2.getClass();
            return MethodSignatureMappingKt.m91273g(type2);
        }

        private Companion() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: a */
    public ExternalOverridabilityCondition.Contract mo90267a() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: b */
    public ExternalOverridabilityCondition.Result mo90268b(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        if (m90292c(callableDescriptor, callableDescriptor2, classDescriptor)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return Companion.m90293a(callableDescriptor, callableDescriptor2) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90292c(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && !KotlinBuiltIns.m89077h0(callableDescriptor2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor2;
            Name name = functionDescriptor.getName();
            name.getClass();
            if (!builtinMethodsWithSpecialGenericSignature.m90245n(name)) {
                SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
                Name name2 = functionDescriptor.getName();
                name2.getClass();
                if (!companion.m90386k(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor callableMemberDescriptorM90363j = SpecialBuiltinMembers.m90363j((CallableMemberDescriptor) callableDescriptor);
            boolean z = callableDescriptor instanceof FunctionDescriptor;
            FunctionDescriptor functionDescriptor2 = z ? (FunctionDescriptor) callableDescriptor : null;
            if (!(functionDescriptor2 != null && functionDescriptor.mo89403A0() == functionDescriptor2.mo89403A0()) && (callableMemberDescriptorM90363j == null || !functionDescriptor.mo89403A0())) {
                return true;
            }
            if ((classDescriptor instanceof JavaClassDescriptor) && functionDescriptor.mo89406u0() == null && callableMemberDescriptorM90363j != null && !SpecialBuiltinMembers.m90365l(classDescriptor, callableMemberDescriptorM90363j)) {
                if ((callableMemberDescriptorM90363j instanceof FunctionDescriptor) && z && BuiltinMethodsWithSpecialGenericSignature.m90240l((FunctionDescriptor) callableMemberDescriptorM90363j) != null) {
                    String strM91269c = MethodSignatureMappingKt.m91269c(functionDescriptor, false, false, 2, null);
                    FunctionDescriptor functionDescriptorMo89336a = ((FunctionDescriptor) callableDescriptor).mo89336a();
                    functionDescriptorMo89336a.getClass();
                    if (Intrinsics.m88377d(strM91269c, MethodSignatureMappingKt.m91269c(functionDescriptorMo89336a, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
