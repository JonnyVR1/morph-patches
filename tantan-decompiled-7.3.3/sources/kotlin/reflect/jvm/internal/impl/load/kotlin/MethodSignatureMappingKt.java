package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.p051p1.mobile.putong.core.data.Action;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class MethodSignatureMappingKt {
    /* JADX INFO: renamed from: a */
    public static final void m91267a(StringBuilder sb, KotlinType kotlinType) {
        sb.append(m91273g(kotlinType));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m91268b(@NotNull FunctionDescriptor functionDescriptor, boolean z, boolean z2) {
        String strM91973b;
        functionDescriptor.getClass();
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (functionDescriptor instanceof ConstructorDescriptor) {
                strM91973b = "<init>";
            } else {
                strM91973b = functionDescriptor.getName().m91973b();
                strM91973b.getClass();
            }
            sb.append(strM91973b);
        }
        sb.append("(");
        ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = functionDescriptor.mo89337b0();
        if (receiverParameterDescriptorMo89337b0 != null) {
            KotlinType type = receiverParameterDescriptorMo89337b0.getType();
            type.getClass();
            m91267a(sb, type);
        }
        Iterator<ValueParameterDescriptor> it = functionDescriptor.mo89339g().iterator();
        while (it.hasNext()) {
            KotlinType type2 = it.next().getType();
            type2.getClass();
            m91267a(sb, type2);
        }
        sb.append(")");
        if (z) {
            if (DescriptorBasedTypeSignatureMappingKt.m91085c(functionDescriptor)) {
                sb.append(p7f.GPS_MEASUREMENT_INTERRUPTED);
            } else {
                KotlinType returnType = functionDescriptor.getReturnType();
                returnType.getClass();
                m91267a(sb, returnType);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m91269c(FunctionDescriptor functionDescriptor, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m91268b(functionDescriptor, z, z2);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m91270d(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        if (DescriptorUtils.m92642E(callableDescriptor)) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorMo89190b = callableDescriptor.mo89190b();
        ClassDescriptor classDescriptor = declarationDescriptorMo89190b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89190b : null;
        if (classDescriptor == null || classDescriptor.getName().m91976j()) {
            return null;
        }
        CallableDescriptor callableDescriptorMo89336a = callableDescriptor.mo89336a();
        SimpleFunctionDescriptor simpleFunctionDescriptor = callableDescriptorMo89336a instanceof SimpleFunctionDescriptor ? (SimpleFunctionDescriptor) callableDescriptorMo89336a : null;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        return MethodSignatureBuildingUtilsKt.m91266a(signatureBuildingComponents, classDescriptor, m91269c(simpleFunctionDescriptor, false, false, 3, null));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m91271e(@NotNull CallableDescriptor callableDescriptor) {
        FunctionDescriptor functionDescriptorM90240l;
        callableDescriptor.getClass();
        if (!(callableDescriptor instanceof FunctionDescriptor)) {
            return false;
        }
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
        if (Intrinsics.m88377d(functionDescriptor.getName().m91973b(), Action.remove) && functionDescriptor.mo89339g().size() == 1 && !SpecialBuiltinMembers.m90367n((CallableMemberDescriptor) callableDescriptor)) {
            List<ValueParameterDescriptor> listMo89339g = functionDescriptor.mo89336a().mo89339g();
            listMo89339g.getClass();
            KotlinType type = ((ValueParameterDescriptor) CollectionsKt.single((List) listMo89339g)).getType();
            type.getClass();
            JvmType jvmTypeM91273g = m91273g(type);
            JvmType.Primitive primitive = jvmTypeM91273g instanceof JvmType.Primitive ? (JvmType.Primitive) jvmTypeM91273g : null;
            if ((primitive != null ? primitive.m91241i() : null) != JvmPrimitiveType.INT || (functionDescriptorM90240l = BuiltinMethodsWithSpecialGenericSignature.m90240l(functionDescriptor)) == null) {
                return false;
            }
            List<ValueParameterDescriptor> listMo89339g2 = functionDescriptorM90240l.mo89336a().mo89339g();
            listMo89339g2.getClass();
            KotlinType type2 = ((ValueParameterDescriptor) CollectionsKt.single((List) listMo89339g2)).getType();
            type2.getClass();
            JvmType jvmTypeM91273g2 = m91273g(type2);
            DeclarationDescriptor declarationDescriptorMo89190b = functionDescriptorM90240l.mo89190b();
            declarationDescriptorMo89190b.getClass();
            if (Intrinsics.m88377d(DescriptorUtilsKt.m92874p(declarationDescriptorMo89190b), StandardNames.FqNames.f64565e0.m91945i()) && (jvmTypeM91273g2 instanceof JvmType.Object) && Intrinsics.m88377d(((JvmType.Object) jvmTypeM91273g2).m91240i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m91272f(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        ClassId classIdM89247n = JavaToKotlinClassMap.INSTANCE.m89247n(DescriptorUtilsKt.m92873o(classDescriptor).m91945i());
        if (classIdM89247n == null) {
            return DescriptorBasedTypeSignatureMappingKt.m91084b(classDescriptor, null, 2, null);
        }
        String strM92909h = JvmClassName.m92909h(classIdM89247n);
        strM92909h.getClass();
        return strM92909h;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final JvmType m91273g(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return (JvmType) DescriptorBasedTypeSignatureMappingKt.m91087e(kotlinType, JvmTypeFactoryImpl.INSTANCE, TypeMappingMode.f65755p, TypeMappingConfigurationImpl.INSTANCE, null, null, 32, null);
    }
}
