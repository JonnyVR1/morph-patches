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
import p149l.anf0;
import p149l.bnf0;
import p149l.cnf0;

/* JADX INFO: loaded from: classes2.dex */
@JvmName
@SourceDebugExtension
public final class SpecialBuiltinMembers {
    /* JADX INFO: renamed from: d */
    public static final boolean m89466d(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return m89469g(callableMemberDescriptor) != null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m89467e(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorM91990w;
        Name nameM89344j;
        callableMemberDescriptor.getClass();
        CallableMemberDescriptor callableMemberDescriptorM89468f = m89468f(callableMemberDescriptor);
        if (callableMemberDescriptorM89468f != null && (callableMemberDescriptorM91990w = DescriptorUtilsKt.m91990w(callableMemberDescriptorM89468f)) != null) {
            if (callableMemberDescriptorM91990w instanceof PropertyDescriptor) {
                return ClassicBuiltinSpecialProperties.INSTANCE.m89365b(callableMemberDescriptorM91990w);
            }
            if ((callableMemberDescriptorM91990w instanceof SimpleFunctionDescriptor) && (nameM89344j = BuiltinMethodsWithDifferentJvmName.INSTANCE.m89344j((SimpleFunctionDescriptor) callableMemberDescriptorM91990w)) != null) {
                return nameM89344j.m91082b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final CallableMemberDescriptor m89468f(CallableMemberDescriptor callableMemberDescriptor) {
        if (KotlinBuiltIns.m88186h0(callableMemberDescriptor)) {
            return m89469g(callableMemberDescriptor);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T extends CallableMemberDescriptor> T m89469g(@NotNull T t) {
        t.getClass();
        if (!SpecialGenericSignatures.Companion.m89491g().contains(t.getName()) && !BuiltinSpecialProperties.INSTANCE.m89358d().contains(DescriptorUtilsKt.m91990w(t).getName())) {
            return null;
        }
        if ((t instanceof PropertyDescriptor) || (t instanceof PropertyAccessorDescriptor)) {
            return (T) DescriptorUtilsKt.m91976i(t, false, anf0.INSTANCE, 1, null);
        }
        if (t instanceof SimpleFunctionDescriptor) {
            return (T) DescriptorUtilsKt.m91976i(t, false, bnf0.INSTANCE, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m89470h(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return ClassicBuiltinSpecialProperties.INSTANCE.m89366d(DescriptorUtilsKt.m91990w(callableMemberDescriptor));
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m89471i(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return BuiltinMethodsWithDifferentJvmName.INSTANCE.m89345k((SimpleFunctionDescriptor) callableMemberDescriptor);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final <T extends CallableMemberDescriptor> T m89472j(@NotNull T t) {
        t.getClass();
        T t2 = (T) m89469g(t);
        if (t2 != null) {
            return t2;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = t.getName();
        name.getClass();
        if (builtinMethodsWithSpecialGenericSignature.m89354n(name)) {
            return (T) DescriptorUtilsKt.m91976i(t, false, cnf0.INSTANCE, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m89473k(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return KotlinBuiltIns.m88186h0(callableMemberDescriptor) && BuiltinMethodsWithSpecialGenericSignature.m89351o(callableMemberDescriptor) != null;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m89474l(@NotNull ClassDescriptor classDescriptor, @NotNull CallableDescriptor callableDescriptor) {
        classDescriptor.getClass();
        callableDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo88299b = callableDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        SimpleType simpleTypeMo88458o = ((ClassDescriptor) declarationDescriptorMo88299b).mo88458o();
        simpleTypeMo88458o.getClass();
        for (ClassDescriptor classDescriptorM91778s = DescriptorUtils.m91778s(classDescriptor); classDescriptorM91778s != null; classDescriptorM91778s = DescriptorUtils.m91778s(classDescriptorM91778s)) {
            if (!(classDescriptorM91778s instanceof JavaClassDescriptor) && TypeCheckingProcedure.m92971b(classDescriptorM91778s.mo88458o(), simpleTypeMo88458o) != null) {
                return !KotlinBuiltIns.m88186h0(classDescriptorM91778s);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m89475m(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return DescriptorUtilsKt.m91990w(callableMemberDescriptor).mo88299b() instanceof JavaClassDescriptor;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m89476n(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return m89475m(callableMemberDescriptor) || KotlinBuiltIns.m88186h0(callableMemberDescriptor);
    }
}
