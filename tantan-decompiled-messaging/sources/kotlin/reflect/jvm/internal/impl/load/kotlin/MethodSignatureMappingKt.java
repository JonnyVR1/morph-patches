package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.p046p1.mobile.putong.core.data.Action;
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
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class MethodSignatureMappingKt {
    /* JADX INFO: renamed from: a */
    public static final void m90376a(StringBuilder sb, KotlinType kotlinType) {
        sb.append(m90382g(kotlinType));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m90377b(@NotNull FunctionDescriptor functionDescriptor, boolean z, boolean z2) {
        String strM91082b;
        functionDescriptor.getClass();
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (functionDescriptor instanceof ConstructorDescriptor) {
                strM91082b = "<init>";
            } else {
                strM91082b = functionDescriptor.getName().m91082b();
                strM91082b.getClass();
            }
            sb.append(strM91082b);
        }
        sb.append("(");
        ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = functionDescriptor.mo88446b0();
        if (receiverParameterDescriptorMo88446b0 != null) {
            KotlinType type = receiverParameterDescriptorMo88446b0.getType();
            type.getClass();
            m90376a(sb, type);
        }
        Iterator<ValueParameterDescriptor> it = functionDescriptor.mo88448g().iterator();
        while (it.hasNext()) {
            KotlinType type2 = it.next().getType();
            type2.getClass();
            m90376a(sb, type2);
        }
        sb.append(")");
        if (z) {
            if (DescriptorBasedTypeSignatureMappingKt.m90194c(functionDescriptor)) {
                sb.append(j6f.GPS_MEASUREMENT_INTERRUPTED);
            } else {
                KotlinType returnType = functionDescriptor.getReturnType();
                returnType.getClass();
                m90376a(sb, returnType);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m90378c(FunctionDescriptor functionDescriptor, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m90377b(functionDescriptor, z, z2);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m90379d(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        if (DescriptorUtils.m91751E(callableDescriptor)) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = callableDescriptor.mo88299b();
        ClassDescriptor classDescriptor = declarationDescriptorMo88299b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo88299b : null;
        if (classDescriptor == null || classDescriptor.getName().m91085j()) {
            return null;
        }
        CallableDescriptor callableDescriptorMo88445a = callableDescriptor.mo88445a();
        SimpleFunctionDescriptor simpleFunctionDescriptor = callableDescriptorMo88445a instanceof SimpleFunctionDescriptor ? (SimpleFunctionDescriptor) callableDescriptorMo88445a : null;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        return MethodSignatureBuildingUtilsKt.m90375a(signatureBuildingComponents, classDescriptor, m90378c(simpleFunctionDescriptor, false, false, 3, null));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m90380e(@NotNull CallableDescriptor callableDescriptor) {
        FunctionDescriptor functionDescriptorM89349l;
        callableDescriptor.getClass();
        if (!(callableDescriptor instanceof FunctionDescriptor)) {
            return false;
        }
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
        if (Intrinsics.m87488d(functionDescriptor.getName().m91082b(), Action.remove) && functionDescriptor.mo88448g().size() == 1 && !SpecialBuiltinMembers.m89476n((CallableMemberDescriptor) callableDescriptor)) {
            List<ValueParameterDescriptor> listMo88448g = functionDescriptor.mo88445a().mo88448g();
            listMo88448g.getClass();
            KotlinType type = ((ValueParameterDescriptor) CollectionsKt.single((List) listMo88448g)).getType();
            type.getClass();
            JvmType jvmTypeM90382g = m90382g(type);
            JvmType.Primitive primitive = jvmTypeM90382g instanceof JvmType.Primitive ? (JvmType.Primitive) jvmTypeM90382g : null;
            if ((primitive != null ? primitive.m90350i() : null) != JvmPrimitiveType.INT || (functionDescriptorM89349l = BuiltinMethodsWithSpecialGenericSignature.m89349l(functionDescriptor)) == null) {
                return false;
            }
            List<ValueParameterDescriptor> listMo88448g2 = functionDescriptorM89349l.mo88445a().mo88448g();
            listMo88448g2.getClass();
            KotlinType type2 = ((ValueParameterDescriptor) CollectionsKt.single((List) listMo88448g2)).getType();
            type2.getClass();
            JvmType jvmTypeM90382g2 = m90382g(type2);
            DeclarationDescriptor declarationDescriptorMo88299b = functionDescriptorM89349l.mo88299b();
            declarationDescriptorMo88299b.getClass();
            if (Intrinsics.m87488d(DescriptorUtilsKt.m91983p(declarationDescriptorMo88299b), StandardNames.FqNames.f63891e0.m91054i()) && (jvmTypeM90382g2 instanceof JvmType.Object) && Intrinsics.m87488d(((JvmType.Object) jvmTypeM90382g2).m90349i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m90381f(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        ClassId classIdM88356n = JavaToKotlinClassMap.INSTANCE.m88356n(DescriptorUtilsKt.m91982o(classDescriptor).m91054i());
        if (classIdM88356n == null) {
            return DescriptorBasedTypeSignatureMappingKt.m90193b(classDescriptor, null, 2, null);
        }
        String strM92018h = JvmClassName.m92018h(classIdM88356n);
        strM92018h.getClass();
        return strM92018h;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final JvmType m90382g(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return (JvmType) DescriptorBasedTypeSignatureMappingKt.m90196e(kotlinType, JvmTypeFactoryImpl.INSTANCE, TypeMappingMode.f65081p, TypeMappingConfigurationImpl.INSTANCE, null, null, 32, null);
    }
}
