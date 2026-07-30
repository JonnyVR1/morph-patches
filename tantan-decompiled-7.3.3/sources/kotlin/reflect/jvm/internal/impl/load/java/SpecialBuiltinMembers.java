package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jvf0;
import p153l.kvf0;
import p153l.lvf0;

/* JADX INFO: loaded from: classes2.dex */
@JvmName
@SourceDebugExtension
public final class SpecialBuiltinMembers {
    /* JADX INFO: renamed from: d */
    public static final boolean m90357d(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return m90360g(callableMemberDescriptor) != null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m90358e(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorM92881w;
        Name nameM90235j;
        callableMemberDescriptor.getClass();
        CallableMemberDescriptor callableMemberDescriptorM90359f = m90359f(callableMemberDescriptor);
        if (callableMemberDescriptorM90359f != null && (callableMemberDescriptorM92881w = DescriptorUtilsKt.m92881w(callableMemberDescriptorM90359f)) != null) {
            if (callableMemberDescriptorM92881w instanceof PropertyDescriptor) {
                return ClassicBuiltinSpecialProperties.INSTANCE.m90256b(callableMemberDescriptorM92881w);
            }
            if ((callableMemberDescriptorM92881w instanceof SimpleFunctionDescriptor) && (nameM90235j = BuiltinMethodsWithDifferentJvmName.INSTANCE.m90235j((SimpleFunctionDescriptor) callableMemberDescriptorM92881w)) != null) {
                return nameM90235j.m91973b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final CallableMemberDescriptor m90359f(CallableMemberDescriptor callableMemberDescriptor) {
        if (KotlinBuiltIns.m89077h0(callableMemberDescriptor)) {
            return m90360g(callableMemberDescriptor);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T extends CallableMemberDescriptor> T m90360g(@NotNull T t) {
        t.getClass();
        if (!SpecialGenericSignatures.Companion.m90382g().contains(t.getName()) && !BuiltinSpecialProperties.INSTANCE.m90249d().contains(DescriptorUtilsKt.m92881w(t).getName())) {
            return null;
        }
        if ((t instanceof PropertyDescriptor) || (t instanceof PropertyAccessorDescriptor)) {
            return (T) DescriptorUtilsKt.m92867i(t, false, jvf0.INSTANCE, 1, null);
        }
        if (t instanceof SimpleFunctionDescriptor) {
            return (T) DescriptorUtilsKt.m92867i(t, false, kvf0.INSTANCE, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m90361h(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return ClassicBuiltinSpecialProperties.INSTANCE.m90257d(DescriptorUtilsKt.m92881w(callableMemberDescriptor));
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m90362i(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return BuiltinMethodsWithDifferentJvmName.INSTANCE.m90236k((SimpleFunctionDescriptor) callableMemberDescriptor);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final <T extends CallableMemberDescriptor> T m90363j(@NotNull T t) {
        t.getClass();
        T t2 = (T) m90360g(t);
        if (t2 != null) {
            return t2;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = t.getName();
        name.getClass();
        if (builtinMethodsWithSpecialGenericSignature.m90245n(name)) {
            return (T) DescriptorUtilsKt.m92867i(t, false, lvf0.INSTANCE, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m90364k(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return KotlinBuiltIns.m89077h0(callableMemberDescriptor) && BuiltinMethodsWithSpecialGenericSignature.m90242o(callableMemberDescriptor) != null;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m90365l(@NotNull ClassDescriptor classDescriptor, @NotNull CallableDescriptor callableDescriptor) {
        classDescriptor.getClass();
        callableDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo89190b = callableDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        SimpleType simpleTypeMo89349o = ((ClassDescriptor) declarationDescriptorMo89190b).mo89349o();
        simpleTypeMo89349o.getClass();
        for (ClassDescriptor classDescriptorM92669s = DescriptorUtils.m92669s(classDescriptor); classDescriptorM92669s != null; classDescriptorM92669s = DescriptorUtils.m92669s(classDescriptorM92669s)) {
            if (!(classDescriptorM92669s instanceof JavaClassDescriptor) && TypeCheckingProcedure.m93862b(classDescriptorM92669s.mo89349o(), simpleTypeMo89349o) != null) {
                return !KotlinBuiltIns.m89077h0(classDescriptorM92669s);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m90366m(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return DescriptorUtilsKt.m92881w(callableMemberDescriptor).mo89190b() instanceof JavaClassDescriptor;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m90367n(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return m90366m(callableMemberDescriptor) || KotlinBuiltIns.m89077h0(callableMemberDescriptor);
    }
}
