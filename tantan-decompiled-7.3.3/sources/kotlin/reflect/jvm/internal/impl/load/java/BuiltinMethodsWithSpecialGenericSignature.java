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
import p153l.bi3;
import p153l.ci3;

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
    public static final FunctionDescriptor m90240l(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        Name name = functionDescriptor.getName();
        name.getClass();
        if (builtinMethodsWithSpecialGenericSignature.m90245n(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.m92867i(functionDescriptor, false, bi3.INSTANCE, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m90241m(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return INSTANCE.m90244k(callableMemberDescriptor);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final SpecialGenericSignatures.SpecialSignatureInfo m90242o(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorM92867i;
        String strM91270d;
        callableMemberDescriptor.getClass();
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        if (!companion.m90379d().contains(callableMemberDescriptor.getName()) || (callableMemberDescriptorM92867i = DescriptorUtilsKt.m92867i(callableMemberDescriptor, false, ci3.INSTANCE, 1, null)) == null || (strM91270d = MethodSignatureMappingKt.m91270d(callableMemberDescriptorM92867i)) == null) {
            return null;
        }
        return companion.m90387l(strM91270d);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m90243p(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return (callableMemberDescriptor instanceof FunctionDescriptor) && INSTANCE.m90244k(callableMemberDescriptor);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m90244k(CallableMemberDescriptor callableMemberDescriptor) {
        return CollectionsKt.contains(SpecialGenericSignatures.Companion.m90380e(), MethodSignatureMappingKt.m91270d(callableMemberDescriptor));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m90245n(@NotNull Name name) {
        name.getClass();
        return SpecialGenericSignatures.Companion.m90379d().contains(name);
    }
}
