package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ai3;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinMethodsWithDifferentJvmName extends SpecialGenericSignatures {

    @NotNull
    public static final BuiltinMethodsWithDifferentJvmName INSTANCE = new BuiltinMethodsWithDifferentJvmName();

    private BuiltinMethodsWithDifferentJvmName() {
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m90234l(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return SpecialGenericSignatures.Companion.m90385j().containsKey(MethodSignatureMappingKt.m91270d(simpleFunctionDescriptor));
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Name m90235j(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        Map<String, Name> mapM90385j = SpecialGenericSignatures.Companion.m90385j();
        String strM91270d = MethodSignatureMappingKt.m91270d(simpleFunctionDescriptor);
        if (strM91270d == null) {
            return null;
        }
        return mapM90385j.get(strM91270d);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m90236k(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return KotlinBuiltIns.m89077h0(simpleFunctionDescriptor) && DescriptorUtilsKt.m92867i(simpleFunctionDescriptor, false, new ai3(simpleFunctionDescriptor), 1, null) != null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m90237m(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return Intrinsics.m88377d(simpleFunctionDescriptor.getName().m91973b(), "removeAt") && Intrinsics.m88377d(MethodSignatureMappingKt.m91270d(simpleFunctionDescriptor), SpecialGenericSignatures.Companion.m90383h().m90392d());
    }
}
