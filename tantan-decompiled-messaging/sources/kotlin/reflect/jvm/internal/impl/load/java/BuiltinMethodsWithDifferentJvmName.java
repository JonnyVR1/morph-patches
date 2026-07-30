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
import p149l.mh3;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinMethodsWithDifferentJvmName extends SpecialGenericSignatures {

    @NotNull
    public static final BuiltinMethodsWithDifferentJvmName INSTANCE = new BuiltinMethodsWithDifferentJvmName();

    private BuiltinMethodsWithDifferentJvmName() {
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m89343l(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return SpecialGenericSignatures.Companion.m89494j().containsKey(MethodSignatureMappingKt.m90379d(simpleFunctionDescriptor));
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Name m89344j(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        Map<String, Name> mapM89494j = SpecialGenericSignatures.Companion.m89494j();
        String strM90379d = MethodSignatureMappingKt.m90379d(simpleFunctionDescriptor);
        if (strM90379d == null) {
            return null;
        }
        return mapM89494j.get(strM90379d);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m89345k(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return KotlinBuiltIns.m88186h0(simpleFunctionDescriptor) && DescriptorUtilsKt.m91976i(simpleFunctionDescriptor, false, new mh3(simpleFunctionDescriptor), 1, null) != null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m89346m(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return Intrinsics.m87488d(simpleFunctionDescriptor.getName().m91082b(), "removeAt") && Intrinsics.m87488d(MethodSignatureMappingKt.m90379d(simpleFunctionDescriptor), SpecialGenericSignatures.Companion.m89492h().m89501d());
    }
}
