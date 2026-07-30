package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.nh3;
import p149l.oh3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    @NotNull
    public static final BuiltinMethodsWithSpecialGenericSignature INSTANCE = new BuiltinMethodsWithSpecialGenericSignature();

    private BuiltinMethodsWithSpecialGenericSignature() {
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final FunctionDescriptor m89349l(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        Name name = functionDescriptor.getName();
        name.getClass();
        if (builtinMethodsWithSpecialGenericSignature.m89354n(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.m91976i(functionDescriptor, false, nh3.INSTANCE, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m89350m(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return INSTANCE.m89353k(callableMemberDescriptor);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final SpecialGenericSignatures.SpecialSignatureInfo m89351o(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorM91976i;
        String strM90379d;
        callableMemberDescriptor.getClass();
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        if (!companion.m89488d().contains(callableMemberDescriptor.getName()) || (callableMemberDescriptorM91976i = DescriptorUtilsKt.m91976i(callableMemberDescriptor, false, oh3.INSTANCE, 1, null)) == null || (strM90379d = MethodSignatureMappingKt.m90379d(callableMemberDescriptorM91976i)) == null) {
            return null;
        }
        return companion.m89496l(strM90379d);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m89352p(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return (callableMemberDescriptor instanceof FunctionDescriptor) && INSTANCE.m89353k(callableMemberDescriptor);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m89353k(CallableMemberDescriptor callableMemberDescriptor) {
        return CollectionsKt.contains(SpecialGenericSignatures.Companion.m89489e(), MethodSignatureMappingKt.m90379d(callableMemberDescriptor));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m89354n(@NotNull Name name) {
        name.getClass();
        return SpecialGenericSignatures.Companion.m89488d().contains(name);
    }
}
