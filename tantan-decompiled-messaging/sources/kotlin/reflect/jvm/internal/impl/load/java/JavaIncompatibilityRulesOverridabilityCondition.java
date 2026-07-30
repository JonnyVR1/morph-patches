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
        public final boolean m89402a(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
            callableDescriptor.getClass();
            callableDescriptor2.getClass();
            if ((callableDescriptor2 instanceof JavaMethodDescriptor) && (callableDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
                javaMethodDescriptor.mo88448g().size();
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
                functionDescriptor.mo88448g().size();
                List<ValueParameterDescriptor> listMo88448g = javaMethodDescriptor.mo88445a().mo88448g();
                listMo88448g.getClass();
                List<ValueParameterDescriptor> listMo88448g2 = functionDescriptor.mo88445a().mo88448g();
                listMo88448g2.getClass();
                for (Pair pair : CollectionsKt.zip(listMo88448g, listMo88448g2)) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.component1();
                    ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.component2();
                    valueParameterDescriptor.getClass();
                    boolean z = m89404c((FunctionDescriptor) callableDescriptor2, valueParameterDescriptor) instanceof JvmType.Primitive;
                    valueParameterDescriptor2.getClass();
                    if (z != (m89404c(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m89403b(FunctionDescriptor functionDescriptor) {
            if (functionDescriptor.mo88448g().size() != 1) {
                return false;
            }
            DeclarationDescriptor declarationDescriptorMo88299b = functionDescriptor.mo88299b();
            ClassDescriptor classDescriptor = declarationDescriptorMo88299b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo88299b : null;
            if (classDescriptor == null) {
                return false;
            }
            List<ValueParameterDescriptor> listMo88448g = functionDescriptor.mo88448g();
            listMo88448g.getClass();
            ClassifierDescriptor classifierDescriptorMo88316e = ((ValueParameterDescriptor) CollectionsKt.single((List) listMo88448g)).getType().mo91890G0().mo88316e();
            ClassDescriptor classDescriptor2 = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
            return classDescriptor2 != null && KotlinBuiltIns.m88197s0(classDescriptor) && Intrinsics.m87488d(DescriptorUtilsKt.m91982o(classDescriptor), DescriptorUtilsKt.m91982o(classDescriptor2));
        }

        /* JADX INFO: renamed from: c */
        public final JvmType m89404c(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            if (MethodSignatureMappingKt.m90380e(functionDescriptor) || m89403b(functionDescriptor)) {
                KotlinType type = valueParameterDescriptor.getType();
                type.getClass();
                return MethodSignatureMappingKt.m90382g(TypeUtilsKt.m93076B(type));
            }
            KotlinType type2 = valueParameterDescriptor.getType();
            type2.getClass();
            return MethodSignatureMappingKt.m90382g(type2);
        }

        private Companion() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: a */
    public ExternalOverridabilityCondition.Contract mo89376a() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* JADX INFO: renamed from: b */
    public ExternalOverridabilityCondition.Result mo89377b(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        if (m89401c(callableDescriptor, callableDescriptor2, classDescriptor)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return Companion.m89402a(callableDescriptor, callableDescriptor2) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89401c(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && !KotlinBuiltIns.m88186h0(callableDescriptor2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor2;
            Name name = functionDescriptor.getName();
            name.getClass();
            if (!builtinMethodsWithSpecialGenericSignature.m89354n(name)) {
                SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
                Name name2 = functionDescriptor.getName();
                name2.getClass();
                if (!companion.m89495k(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor callableMemberDescriptorM89472j = SpecialBuiltinMembers.m89472j((CallableMemberDescriptor) callableDescriptor);
            boolean z = callableDescriptor instanceof FunctionDescriptor;
            FunctionDescriptor functionDescriptor2 = z ? (FunctionDescriptor) callableDescriptor : null;
            if (!(functionDescriptor2 != null && functionDescriptor.mo88512A0() == functionDescriptor2.mo88512A0()) && (callableMemberDescriptorM89472j == null || !functionDescriptor.mo88512A0())) {
                return true;
            }
            if ((classDescriptor instanceof JavaClassDescriptor) && functionDescriptor.mo88515u0() == null && callableMemberDescriptorM89472j != null && !SpecialBuiltinMembers.m89474l(classDescriptor, callableMemberDescriptorM89472j)) {
                if ((callableMemberDescriptorM89472j instanceof FunctionDescriptor) && z && BuiltinMethodsWithSpecialGenericSignature.m89349l((FunctionDescriptor) callableMemberDescriptorM89472j) != null) {
                    String strM90378c = MethodSignatureMappingKt.m90378c(functionDescriptor, false, false, 2, null);
                    FunctionDescriptor functionDescriptorMo88445a = ((FunctionDescriptor) callableDescriptor).mo88445a();
                    functionDescriptorMo88445a.getClass();
                    if (Intrinsics.m87488d(strM90378c, MethodSignatureMappingKt.m90378c(functionDescriptorMo88445a, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
